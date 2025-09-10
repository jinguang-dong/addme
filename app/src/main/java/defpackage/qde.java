package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qde implements rdi {
    public final pvg a;
    private final Context b;
    private final qbv c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public qde(Context context, qbv qbvVar, pvg pvgVar) {
        this.b = context;
        this.c = qbvVar;
        this.a = pvgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.rdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r5) {
        /*
            r4 = this;
            java.lang.String r0 = "NetworkUsageMonitor"
            android.content.Context r1 = r4.b
            r2 = 0
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.SecurityException -> Le
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.SecurityException -> Le
            goto L14
        Le:
            java.lang.String r1 = "%s: Couldn't retrieve ConnectivityManager."
            defpackage.qbu.c(r1, r0)
            r1 = r2
        L14:
            if (r1 != 0) goto L17
            goto L1b
        L17:
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L1b:
            if (r2 != 0) goto L23
            java.lang.String r1 = "%s: Fail to get network type "
            defpackage.qbu.c(r1, r0)
            goto L40
        L23:
            int r0 = r2.getType()
            r1 = 1
            if (r0 == r1) goto L40
            int r0 = r2.getType()
            r1 = 9
            if (r0 == r1) goto L40
            int r0 = r2.getType()
            r1 = 17
            if (r0 == r1) goto L40
            java.util.concurrent.atomic.AtomicLong r0 = r4.e
            r0.getAndAdd(r5)
            goto L45
        L40:
            java.util.concurrent.atomic.AtomicLong r0 = r4.d
            r0.getAndAdd(r5)
        L45:
            pvg r5 = r4.a
            pvl r5 = r5.c
            if (r5 != 0) goto L4d
            pvl r5 = defpackage.pvl.a
        L4d:
            java.lang.String r5 = r5.c
            java.util.concurrent.atomic.AtomicLong r5 = r4.d
            r5.get()
            java.util.concurrent.atomic.AtomicLong r4 = r4.e
            r4.get()
            int r4 = defpackage.qbu.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qde.a(long):void");
    }

    @Override // defpackage.rdi
    public final void b() {
        pvg pvgVar = this.a;
        tpc tpcVar = (tpc) pvgVar.a(5, null);
        tpcVar.r(pvgVar);
        long andSet = this.e.getAndSet(0L);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvg pvgVar2 = (pvg) tpcVar.b;
        pvg pvgVar3 = pvg.a;
        pvgVar2.b |= 16;
        pvgVar2.g = andSet;
        long andSet2 = this.d.getAndSet(0L);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        qbv qbvVar = this.c;
        pvg pvgVar4 = (pvg) tpcVar.b;
        pvgVar4.b |= 32;
        pvgVar4.h = andSet2;
        qsz.o(qbvVar.e((pvg) tpcVar.l()), new fxw(this, 17), sxo.a);
    }
}
