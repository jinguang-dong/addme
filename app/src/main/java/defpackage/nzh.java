package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzh {
    public static final nzh a;
    public static final nzh b;
    public final boolean c;
    public final scn d;

    static {
        nzf nzfVarA = a();
        nzfVarA.d(sfd.a);
        nzfVarA.c(false);
        a = nzfVarA.a();
        nzf nzfVarA2 = a();
        nzfVarA2.d(new sfm(nzg.ANY));
        nzfVarA2.c(true);
        nzfVarA2.a();
        nzf nzfVarA3 = a();
        nzfVarA3.d(new sfm(nzg.ANY));
        nzfVarA3.c(false);
        b = nzfVarA3.a();
    }

    public nzh() {
        throw null;
    }

    public static nzf a() {
        nzf nzfVar = new nzf();
        nzfVar.c(false);
        return nzfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzh) {
            nzh nzhVar = (nzh) obj;
            if (this.c == nzhVar.c && this.d.equals(nzhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ (((true != this.c ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.c + ", " + String.valueOf(this.d) + "}";
    }

    public nzh(boolean z, scn scnVar) {
        this.c = z;
        this.d = scnVar;
    }
}
