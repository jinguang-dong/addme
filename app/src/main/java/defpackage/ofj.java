package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ofj extends off {
    public final ogl b;

    public ofj(ogl oglVar, pfl pflVar) {
        super(4, pflVar);
        this.b = oglVar;
    }

    @Override // defpackage.ofe
    public final boolean a(oga ogaVar) {
        gox goxVar = (gox) ogaVar.e.get(this.b);
        return goxVar != null && ((ogr) goxVar.b).c;
    }

    @Override // defpackage.ofe
    public final odl[] b(oga ogaVar) {
        gox goxVar = (gox) ogaVar.e.get(this.b);
        if (goxVar == null) {
            return null;
        }
        return ((ogr) goxVar.b).b;
    }

    @Override // defpackage.off
    public final void c(oga ogaVar) {
        gox goxVar = (gox) ogaVar.e.remove(this.b);
        if (goxVar == null) {
            this.a.f(false);
            return;
        }
        ((ogs) ((rnu) goxVar.c).a).b.a(ogaVar.b, this.a);
        ((ogr) goxVar.b).a.a();
    }

    @Override // defpackage.off, defpackage.ofk
    public final /* bridge */ /* synthetic */ void g(mwq mwqVar, boolean z) {
    }
}
