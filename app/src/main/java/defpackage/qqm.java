package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqm {
    public final String a;
    public final boolean b;
    public final uzu c;
    public final uyd d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final qsj h;
    public final boolean i;
    public final int j;
    public final Predicate k;
    public final qop l;
    public final int m;

    public qqm() {
        throw null;
    }

    public static qql a() {
        qql qqlVar = new qql();
        qqlVar.c(false);
        qqlVar.d(false);
        qqlVar.b(0);
        qqlVar.g(false);
        qqlVar.e(Integer.MAX_VALUE);
        qqlVar.f = new mdn(11);
        return qqlVar;
    }

    public final boolean equals(Object obj) {
        uyd uydVar;
        String str;
        Long l;
        qop qopVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qqm) {
            qqm qqmVar = (qqm) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(qqmVar.a) : qqmVar.a == null) {
                if (this.b == qqmVar.b && this.c.equals(qqmVar.c) && ((uydVar = this.d) != null ? uydVar.equals(qqmVar.d) : qqmVar.d == null) && ((str = this.e) != null ? str.equals(qqmVar.e) : qqmVar.e == null) && ((l = this.f) != null ? l.equals(qqmVar.f) : qqmVar.f == null) && this.g == qqmVar.g) {
                    if (this.h != null) {
                        qsj qsjVar = qqmVar.h;
                        throw null;
                    }
                    if (qqmVar.h == null && this.i == qqmVar.i && this.j == qqmVar.j && this.k.equals(qqmVar.k) && ((qopVar = this.l) != null ? qopVar.equals(qqmVar.l) : qqmVar.l == null) && this.m == qqmVar.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        uzu uzuVar = this.c;
        if (uzuVar.C()) {
            iJ = uzuVar.j();
        } else {
            int iJ3 = uzuVar.aT;
            if (iJ3 == 0) {
                iJ3 = uzuVar.j();
                uzuVar.aT = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode ^ iJ) * 1000003;
        uyd uydVar = this.d;
        if (uydVar == null) {
            iJ2 = 0;
        } else if (uydVar.C()) {
            iJ2 = uydVar.j();
        } else {
            int iJ4 = uydVar.aT;
            if (iJ4 == 0) {
                iJ4 = uydVar.j();
                uydVar.aT = iJ4;
            }
            iJ2 = iJ4;
        }
        int i2 = (i ^ iJ2) * 1000003;
        String str2 = this.e;
        int iHashCode2 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i3 = true != this.g ? 1237 : 1231;
        if (this.h != null) {
            throw null;
        }
        int iHashCode4 = (((((((iHashCode3 ^ i3) * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        qop qopVar = this.l;
        return this.m ^ ((iHashCode4 ^ (qopVar != null ? qopVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        qop qopVar = this.l;
        Predicate predicate = this.k;
        qsj qsjVar = this.h;
        uyd uydVar = this.d;
        return "{" + this.a + ", " + this.b + ", " + String.valueOf(this.c) + ", " + String.valueOf(uydVar) + ", " + this.e + ", " + this.f + ", " + this.g + ", " + String.valueOf(qsjVar) + ", " + this.i + ", " + this.j + ", " + String.valueOf(predicate) + ", " + String.valueOf(qopVar) + ", " + this.m + "}";
    }

    public qqm(String str, boolean z, uzu uzuVar, uyd uydVar, String str2, Long l, boolean z2, qsj qsjVar, boolean z3, int i, Predicate predicate, qop qopVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = uzuVar;
        this.d = uydVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = qsjVar;
        this.i = z3;
        this.j = i;
        this.k = predicate;
        this.l = qopVar;
        this.m = i2;
    }
}
