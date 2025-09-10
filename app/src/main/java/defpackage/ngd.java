package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.ar.core.R;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ngd implements SurfaceHolder.Callback2, paq {
    private static final sgv d = sgv.g("ngd");
    private static int e = 0;
    public final String a;
    public final SurfaceView b;
    public final Consumer c;
    private final FrameLayout f;
    private final pbn g;
    private final ngp h;
    private boolean i = false;
    private szh j;
    private final mex k;
    private final mwq l;

    public ngd(Context context, ngw ngwVar, CameraActivityTiming cameraActivityTiming, mes mesVar, hbj hbjVar, pbn pbnVar, mwq mwqVar, nge ngeVar, ngp ngpVar, Consumer consumer) {
        int i = e;
        e = i + 1;
        String str = "ViewfinderSV" + i;
        this.a = str;
        FrameLayout frameLayout = (FrameLayout) ngwVar.d;
        this.f = frameLayout;
        nfw nfwVar = new nfw(context, str);
        this.b = nfwVar;
        this.h = ngpVar;
        this.g = pbnVar;
        this.c = consumer;
        this.k = (mex) mesVar.a();
        this.l = mwqVar;
        SurfaceHolder holder = nfwVar.getHolder();
        if (ngpVar.d.h()) {
            ((Integer) ngpVar.d.c()).intValue();
            rnt.s(true);
            ((Integer) ngpVar.d.c()).intValue();
            holder.setFormat(35);
        }
        szh szhVar = new szh();
        this.j = szhVar;
        szhVar.c(new mvn(pbnVar.a("ViewfinderSurface"), 6), sxo.a);
        holder.addCallback(this);
        holder.addCallback(ngeVar);
        pas pasVar = ngpVar.b;
        holder.setFixedSize(pasVar.a, pasVar.b);
        if (hbjVar.p(gzo.aX)) {
            nfwVar.setBackground(context.getResources().getDrawable(R.drawable.viewfinder_rounded_background, null));
            nfwVar.setClipToOutline(true);
        }
        frameLayout.addView(nfwVar, new FrameLayout.LayoutParams(-1, -1));
        cameraActivityTiming.l(mej.ACTIVITY_SURFACE_VIEW_CREATED, CameraActivityTiming.a);
    }

    private final void b(String str) {
        out.a();
        szh szhVar = this.j;
        if (szhVar == null || szhVar.isDone()) {
            return;
        }
        this.j.a(new pco(str));
    }

    public final syu a() {
        out.a();
        return this.j;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        out.a();
        b("Closed");
        SurfaceView surfaceView = this.b;
        surfaceView.getHolder().removeCallback(this);
        this.f.removeView(surfaceView);
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        rnt.L(!this.i);
        pbn pbnVar = this.g;
        pbnVar.f("surfaceChanged");
        pas pasVar = new pas(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        surfaceHolder.getSurfaceFrame();
        pae.g(pasVar);
        if (!this.j.isDone() && surface.isValid()) {
            pae paeVarG = pae.g(pasVar);
            ngp ngpVar = this.h;
            pae paeVarF = ngpVar.c.f();
            if (a.K(paeVarG, paeVarF)) {
                pas pasVar2 = ngpVar.b;
                this.k.j(mfe.VIEWFINDER_SURFACE_READY);
                pbnVar.f("surfaceRequest.set");
                this.j.e(qpt.aS(surface, i, new pas(i2, i3).c(), false, new ktp(this, 12)));
                pbnVar.g();
            } else {
                paeVarG.f();
                paeVarF.f();
            }
        }
        Iterator it = this.l.a.iterator();
        while (it.hasNext()) {
            Object obj = ((AmbientModeSupport.AmbientController) it.next()).a;
            synchronized (obj) {
                if (((ipk) obj).J != null) {
                    if (((ipk) obj).h(iqh.SATURN)) {
                        ((ipk) obj).k();
                        ipt iptVar = ((ipk) obj).I;
                        dtm dtmVar = ((ipk) obj).J;
                        dtmVar.getClass();
                        SurfaceView surfaceViewA = iptVar.a(dtmVar.a);
                        if (((nkw) ((ipk) obj).d.dL()).c()) {
                            ((ipk) obj).j(surfaceViewA);
                            dtm dtmVar2 = ((ipk) obj).J;
                            dtmVar2.getClass();
                            ConstraintLayout constraintLayout = ((ipk) obj).A;
                            constraintLayout.getClass();
                            dtmVar2.b(constraintLayout);
                        } else {
                            dtm dtmVar3 = ((ipk) obj).J;
                            dtmVar3.getClass();
                            dtmVar3.b(surfaceViewA);
                        }
                        ((ipk) obj).r();
                        ((ipk) obj).m();
                    }
                }
            }
        }
        pbnVar.g();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        rnt.L(!this.i);
        this.k.j(mfe.VIEWFINDER_SURFACE_CREATED);
        if (this.j.isDone()) {
            ((sgt) d.c().M(5362)).E("%s: surfaceChanged was already called or cancelled: %s", this.a, ojl.ci(this.j));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        rnt.L(!this.i);
        b("Surface has been destroyed.");
        this.j = new szh();
        this.k.close();
        Iterator it = this.l.b.iterator();
        while (it.hasNext()) {
            iyu iyuVar = (iyu) ((AmbientMode.AmbientController) it.next()).a;
            iyuVar.f.h();
            fdq fdqVar = iyuVar.I;
            if (fdqVar.f() && !fdqVar.g()) {
                iyuVar.z = true;
                iyuVar.l.z();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        rnt.L(!this.i);
    }
}
