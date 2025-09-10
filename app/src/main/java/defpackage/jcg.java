package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jcg extends gsn {
    final /* synthetic */ jcm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcg(jcm jcmVar) {
        super((int[]) null);
        this.a = jcmVar;
    }

    @Override // defpackage.gsn
    public final void b() {
        gnt gntVar = this.a.g;
        if (gntVar != null) {
            gntVar.g();
        }
    }

    @Override // defpackage.gsn
    public final void g() {
        jcm jcmVar = this.a;
        jcmVar.e.d();
        out.a();
        jcc jccVar = jcmVar.k;
        jccVar.f = false;
        jccVar.d.a();
        jccVar.e.setVisibility(8);
        fqy fqyVar = jccVar.g;
        fqyVar.m(true);
        fqyVar.p.g(true);
        fqyVar.t();
    }
}
