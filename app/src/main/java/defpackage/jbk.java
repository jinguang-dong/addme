package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbk extends kfn {
    public final /* synthetic */ jbm a;

    public jbk(jbm jbmVar) {
        this.a = jbmVar;
    }

    public final void a(float f) {
        if (f == 0.0f) {
            jbm jbmVar = this.a;
            jbmVar.n.i(new gtv(2));
        }
        jbm jbmVar2 = this.a;
        jbmVar2.o.g(f);
        if (f == 1.0f) {
            jbmVar2.n.h();
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void b() {
        this.a.c.execute(new jbh(this, 6));
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void d() {
        this.a.c.execute(new jbh(this, 7));
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void e(float f) {
        this.a.c.execute(new jbj(this, f, 2));
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void f(float f, int i) {
        this.a.c.execute(new jbj(this, f, 0));
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void g(float f, long j) {
        this.a.c.execute(new mkm(this, f, j, 1));
    }
}
