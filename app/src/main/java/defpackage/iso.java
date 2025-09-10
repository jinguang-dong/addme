package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Log;
import android.util.Range;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iso {
    public final Object a;
    public final Object b;

    public iso(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public static final Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void o() {
        gzi gziVar = gzz.a;
    }

    public static final void p() {
        gzg gzgVar = hap.a;
    }

    public static final void q() {
        gzi gziVar = gzz.a;
        gzi gziVar2 = haa.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0146, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: IOException -> 0x0201, TryCatch #0 {IOException -> 0x0201, blocks: (B:3:0x0002, B:4:0x000c, B:6:0x000f, B:8:0x001e, B:10:0x0026, B:20:0x003a, B:21:0x003d, B:22:0x0049, B:24:0x004e, B:25:0x0051, B:31:0x006c, B:33:0x007e, B:32:0x0075, B:34:0x0083, B:35:0x008e, B:36:0x008f, B:38:0x00ac, B:41:0x00bb, B:42:0x00ce, B:45:0x00db, B:47:0x00e1, B:48:0x00ea, B:50:0x00f0, B:52:0x0103, B:54:0x010d, B:56:0x0123, B:57:0x0130, B:58:0x0133, B:59:0x0145, B:61:0x0148, B:63:0x0161, B:65:0x0174, B:67:0x017c, B:69:0x018e, B:75:0x01eb, B:70:0x01b2, B:72:0x01de, B:73:0x01e8, B:76:0x01f3, B:77:0x01f8, B:78:0x01f9, B:79:0x0200), top: B:83:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.iso y(java.lang.String... r18) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iso.y(java.lang.String[]):iso");
    }

    private static final loz z(Future future) {
        if (future != null) {
            if (future.isDone()) {
                try {
                    return (loz) future.get();
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    if (!(e instanceof InterruptedException)) {
                        return null;
                    }
                    Thread.currentThread().interrupt();
                    return null;
                }
            }
            future.cancel(true);
        }
        return null;
    }

    public final boolean a() {
        return ((hbj) this.b).p(gzo.aq) && ((UserManager) this.a).isSystemUser();
    }

    public final dx c() {
        a.I(true);
        return (dx) this.b;
    }

    public final float d(poe poeVar) {
        float[] fArr = (float[]) ((jwc) this.b).b.map(new idh(e(poeVar), 1)).orElse(null);
        return (fArr == null || fArr.length <= 0) ? ((Integer) ((Range) r3.o(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE)).getLower()).intValue() : fArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pjp] */
    public final pjo e(poe poeVar) {
        String strB = poeVar.b();
        strB.getClass();
        ?? r0 = this.a;
        pjr pjrVarD = r0.d(strB);
        pjrVarD.getClass();
        return r0.a(pjrVarD);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized ibz f(ltd ltdVar) {
        ?? r0 = this.a;
        ibz ibzVar = (ibz) r0.get(ltdVar);
        if (ibzVar != null) {
            return ibzVar;
        }
        ibz ibzVar2 = new ibz(null);
        r0.put(ltdVar, ibzVar2);
        lss lssVarA = ((lrp) this.b).a(ltdVar);
        if (lssVarA != null) {
            ske.W(lssVarA.s(), new fpc(this, ltdVar, 7, (short[]) null), sxo.a);
        }
        return ibzVar2;
    }

    public final qin g(String str) {
        qkq qkqVar = qkq.a;
        Object obj = this.b;
        hbc hbcVar = hbc.ENG;
        rnu rnuVarF = qpt.F();
        qfy qfyVar = new qfy(str, qpt.ap());
        qfyVar.a();
        qiw qiwVar = new qiw(qfyVar, qfyVar);
        qgf qgfVarAi = qpt.ai(qiwVar, new qix(qiwVar, qkqVar, rnuVarF, obj == hbcVar));
        try {
            qpt.an(qgfVarAi);
        } catch (qgg e) {
            Log.e("GLContexts", "Failed to create GLContext: ".concat(String.valueOf(String.valueOf(e.getCause()))));
        }
        qiwVar.l(new qim(qiwVar, qgfVarAi));
        gzi gziVar = gzo.a;
        return new qjl(new qjj(qiwVar));
    }

    public final rwc h(ltd ltdVar) {
        Future future;
        Future future2;
        synchronized (this) {
            future = (Future) ((HashMap) this.b).get(ltdVar);
            future2 = (Future) ((HashMap) this.a).get(ltdVar);
        }
        if (future != null) {
            try {
                try {
                    rwc rwcVarJ = rwc.j(new jod((DynamicDepthResult) future.get(), z(future2)));
                    synchronized (this) {
                        ((HashMap) this.b).remove(ltdVar);
                        ((HashMap) this.a).remove(ltdVar);
                    }
                    return rwcVarJ;
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    synchronized (this) {
                        ((HashMap) this.b).remove(ltdVar);
                        ((HashMap) this.a).remove(ltdVar);
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    ((HashMap) this.b).remove(ltdVar);
                    ((HashMap) this.a).remove(ltdVar);
                    throw th;
                }
            }
        }
        return rvk.a;
    }

    public final synchronized void i(ltd ltdVar) {
        ((HashMap) this.b).put(ltdVar, new szh());
        ((HashMap) this.a).put(ltdVar, new szh());
    }

    public final void j(ltd ltdVar, rwc rwcVar) {
        szh szhVar;
        synchronized (this) {
            szhVar = (szh) ((HashMap) this.b).get(ltdVar);
        }
        if (szhVar == null) {
            throw new NoSuchElementException("Shot not found: ".concat(String.valueOf(String.valueOf(ltdVar))));
        }
        if (rwcVar.h()) {
            szhVar.e((DynamicDepthResult) rwcVar.c());
            return;
        }
        synchronized (this) {
            ((HashMap) this.b).remove(ltdVar);
            loz lozVarZ = z((szh) ((HashMap) this.a).remove(ltdVar));
            if (lozVarZ != null) {
                lozVarZ.close();
            }
        }
        szhVar.cancel(true);
    }

    public final void k(ltd ltdVar, loz lozVar) {
        szh szhVar;
        synchronized (this) {
            szhVar = (szh) ((HashMap) this.a).get(ltdVar);
        }
        if (szhVar != null) {
            szhVar.e(lozVar);
        } else if (lozVar != null) {
            lozVar.close();
        }
    }

    public final void l(String str) {
        Object objCreateWindowContext;
        try {
            objCreateWindowContext = this.b;
            DisplayManager displayManager = (DisplayManager) ((Context) objCreateWindowContext).getSystemService("display");
            if (displayManager != null) {
                objCreateWindowContext = ((Context) objCreateWindowContext).createDisplayContext(displayManager.getDisplay(0)).createWindowContext(2, null);
            }
        } catch (RuntimeException unused) {
            objCreateWindowContext = this.b;
        }
        ((out) this.a).execute(new hdk(objCreateWindowContext, str, 4));
    }

    public final boolean m() {
        hbj hbjVar = (hbj) this.a;
        return hbjVar.p(gzz.k) && hbjVar.p(gzz.j) && !((pnq) this.b).a;
    }

    public final boolean n() {
        return ((hbj) this.a).p(haa.s) && m();
    }

    public final void r() {
        ((mni) this.a).h();
    }

    public final void s(int i, Object... objArr) {
        t(((Context) this.b).getString(i, objArr));
    }

    public final void t(String str) {
        ((out) this.a).execute(new gbh(this, str, 15));
    }

    public final void u() {
        t(((Context) this.b).getString(R.string.error_app_not_found));
    }

    public final oxy v(pjr pjrVar, oxj oxjVar, oxh oxhVar, boolean z) {
        gtm gtmVar = (gtm) this.b;
        int iK = gtmVar.k();
        rvk rvkVar = rvk.a;
        hbj hbjVar = (hbj) gtmVar.d;
        rwc rwcVarBQ = ojl.bQ(oxjVar, pjrVar, iK, oxhVar, rvkVar, rwc.i((Integer) hbjVar.a(gym.a).orElse(null)), hbjVar.o(gym.s), z);
        rnt.M(true, "No supported CamcorderProfile.");
        return (oxy) ((rwg) rwcVarBQ).a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean w(oxh oxhVar, oxj oxjVar) {
        List list = (List) this.a.get(oxhVar);
        list.getClass();
        return list.contains(oxjVar);
    }

    public final void x() {
        Intent intentG = ((cxb) this.b).g();
        if (intentG == null || !intentG.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            return;
        }
        if (fdo.i(intentG)) {
            ((luj) this.a).d(luf.x, fdo.c(intentG).d);
        } else {
            ((luj) this.a).d(luf.v, fdo.c(intentG).d);
        }
    }

    public iso(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public iso(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public iso(owq owqVar) {
        this.b = owqVar;
        this.a = "off";
    }

    public iso(egx egxVar) {
        this.a = new ArrayList();
        this.b = egxVar;
    }

    public iso(kgw kgwVar, Map map) {
        this.b = kgwVar;
        this.a = map;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.get((oxh) it.next());
        }
    }

    public iso(lrp lrpVar) {
        this.a = new HashMap();
        this.b = lrpVar;
    }

    public iso(char[] cArr) {
        this.b = new HashMap();
        this.a = new HashMap();
    }

    public iso(Activity activity) {
        activity.getClass();
        this.b = activity;
        this.a = new ovx(Boolean.valueOf(activity.isInMultiWindowMode()));
    }

    public iso() {
        this((Application) null, (Context) null);
    }

    public iso(Application application, Context context) {
        application.getClass();
        context.getClass();
        this.a = application;
        this.b = context;
    }
}
