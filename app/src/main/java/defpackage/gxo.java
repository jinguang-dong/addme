package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxo extends gxl {
    private final List a;

    public gxo() {
        ugl uglVar = new ugl((byte[]) null);
        gyd gydVar = gyd.a;
        tpc tpcVarM = gydVar.m();
        tpcVarM.getClass();
        gyb gybVar = gyb.FACING_BACK;
        gsn.w(gybVar, tpcVarM);
        gsn.t(tpcVarM);
        Float fValueOf = Float.valueOf(0.505887f);
        Float fValueOf2 = Float.valueOf(1.0f);
        Float fValueOf3 = Float.valueOf(2.0f);
        Float fValueOf4 = Float.valueOf(5.0f);
        sbp sbpVarO = sbp.o(fValueOf, fValueOf2, fValueOf3, fValueOf4);
        sbpVarO.getClass();
        tpcVarM.v(sbpVarO);
        gsn.s(tpcVarM);
        Float fValueOf5 = Float.valueOf(10.0f);
        Float fValueOf6 = Float.valueOf(20.0f);
        sbp sbpVarQ = sbp.q(fValueOf, fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6);
        sbpVarQ.getClass();
        tpcVarM.u(sbpVarQ);
        tpc tpcVarM2 = gydVar.m();
        tpcVarM2.getClass();
        gsn.w(gyb.FACING_FRONT, tpcVarM2);
        gsn.t(tpcVarM2);
        Float fValueOf7 = Float.valueOf(1.4f);
        sbp sbpVarM = sbp.m(fValueOf2, fValueOf7);
        sbpVarM.getClass();
        tpcVarM2.v(sbpVarM);
        gsn.s(tpcVarM2);
        sbp sbpVarN = sbp.n(fValueOf2, fValueOf7, Float.valueOf(4.0f));
        sbpVarN.getClass();
        tpcVarM2.u(sbpVarN);
        tpc tpcVarM3 = gydVar.m();
        tpcVarM3.getClass();
        gsn.w(gybVar, tpcVarM3);
        gsn.u(ssc.PORTRAIT, tpcVarM3);
        gsn.v(1.4881f, tpcVarM3);
        gsn.t(tpcVarM3);
        Float fValueOf8 = Float.valueOf(1.4881f);
        sbp sbpVarM2 = sbp.m(fValueOf8, fValueOf3);
        sbpVarM2.getClass();
        tpcVarM3.v(sbpVarM2);
        gsn.s(tpcVarM3);
        sbp sbpVarN2 = sbp.n(fValueOf8, fValueOf3, Float.valueOf(3.0f));
        sbpVarN2.getClass();
        tpcVarM3.u(sbpVarN2);
        tpc tpcVarM4 = gydVar.m();
        tpcVarM4.getClass();
        gsn.w(gybVar, tpcVarM4);
        gsn.u(ssc.VEGA, tpcVarM4);
        gsn.t(tpcVarM4);
        sbp sbpVarN3 = sbp.n(fValueOf2, fValueOf3, fValueOf4);
        sbpVarN3.getClass();
        tpcVarM4.v(sbpVarN3);
        gsn.s(tpcVarM4);
        sbp sbpVarP = sbp.p(fValueOf2, fValueOf3, fValueOf4, fValueOf5, fValueOf6);
        sbpVarP.getClass();
        tpcVarM4.u(sbpVarP);
        uglVar.addAll(rnt.ae(new gyd[]{gsn.q(tpcVarM), gsn.q(tpcVarM2), gsn.q(tpcVarM3), gsn.q(tpcVarM4)}));
        gzi gziVar = gzp.a;
        this.a = ske.bi(uglVar);
    }

    @Override // defpackage.gxl
    public final List a() {
        return this.a;
    }
}
