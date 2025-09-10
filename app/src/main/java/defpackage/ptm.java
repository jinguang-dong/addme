package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptm extends ceo {
    public final pti c;
    public final cfp d;
    public final int e;
    public final uhf f;
    public final ptk g;
    public final ptj h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptm(pti ptiVar, cfp cfpVar, uhf uhfVar, ptk ptkVar, ptj ptjVar) {
        super(2, ptq.a, ptkVar.a);
        cfpVar.getClass();
        this.c = ptiVar;
        this.d = cfpVar;
        this.e = 0;
        this.f = uhfVar;
        this.g = ptkVar;
        this.h = ptjVar;
        this.i = "name=Google Sans&weight=" + ptjVar.a.h + "&italic=" + (a.p(0, 1) ? 1 : 0);
    }

    @Override // defpackage.cfc
    public final cfp b() {
        return this.d;
    }

    @Override // defpackage.cfc
    public final void c() {
    }
}
