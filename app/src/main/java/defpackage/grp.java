package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grp {
    public final gry a;
    public final String b;
    public final rwc c;
    public final rwc d;
    public final rwc e;
    public final rwc f;
    public final rwc g;
    private final rwc h;

    public grp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof grp) {
            grp grpVar = (grp) obj;
            if (this.a.equals(grpVar.a) && this.b.equals(grpVar.b) && this.h.equals(grpVar.h) && this.c.equals(grpVar.c) && this.d.equals(grpVar.d) && this.e.equals(grpVar.e) && this.f.equals(grpVar.f) && this.g.equals(grpVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        return this.g.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.g;
        rwc rwcVar2 = this.f;
        rwc rwcVar3 = this.e;
        rwc rwcVar4 = this.d;
        rwc rwcVar5 = this.c;
        rwc rwcVar6 = this.h;
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + String.valueOf(rwcVar6) + ", " + String.valueOf(rwcVar5) + ", " + String.valueOf(rwcVar4) + ", " + String.valueOf(rwcVar3) + ", " + String.valueOf(rwcVar2) + ", " + String.valueOf(rwcVar) + "}";
    }

    public grp(gry gryVar, String str, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, rwc rwcVar6) {
        this.a = gryVar;
        this.b = str;
        this.h = rwcVar;
        this.c = rwcVar2;
        this.d = rwcVar3;
        this.e = rwcVar4;
        this.f = rwcVar5;
        this.g = rwcVar6;
    }
}
