package defpackage;

import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enz {
    public static final eny a = new eny("Log");

    public static void a(eny enyVar, String str) {
        if (h(enyVar, 6)) {
            Log.e(enyVar.a, str);
        }
    }

    public static void b(eny enyVar, String str, Throwable th) {
        if (h(enyVar, 6)) {
            Log.e(enyVar.a, str, th);
        }
    }

    public static void c(eny enyVar, String str) {
        if (h(enyVar, 5)) {
            Log.w(enyVar.a, str);
        }
    }

    public static void d(eny enyVar, String str, Throwable th) {
        if (h(enyVar, 5)) {
            Log.w(enyVar.a, str, th);
        }
    }

    public static void e(eny enyVar) {
        if (h(enyVar, 3)) {
            String str = enyVar.a;
        }
    }

    public static void f(eny enyVar) {
        if (h(enyVar, 4)) {
            String str = enyVar.a;
        }
    }

    public static void g(eny enyVar) {
        if (h(enyVar, 2)) {
            String str = enyVar.a;
        }
    }

    private static boolean h(eny enyVar, int i) {
        try {
            if (Log.isLoggable("CAM2PORT_", i)) {
                return true;
            }
            return Log.isLoggable(enyVar.a, i);
        } catch (IllegalArgumentException unused) {
            eny enyVar2 = a;
            Objects.toString(enyVar);
            a(enyVar2, "Tag too long:".concat(String.valueOf(enyVar)));
            return false;
        }
    }
}
