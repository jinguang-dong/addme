package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibe {
    public final tcp a;
    public final boolean b;

    public ibe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibe) {
            ibe ibeVar = (ibe) obj;
            if (this.a.equals(ibeVar.a) && this.b == ibeVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a.g + ", " + this.b + "}";
    }

    public ibe(tcp tcpVar, boolean z) {
        this.a = tcpVar;
        this.b = z;
    }
}
