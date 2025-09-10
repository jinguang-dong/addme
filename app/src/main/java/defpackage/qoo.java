package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qoo {
    public final uzi a;
    public final sbp b;

    public qoo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qoo) {
            qoo qooVar = (qoo) obj;
            if (this.a.equals(qooVar.a) && ujp.aH(this.b, qooVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        uzi uziVar = this.a;
        if (uziVar.C()) {
            iJ = uziVar.j();
        } else {
            int iJ2 = uziVar.aT;
            if (iJ2 == 0) {
                iJ2 = uziVar.j();
                uziVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return this.b.hashCode() ^ ((iJ ^ 1000003) * 1000003);
    }

    public final String toString() {
        sbp sbpVar = this.b;
        return "{" + this.a.toString() + ", " + sbpVar.toString() + "}";
    }

    public qoo(uzi uziVar, sbp sbpVar) {
        uziVar.getClass();
        this.a = uziVar;
        sbpVar.getClass();
        this.b = sbpVar;
    }
}
