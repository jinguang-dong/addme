package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmp extends mmx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmp(Interpolator interpolator, int i, int i2) {
        super(new ArgbEvaluator(), interpolator, Integer.valueOf(i), Integer.valueOf(i2), 100L);
        interpolator.getClass();
    }

    public final Float a(long j) {
        return Float.valueOf(((Number) super.c(j)).floatValue());
    }

    public final Integer b(long j) {
        Object objC = super.c(j);
        objC.getClass();
        return (Integer) objC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmp(Interpolator interpolator, float f, float f2, long j) {
        super(new FloatEvaluator(), interpolator, Float.valueOf(f), Float.valueOf(f2), j);
        interpolator.getClass();
    }
}
