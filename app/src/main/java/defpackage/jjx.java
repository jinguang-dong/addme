package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jjx implements jjv {
    public nhz a;
    public mxm b = mxm.PORTRAIT;

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        this.b = mxmVar;
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.d(mxmVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [azr, java.lang.Object] */
    @Override // defpackage.jjv
    public final void f(boolean z) {
        nhz nhzVar = this.a;
        if (nhzVar != null) {
            nhzVar.f.b(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.jjv
    public void g() {
        if (this.a == null) {
            this.a = h();
        }
    }

    protected abstract nhz h();

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
