package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qao {
    public final pvl a;
    public final pvc b;

    public qao() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qao) {
            qao qaoVar = (qao) obj;
            if (this.a.equals(qaoVar.a) && this.b.equals(qaoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        pvl pvlVar = this.a;
        if (pvlVar.C()) {
            iJ = pvlVar.j();
        } else {
            int iJ3 = pvlVar.aT;
            if (iJ3 == 0) {
                iJ3 = pvlVar.j();
                pvlVar.aT = iJ3;
            }
            iJ = iJ3;
        }
        pvc pvcVar = this.b;
        if (pvcVar.C()) {
            iJ2 = pvcVar.j();
        } else {
            int iJ4 = pvcVar.aT;
            if (iJ4 == 0) {
                iJ4 = pvcVar.j();
                pvcVar.aT = iJ4;
            }
            iJ2 = iJ4;
        }
        return iJ2 ^ ((iJ ^ 1000003) * 1000003);
    }

    public final String toString() {
        pvc pvcVar = this.b;
        return "{" + this.a.toString() + ", " + pvcVar.toString() + "}";
    }

    public qao(pvl pvlVar, pvc pvcVar) {
        pvlVar.getClass();
        this.a = pvlVar;
        pvcVar.getClass();
        this.b = pvcVar;
    }
}
