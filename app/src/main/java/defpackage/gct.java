package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gct extends ojl {
    private static final sgv c = sgv.g("gct");
    public int a;
    public int b;

    public gct() {
        super((short[]) null);
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        f(l.longValue());
    }

    final synchronized void f(long j) {
        if (j >= 29979000 && j <= 36641000) {
            this.a++;
        } else if (j < 14999400 || j > 18332600) {
            ((sgt) c.c().M(747)).v("Auto FPS received a frame that was neither 30 or 60 fps. Frame was: %f", Float.valueOf(1.0E9f / j));
        } else {
            this.b++;
        }
    }
}
