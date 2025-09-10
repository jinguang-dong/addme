package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjr {
    public final String a;
    public final int b;
    private final Integer c;

    private pjr(Integer num, String str) {
        this.c = num;
        this.a = str;
        this.b = Objects.hash(str, 0);
    }

    public static pjr b(String str) {
        Integer numValueOf;
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            numValueOf = null;
        }
        return new pjr(numValueOf, str);
    }

    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        throw new UnsupportedOperationException("Attempted to access a camera id that is not supported on legacy camera API's: ".concat(String.valueOf(this.a)));
    }

    public final boolean c() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((pjr) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
