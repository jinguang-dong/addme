package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class duk implements Comparable {
    public static final duk a = new duk(0, 1, 0, "");
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final ues f = new uez(new dlc(this, 13));

    public duk(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object objA = this.f.a();
        objA.getClass();
        return (BigInteger) objA;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(duk dukVar) {
        dukVar.getClass();
        return b().compareTo(dukVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof duk)) {
            return false;
        }
        duk dukVar = (duk) obj;
        return this.b == dukVar.b && this.c == dukVar.c && this.d == dukVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        String str2 = this.e;
        if (ujp.r(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
