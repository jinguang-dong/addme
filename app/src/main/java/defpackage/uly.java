package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uly {
    public static final /* synthetic */ int b = 0;
    private static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(uly.class, "a");
    public volatile int a;
    private final ukc d;

    public uly(boolean z, ukc ukcVar) {
        this.d = ukcVar;
        this.a = z ? 1 : 0;
    }

    public final boolean a() {
        return this.a != 0;
    }

    public final boolean b() {
        boolean zCompareAndSet = c.compareAndSet(this, 0, 1);
        if (!zCompareAndSet || this.d == umc.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final boolean c() {
        return c.getAndSet(this, 1) == 1;
    }

    public final String toString() {
        return String.valueOf(a());
    }
}
