package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twc {
    public static final /* synthetic */ int a = 0;
    private static final Class b;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("android.view.DisplayCutout");
        } catch (Exception unused) {
            Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            cls = null;
        }
        b = cls;
    }

    public static final int a(String str, Object obj) {
        try {
            return ((Integer) b.getDeclaredMethod(str, null).invoke(obj, null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
