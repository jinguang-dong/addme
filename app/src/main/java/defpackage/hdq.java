package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hdq implements hdp {
    private static final Duration a = Duration.ofMillis(3000);
    private static final sgv b = sgv.g("hdq");
    private final CameraActivityTiming c;
    private final hbj d;
    private final cxb e;

    public hdq(hbj hbjVar, CameraActivityTiming cameraActivityTiming, cxb cxbVar) {
        this.d = hbjVar;
        this.c = cameraActivityTiming;
        this.e = cxbVar;
    }

    @Override // defpackage.hdp
    public final void a() {
        sgv sgvVar = b;
        sgt sgtVar = (sgt) sgvVar.c().M(1192);
        CameraActivityTiming cameraActivityTiming = this.c;
        sgtVar.v("Launch failed. Dropping LaunchReport. (timings=%s)", cameraActivityTiming);
        long activityOnStartStartNs = cameraActivityTiming.getActivityOnStartStartNs();
        if (activityOnStartStartNs == -1) {
            ((sgt) sgvVar.c().M(1193)).s("Missing ACTIVITY_ONSTART_START. Skipping");
            return;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - activityOnStartStartNs;
        hbj hbjVar = this.d;
        Duration durationOfNanos = Duration.ofNanos(jElapsedRealtimeNanos);
        if (Duration.ofMillis(((Integer) hbjVar.a(gzo.w).get()).intValue()).toMillis() >= durationOfNanos.toMillis() || durationOfNanos.toMillis() >= a.toMillis()) {
            return;
        }
        cxb.I();
    }
}
