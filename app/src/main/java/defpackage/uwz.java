package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwz implements umk, upr {
    public final uml a;
    final /* synthetic */ uxa b;

    public uwz(uxa uxaVar, uml umlVar) {
        this.b = uxaVar;
        this.a = umlVar;
    }

    @Override // defpackage.upr
    public final void C(uvb uvbVar, int i) {
        this.a.C(uvbVar, i);
    }

    @Override // defpackage.umk
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.umk
    public final void d(uiq uiqVar) {
        throw null;
    }

    @Override // defpackage.umk
    public final /* bridge */ /* synthetic */ void e(Object obj, uiv uivVar) {
        boolean z = unf.a;
        uxa uxaVar = this.b;
        uxaVar.a.c(null);
        uvj uvjVar = new uvj(uxaVar, 2);
        uml umlVar = this.a;
        umlVar.A(obj, umlVar.e, new dku(uvjVar, 3));
    }

    @Override // defpackage.umk
    public final /* bridge */ /* synthetic */ void f(una unaVar, Object obj) {
        throw null;
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        this.a.fW(obj);
    }

    @Override // defpackage.umk
    public final boolean g(Throwable th) {
        return this.a.g(th);
    }

    @Override // defpackage.umk
    public final /* bridge */ /* synthetic */ Object h(Object obj, uiv uivVar) {
        boolean z = unf.a;
        uxa uxaVar = this.b;
        dku dkuVar = new dku(uxaVar, 4);
        Object objH = this.a.h((ufg) obj, dkuVar);
        if (objH != null) {
            uxaVar.a.c(null);
        }
        return objH;
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.a.b;
    }
}
