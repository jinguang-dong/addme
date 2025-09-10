package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htd extends ndp {
    final /* synthetic */ hti a;

    public htd(hti htiVar) {
        this.a = htiVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        hti htiVar = this.a;
        if (htiVar.B) {
            ((sgt) hti.a.c().M(1503)).s("Ignoring extra shutter click");
            return;
        }
        htiVar.B = true;
        htiVar.y.g();
        if (htiVar.K.f()) {
            htiVar.c();
            htiVar.B = false;
        } else {
            und undVar = htiVar.w;
            if (undVar != null) {
                ukc.C(undVar, null, 0, new htc(htiVar, (uhb) null, 0), 3);
            }
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void c() {
        this.a.P.j();
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void d() {
        sgv sgvVar = hti.a;
        hti htiVar = this.a;
        htiVar.y.e();
        htiVar.P.i();
    }
}
