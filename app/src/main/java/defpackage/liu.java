package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liu extends ojl {
    private final owq a;

    public liu(owq owqVar) {
        super((short[]) null);
        this.a = owqVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Float f = (Float) poeVar.a(CaptureResult.LENS_FOCUS_DISTANCE);
        Integer num = (Integer) poeVar.a(CaptureResult.CONTROL_AF_MODE);
        Integer num2 = (Integer) poeVar.a(CaptureResult.CONTROL_AF_STATE);
        if (f == null && num == null && num2 == null) {
            return;
        }
        owq owqVar = this.a;
        liz lizVar = new liz((lja) owqVar.dL());
        if (f != null) {
            lizVar.c(f.floatValue());
        }
        if (num != null) {
            lizVar.d(num.intValue() != 0);
        }
        if (num2 != null) {
            lizVar.b(num2.intValue());
        }
        owqVar.a(lizVar.a());
    }
}
