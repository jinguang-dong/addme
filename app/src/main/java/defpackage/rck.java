package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rck {
    private final Context a;
    private final String b;
    private String c = "files";
    private String d = "common";
    private Account e = rcl.b;
    private String f = "";
    private final sbk g;

    public rck(Context context) {
        int i = sbp.d;
        this.g = new sbk();
        qpt.W(context != null, "Context cannot be null", new Object[0]);
        this.a = context;
        this.b = context.getPackageName();
    }

    private final void f(String str) {
        Set set = rcl.d;
        qpt.W(set.contains(str), "The only supported locations are %s: %s", set, str);
        this.c = str;
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.b).path("/" + this.c + "/" + this.d + "/" + rci.b(this.e) + "/" + this.f).encodedFragment(rdc.a(this.g.g())).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rck.b(java.lang.String):void");
    }

    public final void c() {
        f("directboot-files");
    }

    public final void d(String str) {
        qpt.W(rcl.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        qpt.W(!rcl.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = rcl.a;
        this.f = str;
    }
}
