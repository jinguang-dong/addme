package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rge {
    public static final rge a = new rge();
    public final String b;

    public rge() {
        rnt.B(true, "Android Logging mandates tags be less than 23 characters.");
        this.b = "VisionKit";
    }

    public final String a(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public final String b(Object obj, String str, Object... objArr) {
        String str2;
        String strA = a(str, objArr);
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        return mn.f(strA, str2, "[", "] ");
    }

    public final void c(Object obj, String str, Object... objArr) {
        if (d(5)) {
            Log.w(this.b, b(obj, str, objArr));
        }
    }

    public final boolean d(int i) {
        return Log.isLoggable(this.b, i);
    }
}
