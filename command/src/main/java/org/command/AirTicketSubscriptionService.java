package org.command;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Data
public class AirTicketSubscriptionService implements Service {

    List<Subscription> subscriptions = new ArrayList<>(0);

    Status status = Status.EMPTY;


    public void initSub() {
        subscriptions.add(new Subscription("101010",
                "Shanghai", "Beijing",
                "20220910", null,
                "20220909 12:00:00"));
        subscriptions.add(new Subscription("201010",
                "Shanghai", "Tokyo",
                "20220910", "20220912",
                "20220908 12:00:00"));
    }

    public void showSub() {
        if(subscriptions.isEmpty()){
            System.out.println("当前订阅为空");
        }else{
            System.out.println("--- 共有订阅" + subscriptions.size() + "条 ---");
        }
        for(Subscription subscription : subscriptions) {
            String subMark = String.format("[SubInfo]%s,%s-%s,%s-%s,create:%s",
                    subscription.getId(),
                    subscription.getDepartureCity(), subscription.getArrivalCity(),
                    subscription.getOutboundDate(), subscription.getInboundDate() == null? "no inbound" : subscription.getInboundDate(),
                    subscription.getCreateTime());
            System.out.println(subMark);
        }
        System.out.println("--- 打印结束 ---");
        System.out.println();
    }

    public Consumer addSub = sub -> addNewSub((Subscription) sub);
    public Consumer deleteSub = sub -> deletePreviousSub((Subscription) sub);

    private void addNewSub(Subscription subscription) {
        if(status == Status.ROLLBACK) {
            status = Status.COMMIT;
            deletePreviousSub(subscription);
            return;
        }
        subscriptions.add(subscription);
    }

    private void deletePreviousSub(Subscription subscription) {
        if(status == Status.ROLLBACK) {
            status = Status.COMMIT;
            addNewSub(subscription);
            return;
        }
        for(int i=0;i<subscriptions.size();i++){
            if(subscriptions.get(i).getId().equals(subscription.getId())){
                subscriptions.remove(i);
                break;
            }
        }
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Status getStatus() {
        return this.status;
    }
}
