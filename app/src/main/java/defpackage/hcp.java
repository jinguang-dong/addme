package defpackage;

import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcp extends pax {
    private static boolean b(String str, int i) {
        return Log.isLoggable("CAM_", i) || Log.isLoggable(str, i);
    }

    @Override // defpackage.pax
    public final boolean a(String str, int i) {
        return i == 2 ? b(str, 2) : "userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE) || b(str, i);
    }
}
