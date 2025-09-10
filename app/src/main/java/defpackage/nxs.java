package defpackage;

import android.view.animation.DecelerateInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nxs extends DecelerateInterpolator {
    public final float a;
    public float b;

    public nxs(float f) {
        super(0.5f * f);
        this.b = 0.0f;
        this.a = f;
    }

    @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        this.b = f;
        return super.getInterpolation(f);
    }
}
