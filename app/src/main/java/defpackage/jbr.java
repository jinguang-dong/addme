package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jbr implements itk {
    final /* synthetic */ jby a;

    public jbr(jby jbyVar) {
        this.a = jbyVar;
    }

    @Override // defpackage.itk
    public final void e() {
        this.a.Z.a();
    }

    @Override // defpackage.itk
    public final void f(boolean z) {
        jby jbyVar = this.a;
        if (jbyVar.M() || ((Boolean) ((ovx) jbyVar.aa.i().a).d).booleanValue()) {
            ndj ndjVar = jbyVar.n;
            if (ndjVar.b().r()) {
                ndjVar.G(z);
                if (z) {
                    jbyVar.d.d();
                } else {
                    jbyVar.K = true;
                    jbyVar.d.a();
                }
            }
        }
    }

    @Override // defpackage.itk
    public final void g(boolean z) {
        jby jbyVar = this.a;
        if (jbyVar.M() && z) {
            jbyVar.ad.b(true);
        }
    }

    @Override // defpackage.itk
    public final void h(boolean z) {
        jby jbyVar = this.a;
        if (jbyVar.M() && z) {
            jbyVar.ad.b(false);
        }
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }
}
