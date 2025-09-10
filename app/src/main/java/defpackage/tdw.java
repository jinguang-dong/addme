package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdw {
    public final szr a;
    public final szr b;

    public tdw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tdw) {
            tdw tdwVar = (tdw) obj;
            if (this.a.equals(tdwVar.a) && this.b.equals(tdwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        szr szrVar = this.a;
        if (szrVar.C()) {
            iJ = szrVar.j();
        } else {
            int iJ3 = szrVar.aT;
            if (iJ3 == 0) {
                iJ3 = szrVar.j();
                szrVar.aT = iJ3;
            }
            iJ = iJ3;
        }
        szr szrVar2 = this.b;
        if (szrVar2.C()) {
            iJ2 = szrVar2.j();
        } else {
            int iJ4 = szrVar2.aT;
            if (iJ4 == 0) {
                iJ4 = szrVar2.j();
                szrVar2.aT = iJ4;
            }
            iJ2 = iJ4;
        }
        return iJ2 ^ ((iJ ^ 1000003) * 1000003);
    }

    public final String toString() {
        szr szrVar = this.b;
        return "{" + this.a.toString() + ", " + szrVar.toString() + "}";
    }

    public tdw(szr szrVar, szr szrVar2) {
        szrVar.getClass();
        this.a = szrVar;
        szrVar2.getClass();
        this.b = szrVar2;
    }
}
