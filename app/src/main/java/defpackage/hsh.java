package defpackage;

import android.animation.AnimatorSet;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hsh {
    public static final sgv a = sgv.g("hsh");
    public final uem b;
    public CatcherView c;
    public final pmg d;

    public hsh(uem uemVar, pmg pmgVar) {
        this.b = uemVar;
        this.d = pmgVar;
    }

    public final void a() {
        out.a();
        CatcherView catcherView = this.c;
        catcherView.r = 1;
        AnimatorSet animatorSet = catcherView.q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pmg pmgVar = catcherView.s;
        if (pmgVar != null) {
            ((CatcherView) pmgVar.c).r = 1;
            ((AnimatorSet) pmgVar.b).cancel();
        }
    }

    public final void b() {
        out.a();
        CatcherView catcherView = this.c;
        catcherView.r = 5;
        catcherView.setVisibility(0);
    }

    public final int c() {
        out.a();
        return this.c.r;
    }
}
