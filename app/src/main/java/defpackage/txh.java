package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum txh {
    GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER(1000, "com.google.vr.beta.daydream_6dof_controller"),
    GVR_BETA_FEATURE_SEE_THROUGH(1001, mPfBwqXsnpXI.fXfYeCzLL);

    public final int c;
    public final String d;

    txh(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public static txh[] a(int[] iArr) {
        txh txhVar;
        if (iArr == null) {
            return new txh[0];
        }
        int length = iArr.length;
        txh[] txhVarArr = new txh[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            txh[] txhVarArrValues = values();
            int length2 = txhVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    txhVar = null;
                    break;
                }
                txhVar = txhVarArrValues[i3];
                if (txhVar.c == i2) {
                    break;
                }
                i3++;
            }
            txhVarArr[i] = txhVar;
        }
        return txhVarArr;
    }
}
