package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Trace;
import android.provider.Settings;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillManager;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Comparator$CC;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.ToDoubleFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocq {
    private static volatile ocq b;
    public final Object a;

    public ocq(WindowInsetsAnimation windowInsetsAnimation) {
        this((boolean[]) null);
        this.a = windowInsetsAnimation;
    }

    public static ocq a() {
        if (b == null) {
            synchronized (ocq.class) {
                if (b == null) {
                    b = new ocq();
                }
            }
        }
        return b;
    }

    private final du aR(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        Context context = (Context) this.a;
        rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
        rkcVar.t(str);
        rkcVar.m(str2);
        rkcVar.r(context.getResources().getString(R.string.video_storage_full_error_free_up_space), new fdf(this, 12));
        rkcVar.o(context.getResources().getString(R.string.dialog_dismiss), onClickListener);
        return rkcVar;
    }

    private static String aS(String str) {
        return "tooltip_impression_count_for_".concat(String.valueOf(str));
    }

    private static String aT(String str) {
        return "tooltip_impression_trigger_count_for_".concat(str);
    }

    public static final dv af(du duVar) {
        dv dvVarB = duVar.b();
        dvVarB.setCancelable(false);
        dvVarB.setCanceledOnTouchOutside(false);
        return dvVarB;
    }

    public static final Bitmap ap(Bitmap bitmap, int i, boolean z) {
        Matrix matrix = new Matrix();
        System.currentTimeMillis();
        if (i == pao.CLOCKWISE_90.e || i == pao.CLOCKWISE_270.e) {
            matrix.postScale(1.0f, -1.0f);
        } else {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z) {
            matrix.postRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        System.currentTimeMillis();
        return bitmapCreateBitmap;
    }

    public static final void aq(poj pojVar, pao paoVar) {
        pojVar.getClass();
        a.I(pojVar.a() == 35);
        System.currentTimeMillis();
        boolean zP = lpa.p(paoVar);
        ByteBuffer buffer = ((poi) pojVar.g().get(0)).getBuffer();
        int rowStride = ((poi) pojVar.g().get(0)).getRowStride();
        ByteBuffer buffer2 = ((poi) pojVar.g().get(1)).getBuffer();
        int rowStride2 = ((poi) pojVar.g().get(1)).getRowStride();
        ByteBuffer buffer3 = ((poi) pojVar.g().get(2)).getBuffer();
        int rowStride3 = ((poi) pojVar.g().get(2)).getRowStride();
        FrameUtilNative.mirrorYUV420888(buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, pojVar.c(), pojVar.b(), zP);
        System.currentTimeMillis();
    }

    public static void at(View view, coy coyVar) {
        view.setWindowInsetsAnimationCallback(coyVar != null ? new coz(coyVar) : null);
    }

    public static ocq k(View view) {
        return new ocq(new nnx(view, 0));
    }

    public static void l(ocq ocqVar, ocq ocqVar2, ocq ocqVar3) {
        double[] dArr = (double[]) ocqVar.a;
        double d = dArr[0];
        double[] dArr2 = (double[]) ocqVar2.a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = d5 * d6;
        double d8 = dArr2[1];
        double d9 = dArr2[4];
        double d10 = dArr2[7];
        double d11 = d5 * d10;
        double d12 = dArr2[2];
        double d13 = dArr2[5];
        double d14 = dArr2[8];
        double d15 = dArr[3];
        double d16 = dArr[4];
        double d17 = dArr[5];
        double d18 = d17 * d6;
        double d19 = d17 * d10;
        double d20 = dArr[6];
        double d21 = dArr[7];
        double d22 = dArr[8];
        double d23 = d6 * d22;
        double d24 = d10 * d22;
        double d25 = (d * d12) + (d3 * d13);
        double d26 = (d15 * d12) + (d16 * d13);
        ocqVar3.f((d * d2) + (d3 * d4) + d7, (d * d8) + (d3 * d9) + d11, d25 + (d5 * d14), (d15 * d2) + (d16 * d4) + d18, (d15 * d8) + (d16 * d9) + d19, d26 + (d17 * d14), (d2 * d20) + (d4 * d21) + d23, (d8 * d20) + (d9 * d21) + d24, (d20 * d12) + (d21 * d13) + (d22 * d14));
    }

    public static void m(ocq ocqVar, nni nniVar, nni nniVar2) {
        double[] dArr = (double[]) ocqVar.a;
        double d = dArr[0];
        double d2 = nniVar.a;
        double d3 = dArr[1];
        double d4 = nniVar.b;
        double d5 = dArr[2];
        double d6 = nniVar.c;
        double d7 = dArr[3] * d2;
        double d8 = dArr[4] * d4;
        double d9 = dArr[5] * d6;
        double d10 = dArr[6] * d2;
        double d11 = dArr[7] * d4;
        double d12 = dArr[8] * d6;
        nniVar2.a = (d * d2) + (d3 * d4) + (d5 * d6);
        nniVar2.b = d7 + d8 + d9;
        nniVar2.c = d10 + d11 + d12;
    }

    public static double s(final double d, sbp sbpVar, final boolean z) {
        nje njeVar = (nje) Collection.EL.stream(sbpVar).min(Comparator$CC.comparingDouble(new ToDoubleFunction() { // from class: njd
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                nje njeVar2 = (nje) obj;
                Range range = z ? njeVar2.b : njeVar2.a;
                double d2 = d;
                if (range.contains((Range) Double.valueOf(d2))) {
                    return 0.0d;
                }
                Range range2 = njeVar2.a;
                return Math.min(Math.abs(((Double) range2.getLower()).doubleValue() - d2), Math.abs(((Double) range2.getUpper()).doubleValue() - d2));
            }
        })).orElseThrow(new mae(3));
        uen uenVar = njeVar.c;
        Range range = njeVar.a;
        double dDoubleValue = ((Double) range.getUpper()).doubleValue();
        double dDoubleValue2 = ((Double) range.getLower()).doubleValue();
        double d2 = dDoubleValue - dDoubleValue2;
        if (!z) {
            double d3 = uenVar.a;
            return d3 * Math.pow(uenVar.b / d3, (d - dDoubleValue2) / d2);
        }
        return dDoubleValue2 + ((Math.log(d / uenVar.a) / Math.log(uenVar.b / uenVar.a)) * d2);
    }

    public final void A(int i, toj tojVar) {
        ((tos) this.a).m(i, tojVar);
    }

    public final void B(int i, double d) {
        ((tos) this.a).aj(i, d);
    }

    public final void C(int i, int i2) {
        ((tos) this.a).s(i, i2);
    }

    public final void D(int i, int i2) {
        ((tos) this.a).o(i, i2);
    }

    public final void E(int i, long j) {
        ((tos) this.a).q(i, j);
    }

    public final void F(int i, float f) {
        ((tos) this.a).al(i, f);
    }

    public final void G(int i, Object obj, trg trgVar) {
        tos tosVar = (tos) this.a;
        tosVar.A(i, 3);
        trgVar.m((tqr) obj, tosVar.f);
        tosVar.A(i, 4);
    }

    public final void H(int i, int i2) {
        ((tos) this.a).s(i, i2);
    }

    public final void I(int i, long j) {
        ((tos) this.a).D(i, j);
    }

    public final void J(int i, Object obj, trg trgVar) {
        ((tos) this.a).u(i, (tqr) obj, trgVar);
    }

    public final void K(int i, Object obj) {
        boolean z = obj instanceof toj;
        Object obj2 = this.a;
        if (z) {
            ((tos) obj2).x(i, (toj) obj);
        } else {
            ((tos) obj2).w(i, (tqr) obj);
        }
    }

    public final void L(int i, int i2) {
        ((tos) this.a).o(i, i2);
    }

    public final void M(int i, long j) {
        ((tos) this.a).q(i, j);
    }

    public final void N(int i, int i2) {
        ((tos) this.a).ao(i, i2);
    }

    public final void O(int i, long j) {
        ((tos) this.a).aq(i, j);
    }

    public final void P(int i, String str) {
        ((tos) this.a).y(i, str);
    }

    public final void Q(int i, int i2) {
        ((tos) this.a).B(i, i2);
    }

    public final void R(int i, long j) {
        ((tos) this.a).D(i, j);
    }

    public final /* synthetic */ srg S() {
        tph tphVarI = ((tpc) this.a).l();
        tphVarI.getClass();
        return (srg) tphVarI;
    }

    public final void T(int i) {
        if (i == 0) {
            throw null;
        }
        tpc tpcVar = (tpc) this.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        srg srgVar = (srg) tpcVar.b;
        srg srgVar2 = srg.a;
        srgVar.c = i - 1;
        srgVar.b |= 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void U(long j) {
        this.a.remove(Long.valueOf(j));
    }

    public final boolean V() {
        return Settings.Secure.getInt(((Context) this.a).getContentResolver(), "camera_double_twist_to_flip_enabled", 1) == 1;
    }

    public final void W(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        ((AccessibilityManager) this.a).addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public final void X(AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        ((AccessibilityManager) this.a).removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public final boolean Y() {
        if (!aa()) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) this.a).getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList == null) {
                return false;
            }
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                String id = it.next().getId();
                if (enabledAccessibilityServiceList.size() == 1 && id.endsWith("com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService")) {
                    return false;
                }
                if (id == null || id.startsWith("com.google.android.apps.userpanel") || !id.startsWith("com.google")) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean Z() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = ((AccessibilityManager) this.a).getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList != null) {
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                String id = it.next().getId();
                if (id.endsWith("com.google.android.apps.accessibility.voiceaccess/.JustSpeakService") || id.endsWith("com.android.switchaccess.SwitchAccessService")) {
                    return true;
                }
            }
        }
        return aa();
    }

    public final anw aA(int i, int i2) {
        anw anwVar = new anw(i, i2);
        ((bdp) this.a).n(anwVar);
        return anwVar;
    }

    public final void aB(anw anwVar) {
        ((bdp) this.a).m(anwVar);
    }

    public final boolean aC() {
        return ((bdp) this.a).b != 0;
    }

    public final int aD() {
        return ((ank) this.a).j().l;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, usr] */
    public final Object aE(akb akbVar, uhb uhbVar) {
        Object objA = this.a.a(akbVar, uhbVar);
        return objA == uhi.a ? objA : ufg.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, usr] */
    public final void aF(akb akbVar) {
        this.a.d(akbVar);
    }

    public final aeb aH() {
        return new aeb((ocq) this.a);
    }

    public final Object aI(Object obj) {
        obj.getClass();
        return ((LinkedHashMap) this.a).remove(obj);
    }

    public final boolean aJ() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public final void aK() {
        ((uh) aQ().a).g();
    }

    @ueo
    public final sm aL(String str) {
        str.getClass();
        return aQ().n(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object aM(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.wm
            if (r0 == 0) goto L13
            r0 = r5
            wm r0 = (defpackage.wm) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wm r0 = new wm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uxa r4 = r0.c
            defpackage.rnt.aN(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r5)
            java.lang.Object r4 = r4.a
            r5 = r4
            uxa r5 = (defpackage.uxa) r5
            r0.c = r5
            r0.b = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            va r5 = new va
            uxa r4 = (defpackage.uxa) r4
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocq.aM(uhb):java.lang.Object");
    }

    public final ch aN() {
        return ((bu) this.a).e;
    }

    public final void aO() {
        ((bu) this.a).e.L();
    }

    public final void aP() {
        ((bu) this.a).e.ah(true);
    }

    public final qrh aQ() {
        try {
            Trace.beginSection("getCameraBackend");
            qrh qrhVarE = ((cey) this.a).e();
            if (qrhVarE != null) {
                return qrhVarE;
            }
            throw new IllegalStateException("Failed to load CameraBackend CameraBackendId(value=CXCP-Camera2)");
        } finally {
            Trace.endSection();
        }
    }

    public final boolean aa() {
        return ((AccessibilityManager) this.a).isTouchExplorationEnabled();
    }

    public final du ab(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        Context context = (Context) this.a;
        rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
        rkcVar.t(str);
        rkcVar.m(str2);
        rkcVar.r(context.getResources().getString(R.string.dialog_ok), onClickListener);
        return rkcVar;
    }

    public final dv ac(DialogInterface.OnClickListener onClickListener) {
        Context context = (Context) this.a;
        return af(aR(context.getResources().getString(R.string.device_out_of_storage_title), context.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }

    public final dv ad(DialogInterface.OnClickListener onClickListener) {
        Context context = (Context) this.a;
        return af(aR(context.getResources().getString(R.string.device_out_of_storage_title), context.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }

    public final dv ae(DialogInterface.OnClickListener onClickListener) {
        Context context = (Context) this.a;
        return af(aR(context.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), context.getResources().getString(R.string.device_out_of_storage_body), onClickListener));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final mft ag(mfs mfsVar) {
        ?? r2 = this.a;
        synchronized (r2) {
            String strB = mfsVar.b();
            if (r2.containsKey(strB)) {
                return (mft) r2.get(strB);
            }
            mfu mfuVar = new mfu(mfsVar);
            r2.put(strB, mfuVar);
            return mfuVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, tzx] */
    public final mdq ah(ltd ltdVar) {
        qqq qqqVar = (qqq) this.a;
        mdy mdyVar = (mdy) qqqVar.a.a();
        Object obj = qqqVar.e;
        return new mdq(mdyVar, (cxb) qqqVar.d.a(), (pbn) qqqVar.c.a(), (hbj) qqqVar.b.a(), ltdVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized int ai(String str) {
        return this.a.getInt(aS(str), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized int aj(String str) {
        return this.a.getInt(aT(str), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized int ak(String str) {
        int i;
        ?? r0 = this.a;
        String strAS = aS(str);
        i = r0.getInt(strAS, 0) + 1;
        r0.edit().putInt(strAS, i).putLong("tooltip_latest_impression_timestamp_for_".concat(String.valueOf(str)), System.currentTimeMillis()).apply();
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void al(String str, int i) {
        this.a.edit().putInt(aS(str), i).apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void am(String str, int i) {
        this.a.edit().putInt(aT(str), i).apply();
    }

    public final synchronized boolean an(String str, int i) {
        int iAj;
        iAj = aj(str);
        am(str, (iAj + 1) % i);
        return iAj % i == 0;
    }

    public final Bitmap ao(Bitmap bitmap, int i, boolean z) {
        if (z) {
            return ap(bitmap, i, true);
        }
        if (i == 0) {
            return bitmap;
        }
        Object obj = this.a;
        bitmap.getClass();
        Bitmap bitmapA = ((iob) obj).a(bitmap, i);
        bitmapA.getClass();
        return bitmapA;
    }

    public final float ar(poj pojVar) {
        rwc rwcVarB = lpa.b((rwc) this.a, pojVar.d());
        if (!rwcVarB.h()) {
            return 0.0f;
        }
        jra jraVar = (jra) rwcVarB.c();
        double dAbs = Math.abs(jraVar.b);
        double dAbs2 = Math.abs(jraVar.c);
        if (dAbs > 10.0d || dAbs2 > 10.0d) {
            return -1.0f;
        }
        double dExp = 1.0d / (Math.exp(dAbs2) + 1.0d);
        return (float) ((dExp + dExp) - 1.0d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, tzx] */
    public final lgw as(syu syuVar) {
        lat latVar = (lat) this.a;
        return new lgw(((pab) latVar.b).a(), (sbv) latVar.a.a(), (rwr) latVar.c.a(), syuVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void au(boolean z) {
        this.a.b(Boolean.valueOf(z));
    }

    public final void av() {
        ((HashMap) this.a).clear();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [azr, java.lang.Object] */
    public final void aw(int i) {
        this.a.b(new bor(i));
    }

    public final void ax(View view, int i, boolean z) {
        ((AutofillManager) this.a).notifyViewVisibilityChanged(view, i, z);
    }

    public final void ay(uiv uivVar) {
        ((apg) this.a).b(1, new byz(new add(10), new bfh(-857469575, true, new nri(uivVar, 1))));
    }

    public final void az(int i, uiq uiqVar, uiw uiwVar) {
        ((apg) this.a).b(i, new byz(uiqVar, uiwVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void b(oci ociVar) {
        this.a.add(0, ociVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nnv] */
    public final Object c(int i) {
        View viewA = this.a.a(i);
        viewA.getClass();
        return viewA;
    }

    public final double d(int i, int i2) {
        return ((double[]) this.a)[(i * 3) + i2];
    }

    public final void e(int i, int i2, double d) {
        ((double[]) this.a)[(i * 3) + i2] = d;
    }

    public final void f(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = (double[]) this.a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    public final void g(int i, nni nniVar) {
        double[] dArr = (double[]) this.a;
        dArr[i] = nniVar.a;
        dArr[i + 3] = nniVar.b;
        dArr[i + 6] = nniVar.c;
    }

    public final void h() {
        double[] dArr = (double[]) this.a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public final void i(double d) {
        double[] dArr = (double[]) this.a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    public final void j() {
        double[] dArr = (double[]) this.a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public final void n(ocq ocqVar) {
        double[] dArr = (double[]) ocqVar.a;
        double d = dArr[0];
        double[] dArr2 = (double[]) this.a;
        dArr2[0] = d;
        dArr2[1] = dArr[1];
        dArr2[2] = dArr[2];
        dArr2[3] = dArr[3];
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[5];
        dArr2[6] = dArr[6];
        dArr2[7] = dArr[7];
        dArr2[8] = dArr[8];
    }

    public final void o(ocq ocqVar) {
        double[] dArr = (double[]) this.a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double d4 = dArr[0];
        double[] dArr2 = (double[]) ocqVar.a;
        dArr2[0] = d4;
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    public final void p(ocq ocqVar) {
        double d = ((d(0, 0) * ((d(1, 1) * d(2, 2)) - (d(2, 1) * d(1, 2)))) - (d(0, 1) * ((d(1, 0) * d(2, 2)) - (d(1, 2) * d(2, 0))))) + (d(0, 2) * ((d(1, 0) * d(2, 1)) - (d(1, 1) * d(2, 0))));
        if (d == 0.0d) {
            return;
        }
        double d2 = 1.0d / d;
        double[] dArr = (double[]) this.a;
        double d3 = dArr[4];
        double d4 = dArr[8];
        double d5 = dArr[7];
        double d6 = dArr[5];
        double d7 = dArr[1];
        double d8 = dArr[2];
        double d9 = dArr[3];
        double d10 = dArr[6];
        double d11 = dArr[0];
        ocqVar.f(((d3 * d4) - (d5 * d6)) * d2, (-((d7 * d4) - (d8 * d5))) * d2, ((d7 * d6) - (d8 * d3)) * d2, (-((d9 * d4) - (d6 * d10))) * d2, ((d4 * d11) - (d8 * d10)) * d2, (-((d6 * d11) - (d8 * d9))) * d2, ((d9 * d5) - (d10 * d3)) * d2, (-((d5 * d11) - (d10 * d7))) * d2, ((d11 * d3) - (d9 * d7)) * d2);
    }

    public final void q(ExifInterface exifInterface) {
        gzi gziVar = gzo.a;
        exifInterface.p(ExifInterface.f);
        if (((hbj) this.a).p(gzo.ai)) {
            exifInterface.y(exifInterface.i(ExifInterface.g, "Google"));
            exifInterface.y(exifInterface.i(ExifInterface.h, "Pixel"));
            exifInterface.y(exifInterface.i(ExifInterface.aK, "Google"));
            exifInterface.y(exifInterface.i(ExifInterface.aL, "Pixel"));
        }
    }

    public final boolean r() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.a;
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins == null) {
            return false;
        }
        Iterator<ComponentName> it = activeAdmins.iterator();
        while (it.hasNext()) {
            if (devicePolicyManager.isProfileOwnerApp(it.next().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public final int t() {
        long j = ((uvv) ((umb) this.a).a).b.b;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object u() {
        while (true) {
            umb umbVar = (umb) this.a;
            uvv uvvVar = (uvv) umbVar.a;
            Object objB = uvvVar.b();
            if (objB != uvv.a) {
                return objB;
            }
            umbVar.d(uvvVar, uvvVar.c());
        }
    }

    public final void v() {
        while (true) {
            umb umbVar = (umb) this.a;
            uvv uvvVar = (uvv) umbVar.a;
            if (uvvVar.d()) {
                return;
            } else {
                umbVar.d(uvvVar, uvvVar.c());
            }
        }
    }

    public final boolean w(Object obj) {
        while (true) {
            umb umbVar = (umb) this.a;
            uvv uvvVar = (uvv) umbVar.a;
            int iA = uvvVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            umbVar.d(uvvVar, uvvVar.c());
        }
    }

    public final umb x(int i) {
        return ((umb[]) this.a)[i];
    }

    public final void y(Object obj, tzx tzxVar) {
        obj.getClass();
        tzxVar.getClass();
        ((LinkedHashMap) this.a).put(obj, tzxVar);
    }

    public final void z(int i, boolean z) {
        ((tos) this.a).l(i, z);
    }

    public ocq(Object obj) {
        this.a = obj;
    }

    public final void aG(Throwable th) {
        bdp bdpVar = (bdp) this.a;
        int i = bdpVar.b;
        umk[] umkVarArr = new umk[i];
        for (int i2 = 0; i2 < i; i2++) {
            umkVarArr[i2] = ((agl) bdpVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            umkVarArr[i3].g(th);
        }
        if (bdpVar.b == 0) {
            return;
        }
        akg.c(INRGuObcrHjSQz.LxCFUfRtrMAw);
    }

    public ocq(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ocq(byte[] bArr) {
        this.a = new double[9];
    }

    public ocq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new bdp(new anw[16]);
    }

    public ocq(short[] sArr, byte[] bArr) {
        this.a = new bdp(new agl[16]);
    }

    public ocq(boolean[] zArr) {
    }

    private ocq() {
        this.a = new CopyOnWriteArrayList();
    }

    public ocq(List list) {
        this.a = list;
        qs qsVar = (qs) ske.bB(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!a.p(((qs) it.next()).c, qsVar.c)) {
                throw new IllegalStateException("All outputs must have the same format!");
            }
        }
    }

    public ocq(uem uemVar) {
        uemVar.getClass();
        this.a = uemVar;
    }

    public ocq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new HashMap();
    }

    public ocq(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.a = new bkj();
    }

    public ocq(char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = usy.e(0, 16, 2, 1);
    }

    public ocq(int i, char[] cArr) {
        this.a = new azz(new bor(i), bap.c);
    }

    public ocq(CameraActivityTiming cameraActivityTiming) {
        cameraActivityTiming.getClass();
        this.a = cameraActivityTiming;
    }

    public ocq(uiq uiqVar) {
        this.a = new apg();
        uiqVar.a(this);
    }

    public ocq(byte[] bArr, short[] sArr) {
        this.a = new azz(false, bap.c);
    }

    public ocq(char[] cArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public ocq(tos tosVar) {
        byte[] bArr = tpx.b;
        this.a = tosVar;
        tosVar.f = this;
    }

    public ocq(byte[] bArr, char[] cArr) {
        this.a = new HashMap();
    }

    public ocq(char[] cArr, short[] sArr) {
        this.a = new zb((byte[]) null);
    }

    public ocq(int i, byte[] bArr) {
        this.a = rnt.aT(i);
    }

    public ocq(Context context, char[] cArr) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    public /* synthetic */ ocq(String str) {
        this.a = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name cannot be empty");
        }
    }

    public ocq(int[] iArr) {
        this.a = new ovx(false);
    }

    public ocq(int i) {
        umb[] umbVarArr = new umb[i];
        for (int i2 = 0; i2 < i; i2++) {
            umbVarArr[i2] = new umb(null, umc.a);
        }
        this.a = umbVarArr;
    }

    public ocq(LayoutInflater layoutInflater, ngw ngwVar) {
        layoutInflater.getClass();
        ngwVar.getClass();
        this.a = ngwVar;
    }

    public ocq(short[] sArr, byte[] bArr, byte[] bArr2) {
        this.a = new uxa();
    }

    public ocq(cey ceyVar) {
        ceyVar.getClass();
        this.a = ceyVar;
    }

    public ocq(ocq ocqVar, wh whVar, und undVar) {
        ocqVar.getClass();
        whVar.getClass();
        undVar.getClass();
        this.a = new Object();
        new LinkedHashMap();
    }

    public ocq(byte[] bArr, byte[] bArr2) {
        this.a = new umb(new uvv(8, false), umc.a);
    }

    public ocq(pl plVar, rg rgVar) {
        rgVar.getClass();
        ugq ugqVar = new ugq();
        for (ocq ocqVar : plVar.b) {
        }
        this.a = ugqVar.e();
    }

    public ocq(short[] sArr) {
        this((byte[]) null, (byte[]) null);
    }

    public ocq(int i, byte[] bArr, byte[] bArr2) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public ocq(byte[] bArr, short[] sArr, byte[] bArr2) {
        this.a = new azz(new cia(0L), bap.c);
    }

    public ocq(chq chqVar) {
        this.a = new abd(abn.a, chqVar);
    }
}
