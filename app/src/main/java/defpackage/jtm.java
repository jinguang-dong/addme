package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtm {
    public final jtd a;
    public final jtj b;

    public jtm() {
        throw null;
    }

    public final ngp a() {
        return this.a.d;
    }

    public final boolean b(jtm jtmVar) {
        return this.b.equals(jtmVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtm) {
            jtm jtmVar = (jtm) obj;
            if (this.a.equals(jtmVar.a) && this.b.equals(jtmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        jtj jtjVar = this.b;
        return "{" + this.a.toString() + ", " + jtjVar.toString() + "}";
    }

    public jtm(jtd jtdVar, jtj jtjVar) {
        jtdVar.getClass();
        this.a = jtdVar;
        this.b = jtjVar;
    }
}
