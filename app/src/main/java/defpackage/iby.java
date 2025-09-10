package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.JpgEncoderMetadata;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iby {
    public static final sgv a = sgv.g("iby");
    private static final AtomicBoolean z = new AtomicBoolean(false);
    private final ShotParams A;
    private final hbc B;
    private final iso C;
    public final tgn f;
    public final InterleavedU8ClientAllocator g;
    public final tdr h;
    public final InterleavedU8ClientAllocator i;
    public final tdr j;
    public final tdo k;
    public final ica l;
    public final iao m;
    public final boolean n;
    public final poe o;
    public final iea p;
    public final pjr q;
    public final mhp r;
    public final tcy u;
    public final ibx w;
    public final gga x;
    public final rtl y;
    public int v = 1;
    public int b = GcamModuleJNI.kInvalidShotId_get();
    public final AtomicLong s = new AtomicLong();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final JpgEncoderMetadata t = new JpgEncoderMetadata();

    public iby(tgn tgnVar, ica icaVar, DisplayMetrics displayMetrics, gga ggaVar, int i, int i2, gox goxVar, hbc hbcVar, iso isoVar, ShotParams shotParams, iao iaoVar, boolean z2, poe poeVar, iea ieaVar, pjr pjrVar, mhp mhpVar, tcy tcyVar) {
        this.f = tgnVar;
        this.y = new rtl(tgnVar);
        this.l = icaVar;
        this.B = hbcVar;
        this.C = isoVar;
        this.x = ggaVar;
        this.A = new ShotParams(shotParams);
        this.m = iaoVar;
        this.n = z2;
        this.o = poeVar;
        this.p = ieaVar;
        this.q = pjrVar;
        this.r = mhpVar;
        this.u = tcyVar;
        this.w = new ibx(this, i, i2, icaVar, hbcVar, isoVar, goxVar, ggaVar);
        if (icaVar.g().h()) {
            this.g = new tdk(displayMetrics);
            this.h = null;
        } else if (icaVar.h().h()) {
            this.g = null;
            this.h = new tdr();
        } else {
            if (icaVar.f().h()) {
                this.g = new tdm(288L, 32L);
            } else {
                this.g = null;
            }
            this.h = null;
        }
        if (icaVar.d().h()) {
            this.k = new tdo();
        } else {
            this.k = null;
        }
        if (icaVar.k().h()) {
            this.i = new tdp();
            this.j = null;
        } else if (icaVar.l().h()) {
            this.i = new tdm(307L, 51L);
            this.j = null;
        } else if (icaVar.n().h()) {
            this.j = new tdr();
            this.i = null;
        } else {
            this.i = null;
            this.j = null;
        }
    }

    public static final tcb g(mhp mhpVar) {
        switch (mhpVar) {
            case COLD:
                return tcb.f;
            case NORMAL:
                return tcb.a;
            case HEAT_LIGHT:
                return tcb.g;
            case HEAT_MODERATE:
                return tcb.h;
            case HEAT_SEVERE:
                return tcb.b;
            case HEAT_CRITICAL:
                return tcb.c;
            case HEAT_EMERGENCY:
                return tcb.d;
            case HEAT_SHUTDOWN:
                return tcb.i;
            default:
                return tcb.e;
        }
    }

    public final int a() {
        rnt.M(this.b != GcamModuleJNI.kInvalidShotId_get(), "setShotId() has not been called on this Shot.");
        return this.b;
    }

    public final ShotParams b() {
        return new ShotParams(this.A);
    }

    final void c(poe poeVar) {
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        this.d.add(Long.valueOf(l != null ? l.longValue() : -1L));
        this.c.add(poeVar);
    }

    public final void d(ShotMetadata shotMetadata) {
        List list = this.e;
        if (list.isEmpty()) {
            return;
        }
        tpc tpcVarM = igd.a.m();
        long jA = ShotMetadata.a(shotMetadata);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        igd igdVar = (igd) tphVar;
        igdVar.b |= 1;
        igdVar.d = jA;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        igd igdVar2 = (igd) tpcVarM.b;
        tpw tpwVar = igdVar2.c;
        if (!tpwVar.c()) {
            igdVar2.c = tph.v(tpwVar);
        }
        tnq.e(list, igdVar2.c);
        ((sgt) a.c().M(1821)).s("Failed to set face deblur node protos to shot metadata.");
    }

    public final boolean e() {
        return this.m == iao.NIGHT_SIGHT || this.n;
    }

    public final void f(int i, int i2) {
        if (i == 2 || i == i2) {
            return;
        }
        ((sgt) a.b().M(1820)).v("%s failed", "Gxp");
        if (this.B == hbc.RELEASE || z.getAndSet(true)) {
            return;
        }
        this.C.l("Gxp failed! Please immediately take and file a bug report.");
    }
}
