package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afd {
    public static final float a = ViewConfiguration.getScrollFriction();
    public static final double b;
    public static final double c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        b = dLog;
        c = dLog - 1.0d;
    }
}
