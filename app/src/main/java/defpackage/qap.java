package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qap {
    public final pvc a;
    public final pvc b;

    public qap() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qap) {
            qap qapVar = (qap) obj;
            pvc pvcVar = this.a;
            if (pvcVar != null ? pvcVar.equals(qapVar.a) : qapVar.a == null) {
                pvc pvcVar2 = this.b;
                if (pvcVar2 != null ? pvcVar2.equals(qapVar.b) : qapVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        pvc pvcVar = this.a;
        int iJ2 = 0;
        if (pvcVar == null) {
            iJ = 0;
        } else if (pvcVar.C()) {
            iJ = pvcVar.j();
        } else {
            int iJ3 = pvcVar.aT;
            if (iJ3 == 0) {
                iJ3 = pvcVar.j();
                pvcVar.aT = iJ3;
            }
            iJ = iJ3;
        }
        pvc pvcVar2 = this.b;
        if (pvcVar2 != null) {
            if (pvcVar2.C()) {
                iJ2 = pvcVar2.j();
            } else {
                iJ2 = pvcVar2.aT;
                if (iJ2 == 0) {
                    iJ2 = pvcVar2.j();
                    pvcVar2.aT = iJ2;
                }
            }
        }
        return ((iJ ^ 1000003) * 1000003) ^ iJ2;
    }

    public final String toString() {
        pvc pvcVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(pvcVar) + "}";
    }

    public qap(pvc pvcVar, pvc pvcVar2) {
        this.a = pvcVar;
        this.b = pvcVar2;
    }
}
