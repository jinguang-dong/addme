package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.GestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fqy implements TextureView.SurfaceTextureListener, jfs {
    public static final sgv a = sgv.g("fqy");
    public final iyu A;
    public final hgc B;
    public final qqv C;
    private final mts D;
    private final fvu E;
    private final itl F;
    private final CaptureAnimationOverlay G;
    private final hem H;
    private final nbo I;
    private final nbo J;
    private final nbo K;
    private final mpx L;
    private final uem M;
    private final nmw N;
    private final lqg P;
    private final krj Q;
    private final mdi R;
    private final fdq S;
    private final hbj U;
    public final ConstraintLayout b;
    public final mzz c;
    public final ViewfinderCover d;
    public final MainActivityLayout e;
    public final FrameLayout f;
    public final ShutterButton g;
    public final ndj h;
    public final hfn i;
    public final mwn j;
    public final DisplayManager.DisplayListener k;
    public int l;
    public final PreviewOverlay m;
    public nbr n;
    public final moc p;
    public nbo q;
    public final ngk r;
    public SurfaceTexture s;
    public int t;
    public int u;
    public final DisplayManager v;
    public final WindowManager w;
    public final CameraActivityTiming x;
    public final Consumer y;
    public boolean z;
    public final View.OnLayoutChangeListener o = new fqu();
    private int T = 1;
    private szh O = new szh();

    public fqy(iyu iyuVar, MainActivityLayout mainActivityLayout, ngw ngwVar, mwq mwqVar, mye myeVar, ngk ngkVar, fdq fdqVar, DisplayManager displayManager, WindowManager windowManager, moc mocVar, mpx mpxVar, hna hnaVar, fvu fvuVar, ndj ndjVar, itl itlVar, CameraActivityTiming cameraActivityTiming, uem uemVar, mzz mzzVar, mts mtsVar, krj krjVar, Consumer consumer, hfn hfnVar, hbj hbjVar, lqg lqgVar, nmw nmwVar, hem hemVar, mdi mdiVar) {
        iyuVar.getClass();
        this.A = iyuVar;
        this.e = mainActivityLayout;
        this.r = ngkVar;
        this.M = uemVar;
        this.S = fdqVar;
        this.v = displayManager;
        this.w = windowManager;
        mpxVar.getClass();
        this.L = mpxVar;
        this.p = mocVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) mwqVar.a;
        this.b = constraintLayout;
        this.E = fvuVar;
        this.h = ndjVar;
        this.F = itlVar;
        this.c = mzzVar;
        this.D = mtsVar;
        this.Q = krjVar;
        this.i = hfnVar;
        this.P = lqgVar;
        this.U = hbjVar;
        this.N = nmwVar;
        this.H = hemVar;
        this.R = mdiVar;
        this.d = (ViewfinderCover) ((ocq) mwqVar.b).c(R.id.viewfinder_cover);
        this.x = cameraActivityTiming;
        this.y = consumer;
        fdqVar.j().d(mocVar.b(new fqv(hnaVar)));
        fdqVar.j().d(hnaVar.a(new iys(this, 1)));
        this.l = qpt.cf(windowManager);
        fqw fqwVar = new fqw(this);
        this.k = fqwVar;
        displayManager.registerDisplayListener(fqwVar, null);
        this.g = (ShutterButton) ((ocq) ngwVar.j).c(R.id.shutter_button);
        ocq ocqVarK = ocq.k(constraintLayout);
        this.f = (FrameLayout) ocqVarK.c(R.id.module_layout);
        this.m = (PreviewOverlay) ocqVarK.c(R.id.preview_overlay);
        this.G = (CaptureAnimationOverlay) ocqVarK.c(R.id.capture_animation_overlay);
        this.B = new hgc((byte[]) null);
        hfnVar.a((DebugCanvasView) ocqVarK.c(R.id.debug_viz_view));
        this.j = new mwn((ViewStub) ocqVarK.c(R.id.hotshot_view_stub), hbjVar);
        this.C = new qqv((ViewStub) ocqVarK.c(R.id.face_indicator_view_stub), hbjVar);
        int i = nbt.a;
        nbp nbpVar = new nbp(new nbt((ConstraintLayout) mainActivityLayout.findViewById(R.id.activity_root_view), myeVar, windowManager, this));
        this.K = nbpVar;
        this.q = nbpVar;
        nbp nbpVar2 = new nbp(new nbu(ngkVar));
        this.I = nbpVar2;
        this.J = nbpVar2;
        ((FrameLayout) ngwVar.d).setImportantForAccessibility(1);
        ((FrameLayout) ngwVar.d).setAccessibilityDelegate(new fqx());
    }

    private final void v(boolean z) {
        this.E.l(z);
        this.D.d(z);
    }

    public final rwc a() {
        return this.q.c(this.N);
    }

    public final void b() {
        this.q.f();
    }

    public final void c() {
        CaptureAnimationOverlay captureAnimationOverlay = this.G;
        AnimatorSet animatorSet = captureAnimationOverlay.d;
        if (animatorSet != null && animatorSet.isRunning()) {
            captureAnimationOverlay.d.cancel();
        }
        captureAnimationOverlay.e = 1;
        captureAnimationOverlay.setVisibility(4);
    }

    public final void d() {
        if (this.S.f()) {
            return;
        }
        this.c.c();
        this.L.c();
    }

    public final void e() {
        this.E.p(false);
    }

    public final void f() {
        this.E.p(true);
    }

    public final void g() {
        this.E.m(true);
        this.h.M(true);
        this.F.k(1);
    }

    public final void h(boolean z, boolean z2) {
        hem hemVar = this.H;
        mdi mdiVar = this.R;
        List listE = hemVar.e();
        int iIntValue = ((Integer) mdiVar.p.dL()).intValue();
        mdy mdyVar = mdiVar.q;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (mdyVar.k && !z) {
            mdyVar.l = jElapsedRealtimeNanos;
        }
        mdyVar.k = z;
        if (!mdiVar.i && z && mdiVar.j != 0) {
            mdiVar.c.a();
            mdiVar.c = pbp.a;
            tpc tpcVarM = snt.a.m();
            long j = mdiVar.j;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            snt sntVar = (snt) tphVar;
            sntVar.b |= 1;
            sntVar.c = j;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            snt sntVar2 = (snt) tpcVarM.b;
            sntVar2.b |= 2;
            sntVar2.d = jElapsedRealtimeNanos;
            int size = mdiVar.k.size();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            snt sntVar3 = (snt) tpcVarM.b;
            sntVar3.b |= 8;
            sntVar3.f = size;
            int size2 = listE.size();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            snt sntVar4 = (snt) tphVar2;
            sntVar4.b |= 16;
            sntVar4.g = size2;
            int i = mdiVar.l;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            tph tphVar3 = tpcVarM.b;
            snt sntVar5 = (snt) tphVar3;
            sntVar5.b |= 32;
            sntVar5.h = i;
            int i2 = mdiVar.n;
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            tph tphVar4 = tpcVarM.b;
            snt sntVar6 = (snt) tphVar4;
            sntVar6.b |= 64;
            sntVar6.i = i2;
            if (!tphVar4.C()) {
                tpcVarM.o();
            }
            tph tphVar5 = tpcVarM.b;
            snt sntVar7 = (snt) tphVar5;
            sntVar7.b |= 128;
            sntVar7.j = iIntValue;
            List list = mdiVar.k;
            if (!tphVar5.C()) {
                tpcVarM.o();
            }
            snt sntVar8 = (snt) tpcVarM.b;
            tpq tpqVar = sntVar8.k;
            if (!tpqVar.c()) {
                sntVar8.k = tph.u(tpqVar);
            }
            tnq.e(list, sntVar8.k);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            snt sntVar9 = (snt) tpcVarM.b;
            tpq tpqVar2 = sntVar9.l;
            if (!tpqVar2.c()) {
                sntVar9.l = tph.u(tpqVar2);
            }
            tnq.e(listE, sntVar9.l);
            long j2 = mdiVar.m;
            if (j2 > 0) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                snt sntVar10 = (snt) tpcVarM.b;
                sntVar10.b |= 256;
                sntVar10.m = j2;
            }
            tpc tpcVarM2 = sod.a.m();
            soc socVar = soc.BLOCK_SHOT;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sod sodVar = (sod) tpcVarM2.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            ssc sscVar = mdyVar.n;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            snt sntVar11 = (snt) tpcVarM.b;
            sntVar11.e = sscVar.T;
            sntVar11.b |= 4;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            sod sodVar2 = (sod) tpcVarM2.b;
            snt sntVar12 = (snt) tpcVarM.l();
            sntVar12.getClass();
            sodVar2.u = sntVar12;
            sodVar2.b |= ImageMetadata.SHADING_MODE;
            mdyVar.I(tpcVarM2);
            snt sntVar13 = (snt) tpcVarM.b;
            Duration durationOfNanos = Duration.ofNanos(sntVar13.d - sntVar13.c);
            snt sntVar14 = (snt) tpcVarM.b;
            Duration durationOfNanos2 = (sntVar14.b & 256) != 0 ? Duration.ofNanos(sntVar14.d - sntVar14.m) : Duration.ZERO;
            durationOfNanos.toMillis();
            durationOfNanos2.toMillis();
            snt sntVar15 = (snt) tpcVarM.b;
            int i3 = sntVar15.f;
            int i4 = sntVar15.g;
            int i5 = sntVar15.i;
            int i6 = sntVar15.j;
            mdiVar.e += durationOfNanos.toMillis();
            mdiVar.d = Math.max(durationOfNanos.toMillis(), mdiVar.d);
            mdiVar.g += durationOfNanos2.toMillis();
            mdiVar.f = Math.max(durationOfNanos2.toMillis(), mdiVar.f);
            mdiVar.h++;
            if (mdiVar.o && z2 && ((jElapsedRealtimeNanos - mdiVar.j) / 1000000 > mdiVar.b || mdiVar.l > 0)) {
                cxb cxbVar = mdiVar.r;
                cxb.I();
            }
        }
        if (mdiVar.i && !z) {
            mdiVar.j = jElapsedRealtimeNanos;
            mdiVar.k = listE;
            mdiVar.n = iIntValue;
            mdiVar.m = 0L;
            mdiVar.c = mdiVar.a.a("BlockedShot");
        }
        mdiVar.i = z;
        if (z) {
            return;
        }
        mdiVar.o = z2;
    }

    public final void i() {
        mdi mdiVar = this.R;
        mdiVar.l = mdiVar.i ? 0 : mdiVar.l + 1;
    }

    public final void j() {
        this.R.m = SystemClock.elapsedRealtimeNanos();
    }

    public final void k() {
        this.d.f(this.A.p);
    }

    public final void l(boolean z, boolean z2) {
        Runnable japVar = new jap(this, z, z2, 1);
        if (!z) {
            japVar.run();
        }
        ndj ndjVar = this.h;
        if (!z) {
            japVar = new fij(4);
        }
        ndjVar.P(z, japVar);
    }

    public final void m(boolean z) {
        this.h.O(z);
    }

    public final void n() {
        if (this.T == 1) {
            return;
        }
        try {
            this.q.e().get(2000L, TimeUnit.MILLISECONDS);
            this.T = 1;
        } catch (InterruptedException | ExecutionException unused) {
            throw new IllegalStateException("Synchronization close failed on preview switch.");
        } catch (TimeoutException e) {
            throw new IllegalStateException("Surface Destruction Synchronization on Module Switch Timed out.", e);
        }
    }

    public final void o() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.76f, 0.76f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.76f, 0.0f);
        valueAnimatorOfFloat.setDuration(66L);
        valueAnimatorOfFloat2.setDuration(166L);
        CaptureAnimationOverlay captureAnimationOverlay = this.G;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = captureAnimationOverlay.c;
        valueAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfFloat2.addUpdateListener(animatorUpdateListener);
        Interpolator interpolator = captureAnimationOverlay.b;
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat2.setInterpolator(interpolator);
        valueAnimatorOfFloat.addListener(new nhe(captureAnimationOverlay, valueAnimatorOfFloat2));
        valueAnimatorOfFloat2.addListener(new nhf(captureAnimationOverlay));
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = surfaceTexture;
        this.t = i;
        this.u = i2;
        nbr nbrVar = this.n;
        if (nbrVar != null) {
            nbrVar.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.s = null;
        nbr nbrVar = this.n;
        if (nbrVar == null) {
            return false;
        }
        nbrVar.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.s = surfaceTexture;
        this.t = i;
        this.u = i2;
        nbr nbrVar = this.n;
        if (nbrVar != null) {
            nbrVar.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.s = surfaceTexture;
    }

    public final void p() {
        this.G.a(true);
        v(false);
    }

    public final void q() {
        this.G.a(false);
        v(true);
    }

    @Override // defpackage.jfs
    public final boolean r() {
        krj krjVar = this.Q;
        if (!krjVar.t()) {
            return this.A.l.o();
        }
        krjVar.v(3);
        return true;
    }

    public final void s() {
        this.z = false;
        this.d.k();
        if (this.U.p(gys.d)) {
            lqg lqgVar = this.P;
            iyu iyuVar = this.A;
            Object obj = lqgVar.d;
            nkw nkwVar = iyuVar.p;
            synchronized (obj) {
                if (lqgVar.h != null && lqgVar.g != null) {
                    if (lqgVar.a && ((goi) lqgVar.f.dL()).c() && !lqgVar.k.b() && nlj.k(lqgVar.g)) {
                        Handler handler = lqgVar.b;
                        handler.removeCallbacks(lqgVar.i);
                        lqgVar.i = new kee(lqgVar, nkwVar, 18);
                        handler.postDelayed(lqgVar.i, 500L);
                    } else {
                        lqgVar.h.setVisibility(4);
                    }
                    lqgVar.a = false;
                }
            }
        }
        mep mepVarB = ((iyw) this.M).a();
        meo meoVar = meo.MODE_SWITCH_FIRST_PREVIEW;
        if (!mepVarB.n(meoVar)) {
            mepVarB.j(meoVar);
            mepVarB.a.a();
            mepVarB.a = pbp.a;
            this.O.e(Object.class);
            this.O = new szh();
        }
        if (this.x.n(mej.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED)) {
            return;
        }
        Choreographer.getInstance().postFrameCallback(new nfs(this, 1));
    }

    public final void t() {
        this.E.l(true);
    }

    public final void u(int i, nbr nbrVar) {
        nbo nboVar;
        nbo nboVar2 = this.I;
        nboVar2.getClass();
        nbo nboVar3 = this.J;
        nboVar3.getClass();
        nbo nboVar4 = this.K;
        nboVar4.getClass();
        a.I(true);
        int i2 = this.T;
        if (i == i2) {
            this.n = nbrVar;
        } else {
            this.n = null;
            if (i2 != 1 && (nboVar = this.q) != null) {
                nboVar.e();
            }
            this.n = nbrVar;
            nboVar2.getClass();
            nboVar3.getClass();
            nboVar4.getClass();
            if (i - 1 == 2) {
                nboVar2 = nboVar4;
            } else if (this.q == nboVar2) {
                nboVar2 = nboVar3;
            }
            this.q = nboVar2;
            this.T = i;
            nboVar2.getClass();
            nboVar2.d();
        }
        nbr nbrVar2 = this.n;
        if (nbrVar2 != null) {
            GestureDetector.OnGestureListener onGestureListenerA = nbrVar2.a();
            if (onGestureListenerA != null) {
                PreviewOverlay previewOverlay = this.m;
                previewOverlay.a = new GestureDetector(previewOverlay.getContext(), onGestureListenerA);
            }
            View.OnTouchListener onTouchListenerB = this.n.b();
            if (onTouchListenerB != null) {
                this.m.b = onTouchListenerB;
            }
        }
    }
}
