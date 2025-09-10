package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tef {
    public final sbp a;
    public final tfv b;

    public tef() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tef) {
            tef tefVar = (tef) obj;
            if (ujp.aH(this.a, tefVar.a) && this.b.equals(tefVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        tfv tfvVar = this.b;
        if (tfvVar.C()) {
            iJ = tfvVar.j();
        } else {
            int iJ2 = tfvVar.aT;
            if (iJ2 == 0) {
                iJ2 = tfvVar.j();
                tfvVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return iJ ^ (iHashCode * 1000003);
    }

    public final String toString() {
        tfv tfvVar = this.b;
        return "{" + this.a.toString() + ", " + tfvVar.toString() + "}";
    }

    public tef(sbp sbpVar, tfv tfvVar) {
        sbpVar.getClass();
        this.a = sbpVar;
        tfvVar.getClass();
        this.b = tfvVar;
    }
}
