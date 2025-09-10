package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.TextView;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byz {
    public final Object a;
    public final Object b;

    public byz(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = new Object();
    }

    public final void A() {
        ((aaa) this.a).clear();
        ((zb) this.b).f();
    }

    public final void B(lg lgVar) {
        ml mlVar = (ml) ((aaa) this.a).get(lgVar);
        if (mlVar == null) {
            return;
        }
        mlVar.b &= -2;
    }

    public final void C(lg lgVar) {
        zb zbVar = (zb) this.b;
        int iB = zbVar.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (lgVar == zbVar.e(iB)) {
                Object[] objArr = zbVar.c;
                Object obj = objArr[iB];
                Object obj2 = zc.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    zbVar.a = true;
                }
            }
        }
        ml mlVar = (ml) ((aaa) this.a).remove(lgVar);
        if (mlVar != null) {
            ml.b(mlVar);
        }
    }

    public final boolean D(lg lgVar) {
        ml mlVar = (ml) ((aaa) this.a).get(lgVar);
        return (mlVar == null || (mlVar.b & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mk] */
    public final View E(int i, int i2, int i3, int i4) {
        ?? r0 = this.a;
        int iD = r0.d();
        int iC = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            mj mjVar = (mj) this.b;
            mjVar.c(iD, iC, iB, iA);
            mjVar.b();
            mjVar.a(i3);
            if (mjVar.d()) {
                return viewE;
            }
            mjVar.b();
            mjVar.a(i4);
            int i6 = 1;
            if (true == mjVar.d()) {
                view = viewE;
            }
            if (i2 <= i) {
                i6 = -1;
            }
            i5 += i6;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, mk] */
    public final boolean F(View view) {
        Object obj = this.b;
        ?? r4 = this.a;
        mj mjVar = (mj) obj;
        mjVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        mjVar.b();
        mjVar.a(24579);
        return mjVar.d();
    }

    public final void G(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.b).getContext().obtainStyledAttributes(attributeSet, fa.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            Object obj = this.a;
            cty.e();
            ((cty) ((pfl) obj).a).a.a = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void H(bm bmVar, Bundle bundle, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.H(bmVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void I(bm bmVar, boolean z) {
        bmVar.getClass();
        ch chVar = (ch) this.b;
        Context context = chVar.m.c;
        bm bmVar2 = chVar.o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.I(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void J(bm bmVar, Bundle bundle, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.J(bmVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void K(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.K(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void L(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.L(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void M(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.M(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void N(bm bmVar, boolean z) {
        bmVar.getClass();
        ch chVar = (ch) this.b;
        Context context = chVar.m.c;
        bm bmVar2 = chVar.o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.N(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void O(bm bmVar, Bundle bundle, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.O(bmVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void P(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.P(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void Q(bm bmVar, Bundle bundle, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.Q(bmVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void R(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.R(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void S(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.S(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void T(bm bmVar, View view, Bundle bundle, boolean z) {
        bmVar.getClass();
        view.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.T(bmVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void U(bm bmVar, boolean z) {
        bmVar.getClass();
        bm bmVar2 = ((ch) this.b).o;
        if (bmVar2 != null) {
            bmVar2.getParentFragmentManager().z.U(bmVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void W() {
        ((dex) this.b).a();
    }

    public final void X(Bundle bundle) {
        dex dexVar = (dex) this.b;
        if (!dexVar.c) {
            dexVar.a();
        }
        deu deuVar = dexVar.a;
        if (deuVar.getLifecycle().a.a(cwb.d)) {
            cwb cwbVar = deuVar.getLifecycle().a;
            Objects.toString(cwbVar);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(cwbVar)));
        }
        if (dexVar.e) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleA = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleA = deq.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        dexVar.d = bundleA;
        dexVar.e = true;
    }

    public final void Y(Bundle bundle) {
        Bundle bundleG = coe.g((uev[]) Arrays.copyOf(new uev[0], 0));
        Object obj = this.b;
        dex dexVar = (dex) obj;
        Bundle bundle2 = dexVar.d;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (dexVar.g) {
            for (Map.Entry entry : ((dex) obj).b.entrySet()) {
                dev.a(bundleG, (String) entry.getKey(), ((des) entry.getValue()).a());
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        dev.a(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    public final Object Z(InputStream inputStream) throws cqt {
        try {
            Object objC = ((tqy) ((tph) this.a).a(7, null)).c(inputStream, (tow) this.b);
            objC.getClass();
            return objC;
        } catch (tpz e) {
            throw new cqt(e);
        }
    }

    public void a(View view, float[] fArr) {
        Matrix matrix = (Matrix) this.a;
        matrix.reset();
        View view2 = view;
        view2.transformMatrixToGlobal(matrix);
        ViewParent parent = view2.getParent();
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        int[] iArr = (int[]) this.b;
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public final void b() {
        Reference referencePoll;
        do {
            referencePoll = ((ReferenceQueue) this.a).poll();
            if (referencePoll != null) {
                ((bdp) this.b).m(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final AutofillId c(long j) {
        return ((ContentCaptureSession) this.b).newAutofillId((AutofillId) byx.o((View) this.a).a, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uif] */
    public final Object d(int i) {
        Object objC = ((bdp) this.b).c(i);
        this.a.a();
        return objC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uif] */
    public final void e(int i, Object obj) {
        ((bdp) this.b).f(i, obj);
        this.a.a();
    }

    public final void f(bvm bvmVar, boolean z) {
        if (z) {
            ((buq) this.b).b(bvmVar);
            ((buq) this.a).b(bvmVar);
        } else {
            if (((buq) this.b).c(bvmVar)) {
                return;
            }
            ((buq) this.a).b(bvmVar);
        }
    }

    public final boolean g() {
        return (((buq) this.a).d() && ((buq) this.b).d()) ? false : true;
    }

    public final boolean h(bvm bvmVar) {
        return ((buq) this.b).c(bvmVar);
    }

    public final void i(bvm bvmVar) {
        ((buq) this.b).e(bvmVar);
        ((buq) this.a).e(bvmVar);
    }

    public final bmz j() {
        bmz bmzVar;
        synchronized (this.b) {
            ((View) this.a).getUniqueDrawingId();
            bmzVar = new bmz(new bna(new ocq((byte[]) null, (char[]) null, (byte[]) null), new bmt()));
        }
        return bmzVar;
    }

    public final void k(bmz bmzVar) {
        synchronized (this.b) {
            if (!bmzVar.i) {
                bmzVar.i = true;
                bmzVar.e();
            }
        }
    }

    public final boolean l() {
        return this.a != bfe.a;
    }

    public final boolean m() {
        return this.b != bfe.a;
    }

    public final Object n(Object obj, afs afsVar, uiu uiuVar, uhb uhbVar) {
        return ung.i(new afu(afsVar, this, uiuVar, obj, null), uhbVar);
    }

    public final byz o(Object obj) {
        return new byz(this.b, obj, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void p(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azr, java.lang.Object] */
    public final void q(Object obj) {
        this.a.b(obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void r(int i, Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new ws(i, runnable));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final void s(String str, int i, boolean z) {
        us usVar;
        str.getClass();
        synchronized (this.a) {
            usVar = (us) this.b.get(new pp(str));
        }
        if (usVar == null) {
            return;
        }
        usVar.b.a(new qe(i, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.String r5, long r6, defpackage.uhb r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.sf
            if (r0 == 0) goto L13
            r0 = r8
            sf r0 = (defpackage.sf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            sf r0 = new sf
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r8)
            aej r8 = new aej
            r2 = 0
            r8.<init>(r4, r5, r2, r3)
            r0.b = r3
            java.lang.Object r8 = defpackage.ujo.i(r6, r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r4 = defpackage.a.ao(r8, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byz.t(java.lang.String, long, uhb):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Set] */
    public final void u(ta taVar, CameraDevice cameraDevice, rq rqVar, rnn rnnVar) {
        Object objC;
        rq rqVar2;
        rnnVar.getClass();
        uev uevVar = null;
        if (taVar != null) {
            int i = ukb.a;
            objC = taVar.c(new uji(CameraDevice.class));
        } else {
            objC = null;
        }
        if (objC == null) {
            if (cameraDevice != null) {
                aa(cameraDevice, rqVar);
                return;
            }
            return;
        }
        CameraDevice cameraDevice2 = (CameraDevice) objC;
        String id = cameraDevice2.getId();
        id.getClass();
        pp.b(id);
        if (cameraDevice != null && !a.ao(id, cameraDevice.getId())) {
            throw new IllegalStateException("Unwrapped camera device has camera ID " + id + ", but the wrapped camera device has camera ID " + cameraDevice.getId() + '!');
        }
        Objects.toString(objC);
        taVar.d();
        sd sdVar = new sd(taVar, rqVar);
        ta taVar2 = sdVar.a;
        if (taVar2 == null || (rqVar2 = sdVar.b) == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            uevVar = new uev(taVar2, rqVar2);
        }
        if (uevVar == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            taVar.f();
            rqVar.c(cameraDevice2);
            return;
        }
        Object obj = uevVar.b;
        ta taVar3 = (ta) uevVar.a;
        rq rqVar3 = (rq) obj;
        int i2 = ukb.a;
        Object objC2 = taVar3.c(new uji(CameraDevice.class));
        if (objC2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aa((CameraDevice) objC2, rqVar3);
        taVar.f();
        taVar.getClass();
        synchronized (rnnVar.d) {
            rnnVar.b.remove(taVar);
        }
    }

    public final km v(lg lgVar, int i) {
        ml mlVar;
        km kmVar;
        aaa aaaVar = (aaa) this.a;
        int iC = aaaVar.c(lgVar);
        if (iC >= 0 && (mlVar = (ml) aaaVar.g(iC)) != null) {
            int i2 = mlVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                mlVar.b = i3;
                if (i == 4) {
                    kmVar = mlVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    kmVar = mlVar.d;
                }
                if ((i3 & 12) == 0) {
                    aaaVar.e(iC);
                    ml.b(mlVar);
                }
                return kmVar;
            }
        }
        return null;
    }

    public final void w(lg lgVar) {
        aaa aaaVar = (aaa) this.a;
        ml mlVarA = (ml) aaaVar.get(lgVar);
        if (mlVarA == null) {
            mlVarA = ml.a();
            aaaVar.put(lgVar, mlVarA);
        }
        mlVarA.b |= 1;
    }

    public final void x(long j, lg lgVar) {
        ((zb) this.b).g(j, lgVar);
    }

    public final void y(lg lgVar, km kmVar) {
        aaa aaaVar = (aaa) this.a;
        ml mlVarA = (ml) aaaVar.get(lgVar);
        if (mlVarA == null) {
            mlVarA = ml.a();
            aaaVar.put(lgVar, mlVarA);
        }
        mlVarA.d = kmVar;
        mlVarA.b |= 8;
    }

    public final void z(lg lgVar, km kmVar) {
        aaa aaaVar = (aaa) this.a;
        ml mlVarA = (ml) aaaVar.get(lgVar);
        if (mlVarA == null) {
            mlVarA = ml.a();
            aaaVar.put(lgVar, mlVarA);
        }
        mlVarA.c = kmVar;
        mlVarA.b |= 4;
    }

    public byz(ContentCaptureSession contentCaptureSession, View view) {
        this.b = contentCaptureSession;
        this.a = view;
    }

    public byz(TextView textView) {
        this.b = textView;
        this.a = new pfl(textView);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uhf] */
    private final void aa(CameraDevice cameraDevice, rq rqVar) {
        String id = cameraDevice.getId();
        id.getClass();
        ujw ujwVar = new ujw();
        und undVar = vh.a;
        tl tlVar = new tl(cameraDevice, ujwVar, (uhb) null, 1);
        qrh qrhVar = (qrh) this.b;
        if (((ufg) vh.a(qrhVar.g, (una) qrhVar.f, 7000L, tlVar)) == null) {
            Log.e("CXCP", a.bw(id, "Failed to close CameraDevice(", pAAtrB.Ckax));
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        pp.b(id2);
        if (byi.bD(((sx) this.a).b.c(id2)) && ujwVar.a) {
            Objects.toString(pp.a(id2));
            if (rqVar.b.await(2000L, TimeUnit.MILLISECONDS)) {
                Objects.toString(pp.a(id2));
                return;
            }
            Log.w("CXCP", "Failed to close " + ((Object) pp.a(id2)) + " after 2000ms!");
        }
    }

    public byz(dex dexVar) {
        this.b = dexVar;
        this.a = new det(dexVar);
    }

    public byz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public byz(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public byz(mk mkVar) {
        this.a = mkVar;
        this.b = new mj();
    }

    public byz() {
        this.a = new Matrix();
        this.b = new int[2];
    }

    public byz(ch chVar) {
        this.b = chVar;
        this.a = new CopyOnWriteArrayList();
    }

    public byz(uem uemVar, qrh qrhVar, byte[] bArr) {
        qrhVar.getClass();
        this.a = uemVar;
        this.b = qrhVar;
    }

    public byz(byte[] bArr, short[] sArr) {
        this.a = new chp();
        this.b = new zd(16);
    }

    public byz(char[] cArr) {
        this.b = new buq();
        this.a = new buq();
    }

    public byz(int[] iArr) {
        this.b = new ReentrantLock();
        this.a = new LinkedHashMap();
    }

    public byz(short[] sArr, byte[] bArr) {
        this.a = new aaa();
        this.b = new zb();
    }

    public byz(cbr cbrVar, yq yqVar) {
        this.a = cbrVar.c;
        this.b = new ys(cbrVar.j().size());
        List listJ = cbrVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            cbr cbrVar2 = (cbr) listJ.get(i);
            if (yqVar.b(cbrVar2.e)) {
                ((ys) this.b).d(cbrVar2.e);
            }
        }
    }

    public byz(tqr tqrVar, tow towVar) {
        towVar.getClass();
        this.a = tqrVar;
        this.b = towVar;
    }

    public byz(uem uemVar, qrh qrhVar) {
        qrhVar.getClass();
        this.b = uemVar;
        this.a = qrhVar;
    }

    public byz(qrh qrhVar, sx sxVar, un unVar) {
        qrhVar.getClass();
        sxVar.getClass();
        unVar.getClass();
        this.b = qrhVar;
        this.a = sxVar;
    }

    public byz(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new Object();
        this.b = new LinkedHashMap();
    }

    public byz(rj rjVar, vj vjVar) {
        rjVar.getClass();
        this.a = rjVar;
        this.b = vjVar;
    }

    public byz(char[] cArr, char[] cArr2) {
        this.b = new Object();
        this.a = new ArrayList();
    }

    public byz(Object obj) {
        bap bapVar = bap.c;
        this.b = new azz(false, bapVar);
        this.a = new azz(obj, bapVar);
        new azz(obj, bapVar);
    }

    public byz(byte[] bArr) {
        this.b = new bdp(new Reference[16]);
        this.a = new ReferenceQueue();
    }

    public byz(byte[] bArr, char[] cArr) {
        this.a = new AtomicReference(null);
        this.b = new uxa();
    }

    public byz(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new AtomicReference(null);
        this.b = new uxa();
    }

    public byz(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new azw(Integer.MAX_VALUE);
        this.a = new azw(Integer.MAX_VALUE);
    }

    public byz(char[] cArr, byte[] bArr) {
        this.b = new zu((byte[]) null);
        this.a = new zu((byte[]) null);
    }
}
