package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmk {
    public static final zd a;

    static {
        coh.j("TypefaceCompat static init");
        new ConcurrentHashMap();
        a = new zd(16);
        Trace.endSection();
    }

    public static String a(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
