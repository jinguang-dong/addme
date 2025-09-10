package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcu extends ojl {
    private final ggm a;

    public gcu(oyn oynVar) {
        super((short[]) null);
        this.a = new ggm(oynVar);
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null) {
            ggm ggmVar = this.a;
            ggl gglVar = ggl.FPS_30;
            if (gglVar.a(l.longValue()) && ggmVar.b != gglVar) {
                ggmVar.b = gglVar;
                ggmVar.a.r(ggmVar.b.c);
                return;
            }
            ggl gglVar2 = ggl.FPS_60;
            if (!gglVar2.a(l.longValue()) || ggmVar.b == gglVar2) {
                return;
            }
            ggmVar.b = gglVar2;
            ggmVar.a.r(ggmVar.b.c);
        }
    }
}
