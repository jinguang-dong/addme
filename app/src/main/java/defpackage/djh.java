package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djh {
    public static final ayp a = new ayr(new axa(8));
    public static final ayp b;
    public static final ayp c;
    public static final ayp d;

    static {
        avr avrVar = avr.c;
        bap bapVar = bap.c;
        b = new ayz(bapVar, avrVar);
        c = new ayz(bapVar, avr.d);
        d = new ayz(bapVar, new agx(14));
    }

    public static final boolean a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "reduce_motion", 0) == 1;
        } catch (SecurityException e) {
            Log.w("CompositionLocals", "Failed to fetch reduce motion setting, using value: false", e);
            return false;
        }
    }
}
