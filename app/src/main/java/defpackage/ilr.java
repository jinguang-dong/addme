package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ilr {
    public static final sgv a = sgv.g("ilr");
    public final ilo b;
    public final ils c;
    public final Queue d = new LinkedList();
    public final Object e = new Object();
    private Thread m = null;
    private Thread n = null;
    public int f = -1;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public int k = 0;
    public int l = 0;

    public ilr(ilo iloVar, ils ilsVar) {
        this.b = iloVar;
        this.c = ilsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r1v9, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r4v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v5, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Thread r0 = r8.n     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lbd
            java.lang.Thread r0 = r8.m     // Catch: java.lang.Throwable -> Ld2
            if (r0 != 0) goto Lb
            goto Lbd
        Lb:
            ilo r0 = r8.b     // Catch: java.lang.Throwable -> Ld2
            r0.b()     // Catch: java.lang.Throwable -> Ld2
            r0 = 1
            r8.g = r0     // Catch: java.lang.Throwable -> Ld2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread r3 = r8.m     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> Ld2
            r3.join(r1)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> Ld2
            goto L29
        L1b:
            r3 = move-exception
            sgv r4 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r4 = r4.b()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "Failed to stop drainer"
            r6 = 2136(0x858, float:2.993E-42)
            defpackage.mn.c(r5, r6, r4, r3)     // Catch: java.lang.Throwable -> Ld2
        L29:
            r3 = 0
            r8.i = r3     // Catch: java.lang.Throwable -> Ld2
            java.lang.Thread r4 = r8.m     // Catch: java.lang.Throwable -> Ld2
            boolean r4 = r4.isAlive()     // Catch: java.lang.Throwable -> Ld2
            if (r4 == 0) goto L5b
            sgv r4 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r4 = r4.b()     // Catch: java.lang.Throwable -> Ld2
            r5 = 2134(0x856, float:2.99E-42)
            shi r4 = r4.M(r5)     // Catch: java.lang.Throwable -> Ld2
            sgt r4 = (defpackage.sgt) r4     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r5 = "Stopping drainer timed out, forcing stop"
            r4.s(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Thread r4 = r8.m     // Catch: java.lang.InterruptedException -> L4d java.lang.Throwable -> Ld2
            r4.join()     // Catch: java.lang.InterruptedException -> L4d java.lang.Throwable -> Ld2
            goto L5b
        L4d:
            r4 = move-exception
            sgv r5 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r5 = r5.b()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r6 = "Failed to stop drainer"
            r7 = 2135(0x857, float:2.992E-42)
            defpackage.mn.c(r6, r7, r5, r4)     // Catch: java.lang.Throwable -> Ld2
        L5b:
            r4 = 0
            r8.m = r4     // Catch: java.lang.Throwable -> Ld2
            r8.h = r0     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r0 = r8.e     // Catch: java.lang.Throwable -> Ld2
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Ld2
            r0.notifyAll()     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            java.lang.Thread r0 = r8.n     // Catch: java.lang.InterruptedException -> L6d java.lang.Throwable -> Ld2
            r0.join(r1)     // Catch: java.lang.InterruptedException -> L6d java.lang.Throwable -> Ld2
            goto L7b
        L6d:
            r0 = move-exception
            sgv r1 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r1 = r1.b()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "Failed to stop writer thread"
            r5 = 2139(0x85b, float:2.997E-42)
            defpackage.mn.c(r2, r5, r1, r0)     // Catch: java.lang.Throwable -> Ld2
        L7b:
            r8.j = r3     // Catch: java.lang.Throwable -> Ld2
            java.lang.Thread r0 = r8.n     // Catch: java.lang.Throwable -> Ld2
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto Lac
            sgv r0 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r0 = r0.b()     // Catch: java.lang.Throwable -> Ld2
            r1 = 2137(0x859, float:2.995E-42)
            shi r0 = r0.M(r1)     // Catch: java.lang.Throwable -> Ld2
            sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r1 = "Stopping writer timed out, forcing stop"
            r0.s(r1)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Thread r0 = r8.n     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> Ld2
            r0.join()     // Catch: java.lang.InterruptedException -> L9e java.lang.Throwable -> Ld2
            goto Lac
        L9e:
            r0 = move-exception
            sgv r1 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r1 = r1.b()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "Failed to stop drainer"
            r3 = 2138(0x85a, float:2.996E-42)
            defpackage.mn.c(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> Ld2
        Lac:
            r8.n = r4     // Catch: java.lang.Throwable -> Ld2
            ils r0 = r8.c     // Catch: java.lang.Throwable -> Ld2
            r0.b()     // Catch: java.lang.Throwable -> Ld2
            ilo r0 = r8.b     // Catch: java.lang.Throwable -> Ld2
            r0.c()     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r8)
            return
        Lba:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            throw r1     // Catch: java.lang.Throwable -> Ld2
        Lbd:
            sgv r0 = defpackage.ilr.a     // Catch: java.lang.Throwable -> Ld2
            shi r0 = r0.b()     // Catch: java.lang.Throwable -> Ld2
            r1 = 2133(0x855, float:2.989E-42)
            shi r0 = r0.M(r1)     // Catch: java.lang.Throwable -> Ld2
            sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r1 = "stop called more than once!"
            r0.s(r1)     // Catch: java.lang.Throwable -> Ld2
            monitor-exit(r8)
            return
        Ld2:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilr.a():void");
    }

    public final synchronized boolean b() {
        if (this.n == null && this.m == null) {
            this.f = -1;
            this.g = false;
            this.h = false;
            this.i = true;
            this.j = true;
            this.k = 0;
            this.l = 0;
            if (!this.b.d()) {
                ((sgt) a.b().M(2132)).s("Failed to start the encoder.");
                return false;
            }
            ilp ilpVar = new ilp(this);
            this.n = ilpVar;
            ilpVar.start();
            ilq ilqVar = new ilq(this);
            this.m = ilqVar;
            ilqVar.start();
            return true;
        }
        ((sgt) a.b().M(2131)).s("start called more than once!");
        return true;
    }
}
