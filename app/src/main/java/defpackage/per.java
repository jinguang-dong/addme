package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class per {
    public final pjr a;
    public final poj b;

    public per() {
        throw null;
    }

    public final boolean equals(Object obj) {
        poj pojVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof per) {
            per perVar = (per) obj;
            if (this.a.equals(perVar.a) && ((pojVar = this.b) != null ? pojVar.equals(perVar.b) : perVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        poj pojVar = this.b;
        return ((this.a.b ^ 1000003) * 1000003) ^ (pojVar == null ? 0 : pojVar.hashCode());
    }

    public final String toString() {
        return "{" + this.a.a + ", " + String.valueOf(this.b) + "}";
    }

    public per(pjr pjrVar, poj pojVar) {
        pjrVar.getClass();
        this.a = pjrVar;
        this.b = pojVar;
    }
}
