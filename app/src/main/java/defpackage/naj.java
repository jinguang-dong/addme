package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class naj {
    public final nkw a;
    public final nkw b;
    public final int c;

    public naj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof naj) {
            naj najVar = (naj) obj;
            if (this.a.equals(najVar.a) && this.b.equals(najVar.b) && this.c == najVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.aQ(i);
        return i ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.c;
        nkw nkwVar = this.b;
        return "{" + this.a.toString() + ", " + nkwVar.toString() + ", " + Integer.toString(i - 1) + "}";
    }

    public naj(nkw nkwVar, nkw nkwVar2, int i) {
        nkwVar.getClass();
        this.a = nkwVar;
        this.b = nkwVar2;
        if (i == 0) {
            throw null;
        }
        this.c = i;
    }
}
