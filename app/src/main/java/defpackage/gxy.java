package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxy extends gxl {
    public static final gxy a = new gxy();
    private static final List b;

    static {
        tpc tpcVarM = gyd.a.m();
        tpcVarM.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM);
        gsn.t(tpcVarM);
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(1.4f);
        sbp sbpVarM = sbp.m(fValueOf, fValueOf2);
        sbpVarM.getClass();
        tpcVarM.v(sbpVarM);
        gsn.s(tpcVarM);
        Float fValueOf3 = Float.valueOf(3.0f);
        sbp sbpVarN = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN.getClass();
        tpcVarM.u(sbpVarN);
        tpc tpcVarM2 = gyd.a.m();
        tpcVarM2.getClass();
        gsn.w(gyb.FACING_BACK, tpcVarM2);
        gsn.t(tpcVarM2);
        Float fValueOf4 = Float.valueOf(2.0f);
        sbp sbpVarM2 = sbp.m(fValueOf, fValueOf4);
        sbpVarM2.getClass();
        tpcVarM2.v(sbpVarM2);
        gsn.s(tpcVarM2);
        sbp sbpVarN2 = sbp.n(fValueOf, fValueOf4, Float.valueOf(5.0f));
        sbpVarN2.getClass();
        tpcVarM2.u(sbpVarN2);
        tpc tpcVarM3 = gyd.a.m();
        tpcVarM3.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM3);
        gsn.u(ssc.PORTRAIT, tpcVarM3);
        gsn.v(1.2f, tpcVarM3);
        gsn.t(tpcVarM3);
        Float fValueOf5 = Float.valueOf(1.2f);
        sbp sbpVarM3 = sbp.m(fValueOf, fValueOf5);
        sbpVarM3.getClass();
        tpcVarM3.v(sbpVarM3);
        gsn.s(tpcVarM3);
        sbp sbpVarN3 = sbp.n(fValueOf, fValueOf5, fValueOf3);
        sbpVarN3.getClass();
        tpcVarM3.u(sbpVarN3);
        b = rnt.ae(new gyd[]{gsn.q(tpcVarM), gsn.q(tpcVarM2), gsn.q(tpcVarM3)});
    }

    private gxy() {
    }

    @Override // defpackage.gxl
    public final List a() {
        return b;
    }
}
