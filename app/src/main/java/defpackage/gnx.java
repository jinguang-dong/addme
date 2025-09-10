package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnx implements pdh {
    public final gnt a;
    public final Runnable b;
    public final pka c;
    private final out d;
    private final hhc e;
    private final hfy f;
    private final pkc g;
    private final hbj h;
    private final gox i;
    private final cxb j;

    public gnx(hbj hbjVar, cxb cxbVar, gnt gntVar, out outVar, pkc pkcVar, hhc hhcVar, hfy hfyVar, gox goxVar, pka pkaVar, Runnable runnable) {
        this.h = hbjVar;
        this.j = cxbVar;
        this.a = gntVar;
        this.d = outVar;
        this.g = pkcVar;
        this.e = hhcVar;
        this.f = hfyVar;
        this.i = goxVar;
        this.b = runnable;
        this.c = pkaVar;
    }

    @Override // defpackage.pdh
    public final void a(pbw pbwVar, long j) {
        if (pbw.e(pbwVar)) {
            cxb cxbVar = this.j;
            if (j < cxbVar.t() && cxbVar.v()) {
                this.i.h(this.c);
                this.d.execute(new gku(this, 20));
            } else {
                pjr pjrVarA = this.f.a(this.g, this.h, this.c);
                pjrVarA.getClass();
                this.e.e(new hhd(pjrVarA, pbwVar, j));
            }
        }
    }

    @Override // defpackage.pdh
    public final void b() {
        this.i.g(this.c);
    }
}
