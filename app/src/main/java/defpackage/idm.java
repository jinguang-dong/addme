package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class idm implements syf {
    final /* synthetic */ long a;
    final /* synthetic */ idr b;

    public idm(idr idrVar, long j) {
        this.a = j;
        this.b = idrVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        sgt sgtVar = (sgt) ((sgt) ids.a.c().i(th)).M(1893);
        idr idrVar = this.b;
        String str = idrVar.d;
        long j = this.a;
        sgtVar.D("[%s] Fusion effect failed for shot %d", str, j);
        tpc tpcVar = idrVar.j;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        sqa sqaVar = (sqa) tpcVar.b;
        sqa sqaVar2 = sqa.a;
        sqaVar.d = 3;
        sqaVar.b |= 2;
        idrVar.p = true;
        idrVar.g(j);
        idrVar.h.g.remove(idrVar.b.w());
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            bool.booleanValue();
        }
        idr idrVar = this.b;
        idrVar.h.g.remove(idrVar.b.w());
    }
}
