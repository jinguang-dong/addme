package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqo {
    public final iqq a;
    public final Optional b;
    public final Optional c;

    public iqo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqo) {
            iqo iqoVar = (iqo) obj;
            if (this.a.equals(iqoVar.a) && this.b.equals(iqoVar.b) && this.c.equals(iqoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public iqo(iqq iqqVar, Optional optional, Optional optional2) {
        this.a = iqqVar;
        this.b = optional;
        this.c = optional2;
    }
}
