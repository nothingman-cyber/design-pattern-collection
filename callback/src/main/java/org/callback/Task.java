package org.callback;

import java.util.Optional;

public abstract class Task {

    final void bookingWith(Callback callback) {
        booking();
        Optional.ofNullable(callback).ifPresent(Callback::call);
    }

    public abstract void booking();
}
