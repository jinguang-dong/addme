package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwp {
    private static final sgv a = sgv.g("lwp");

    public static long a(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.pixel.camera.hal", i | 1073741824).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            ((sgt) a.c().M(4515)).s("Camera HAL package not found.");
            return -1L;
        }
    }

    public static long b(Context context) {
        return a(context, 0);
    }
}
