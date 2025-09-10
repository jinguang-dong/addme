package defpackage;

import android.animation.TypeEvaluator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mmx {
    private final TypeEvaluator a;
    private final Interpolator b;
    private final Object c;
    private final Object d;
    private final long e;

    public mmx(TypeEvaluator typeEvaluator, Interpolator interpolator, Object obj, Object obj2, long j) {
        this.a = typeEvaluator;
        this.b = interpolator;
        this.c = obj;
        this.d = obj2;
        this.e = j;
    }

    public final Object c(long j) {
        return this.a.evaluate(this.b.getInterpolation((float) ukc.j(j / this.e, 0.0d, 1.0d)), this.c, this.d);
    }
}
