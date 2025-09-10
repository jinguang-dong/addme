package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uma {
    public static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(uma.class, YyLACfm.kvASH);
    public volatile long b;
    public final ukc c;

    public uma(long j, ukc ukcVar) {
        this.c = ukcVar;
        this.b = j;
    }

    public final long a(long j) {
        return a.addAndGet(this, j);
    }

    public final long b() {
        return a.getAndIncrement(this);
    }

    public final long c() {
        return a.incrementAndGet(this);
    }

    public final boolean d(long j, long j2) {
        boolean zCompareAndSet = a.compareAndSet(this, j, j2);
        if (!zCompareAndSet || this.c == umc.a) {
            return zCompareAndSet;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
