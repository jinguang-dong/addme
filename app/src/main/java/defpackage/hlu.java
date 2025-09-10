package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlu implements hlc {
    public Rect a;
    public fee b;
    public pjo c;
    public final hmk d;

    public hlu(hmk hmkVar) {
        this.d = hmkVar;
    }

    @Override // defpackage.hlc
    public final void a(pdk pdkVar, peo peoVar) {
        pdk pdkVarA = pdkVar.a();
        if (pdkVarA != null) {
            pdkVarA.j(new hlt(this, pdkVarA, peoVar));
        }
    }

    public final synchronized void b(pjo pjoVar, fee feeVar) {
        Rect rect = (Rect) pjoVar.m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        this.a = rect;
        this.c = pjoVar;
        this.b = feeVar;
    }
}
