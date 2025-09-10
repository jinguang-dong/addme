package defpackage;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekc implements eky {
    private final /* synthetic */ int g;
    public static final ekc f = new ekc(5);
    public static final ekc e = new ekc(4);
    public static final ekc d = new ekc(3);
    public static final ekc c = new ekc(2);
    public static final ekc b = new ekc(1);
    public static final ekc a = new ekc(0);

    private ekc(int i) {
        this.g = i;
    }

    @Override // defpackage.eky
    public final /* synthetic */ Object a(elb elbVar, float f2) {
        boolean z;
        int i = this.g;
        if (i == 0) {
            return Float.valueOf(eki.a(elbVar) * f2);
        }
        if (i == 1) {
            z = elbVar.p() == 1;
            if (z) {
                elbVar.g();
            }
            double dA = elbVar.a();
            double dA2 = elbVar.a();
            double dA3 = elbVar.a();
            double dA4 = elbVar.p() == 7 ? elbVar.a() : 1.0d;
            if (z) {
                elbVar.i();
            }
            if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                dA *= 255.0d;
                dA2 *= 255.0d;
                dA3 *= 255.0d;
                if (dA4 <= 1.0d) {
                    dA4 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
        }
        if (i == 2) {
            return Integer.valueOf(Math.round(eki.a(elbVar) * f2));
        }
        if (i == 3) {
            return eki.c(elbVar, f2);
        }
        if (i != 4) {
            z = elbVar.p() == 1;
            if (z) {
                elbVar.g();
            }
            float fA = (float) elbVar.a();
            float fA2 = (float) elbVar.a();
            while (elbVar.n()) {
                elbVar.m();
            }
            if (z) {
                elbVar.i();
            }
            return new elr((fA / 100.0f) * f2, (fA2 / 100.0f) * f2);
        }
        int iP = elbVar.p();
        if (iP == 1) {
            return eki.c(elbVar, f2);
        }
        if (iP == 3) {
            return eki.c(elbVar, f2);
        }
        if (iP != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(a.L(iP)));
        }
        PointF pointF = new PointF(((float) elbVar.a()) * f2, ((float) elbVar.a()) * f2);
        while (elbVar.n()) {
            elbVar.m();
        }
        return pointF;
    }
}
