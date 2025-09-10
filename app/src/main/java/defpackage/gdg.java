package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdg extends ojl {
    private final owf a;
    private final owq b;
    private final owq c;
    private final hwz d;

    public gdg(owf owfVar, owq owqVar, owq owqVar2, hbj hbjVar) {
        super((short[]) null);
        this.a = owfVar;
        this.b = owqVar;
        this.c = owqVar2;
        this.d = hwz.a(hbjVar, nkw.VIDEO, false, false);
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        CaptureResult.Key key;
        float[] fArr;
        if (((Boolean) this.a.dL()).booleanValue() && (key = nvk.a) != null && (fArr = (float[]) poeVar.a(key)) != null && fArr.length >= 13) {
            float f = fArr[6];
            if (f != -999.0f) {
                this.b.a(Float.valueOf(f));
                owq owqVar = this.c;
                hwz hwzVar = this.d;
                float f2 = hwzVar.c;
                float f3 = hwzVar.b;
                owqVar.a(Float.valueOf(f2 < f3 ? clc.C((f3 - f) / Math.abs(f2 - f3), 0.0f, 0.0f) : 0.0f));
            }
        }
    }
}
