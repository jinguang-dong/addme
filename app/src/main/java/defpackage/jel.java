package defpackage;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jel {
    public float a = 0.0f;
    public double b = -1.0d;
    public boolean c = false;

    public final void a() {
        double d = this.b;
        float f = 0.16000001f;
        if (d > 0.0d) {
            if (d > 0.025d) {
                f = 0.0025000002f;
            } else if (d < 0.01d) {
                f = true != this.c ? 1.0f : 0.010000001f;
            }
        }
        boolean z = this.a > f;
        Object obj = jeb.a;
        LightCycleNative.SetSensorMovementTooFast(z);
    }
}
