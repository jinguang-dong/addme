package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcy extends bdf {
    public static final bcy a = new bcy();

    private bcy() {
        super(1, 0, 2);
    }

    @Override // defpackage.bdf
    protected final void a(bdi bdiVar, axr axrVar, baz bazVar, bfn bfnVar, bdg bdgVar) {
        int iG;
        int iA = bdiVar.a(0);
        int iG2 = bazVar.g();
        int i = bazVar.q;
        int iQ = bazVar.q(i);
        int iC = bazVar.c(bazVar.b, bazVar.h(i + 1));
        for (int iMax = Math.max(iQ, iC - iA); iMax < iC; iMax++) {
            Object obj = bazVar.c[bazVar.d(iMax)];
            if (obj instanceof bar) {
                int i2 = iG2 - iMax;
                bar barVar = (bar) obj;
                axq axqVar = barVar.b;
                int iA2 = -1;
                if (axqVar == null || !axqVar.a()) {
                    iG = -1;
                } else {
                    iA2 = bazVar.a(axqVar);
                    iG = bazVar.g() - bazVar.p(iA2);
                }
                bfnVar.d(barVar, i2, iA2, iG);
            } else if (obj instanceof bai) {
                ((bai) obj).b();
            }
        }
        if (iA <= 0) {
            ayi.i("Check failed");
        }
        int i3 = bazVar.q;
        int iN = bazVar.n(bazVar.b, bazVar.h(i3));
        int iC2 = bazVar.c(bazVar.b, bazVar.h(i3 + 1)) - iA;
        if (iC2 < iN) {
            ayi.i("Check failed");
        }
        bazVar.I(iC2, iA, i3);
        int i4 = bazVar.h;
        if (i4 >= iN) {
            bazVar.h = i4 - iA;
        }
    }
}
