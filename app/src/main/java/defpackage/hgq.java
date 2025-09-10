package defpackage;

import android.app.Activity;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
class hgq implements hhc, jhh, jhc {
    private static final sgv a = sgv.g("hgq");
    private static final sbp b = sbp.o(nkw.PHOTO, nkw.VIDEO, nkw.VIDEO_INTENT, nkw.IMAGE_INTENT);
    private final WeakReference c;
    private final fql d;
    private final owq e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final mdy g;
    private final cxb h;

    public hgq(WeakReference weakReference, mdy mdyVar, fql fqlVar, owq owqVar, cxb cxbVar) {
        this.c = weakReference;
        this.g = mdyVar;
        this.d = fqlVar;
        this.e = owqVar;
        this.h = cxbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.pcm
    public final void c(Throwable th) {
        Exception exc = new Exception();
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1289)).s("Camera Hardware failure:");
        pbw pbwVar = pbw.CAMERA_OPEN_TIMEOUT;
        ArrayList arrayList = new ArrayList();
        hgx hgxVar = (hgx) th;
        arrayList.addAll(hgxVar.a);
        int i = sbp.d;
        this.g.t(12, null, exc, -1, -1, 0, arrayList, sex.a, hgxVar.b, false);
        i("Camera Hardware failure: One or more cameras may not have been enumerated", exc);
    }

    @Override // defpackage.pcm
    public final void d() {
        this.f.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Type inference failed for: r13v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r14v2, types: [sgt, shi] */
    @Override // defpackage.pcm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Throwable r14) {
        /*
            r13 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r14)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r1 = r14 instanceof defpackage.pcc
            pbw r2 = defpackage.pbw.CAMERA_ERROR_CODE_UNKNOWN
            hgp r3 = defpackage.hgp.UNKNOWN
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L68
            r1 = r14
            pcc r1 = (defpackage.pcc) r1
            pbw r2 = r1.a
            boolean r3 = r1.c
            if (r3 == 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r6 = r13.f
            boolean r6 = r6.get()
            if (r6 == 0) goto L26
            goto L34
        L26:
            sgv r13 = defpackage.hgq.a
            shi r13 = r13.c()
            java.lang.String r0 = "Camera open failure invoked while the camera is paused, camera had successfully opened before, ignoring."
            r1 = 1291(0x50b, float:1.809E-42)
            defpackage.mn.c(r0, r1, r13, r14)
            return
        L34:
            pjr r1 = r1.b
            boolean r6 = r1.c()
            if (r6 == 0) goto L41
            java.lang.String r1 = r1.a
            r9.add(r1)
        L41:
            boolean r1 = defpackage.pbw.e(r2)
            if (r1 == 0) goto L60
            owq r1 = r13.e
            sbp r6 = defpackage.hgq.b
            java.lang.Object r1 = r1.dL()
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L60
            cxb r1 = r13.h
            boolean r1 = r1.v()
            if (r1 == 0) goto L60
            hgp r1 = defpackage.hgp.DEVICE_FORWARDED
            goto L63
        L60:
            hgp r1 = defpackage.hgp.DEVICE_HANDLED
            r4 = r5
        L63:
            r10 = r2
            r11 = r3
            r12 = r4
            r3 = r1
            goto L8c
        L68:
            boolean r1 = r14 instanceof defpackage.hhd
            if (r1 == 0) goto L89
            r1 = r14
            hhd r1 = (defpackage.hhd) r1
            pbw r2 = r1.a
            pjr r3 = r1.b
            boolean r6 = r3.c()
            if (r6 == 0) goto L7e
            java.lang.String r3 = r3.a
            r9.add(r3)
        L7e:
            long r6 = r1.c
            r10 = 0
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 <= 0) goto L87
            r4 = r5
        L87:
            hgp r3 = defpackage.hgp.FALLBACK_HANDLED
        L89:
            r10 = r2
            r11 = r4
            r12 = r5
        L8c:
            mdy r1 = r13.g
            int r2 = defpackage.sbp.d
            sbp r8 = defpackage.sex.a
            java.lang.String r3 = r3.e
            r6 = -1
            r7 = 0
            r2 = 3
            r5 = -1
            r4 = r14
            r1.t(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r12 == 0) goto Lb2
            sgv r14 = defpackage.hgq.a
            shi r14 = r14.b()
            java.lang.String r1 = "Handling Camera Open Failure. Finishing activity."
            r2 = 1290(0x50a, float:1.808E-42)
            defpackage.mn.c(r1, r2, r14, r0)
            java.lang.String r14 = r10.c()
            r13.i(r14, r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgq.e(java.lang.Throwable):void");
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.f.set(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.hhi
    public final void f() {
        Exception exc = new Exception();
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1292)).s("Handling Camera Reconnect Failure:");
        int i = sbp.d;
        mdy mdyVar = this.g;
        sbp sbpVar = sex.a;
        mdyVar.t(4, null, exc, -1, -1, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
        i("Camera Reconnect Failure", exc);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.hhi
    public final void g() {
        Exception exc = new Exception();
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1293)).s("Handling Camera Access Failure:");
        int i = sbp.d;
        mdy mdyVar = this.g;
        sbp sbpVar = sex.a;
        mdyVar.t(1, null, exc, -1, -1, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
        i("Camera Access Failure", exc);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.hhk
    public final void h() {
        Exception exc = new Exception();
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1294)).s("Handling MediaRecorder Failure:");
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.CAMERA_FAILURE;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = soe.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        mdy mdyVar = this.g;
        tph tphVar = tpcVarM2.b;
        soe soeVar = (soe) tphVar;
        soeVar.c = 8;
        soeVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        String str = mdyVar.h;
        soe soeVar2 = (soe) tpcVarM2.b;
        str.getClass();
        soeVar2.b |= 4;
        soeVar2.e = str;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        soe soeVar3 = (soe) tpcVarM2.l();
        soeVar3.getClass();
        sodVar2.l = soeVar3;
        sodVar2.b |= 128;
        mdyVar.I(tpcVarM);
        i("There was a problem with the media recorder.", exc);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    protected final void i(String str, Exception exc) {
        Activity activity = (Activity) this.c.get();
        if (activity != null && !activity.isFinishing()) {
            ((sgt) ((sgt) a.b().i(exc)).M((char) 1286)).v("Activity received a fatal error. Finishing activity: %s", str);
            activity.finish();
        }
        fql fqlVar = this.d;
        synchronized (fqlVar) {
            Iterator it = fqlVar.iterator();
            while (it.hasNext()) {
                ((fqk) it.next()).a(exc);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.hhi
    public final void a() {
        Exception exc = new Exception();
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1288)).s("Handling Camera Disabled Failure:");
        int i = sbp.d;
        mdy mdyVar = this.g;
        sbp sbpVar = sex.a;
        mdyVar.t(2, null, exc, -1, -1, 0, sbpVar, sbpVar, pbw.CAMERA_ERROR_CODE_UNKNOWN, false);
        i(uCzt.TZbD, exc);
    }
}
