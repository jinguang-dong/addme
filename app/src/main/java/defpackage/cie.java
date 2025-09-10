package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class cie {
    public final long a;

    public /* synthetic */ cie(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cie) && this.a == ((cie) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        return a.q(j, 0L) ? "Unspecified" : a.q(j, 4294967296L) ? "Sp" : a.q(j, 8589934592L) ? "Em" : "Invalid";
    }
}
