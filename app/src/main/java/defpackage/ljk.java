package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljk extends ojl {
    private final owq a;
    private final juw b;
    private final iso c;

    public ljk(owq owqVar, juw juwVar, iso isoVar) {
        super((short[]) null);
        this.a = owqVar;
        this.b = juwVar;
        this.c = isoVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        float fIntValue;
        Integer num = (Integer) poeVar.a(CaptureResult.SENSOR_SENSITIVITY);
        Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
        Integer num3 = (Integer) poeVar.a(CaptureResult.CONTROL_AE_MODE);
        Integer num4 = (Integer) this.b.b.map(new idh(poeVar, 15)).orElse(null);
        if (num == null && num3 == null && num4 == null) {
            return;
        }
        owq owqVar = this.a;
        ljp ljpVar = new ljp((ljq) owqVar.dL());
        if (num != null) {
            if (num2 != null) {
                ljpVar.d((num.intValue() * num2.intValue()) / 100);
            } else {
                ljpVar.d(num.intValue());
            }
        }
        if (num3 != null) {
            if (num3.intValue() != 1) {
                ljpVar.b(false);
            } else if (num4 != null) {
                ljpVar.b(!((Boolean) r4.e.map(new idh(num4, 10)).orElse(false)).booleanValue());
            } else {
                ljpVar.b(true);
            }
        }
        iso isoVar = this.c;
        idd iddVar = new idd(null);
        iddVar.a = isoVar.d(poeVar);
        iddVar.e = (byte) (1 | iddVar.e);
        fiy fiyVar = new fiy(isoVar.e(poeVar), 18);
        jwc jwcVar = (jwc) isoVar.b;
        Float f = (Float) jwcVar.c.map(fiyVar).orElse(null);
        iddVar.b = f != null ? f.floatValue() : ((Integer) r0.o(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY)).intValue();
        int i = 2;
        iddVar.e = (byte) (iddVar.e | 2);
        Float f2 = (Float) jwcVar.a.map(new fiy(poeVar, 20)).orElse(null);
        if (f2 != null) {
            fIntValue = f2.floatValue();
        } else {
            Integer num5 = (Integer) poeVar.a(CaptureResult.SENSOR_SENSITIVITY);
            num5.getClass();
            fIntValue = num5.intValue();
        }
        float fD = isoVar.d(poeVar);
        ((Long) poeVar.a(CaptureResult.SENSOR_EXPOSURE_TIME)).getClass();
        iddVar.d = (fIntValue / fD) * (r4.longValue() / 1000000.0f);
        iddVar.e = (byte) (iddVar.e | 4);
        jwcVar.d.map(new fiy(poeVar, 19)).filter(new hzk(i)).map(new gbm(12)).ifPresent(new hyq(iddVar, 11));
        if (iddVar.e != 7) {
            throw new IllegalStateException();
        }
        ide ideVar = new ide(iddVar.a, iddVar.b, iddVar.c, iddVar.d);
        float fFloatValue = ((Float) ideVar.b.orElse(Float.valueOf(ideVar.c))).floatValue();
        float f3 = ideVar.a;
        ljpVar.c((int) Math.max((fFloatValue * f3) / 66.666664f, f3));
        owqVar.a(ljpVar.a());
    }
}
