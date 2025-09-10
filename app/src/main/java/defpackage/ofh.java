package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofh extends off {
    public final gox b;

    public ofh(gox goxVar, pfl pflVar) {
        super(3, pflVar);
        this.b = goxVar;
    }

    @Override // defpackage.ofe
    public final boolean a(oga ogaVar) {
        return ((ogr) this.b.b).c;
    }

    @Override // defpackage.ofe
    public final odl[] b(oga ogaVar) {
        return ((ogr) this.b.b).b;
    }

    @Override // defpackage.off
    public final void c(oga ogaVar) {
        gox goxVar = this.b;
        ogr ogrVar = (ogr) goxVar.b;
        ogrVar.b(ogaVar.b, this.a);
        ogl oglVarA = ogrVar.a();
        if (oglVarA != null) {
            ogaVar.e.put(oglVarA, goxVar);
        }
    }

    @Override // defpackage.off, defpackage.ofk
    public final /* bridge */ /* synthetic */ void g(mwq mwqVar, boolean z) {
    }
}
