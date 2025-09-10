package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cox {
    public final cmh a;
    public final cmh b;

    public cox(WindowInsetsAnimation.Bounds bounds) {
        this.a = cmh.c(bounds.getLowerBound());
        this.b = cmh.c(bounds.getUpperBound());
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }
}
