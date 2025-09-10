package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwl implements Executor, Closeable {
    public static final uwc a = new uwc("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final uma f;
    public final uvy g;
    public final uma h;
    public final ocq i;
    public final ocq j;
    private final uly k;

    public uwl(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.bE(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.bu(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.bE(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(mn.b(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.i = new ocq((short[]) null);
        this.j = new ocq((short[]) null);
        umc umcVar = umc.a;
        this.f = new uma(0L, umcVar);
        int i3 = i + 1;
        this.g = new uvy(i3 + i3);
        this.h = new uma(i << 42, umcVar);
        this.k = new uly(false, umcVar);
    }

    public static /* synthetic */ void e(uwl uwlVar, Runnable runnable, boolean z, int i) {
        uwlVar.a(runnable, false, z & ((i & 4) == 0));
    }

    public static final void f(uwp uwpVar) {
        try {
            uwpVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int g() {
        uvy uvyVar = this.g;
        synchronized (uvyVar) {
            if (d()) {
                return -1;
            }
            uma umaVar = this.h;
            long j = umaVar.b;
            int i = (int) (j & 2097151);
            int iN = ukc.n(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iN >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (umaVar.b & 2097151)) + 1;
            if (uvyVar.a(i2) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            uwk uwkVar = new uwk(this, i2);
            uvyVar.b(i2, uwkVar);
            if (i2 != ((int) (2097151 & umaVar.c()))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i3 = iN + 1;
            uwkVar.start();
            return i3;
        }
    }

    private final uwk h() {
        Thread threadCurrentThread = Thread.currentThread();
        uwk uwkVar = threadCurrentThread instanceof uwk ? (uwk) threadCurrentThread : null;
        if (uwkVar == null || !a.ao(uwkVar.c, this)) {
            return null;
        }
        return uwkVar;
    }

    private final boolean i(long j) {
        int iN = ukc.n(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0);
        int i = this.b;
        if (iN < i) {
            int iG = g();
            if (iG == 1) {
                if (i > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        uwk uwkVar;
        do {
            uma umaVar = this.f;
            while (true) {
                long j = umaVar.b;
                uwkVar = (uwk) this.g.a((int) (2097151 & j));
                if (uwkVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(uwkVar);
                    if (iK >= 0 && umaVar.d(j, (j2 & (-2097152)) | iK)) {
                        uwkVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    uwkVar = null;
                    break;
                }
            }
            if (uwkVar == null) {
                return false;
            }
        } while (!uwkVar.a.c(-1, 0));
        LockSupport.unpark(uwkVar);
        return true;
    }

    private static final int k(uwk uwkVar) {
        int i;
        do {
            Object obj = uwkVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            uwkVar = (uwk) obj;
            i = uwkVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        uwp uwqVar;
        int i;
        String str = uwr.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof uwp) {
            uwqVar = (uwp) runnable;
            uwqVar.g = jNanoTime;
            uwqVar.h = z;
        } else {
            uwqVar = new uwq(runnable, jNanoTime, z);
        }
        boolean z3 = uwqVar.h;
        long jA = z3 ? this.h.a(2097152L) : 0L;
        uwk uwkVarH = h();
        if (uwkVarH != null && (i = uwkVarH.d) != 5 && (uwqVar.h || i != 2)) {
            uwkVarH.b = true;
            hkk hkkVar = uwkVarH.e;
            if (z2) {
                uwqVar = hkkVar.c(uwqVar);
            } else {
                uwp uwpVar = (uwp) ((umb) hkkVar.a).a(uwqVar);
                uwqVar = uwpVar == null ? null : hkkVar.c(uwpVar);
            }
        }
        if (uwqVar != null) {
            if (!(uwqVar.h ? this.j.w(uwqVar) : this.i.w(uwqVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(uwk uwkVar, int i, int i2) {
        while (true) {
            uma umaVar = this.f;
            long j = umaVar.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(uwkVar) : i2;
            }
            if (iK >= 0 && umaVar.d(j, (j2 & (-2097152)) | iK)) {
                return;
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            uly r0 = r8.k
            boolean r0 = r0.b()
            if (r0 != 0) goto L9
            return
        L9:
            uwk r0 = r8.h()
            uvy r1 = r8.g
            monitor-enter(r1)
            uma r2 = r8.h     // Catch: java.lang.Throwable -> L9c
            long r2 = r2.b     // Catch: java.lang.Throwable -> L9c
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            monitor-exit(r1)
            int r1 = (int) r2
            r2 = 1
            if (r1 <= 0) goto L63
            r3 = r2
        L1e:
            uvy r4 = r8.g
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            uwk r4 = (defpackage.uwk) r4
            if (r4 == r0) goto L5e
        L2b:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3c
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2b
        L3c:
            boolean r5 = defpackage.unf.a
            hkk r4 = r4.e
            ocq r5 = r8.j
            java.lang.Object r6 = r4.a
            umb r6 = (defpackage.umb) r6
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            uwp r6 = (defpackage.uwp) r6
            if (r6 != 0) goto L50
            goto L53
        L50:
            r5.w(r6)
        L53:
            uwp r6 = r4.d()
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            r5.w(r6)
            goto L53
        L5e:
            if (r3 == r1) goto L63
            int r3 = r3 + 1
            goto L1e
        L63:
            ocq r3 = r8.j
            r3.v()
            ocq r4 = r8.i
            r4.v()
        L6d:
            if (r0 == 0) goto L75
            uwp r1 = r0.b(r2)
            if (r1 != 0) goto L98
        L75:
            java.lang.Object r1 = r4.u()
            uwp r1 = (defpackage.uwp) r1
            if (r1 != 0) goto L98
            java.lang.Object r1 = r3.u()
            uwp r1 = (defpackage.uwp) r1
            if (r1 != 0) goto L98
            if (r0 == 0) goto L8b
            r1 = 5
            r0.d(r1)
        L8b:
            boolean r0 = defpackage.unf.a
            uma r0 = r8.f
            r1 = 0
            r0.b = r1
            uma r8 = r8.h
            r8.b = r1
            return
        L98:
            f(r1)
            goto L6d
        L9c:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwl.close():void");
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e(this, runnable, false, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        uvy uvyVar = this.g;
        int length = uvyVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            uwk uwkVar = (uwk) uvyVar.a(i6);
            if (uwkVar != null) {
                hkk hkkVar = uwkVar.e;
                int iB = ((umb) hkkVar.a).a != null ? hkkVar.b() + 1 : hkkVar.b();
                int i7 = uwkVar.d;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    arrayList.add(iB + "c");
                    i++;
                } else if (i8 == 1) {
                    arrayList.add(iB + "b");
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iB > 0) {
                        arrayList.add(iB + "d");
                    }
                } else {
                    if (i8 != 4) {
                        throw new uet();
                    }
                    i5++;
                }
            }
        }
        uma umaVar = this.h;
        String str = this.e;
        long j = umaVar.b;
        String strB = ung.b(this);
        int i9 = this.b;
        int i10 = this.c;
        ocq ocqVar = this.i;
        ocq ocqVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + "@" + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ocqVar.t() + ", global blocking queue size = " + ocqVar2.t() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
