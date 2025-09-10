package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uia {
    public static final Integer a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName(GdpuLBytnYW.kfjGLmSgkTrSW).getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        a = num;
    }
}
