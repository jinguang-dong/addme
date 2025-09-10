package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dur {
    public final duc a;
    public final dup b;
    private final duq c;

    public dur(duc ducVar, duq duqVar, dup dupVar) {
        this.a = ducVar;
        this.c = duqVar;
        this.b = dupVar;
        if (ducVar.b() == 0 && ducVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (ducVar.a != 0 && ducVar.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final duo a() {
        duc ducVar = this.a;
        return ducVar.b() > ducVar.a() ? duo.b : duo.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dur durVar = (dur) obj;
        return a.ao(this.a, durVar.a) && a.ao(this.c, durVar.c) && a.ao(this.b, durVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "dur { " + this.a + ", type=" + this.c + ", state=" + this.b + " }";
    }
}
