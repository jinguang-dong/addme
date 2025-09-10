package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhj {
    public final mdy a;
    private boolean b;
    private boolean c;
    private long d = -1;
    private long e = -1;

    public fhj(mdy mdyVar) {
        this.a = mdyVar;
    }

    public final synchronized snw a() {
        tpc tpcVarM;
        shl shlVar = shx.a;
        tpcVarM = snw.a.m();
        boolean z = this.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        snw snwVar = (snw) tphVar;
        snwVar.b |= 1;
        snwVar.c = z;
        boolean z2 = this.c;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        snw snwVar2 = (snw) tphVar2;
        snwVar2.b |= 2;
        snwVar2.d = z2;
        long j = this.c ? 0L : this.e;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        snw snwVar3 = (snw) tpcVarM.b;
        snwVar3.b |= 4;
        snwVar3.e = j;
        return (snw) tpcVarM.l();
    }

    public final synchronized void b() {
        this.b = true;
        this.d = SystemClock.elapsedRealtime();
    }

    public final synchronized void c() {
        if (this.b) {
            this.b = false;
            mdy mdyVar = this.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.d;
            long j2 = jElapsedRealtime - j;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.BOBA_ACTIVE_SESSION_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = snv.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            snv snvVar = (snv) tphVar;
            snvVar.b |= 1;
            snvVar.c = j;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            snv snvVar2 = (snv) tphVar2;
            snvVar2.b |= 2;
            snvVar2.d = jElapsedRealtime;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            snv snvVar3 = (snv) tpcVarM2.b;
            snvVar3.b |= 4;
            snvVar3.e = j2;
            snv snvVar4 = (snv) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            snvVar4.getClass();
            sodVar2.aB = snvVar4;
            sodVar2.d |= 536870912;
            mdyVar.I(tpcVarM);
            this.d = jElapsedRealtime;
        }
    }

    public final synchronized void d() {
        if (this.c) {
            this.c = false;
            mdy mdyVar = this.a;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.e;
            long j2 = jElapsedRealtime - j;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.BOBA_PEARL_ACTIVE_SESSION_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = snx.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            snx snxVar = (snx) tphVar;
            snxVar.b |= 1;
            snxVar.c = j;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            snx snxVar2 = (snx) tphVar2;
            snxVar2.b |= 2;
            snxVar2.d = jElapsedRealtime;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            snx snxVar3 = (snx) tpcVarM2.b;
            snxVar3.b |= 4;
            snxVar3.e = j2;
            snx snxVar4 = (snx) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            snxVar4.getClass();
            sodVar2.aC = snxVar4;
            sodVar2.d |= 1073741824;
            mdyVar.I(tpcVarM);
            this.e = jElapsedRealtime;
        }
    }

    public final synchronized void e() {
        this.c = true;
        this.e = SystemClock.elapsedRealtime();
    }
}
