package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.util.Range;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PhysicalStabilityThresholds;
import com.google.googlex.gcam.PostShutterAfParams;
import com.google.googlex.gcam.ViewfinderResults;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdf implements pau {
    private static final sgv a = sgv.g("kdf");
    private static final Duration b = Duration.ofSeconds(2);
    private static final Duration c = Duration.ofSeconds(1);
    private static final Duration d = Duration.ofMillis(500);
    private final nkw e;
    private final pjo f;
    private final hzs g;
    private final pbn h;
    private final boolean i;
    private final kel j;
    private final hyh k;
    private final ibb l;
    private final pau m;
    private final pau n;
    private final fuf o;
    private final owf p;
    private final owq q;
    private final owq r;
    private final owf s;
    private lpq t;
    private lpq u;
    private final hbj v;

    public kdf(nkw nkwVar, kel kelVar, pbn pbnVar, hzs hzsVar, pjo pjoVar, our ourVar, hyh hyhVar, ibb ibbVar, ovx ovxVar, ovx ovxVar2, fuf fufVar, hbj hbjVar, owf owfVar, owq owqVar, owq owqVar2, owf owfVar2) {
        this.f = pjoVar;
        this.i = nkwVar.equals(nkw.NIGHT_SIGHT);
        this.h = pbnVar;
        this.j = kelVar;
        this.e = nkwVar;
        this.g = hzsVar;
        this.k = hyhVar;
        this.l = ibbVar;
        this.m = ovxVar;
        this.n = ovxVar2;
        this.o = fufVar;
        this.v = hbjVar;
        this.p = owfVar;
        this.q = owqVar;
        this.r = owqVar2;
        this.s = owfVar2;
        ourVar.d(kelVar);
        hyhVar.getClass();
        ourVar.d(new iew(hyhVar, 16));
    }

    private final float c(int i) {
        PhysicalStabilityThresholds physicalStabilityThresholdsA = this.g.h(i).a();
        return GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(physicalStabilityThresholdsA.a, physicalStabilityThresholdsA);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [sgt, shi] */
    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        Duration durationOfMillis;
        poe poeVar = (poe) obj;
        try {
            String strB = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
            if (rnt.V(strB)) {
                strB = poeVar.b();
            }
            hzs hzsVar = this.g;
            strB.getClass();
            int iC = hzsVar.c(poeVar, pjr.b(strB));
            if (!((ick) this.s.dL()).a) {
                if (this.l.g()) {
                    hzs hzsVar2 = this.g;
                    ViewfinderResults viewfinderResultsK = hzsVar2.k(iC);
                    PostShutterAfParams postShutterAfParamsI = hzsVar2.i(iC);
                    float fViewfinderResults_payload_capture_time_ms_get = GcamModuleJNI.ViewfinderResults_payload_capture_time_ms_get(viewfinderResultsK.a, viewfinderResultsK);
                    if (fViewfinderResults_payload_capture_time_ms_get < 0.0f) {
                        durationOfMillis = Duration.ofMillis(-1L);
                    } else {
                        float fA = viewfinderResultsK.a();
                        float fPostShutterAfParams_max_handheld_exposure_time_ms_get = GcamModuleJNI.PostShutterAfParams_max_handheld_exposure_time_ms_get(postShutterAfParamsI.a, postShutterAfParamsI);
                        durationOfMillis = Duration.ofMillis((long) (fA >= 0.0f ? Math.min(fViewfinderResults_payload_capture_time_ms_get + fA, 6000.0f) : fViewfinderResults_payload_capture_time_ms_get < 1000.0f ? fPostShutterAfParams_max_handheld_exposure_time_ms_get + fViewfinderResults_payload_capture_time_ms_get : fViewfinderResults_payload_capture_time_ms_get + (Math.max((2000.0f - fViewfinderResults_payload_capture_time_ms_get) / 1000.0f, 0.0f) * fPostShutterAfParams_max_handheld_exposure_time_ms_get)));
                    }
                    if (svz.c(durationOfMillis)) {
                        this.m.a(durationOfMillis);
                    }
                    this.n.a(Duration.ofMillis((long) viewfinderResultsK.a()));
                } else {
                    this.m.a(hxf.a);
                }
            }
            boolean z = this.i;
            if (!z) {
                nkw nkwVar = this.e;
                if (!nkwVar.equals(nkw.PHOTO)) {
                    nkw nkwVar2 = nkw.TIME_LAPSE;
                    if (!nkwVar.equals(nkwVar2) || !this.o.a(nkwVar2)) {
                        return;
                    }
                }
            }
            pbn pbnVar = this.h;
            pbnVar.f("StabilityProcessing");
            nkw nkwVar3 = this.e;
            nkw nkwVar4 = nkw.TIME_LAPSE;
            float fC = nkwVar3 == nkwVar4 ? 0.0f : c(iC);
            hzs hzsVar3 = this.g;
            PhysicalStabilityThresholds physicalStabilityThresholdsA = hzsVar3.h(iC).a();
            float fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get = GcamModuleJNI.PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(physicalStabilityThresholdsA.a, physicalStabilityThresholdsA) * 1.6f;
            Optional optionalOf = fC < fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get ? Optional.of(new Range(Float.valueOf(fC), Float.valueOf(fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get))) : Optional.empty();
            if (this.t == null && optionalOf.isPresent()) {
                this.t = new lpq((Range) optionalOf.get(), b(), c, d);
            }
            if (this.u == null) {
                this.u = new lpq(new Range(Float.valueOf(0.0f), Float.valueOf(c(iC))), b(), c, d);
            }
            ViewfinderResults viewfinderResultsK2 = hzsVar3.k(iC);
            float fViewfinderResults_gyro_speed_rad_per_sec_get = GcamModuleJNI.ViewfinderResults_gyro_speed_rad_per_sec_get(viewfinderResultsK2.a, viewfinderResultsK2);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            lpq lpqVar = this.t;
            if (lpqVar != null) {
                lpqVar.a(fViewfinderResults_gyro_speed_rad_per_sec_get, jElapsedRealtimeNanos);
            }
            lpq lpqVar2 = this.u;
            lpqVar2.getClass();
            lpqVar2.a(fViewfinderResults_gyro_speed_rad_per_sec_get, jElapsedRealtimeNanos);
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            lpq lpqVar3 = this.u;
            lpqVar3.getClass();
            boolean zB = lpqVar3.b(jElapsedRealtimeNanos2);
            if (((Boolean) this.p.dL()).booleanValue() && zB) {
                this.q.a(Boolean.valueOf(!this.j.b()));
            } else {
                this.q.a(false);
            }
            this.r.a(Boolean.valueOf(zB));
            lpq lpqVar4 = this.t;
            boolean zB2 = lpqVar4 != null ? lpqVar4.b(jElapsedRealtimeNanos2) : false;
            pbnVar.g();
            if (nkwVar3.equals(nkwVar4)) {
                this.k.a(zB, zB2, false, true);
            } else {
                this.j.a(zB, zB2, this.f.l(), z);
            }
        } catch (IllegalArgumentException e) {
            this.h.g();
            ((sgt) ((sgt) a.c().i(e)).M((char) 3247)).s("Error getting physical camera ID");
        }
    }

    final Duration b() {
        return this.e == nkw.TIME_LAPSE ? Duration.ofMillis(((Integer) this.v.a(haw.c).get()).intValue()) : b;
    }
}
