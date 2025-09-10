package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class chu {
    public final long a;

    public final boolean equals(Object obj) {
        return (obj instanceof chu) && this.a == ((chu) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) cht.a(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) cht.a(Float.intBitsToFloat((int) (j & 4294967295L)))) + ')';
    }
}
