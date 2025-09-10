package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfy {
    public final rwc a;
    public final sbp b;
    public final sbp c;
    public final rwc d;
    public final rwc e;
    public final rwc f;
    public final rwc g;
    private final sbp h;

    public rfy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfy) {
            rfy rfyVar = (rfy) obj;
            if (this.a.equals(rfyVar.a) && ujp.aH(this.b, rfyVar.b) && ujp.aH(this.c, rfyVar.c) && this.d.equals(rfyVar.d) && this.e.equals(rfyVar.e) && this.f.equals(rfyVar.f) && ujp.aH(this.h, rfyVar.h) && this.g.equals(rfyVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode();
        return this.g.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.g;
        sbp sbpVar = this.h;
        rwc rwcVar2 = this.f;
        rwc rwcVar3 = this.e;
        rwc rwcVar4 = this.d;
        sbp sbpVar2 = this.c;
        sbp sbpVar3 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(sbpVar3) + ", " + String.valueOf(sbpVar2) + ", " + String.valueOf(rwcVar4) + ", " + String.valueOf(rwcVar3) + ", " + String.valueOf(rwcVar2) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(rwcVar) + "}";
    }

    public rfy(rwc rwcVar, sbp sbpVar, sbp sbpVar2, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, sbp sbpVar3, rwc rwcVar5) {
        this.a = rwcVar;
        this.b = sbpVar;
        this.c = sbpVar2;
        this.d = rwcVar2;
        this.e = rwcVar3;
        this.f = rwcVar4;
        this.h = sbpVar3;
        this.g = rwcVar5;
    }
}
