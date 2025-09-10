package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyy {
    public static final Object a = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        strReplace = "UnknownHostException (no network)";
                        break;
                    }
                    cause = cause.getCause();
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            Log.w(str, a(str2, null));
        }
    }
}
