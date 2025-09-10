package defpackage;

import android.util.Pair;
import com.google.android.apps.camera.coach.CameraCoachHudView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gtx implements png, lzh, lze {
    private final gub A;
    private rwc B;
    private boolean C;
    public final rwc b;
    public final gty c;
    public rwc i;
    public rwc j;
    public boolean k;
    public boolean l;
    public boolean m;
    public rwc n;
    public rwc o;
    public gtw p;
    public final ktx q;
    public final gux r;
    private final ScheduledExecutorService v;
    private final owq w;
    private final boolean x;
    private final gue y;
    private final gun z;
    private static final sgv u = sgv.g("gtx");
    public static final double a = Math.toRadians(5.0d);
    public final float[] d = new float[16];
    public final nng e = new nng();
    public final ocq s = new ocq((byte[]) null);
    public final float[] f = new float[16];
    public final nng g = new nng();
    public final ocq t = new ocq((byte[]) null);
    public final AtomicBoolean h = new AtomicBoolean(false);

    public gtx(rwc rwcVar, gty gtyVar, ktx ktxVar, owq owqVar, ScheduledExecutorService scheduledExecutorService, hbj hbjVar, gue gueVar, gub gubVar, gun gunVar, mdy mdyVar) {
        boolean z = false;
        rvk rvkVar = rvk.a;
        this.i = rvkVar;
        this.j = rvkVar;
        this.B = rvkVar;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = rvkVar;
        this.o = rvkVar;
        this.C = false;
        this.p = new gtw() { // from class: gtu
            @Override // defpackage.gtw
            public final void a() {
                double d = gtx.a;
            }
        };
        this.b = rwcVar;
        this.v = scheduledExecutorService;
        this.q = ktxVar;
        this.c = gtyVar;
        this.w = owqVar;
        this.r = new gux(6, mdyVar);
        if (hbjVar.p(gyp.m) && hbjVar.p(gyp.j)) {
            z = true;
        }
        this.x = z;
        this.y = gueVar;
        this.z = gunVar;
        this.A = gubVar;
    }

    public static boolean m(float f, float f2) {
        return Math.toDegrees((double) Math.abs(f)) < 0.5d && Math.toDegrees((double) Math.abs(f2)) < 0.5d;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        this.v.execute(new gto(this, 6));
    }

    public final void d() {
        if (this.j.h() && this.i.h() && this.k) {
            gtn gtnVar = (gtn) this.j.c();
            if (gtnVar.d.h()) {
                Object objC = gtnVar.d.c();
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) objC;
                if (cameraCoachHudView.d.h()) {
                    cameraCoachHudView.post(new gto(objC, 3));
                }
            }
            ((imi) this.i.c()).h(imk.SECOND_RUN_TOAST);
            this.k = false;
            this.l = false;
            this.p = new gtv(1);
            this.h.set(false);
            this.m = false;
            this.r.g();
        }
    }

    @Override // defpackage.lze
    public final void e() {
        if (this.k) {
            boolean z = this.l;
            gux guxVar = this.r;
            if (z) {
                guxVar.c(sqn.HEEDED);
            } else {
                guxVar.c(sqn.NOT_HEEDED);
            }
        }
    }

    @Override // defpackage.lzh
    public final void f() {
        if (this.C) {
            return;
        }
        this.v.execute(new gto(this, 7));
    }

    @Override // defpackage.lzh
    public final void fa() {
        this.v.execute(new gto(this, 5));
    }

    public final void h() {
        if (l()) {
            if (l()) {
                this.y.i(true);
                this.z.i(true);
            }
            this.c.a = false;
            this.n = rvk.a;
            d();
            this.C = false;
            this.p = new gtv(0);
            this.h.set(false);
        }
    }

    public final void i(gtw gtwVar) {
        if (l()) {
            if (l()) {
                this.y.i(false);
                this.z.i(false);
            }
            this.c.a = true;
            if (!this.o.h()) {
                ((sgt) u.c().M(1044)).s("No camera pose data available.");
                return;
            }
            if (!this.n.h()) {
                this.n = this.o;
            }
            this.C = true;
            this.p = gtwVar;
        }
    }

    public final synchronized void j() {
        if (this.B.h()) {
            ((our) this.B.c()).close();
        }
        our ourVar = new our();
        if (this.j.h()) {
            this.j.c();
            ourVar.d(gtn.f(new Runnable() { // from class: gtt
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair;
                    boolean z;
                    gtx gtxVar = this.a;
                    hms hmsVar = (hms) ((rwg) gtxVar.b).a;
                    if (hmsVar.g()) {
                        return;
                    }
                    jrc jrcVar = new jrc(hmsVar.d().a);
                    gtxVar.o = rwc.j(jrcVar);
                    rwc rwcVar = gtxVar.n;
                    if (rwcVar.h()) {
                        float[] fArr = ((jrc) rwcVar.c()).a;
                        nng nngVar = gtxVar.e;
                        ojl.bc(fArr, nngVar);
                        nngVar.b(gtxVar.d);
                        ocq ocqVar = gtxVar.s;
                        ocqVar.f(r1[0], r1[4], r1[8], r1[1], r1[5], r1[9], r1[2], r1[6], r1[10]);
                        float[] fArr2 = jrcVar.a;
                        nng nngVar2 = gtxVar.g;
                        ojl.bc(fArr2, nngVar2);
                        nngVar2.b(gtxVar.f);
                        ocq ocqVar2 = gtxVar.t;
                        ocqVar2.f(r2[0], r2[4], r2[8], r2[1], r2[5], r2[9], r2[2], r2[6], r2[10]);
                        ocq ocqVar3 = new ocq((byte[]) null);
                        ocqVar.p(ocqVar3);
                        ocq ocqVar4 = new ocq((byte[]) null);
                        ocq.l(ocqVar3, ocqVar2, ocqVar4);
                        int i = gtxVar.q.a().e;
                        if (i == 0) {
                            pair = new Pair(Float.valueOf((float) Math.asin(ocqVar4.d(1, 2))), Float.valueOf(-((float) Math.asin(ocqVar4.d(0, 2)))));
                        } else if (i == 90) {
                            pair = new Pair(Float.valueOf((float) Math.asin(ocqVar4.d(2, 0))), Float.valueOf((float) Math.asin(ocqVar4.d(1, 0))));
                        } else if (i == 180) {
                            pair = new Pair(Float.valueOf((float) Math.asin(ocqVar4.d(1, 2))), Float.valueOf((float) Math.asin(ocqVar4.d(0, 2))));
                        } else {
                            if (i != 270) {
                                throw new IllegalStateException("Invalid device orientation value!");
                            }
                            pair = new Pair(Float.valueOf(-((float) Math.asin(ocqVar4.d(2, 0)))), Float.valueOf((float) Math.asin(ocqVar4.d(1, 0))));
                        }
                        float fFloatValue = ((Float) pair.first).floatValue();
                        float fFloatValue2 = ((Float) pair.second).floatValue();
                        if (gtxVar.i.h() && gtxVar.j.h()) {
                            gux guxVar = gtxVar.r;
                            guxVar.f();
                            if (gtxVar.c.a) {
                                gtn gtnVar = (gtn) gtxVar.j.c();
                                if (gtnVar.b && gtnVar.d.h()) {
                                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) gtnVar.d.c();
                                    cameraCoachHudView.post(new gtq(cameraCoachHudView, fFloatValue, fFloatValue2, 1));
                                }
                                if (!gtxVar.k) {
                                    ((gtn) gtxVar.j.c()).e();
                                    ((imi) gtxVar.i.c()).g(imk.SECOND_RUN_TOAST);
                                    gtxVar.k = true;
                                    guxVar.e(rvk.a);
                                }
                            } else {
                                gtxVar.d();
                            }
                            if (gtxVar.k) {
                                if (!gtx.m(fFloatValue, fFloatValue2)) {
                                    z = false;
                                } else if (!gtxVar.m) {
                                    guxVar.d();
                                    z = true;
                                }
                                gtxVar.m = z;
                            }
                        }
                        gtxVar.l = gtx.m(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                        float fFloatValue3 = ((Float) pair.first).floatValue();
                        float fFloatValue4 = ((Float) pair.second).floatValue();
                        double dAbs = Math.abs(fFloatValue3);
                        double d = gtx.a;
                        if ((dAbs >= d || Math.abs(fFloatValue4) >= d) && gtxVar.h.compareAndSet(false, true)) {
                            gtxVar.p.a();
                        }
                    }
                }
            }, this.v));
        }
        ourVar.d(this.w.dK(new gmd(this, 11), this.v));
        this.q.c(this);
        ourVar.d(new gge(this, 8));
        gux guxVar = this.r;
        guxVar.a();
        ourVar.d(new gge(guxVar, 9));
        this.B = rwc.j(ourVar);
        this.c.a();
    }

    public final synchronized void k() {
        d();
        if (this.B.h()) {
            ((our) this.B.c()).close();
            this.B = rvk.a;
        }
        this.c.a();
    }

    protected final boolean l() {
        return this.x && this.A.a().h();
    }

    public final boolean n() {
        return this.h.get();
    }

    @Override // defpackage.lzh
    public final void dM() {
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
    }
}
