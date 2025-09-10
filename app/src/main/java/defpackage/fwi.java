package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwi implements paq {
    public final syw a;
    public final out b;
    public final pbn c;
    public final fyd d;
    public final fyc e;
    public final pau f;
    public final fxe g;
    public final fxn h;
    public final gkf i;
    public final ipt j;
    public final hbj k;
    public final ngw l;
    public final cxb m;
    public final jod n;

    public fwi(syw sywVar, out outVar, pbn pbnVar, fyd fydVar, cxb cxbVar, fyc fycVar, jod jodVar, fxn fxnVar, ngw ngwVar, gkf gkfVar, pau pauVar, fxe fxeVar, ipt iptVar, hbj hbjVar) {
        this.a = sywVar;
        this.b = outVar;
        this.c = pbnVar;
        this.d = fydVar;
        this.m = cxbVar;
        this.e = fycVar;
        this.n = jodVar;
        this.h = fxnVar;
        this.l = ngwVar;
        this.i = gkfVar;
        this.f = pauVar;
        this.g = fxeVar;
        this.j = iptVar;
        this.k = hbjVar;
    }

    public final void a(gaw gawVar, szh szhVar, szh szhVar2, boolean z) {
        ske.W(this.e.b(gawVar), new fwh(this, szhVar, szhVar2, z), this.a);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.d.c.d();
    }
}
