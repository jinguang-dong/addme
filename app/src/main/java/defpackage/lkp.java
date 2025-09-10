package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkp extends ojl {
    private final owq a;
    private final juw b;

    public lkp(owq owqVar, juw juwVar) {
        super((short[]) null);
        this.a = owqVar;
        this.b = juwVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_EXPOSURE_TIME);
        Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AE_MODE);
        Integer num2 = (Integer) this.b.b.map(new idh(poeVar, 17)).orElse(null);
        if (l == null && num == null && num2 == null) {
            return;
        }
        owq owqVar = this.a;
        lkt lktVar = new lkt((lku) owqVar.dL());
        if (l != null) {
            lktVar.b(l.longValue());
        }
        if (num != null) {
            if (num.intValue() != 1) {
                lktVar.c(false);
            } else if (num2 != null) {
                lktVar.c(!((Boolean) r8.d.map(new idh(num2, 10)).orElse(false)).booleanValue());
            } else {
                lktVar.c(true);
            }
        }
        owqVar.a(lktVar.a());
    }
}
