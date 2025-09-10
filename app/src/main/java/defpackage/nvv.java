package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.clockwork.common.wearable.wearmaterial.button.ContentChangeTransition;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvv extends Transition {
    private static final String a = "nvv";
    private static final String b = String.valueOf(nvv.class.getName()).concat(":snapshot");
    private static final Property c = new nvt();

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        ContentChangeTransition.b(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        BitmapDrawable bitmapDrawable;
        ContentChangeTransition.b(transitionValues);
        View view = transitionValues.view;
        int i = WearSnapshot.b;
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (rect.isEmpty() || view.getVisibility() != 0) {
            bitmapDrawable = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            bitmapDrawable = new BitmapDrawable(view.getResources(), bitmapCreateBitmap);
            bitmapDrawable.setBounds(rect);
        }
        WearSnapshot wearSnapshot = bitmapDrawable != null ? new WearSnapshot(bitmapDrawable, view) : null;
        if (wearSnapshot != null) {
            transitionValues.values.put(b, wearSnapshot);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        WearSnapshot wearSnapshot = (WearSnapshot) transitionValues.values.remove(b);
        if (wearSnapshot == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(wearSnapshot, (Property<WearSnapshot, Integer>) c, 25);
        objectAnimatorOfInt.addListener(new nvu(wearSnapshot));
        objectAnimatorOfInt.addListener(new nvw(transitionValues.view));
        addListener(new nvy(transitionValues.view));
        return objectAnimatorOfInt;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return ContentChangeTransition.a;
    }

    @Override // android.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return (transitionValues == null || transitionValues2 == null || !ContentChangeTransition.e(transitionValues, transitionValues2)) ? false : true;
    }
}
