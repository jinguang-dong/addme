package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sht extends shq {
    public static final shf a = new shr();
    public static final ThreadLocal b = new shs();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.shq
    public final void a() {
        this.e.decrementAndGet();
    }
}
