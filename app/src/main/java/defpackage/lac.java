package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.views.CutoutBar;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import com.google.ar.core.R;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lac implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lac(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, lxi] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrF;
        byte[] bArrF2;
        byte[] bArrF3;
        byte[] bArrF4;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (obj) {
                    ((lae) obj).a = null;
                }
                return;
            case 1:
                kvv kvvVar = (kvv) this.a;
                owf owfVar = kvvVar.b;
                owfVar.getClass();
                if (((Boolean) owfVar.dL()).booleanValue()) {
                    hbj hbjVar = kvvVar.q;
                    hbjVar.getClass();
                    hbjVar.p(gzy.l);
                }
                kvvVar.c();
                szh szhVar = kvvVar.i;
                if (szhVar != null) {
                    szhVar.e(null);
                    return;
                }
                return;
            case 2:
                ((fto) this.a).a();
                return;
            case 3:
                Object obj2 = this.a;
                lgd lgdVar = (lgd) obj2;
                ReentrantLock reentrantLock = lgdVar.g;
                reentrantLock.lock();
                try {
                    if (!((lgd) obj2).f) {
                        rwc rwcVarB = ((ixr) ((lgd) obj2).d).b();
                        Context context = ((lgd) obj2).b;
                        byte[] bArrF5 = ((lgd) obj2).f(context, "facedetector-front.tflite.enc", "F25FB5752634BA2183D9A16FA878F60A");
                        byte[] bArrF6 = ((lgd) obj2).f(context, "face_model_468.xnft.enc", "DB22B14BAADB4BEB2FF3FE1205232CB2");
                        hbj hbjVar2 = ((lgd) obj2).h;
                        boolean zP = hbjVar2.p(hak.s);
                        boolean zP2 = hbjVar2.p(hak.t);
                        String strF = hbjVar2.f(hak.u);
                        if (!zP2) {
                            bArrF = ((lgd) obj2).f(context, "face_light_256_256.tflite.enc", "5BE6E9624DF061E5416D4D1D6215D6E6");
                            bArrF2 = ((lgd) obj2).f(context, "facemesh-full.tflite.enc", "606B34134C93CF8298025B58B6846736");
                            bArrF3 = ((lgd) obj2).f(context, "ffv6_holo040820_normals_net_mixed_fp16_256_256.tflite.enc", "8EE4D0F472BB7FF0B259F3841B1EE273");
                            bArrF4 = ((lgd) obj2).f(context, "ffv6_holo040820_relighting_net_mixed_fp16_256_256.tflite.enc", "E6BE4D7010D31926961DE0E45705C754");
                        } else if (rnt.V(strF)) {
                            ((sgt) lgd.a.b().M(4120)).s("Darwinn offline compilation was enabled, but product class was not configured. Portrait Relighting cannot be initialized.");
                            reentrantLock.unlock();
                            return;
                        } else if (zP) {
                            ((sgt) lgd.a.b().M(4119)).s("Darwinn offline compilation was enabled, but it cannot be combined with XenoJetCL inference (invalid configuration). Portrait Relighting cannot be initialized.");
                            reentrantLock.unlock();
                            return;
                        } else {
                            bArrF = ((lgd) obj2).g(context, "face_light_256_256", strF);
                            bArrF2 = ((lgd) obj2).g(context, "facemesh-full", strF);
                            bArrF3 = ((lgd) obj2).g(context, "ffv6_holo040820_normals_net_mixed_fp16_256_256", strF);
                            bArrF4 = ((lgd) obj2).g(context, "ffv6_holo040820_relighting_net_mixed_fp16_256_256", strF);
                        }
                        if (!((lgd) obj2).e.initPortraitRelightingProcessor(rwcVarB.h() ? ((File) rwcVarB.c()).getAbsolutePath() : "", ((lgd) obj2).c, zP, zP2, bArrF, bArrF6, bArrF5, bArrF2, bArrF3, bArrF4)) {
                            ((sgt) lgd.a.b().M(4118)).s("Unable to initialize Firefly Processor.");
                            return;
                        }
                        ((lgd) obj2).f = true;
                    }
                    reentrantLock.unlock();
                    return;
                } finally {
                    lgdVar.g.unlock();
                }
            case 4:
                lqg lqgVar = (lqg) this.a;
                if (lqgVar.g == null) {
                    return;
                }
                if (!((goi) lqgVar.f.dL()).c() || !((nkw) lqgVar.e.dL()).equals(nkw.NIGHT_SIGHT) || !nlj.k(lqgVar.g)) {
                    CutoutBar cutoutBar = lqgVar.g;
                    cutoutBar.e = 0.0f;
                    cutoutBar.setVisibility(4);
                    return;
                }
                CutoutBar cutoutBar2 = lqgVar.g;
                gyr gyrVar = cutoutBar2.b;
                if (gyrVar == null) {
                    ((sgt) CutoutBar.a.b().M(5380)).s("Not showing due to cutout info is null.");
                    return;
                }
                float f = gyrVar.b;
                if (f == Float.MAX_VALUE) {
                    cutoutBar2.e = cutoutBar2.d - 1.0f;
                } else {
                    cutoutBar2.e = f;
                }
                cutoutBar2.setVisibility(0);
                cutoutBar2.invalidate();
                return;
            case 5:
                Trace.beginSection("HeadingSensor.RegisterAccelerometer");
                ?? r0 = this.a;
                lrd lrdVar = (lrd) r0;
                Sensor sensor = lrdVar.c;
                if (sensor != null) {
                    lrdVar.b.registerListener((SensorEventListener) r0, sensor, 3);
                }
                Trace.endSection();
                Trace.beginSection("HeadingSensor.RegisterMagneticSensor");
                Sensor sensor2 = lrdVar.d;
                if (sensor2 != null) {
                    lrdVar.b.registerListener((SensorEventListener) r0, sensor2, 3);
                }
                Trace.endSection();
                return;
            case 6:
                lrh lrhVar = (lrh) this.a;
                lrhVar.a.unregisterListener(lrhVar.d, lrhVar.c);
                return;
            case 7:
                ((lti) this.a).a.a(ltu.UNSPECIFIED);
                return;
            case 8:
                out.a();
                mns mnsVar = (mns) this.a;
                ?? r1 = mnsVar.b;
                r1.f("SmartUiWirer#wire");
                ocq ocqVar = (ocq) mnsVar.c;
                ReplaceableView replaceableView = (ReplaceableView) ocqVar.c(R.id.smarts_ui_replaceableview);
                Object objC = ocqVar.c(R.id.smarts_ui_overlay);
                Object objC2 = ocqVar.c(R.id.smarts_preview_overlay);
                out.a();
                Object obj3 = mnsVar.d;
                ?? r9 = mnsVar.a;
                final lyq lyqVar = (lyq) r9;
                lyqVar.B = (ktx) obj3;
                lyqVar.x = (View) objC;
                lyqVar.y = (View) objC2;
                lyqVar.y.addOnLayoutChangeListener(new lyl(lyqVar));
                ?? r2 = mnsVar.f;
                Object obj4 = mnsVar.e;
                try {
                    lza lzaVar = ((lyq) r9).l;
                    View viewInflate = LayoutInflater.from(replaceableView.getContext()).inflate(R.layout.smarts_layout, (ViewGroup) replaceableView.getParent(), false);
                    replaceableView.a(viewInflate);
                    lzaVar.a = (FrameLayout) viewInflate;
                    oer oerVar = lzaVar.i;
                    oerVar.a = lzaVar.a;
                    oerVar.b(1);
                    lzaVar.e = (ktx) obj3;
                    lzaVar.f = (imi) obj4;
                    lzaVar.b = new HashMap();
                    lzaVar.d = r2;
                    lyqVar.o.e(true);
                    final lyp lypVar = new lyp(lyqVar);
                    lyqVar.e.a(lypVar);
                    our ourVar = lyqVar.n;
                    ourVar.d(new paq() { // from class: lxv
                        @Override // defpackage.paq, java.lang.AutoCloseable
                        public final void close() {
                            lyqVar.e.i(lypVar);
                        }
                    });
                    ourVar.d(lyqVar.C.j(r9));
                    ourVar.d(lyqVar.i.dK(new pau() { // from class: lxw
                        @Override // defpackage.pau
                        public final void a(Object obj5) {
                            nkw nkwVar = (nkw) obj5;
                            out.a();
                            final lyq lyqVar2 = lyqVar;
                            if (lyqVar2.p.equals(nkwVar)) {
                                return;
                            }
                            lyqVar2.p = nkwVar;
                            lyqVar2.h(new lyo() { // from class: lxt
                                @Override // defpackage.lyo
                                public final void a(Object obj6) {
                                    ((lyy) obj6).d(lyqVar2.p);
                                }
                            });
                        }
                    }, ojl.ce()));
                    r1.h("addObserver");
                    r1.g();
                    return;
                } catch (Throwable th) {
                    lyqVar.o.e(true);
                    throw th;
                }
            case 9:
                Object obj5 = this.a;
                ((lyu) obj5).c.execute(new lac(obj5, 10));
                return;
            case 10:
                synchronized (((lyu) this.a).e) {
                    ((lyu) r0).j--;
                }
                return;
            case 11:
                Object obj6 = this.a;
                synchronized (((mbq) obj6).b) {
                    if (!((mbq) obj6).d) {
                        ((mbq) obj6).a().autoResume();
                    }
                }
                return;
            case 12:
                ((mgr) this.a).f();
                return;
            case 13:
                ((mhe) this.a).m.v();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.a(true);
                return;
            case 15:
                this.a.a(false);
                return;
            case 16:
                ((mls) this.a).k(true);
                return;
            case 17:
                ((mls) this.a).k(false);
                return;
            case 18:
                this.a.a();
                return;
            case 19:
                ((pfl) this.a).o();
                return;
            default:
                ((mpx) this.a).u().setVisibility(0);
                return;
        }
    }

    public lac(kvv kvvVar, int i) {
        this.b = i;
        this.a = kvvVar;
    }
}
