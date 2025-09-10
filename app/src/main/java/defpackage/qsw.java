package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsw {
    public final qtd a;
    private final rwc b;
    private final rwc c;

    public qsw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsw) {
            qsw qswVar = (qsw) obj;
            if (this.a.equals(qswVar.a) && this.b.equals(qswVar.b) && this.c.equals(qswVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "{" + this.a.toString() + ", null, false, Optional.absent(), Optional.absent()}";
    }

    public qsw(qtd qtdVar, rwc rwcVar, rwc rwcVar2) {
        this.a = qtdVar;
        this.b = rwcVar;
        this.c = rwcVar2;
    }
}
