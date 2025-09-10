package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbp {
    public final svd a;
    public final suv b;

    public qbp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qbp) {
            qbp qbpVar = (qbp) obj;
            if (this.a.equals(qbpVar.a) && this.b.equals(qbpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        svd svdVar = this.a;
        if (svdVar.C()) {
            iJ = svdVar.j();
        } else {
            int iJ3 = svdVar.aT;
            if (iJ3 == 0) {
                iJ3 = svdVar.j();
                svdVar.aT = iJ3;
            }
            iJ = iJ3;
        }
        suv suvVar = this.b;
        if (suvVar.C()) {
            iJ2 = suvVar.j();
        } else {
            int iJ4 = suvVar.aT;
            if (iJ4 == 0) {
                iJ4 = suvVar.j();
                suvVar.aT = iJ4;
            }
            iJ2 = iJ4;
        }
        return iJ2 ^ ((iJ ^ 1000003) * 1000003);
    }

    public final String toString() {
        suv suvVar = this.b;
        return "{" + this.a.toString() + ", " + suvVar.toString() + "}";
    }

    public qbp(svd svdVar, suv suvVar) {
        svdVar.getClass();
        this.a = svdVar;
        suvVar.getClass();
        this.b = suvVar;
    }
}
