package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.imax.cyclops.processing.NativePoseEstimatorImpl;
import com.google.android.apps.camera.ui.accessibility.AccessibilityAnnouncer;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;
import j$.util.Optional;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iko extends fqf {
    private final Activity a;
    private final ngw b;
    private final Runnable c;
    private final nmw d;
    private izr e;
    private final ggg f;
    private obu g;
    private final hbp h;

    public iko() {
        throw null;
    }

    @Override // defpackage.fqf
    public final boolean B() {
        return false;
    }

    public final synchronized void b() {
        izr izrVar = this.e;
        rnt.x(izrVar);
        izrVar.b().x = false;
    }

    @Override // defpackage.fqf
    public final synchronized void eA() {
        ((ViewfinderCover) this.b.e).l(this.c);
        Activity activity = this.a;
        if (activity.getRequestedOrientation() == 4) {
            activity.setRequestedOrientation(2);
        }
        izr izrVar = this.e;
        if (izrVar == null) {
            return;
        }
        rnt.x(izrVar);
        ilf ilfVarC = izrVar.c();
        ilfVarC.a.unregisterListener(ilfVarC);
        izr izrVar2 = this.e;
        rnt.x(izrVar2);
        ijo ijoVarB = izrVar2.b();
        if (ijoVarB.p.compareAndSet(1, 0)) {
            ijoVarB.l.a(false);
        } else {
            ijoVarB.o.set(true);
            ijoVarB.q.block();
            ijoVarB.h(false, 2);
        }
        AccessibilityAnnouncer accessibilityAnnouncer = ijoVarB.i;
        ijoVarB.b();
        ijoVarB.c.d();
    }

    @Override // defpackage.fqf
    public final void eC() {
        synchronized (this) {
            izr izrVar = this.e;
            if (izrVar == null) {
                return;
            }
            rnt.x(izrVar);
            ilf ilfVarC = izrVar.c();
            SensorManager sensorManager = ilfVarC.a;
            sensorManager.registerListener(ilfVarC, ilfVarC.c, 1);
            sensorManager.registerListener(ilfVarC, ilfVarC.b, 1);
            izr izrVar2 = this.e;
            rnt.x(izrVar2);
            ijo ijoVarB = izrVar2.b();
            Context context = ijoVarB.a;
            File file = new File(context.getCacheDir(), "datasets");
            hbj hbjVar = ijoVarB.J;
            gzg gzgVar = gzu.a;
            ijoVarB.M.y(file.toString());
            luj lujVar = ijoVarB.H;
            lus lusVar = luf.aJ;
            int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
            if (iIntValue < 2 && !ijoVarB.d.k()) {
                ijoVarB.c(context.getString(R.string.imax_vertical_hint));
                ijoVarB.I.d(lusVar, Integer.valueOf(iIntValue + 1));
            }
            ijoVarB.o.set(false);
            AccessibilityAnnouncer accessibilityAnnouncer = ijoVarB.i;
            synchronized (this) {
                izr izrVar3 = this.e;
                rnt.x(izrVar3);
                ija ijaVarA = izrVar3.a();
                ijaVarA.b.f("Panorama frameserver received onModuleResume");
                pfu pfuVar = ijaVarA.n;
                if (pfuVar != null) {
                    pfuVar.k();
                }
            }
            Activity activity = this.a;
            if (activity.getRequestedOrientation() == 2) {
                activity.setRequestedOrientation(4);
            }
            ngw ngwVar = this.b;
            ((ViewfinderCover) ngwVar.e).j(this.c);
        }
    }

    @Override // defpackage.fqf
    public final synchronized rwc eD() {
        rwc rwcVarJ;
        izr izrVar = this.e;
        if (izrVar == null) {
            return rvk.a;
        }
        ijb ijbVar = (ijb) izrVar.d.a();
        nmw nmwVar = this.d;
        if (ijbVar.getHolder().getSurface().isValid()) {
            int width = ijbVar.getWidth() / 2;
            int height = ijbVar.getHeight() / 2;
            if (width <= 0 || height <= 0) {
                ((sgt) ngk.a.c().M(5368)).s("getScreenshotFrom(): the surface size is invalid");
                rwcVarJ = rvk.a;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                nmwVar.a(ijbVar, bitmapCreateBitmap);
                rwcVarJ = rwc.j(ngq.b(bitmapCreateBitmap, 2));
            }
        } else {
            ((sgt) ngk.a.c().M(5369)).s("getScreenshotFrom(): the surface is not valid");
            rwcVarJ = rvk.a;
        }
        return rwcVarJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, ndj] */
    /* JADX WARN: Type inference failed for: r3v24, types: [android.opengl.GLSurfaceView$Renderer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, ndo] */
    /* JADX WARN: Type inference failed for: r3v39, types: [itk, java.lang.Object] */
    @Override // defpackage.fqf
    public final synchronized void l() {
        if (this.e != null) {
            return;
        }
        hbp hbpVar = this.h;
        this.e = new izr((izm) hbpVar.b, (izc) hbpVar.a, (izh) hbpVar.c);
        ggg gggVar = this.f;
        int i = ikq.a;
        izr izrVar = this.e;
        rnt.x(izrVar);
        float fA = (float) ((ikp) izrVar.e.a()).a();
        if (!((AtomicBoolean) gggVar.a).getAndSet(true)) {
            ikq.a = i;
            ikq.b = fA;
            ilh.b(iks.class, new ikq());
            ilh.b(ikv.class, new NativePoseEstimatorImpl());
            ilh.b(iku.class, new ilm());
            ilh.b(ili.class, new ilj());
        }
        izr izrVar2 = this.e;
        rnt.x(izrVar2);
        ijb ijbVar = (ijb) izrVar2.d.a();
        iki ikiVar = (iki) izrVar2.v.a();
        our ourVar = (our) izrVar2.w.a();
        izh izhVar = izrVar2.c;
        ndj ndjVar = (ndj) izhVar.T.a();
        ijo ijoVar = (ijo) izrVar2.z.a();
        fvu fvuVar = (fvu) izhVar.C.a();
        izc izcVar = izrVar2.b;
        jdh jdhVar = new jdh(ijbVar, ikiVar, ourVar, ndjVar, ijoVar, fvuVar, (itl) izcVar.bJ.a(), (ija) izrVar2.q.a(), (pau) izcVar.bF.a(), (hbj) izrVar2.a.o.a(), new ocq(izhVar.a.i()), (ikp) izrVar2.e.a());
        obu obuVar = this.g;
        rnt.x(obuVar);
        if (((hbj) jdhVar.j).p(gzo.aX)) {
            Object obj = jdhVar.b;
            ((ijb) obj).setBackground(((ijb) obj).getResources().getDrawable(R.drawable.viewfinder_rounded_background, null));
            ((ijb) obj).setClipToOutline(true);
        }
        Object obj2 = jdhVar.b;
        ((ijb) obj2).setEGLContextClientVersion(3);
        ?? r3 = jdhVar.f;
        ((ijb) obj2).setRenderer(r3);
        ((ijb) obj2).a = this;
        ((ijb) obj2).onResume();
        out.a();
        ((ViewGroup) obuVar.a).addView((View) obj2);
        ((MainActivityLayout) obuVar.b).m(1920, 1080, Integer.valueOf(((ikp) jdhVar.h).b.g()));
        Object obj3 = jdhVar.k;
        Object obj4 = jdhVar.i;
        pbn pbnVar = ((ija) obj3).a;
        pbnVar.f("ImaxFrameServer-start");
        pfw pfwVar = ((ija) obj3).m;
        pjp pjpVar = pfwVar.a;
        pjr pjrVarE = pjpVar.e(pka.BACK);
        pjrVarE.getClass();
        ikp ikpVar = ((ija) obj3).d;
        ila ilaVar = ikpVar.d;
        pas pasVar = new pas(ilaVar.a, ilaVar.b);
        ((ija) obj3).b.f("Viewfinder size: ".concat(pasVar.toString()));
        pep pepVarA = peq.a();
        pepVarA.r(pet.SURFACE_TEXTURE);
        pepVarA.b(pjrVarE);
        pepVarA.n(pasVar);
        peq peqVarA = pepVarA.a();
        ((ija) obj3).k = new fmz(obj3, obj4, 6);
        ske.W(((iki) r3).g, new iiz(obj3, peqVarA, 0), sxo.a);
        ((ija) obj3).l.set(false);
        pds pdsVarA = pdt.a();
        pdsVarA.f(pjrVarE);
        pdsVarA.d(peqVarA);
        pdsVarA.c = new pek(3);
        HashSet hashSet = new HashSet();
        hashSet.add(new pej(CaptureRequest.FLASH_MODE, 0));
        hashSet.add(new pej(CaptureRequest.CONTROL_AE_MODE, 1));
        hashSet.add(new pej(CaptureRequest.CONTROL_AE_LOCK, false));
        hashSet.add(new pej(CaptureRequest.CONTROL_AWB_MODE, 1));
        hashSet.add(new pej(CaptureRequest.CONTROL_AWB_LOCK, false));
        hashSet.add(new pej(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0));
        pjo pjoVar = ikpVar.b;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        Range[] rangeArr = (Range[]) pjoVar.m(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int length = rangeArr.length;
        Range range = rangeArr[length - 1];
        int i2 = 0;
        while (i2 < length) {
            Range range2 = rangeArr[i2];
            int i3 = i2;
            pbn pbnVar2 = pbnVar;
            if (((Integer) range2.getLower()).intValue() * ((Integer) range.getUpper()).intValue() >= ((Integer) range.getLower()).intValue() * ((Integer) range2.getUpper()).intValue() && Math.abs(((Integer) range2.getUpper()).intValue() - 30) < Math.abs(((Integer) range.getUpper()).intValue() - 30)) {
                range = range2;
            }
            i2 = i3 + 1;
            pbnVar = pbnVar2;
        }
        pbn pbnVar3 = pbnVar;
        hashSet.add(new pej(key, range));
        hashSet.add(new pej(CaptureRequest.CONTROL_AF_MODE, 4));
        hashSet.add(new pej(CaptureRequest.LENS_FOCUS_DISTANCE, (Float) pjoVar.m(CameraCharacteristics.LENS_INFO_HYPERFOCAL_DISTANCE)));
        hashSet.add(new pej(CaptureRequest.NOISE_REDUCTION_MODE, 2));
        int[] iArr = (int[]) ((pjn) pjoVar).n(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES, pjn.c);
        int length2 = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            if (iArr[i4] == 2) {
                hashSet.add(new pej(CaptureRequest.EDGE_MODE, 2));
                break;
            }
            i4++;
        }
        CaptureRequest.Key key2 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
        hbj hbjVar = ikpVar.f;
        gzg gzgVar = gzu.a;
        hashSet.add(new pej(key2, 0));
        hashSet.addAll(kzz.e(nkw.IMAX, pjoVar, ikpVar.e));
        if (hbjVar.p(gzy.j)) {
            Optional optional = ikpVar.c.a;
            if (optional.isPresent()) {
                hashSet.add(new pej((CaptureRequest.Key) optional.get(), ikp.a));
            }
        }
        kzz.f(hashSet, pdsVarA, pjpVar.a(pjrVarE));
        pfu pfuVarA = pfwVar.a(pdsVarA.a());
        pfuVarA.getClass();
        ((ija) obj3).n = pfuVarA;
        pfuVarA.n(hashSet);
        pbnVar3.g();
        Object obj5 = jdhVar.m;
        ((our) obj5).d(new hty(jdhVar, obuVar, 4));
        ((our) obj5).d(jdhVar.e.e(jdhVar.g));
        ((fvu) jdhVar.a).A((gsn) jdhVar.l);
        ((itl) jdhVar.c).b(jdhVar.d);
        ((our) obj5).d(new hye(jdhVar, 3));
        ((our) obj5).d(new hye(jdhVar, 4));
    }

    @Override // defpackage.fqf
    public final synchronized void m() {
        izr izrVar = this.e;
        if (izrVar == null) {
            return;
        }
        rnt.x(izrVar);
        ijo ijoVarB = izrVar.b();
        AtomicInteger atomicInteger = ijoVarB.p;
        ijoVarB.F.b(new hvm(ijoVarB, 19, null));
        ijoVarB.k.onPause();
        ijoVarB.w.c();
        izr izrVar2 = this.e;
        rnt.x(izrVar2);
        ija ijaVarA = izrVar2.a();
        pbc pbcVar = ijaVarA.b;
        pbcVar.f("Received onModuleStop");
        ijaVarA.f.a(false);
        pdn pdnVar = ijaVarA.j;
        if (pdnVar != null) {
            pdnVar.m(ijaVarA.k);
        }
        peo peoVar = ijaVarA.i;
        if (peoVar != null) {
            peoVar.e(null);
        }
        Surface surface = ijaVarA.h;
        if (surface != null) {
            surface.release();
            ijaVarA.h = null;
        }
        ijaVarA.i = null;
        pdn pdnVar2 = ijaVarA.j;
        if (pdnVar2 != null) {
            pdnVar2.close();
        }
        ijaVarA.j = null;
        pbcVar.b("Panorama frameserver closing");
        pfu pfuVar = ijaVarA.n;
        pfuVar.getClass();
        pfuVar.close();
        ijaVarA.n = null;
        ijaVarA.c.b();
        izr izrVar3 = this.e;
        rnt.x(izrVar3);
        ((ikm) izrVar3.p.a()).b();
        izr izrVar4 = this.e;
        rnt.x(izrVar4);
        ((our) izrVar4.w.a()).close();
        this.e = null;
    }

    @Override // defpackage.fqf
    public final synchronized boolean o() {
        izr izrVar = this.e;
        if (izrVar == null) {
            return false;
        }
        ijo ijoVarB = izrVar.b();
        int i = ijoVarB.p.get();
        if (i == 3) {
            ijoVarB.b();
            ijoVarB.h(false, 2);
        } else if (i == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fqf
    public final void w() {
        ngw ngwVar = this.b;
        this.g = new obu((MainActivityLayout) ngwVar.c, (FrameLayout) ngwVar.d);
    }

    public iko(ggg gggVar, hbp hbpVar, Activity activity, ngw ngwVar, nmw nmwVar) {
        this.f = gggVar;
        this.h = hbpVar;
        this.a = activity;
        this.b = ngwVar;
        this.d = nmwVar;
        this.c = new hvm(activity, 16, null);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
