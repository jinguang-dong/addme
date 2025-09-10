package defpackage;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmq {
    public static final Interpolator a = new LinearInterpolator();
    public static final Interpolator b = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator c;
    public static final Interpolator d;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.3f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(chx.j("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        c = new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        d = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    }
}
