package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpt implements lpu {
    private final /* synthetic */ int a;

    public lpt(int i) {
        this.a = i;
    }

    @Override // defpackage.lpu
    public final float a(poe poeVar) {
        int i = this.a;
        if (i == 0) {
            Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
            if (num == null) {
                return Float.NaN;
            }
            return (num.intValue() == 4 || num.intValue() == 2) ? 1.0f : 0.0f;
        }
        if (i == 1) {
            Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_AE_STATE);
            if (num2 == null) {
                return Float.NaN;
            }
            return (num2.intValue() == 2 || num2.intValue() == 3) ? 1.0f : 0.0f;
        }
        if (i == 2) {
            Integer num3 = (Integer) poeVar.a(CaptureResult.CONTROL_AWB_STATE);
            if (num3 == null) {
                return Float.NaN;
            }
            return (num3.intValue() == 2 || num3.intValue() == 3) ? 1.0f : 0.0f;
        }
        if (i != 3) {
            Integer num4 = (Integer) poeVar.a(CaptureResult.LENS_STATE);
            return (num4 == null || num4.intValue() == 0) ? 1.0f : 0.0f;
        }
        if (((Face[]) poeVar.a(CaptureResult.STATISTICS_FACES)) != null) {
            return r6.length;
        }
        return Float.NaN;
    }
}
