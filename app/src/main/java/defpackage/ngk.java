package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import android.view.SurfaceView;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ngk {
    public static final sgv a = sgv.g("ngk");
    public final MainActivityLayout c;
    public final pbn d;
    public final nmw e;
    public ngd f;
    public ngp g;
    public boolean h;
    public final ktx l;
    private final owf m;
    private paq n;
    private final hbj o;
    private final ocq p;
    public rwc i = rvk.a;
    public pka j = pka.BACK;
    public int k = -1;
    public final Object b = new Object();

    public ngk(ktx ktxVar, MainActivityLayout mainActivityLayout, pbn pbnVar, ocq ocqVar, owf owfVar, nmw nmwVar, hbj hbjVar, fdq fdqVar) {
        this.l = ktxVar;
        this.c = mainActivityLayout;
        this.d = pbnVar;
        this.m = owfVar;
        this.e = nmwVar;
        this.o = hbjVar;
        this.p = ocqVar;
        fdqVar.j().d(new ngh(this, 0));
    }

    public static Bitmap a(Bitmap bitmap, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.postRotate(-i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix.isIdentity() ? bitmap : Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap b(SurfaceView surfaceView, int i, int i2, nmw nmwVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        nmwVar.a(surfaceView, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public static Size c(int i, int i2, pao paoVar, int i3) {
        return (paoVar.equals(pao.CLOCKWISE_0) || paoVar.equals(pao.c)) ? new Size(i / i3, i2 / i3) : new Size(i2 / i3, i / i3);
    }

    private final void j() {
        ngd ngdVar = this.f;
        if (ngdVar != null) {
            ngdVar.close();
            this.f = null;
        }
        paq paqVar = this.n;
        if (paqVar != null) {
            paqVar.close();
            this.n = null;
        }
        this.i = rvk.a;
    }

    public final rwc d() {
        rwc rwcVar;
        synchronized (this.b) {
            rwcVar = this.i;
        }
        return rwcVar;
    }

    public final rwc e(final boolean z, final int i, final pao paoVar) throws Throwable {
        final ngk ngkVar;
        synchronized (this.b) {
            ngd ngdVar = this.f;
            if (ngdVar == null) {
                ((sgt) a.c().M(5367)).s("getScreenshot(): the surfaceViewAdapter is null");
                return rvk.a;
            }
            final SurfaceView surfaceView = ngdVar.b;
            final Size size = new Size(surfaceView.getWidth(), surfaceView.getHeight());
            try {
                this.d.f("getScreenshot");
                try {
                    ngkVar = this;
                } catch (Throwable th) {
                    th = th;
                    ngkVar = this;
                }
                try {
                    rwc rwcVar = (rwc) d().b(new rvu() { // from class: ngi
                        @Override // defpackage.rvu
                        public final Object apply(Object obj) {
                            pao paoVarB = this.a.l.b();
                            int i2 = i;
                            Size size2 = size;
                            Size sizeC = ngk.c(size2.getWidth(), size2.getHeight(), paoVarB, i2);
                            rwc rwcVarC = ((ngo) obj).c(sizeC.getWidth(), sizeC.getHeight());
                            if (!rwcVarC.h()) {
                                return rvk.a;
                            }
                            return rwc.j(ngq.b(ngk.a((Bitmap) rwcVarC.c(), paoVar.a(), z), i2));
                        }
                    }).d(new rww() { // from class: ngj
                        @Override // defpackage.rww
                        public final Object fr() {
                            SurfaceView surfaceView2 = surfaceView;
                            ngk ngkVar2 = this.a;
                            pao paoVarB = ngkVar2.l.b();
                            if (surfaceView2.getHolder().getSurface() == null) {
                                ((sgt) ngk.a.c().M(5372)).s("This shouldn't happen outside unit test");
                                return rvk.a;
                            }
                            if (!surfaceView2.getHolder().getSurface().isValid()) {
                                ((sgt) ngk.a.c().M(5371)).s("getScreenshotFrom(): the surface is not valid");
                                return rvk.a;
                            }
                            int i2 = i;
                            Size sizeC = ngk.c(surfaceView2.getWidth(), surfaceView2.getHeight(), paoVarB, i2);
                            if (sizeC.getWidth() <= 0 || sizeC.getHeight() <= 0) {
                                ((sgt) ngk.a.c().M(5370)).s("getScreenshotFrom(): the surface size is invalid");
                                return rvk.a;
                            }
                            nmw nmwVar = ngkVar2.e;
                            boolean z2 = z;
                            pao paoVar2 = paoVar;
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeC.getWidth(), sizeC.getHeight(), Bitmap.Config.ARGB_8888);
                            nmwVar.a(surfaceView2, bitmapCreateBitmap);
                            return rwc.j(ngq.b(ngk.a(bitmapCreateBitmap, paoVar2.a(), z2), i2));
                        }
                    });
                    ngkVar.d.g();
                    return rwcVar;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    ngkVar.d.g();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                ngkVar = this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, tzx] */
    public final syu f(ngp ngpVar) {
        out.a();
        ktp ktpVar = new ktp(this, 13);
        uh uhVar = (uh) this.p.a;
        Context contextB = ((imm) uhVar.f).b();
        ngw ngwVarA = ((ngx) uhVar.b).a();
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) uhVar.i.a();
        mes mesVar = (mes) uhVar.e.a();
        ngd ngdVar = new ngd(contextB, ngwVarA, cameraActivityTiming, mesVar, (hbj) uhVar.g.a(), (pbn) uhVar.h.a(), (mwq) uhVar.d.a(), ((ngf) uhVar.a).a(), ngpVar, ktpVar);
        this.f = ngdVar;
        rnt.x(ngdVar);
        return ngdVar.a();
    }

    public final syu g(ngp ngpVar, Integer num) {
        syu syuVarF;
        this.d.f("swapAndStartSurfaceViewViewfinder");
        synchronized (this.b) {
            if (this.h && this.f != null && ngpVar.equals(this.g)) {
                this.h = false;
                syuVarF = this.f.a();
            } else {
                j();
                syuVarF = f(ngpVar);
                this.g = ngpVar;
                rnt.x(this.f);
            }
        }
        if (this.o.p(gza.d)) {
            this.n = this.m.dK(new mix(this, 18), out.a);
            MainActivityLayout mainActivityLayout = this.c;
            pas pasVar = ngpVar.b;
            mainActivityLayout.o(new Size(pasVar.a, pasVar.b));
        } else {
            MainActivityLayout mainActivityLayout2 = this.c;
            pas pasVar2 = ngpVar.b;
            mainActivityLayout2.m(pasVar2.a, pasVar2.b, num);
        }
        this.d.g();
        return syuVarF;
    }

    public final void h() {
        synchronized (this.b) {
            j();
        }
    }

    public final void i(Size size) {
        this.c.q = size;
    }
}
