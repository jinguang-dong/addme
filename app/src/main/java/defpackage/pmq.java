package defpackage;

import j$.util.Objects;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmq {
    private static final Pattern c = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]*$");
    public final String a;
    public final Class b;

    public pmq(String str, Class cls) {
        a.I(c.matcher(str).matches());
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pmq) {
            pmq pmqVar = (pmq) obj;
            if (this.b == pmqVar.b && this.a.equals(pmqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
