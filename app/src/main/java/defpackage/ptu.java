package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptu {
    public final pud a;
    public final rwc b;
    public final rwc c;

    public ptu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptu) {
            ptu ptuVar = (ptu) obj;
            if (this.a.equals(ptuVar.a) && this.b.equals(ptuVar.b) && this.c.equals(ptuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        pud pudVar = this.a;
        if (pudVar.C()) {
            iJ = pudVar.j();
        } else {
            int iJ2 = pudVar.aT;
            if (iJ2 == 0) {
                iJ2 = pudVar.j();
                pudVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return ((this.b.hashCode() ^ ((iJ ^ 1000003) * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        rwc rwcVar = this.c;
        rwc rwcVar2 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(rwcVar2) + ", " + String.valueOf(rwcVar) + "}";
    }

    public ptu(pud pudVar, rwc rwcVar, rwc rwcVar2) {
        this.a = pudVar;
        this.b = rwcVar;
        this.c = rwcVar2;
    }
}
