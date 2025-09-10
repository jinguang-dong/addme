package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nnk {
    public static final sgv a = sgv.g("nnk");
    public final Context b;

    public nnk(Context context) {
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final PackageInfo a() {
        try {
            return this.b.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((sgt) ((sgt) a.c().i(e)).M((char) 5461)).s("Photos app package not found.");
            return null;
        }
    }

    public final boolean b(String str) {
        PackageInfo packageInfoA = a();
        if (packageInfoA == null) {
            return false;
        }
        String strSubstring = packageInfoA.versionName;
        if (strSubstring.equals("DEVELOPMENT")) {
            return true;
        }
        int iIndexOf = strSubstring.indexOf(45);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        try {
        } catch (IllegalArgumentException unused) {
            ((sgt) a.b().M(5464)).E("Fail to check the version between %s and %s", strSubstring, str);
        }
        return new nnj(strSubstring).compareTo(new nnj(str)) >= 0;
    }
}
