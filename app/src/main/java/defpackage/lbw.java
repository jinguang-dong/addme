package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbw extends ojl {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ szh c;
    final /* synthetic */ kuj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbw(AtomicInteger atomicInteger, int i, szh szhVar, kuj kujVar) {
        super((short[]) null);
        this.a = atomicInteger;
        this.b = i;
        this.c = szhVar;
        this.d = kujVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        if (this.a.incrementAndGet() == this.b) {
            this.c.e(fsq.i);
            this.d.p(this);
        }
    }
}
