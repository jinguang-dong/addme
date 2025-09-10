package defpackage;

import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilg {
    private float a;
    private float b;
    private int c;

    public ilg() {
        b();
    }

    public final synchronized void a(TrackerStats trackerStats) {
        this.c++;
        float f = trackerStats.featureMotionInPixels;
        float fMin = Math.min(trackerStats.numActiveTracks, 50);
        float fMin2 = 1.0f / Math.min(this.c, 5);
        float f2 = 1.0f - fMin2;
        this.a = (f * fMin2) + (this.a * f2);
        this.b = (fMin2 * (fMin / 50.0f)) + (f2 * this.b);
    }

    public final synchronized void b() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0;
    }
}
