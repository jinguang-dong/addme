package defpackage;

import android.os.SystemClock;
import com.google.ar.core.ImageMetadata;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class flw {
    public static final sgv a = sgv.g("flw");
    public our d;
    private final owf h;
    private final owf i;
    public final tpc g = spf.a.m();
    public final flv b = new flv();
    public long c = 0;
    public boolean e = false;
    public lss f = null;

    public flw(owf owfVar, owf owfVar2) {
        this.h = owfVar;
        this.i = owfVar2;
    }

    private static soz o(mdq mdqVar) {
        tpc tpcVarM = soz.a.m();
        long millis = Duration.ofNanos(mdqVar.a).toMillis();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soz sozVar = (soz) tpcVarM.b;
        sozVar.b |= 1;
        sozVar.c = millis;
        long millis2 = Duration.ofNanos(mdqVar.c).toMillis();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soz sozVar2 = (soz) tpcVarM.b;
        sozVar2.b |= 2;
        sozVar2.d = millis2;
        return (soz) tpcVarM.l();
    }

    private static tpc p(fnp fnpVar) {
        tpc tpcVarM = spc.a.m();
        float fE = fnpVar.e();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar = (spc) tpcVarM.b;
        spcVar.b |= 1;
        spcVar.c = fE;
        float f = fnpVar.f();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar2 = (spc) tpcVarM.b;
        spcVar2.b |= 2;
        spcVar2.d = f;
        float fG = fnpVar.g();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar3 = (spc) tpcVarM.b;
        spcVar3.b |= 4;
        spcVar3.e = fG;
        float fB = fnpVar.b();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar4 = (spc) tpcVarM.b;
        spcVar4.b |= 8;
        spcVar4.f = fB;
        float fC = fnpVar.c();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar5 = (spc) tpcVarM.b;
        spcVar5.b |= 16;
        spcVar5.g = fC;
        float fD = fnpVar.d();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar6 = (spc) tpcVarM.b;
        spcVar6.b |= 32;
        spcVar6.h = fD;
        float fA = fnpVar.a();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spc spcVar7 = (spc) tpcVarM.b;
        spcVar7.b |= 64;
        spcVar7.i = fA;
        return tpcVarM;
    }

    public final synchronized void a(lss lssVar) {
        if (this.d != null) {
            ((sgt) a.b().M(267)).s("Session already started, skipping.");
            return;
        }
        this.f = lssVar;
        fne fneVar = (fne) this.i.dL();
        Optional optional = fneVar.b;
        tpc tpcVar = this.g;
        tpcVar.getClass();
        optional.ifPresent(new fio(tpcVar, 9));
        Optional optional2 = fneVar.c;
        tpcVar.getClass();
        optional2.ifPresent(new fio(tpcVar, 10));
        our ourVar = new our();
        ourVar.d(this.h.dK(new fbt(this, 17), sxo.a));
        this.d = ourVar;
    }

    public final synchronized void b(Optional optional) {
        optional.ifPresent(new fio(this, 8));
    }

    public final synchronized void c(Duration duration, fnp fnpVar, boolean z) {
        tpc tpcVar = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        spfVar.b |= 8;
        spfVar.f = jElapsedRealtime;
        long millis = duration.toMillis();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar3 = (spf) tpcVar.b;
        spfVar3.b |= 4096;
        spfVar3.o = millis;
        tpc tpcVarP = p(fnpVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar4 = (spf) tpcVar.b;
        spc spcVar = (spc) tpcVarP.l();
        spcVar.getClass();
        spfVar4.i = spcVar;
        spfVar4.b |= 64;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar5 = (spf) tpcVar.b;
        spfVar5.b |= 1024;
        spfVar5.m = z;
    }

    public final synchronized void d(Duration duration) {
        tpc tpcVar = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        spfVar.b |= 16384;
        spfVar.q = jElapsedRealtime;
        long millis = duration.toMillis();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar3 = (spf) tpcVar.b;
        spfVar3.b |= 32768;
        spfVar3.r = millis;
    }

    public final synchronized void e(mdq mdqVar) {
        tpc tpcVar = this.g;
        soz sozVarO = o(mdqVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        sozVarO.getClass();
        spfVar.u = sozVarO;
        spfVar.b |= 262144;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0028 A[PHI: r6
      0x0028: PHI (r6v5 int) = (r6v4 int), (r6v9 int) binds: [B:11:0x0019, B:15:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.tfn r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r6 = r6.d     // Catch: java.lang.Throwable -> L46
            r0 = 1
            if (r6 == r0) goto L44
            tpc r1 = r5.g     // Catch: java.lang.Throwable -> L46
            tph r2 = r1.b     // Catch: java.lang.Throwable -> L46
            r3 = r2
            spf r3 = (defpackage.spf) r3     // Catch: java.lang.Throwable -> L46
            int r3 = r3.b     // Catch: java.lang.Throwable -> L46
            r3 = r3 & 512(0x200, float:7.17E-43)
            if (r3 == 0) goto L14
            goto L44
        L14:
            int r3 = r6 + (-1)
            if (r6 == 0) goto L42
            r6 = 2
            if (r3 == r0) goto L28
            r4 = 3
            if (r3 == r6) goto L26
            r6 = 4
            if (r3 == r4) goto L28
            if (r3 == r6) goto L24
            goto L29
        L24:
            r0 = 5
            goto L29
        L26:
            r0 = r4
            goto L29
        L28:
            r0 = r6
        L29:
            boolean r6 = r2.C()     // Catch: java.lang.Throwable -> L46
            if (r6 != 0) goto L32
            r1.o()     // Catch: java.lang.Throwable -> L46
        L32:
            tph r6 = r1.b     // Catch: java.lang.Throwable -> L46
            spf r6 = (defpackage.spf) r6     // Catch: java.lang.Throwable -> L46
            int r0 = r0 + (-1)
            r6.l = r0     // Catch: java.lang.Throwable -> L46
            int r0 = r6.b     // Catch: java.lang.Throwable -> L46
            r0 = r0 | 512(0x200, float:7.17E-43)
            r6.b = r0     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            return
        L42:
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r5)
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flw.f(tfn):void");
    }

    public final synchronized void g(Duration duration, fnp fnpVar, boolean z) {
        tpc tpcVar = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        spfVar.b |= 32;
        spfVar.h = jElapsedRealtime;
        long millis = duration.toMillis();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar3 = (spf) tpcVar.b;
        spfVar3.b |= 8192;
        spfVar3.p = millis;
        tpc tpcVarP = p(fnpVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar4 = (spf) tpcVar.b;
        spc spcVar = (spc) tpcVarP.l();
        spcVar.getClass();
        spfVar4.j = spcVar;
        spfVar4.b |= 128;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar5 = (spf) tpcVar.b;
        spfVar5.b |= 2048;
        spfVar5.n = z;
    }

    public final synchronized void h(Duration duration, List list) {
        tpc tpcVar = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        spfVar.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        spfVar.s = jElapsedRealtime;
        long millis = duration.toMillis();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar3 = (spf) tpcVar.b;
        spfVar3.b |= 131072;
        spfVar3.t = millis;
        Iterable$EL.forEach(list, new fio(this, 11));
    }

    public final synchronized void i(mdq mdqVar) {
        tpc tpcVar = this.g;
        soz sozVarO = o(mdqVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        sozVarO.getClass();
        spfVar.v = sozVarO;
        spfVar.b |= ImageMetadata.LENS_APERTURE;
    }

    public final synchronized void j() {
        tpc tpcVar = this.g;
        if ((((spf) tpcVar.b).b & 4194304) != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spfVar.b |= 4194304;
        spfVar.z = jElapsedRealtime;
    }

    public final synchronized void k() {
        tpc tpcVar = this.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spf spfVar2 = spf.a;
        spfVar.b |= 4;
        spfVar.e = jElapsedRealtime;
    }

    public final synchronized void l() {
        tpc tpcVar = this.g;
        if ((((spf) tpcVar.b).b & 2) != 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spfVar.b |= 2;
        spfVar.d = jElapsedRealtime;
    }

    public final synchronized void m(spe speVar) {
        tpc tpcVar = this.g;
        tph tphVar = tpcVar.b;
        if ((((spf) tphVar).b & 1) != 0) {
            return;
        }
        if (!tphVar.C()) {
            tpcVar.o();
        }
        spf spfVar = (spf) tpcVar.b;
        spfVar.c = speVar.s;
        spfVar.b |= 1;
    }

    public final synchronized tpc n() {
        flv flvVar = this.b;
        if (flvVar.f < 2) {
            ((sgt) a.c().M(268)).s("At least two frames are required to compute frame statistics.");
            return soy.a.m();
        }
        tpc tpcVarM = soy.a.m();
        double d = flvVar.c;
        double d2 = flvVar.f;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        double d3 = d / d2;
        tph tphVar = tpcVarM.b;
        soy soyVar = (soy) tphVar;
        soyVar.b |= 1;
        soyVar.c = d3;
        long j = flvVar.f;
        long j2 = flvVar.d * j;
        long j3 = flvVar.c;
        long j4 = j3 * j3;
        long j5 = j * ((-1) + j);
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        soy soyVar2 = (soy) tpcVarM.b;
        soyVar2.b |= 2;
        soyVar2.d = (j2 - j4) / j5;
        tab tabVar = flvVar.e;
        long jLongValue = ((Long) tabVar.a(0.5d)).longValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soy soyVar3 = (soy) tpcVarM.b;
        soyVar3.b |= 4;
        soyVar3.e = jLongValue;
        long jLongValue2 = ((Long) tabVar.a(0.9d)).longValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soy soyVar4 = (soy) tpcVarM.b;
        soyVar4.b |= 8;
        soyVar4.f = jLongValue2;
        long jLongValue3 = ((Long) tabVar.a(0.95d)).longValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soy soyVar5 = (soy) tpcVarM.b;
        soyVar5.b |= 16;
        soyVar5.g = jLongValue3;
        long jLongValue4 = ((Long) tabVar.a(0.99d)).longValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        soy soyVar6 = (soy) tphVar2;
        soyVar6.b |= 32;
        soyVar6.h = jLongValue4;
        long j6 = flvVar.a;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        soy soyVar7 = (soy) tphVar3;
        soyVar7.b |= 64;
        soyVar7.i = j6;
        long j7 = flvVar.b;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        soy soyVar8 = (soy) tpcVarM.b;
        soyVar8.b |= 128;
        soyVar8.j = j7;
        return tpcVarM;
    }
}
