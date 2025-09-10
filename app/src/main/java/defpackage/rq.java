package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rq extends CameraDevice.StateCallback {
    public final String a;
    public final CountDownLatch b;
    public final utl c;
    private final int d;
    private final long e;
    private final int f;
    private final Object g;
    private boolean h;
    private rp i;
    private final long j;
    private vi k;
    private final sm l;
    private final rnn m;
    private final qrh n;
    private final byz o;
    private final byz p;

    public rq(String str, sm smVar, int i, long j, byz byzVar, byz byzVar2, qrh qrhVar, rnn rnnVar) {
        str.getClass();
        smVar.getClass();
        byzVar2.getClass();
        rnnVar.getClass();
        this.a = str;
        this.l = smVar;
        this.d = i;
        this.e = j;
        this.o = byzVar;
        this.p = byzVar2;
        this.n = qrhVar;
        this.m = rnnVar;
        this.f = ur.b.b();
        this.g = new Object();
        this.b = new CountDownLatch(1);
        this.c = utm.a(th.a);
        Objects.toString(pp.a(str));
        this.j = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    private final tc d(rp rpVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        vi viVar = this.k;
        uz uzVar = viVar != null ? new uz(viVar.a - this.e) : null;
        uz uzVar2 = viVar != null ? new uz(viVar.a - this.j) : null;
        long j = rpVar.a;
        return new tc(this.a, rpVar.d, Integer.valueOf(this.d - 1), uzVar, rpVar.c, uzVar2, viVar == null ? null : new uz(j - viVar.a), new uz(jElapsedRealtimeNanos - j), rpVar.b);
    }

    private static final void e(String str) {
        str.getClass();
    }

    public final void a() {
        Object objC;
        byi byiVar = (byi) this.c.c();
        pk pkVar = null;
        byte b = 0;
        ta taVar = byiVar instanceof te ? ((te) byiVar).a : null;
        if (taVar != null) {
            int i = ukb.a;
            objC = taVar.c(new uji(CameraDevice.class));
        } else {
            objC = null;
        }
        b((CameraDevice) objC, new rp(1, pkVar, b == true ? 1 : 0, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.hardware.camera2.CameraDevice r7, defpackage.rp r8) {
        /*
            r6 = this;
            utl r0 = r6.c
            java.lang.Object r0 = r0.c()
            byi r0 = (defpackage.byi) r0
            boolean r1 = r0 instanceof defpackage.te
            r2 = 0
            if (r1 == 0) goto L12
            te r0 = (defpackage.te) r0
            ta r0 = r0.a
            goto L13
        L12:
            r0 = r2
        L13:
            java.lang.Object r1 = r6.g
            monitor-enter(r1)
            rp r3 = r6.i     // Catch: java.lang.Throwable -> L5d
            if (r3 != 0) goto L20
            r6.i = r8     // Catch: java.lang.Throwable -> L5d
            boolean r3 = r6.h     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L21
        L20:
            r8 = r2
        L21:
            monitor-exit(r1)
            if (r8 == 0) goto L5c
            pk r1 = r8.b
            if (r1 == 0) goto L37
            int r2 = r8.d
            r3 = 6
            if (r2 == r3) goto L37
            byz r2 = r6.o
            java.lang.String r3 = r6.a
            int r4 = r1.a
            r5 = 0
            r2.s(r3, r4, r5)
        L37:
            utl r2 = r6.c
            td r3 = new td
            r3.<init>(r1)
            r2.e(r3)
            int r1 = r8.d
            r3 = 3
            if (r1 == r3) goto L55
            java.lang.String r1 = r6.a
            e(r1)
            byz r3 = r6.p
            rnn r4 = r6.m
            r1.getClass()
            r3.u(r0, r7, r6, r4)
        L55:
            tc r6 = r6.d(r8)
            r2.e(r6)
        L5c:
            return
        L5d:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq.b(android.hardware.camera2.CameraDevice, rp):void");
    }

    public final void c(CameraDevice cameraDevice) {
        String strA = pp.a(this.a);
        Objects.toString(strA);
        Trace.beginSection(strA.concat("#onFinalized"));
        toString();
        b(cameraDevice, new rp(3, null, 0 == true ? 1 : 0, 14));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!a.ao(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        Objects.toString(pp.a(str));
        this.b.countDown();
        synchronized (this.g) {
        }
        c(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!a.ao(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        String strA = pp.a(str);
        Objects.toString(strA);
        Trace.beginSection(strA.concat("#onDisconnected"));
        Objects.toString(pp.a(str));
        this.b.countDown();
        b(cameraDevice, new rp(4, new pk(6), null, 10));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!a.ao(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        Trace.beginSection(((Object) pp.a(str)) + "#onError-" + i);
        Objects.toString(pp.a(str));
        this.b.countDown();
        int i2 = 1;
        int i3 = 5;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException(a.bv(i, "Unexpected StateCallback error code: "));
                        }
                        i2 = 5;
                    }
                }
            }
        }
        b(cameraDevice, new rp(i3, new pk(i2), null, 10));
        Trace.endSection();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Set] */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        rp rpVar;
        rp rpVar2;
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!a.ao(id, str)) {
            throw new IllegalStateException("Check failed.");
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.k = new vi(jElapsedRealtimeNanos);
        String strA = pp.a(str);
        Objects.toString(strA);
        Trace.beginSection(strA.concat("#onOpened"));
        long j = jElapsedRealtimeNanos - this.j;
        long j2 = jElapsedRealtimeNanos - this.e;
        double d = j;
        if (this.d == 1) {
            Objects.toString(pp.a(str));
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1)).getClass();
        } else {
            Objects.toString(pp.a(str));
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1)).getClass();
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)).getClass();
        }
        synchronized (this.g) {
            rpVar = this.i;
            if (rpVar == null) {
                this.h = true;
            }
        }
        if (rpVar != null) {
            byz byzVar = this.p;
            rnn rnnVar = this.m;
            String str2 = this.a;
            e(str2);
            str2.getClass();
            byzVar.u(null, cameraDevice, this, rnnVar);
            return;
        }
        rm rmVar = new rm(this.l, cameraDevice, this.a, this.o, this.n);
        rnn rnnVar2 = this.m;
        synchronized (rnnVar2.d) {
            rnnVar2.b.add(rmVar);
            rmVar.e(rnnVar2.e());
        }
        this.c.e(new te(rmVar));
        synchronized (this.g) {
            this.h = false;
            rpVar2 = this.i;
        }
        if (rpVar2 != null) {
            utl utlVar = this.c;
            utlVar.e(new td(rpVar2.b));
            byz byzVar2 = this.p;
            rnn rnnVar3 = this.m;
            String str3 = this.a;
            e(str3);
            str3.getClass();
            byzVar2.u(rmVar, cameraDevice, this, rnnVar3);
            utlVar.e(d(rpVar2));
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.f;
    }
}
