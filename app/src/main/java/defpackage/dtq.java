package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtq {
    public final dtp a;
    private final dto b;

    public dtq(dto dtoVar, dtp dtpVar) {
        dtpVar.getClass();
        this.b = dtoVar;
        this.a = dtpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtq)) {
            return false;
        }
        dtq dtqVar = (dtq) obj;
        return a.ao(this.b, dtqVar.b) && a.ao(this.a, dtqVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Operation: " + this.b + ": Status: " + this.a;
    }
}
