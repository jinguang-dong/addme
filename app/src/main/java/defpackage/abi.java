package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abi {
    public final abr a;
    public long b;

    public abi(abr abrVar, long j) {
        this.a = abrVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abi)) {
            return false;
        }
        abi abiVar = (abi) obj;
        return a.ao(this.a, abiVar.a) && a.q(this.b, abiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.r(this.b);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) cia.a(this.b)) + ')';
    }
}
