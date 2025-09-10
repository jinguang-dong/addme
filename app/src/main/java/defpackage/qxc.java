package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxc {
    public static final /* synthetic */ int a = 0;
    private static final yd b = new yd();

    public static synchronized Uri a(String str) {
        yd ydVar = b;
        Uri uri = (Uri) ydVar.get(str);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
        ydVar.put(str, uri2);
        return uri2;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
        }
        return str + "#" + context.getPackageName();
    }
}
