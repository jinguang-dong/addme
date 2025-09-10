package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class yh {
    public final long a;

    public /* synthetic */ yh(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yh) && this.a == ((yh) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append(Float.intBitsToFloat((int) (j >> 32)));
        sb.append(", ");
        sb.append(Float.intBitsToFloat((int) (j & 4294967295L)));
        sb.append(')');
        return sb.toString();
    }
}
