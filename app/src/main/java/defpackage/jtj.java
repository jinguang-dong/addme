package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtj {
    private final pjr a;
    private final pas b;
    private final pas c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final lkk g;

    public jtj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtj) {
            jtj jtjVar = (jtj) obj;
            if (this.a.equals(jtjVar.a) && this.b.equals(jtjVar.b) && this.c.equals(jtjVar.c) && this.d == jtjVar.d && this.e == jtjVar.e && this.f == jtjVar.f && this.g.equals(jtjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.b ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "{" + this.a.a + ", null, " + this.b.toString() + ", " + this.c.toString() + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g.toString() + "}";
    }

    public jtj(pjr pjrVar, pas pasVar, pas pasVar2, boolean z, boolean z2, boolean z3, lkk lkkVar) {
        pjrVar.getClass();
        this.a = pjrVar;
        pasVar.getClass();
        this.b = pasVar;
        pasVar2.getClass();
        this.c = pasVar2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        lkkVar.getClass();
        this.g = lkkVar;
    }
}
