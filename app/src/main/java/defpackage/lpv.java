package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpv implements lpu {
    private final float[] a = new float[3];
    private final hms b;

    public lpv(hms hmsVar) {
        this.b = hmsVar;
    }

    @Override // defpackage.lpu
    public final float a(poe poeVar) {
        float fSqrt = Float.NaN;
        float fLongValue = ((Long) poeVar.a(CaptureResult.SENSOR_EXPOSURE_TIME)) == null ? Float.NaN : r0.longValue();
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            synchronized (this.a) {
                hms hmsVar = this.b;
                if (hmsVar != null) {
                    hle hleVarC = hmsVar.c(l.longValue());
                    if (!hleVarC.d()) {
                        float[] fArr = hleVarC.a;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        float f3 = fArr[2];
                        fSqrt = (float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                    }
                }
            }
        }
        return (float) Math.exp(fLongValue * (-5.0E-7f) * fSqrt);
    }
}
