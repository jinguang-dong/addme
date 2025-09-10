package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import j$.time.Duration;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lor implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lor(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, pjo] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, oom] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, oon] */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Object, ooo] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, ook, oon, ooo] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r10v25, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v50, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, ook, oon, ooo] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z = false;
        switch (this.c) {
            case 0:
                if (nvk.d != null) {
                    this.a.a(2);
                }
                this.b.a(false);
                return;
            case 1:
                if (nvk.d != null) {
                    this.a.a(1);
                }
                this.b.a(true);
                return;
            case 2:
                this.a.a(this.b);
                return;
            case 3:
                lat latVar = (lat) this.b;
                Object obj = latVar.b;
                obj.getClass();
                ((SensorManager) latVar.a).registerListener((SensorEventListener) this.a, (Sensor) obj, 3);
                return;
            case 4:
                Object obj2 = this.b;
                rnt.x(obj2);
                ((ltz) this.a).a.a(obj2);
                return;
            case 5:
                Object obj3 = this.a;
                lyu lyuVar = (lyu) obj3;
                synchronized (lyuVar.e) {
                    i = ((lyu) obj3).j;
                }
                ?? r10 = this.b;
                if (i < 3) {
                    if (lyuVar.i) {
                        long jD = r10.d();
                        if (Duration.ofNanos(jD - lyuVar.h).toMillis() >= 250) {
                            lyuVar.h = jD;
                        }
                    }
                    synchronized (lyuVar.e) {
                        ((lyu) obj3).j++;
                    }
                    pkf pkfVar = new pkf(new lxb(r10, new lac(obj3, 9)));
                    poj pojVarK = pkfVar.k();
                    if (pojVarK != null) {
                        lyt lytVar = lyuVar.k;
                        SystemClock.elapsedRealtime();
                        lytVar.h(pojVarK);
                    } else {
                        ((sgt) lyu.a.b().M(4526)).s("Unable to fork ref counted image");
                    }
                    pkfVar.l();
                    return;
                }
                r10.close();
                return;
            case 6:
                ?? r0 = this.b;
                lyu lyuVar2 = (lyu) this.a;
                lyuVar2.f = r0;
                mxm mxmVar = lyuVar2.g;
                if (mxmVar == null) {
                    return;
                }
                lyuVar2.k.e(r0, mxmVar);
                return;
            case 7:
                ((Instrumentation) this.a).c(new WeakReference(this.b));
                return;
            case 8:
                ((jgt) this.a).k(this.b);
                return;
            case 9:
                mln mlnVar = (mln) this.a;
                mma mmaVar = mlnVar.d;
                ?? r102 = this.b;
                mmaVar.f(r102);
                r102.close();
                mlnVar.c = false;
                return;
            case 10:
                mni mniVar = (mni) this.a;
                if (!mniVar.h.canScrollVertically(1) || mniVar.h.getContext().getResources().getConfiguration().orientation == 2) {
                    ((rjh) this.b).a().ar(3);
                    return;
                }
                return;
            case 11:
                HotshotController hotshotController = (HotshotController) this.b;
                if (hotshotController.c.isTouchExplorationEnabled()) {
                    View view = (View) this.a;
                    if (view.isAccessibilityFocused() || hotshotController.A == null) {
                        return;
                    }
                    view.sendAccessibilityEvent(8);
                    view.postDelayed(hotshotController.A, 50L);
                    return;
                }
                return;
            case 12:
                ((out) this.a).execute(this.b);
                return;
            case 13:
                nph nphVar = (nph) this.a;
                AtomicBoolean atomicBoolean = nphVar.e;
                ?? r103 = this.b;
                if (atomicBoolean.compareAndSet(false, true)) {
                    r103.b();
                }
                sbp sbpVarG = nphVar.g();
                int size = sbpVarG.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        boolean zQ = ((npl) sbpVarG.get(i2)).q();
                        i2++;
                        if (zQ) {
                            z = true;
                        }
                    }
                }
                r103.j(new npg(nphVar, r103, z));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ogc ogcVar = (ogc) this.b;
                oga ogaVar = (oga) ogcVar.e.k.get(ogcVar.b);
                if (ogaVar == null) {
                    return;
                }
                if (!((odj) this.a).c()) {
                    ogaVar.i((odj) this.a);
                    return;
                }
                ogcVar.d = true;
                oeo oeoVar = ogcVar.a;
                if (oeoVar.n()) {
                    ogcVar.c();
                    return;
                }
                try {
                    oeoVar.p(null, oeoVar.h());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    ((ogc) this.b).a.j("Failed to get service from broker.");
                    ogaVar.i(new odj(10));
                    return;
                }
            case 15:
                try {
                    oor oorVar = (oor) ((ooi) this.a).a.a((oor) this.b);
                    if (oorVar == 0) {
                        ((ooi) this.a).c(new NullPointerException("Continuation returned null"));
                        return;
                    } else {
                        ?? r104 = this.a;
                        Executor executor = oov.b;
                        oorVar.l(executor, r104);
                        oorVar.k(executor, r104);
                        oorVar.g(executor, r104);
                        return;
                    }
                } catch (ooq e2) {
                    if (!(e2.getCause() instanceof Exception)) {
                        ((ooi) this.a).b.o(e2);
                        return;
                    }
                    ((ooi) this.a).b.o((Exception) e2.getCause());
                    return;
                } catch (Exception e3) {
                    ((ooi) this.a).b.o(e3);
                    return;
                }
            case 16:
                Object obj4 = this.a;
                synchronized (((ool) obj4).a) {
                    ((ool) obj4).b.a((oor) this.b);
                }
                return;
            case 17:
                Object obj5 = this.a;
                synchronized (((ool) obj5).a) {
                    ?? r02 = ((ool) obj5).b;
                    Exception excC = ((oor) this.b).c();
                    ojl.ay(excC);
                    r02.c(excC);
                }
                return;
            case 18:
                Object obj6 = this.a;
                synchronized (((ool) obj6).a) {
                    ((ool) obj6).b.d(((oor) this.b).d());
                }
                return;
            case 19:
                try {
                    odn odnVar = odn.a;
                    oor oorVarQ = ojl.Q(null);
                    ?? r105 = this.a;
                    Executor executor2 = oov.b;
                    oorVarQ.l(executor2, r105);
                    oorVarQ.k(executor2, r105);
                    oorVarQ.g(executor2, r105);
                    return;
                } catch (CancellationException unused) {
                    ((oop) this.a).b();
                    return;
                } catch (ooq e4) {
                    if (!(e4.getCause() instanceof Exception)) {
                        ((oop) this.a).c(e4);
                        return;
                    }
                    ((oop) this.a).c((Exception) e4.getCause());
                    return;
                } catch (Exception e5) {
                    ((oop) this.a).c(e5);
                    return;
                }
            default:
                ((oul) this.a).a.a(this.b);
                return;
        }
    }

    public lor(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ lor(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public lor(ogc ogcVar, odj odjVar, int i) {
        this.c = i;
        this.a = odjVar;
        this.b = ogcVar;
    }

    public lor(out outVar, Runnable runnable, int i) {
        this.c = i;
        this.a = outVar;
        this.b = runnable;
    }
}
