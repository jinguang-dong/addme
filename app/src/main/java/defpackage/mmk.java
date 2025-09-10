package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceKnob;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmk {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final rwc e;
    public final fdq f;
    public final hie g;
    private final tzj h;
    private final nas i;
    private final int j;
    private final int k;
    private final owf l;
    private final pmg m;

    public mmk(fdq fdqVar, pmg pmgVar, Context context, hie hieVar, tzj tzjVar, rwc rwcVar, out outVar, nas nasVar, owf owfVar) {
        this.f = fdqVar;
        this.m = pmgVar;
        this.g = hieVar;
        this.h = tzjVar;
        this.e = rwcVar;
        this.i = nasVar;
        this.j = context.getResources().getInteger(R.integer.control_3a_visibility_timeout_ms);
        this.k = context.getResources().getInteger(R.integer.extend_3a_visibility_timeout_ms);
        this.l = owfVar;
        ArrayList arrayListAD = ujp.aD(hieVar.b);
        if (rwcVar.h()) {
            arrayListAD.add(((ntr) rwcVar.c()).g);
        }
        fdqVar.j().d(new owe(arrayListAD).dK(new lqn(this, 19), outVar));
    }

    public final int a() {
        return ((Boolean) ((ovx) ((FocusIndicatorView) this.h.a()).j).d).booleanValue() ? this.j + this.k : this.j;
    }

    public final void b(boolean z) {
        rwc rwcVar = this.e;
        if (rwcVar.h()) {
            ((ntr) rwcVar.c()).a(z, false);
        }
        this.g.f(z);
        c();
    }

    public final void c() {
        nas nasVar = this.i;
        nasVar.l.f(nasVar.g);
    }

    public final void d(boolean z) {
        rwc rwcVar = this.e;
        if (rwcVar.h()) {
            ntr ntrVar = (ntr) rwcVar.c();
            if (ntrVar.o.d()) {
                return;
            }
            if (ntrVar.k == null) {
                jsv.J(ntrVar.m != null, ntrVar.s);
                float dimensionPixelSize = ntrVar.m.getResources().getDimensionPixelSize(R.dimen.manual_wb_slider_margin_between_timer);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ntrVar.m.b(), (Property<SeekBar, Float>) View.TRANSLATION_X, dimensionPixelSize);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ntrVar.m.c(), (Property<ManualWhiteBalanceKnob, Float>) View.TRANSLATION_X, dimensionPixelSize);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(ntrVar.m.a(), (Property<ImageButton, Float>) View.TRANSLATION_X, dimensionPixelSize);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.setDuration(300L);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                ntrVar.k = animatorSet;
            }
            if (z) {
                ntrVar.k.start();
            } else if (ntrVar.p) {
                ntrVar.k.reverse();
            }
            ntrVar.p = z;
            if (ntrVar.m.getVisibility() != 0) {
                ntrVar.k.end();
            }
        }
    }

    public final fcy e() throws Resources.NotFoundException {
        boolean z;
        nkw nkwVar = (nkw) this.l.dL();
        boolean z2 = (nkwVar == nkw.SERENGETI || nkwVar == nkw.COTTAGE) ? false : true;
        rwc rwcVar = this.e;
        if (rwcVar.h()) {
            ntr ntrVar = (ntr) rwcVar.c();
            z = !((Boolean) ((ovx) ntrVar.f).d).booleanValue();
            if (z2) {
                ntrVar.f(true, z);
                ntrVar.h(a());
            }
        } else {
            z = true;
        }
        hie hieVar = this.g;
        boolean z3 = !((Boolean) ((ovx) hieVar.c).d).booleanValue();
        pmg pmgVar = this.m;
        Object obj = pmgVar.c;
        if (obj != null) {
            ((fcy) obj).close();
            pmgVar.c = null;
        }
        boolean z4 = z & z3;
        if (z4) {
            ((hie) pmgVar.b).i(false);
        }
        if (z2) {
            ((hie) pmgVar.b).k(true, z4);
        }
        pmgVar.c = ((fcz) pmgVar.a).a();
        Object obj2 = pmgVar.c;
        if (z2) {
            hieVar.m(a());
        }
        return (fcy) obj2;
    }

    public final void f() throws Resources.NotFoundException {
        rwc rwcVar = this.e;
        if (rwcVar.h()) {
            ((ntr) rwcVar.c()).f(false, false);
        }
        this.g.k(false, false);
    }
}
