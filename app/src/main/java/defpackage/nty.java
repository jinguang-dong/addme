package defpackage;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nty extends ntt {
    public static final sgv f = sgv.g("nty");
    private final out a;
    public final ManualWhiteBalanceUi g;
    public final ObjectAnimator h;
    public final owq i = new ovx(true);
    public final Runnable j = new ntd(this, 5);
    public final mwq k;

    public nty(ManualWhiteBalanceUi manualWhiteBalanceUi, out outVar, mwq mwqVar) {
        this.g = manualWhiteBalanceUi;
        this.a = outVar;
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(manualWhiteBalanceUi.getContext(), R.animator.fade_in);
        objectAnimator.setTarget(manualWhiteBalanceUi);
        objectAnimator.addListener(new jfi(this, manualWhiteBalanceUi, 2));
        this.h = objectAnimator;
        this.k = mwqVar;
    }

    public final void k() {
        this.g.removeCallbacks(this.j);
    }

    public final void l(boolean z, boolean z2) {
        this.a.c(new nto(this, z2, z, 3));
    }

    public final void m() {
        this.i.a(true);
    }

    public final void n(boolean z, boolean z2) {
        this.a.c(new nto(this, z2, z, 4));
    }
}
