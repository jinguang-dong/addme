package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.libraries.camera.exif.ExifInterface;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarCollections;
import j$.util.concurrent.DesugarTimeUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jnm implements joa {
    public static final sgv a;
    private final owf A;
    private final owf B;
    private final owf C;
    private final luj D;
    private final iso E;
    private final owd F;
    public final Executor b;
    public final Executor c;
    public final joe d;
    public final jmw e;
    public final rwc f;
    public final rwc g;
    public final kby h;
    public final boolean i;
    public final jmv j;
    public final jns k;
    public final Handler l;
    public final hwt m;
    public volatile long n;
    public final List o;
    public final owq p = new ovx(-1L);
    public final owq q = new ovx(1500000000L);
    public final owq r;
    public final joo s;
    public final hbj t;
    public final nhz u;
    public final gga v;
    public final iso w;
    public final pfl x;
    private final jsf y;
    private final boolean z;

    static {
        Duration.ofSeconds(15L);
        a = sgv.g("jnm");
    }

    public jnm(Executor executor, Executor executor2, joe joeVar, jmw jmwVar, owd owdVar, rwc rwcVar, rwc rwcVar2, kby kbyVar, joo jooVar, nhz nhzVar, jsf jsfVar, hbj hbjVar, jmv jmvVar, Handler handler, jns jnsVar, hwt hwtVar, iso isoVar, pfl pflVar, gga ggaVar, iso isoVar2, owf owfVar, luj lujVar, owf owfVar2, rwc rwcVar3, owq owqVar) {
        this.d = joeVar;
        executor.getClass();
        this.b = executor;
        executor2.getClass();
        this.c = executor2;
        this.e = jmwVar;
        this.F = owdVar;
        this.f = rwcVar;
        this.g = rwcVar2;
        this.h = kbyVar;
        this.s = jooVar;
        this.u = nhzVar;
        this.y = jsfVar;
        this.t = hbjVar;
        this.j = jmvVar;
        this.k = jnsVar;
        this.l = handler;
        this.m = hwtVar;
        this.E = isoVar;
        this.w = isoVar2;
        this.x = pflVar;
        this.v = ggaVar;
        this.z = hbjVar.p(gzz.E);
        this.A = owfVar;
        this.D = lujVar;
        this.C = owfVar2;
        this.B = (owf) rwcVar3.e(new ovx(false));
        this.r = owqVar;
        gzi gziVar = gzq.a;
        this.o = DesugarCollections.synchronizedList(new ArrayList());
        this.i = hbjVar.p(gzz.l);
        gzi gziVar2 = gzo.a;
    }

    public static syu b(syu syuVar, sxi sxiVar, sxi sxiVar2) {
        syn synVarV = syn.v(syuVar);
        sxo sxoVar = sxo.a;
        return swf.j(swz.j(synVarV, sxiVar, sxoVar), RuntimeException.class, new jmx(sxiVar2, 0), sxoVar);
    }

    public static void f(kby kbyVar, ltd ltdVar, Handler handler) {
        handler.postDelayed(new imf(kbyVar, ltdVar, 20), ltdVar, 5000L);
    }

    public static final srw i(jnl jnlVar, long j) {
        jpi jpiVarA = jnlVar.d.a();
        tpc tpcVarM = srw.a.m();
        long j2 = j - jnlVar.f;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        srw srwVar = (srw) tpcVarM.b;
        srwVar.b |= 1;
        srwVar.c = (int) j2;
        if (jnlVar.p && jnlVar.r.h()) {
            SystemClock.elapsedRealtime();
            ((Long) jnlVar.r.c()).longValue();
        }
        try {
            int iConvert = (int) TimeUnit.MILLISECONDS.convert(((Long) ske.U(jnlVar.h)).longValue() - jpiVarA.c, TimeUnit.MICROSECONDS);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srw srwVar2 = (srw) tpcVarM.b;
            srwVar2.b |= 2;
            srwVar2.d = iConvert;
            int iConvert2 = (int) TimeUnit.MILLISECONDS.convert(jpiVarA.d - jnlVar.e, TimeUnit.MICROSECONDS);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            srw srwVar3 = (srw) tphVar;
            srwVar3.b |= 4;
            srwVar3.e = iConvert2;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            srw srwVar4 = (srw) tphVar2;
            srwVar4.b |= 16;
            srwVar4.g = true;
            int i = jpiVarA.b;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            tph tphVar3 = tpcVarM.b;
            srw srwVar5 = (srw) tphVar3;
            srwVar5.b |= 8;
            srwVar5.f = i;
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            srw srwVar6 = (srw) tpcVarM.b;
            srwVar6.b |= 32;
            srwVar6.h = false;
            int iL = l(jnlVar.u);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar4 = tpcVarM.b;
            srw srwVar7 = (srw) tphVar4;
            srwVar7.i = iL - 1;
            srwVar7.b |= 64;
            int i2 = jnlVar.v;
            if (!tphVar4.C()) {
                tpcVarM.o();
            }
            srw srwVar8 = (srw) tpcVarM.b;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            srwVar8.m = i3;
            srwVar8.b |= 512;
            syu syuVar = jnlVar.j;
            rnt.L(syuVar.isDone());
            if (((rwc) ske.V(syuVar)).h()) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srw srwVar9 = (srw) tpcVarM.b;
                srwVar9.b |= 128;
                srwVar9.k = true;
            }
            jnlVar.i.e(tpcVarM);
            return (srw) tpcVarM.l();
        } catch (ExecutionException e) {
            throw new IllegalStateException("Shutter timestamp unavailable for stats collection", e);
        }
    }

    public static final srw j(jnl jnlVar) {
        tpc tpcVarM = srw.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        srw srwVar = (srw) tpcVarM.b;
        srwVar.b |= 16;
        srwVar.g = false;
        int iL = l(jnlVar.u);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        srw srwVar2 = (srw) tphVar;
        srwVar2.i = iL - 1;
        srwVar2.b |= 64;
        int i = jnlVar.v;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        srw srwVar3 = (srw) tpcVarM.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        srwVar3.m = i2;
        srwVar3.b |= 512;
        return (srw) tpcVarM.l();
    }

    public static final void k(jnl jnlVar, jnk jnkVar) {
        rnt.L(jnlVar.l.get());
        try {
            try {
                byte[] bArr = jnkVar.d;
                ExifInterface exifInterface = (ExifInterface) jnkVar.b.f();
                lsu lsuVar = jnkVar.e;
                pos posVar = lsuVar.b;
                prh.G(bArr, exifInterface, posVar);
                jnkVar.c.d(posVar.a());
                lsuVar.b();
                jnlVar.c.a();
                szh szhVar = jnlVar.n;
                rnt.L(!szhVar.isDone());
                szhVar.e(jnkVar.a);
            } catch (IOException e) {
                ((sgt) ((sgt) a.b().i(e)).M(2884)).s("Could not move original image to place");
                jnlVar.n.a(e);
                jnkVar.e.a();
                jnlVar.c.a();
            }
        } catch (Throwable th) {
            jnlVar.c.a();
            throw th;
        }
    }

    private static final int l(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 4 : 3;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7 A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:14:0x002a, B:82:0x025b, B:18:0x0041, B:20:0x004f, B:22:0x0053, B:24:0x0068, B:26:0x007a, B:28:0x0098, B:30:0x00a7, B:32:0x00b5, B:34:0x00bd, B:35:0x00c8, B:37:0x00fc, B:38:0x0108, B:40:0x0110, B:42:0x0125, B:45:0x0130, B:48:0x0141, B:50:0x0149, B:52:0x014f, B:54:0x0160, B:57:0x016b, B:59:0x0184, B:61:0x01a9, B:62:0x01b7, B:64:0x01bf, B:66:0x01d0, B:69:0x01d9, B:72:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x0211, B:79:0x023b, B:78:0x0235), top: B:88:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0019, B:14:0x002a, B:82:0x025b, B:18:0x0041, B:20:0x004f, B:22:0x0053, B:24:0x0068, B:26:0x007a, B:28:0x0098, B:30:0x00a7, B:32:0x00b5, B:34:0x00bd, B:35:0x00c8, B:37:0x00fc, B:38:0x0108, B:40:0x0110, B:42:0x0125, B:45:0x0130, B:48:0x0141, B:50:0x0149, B:52:0x014f, B:54:0x0160, B:57:0x016b, B:59:0x0184, B:61:0x01a9, B:62:0x01b7, B:64:0x01bf, B:66:0x01d0, B:69:0x01d9, B:72:0x01e9, B:74:0x01ef, B:75:0x01f2, B:77:0x0211, B:79:0x023b, B:78:0x0235), top: B:88:0x0005 }] */
    @Override // defpackage.joa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.jnz a(final defpackage.lss r19, final int r20, final boolean r21, defpackage.rwc r22) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnm.a(lss, int, boolean, rwc):jnz");
    }

    public final synchronized void c(jnl jnlVar) {
        jnlVar.b.a(jry.CANCELLED_EXTERNALLY);
        jnlVar.o.c();
        jnlVar.c.a();
        long jConvert = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.of(jnlVar.e, ChronoUnit.MICROS));
        Long lValueOf = Long.valueOf(jConvert);
        if (!jnlVar.p) {
            lValueOf.getClass();
            owq owqVar = this.r;
            if (jConvert >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
                owqVar.a(new Pair(lValueOf, true));
            }
        }
        ltd ltdVar = jnlVar.a;
    }

    public final void d(jnl jnlVar, Throwable th, jnk jnkVar) {
        ((sgt) ((sgt) a.c().i(th)).M(2893)).v("%s: Microvideo session failed", jnlVar.a);
        this.s.a();
        if (jnlVar.l.getAndSet(true)) {
            return;
        }
        boolean z = jnlVar.p;
        if (z) {
            jnlVar.n.a(new IllegalStateException("LongShot video failed!", th));
        } else {
            k(jnlVar, jnkVar);
        }
        ((mdo) jnkVar.c).p = j(jnlVar);
        if (z) {
            return;
        }
        long jConvert = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.of(jnlVar.e, ChronoUnit.MICROS));
        Long lValueOf = Long.valueOf(jConvert);
        lValueOf.getClass();
        owq owqVar = this.r;
        if (jConvert >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
            owqVar.a(new Pair(lValueOf, true));
        }
    }

    public final void e(jnl jnlVar, Throwable th, jnk jnkVar) {
        String strConcat;
        ltd ltdVar = jnlVar.a;
        if (jnlVar.l.getAndSet(true)) {
            ((sgt) a.c().M(2900)).s("Cancelling microvideo but result has been submitted already");
            return;
        }
        boolean z = jnlVar.p;
        if (z) {
            if (jnlVar.t.h()) {
                String strValueOf = String.valueOf(((jry) jnlVar.t.c()).name());
                jnlVar.k.b(new hhj(((jry) jnlVar.t.c()).i, th));
                strConcat = "LongShot Video Cancelled. Reason = ".concat(strValueOf);
            } else {
                jnlVar.k.b(new hhj(th));
                strConcat = "LongShot Video Cancelled.";
            }
            jnlVar.n.a(new CancellationException(strConcat));
        } else {
            k(jnlVar, jnkVar);
        }
        jnlVar.c.a();
        mdm mdmVar = jnkVar.c;
        tpc tpcVarM = srw.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        srw srwVar = (srw) tphVar;
        srwVar.b |= 16;
        srwVar.g = false;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        srw srwVar2 = (srw) tpcVarM.b;
        srwVar2.b |= 32;
        srwVar2.h = true;
        int iL = l(jnlVar.u);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        srw srwVar3 = (srw) tphVar2;
        srwVar3.i = iL - 1;
        srwVar3.b |= 64;
        int i = jnlVar.v;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        srw srwVar4 = (srw) tpcVarM.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        srwVar4.m = i2;
        srwVar4.b |= 512;
        if (jnlVar.t.h()) {
            int i3 = ((jry) jnlVar.t.c()).i;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srw srwVar5 = (srw) tpcVarM.b;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            srwVar5.n = i4;
            srwVar5.b |= 1024;
        }
        ((mdo) mdmVar).p = (srw) tpcVarM.l();
        if (z) {
            return;
        }
        long jConvert = DesugarTimeUnit.convert(TimeUnit.MILLISECONDS, Duration.of(jnlVar.e, ChronoUnit.MICROS));
        Long lValueOf = Long.valueOf(jConvert);
        lValueOf.getClass();
        owq owqVar = this.r;
        if (jConvert >= ((Long) ((Pair) owqVar.dL()).first).longValue()) {
            owqVar.a(new Pair(lValueOf, true));
        }
    }

    public final boolean g(boolean z) {
        if (!z) {
            return this.t.p(gzz.m);
        }
        gzi gziVar = gzz.a;
        return false;
    }

    public final void h(jnl jnlVar, jnk jnkVar, long j) {
        ltd ltdVar = jnlVar.a;
        rwc rwcVar = jnlVar.r;
        if (rwcVar.h()) {
            ((mdo) jnkVar.c).b = ((Long) rwcVar.c()).longValue();
        } else {
            ((sgt) a.c().M(2896)).v("No recording-end timestamp recorded for %s", ltdVar);
        }
        try {
            lsu lsuVar = jnlVar.c;
            pos posVar = lsuVar.b;
            if (jnlVar.l.getAndSet(true)) {
                throw new IllegalStateException("Trying to set final file but it has already been submitted.");
            }
            if (this.t.p(haa.S)) {
                this.k.a(posVar);
            }
            mdm mdmVar = jnkVar.c;
            mdmVar.d(posVar.a());
            szh szhVar = jnlVar.n;
            rnt.L(true ^ szhVar.isDone());
            ((mdo) mdmVar).p = i(jnlVar, System.currentTimeMillis());
            posVar.h("LS");
            lsuVar.b();
            mfo mfoVar = new mfo(ppo.f);
            TimeUnit.MICROSECONDS.toMillis(j);
            mfo mfoVar2 = jnkVar.a;
            mfoVar.a((ExifInterface) mfoVar2.b.f());
            mfoVar.c = mfoVar2.c;
            szhVar.e(mfoVar);
        } catch (Exception e) {
            d(jnlVar, e, jnkVar);
        }
    }
}
