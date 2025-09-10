package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class laf extends ojl {
    private final pjp a;
    private final pjo b;
    private final nms c;
    private final lae d;

    public laf(pjp pjpVar, pjo pjoVar, nms nmsVar, lae laeVar) {
        super((short[]) null);
        this.a = pjpVar;
        this.b = pjoVar;
        this.c = nmsVar;
        this.d = laeVar;
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        float[] fArr;
        int length;
        pjp pjpVar;
        pjr pjrVarD;
        CaptureResult.Key key = nvk.a;
        if (key != null && (fArr = (float[]) poeVar.a(key)) != null && (length = fArr.length) >= 13) {
            float f = fArr[11];
            float f2 = fArr[12];
            float f3 = length > 16 ? fArr[16] : length > 15 ? fArr[15] : 0.0f;
            pjo pjoVarB = this.b;
            Map mapG = poeVar.g();
            if (mapG.size() == 1) {
                String strB = ((pnx) Collection.EL.stream(mapG.values()).findFirst().get()).b();
                if (strB != null && (pjrVarD = (pjpVar = this.a).d(strB)) != null) {
                    pjoVarB = pjpVar.a(pjrVarD);
                }
            } else {
                pjoVarB = this.c.b((String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID));
            }
            this.d.h(pjoVarB, f, f2, f3);
        }
    }
}
