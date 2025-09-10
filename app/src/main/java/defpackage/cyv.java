package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyv {
    public static final ArrayList a = new ArrayList();

    static {
        Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }

    public static String a(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean b(String str) {
        return "audio".equals(a(str));
    }

    public static boolean c(String str) {
        return "video".equals(a(str));
    }
}
