package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgd implements uiq {
    final /* synthetic */ uiq a;
    final /* synthetic */ uiq b;

    public bgd(uiq uiqVar, uiq uiqVar2) {
        this.a = uiqVar;
        this.b = uiqVar2;
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        long j;
        bgq bgqVar = (bgq) obj;
        synchronized (bgr.b) {
            j = bgr.d;
            bgr.d = 1 + j;
        }
        return new bgf(j, bgqVar, this.a, this.b);
    }
}
