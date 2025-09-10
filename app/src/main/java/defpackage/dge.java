package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dge extends dhg {
    public dge() {
    }

    private static float O(dgy dgyVar, float f) {
        Float f2;
        return (dgyVar == null || (f2 = (Float) dgyVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        int i = dhc.b;
        view.setTransitionAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) dhc.a, f2);
        dgd dgdVar = new dgd(view);
        objectAnimatorOfFloat.addListener(dgdVar);
        j().D(dgdVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.dhg, defpackage.dgp
    public final void c(dgy dgyVar) {
        dhg.N(dgyVar);
        Float fValueOf = (Float) dgyVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (dgyVar.b.getVisibility() == 0) {
                View view = dgyVar.b;
                int i = dhc.b;
                fValueOf = Float.valueOf(view.getTransitionAlpha());
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        dgyVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.dgp
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dhg
    public final Animator f(View view, dgy dgyVar) {
        int i = dhc.b;
        return P(view, O(dgyVar, 0.0f), 1.0f);
    }

    @Override // defpackage.dhg
    public final Animator g(View view, dgy dgyVar, dgy dgyVar2) {
        int i = dhc.b;
        Animator animatorP = P(view, O(dgyVar, 1.0f), 0.0f);
        if (animatorP == null) {
            view.setTransitionAlpha(O(dgyVar2, 1.0f));
        }
        return animatorP;
    }

    public dge(int i) {
        this.u = i;
    }
}
