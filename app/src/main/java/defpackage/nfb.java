package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfb extends cxm implements nfc {
    public final cwp a;
    public final cwq b;
    public final azr c;
    public final azr d;
    public final azr e;
    public final cwq f;
    public final cwq g;
    public final cwp h;
    public boolean i;
    private final azr j;
    private final cwq k;
    private final azr l;
    private final azr m;

    public nfb() {
        nkx nkxVar = nkx.PHOTO;
        this.a = new cwq(rnt.ae(new nkx[]{nkxVar, nkx.VIDEO}));
        this.b = new cwq(nkxVar);
        bap bapVar = bap.c;
        this.c = new azz(true, bapVar);
        this.d = new azz(false, bapVar);
        this.j = new azz(false, bapVar);
        this.e = new azz(true, bapVar);
        mxm mxmVar = mxm.PORTRAIT;
        this.f = new cwq(mxmVar);
        cwq cwqVar = new cwq(ojl.bm());
        this.g = cwqVar;
        this.h = cwqVar;
        this.k = new cwq(false);
        this.l = new azz(false, bapVar);
        this.m = new azz(mxmVar, bapVar);
    }

    @Override // defpackage.nfc
    public final paq a() {
        b(true);
        return new mpc(this, 8, null);
    }

    public final void b(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    @Override // defpackage.nfc
    public final void c(nkx nkxVar, boolean z) {
        nkxVar.getClass();
        cwq cwqVar = this.b;
        if (nkxVar == cwqVar.a()) {
            return;
        }
        cwqVar.h(nkxVar);
        this.k.h(Boolean.valueOf(z));
    }

    @Override // defpackage.nfc
    public final void e(boolean z, mxm mxmVar) {
        mxmVar.getClass();
        this.l.b(Boolean.valueOf(z));
        this.m.b(mxmVar);
    }

    @Override // defpackage.nfc
    public final void f(boolean z, boolean z2) {
        if (z == j()) {
            return;
        }
        this.e.b(Boolean.valueOf(z2));
        this.j.b(Boolean.valueOf(z));
    }

    @Override // defpackage.nfc
    public final boolean j() {
        return ((Boolean) this.j.a()).booleanValue();
    }
}
