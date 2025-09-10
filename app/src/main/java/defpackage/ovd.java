package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovd {
    private static final ojl e = new ojl();
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    private final ojl f;

    public ovd() {
        throw null;
    }

    public static ovc a() {
        ovc ovcVar = new ovc();
        ovcVar.d = e;
        ovcVar.b(0);
        ovcVar.b = true;
        ovcVar.c = (byte) (ovcVar.c | 4);
        return ovcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ovd) {
            ovd ovdVar = (ovd) obj;
            if (this.a == ovdVar.a && this.b.equals(ovdVar.b) && this.c == ovdVar.c && this.d == ovdVar.d && this.f.equals(ovdVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(this.f) + "}";
    }

    public ovd(int i, String str, int i2, boolean z, ojl ojlVar) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
        this.f = ojlVar;
    }
}
