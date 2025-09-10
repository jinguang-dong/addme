package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ety {
    public final ActivityManager a;
    public float b;
    public final ejt c;

    public ety(Context context) {
        this.b = 1.0f;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.a = activityManager;
        this.c = new ejt(context.getResources().getDisplayMetrics(), (byte[]) null);
        if (activityManager.isLowRamDevice()) {
            this.b = 0.0f;
        }
    }
}
