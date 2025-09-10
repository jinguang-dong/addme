package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bma implements bmg {
    private final /* synthetic */ int a;

    public /* synthetic */ bma(int i) {
        this.a = i;
    }

    @Override // defpackage.bmg
    public final double a(double d) {
        int i = this.a;
        if (i == 0) {
            float[] fArr = bmb.a;
            return Math.copySign(byi.P(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? i != 4 ? i != 5 ? d : bmb.c(bmb.d, d) : bmb.d(bmb.d, d) : bmb.a(bmb.c, d) : bmb.b(bmb.c, d);
        }
        float[] fArr2 = bmb.a;
        return Math.copySign(byi.O(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
    }
}
