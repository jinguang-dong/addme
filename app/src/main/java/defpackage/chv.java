package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class chv {
    public final long a;

    public static String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) cht.a(Float.intBitsToFloat((int) (j >> 32)))) + " x " + ((Object) cht.a(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof chv) && this.a == ((chv) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
