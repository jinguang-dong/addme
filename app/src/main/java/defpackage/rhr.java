package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhr {
    private final aaa a = new aaa();
    private final aaa b = new aaa();

    public static rhr a(Context context, TypedArray typedArray, int i) throws Resources.NotFoundException {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (animatorLoadAnimator instanceof AnimatorSet) {
                    return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                }
                if (animatorLoadAnimator == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                return c(arrayList);
            } catch (Exception e) {
                Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
            }
        }
        return null;
    }

    private static rhr c(List list) {
        rhr rhrVar = new rhr();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            rhrVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            rhs rhsVar = new rhs(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            rhsVar.a = objectAnimator.getRepeatCount();
            rhsVar.b = objectAnimator.getRepeatMode();
            rhrVar.a.put(propertyName, rhsVar);
        }
        return rhrVar;
    }

    public final rhs b(String str) {
        aaa aaaVar = this.a;
        if (aaaVar.get(str) != null) {
            return (rhs) aaaVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rhr) {
            return this.a.equals(((rhr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
