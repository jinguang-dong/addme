package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class piu {
    private final pjo a;
    private float b = -1.0f;

    public piu(pjo pjoVar) {
        this.a = pjoVar;
    }

    public final synchronized float a() {
        return this.b;
    }

    public final synchronized rwc b() {
        if (this.b < 0.0f) {
            return rvk.a;
        }
        return rwc.j(new pej(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.b)));
    }

    public final synchronized void c(float f) {
        pjo pjoVar = this.a;
        float fC = pjoVar.c();
        if (f > fC) {
            throw new IllegalArgumentException(String.format("Zoom ratio %.2f exceeds max zoom ratio %.2f.", Float.valueOf(f), Float.valueOf(fC)));
        }
        float fD = pjoVar.d();
        if (f < pjoVar.d()) {
            throw new IllegalArgumentException(String.format("Zoom ratio %.2f is less than min zoom ratio %.2f.", Float.valueOf(f), Float.valueOf(fD)));
        }
        this.b = f;
    }
}
