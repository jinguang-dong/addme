package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfh {
    public static final sbp a;
    public final float b;
    private final float c;

    static {
        tfc tfcVar = tfc.TURN_AROUND;
        tfc tfcVar2 = tfc.LEFT;
        tfc tfcVar3 = tfc.RIGHT;
        tfc tfcVar4 = tfc.FORWARD;
        tfc tfcVar5 = tfc.BACKWARD;
        tfc tfcVar6 = tfc.UP;
        tfc tfcVar7 = tfc.DOWN;
        tfc tfcVar8 = tfc.POINT_AT_SCENE;
        tfc tfcVar9 = tfc.POINT_AT_SCENE_CLOSE;
        int i = sbp.d;
        a = sbp.h(tfcVar, tfcVar2, tfcVar3, tfcVar4, tfcVar5, tfcVar6, tfcVar7, tfcVar8, tfcVar9);
    }

    public tfh(hbj hbjVar) {
        this.c = ((Float) hbjVar.e(gyi.F).orElseThrow()).floatValue();
        this.b = ((Float) hbjVar.e(gyi.G).orElseThrow()).floatValue();
    }

    public static float b(double d) {
        if (d > 1.0d) {
            d = ((d - 1.0d) / 10.0d) + 1.0d;
        }
        return (float) d;
    }

    public final float a(txn txnVar, float[] fArr, double d, boolean z) {
        double dExp;
        double dA = txn.a(txnVar, rup.o(fArr).e());
        if (z) {
            dExp = Math.exp((this.c * (d - dA)) / d);
        } else {
            dExp = Math.exp((this.c * (dA + d)) / d);
        }
        return ske.aj(b(dExp), 0.0f, 2.0f);
    }

    public final float c(fnp fnpVar, fok fokVar, double d) {
        boolean z = false;
        if (d > 0.0d && d <= 1.0d) {
            z = true;
        }
        a.I(z);
        float[] fArr = txk.a;
        txk txkVar = new txk(fArr);
        fokVar.r(txkVar.b);
        txk txkVar2 = new txk(fArr);
        fokVar.q(txkVar2.b);
        txk txkVar3 = new txk(fArr);
        fnpVar.o(txkVar3.b);
        txk txkVar4 = new txk(fArr);
        txk.b(txkVar2, txkVar, txkVar4);
        txk.b(txkVar4, txkVar3, txkVar4);
        txn txnVarA = txkVar4.a(new txo(0.0f, 0.0f, 0.0f));
        float fAbs = Math.abs(txnVarA.a);
        float fAbs2 = Math.abs(txnVarA.b);
        double d2 = this.b;
        return ske.aj((float) Math.sqrt(b(Math.exp(((d - fAbs) * d2) / d)) * b(Math.exp((d2 * (d - fAbs2)) / d))), 0.0f, 2.0f);
    }
}
