package defpackage;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Animatable2;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndh implements ncq {
    public static final /* synthetic */ int c = 0;
    public final ShutterButton a;
    private Animatable2 f;
    public final ArgbEvaluator b = new ArgbEvaluator();
    private final Set d = new LinkedHashSet();
    private final Set e = new LinkedHashSet();
    private final Map g = qpt.bf(new ArrayList());

    static {
        EnumSet.of(ncn.PHOTO_IDLE, ncn.PORTRAIT_IDLE, ncn.IMAX_IDLE, ncn.CATSHARK_PHOTO_IDLE, ncn.CATSHARK_PORTRAIT_IDLE, ncn.NIGHT_IDLE, ncn.ASTRO_IDLE, ncn.LANDSCAPE_IDLE, ncn.ACTION_PAN_IDLE, ncn.TIMELAPSE_IDLE, ncn.AUTOTIMER_IDLE, ncn.PHOTOSPHERE_IDLE, ncn.SERENGETI_IDLE, ncn.COTTAGE_IDLE, ncn.SQUAD_IDLE).getClass();
        EnumSet.of(ncn.VIDEO_IDLE, ncn.TIMELAPSE_IDLE, ncn.SLOW_MOTION_IDLE, ncn.LEOPARD_IDLE, ncn.AMBER_IDLE, ncn.ROOSTER_IDLE, ncn.VIDEO_NIGHT_SIGHT_IDLE).getClass();
    }

    public ndh(ShutterButton shutterButton) {
        this.a = shutterButton;
    }

    static /* synthetic */ void c(ndh ndhVar, int i, int i2, uiq uiqVar) {
        mmw mmwVar = mmr.d;
        if (i == i2) {
            return;
        }
        ndhVar.e(0.0f, 1.0f, mmwVar, new ndf(uiqVar, ndhVar, i, i2, 0)).k(0.00390625f);
    }

    static /* synthetic */ cto d(ndh ndhVar, int i, int i2, uiq uiqVar) {
        return ndhVar.e(i, i2, mmr.a, new ndd(uiqVar, 2));
    }

    private final cto e(float f, float f2, mmw mmwVar, final uiq uiqVar) {
        cto ctoVar = new cto(new ctn(f), f2);
        ctoVar.p = Math.min(f, f2);
        ctoVar.o = Math.max(f, f2);
        ctoVar.l(f);
        jea.s(ctoVar, mmwVar);
        ctoVar.j(new cth() { // from class: nde
            @Override // defpackage.cth
            public final void l(float f3) {
                uiqVar.a(Float.valueOf(f3));
                this.a.invalidate();
            }
        });
        this.d.add(ctoVar);
        return ctoVar;
    }

    private final void f(rwc rwcVar) {
        ShutterButton shutterButton = this.a;
        ndv ndvVar = shutterButton.j;
        ndvVar.a = rvk.a;
        ndvVar.l(rwcVar);
        shutterButton.invalidate();
    }

    @Override // defpackage.ncq
    public final ViewPropertyAnimator a(float f, int i) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.a.animate();
        viewPropertyAnimatorAnimate.setDuration(i);
        viewPropertyAnimatorAnimate.scaleX(f).scaleY(f);
        viewPropertyAnimatorAnimate.getClass();
        return viewPropertyAnimatorAnimate;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0135  */
    @Override // defpackage.ncq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.pez b(defpackage.ndw r10) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndh.b(ndw):pez");
    }
}
