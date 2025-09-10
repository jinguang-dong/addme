package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmr {
    public static final pmr a = new pmr(new Object[0]);
    public final Object[] b;
    private final int c;

    private pmr(Object[] objArr) {
        this.b = objArr;
        this.c = Arrays.hashCode(objArr);
    }

    public static pmr a(Object... objArr) {
        return objArr.length == 0 ? a : new pmr(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pmr)) {
            return false;
        }
        pmr pmrVar = (pmr) obj;
        return this.c == pmrVar.c && Arrays.equals(this.b, pmrVar.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }
}
