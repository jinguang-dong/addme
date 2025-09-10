package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sgr extends shq {
    public static final shf a = new sgp();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.shq
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
