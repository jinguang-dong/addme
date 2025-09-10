package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgl extends dgq implements cth {
    public boolean b;
    public boolean c;
    public cto e;
    public Runnable f;
    public final /* synthetic */ dgp g;
    public long a = -1;
    public int d = 0;
    public final ode h = new ode();

    public dgl(dgp dgpVar) {
        this.g = dgpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgl.k():void");
    }

    @Override // defpackage.dgq, defpackage.dgm
    public final void a(dgp dgpVar) {
        this.c = true;
    }

    public final long h() {
        return this.g.p;
    }

    public final void i() {
        if (this.b) {
            k();
            this.e.m(h() + 1);
        } else {
            this.d = 1;
            this.f = null;
        }
    }

    public final void j(Runnable runnable) {
        this.f = runnable;
        if (!this.b) {
            this.d = 2;
        } else {
            k();
            this.e.m(0.0f);
        }
    }

    @Override // defpackage.cth
    public final void l(float f) {
        long jMax = Math.max(-1L, Math.min(h() + 1, Math.round(f)));
        this.g.y(jMax, this.a);
        this.a = jMax;
    }
}
