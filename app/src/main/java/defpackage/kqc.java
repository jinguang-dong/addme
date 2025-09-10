package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqc implements kpz {
    private final pbc a;
    private double b = 33.0d;
    private final hdm c;

    public kqc(pbb pbbVar, hdm hdmVar) {
        this.a = pbbVar.a("FrameJank");
        this.c = hdmVar;
    }

    @Override // defpackage.kpz
    public final void a(poe poeVar, double d, double d2) {
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null && l2 != null) {
            this.c.b(l.longValue(), l2.longValue());
        }
        double d3 = this.b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 1.5d) {
                this.a.f("JANK! Time between frames (" + d + "ms) increased by " + (d4 * 100.0d) + "% over the expected delta (" + d3 + "ms)");
            }
        }
        if (d > 33.0d) {
            double d5 = this.b;
            if (d > d5) {
                this.b = (d + (d5 * 10.0d)) / 11.0d;
            } else {
                this.b = d;
            }
        }
    }
}
