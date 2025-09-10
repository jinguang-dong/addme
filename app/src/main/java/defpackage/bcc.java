package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcc extends bdf {
    public static final bcc a = new bcc();

    private bcc() {
        super(0, 2, 1);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        int i;
        bfi bfiVar = (bfi) bdiVar.c(0);
        int iA = bazVar.a((axq) bdiVar.c(1));
        if (bazVar.o >= iA) {
            ayi.i("Check failed");
        }
        bad.c(bazVar, axrVar, iA);
        int i2 = bazVar.o;
        int iL = bazVar.q;
        while (iL >= 0 && !bazVar.S(iL)) {
            iL = bazVar.l(iL);
        }
        int iJ = iL + 1;
        int iM = 0;
        while (iJ < i2) {
            if (bazVar.R(i2, iJ)) {
                if (true == bazVar.S(iJ)) {
                    iM = 0;
                }
                iJ++;
            } else {
                iM += bazVar.S(iJ) ? 1 : bazVar.k(iJ);
                iJ += bazVar.j(iJ);
            }
        }
        while (true) {
            i = bazVar.o;
            if (i >= iA) {
                break;
            }
            if (bazVar.R(iA, i)) {
                int i3 = bazVar.o;
                if (i3 < bazVar.p && (bazVar.b[(bazVar.h(i3) * 5) + 1] & 1073741824) != 0) {
                    axrVar.d(bazVar.v(i3));
                    iM = 0;
                }
                bazVar.L();
            } else {
                iM += bazVar.m();
            }
        }
        if (i != iA) {
            ayi.i("Check failed");
        }
        bfiVar.a = iM;
    }
}
