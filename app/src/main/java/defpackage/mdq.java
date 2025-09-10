package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.ar.core.ImageMetadata;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mdq implements ltb {
    private static final sgv k = sgv.g("mdq");
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public List h;
    public long i;
    public long j;
    private final ltd l;
    private final pbn m;
    private final long n;
    private ltf o;
    private boolean p;
    private long q;
    private long r;
    private long s;
    private long t;
    private boolean u = false;
    private boolean v = false;
    private pbp w;
    private final mdy x;
    private final cxb y;

    public mdq(mdy mdyVar, cxb cxbVar, pbn pbnVar, hbj hbjVar, ltd ltdVar) {
        this.x = mdyVar;
        this.y = cxbVar;
        this.m = pbnVar;
        this.l = ltdVar;
        this.n = ((Integer) hbjVar.a(gzo.z).get()).intValue();
    }

    @Override // defpackage.ltb
    public final void a() {
        if (this.u) {
            return;
        }
        ((sgt) k.c().M(4717)).v("onCaptureFinalized invoked without the final result being set!%s", ojl.bH());
    }

    @Override // defpackage.ltb
    public final void b() {
    }

    @Override // defpackage.ltb
    public final void c(jjb jjbVar) {
        if (this.v) {
            ((sgt) k.c().M(4729)).v("onCaptureStarted invoked after stated event was logged!%s", ojl.bH());
            return;
        }
        int i = 1;
        this.v = true;
        this.a = SystemClock.elapsedRealtimeNanos();
        this.w = this.m.a("CaptureToThumbnailRendered");
        ltf ltfVar = jjbVar.a;
        this.o = ltfVar;
        mdy mdyVar = this.x;
        long j = this.a;
        if (mdyVar.B.p(gzo.bJ)) {
            mdyVar.x.add(ltfVar);
        }
        tpc tpcVarM = sob.a.m();
        int iG = mdy.G(ltfVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sob sobVar = (sob) tpcVarM.b;
        sobVar.c = iG - 1;
        int i2 = 2;
        sobVar.b |= 2;
        sob sobVar2 = (sob) tpcVarM.l();
        tpc tpcVarM2 = sor.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sor sorVar = (sor) tphVar;
        sorVar.b |= 2;
        sorVar.d = j;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sor sorVar2 = (sor) tpcVarM2.b;
        sobVar2.getClass();
        sorVar2.c = sobVar2;
        sorVar2.b |= 1;
        ssc sscVarX = jea.x(ltfVar);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sor sorVar3 = (sor) tphVar2;
        sorVar3.e = sscVarX.T;
        sorVar3.b |= 4;
        boolean z = jjbVar.e;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        sor sorVar4 = (sor) tpcVarM2.b;
        sorVar4.b |= 128;
        sorVar4.j = z;
        jjq jjqVar = jjbVar.f;
        lkk lkkVar = jjbVar.g;
        tpc tpcVarM3 = srt.a.m();
        tpcVarM3.getClass();
        jjqVar.a.ifPresent(new lji(tpcVarM3, 17));
        jjqVar.b.ifPresent(new ktp(tpcVarM3, 5));
        jjqVar.e.ifPresent(new lji(tpcVarM3, 18));
        jjqVar.f.ifPresent(new lji(tpcVarM3, 19));
        jjqVar.g.ifPresent(new lji(tpcVarM3, 20));
        jjqVar.h.ifPresent(new mdw(tpcVarM3, i));
        jjqVar.i.ifPresent(new mdw(tpcVarM3, 0));
        jjqVar.j.ifPresent(new mdw(tpcVarM3, i2));
        int iA = lkkVar.a();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        srt srtVar = (srt) tpcVarM3.b;
        srtVar.k = iA - 1;
        srtVar.b |= 256;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sor sorVar5 = (sor) tpcVarM2.b;
        srt srtVar2 = (srt) tpcVarM3.l();
        srtVar2.getClass();
        sorVar5.k = srtVar2;
        sorVar5.b |= 256;
        tpc tpcVarM4 = srn.a.m();
        boolean z2 = jjbVar.d;
        if (!tpcVarM4.b.C()) {
            tpcVarM4.o();
        }
        srn srnVar = (srn) tpcVarM4.b;
        srnVar.b |= 1;
        srnVar.c = z2;
        srn srnVar2 = (srn) tpcVarM4.l();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar3 = tpcVarM2.b;
        sor sorVar6 = (sor) tphVar3;
        srnVar2.getClass();
        sorVar6.i = srnVar2;
        sorVar6.b |= 64;
        boolean z3 = jjbVar.h;
        if (!tphVar3.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        sor sorVar7 = (sor) tphVar4;
        sorVar7.b |= 512;
        sorVar7.l = z3;
        srw srwVar = jjbVar.b;
        if (srwVar != null) {
            int iAy = a.ay(srwVar.i);
            if (iAy == 0) {
                iAy = 1;
            }
            if (!tphVar4.C()) {
                tpcVarM2.o();
            }
            sor sorVar8 = (sor) tpcVarM2.b;
            sorVar8.f = iAy - 1;
            sorVar8.b |= 8;
        }
        if (ltfVar == ltf.LONG_SHOT) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sor sorVar9 = (sor) tpcVarM2.b;
            sorVar9.g = 4;
            sorVar9.b |= 16;
        } else if (srwVar != null) {
            int iAm = a.am(srwVar.m);
            if (iAm == 0) {
                iAm = 1;
            }
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sor sorVar10 = (sor) tpcVarM2.b;
            sorVar10.g = iAm - 1;
            sorVar10.b |= 16;
        }
        Float f = jjbVar.c;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sor sorVar11 = (sor) tpcVarM2.b;
            sorVar11.b |= 32;
            sorVar11.h = fFloatValue;
        }
        tpc tpcVarM5 = sod.a.m();
        soc socVar = soc.CAPTURE_PROFILE_START;
        if (!tpcVarM5.b.C()) {
            tpcVarM5.o();
        }
        tph tphVar5 = tpcVarM5.b;
        sod sodVar = (sod) tphVar5;
        sodVar.f = socVar.aJ;
        sodVar.b = 1 | sodVar.b;
        if (!tphVar5.C()) {
            tpcVarM5.o();
        }
        sod sodVar2 = (sod) tpcVarM5.b;
        sor sorVar12 = (sor) tpcVarM2.l();
        sorVar12.getClass();
        sodVar2.p = sorVar12;
        sodVar2.b |= 16384;
        mdyVar.I(tpcVarM5);
        mdy.e(4, "onCaptureStarted", j, sobVar2);
    }

    @Override // defpackage.ltb
    public final void d(boolean z, boolean z2) {
        this.p = z2;
    }

    @Override // defpackage.ltb
    public final void e() {
        this.r = SystemClock.elapsedRealtimeNanos();
        pbp pbpVar = this.w;
        if (pbpVar != null) {
            pbpVar.a();
            this.w = null;
        }
        if (this.p) {
            return;
        }
        long j = this.n;
        if (j == 0 || this.t == 0 || Duration.ofNanos(SystemClock.elapsedRealtimeNanos() - this.t).toMillis() <= j) {
            return;
        }
        cxb.I();
    }

    @Override // defpackage.ltb
    public final void f(rwc rwcVar) {
        if (rwcVar.h()) {
            this.g = ((meu) rwcVar.c()).a();
            this.t = ((meu) rwcVar.c()).d();
        }
        this.q = SystemClock.elapsedRealtimeNanos();
    }

    @Override // defpackage.ltb
    public final void i(int i, int i2) {
        if (!this.v) {
            ((sgt) k.c().M(4724)).v("onCapturePersisted invoked before capture was started!%s", ojl.bH());
            return;
        }
        if (this.u) {
            ((sgt) k.c().M(4723)).v("onCapturePersisted invoked after final event was logged!%s", ojl.bH());
            return;
        }
        this.u = true;
        this.s = SystemClock.elapsedRealtimeNanos();
        TimeUnit.NANOSECONDS.toMillis(this.s - this.a);
        TimeUnit.NANOSECONDS.toMillis(this.c - this.a);
        TimeUnit.NANOSECONDS.toMillis(this.s - this.d);
        mdy mdyVar = this.x;
        long j = this.g;
        long j2 = this.t;
        long j3 = this.a;
        long j4 = this.b;
        long j5 = this.q;
        long j6 = this.r;
        long j7 = this.c;
        long j8 = this.d;
        long j9 = this.e;
        long j10 = this.f;
        List list = this.h;
        long j11 = this.s;
        long j12 = this.i;
        long j13 = this.j;
        ltf ltfVar = this.o;
        tpc tpcVarM = sob.a.m();
        int iG = mdy.G(ltfVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sob sobVar = (sob) tpcVarM.b;
        sobVar.c = iG - 1;
        sobVar.b |= 2;
        sob sobVar2 = (sob) tpcVarM.l();
        tpc tpcVarM2 = sos.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sos sosVar = (sos) tphVar;
        sosVar.b |= 1;
        sosVar.c = j3;
        if (j4 > 0) {
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            sos sosVar2 = (sos) tpcVarM2.b;
            sosVar2.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            sosVar2.n = j4;
        }
        if (j5 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar3 = (sos) tpcVarM2.b;
            sosVar3.b |= 2;
            sosVar3.d = j5;
        }
        if (j6 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar4 = (sos) tpcVarM2.b;
            sosVar4.b |= 32768;
            sosVar4.m = j6;
        }
        if (j7 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar5 = (sos) tpcVarM2.b;
            sosVar5.b |= 512;
            sosVar5.g = j7;
        }
        if (j8 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar6 = (sos) tpcVarM2.b;
            sosVar6.b |= 1024;
            sosVar6.h = j8;
        }
        if (j11 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar7 = (sos) tpcVarM2.b;
            sosVar7.b |= 4096;
            sosVar7.i = j11;
        }
        if (j9 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar8 = (sos) tpcVarM2.b;
            sosVar8.b |= 32;
            sosVar8.e = j9;
        }
        if (j10 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar9 = (sos) tpcVarM2.b;
            sosVar9.b |= 64;
            sosVar9.f = j10;
        }
        if (j > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar10 = (sos) tpcVarM2.b;
            sosVar10.b |= 8192;
            sosVar10.k = j;
        }
        if (j2 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar11 = (sos) tpcVarM2.b;
            sosVar11.b |= 16384;
            sosVar11.l = j2;
        }
        if (list != null) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar12 = (sos) tpcVarM2.b;
            tpw tpwVar = sosVar12.j;
            if (!tpwVar.c()) {
                sosVar12.j = tph.v(tpwVar);
            }
            tnq.e(list, sosVar12.j);
        }
        if (j12 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar13 = (sos) tpcVarM2.b;
            sosVar13.b |= 131072;
            sosVar13.o = j12;
        }
        if (j13 > 0) {
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sos sosVar14 = (sos) tpcVarM2.b;
            sosVar14.b |= 262144;
            sosVar14.p = j13;
        }
        tpc tpcVarM3 = soo.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        soo sooVar = (soo) tpcVarM3.b;
        sos sosVar15 = (sos) tpcVarM2.l();
        sosVar15.getClass();
        sooVar.d = sosVar15;
        sooVar.b |= 2;
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        soo sooVar2 = (soo) tpcVarM3.b;
        sobVar2.getClass();
        sooVar2.c = sobVar2;
        sooVar2.b |= 1;
        sot sotVarF = mdy.F(i, i2);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        soo sooVar3 = (soo) tpcVarM3.b;
        sotVarF.getClass();
        sooVar3.e = sotVarF;
        sooVar3.b |= 4;
        soo sooVar4 = (soo) tpcVarM3.l();
        tpc tpcVarM4 = sod.a.m();
        soc socVar = soc.CAPTURE_PROFILE;
        if (!tpcVarM4.b.C()) {
            tpcVarM4.o();
        }
        tph tphVar2 = tpcVarM4.b;
        sod sodVar = (sod) tphVar2;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar2.C()) {
            tpcVarM4.o();
        }
        sod sodVar2 = (sod) tpcVarM4.b;
        sooVar4.getClass();
        sodVar2.q = sooVar4;
        sodVar2.b |= 32768;
        mdyVar.I(tpcVarM4);
        mdy.e(4, "onCapturePersisted", j3, sobVar2);
        long j14 = this.g;
        if (j14 > 0) {
            long j15 = this.i;
            if (j15 > 0 && j14 < j15) {
                if (this.p) {
                    return;
                }
                cxb.I();
                return;
            }
        }
        if (this.q == 0) {
            cxb.I();
        }
    }

    @Override // defpackage.ltb
    public final void j(int i, int i2) {
        if (!this.v) {
            ((sgt) k.c().M(4727)).v("onCaptureStartCommitted invoked before capture was started!%s", ojl.bH());
            return;
        }
        if (this.u) {
            ((sgt) k.c().M(4726)).v("onCaptureStartCommitted invoked after final event was logged!%s", ojl.bH());
            return;
        }
        mdy mdyVar = this.x;
        long j = this.a;
        ltf ltfVar = this.o;
        tpc tpcVarM = sob.a.m();
        int iG = mdy.G(ltfVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sob sobVar = (sob) tpcVarM.b;
        sobVar.c = iG - 1;
        sobVar.b |= 2;
        sob sobVar2 = (sob) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.v;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar = (sod) tpcVarM2.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM3 = soq.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        soq soqVar = (soq) tpcVarM3.b;
        soqVar.b |= 2;
        soqVar.d = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar = tpcVarM3.b;
        soq soqVar2 = (soq) tphVar;
        soqVar2.b |= 4;
        soqVar2.e = jElapsedRealtimeNanos;
        if (!tphVar.C()) {
            tpcVarM3.o();
        }
        soq soqVar3 = (soq) tpcVarM3.b;
        sobVar2.getClass();
        soqVar3.c = sobVar2;
        soqVar3.b |= 1;
        sot sotVarF = mdy.F(i, i2);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        soq soqVar4 = (soq) tpcVarM3.b;
        sotVarF.getClass();
        soqVar4.f = sotVarF;
        soqVar4.b |= 8;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        soq soqVar5 = (soq) tpcVarM3.l();
        soqVar5.getClass();
        sodVar2.w = soqVar5;
        sodVar2.b |= 4194304;
        mdyVar.I(tpcVarM2);
        mdy.e(4, "onCaptureStartCommitted", j, sobVar2);
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("shotId", this.l);
        rwbVarW.f("CaptureStartTimeNs", this.a);
        rwbVarW.f("ShutterButtonDownTimeNs", this.g);
        rwbVarW.f("ShutterButtonUpTimeNs", this.t);
        rwbVarW.f("TinyThumbTimeNs", this.q);
        rwbVarW.f("MediumThumbTimeNs", 0L);
        rwbVarW.f("ProcessingStartedTimeNs", this.c);
        rwbVarW.f("ProcessingCompleteTimeNs", this.d);
        rwbVarW.f("CapturePersistedTimeNs", this.s);
        rwbVarW.b("SessionType", this.o);
        return rwbVarW.toString();
    }

    @Override // defpackage.ltb
    public final void g(int i, int i2, Throwable th) {
        if (!this.v) {
            ((sgt) k.c().M(4712)).v("onCaptureCanceled invoked before capture was started!%s", ojl.bH());
            return;
        }
        if (this.u) {
            ((sgt) k.c().M(4711)).v(INRGuObcrHjSQz.CQu, ojl.bH());
            return;
        }
        this.u = true;
        mdy mdyVar = this.x;
        long j = this.a;
        ltf ltfVar = this.o;
        tpc tpcVarM = sob.a.m();
        int iG = mdy.G(ltfVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sob sobVar = (sob) tpcVarM.b;
        sobVar.c = iG - 1;
        sobVar.b |= 2;
        sob sobVar2 = (sob) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CAPTURE_PROFILE_ABORTED;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar = (sod) tpcVarM2.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM3 = son.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        son sonVar = (son) tpcVarM3.b;
        sonVar.b |= 2;
        sonVar.d = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar = tpcVarM3.b;
        son sonVar2 = (son) tphVar;
        sonVar2.b |= 4;
        sonVar2.e = jElapsedRealtimeNanos;
        if (!tphVar.C()) {
            tpcVarM3.o();
        }
        son sonVar3 = (son) tpcVarM3.b;
        sobVar2.getClass();
        sonVar3.c = sobVar2;
        sonVar3.b = 1 | sonVar3.b;
        sot sotVarF = mdy.F(i, i2);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        son sonVar4 = (son) tpcVarM3.b;
        sotVarF.getClass();
        sonVar4.f = sotVarF;
        sonVar4.b |= 8;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        son sonVar5 = (son) tpcVarM3.l();
        sonVar5.getClass();
        sodVar2.r = sonVar5;
        sodVar2.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        mdyVar.I(tpcVarM2);
        mdy.e(5, "onCaptureCanceled", j, sobVar2);
        mdyVar.y.a(th instanceof hhr ? (hhr) th : new hhr(th));
    }

    @Override // defpackage.ltb
    public final void h(int i, int i2, Throwable th) {
        if (!this.v) {
            ((sgt) k.c().M(4715)).v("onCaptureFailed invoked before capture was started!%s", ojl.bH());
            return;
        }
        if (this.u) {
            ((sgt) k.c().M(4714)).v("onCaptureFailed invoked after final event was logged!%s", ojl.bH());
            return;
        }
        this.u = true;
        mdy mdyVar = this.x;
        long j = this.a;
        ltf ltfVar = this.o;
        tpc tpcVarM = sob.a.m();
        int iG = mdy.G(ltfVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sob sobVar = (sob) tpcVarM.b;
        sobVar.c = iG - 1;
        sobVar.b |= 2;
        sob sobVar2 = (sob) tpcVarM.l();
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CAPTURE_PROFILE_FAILED;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar = (sod) tpcVarM2.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM3 = sop.a.m();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        sop sopVar = (sop) tpcVarM3.b;
        sopVar.b |= 2;
        sopVar.d = j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar = tpcVarM3.b;
        sop sopVar2 = (sop) tphVar;
        sopVar2.b |= 4;
        sopVar2.e = jElapsedRealtimeNanos;
        if (!tphVar.C()) {
            tpcVarM3.o();
        }
        sop sopVar3 = (sop) tpcVarM3.b;
        sobVar2.getClass();
        sopVar3.c = sobVar2;
        sopVar3.b = 1 | sopVar3.b;
        sot sotVarF = mdy.F(i, i2);
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        sop sopVar4 = (sop) tpcVarM3.b;
        sotVarF.getClass();
        sopVar4.f = sotVarF;
        sopVar4.b |= 8;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sop sopVar5 = (sop) tpcVarM3.l();
        sopVar5.getClass();
        sodVar2.v = sopVar5;
        sodVar2.b |= 2097152;
        mdyVar.I(tpcVarM2);
        mdy.e(5, oUZhwRhE.eIBDeqGp, j, sobVar2);
        mdyVar.y.a(th instanceof hht ? (hht) th : new hht(th));
    }
}
