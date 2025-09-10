package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drn {
    public final chc a;
    public final int b;
    public final int c;

    public drn(chc chcVar, int i, int i2) {
        this.a = chcVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof drn)) {
            return false;
        }
        drn drnVar = (drn) obj;
        return a.ao(this.a, drnVar.a) && a.p(this.b, drnVar.b) && this.c == drnVar.c;
    }

    public final int hashCode() {
        chc chcVar = this.a;
        return ((((chcVar != null ? chcVar.a : 0) * 31) + this.b) * 31) + this.c;
    }
}
