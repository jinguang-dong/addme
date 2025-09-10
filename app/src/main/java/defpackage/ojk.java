package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojk {
    public static Boolean a;
    private static String b;

    public static String a() {
        if (b == null) {
            b = Application.getProcessName();
        }
        return b;
    }
}
