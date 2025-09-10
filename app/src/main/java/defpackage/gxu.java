package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxu extends gxl {
    public static final gxu a = new gxu();
    private static final List b;

    static {
        tpc tpcVarM = gyd.a.m();
        tpcVarM.getClass();
        gsn.w(gyb.FACING_BACK, tpcVarM);
        gsn.t(tpcVarM);
        Float fValueOf = Float.valueOf(0.670443f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(2.0f);
        sbp sbpVarN = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN.getClass();
        tpcVarM.v(sbpVarN);
        gsn.s(tpcVarM);
        Float fValueOf4 = Float.valueOf(7.0f);
        sbp sbpVarO = sbp.o(fValueOf, fValueOf2, fValueOf3, fValueOf4);
        sbpVarO.getClass();
        tpcVarM.u(sbpVarO);
        tpc tpcVarM2 = gyd.a.m();
        tpcVarM2.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM2);
        gsn.t(tpcVarM2);
        Float fValueOf5 = Float.valueOf(1.4f);
        sbp sbpVarM = sbp.m(fValueOf2, fValueOf5);
        sbpVarM.getClass();
        tpcVarM2.v(sbpVarM);
        gsn.s(tpcVarM2);
        Float fValueOf6 = Float.valueOf(4.0f);
        sbp sbpVarN2 = sbp.n(fValueOf2, fValueOf5, fValueOf6);
        sbpVarN2.getClass();
        tpcVarM2.u(sbpVarN2);
        tpc tpcVarM3 = gyd.a.m();
        tpcVarM3.getClass();
        gsn.w(gyb.FACING_BACK, tpcVarM3);
        gsn.u(ssc.PORTRAIT, tpcVarM3);
        gsn.v(1.5172f, tpcVarM3);
        gsn.x(1.5172f, tpcVarM3);
        gsn.t(tpcVarM3);
        Float fValueOf7 = Float.valueOf(1.5172f);
        Float fValueOf8 = Float.valueOf(3.0344f);
        sbp sbpVarM2 = sbp.m(fValueOf7, fValueOf8);
        sbpVarM2.getClass();
        tpcVarM3.v(sbpVarM2);
        gsn.s(tpcVarM3);
        sbp sbpVarN3 = sbp.n(fValueOf7, fValueOf8, fValueOf4);
        sbpVarN3.getClass();
        tpcVarM3.u(sbpVarN3);
        tpc tpcVarM4 = gyd.a.m();
        tpcVarM4.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM4);
        gsn.u(ssc.PORTRAIT, tpcVarM4);
        gsn.v(1.0f, tpcVarM4);
        gsn.t(tpcVarM4);
        Float fValueOf9 = Float.valueOf(1.2f);
        sbp sbpVarM3 = sbp.m(fValueOf2, fValueOf9);
        sbpVarM3.getClass();
        tpcVarM4.v(sbpVarM3);
        gsn.s(tpcVarM4);
        sbp sbpVarN4 = sbp.n(fValueOf2, fValueOf9, fValueOf6);
        sbpVarN4.getClass();
        tpcVarM4.u(sbpVarN4);
        b = rnt.ae(new gyd[]{gsn.q(tpcVarM), gsn.q(tpcVarM2), gsn.q(tpcVarM3), gsn.q(tpcVarM4)});
    }

    private gxu() {
    }

    @Override // defpackage.gxl
    public final List a() {
        return b;
    }
}
