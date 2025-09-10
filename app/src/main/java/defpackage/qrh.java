package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Handler;
import android.util.Size;
import android.widget.TextView;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qrh {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public qrh(ggx ggxVar, luw luwVar, glf glfVar, owf owfVar, owf owfVar2, hbj hbjVar, luj lujVar) {
        this.d = ggxVar;
        this.b = luwVar;
        this.a = glfVar;
        this.e = owfVar;
        this.c = owfVar2;
        this.f = hbjVar;
        this.g = lujVar;
    }

    public static final void i(nni nniVar, ocq ocqVar) {
        double d;
        double dA = nni.a(nniVar, nniVar);
        double dSqrt = Math.sqrt(dA);
        double dCos = 0.5d;
        if (dA < 1.0E-8d) {
            d = 1.0d - (dA * 0.1666666716337204d);
        } else if (dA < 1.0E-6d) {
            double d2 = 0.1666666716337204d * dA;
            dCos = 0.5d - (dA * 0.0416666679084301d);
            d = 1.0d - (d2 * (1.0d - d2));
        } else {
            double d3 = 1.0d / dSqrt;
            double dSin = Math.sin(dSqrt) * d3;
            dCos = (1.0d - Math.cos(dSqrt)) * d3 * d3;
            d = dSin;
        }
        double d4 = nniVar.a;
        double d5 = d4 * d4;
        double d6 = nniVar.b;
        double d7 = d6 * d6;
        double d8 = nniVar.c;
        double d9 = d8 * d8;
        ocqVar.e(0, 0, 1.0d - ((d7 + d9) * dCos));
        ocqVar.e(1, 1, 1.0d - ((d9 + d5) * dCos));
        ocqVar.e(2, 2, 1.0d - ((d5 + d7) * dCos));
        double d10 = nniVar.c * d;
        double d11 = nniVar.a * nniVar.b * dCos;
        ocqVar.e(0, 1, d11 - d10);
        ocqVar.e(1, 0, d11 + d10);
        double d12 = nniVar.b * d;
        double d13 = nniVar.a * nniVar.c * dCos;
        ocqVar.e(0, 2, d13 + d12);
        ocqVar.e(2, 0, d13 - d12);
        double d14 = d * nniVar.a;
        double d15 = dCos * nniVar.b * nniVar.c;
        ocqVar.e(1, 2, d15 - d14);
        ocqVar.e(2, 1, d15 + d14);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, pjo] */
    public final pif a(pjr pjrVar, poo pooVar, peg pegVar, rwc rwcVar, boolean z, int i, rwc rwcVar2) {
        byte b;
        pia piaVar;
        int iB = pooVar.b();
        pas pasVar = new pas(pooVar.d(), pooVar.a());
        our ourVar = new our();
        String strAF = qpt.aF(iB, pasVar.a, pasVar.b);
        pbc pbcVarA = this.e.a(strAF);
        Handler handler = (Handler) rwcVar2.d(new kpm(ourVar, strAF, i, 2));
        boolean z2 = ((pnp) this.c).c;
        boolean zH = rwcVar.h();
        ?? r7 = this.b;
        int iIntValue = ((Integer) r7.n(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
        ourVar.d(pooVar);
        if (iIntValue != 1) {
            b = 2;
            pbcVarA.f("Using fuzzy timestamp matching.");
            piaVar = new pia(0L, 8333333L);
        } else if (zH && rwcVar.h() && (((Long) rwcVar.c()).longValue() & 65536) != 0) {
            long jA = ((pqn) this.f).a(0L);
            b = 2;
            pbcVarA.f(mn.b(jA, "Using fuzzy timestamp matching with an initial offset of: ", "ns"));
            piaVar = new pia(jA, 8333333L);
        } else {
            b = 2;
            pbcVarA.f("Using exact timestamp matching.");
            piaVar = new pia(0L, 0L);
        }
        pia piaVar2 = piaVar;
        long jAx = qpt.ax(iB, pasVar);
        if (jAx <= 0 || !z) {
            pbcVarA.f("Skipping memory reservation.");
        } else if (r7.h(iB, pasVar) < 67000000) {
            int iMin = (int) Math.min(8L, Math.max(((Byte) this.b.n(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, Byte.valueOf(b))).byteValue(), 2L));
            pmg pmgVar = (pmg) this.d;
            long jA2 = pmgVar.a() / 2;
            Locale locale = Locale.ROOT;
            int i2 = (int) (jA2 / jAx);
            if (iMin > i2) {
                iMin = i2;
            }
            long j = iMin * jAx;
            pbcVarA.f(String.format(locale, "Reserved %6.2f MiB(%6.2f MiB/image * %s) to estimate HAL memory usage.", Double.valueOf(j / 1048576.0d), Double.valueOf(jAx / 1048576.0d), Integer.valueOf(iMin)));
            pmf pmfVarD = pmgVar.d(j);
            if (pmfVarD != null) {
                ourVar.d(pmfVarD);
            }
        }
        final pif pifVar = new pif(pjrVar, pooVar, ourVar, new oup(handler), pbcVarA, this.a, (mwq) this.g, pegVar, piaVar2);
        pooVar.i(new pon() { // from class: pie
            @Override // defpackage.pon
            public final void eS() {
                pifVar.a("distribute:onImageAvailable");
            }
        }, handler);
        return pifVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized paq b(Runnable runnable) {
        this.d.add(runnable);
        return new pme(this, runnable, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    public final void d() {
        sbp sbpVarJ;
        synchronized (this) {
            sbpVarJ = sbp.j(this.d);
        }
        if (sbpVarJ.isEmpty()) {
            return;
        }
        int size = sbpVarJ.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) sbpVarJ.get(i)).run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uem] */
    public final kze e() {
        hzs hzsVar = (hzs) this.f.a();
        hzsVar.getClass();
        kxv kxvVar = (kxv) this.e.a();
        kxvVar.getClass();
        pbn pbnVar = (pbn) this.b.a();
        pbnVar.getClass();
        lfc lfcVar = (lfc) this.g.a();
        lfcVar.getClass();
        lcu lcuVar = (lcu) this.a.a();
        lcuVar.getClass();
        pfu pfuVar = (pfu) this.d.a();
        pfuVar.getClass();
        ExecutorService executorService = (ExecutorService) this.c.a();
        executorService.getClass();
        return new kze(hzsVar, kxvVar, pbnVar, lfcVar, lcuVar, pfuVar, executorService);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, owq] */
    public final void f() {
        this.f.a(0);
        ?? r0 = this.e;
        Float fValueOf = Float.valueOf(-1.0f);
        r0.a(fValueOf);
        this.c.a(fValueOf);
        this.a.a(fValueOf);
        this.g.a(fValueOf);
        this.d.a(false);
        this.b.a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 < (-2.86f)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (r7 < (-2.86f)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        return defpackage.hya.ON;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hzs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, pbc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hya g(defpackage.poj r7, defpackage.poe r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.g
            java.lang.Object r0 = r0.dL()
            kpa r0 = (defpackage.kpa) r0
            java.lang.Object r1 = r6.a
            our r1 = (defpackage.our) r1
            boolean r1 = r1.b()
            if (r1 != 0) goto Lbc
            kpa r1 = defpackage.kpa.c
            if (r0 != r1) goto L18
            goto Lbc
        L18:
            android.hardware.camera2.CaptureResult$Key r0 = defpackage.nvk.a
            r1 = -1070134723(0xffffffffc0370a3d, float:-2.86)
            r2 = -998653952(0xffffffffc479c000, float:-999.0)
            r3 = 1124859904(0x430c0000, float:140.0)
            if (r0 == 0) goto L54
            java.lang.Object r4 = r6.d
            nkw r5 = defpackage.nkw.TIME_LAPSE
            if (r4 == r5) goto L54
            java.lang.Object r0 = r8.a(r0)
            float[] r0 = (float[]) r0
            if (r0 == 0) goto L54
            int r4 = r0.length
            r5 = 13
            if (r4 < r5) goto L54
            r7 = 12
            r7 = r0[r7]
            r8 = 6
            r8 = r0[r8]
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L4b
            java.lang.Object r6 = r6.b
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r6.a(r0)
        L4b:
            int r6 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r6 <= 0) goto Lbc
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 >= 0) goto Lbc
            goto Laf
        L54:
            if (r7 != 0) goto L60
            java.lang.Object r6 = r6.e
            java.lang.String r7 = "Could not determine flash decision from metadata only and no rawImage was provided"
            r6.d(r7)
            hya r6 = defpackage.hya.UNKNOWN
            return r6
        L60:
            pas r0 = new pas
            int r4 = r7.c()
            int r5 = r7.b()
            r0.<init>(r4, r5)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = r6.c
            ibb r5 = (defpackage.ibb) r5
            boolean r5 = r5.i()
            iap r7 = r4.d(r7, r8, r5, r0)
            if (r7 == 0) goto Lb2
            j$.util.Optional r8 = r7.a
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L86
            goto Lb2
        L86:
            float r8 = r7.e
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 < 0) goto Lbc
            com.google.googlex.gcam.AeResults r7 = r4.e(r7)
            long r3 = r7.a
            boolean r8 = com.google.googlex.gcam.GcamModuleJNI.AeResults_Check(r3, r7)
            if (r8 == 0) goto Lbc
            long r3 = r7.a
            float r7 = com.google.googlex.gcam.GcamModuleJNI.AeResults_LogSceneBrightness(r3, r7)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 == 0) goto Lab
            java.lang.Object r6 = r6.b
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            r6.a(r8)
        Lab:
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 >= 0) goto Lbc
        Laf:
            hya r6 = defpackage.hya.ON
            return r6
        Lb2:
            java.lang.Object r6 = r6.e
            java.lang.String r7 = "AE failed due to incomplete viewfinder frame. Out of memory?"
            r6.d(r7)
            hya r6 = defpackage.hya.UNKNOWN
            return r6
        Lbc:
            hya r6 = defpackage.hya.OFF
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrh.g(poj, poe):hya");
    }

    public final void h(nni nniVar, nni nniVar2, ocq ocqVar) {
        ocqVar.h();
        nni nniVar3 = (nni) this.b;
        nni.c(nniVar, nniVar2, nniVar3);
        if (nniVar3.b() == 0.0d) {
            return;
        }
        nni nniVar4 = (nni) this.a;
        nniVar4.f(nniVar);
        nni nniVar5 = (nni) this.g;
        nniVar5.f(nniVar2);
        nniVar3.d();
        nniVar4.d();
        nniVar5.d();
        ocq ocqVar2 = (ocq) this.f;
        ocqVar2.g(0, nniVar4);
        ocqVar2.g(1, nniVar3);
        nni nniVar6 = (nni) this.e;
        nni.c(nniVar3, nniVar4, nniVar6);
        ocqVar2.g(2, nniVar6);
        ocq ocqVar3 = (ocq) this.c;
        ocqVar3.g(0, nniVar5);
        ocqVar3.g(1, nniVar3);
        nni.c(nniVar3, nniVar5, nniVar6);
        ocqVar3.g(2, nniVar6);
        double[] dArr = (double[]) ocqVar2.a;
        double d = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d;
        double d2 = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d2;
        double d3 = dArr[5];
        dArr[5] = dArr[7];
        dArr[7] = d3;
        ocq.l(ocqVar3, ocqVar2, ocqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pbc] */
    public final void j(gpa gpaVar, int i, int i2, final int i3) throws Resources.NotFoundException {
        dv dvVarB;
        ?? r0 = this.e;
        r0.b(gpaVar.toString());
        int iB = ezh.B(gpaVar, i, i2);
        final int i4 = 3;
        final int i5 = 0;
        if (iB == 4) {
            final gtm gtmVar = (gtm) this.d;
            Context context = (Context) gtmVar.d;
            rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
            TextView textViewY = ezh.y(context);
            textViewY.setText(R.string.camera_issue_contact_message);
            rkcVar.t(context.getResources().getString(R.string.camera_issue_title));
            rkcVar.u(textViewY);
            rkcVar.k(false);
            final int i6 = 2;
            rkcVar.n(R.string.camera_fallback_close_app, new DialogInterface.OnClickListener() { // from class: gnu
                /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, pbc] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    int i8 = i6;
                    if (i8 == 0) {
                        int i9 = i3;
                        gtm gtmVar2 = gtmVar;
                        gtmVar2.e(5, i9);
                        dialogInterface.dismiss();
                        ((feb) gtmVar2.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 1) {
                        int i10 = i3;
                        gtm gtmVar3 = gtmVar;
                        gtmVar3.e(3, i10);
                        dialogInterface.dismiss();
                        ((feb) gtmVar3.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 2) {
                        int i11 = i3;
                        gtm gtmVar4 = gtmVar;
                        gtmVar4.e(4, i11);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    String strM = sla.m(4);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i12 = i3;
                    sb.append(ezh.x(i12));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Positive button clicked");
                    String string = sb.toString();
                    gtm gtmVar5 = gtmVar;
                    gtmVar5.c.b(string);
                    ((mdy) gtmVar5.f).u(3, 4, i12, null, 0);
                    ((feb) gtmVar5.e).a("None of the cameras are working. User decided to visit the help center");
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.a).u()));
                }
            });
            rkcVar.q(R.string.contact_us, new DialogInterface.OnClickListener() { // from class: gnu
                /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, pbc] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    int i8 = i4;
                    if (i8 == 0) {
                        int i9 = i3;
                        gtm gtmVar2 = gtmVar;
                        gtmVar2.e(5, i9);
                        dialogInterface.dismiss();
                        ((feb) gtmVar2.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 1) {
                        int i10 = i3;
                        gtm gtmVar3 = gtmVar;
                        gtmVar3.e(3, i10);
                        dialogInterface.dismiss();
                        ((feb) gtmVar3.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 2) {
                        int i11 = i3;
                        gtm gtmVar4 = gtmVar;
                        gtmVar4.e(4, i11);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    String strM = sla.m(4);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i12 = i3;
                    sb.append(ezh.x(i12));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Positive button clicked");
                    String string = sb.toString();
                    gtm gtmVar5 = gtmVar;
                    gtmVar5.c.b(string);
                    ((mdy) gtmVar5.f).u(3, 4, i12, null, 0);
                    ((feb) gtmVar5.e).a("None of the cameras are working. User decided to visit the help center");
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.a).u()));
                }
            });
            dvVarB = rkcVar.b();
        } else if (iB == 3) {
            final gtm gtmVar2 = (gtm) this.d;
            Context context2 = (Context) gtmVar2.d;
            rkc rkcVar2 = new rkc(context2, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar2.t(context2.getResources().getString(R.string.camera_issue_title));
            rkcVar2.u(ezh.z(R.string.camera_issue_reboot_message, context2, new Runnable() { // from class: gnv
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, pbc] */
                @Override // java.lang.Runnable
                public final void run() throws PackageManager.NameNotFoundException {
                    int i7 = fed.a;
                    gtm gtmVar3 = gtmVar2;
                    Activity activity = (Activity) gtmVar3.b;
                    Context applicationContext = activity.getApplicationContext();
                    activity.getPackageName();
                    fed.b(applicationContext, activity);
                    int i8 = i4;
                    String strM = sla.m(i8);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i9 = i3;
                    sb.append(ezh.x(i9));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Learn more button clicked");
                    gtmVar3.c.b(sb.toString());
                    ((mdy) gtmVar3.f).u(5, i8, i9, null, 0);
                }
            }));
            rkcVar2.k(false);
            final int i7 = 1;
            rkcVar2.n(R.string.camera_fallback_close_app, new DialogInterface.OnClickListener() { // from class: gnu
                /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, pbc] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i72) {
                    int i8 = i7;
                    if (i8 == 0) {
                        int i9 = i3;
                        gtm gtmVar22 = gtmVar2;
                        gtmVar22.e(5, i9);
                        dialogInterface.dismiss();
                        ((feb) gtmVar22.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 1) {
                        int i10 = i3;
                        gtm gtmVar3 = gtmVar2;
                        gtmVar3.e(3, i10);
                        dialogInterface.dismiss();
                        ((feb) gtmVar3.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i8 == 2) {
                        int i11 = i3;
                        gtm gtmVar4 = gtmVar2;
                        gtmVar4.e(4, i11);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    String strM = sla.m(4);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i12 = i3;
                    sb.append(ezh.x(i12));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Positive button clicked");
                    String string = sb.toString();
                    gtm gtmVar5 = gtmVar2;
                    gtmVar5.c.b(string);
                    ((mdy) gtmVar5.f).u(3, 4, i12, null, 0);
                    ((feb) gtmVar5.e).a("None of the cameras are working. User decided to visit the help center");
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.a).u()));
                }
            });
            dvVarB = rkcVar2.b();
        } else {
            final gtm gtmVar3 = (gtm) this.d;
            Context context3 = (Context) gtmVar3.d;
            rkc rkcVar3 = new rkc(context3, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar3.t(context3.getResources().getString(R.string.camera_issue_title));
            final int i8 = 5;
            rkcVar3.u(ezh.z(R.string.camera_issue_restart_message, context3, new Runnable() { // from class: gnv
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, pbc] */
                @Override // java.lang.Runnable
                public final void run() throws PackageManager.NameNotFoundException {
                    int i72 = fed.a;
                    gtm gtmVar32 = gtmVar3;
                    Activity activity = (Activity) gtmVar32.b;
                    Context applicationContext = activity.getApplicationContext();
                    activity.getPackageName();
                    fed.b(applicationContext, activity);
                    int i82 = i8;
                    String strM = sla.m(i82);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i9 = i3;
                    sb.append(ezh.x(i9));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Learn more button clicked");
                    gtmVar32.c.b(sb.toString());
                    ((mdy) gtmVar32.f).u(5, i82, i9, null, 0);
                }
            }));
            rkcVar3.k(false);
            rkcVar3.n(R.string.camera_fallback_close_app, new DialogInterface.OnClickListener() { // from class: gnu
                /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, pbc] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i72) {
                    int i82 = i5;
                    if (i82 == 0) {
                        int i9 = i3;
                        gtm gtmVar22 = gtmVar3;
                        gtmVar22.e(5, i9);
                        dialogInterface.dismiss();
                        ((feb) gtmVar22.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i82 == 1) {
                        int i10 = i3;
                        gtm gtmVar32 = gtmVar3;
                        gtmVar32.e(3, i10);
                        dialogInterface.dismiss();
                        ((feb) gtmVar32.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    if (i82 == 2) {
                        int i11 = i3;
                        gtm gtmVar4 = gtmVar3;
                        gtmVar4.e(4, i11);
                        dialogInterface.dismiss();
                        ((feb) gtmVar4.e).a("None of the cameras are working. User decided to close the app");
                        return;
                    }
                    String strM = sla.m(4);
                    StringBuilder sb = new StringBuilder("Hardware help dialog for unavailability of any cameras due to reason: ");
                    int i12 = i3;
                    sb.append(ezh.x(i12));
                    sb.append(" at stage ");
                    sb.append(strM);
                    sb.append("Positive button clicked");
                    String string = sb.toString();
                    gtm gtmVar5 = gtmVar3;
                    gtmVar5.c.b(string);
                    ((mdy) gtmVar5.f).u(3, 4, i12, null, 0);
                    ((feb) gtmVar5.e).a("None of the cameras are working. User decided to visit the help center");
                    ezh.A((Context) gtmVar5.d, Uri.parse(((cxb) gtmVar5.a).u()));
                }
            });
            dvVarB = rkcVar3.b();
        }
        if (((gof) this.f).b(dvVarB)) {
            r0.b("Showing hardware help dialog for unavailability of any cameras due to reason: " + ezh.x(i3) + " at stage " + sla.m(iB));
            ((mdy) this.b).u(2, iB, i3, null, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, owf] */
    public final vdu k() {
        oxj oxjVar;
        int i = ((oxh) ((ggx) this.d).a((nkw) this.c.dL()).dL()).l;
        owx owxVar = (owx) this.b;
        int iOrdinal = ((lty) owxVar.dL()).ordinal();
        if (iOrdinal == 0) {
            oxjVar = oxj.RES_1080P;
        } else if (iOrdinal == 1) {
            oxjVar = oxj.RES_2160P;
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            oxjVar = oxj.RES_4320P;
        }
        Size sizeC = oxjVar.c().c();
        int i2 = 8;
        if (((lty) owxVar.dL()).equals(lty.RES_4320P)) {
            gzi gziVar = hax.a;
        } else if (((ksa) ((owx) this.a).dL()).equals(ksa.AMETHYST_ON)) {
            i2 = 10;
        }
        return new vdu(i, i2, ((Boolean) this.e.dL()).booleanValue(), sizeC, ((Boolean) ((luj) this.g).b(luf.P)).booleanValue() ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ues] */
    public final Handler l() {
        return (Handler) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ues] */
    public final Executor m() {
        return (Executor) this.d.a();
    }

    public final sm n(String str) {
        return ((ut) this.d).c(str);
    }

    public qrh(pbc pbcVar, pbn pbnVar, pqn pqnVar, mwq mwqVar, pnp pnpVar, pjo pjoVar, pmg pmgVar) {
        this.a = pbnVar;
        this.e = pbcVar;
        this.g = mwqVar;
        this.f = pqnVar;
        this.c = pnpVar;
        this.b = pjoVar;
        this.d = pmgVar;
    }

    public qrh(und undVar, una unaVar, una unaVar2, Executor executor, una unaVar3, uif uifVar, uif uifVar2) {
        this.e = undVar;
        this.g = unaVar;
        this.f = unaVar2;
        this.b = executor;
        this.c = unaVar3;
        this.a = new uez(new ne(uifVar, 13));
        this.d = new uez(new ne(uifVar2, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Set] */
    public final pfd c(pdv pdvVar, int i) throws Throwable {
        ?? r1;
        Throwable th;
        qrh qrhVar;
        pfd pfdVar;
        if (i > pdvVar.a()) {
            r1 = -1;
            if (pdvVar.a() != -1) {
                ?? r0 = this.e;
                String strValueOf = String.valueOf(pdvVar);
                r0.h("Desired capacity of " + i + " is larger than the max capacity of " + strValueOf + ". Restricting capacity to " + pdvVar.a());
                i = pdvVar.a();
                r1 = strValueOf;
            }
        }
        int i2 = i;
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ?? r9 = this.c;
                for (pfd pfdVar2 : r9) {
                    try {
                        rnt.J(ojl.bt(pdvVar, pfdVar2.i(), this.e), "Cannot attach %s because it conflicts with %s (%s)", pdvVar, pfdVar2, pfdVar2.i());
                    } catch (Throwable th3) {
                        th = th3;
                        qrhVar = this;
                        throw th;
                    }
                }
                pfdVar = new pfd(this, this.f, pdvVar, (mwq) this.b, i2, this.a);
                ((qpf) this.g).j(pfdVar);
                r9.add(pfdVar);
                if (i2 > 0) {
                    this.e.f("Created " + pfdVar.toString() + TOnSyMaYeslEl.qtPckityEIUAQ + String.valueOf(pdvVar) + " with " + i2 + " frames max");
                } else {
                    this.e.f("Created " + pfdVar.toString() + " from " + String.valueOf(pdvVar));
                }
            } catch (Throwable th4) {
                th = th4;
                r1 = this;
                th = th;
                qrhVar = r1;
                throw th;
            }
        }
        d();
        return pfdVar;
    }

    public qrh(byte[] bArr) {
        this.e = new nni();
        this.b = new nni();
        this.a = new nni();
        this.g = new nni();
        this.f = new ocq((byte[]) null);
        this.c = new ocq((byte[]) null);
        this.d = new nni();
    }

    public qrh(gtm gtmVar, out outVar, gox goxVar, cxb cxbVar, mdy mdyVar, pbc pbcVar, gof gofVar) {
        this.d = gtmVar;
        this.c = outVar;
        this.g = goxVar;
        this.a = cxbVar;
        this.b = mdyVar;
        this.f = gofVar;
        this.e = pbcVar.a("CamUnavailableHndlr");
    }

    public qrh(our ourVar, hzs hzsVar, owf owfVar, owq owqVar, ibb ibbVar, pbc pbcVar, nkw nkwVar) {
        this.a = ourVar;
        this.f = hzsVar;
        this.g = owfVar;
        this.b = owqVar;
        this.c = ibbVar;
        this.d = nkwVar;
        this.e = pbcVar.a("HdrPFlashDecider");
        ourVar.d(new ffy(owqVar, 18));
    }

    public qrh(qrh qrhVar, sv svVar, ut utVar, uh uhVar, det detVar) {
        qrhVar.getClass();
        svVar.getClass();
        utVar.getClass();
        uhVar.getClass();
        this.g = qrhVar;
        this.b = svVar;
        this.d = utVar;
        this.a = uhVar;
        this.f = detVar;
        this.c = new Object();
        this.e = new LinkedHashSet();
    }

    public qrh(qrx qrxVar, rww rwwVar, rww rwwVar2, Executor executor, tzj tzjVar, qqq qqqVar, uem uemVar) {
        this.g = new AtomicBoolean(true);
        this.a = qrxVar;
        this.b = rwwVar;
        this.c = rwwVar2;
        this.d = executor;
        this.e = qqqVar.a(executor, tzjVar, null);
        this.f = uemVar;
    }

    public qrh() {
        this.d = new ovx(false);
        this.f = new ovx(0);
        Float fValueOf = Float.valueOf(-1.0f);
        this.e = new ovx(fValueOf);
        this.c = new ovx(fValueOf);
        this.a = new ovx(fValueOf);
        this.g = new ovx(fValueOf);
        this.b = new ovx(false);
    }

    public qrh(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7) {
        uemVar.getClass();
        this.f = uemVar;
        uemVar2.getClass();
        this.e = uemVar2;
        uemVar3.getClass();
        this.b = uemVar3;
        uemVar4.getClass();
        this.g = uemVar4;
        uemVar5.getClass();
        this.a = uemVar5;
        this.d = uemVar6;
        uemVar7.getClass();
        this.c = uemVar7;
    }

    public qrh(pbc pbcVar, Handler handler, qpf qpfVar, mwq mwqVar, pbn pbnVar) {
        oup oupVar = new oup(handler);
        this.a = pbnVar;
        this.f = new pbs(oupVar, pbnVar, "FrameBuffer");
        this.g = qpfVar;
        this.b = mwqVar;
        this.c = new HashSet();
        this.d = new ArrayList();
        this.e = pbcVar.a("FrameBufferMap");
    }
}
