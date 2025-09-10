package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ulz {
    public static final AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(ulz.class, "b");
    public volatile int b;
    public final ukc c;

    public ulz(int i, ukc ukcVar) {
        this.c = ukcVar;
        this.b = i;
    }

    public final int a() {
        return a.decrementAndGet(this);
    }

    public final int b() {
        return a.incrementAndGet(this);
    }

    public final boolean c(int i, int i2) {
        boolean zCompareAndSet = a.compareAndSet(this, i, i2);
        if (!zCompareAndSet || this.c == umc.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
