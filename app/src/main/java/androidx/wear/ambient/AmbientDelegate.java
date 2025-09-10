package androidx.wear.ambient;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.wear.ambient.WearableControllerProvider;
import com.google.android.wearable.compat.WearableActivityController;
import com.google.ar.core.R;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;
import defpackage.a;
import defpackage.afy;
import defpackage.ai;
import defpackage.aii;
import defpackage.aim;
import defpackage.bm;
import defpackage.bp;
import defpackage.bpb;
import defpackage.ch;
import defpackage.cwa;
import defpackage.cwc;
import defpackage.cwh;
import defpackage.cxk;
import defpackage.dne;
import defpackage.dx;
import defpackage.eoz;
import defpackage.ffl;
import defpackage.ffp;
import defpackage.fqb;
import defpackage.fwf;
import defpackage.ggg;
import defpackage.gyg;
import defpackage.gzi;
import defpackage.hck;
import defpackage.mxu;
import defpackage.myd;
import defpackage.nur;
import defpackage.nut;
import defpackage.nuz;
import defpackage.prh;
import defpackage.psd;
import defpackage.psf;
import defpackage.psj;
import defpackage.rnt;
import defpackage.rww;
import defpackage.tpe;
import defpackage.uiq;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AmbientDelegate {
    static Integer d;
    public Object a;
    public final Object b;
    public final Object c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    interface AmbientCallback {
        void onAmbientOffloadInvalidated();

        void onEnterAmbient(Bundle bundle);

        void onExitAmbient();

        void onUpdateAmbient();
    }

    public AmbientDelegate(afy afyVar, bpb bpbVar) {
        this.b = afyVar;
        this.c = bpbVar;
        this.a = aii.a;
    }

    private final float H(long j) {
        return this.a == aii.b ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j & 4294967295L));
    }

    private final int I(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = (View) this.c;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            eoz.k(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }

    private static final boolean J(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    private final boolean K() {
        nuz nuzVarA = A();
        return (nuzVarA.b & 2) != 0 && ((psj) this.c).c() >= nuzVarA.d;
    }

    public static final float m(float f) {
        return -f;
    }

    public static final long n(long j) {
        return j ^ (-9223372034707292160L);
    }

    public static final boolean w(int i, int i2) {
        return J(i) && J(i2);
    }

    public final nuz A() {
        prh.c();
        psj psjVar = (psj) this.c;
        prh.d(psjVar.k(), "getServerFlags() called before ready.");
        if (!psjVar.k()) {
            return nuz.a;
        }
        prh.c();
        prh.d(psjVar.l(), "Attempted to use ServerFlags before ready.");
        return psjVar.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void B() {
        while (true) {
            ?? r0 = this.b;
            if (r0.peek() == null) {
                return;
            } else {
                ((psf) r0.remove()).a(((psj) this.c).n());
            }
        }
    }

    public final boolean C(Bundle bundle) {
        prh.c();
        Object obj = this.c;
        if (!((psj) obj).k()) {
            return false;
        }
        tpe tpeVar = (tpe) nut.a.m();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        nut nutVar = (nut) tpeVar.b;
        nutVar.c = 341;
        nutVar.b |= 1;
        try {
            ((psj) obj).e(((nut) tpeVar.l()).h(), new nur(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void D(psf psfVar) {
        prh.c();
        psj psjVar = (psj) this.c;
        if (psjVar.k() || psjVar.j()) {
            psfVar.a(psjVar.n());
            return;
        }
        this.b.add(psfVar);
        if (psjVar.h() || psjVar.i()) {
            return;
        }
        psjVar.m();
    }

    public final int E() {
        prh.c();
        psj psjVar = (psj) this.c;
        return !psjVar.k() ? psjVar.n() : K() ? 2 : 13;
    }

    public final int F() {
        prh.c();
        psj psjVar = (psj) this.c;
        if (!psjVar.k()) {
            return psjVar.n();
        }
        if (!K()) {
            return 13;
        }
        nuz nuzVarA = A();
        return ((nuzVarA.b & 8) == 0 || psjVar.c() < nuzVarA.f) ? 13 : 2;
    }

    public final File G() {
        Object obj;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = ((Context) this.c).getDataDir();
            }
            obj = this.a;
        }
        return (File) obj;
    }

    final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.wear.ambient.AmbientDelegate$AmbientCallback, java.lang.Object] */
    final void b() {
        Activity activity = (Activity) ((WeakReference) this.c).get();
        if (activity != null) {
            ?? r2 = this.b;
            SharedLibraryVersion.verifySharedLibraryPresent();
            WearableControllerProvider.AnonymousClass1 anonymousClass1 = new WearableControllerProvider.AnonymousClass1(r2);
            if (!WearableControllerProvider.a) {
                try {
                    if (!".onEnterAmbient".equals("." + WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class).getName())) {
                        throw new NoSuchMethodException();
                    }
                    WearableControllerProvider.a = true;
                } catch (NoSuchMethodException unused) {
                    throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
                }
            }
            this.a = new WearableActivityController("WearableControllerProvider", activity, anonymousClass1);
        }
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).onCreate();
        }
    }

    final void c() {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).onDestroy();
        }
    }

    final void d() {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).onPause();
        }
    }

    final void e() {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).onResume();
        }
    }

    final void f() {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).onStop();
        }
    }

    final void g() {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).setAmbientEnabled();
        }
    }

    final boolean h() {
        Object obj = this.a;
        if (obj != null) {
            return ((WearableActivityController) obj).isAmbient();
        }
        return false;
    }

    public final float i(long j) {
        return Float.intBitsToFloat((int) (this.a == aii.b ? j >> 32 : j & 4294967295L));
    }

    public final long j(aim aimVar, long j, bpb bpbVar) {
        if (bpbVar == null) {
            return k(aimVar.a(i(j)));
        }
        long jB = bpbVar.b(j, 1);
        long jAc = a.ac(j, jB);
        long jK = k(m(aimVar.a(m(i(jAc)))));
        return a.E(a.E(jB, jK), bpbVar.a(jK, a.ac(jAc, jK), 1));
    }

    public final long k(float f) {
        if (this.a == aii.b) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final long l(float f) {
        return this.a == aii.b ? a.t(f, 0.0f) : a.t(0.0f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r9v0, types: [afy, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.aim r14, float r15, defpackage.apg r16, defpackage.ajd r17, defpackage.uhb r18) {
        /*
            r13 = this;
            r1 = r18
            boolean r2 = r1 instanceof defpackage.dnu
            if (r2 == 0) goto L15
            r2 = r1
            dnu r2 = (defpackage.dnu) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.b = r3
            goto L1a
        L15:
            dnu r2 = new dnu
            r2.<init>(r13, r1)
        L1a:
            r6 = r2
            java.lang.Object r1 = r6.a
            uhi r7 = defpackage.uhi.a
            int r2 = r6.b
            r3 = 2
            r8 = 1
            if (r2 == 0) goto L41
            if (r2 == r8) goto L3a
            if (r2 != r3) goto L32
            ujz r2 = r6.d
            ujz r3 = r6.c
            defpackage.rnt.aN(r1)
            goto L97
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            ujz r2 = r6.c
            defpackage.rnt.aN(r1)
            goto L9e
        L41:
            defpackage.rnt.aN(r1)
            ujz r1 = new ujz
            r1.<init>()
            r4 = 0
            r1.a = r4
            java.lang.Object r9 = r13.b
            if (r9 == 0) goto L77
            boolean r2 = androidx.wear.ambient.AmbientLifecycleObserverKt.l(r17)
            if (r2 == 0) goto L77
            float r2 = m(r15)
            long r10 = r13.l(r2)
            dnv r0 = new dnv
            r5 = 0
            r2 = r13
            r3 = r14
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r12 = r1
            r1 = r0
            r6.c = r12
            r6.b = r8
            java.lang.Object r1 = r9.e(r10, r1, r6)
            if (r1 == r7) goto Lae
            r2 = r12
            goto L9e
        L77:
            r12 = r1
            float r1 = m(r15)
            long r1 = r13.l(r1)
            java.lang.Object r4 = r13.c
            r6.c = r12
            r6.d = r12
            r6.b = r3
            bpb r4 = (defpackage.bpb) r4
            r0 = r13
            r5 = r16
            r2 = r1
            r1 = r14
            java.lang.Object r1 = r0.p(r1, r2, r4, r5, r6)
            if (r1 == r7) goto Lae
            r2 = r12
            r3 = r2
        L97:
            cif r1 = (defpackage.cif) r1
            long r4 = r1.a
            r2.a = r4
            r2 = r3
        L9e:
            long r1 = r2.a
            float r0 = r13.H(r1)
            float r0 = m(r0)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            return r1
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientDelegate.o(aim, float, apg, ajd, uhb):java.lang.Object");
    }

    public final void q(cwa cwaVar) {
        Object obj = this.a;
        if (obj != null) {
            ((cxk) obj).run();
        }
        cxk cxkVar = new cxk((cwc) this.b, cwaVar);
        this.a = cxkVar;
        ((Handler) this.c).postAtFrontOfQueue(cxkVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fqb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, rww] */
    public final void r(fqb fqbVar) {
        Object obj = this.a;
        boolean z = true;
        if (obj != null && !fqbVar.equals(obj)) {
            z = false;
        }
        rnt.L(z);
        if (fqbVar.equals(this.a) && (fqbVar instanceof hck)) {
            throw null;
        }
        this.a = fqbVar;
        myd mydVar = ((mxu) this.b.fr()).b;
        mydVar.getClass();
        Rect rectH = mydVar.h(mydVar.k, mydVar.j);
        ?? r3 = this.a;
        r3.getClass();
        r3.g(rectH.width(), rectH.height());
        throw null;
    }

    public final void s() {
        ch chVarEo = ((bp) this.c).eo();
        bm bmVarE = chVarEo.e("VIDEO_PLAYER_TAG");
        if (bmVarE != null) {
            ai aiVar = new ai(chVarEo);
            aiVar.k(bmVarE);
            aiVar.c();
        }
        throw null;
    }

    public final void setAmbientOffloadEnabled(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).setAmbientOffloadEnabled(z);
        }
    }

    public final void setAutoResumeEnabled(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            ((WearableActivityController) obj).setAutoResumeEnabled(z);
        }
    }

    public final int t() {
        View view = (View) this.c;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return I(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int u() {
        View view = (View) this.c;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return I(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void v() {
        ViewTreeObserver viewTreeObserver = ((View) this.c).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.a);
        }
        this.a = null;
        this.b.clear();
    }

    public final void x(ffl fflVar) {
        this.a = fflVar;
        String string = "";
        if (fflVar != null) {
            ffp ffpVar = (ffp) fflVar.dL();
            int iB = (int) ffpVar.b();
            if (iB > 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < iB; i++) {
                    sb.append("  ");
                    sb.append(i);
                    sb.append(": ");
                    sb.append(ffpVar.a(i));
                    sb.append("\n");
                }
                string = sb.toString();
            }
        }
        if (string.isEmpty()) {
            ((ggg) this.b).d();
        } else {
            Object obj = this.b;
            ffp ffpVar2 = (ffp) fflVar.dL();
            if (!(ffpVar2 instanceof ffp)) {
                ffp ffpVar3 = new ffp();
                for (int i2 = 0; i2 < ffpVar2.b(); i2++) {
                    ffpVar3.c(ffpVar2.a(i2));
                }
                ffpVar2 = ffpVar3;
            }
            Object obj2 = ((ggg) obj).a;
            FloatDeque floatDeque = ffpVar2.a;
            DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) obj2;
            GcamModuleJNI.DirtyLensHistory_raw_score_history__set(dirtyLensHistory.a, dirtyLensHistory, floatDeque == null ? 0L : floatDeque.a, floatDeque);
        }
        gzi gziVar = gyg.a;
    }

    public final void y(String str) {
        fwf fwfVar = new fwf(this);
        this.a = fwfVar;
        fwfVar.execute(str);
    }

    public final void z(File file) {
        File[] fileArrListFiles = file.listFiles();
        rnt.x(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                z(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public AmbientDelegate(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.aim r17, long r18, defpackage.bpb r20, defpackage.apg r21, defpackage.uhb r22) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientDelegate.p(aim, long, bpb, apg, uhb):java.lang.Object");
    }

    public AmbientDelegate(Runnable runnable, Executor executor, AmbientDelegate ambientDelegate) {
        this.b = runnable;
        this.c = executor;
        this.a = ambientDelegate;
    }

    public AmbientDelegate(View view) {
        this.b = new ArrayList();
        this.c = view;
    }

    public AmbientDelegate(cwh cwhVar) {
        this.b = new cwc(cwhVar);
        this.c = new Handler(Looper.getMainLooper());
    }

    public AmbientDelegate(dx dxVar, rww rwwVar) throws Resources.NotFoundException {
        this.c = dxVar;
        this.b = rwwVar;
        dxVar.getResources().getInteger(R.integer.social_anim_duration_default);
        new Rect();
    }

    public AmbientDelegate(Activity activity, AmbientCallback ambientCallback) {
        this.c = new WeakReference(activity);
        this.b = ambientCallback;
    }

    public AmbientDelegate(Context context) {
        this.b = new Object();
        this.c = context.getApplicationContext();
    }

    public AmbientDelegate() {
        this((uiq) null);
    }

    public AmbientDelegate(Context context, psd psdVar) {
        this.b = new ArrayDeque();
        this.c = new psj(context, this, psdVar);
    }

    public AmbientDelegate(uiq uiqVar) {
        this.c = uiqVar;
        this.b = new dne();
    }
}
