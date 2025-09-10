package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gax {
    public final boolean a;
    public final boolean b;
    public final boolean c = false;
    private final pas d;

    public gax(boolean z, boolean z2, pas pasVar) {
        this.a = z;
        this.b = z2;
        this.d = pasVar;
        if (z && pasVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final gap b() {
        gap gapVar = new gap();
        gapVar.c(false);
        gapVar.b(false);
        gapVar.e();
        gapVar.d(null);
        return gapVar;
    }

    public final boolean a() {
        oxj oxjVarB;
        return this.a && (oxjVarB = oxj.b(this.d)) != null && oxjVarB == oxj.RES_4320P;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gax)) {
            return false;
        }
        gax gaxVar = (gax) obj;
        if (this.a != gaxVar.a || this.b != gaxVar.b) {
            return false;
        }
        boolean z = gaxVar.c;
        return a.ao(this.d, gaxVar.d);
    }

    public final int hashCode() {
        pas pasVar = this.d;
        int iHashCode = pasVar == null ? 0 : pasVar.hashCode();
        boolean z = this.b;
        return (((((a.o(this.a) * 31) + a.o(z)) * 31) + a.o(false)) * 31) + iHashCode;
    }

    public final String toString() {
        return "VideoBoostConfig(enabled=" + this.a + ", enableTele=" + this.b + ", enableUltraWide=false, outputSize=" + this.d + ")";
    }
}
