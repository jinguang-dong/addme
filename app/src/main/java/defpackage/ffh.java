package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffh implements feu {
    private final ffk a;
    private rwc b;
    private rwc c;
    private final hbj d;

    public ffh(ffk ffkVar, hbj hbjVar) {
        rvk rvkVar = rvk.a;
        this.b = rvkVar;
        this.c = rvkVar;
        this.d = hbjVar;
        this.a = ffkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // defpackage.feu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.poe r10) {
        /*
            r9 = this;
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID
            java.lang.Object r0 = r10.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Ldc
            rwc r1 = r9.c
            boolean r1 = r1.h()
            if (r1 != 0) goto L14
            goto Ldc
        L14:
            rwc r1 = r9.b
            boolean r1 = r1.h()
            r2 = 0
            r3 = 2
            if (r1 == 0) goto L2c
            rwc r1 = r9.b
            java.lang.Object r1 = r1.c()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9e
        L2c:
            rwc r1 = defpackage.rwc.j(r0)
            r9.b = r1
            ffk r1 = r9.a
            rwc r4 = r9.c
            java.lang.Object r4 = r4.c()
            rwc r5 = defpackage.rwc.j(r0)
            r1.k = r5
            androidx.wear.ambient.AmbientDelegate r5 = r1.s
            java.lang.Object r6 = r5.a
            if (r6 != 0) goto L47
            goto L58
        L47:
            r7 = r4
            pjr r7 = (defpackage.pjr) r7
            java.lang.String r7 = defpackage.ffm.e(r7, r0)
            ffl r6 = (defpackage.ffl) r6
            java.lang.String r6 = r6.a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L9b
        L58:
            ffm r6 = r1.a
            pjr r4 = (defpackage.pjr) r4
            java.lang.String r0 = defpackage.ffm.e(r4, r0)
            mwq r4 = r6.d
            ffl r7 = new ffl
            java.lang.String r8 = ""
            owq r4 = r4.o(r0, r8)
            hbj r6 = r6.c
            r7.<init>(r0, r4, r6)
            java.lang.String r0 = r7.a
            r5.x(r7)
            r1.n = r3
            java.util.Map r4 = r1.e
            boolean r5 = r4.containsKey(r0)
            if (r5 != 0) goto L86
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>(r2)
            r4.put(r0, r5)
        L86:
            java.lang.Object r0 = r4.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1.i = r0
            owq r0 = r1.h
            ejt r4 = r1.u
            r4 = 15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.a(r4)
        L9b:
            r1.g()
        L9e:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r10 = r10.a(r0)
            java.lang.Integer r10 = (java.lang.Integer) r10
            rwc r10 = defpackage.rwc.i(r10)
            boolean r0 = r10.h()
            if (r0 == 0) goto Ldc
            ffk r9 = r9.a
            java.lang.Object r0 = r10.c()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 4
            r4 = 1
            if (r0 == r1) goto Lcc
            java.lang.Object r10 = r10.c()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r10 != r3) goto Lcd
        Lcc:
            r2 = r4
        Lcd:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r10.getClass()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            rwc r10 = defpackage.rwc.j(r10)
            r9.l = r10
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffh.a(poe):void");
    }

    @Override // defpackage.fev
    public final fes b() {
        return new ffg(this.d);
    }

    @Override // defpackage.fev
    public final void d(pjr pjrVar) {
        this.c = rwc.j(pjrVar);
        if (this.d.p(gyg.k)) {
            ffk ffkVar = this.a;
            ffkVar.i.set(0);
            for (AtomicInteger atomicInteger : ffkVar.e.values()) {
                atomicInteger.getClass();
                atomicInteger.set(0);
            }
            ffkVar.g();
        }
    }

    @Override // defpackage.fev
    public final void c() {
    }

    @Override // defpackage.fev
    public final void e(pjo pjoVar) {
    }

    @Override // defpackage.fev
    public final void f(fey feyVar) {
    }
}
