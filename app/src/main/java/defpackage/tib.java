package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tib {
    public static final tib a = new tib("", "", false);
    public final String b;
    public final String c;
    public final boolean d;

    static {
        new tib("\n", "  ", true);
    }

    private tib(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.b = str;
                this.c = str2;
                this.d = z;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException(UvOvSgfD.CoeNEYBs);
    }
}
