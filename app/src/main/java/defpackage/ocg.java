package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ocg {
    public final tzf a;

    public ocg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ocg) && this.a.equals(((ocg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-446996542);
    }

    public final String toString() {
        return "{92469333, " + this.a.toString() + "}";
    }

    public ocg(tzf tzfVar) {
        this.a = tzfVar;
    }
}
