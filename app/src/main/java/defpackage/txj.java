package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txj {
    public static final txj a = a("1.229.0");
    public static final txj b = a("1.81.0");
    public final int c;
    public final int d;
    public final int e;

    public txj(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static txj a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new txj(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        Log.w("Version", "Failed to parse version from: ".concat(str));
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof txj)) {
            return false;
        }
        txj txjVar = (txj) obj;
        return this.c == txjVar.c && this.d == txjVar.d && this.e == txjVar.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return String.format("%d.%d.%d", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
