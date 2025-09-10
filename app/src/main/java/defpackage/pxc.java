package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxc {
    public static final pxc a;
    public static final pxc b;
    public static final pxc c;
    private final boolean d;
    private final scn e;

    static {
        pxa pxaVarA = a();
        pxaVarA.c(EnumSet.noneOf(pxb.class));
        pxaVarA.b(false);
        a = pxaVarA.a();
        pxa pxaVarA2 = a();
        pxaVarA2.c(EnumSet.of(pxb.ANY));
        pxaVarA2.b(true);
        b = pxaVarA2.a();
        pxa pxaVarA3 = a();
        pxaVarA3.c(EnumSet.of(pxb.ANY));
        pxaVarA3.b(false);
        c = pxaVarA3.a();
    }

    public pxc() {
        throw null;
    }

    public static pxa a() {
        pxa pxaVar = new pxa();
        pxaVar.b(false);
        return pxaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxc) {
            pxc pxcVar = (pxc) obj;
            if (this.d == pxcVar.d && this.e.equals(pxcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.d + ", " + String.valueOf(this.e) + "}";
    }

    public pxc(boolean z, scn scnVar) {
        this.d = z;
        this.e = scnVar;
    }
}
