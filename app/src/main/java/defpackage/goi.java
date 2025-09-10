package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goi {
    public final kgw a;

    public goi() {
        throw null;
    }

    public final pka a() {
        return this.a.l();
    }

    public final boolean b() {
        return a() == pka.BACK;
    }

    public final boolean c() {
        return a() == pka.FRONT;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof goi) {
            return this.a.equals(((goi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "{" + this.a.toString() + "}";
    }

    public goi(kgw kgwVar) {
        this.a = kgwVar;
    }
}
