package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqp implements Interpolator {
    final /* synthetic */ cqr a;

    public cqp(cqr cqrVar) {
        this.a = cqrVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.e.getInterpolation(f);
    }
}
