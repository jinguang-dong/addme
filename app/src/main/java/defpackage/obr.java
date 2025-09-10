package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obr {
    public static final Object a = new Object();
    public static ooe b;
    static Boolean c;

    public static boolean a(Context context) throws PackageManager.NameNotFoundException {
        ojl.ay(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zH = nwj.h(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        c = Boolean.valueOf(zH);
        return zH;
    }
}
