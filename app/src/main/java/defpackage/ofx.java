package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofx extends ofq {
    public final yf e;
    private final ogd g;

    public ofx(ogi ogiVar, ogd ogdVar) {
        super(ogiVar, odn.a);
        this.e = new yf();
        this.g = ogdVar;
        this.f.b(this);
    }

    @Override // defpackage.ofq
    protected final void e(odj odjVar, int i) {
        this.g.d(odjVar, i);
    }

    @Override // defpackage.ofq
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.ogh
    public final void h() {
        k();
    }

    @Override // defpackage.ogh
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.ogh
    public final void j() {
        this.a = false;
        Object obj = ogd.c;
        ogd ogdVar = this.g;
        synchronized (obj) {
            if (ogdVar.l == this) {
                ogdVar.l = null;
                ogdVar.m.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.f(this);
    }
}
