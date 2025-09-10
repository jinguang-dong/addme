package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionThumbnailView;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hna implements jhf, jhe, jhc, jhg, jhh, jfs {
    public final hne b;
    private final FilmstripTransitionLayout c;
    private final hbw e;
    public final Set a = new HashSet();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public hna(hne hneVar, FilmstripTransitionLayout filmstripTransitionLayout, hbw hbwVar) {
        this.b = hneVar;
        this.c = filmstripTransitionLayout;
        this.e = hbwVar;
    }

    public final paq a(fqe fqeVar) {
        this.a.add(fqeVar);
        return new ffx(this, fqeVar, 12, null);
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.d.set(true);
        ValueAnimator valueAnimator = this.c.a;
        if (valueAnimator.isStarted()) {
            valueAnimator.pause();
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.d.set(false);
        hne hneVar = this.b;
        if (hneVar.d()) {
            hna hnaVar = (hna) hneVar.i.a();
            Iterable$EL.forEach(hnaVar.a, new gqw(5));
            hnaVar.c.setVisibility(4);
            hneVar.m.cancel(false);
            hneVar.m = ske.M(Boolean.FALSE);
            hneVar.o = Optional.empty();
        }
        ValueAnimator valueAnimator = this.c.a;
        if (valueAnimator.isPaused()) {
            valueAnimator.resume();
        }
    }

    @Override // defpackage.jhf
    public final void ej() {
        hbw hbwVar = this.e;
        if (hbwVar.a() == 0) {
            syu syuVar = syq.a;
            return;
        }
        hbv hbvVar = new hbv(hbwVar, 1);
        Executor executor = hbwVar.f;
        syu syuVarP = ske.P(hbvVar, executor);
        ske.W(syuVarP, hbwVar.c, executor);
        hbwVar.o.j().d(new gge(syuVarP, 14));
    }

    @Override // defpackage.jhg
    public final void eu() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.c;
        ValueAnimator valueAnimator = filmstripTransitionLayout.a;
        if (valueAnimator.isStarted()) {
            filmstripTransitionLayout.b = true;
            valueAnimator.cancel();
        }
        filmstripTransitionLayout.setVisibility(4);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    public final void f() {
        syu syuVarR;
        Iterable$EL.forEach(this.a, new gqw(4));
        Optional optionalEmpty = Optional.empty();
        out.a();
        hne hneVar = this.b;
        if (hneVar.d()) {
            return;
        }
        nnk nnkVar = hneVar.e;
        if (nnkVar.a() == null) {
            ((sgt) hne.a.c().M(1399)).s("Cannot find Photos package info. Canceling.");
            cxb cxbVar = hneVar.r;
            rkc rkcVar = new rkc((Context) cxbVar.a, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar.s(R.string.photos_required_title);
            rkcVar.l(R.string.photos_required_message);
            rkcVar.q(R.string.play_store_button, new fdf(cxbVar, 6));
            rkcVar.n(android.R.string.cancel, null);
            rkcVar.c();
            return;
        }
        try {
            int applicationEnabledSetting = nnkVar.b.getPackageManager().getApplicationEnabledSetting("com.google.android.apps.photos");
            if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
                try {
                    if (hneVar.e.b.getPackageManager().isPackageSuspended("com.google.android.apps.photos")) {
                        ((sgt) hne.a.c().M(1397)).s("Photos is suspended. Canceling.");
                        Context context = hneVar.b;
                        rwc rwcVarI = rwc.i(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
                        if (!rwcVarI.h() || context.getPackageManager().queryIntentActivities((Intent) rwcVarI.c(), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).isEmpty()) {
                            rwcVarI = rvk.a;
                        }
                        Intent intent = (Intent) rwcVarI.f();
                        intent.getClass();
                        hneVar.q.h(intent);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((sgt) ((sgt) nnk.a.c().i(e)).M((char) 5463)).s("Photos app package not found.");
                }
                hneVar.j.getWindow().setSharedElementsUseOverlay(false);
                optionalEmpty.isPresent();
                rnt.L(!hneVar.d());
                int i = 3;
                if (hneVar.c && ((hbw) hneVar.d.a()).u()) {
                    syuVarR = ske.L(new CancellationException("FilmstripDataAdapter is empty in secure activity"));
                } else {
                    Bitmap bitmapA = hneVar.g.a();
                    if (bitmapA != null) {
                        szh szhVar = new szh();
                        FilmstripTransitionLayout filmstripTransitionLayout = hneVar.f;
                        filmstripTransitionLayout.setVisibility(0);
                        filmstripTransitionLayout.d = hneVar.h;
                        filmstripTransitionLayout.e = false;
                        hnc hncVar = new hnc(hneVar, szhVar);
                        FilmstripTransitionThumbnailView filmstripTransitionThumbnailView = filmstripTransitionLayout.c;
                        synchronized (filmstripTransitionThumbnailView.a) {
                            filmstripTransitionThumbnailView.b = bitmapA;
                            filmstripTransitionThumbnailView.setLayoutParams(new FrameLayout.LayoutParams(filmstripTransitionThumbnailView.b.getWidth(), filmstripTransitionThumbnailView.b.getHeight()));
                            filmstripTransitionThumbnailView.requestLayout();
                            Paint paint = new Paint(1);
                            paint.setShader(new BitmapShader(filmstripTransitionThumbnailView.b, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                            filmstripTransitionThumbnailView.c = new Paint(paint);
                        }
                        ValueAnimator valueAnimator = filmstripTransitionLayout.a;
                        if (valueAnimator.isRunning()) {
                            filmstripTransitionLayout.f = filmstripTransitionLayout.a().a();
                        }
                        filmstripTransitionLayout.i = hncVar;
                        filmstripTransitionLayout.f = filmstripTransitionLayout.a().a();
                        float fB = filmstripTransitionLayout.f.b(1.0f);
                        filmstripTransitionLayout.c.setScaleX(fB);
                        filmstripTransitionLayout.c.setScaleY(fB);
                        PointF pointFC = filmstripTransitionLayout.f.c(1.0f);
                        filmstripTransitionLayout.c.setTranslationX(pointFC.x);
                        filmstripTransitionLayout.c.setTranslationY(pointFC.y);
                        filmstripTransitionLayout.c.b(filmstripTransitionLayout.f.a(1.0f));
                        filmstripTransitionLayout.b(hnh.d(1.0f));
                        valueAnimator.start();
                        syuVarR = szhVar;
                    } else {
                        ((sgt) hne.a.c().M(1403)).s("Thumbnail is null when startLaunchingPhotos. Launch Photos Anyway.");
                        syuVarR = ske.R(new gea(hneVar, i), hneVar.k);
                    }
                }
                fym fymVar = new fym(hneVar, i);
                sxo sxoVar = sxo.a;
                hneVar.m = swf.i(syuVarR, CancellationException.class, fymVar, sxoVar);
                ske.W(hneVar.m, new fxw(hneVar, 4), sxoVar);
                return;
            }
        } catch (IllegalArgumentException e2) {
            ((sgt) ((sgt) nnk.a.c().i(e2)).M((char) 5462)).s("Photos app package not found.");
        }
        ((sgt) hne.a.c().M(1398)).s("Photos is disabled. Canceling.");
        cxb cxbVar2 = hneVar.r;
        rkc rkcVar2 = new rkc((Context) cxbVar2.a, R.style.Theme_Camera_MaterialAlertDialog);
        rkcVar2.s(R.string.photos_disabled_title);
        rkcVar2.l(R.string.photos_disabled_message);
        rkcVar2.q(R.string.settings_button, new fdf(cxbVar2, 5));
        rkcVar2.n(android.R.string.cancel, null);
        rkcVar2.c();
    }

    public final boolean g() {
        return this.b.d();
    }

    @Override // defpackage.jfs
    public final boolean r() {
        return this.b.d();
    }
}
