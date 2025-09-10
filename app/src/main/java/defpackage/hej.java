package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hej {
    public final boolean a;
    public final long b;
    public final ltf c;

    public hej() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hej) {
            hej hejVar = (hej) obj;
            if (this.a == hejVar.a && this.b == hejVar.b && this.c.equals(hejVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((this.c.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003)) * (-721379959)) ^ 1237;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", null, false}";
    }

    public hej(boolean z, long j, ltf ltfVar) {
        this.a = z;
        this.b = j;
        this.c = ltfVar;
    }
}
