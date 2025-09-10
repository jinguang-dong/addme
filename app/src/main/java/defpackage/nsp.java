package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsp extends cxm implements nfc {
    private final cwq a;
    private final cwq b;

    public nsp() {
        nkx nkxVar = nkx.PHOTO;
        new cwq(rnt.ae(new nkx[]{nkxVar, nkx.VIDEO}));
        this.a = new cwq(nkxVar);
        bap bapVar = bap.c;
        new azz(true, bapVar);
        new azz(true, bapVar);
        new azz(true, bapVar);
        new azz(true, bapVar);
        mxm mxmVar = mxm.PORTRAIT;
        new cwq(mxmVar);
        this.b = new cwq(false);
        new azz(false, bapVar);
        new azz(mxmVar, bapVar);
    }

    @Override // defpackage.nfc
    public final paq a() {
        throw null;
    }

    @Override // defpackage.nfc
    public final void c(nkx nkxVar, boolean z) {
        cwq cwqVar = this.a;
        if (nkxVar == cwqVar.a()) {
            return;
        }
        cwqVar.h(nkxVar);
        this.b.h(Boolean.valueOf(z));
    }

    @Override // defpackage.nfc
    public final void e(boolean z, mxm mxmVar) {
        throw null;
    }

    @Override // defpackage.nfc
    public final void f(boolean z, boolean z2) {
        throw null;
    }

    @Override // defpackage.nfc
    public final boolean j() {
        throw null;
    }
}
