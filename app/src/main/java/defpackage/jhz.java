package defpackage;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.wear.ambient.AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class jhz implements jic, olz {
    public static final sgv a = sgv.g("jhz");
    public static final int b = ojl.aY(20);
    public static final int c = ojl.aY(60);
    public static final Uri d = Uri.parse("content://com.google.settings/partner");
    public boolean e = false;
    public Location f;
    public long g;
    public long h;
    public boolean i;
    public final omk j;
    private final Executor k;

    public jhz(Context context, Executor executor) {
        this.j = new omk(context);
        this.k = executor;
    }

    public static final boolean d(Location location) {
        if (location == null) {
            ((sgt) a.c().M(2736)).s("Fused location API did not provide a location.");
            return false;
        }
        if (Double.isInfinite(location.getLatitude()) || Double.isNaN(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isNaN(location.getLongitude()) || (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d)) {
            ((sgt) a.c().M(2734)).v("Fused location API provided a location that is probably incorrect: %s", location);
            return false;
        }
        long jBa = ojl.ba(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
        if (jBa <= ojl.aY(1800)) {
            return true;
        }
        ((sgt) a.c().M(2735)).v("Fused location API provided a location from %g seconds ago. Ignoring location.", Float.valueOf(ojl.aV(jBa)));
        return false;
    }

    private final void e() {
        synchronized (this) {
            this.i = true;
            if (this.e) {
                try {
                    omk omkVar = this.j;
                    String simpleName = olz.class.getSimpleName();
                    ojl.az(simpleName, "Listener type must not be null");
                    ojl.ax(simpleName, "Listener type must not be empty");
                    omkVar.g(new ogl(this, simpleName), 2418).a(new AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0(1, null), new oog() { // from class: omh
                        @Override // defpackage.oog
                        public final Object a(oor oorVar) {
                            return null;
                        }
                    });
                } catch (Exception e) {
                    ((sgt) ((sgt) a.c().i(e)).M(2747)).s("Failed to remove location listeners. ");
                }
                this.e = false;
            } else {
                this.e = false;
            }
        }
    }

    @Override // defpackage.jic
    public final syu a() {
        Location location;
        final szh szhVar = new szh();
        if (this.f == null || System.currentTimeMillis() - this.g >= 1000) {
            location = null;
            this.f = null;
        } else {
            System.currentTimeMillis();
            location = this.f;
        }
        if (location != null) {
            szhVar.e(location);
            return szhVar;
        }
        omk omkVar = this.j;
        omkVar.a().i(this.k, new oom() { // from class: jhx
            /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
            @Override // defpackage.oom
            public final void a(oor oorVar) {
                szh szhVar2 = szhVar;
                try {
                    Location location2 = (Location) oorVar.d();
                    jhz jhzVar = this.a;
                    if (!jhz.d(location2)) {
                        szhVar2.e(null);
                        return;
                    }
                    jhzVar.f = location2;
                    jhzVar.g = System.currentTimeMillis();
                    szhVar2.e(location2);
                } catch (ooq e) {
                    ((sgt) ((sgt) jhz.a.c().i(e)).M((char) 2737)).s("getCurrentLocation meet exception!");
                    szhVar2.e(null);
                }
            }
        });
        return szhVar;
    }

    @Override // defpackage.olz
    public final void b(Location location) {
        if (d(location)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.h;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.h;
            long j = c;
            if (location.getAccuracy() < ((int) (((jCurrentTimeMillis / ojl.aY(10)) + 1.0f) * 50.0f)) || jCurrentTimeMillis2 > j) {
                e();
                location.getAccuracy();
            }
        }
    }

    @Override // defpackage.jic
    public final void c(boolean z) {
        if (!z) {
            e();
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.i = false;
            omk omkVar = this.j;
            omkVar.a().i(this.k, new oom() { // from class: jhy
                @Override // defpackage.oom
                public final void a(oor oorVar) {
                    Location location;
                    jhz jhzVar = this.a;
                    synchronized (jhzVar) {
                        if (jhzVar.i) {
                            jhzVar.i = false;
                            return;
                        }
                        try {
                            location = (Location) oorVar.d();
                        } catch (ooq e) {
                            ((sgt) ((sgt) jhz.a.c().i(e)).M(2741)).s("getCurrentLocation meet exception!");
                            location = null;
                        }
                        if (jhz.d(location) && ojl.ba(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) < ojl.aY(60) && location.getAccuracy() < 50.0f) {
                            location.getAccuracy();
                            return;
                        }
                        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
                        long j = jhz.b;
                        ojl.aq(true, "intervalMillis must be greater than or equal to 0");
                        long j2 = locationRequest.c;
                        long j3 = locationRequest.b;
                        if (j2 == j3 / 6) {
                            locationRequest.c = j / 6;
                        }
                        if (locationRequest.i == j3) {
                            locationRequest.i = j;
                        }
                        locationRequest.b = j;
                        lpa.t(100);
                        locationRequest.a = 100;
                        long j4 = jhz.c;
                        ojl.aq(true, "durationMillis must be greater than 0");
                        locationRequest.e = j4;
                        try {
                            omk omkVar2 = jhzVar.j;
                            Looper looperMyLooper = omkVar2.f;
                            if (looperMyLooper == null) {
                                looperMyLooper = Looper.myLooper();
                                ojl.az(looperMyLooper, "invalid null looper");
                            }
                            ogn ognVarAE = ojl.aE(jhzVar, looperMyLooper, olz.class.getSimpleName());
                            omj omjVar = new omj(omkVar2, ognVarAE);
                            old oldVar = new old(omjVar, locationRequest, 2);
                            ogs ogsVar = new ogs();
                            ogsVar.a = oldVar;
                            ogsVar.b = omjVar;
                            ogsVar.c = ognVarAE;
                            ogsVar.f = 2435;
                            omkVar2.l(ogsVar.a());
                            jhzVar.e = true;
                            jhzVar.h = System.currentTimeMillis();
                        } catch (Exception e2) {
                            ((sgt) ((sgt) jhz.a.c().i(e2)).M(2739)).s("requestLocationUpdates failed!");
                        }
                    }
                }
            });
        }
    }
}
