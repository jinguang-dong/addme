package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxz extends gxl {
    private final List a;

    public gxz() {
        ugl uglVar = new ugl((byte[]) null);
        gyd gydVar = gyd.a;
        tpc tpcVarM = gydVar.m();
        tpcVarM.getClass();
        gyb gybVar = gyb.FACING_BACK;
        gsn.w(gybVar, tpcVarM);
        gsn.t(tpcVarM);
        Float fValueOf = Float.valueOf(0.550078f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(2.0f);
        sbp sbpVarN = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN.getClass();
        tpcVarM.v(sbpVarN);
        gsn.s(tpcVarM);
        sbp sbpVarO = sbp.o(fValueOf, fValueOf2, fValueOf3, Float.valueOf(8.0f));
        sbpVarO.getClass();
        tpcVarM.u(sbpVarO);
        tpc tpcVarM2 = gydVar.m();
        tpcVarM2.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM2);
        gsn.t(tpcVarM2);
        Float fValueOf4 = Float.valueOf(1.4f);
        sbp sbpVarM = sbp.m(fValueOf2, fValueOf4);
        sbpVarM.getClass();
        tpcVarM2.v(sbpVarM);
        gsn.s(tpcVarM2);
        sbp sbpVarN2 = sbp.n(fValueOf2, fValueOf4, Float.valueOf(4.0f));
        sbpVarN2.getClass();
        tpcVarM2.u(sbpVarN2);
        tpc tpcVarM3 = gydVar.m();
        tpcVarM3.getClass();
        gsn.w(gybVar, tpcVarM3);
        gsn.u(ssc.PORTRAIT, tpcVarM3);
        gsn.v(2.0f, tpcVarM3);
        gsn.t(tpcVarM3);
        Float fValueOf5 = Float.valueOf(1.4881f);
        sbp sbpVarM2 = sbp.m(fValueOf5, fValueOf3);
        sbpVarM2.getClass();
        tpcVarM3.v(sbpVarM2);
        gsn.s(tpcVarM3);
        Float fValueOf6 = Float.valueOf(3.0f);
        sbp sbpVarN3 = sbp.n(fValueOf5, fValueOf3, fValueOf6);
        sbpVarN3.getClass();
        tpcVarM3.u(sbpVarN3);
        tpc tpcVarM4 = gydVar.m();
        tpcVarM4.getClass();
        gsn.w(gybVar, tpcVarM4);
        gsn.u(ssc.VIDEO_CAPTURE, tpcVarM4);
        gsn.t(tpcVarM4);
        sbp sbpVarN4 = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN4.getClass();
        tpcVarM4.v(sbpVarN4);
        gsn.s(tpcVarM4);
        Float fValueOf7 = Float.valueOf(5.0f);
        sbp sbpVarO2 = sbp.o(fValueOf, fValueOf2, fValueOf3, fValueOf7);
        sbpVarO2.getClass();
        tpcVarM4.u(sbpVarO2);
        tpc tpcVarM5 = gydVar.m();
        tpcVarM5.getClass();
        gsn.w(gybVar, tpcVarM5);
        gsn.u(ssc.CINEMATIC_PAN, tpcVarM5);
        gsn.t(tpcVarM5);
        sbp sbpVarN5 = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN5.getClass();
        tpcVarM5.v(sbpVarN5);
        gsn.s(tpcVarM5);
        sbp sbpVarO3 = sbp.o(fValueOf, fValueOf2, fValueOf3, fValueOf6);
        sbpVarO3.getClass();
        tpcVarM5.u(sbpVarO3);
        tpc tpcVarM6 = gydVar.m();
        tpcVarM6.getClass();
        gsn.w(gybVar, tpcVarM6);
        gsn.u(ssc.TIMELAPSE, tpcVarM6);
        gsn.t(tpcVarM6);
        sbp sbpVarN6 = sbp.n(fValueOf, fValueOf2, fValueOf3);
        sbpVarN6.getClass();
        tpcVarM6.v(sbpVarN6);
        gsn.s(tpcVarM6);
        sbp sbpVarO4 = sbp.o(fValueOf, fValueOf2, fValueOf3, fValueOf7);
        sbpVarO4.getClass();
        tpcVarM6.u(sbpVarO4);
        tpc tpcVarM7 = gydVar.m();
        tpcVarM7.getClass();
        gsn.w(gybVar, tpcVarM7);
        gsn.u(ssc.SLOW_MOTION, tpcVarM7);
        gsn.t(tpcVarM7);
        sbp sbpVarM3 = sbp.m(fValueOf2, fValueOf3);
        sbpVarM3.getClass();
        tpcVarM7.v(sbpVarM3);
        gsn.s(tpcVarM7);
        sbp sbpVarN7 = sbp.n(fValueOf2, fValueOf3, fValueOf6);
        sbpVarN7.getClass();
        tpcVarM7.u(sbpVarN7);
        uglVar.addAll(rnt.ae(new gyd[]{gsn.q(tpcVarM), gsn.q(tpcVarM2), gsn.q(tpcVarM3), gsn.q(tpcVarM4), gsn.q(tpcVarM5), gsn.q(tpcVarM6), gsn.q(tpcVarM7)}));
        gzi gziVar = gzp.a;
        this.a = ske.bi(uglVar);
    }

    @Override // defpackage.gxl
    public final List a() {
        return this.a;
    }
}
