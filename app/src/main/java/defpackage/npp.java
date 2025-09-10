package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npp {
    public final scn a;
    public final boolean b;

    static {
        a(sfd.a, false);
    }

    public npp() {
        throw null;
    }

    public static npp a(Set set, boolean z) {
        return new npp(scn.F(set), z);
    }

    public static npp b(Set set, hbj hbjVar) {
        return a(set, hbjVar.p(gzo.ak));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof npp) {
            npp nppVar = (npp) obj;
            if (this.a.equals(nppVar.a) && this.b == nppVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + "}";
    }

    public npp(scn scnVar, boolean z) {
        scnVar.getClass();
        this.a = scnVar;
        this.b = z;
    }
}
