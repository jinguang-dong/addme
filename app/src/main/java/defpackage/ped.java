package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ped {
    public final int a;
    public final sbp b;

    public ped() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ped) {
            ped pedVar = (ped) obj;
            if (this.a == pedVar.a && ujp.aH(this.b, pedVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public ped(int i, sbp sbpVar) {
        this.a = i;
        sbpVar.getClass();
        this.b = sbpVar;
    }
}
