package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final owf d;
    public final owf e;

    public mtz() {
        throw null;
    }

    public static mty a() {
        mty mtyVar = new mty();
        mtyVar.e(false);
        mtyVar.d(false);
        mtyVar.f(false);
        mtyVar.c(new ovx(false));
        mtyVar.b(new ovx(false));
        return mtyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mtz) {
            mtz mtzVar = (mtz) obj;
            if (this.a == mtzVar.a && this.b == mtzVar.b && this.c == mtzVar.c && this.d.equals(mtzVar.d) && this.e.equals(mtzVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return this.e.hashCode() ^ ((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        owf owfVar = this.e;
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + String.valueOf(this.d) + ", " + String.valueOf(owfVar) + "}";
    }

    public mtz(boolean z, boolean z2, boolean z3, owf owfVar, owf owfVar2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = owfVar;
        this.e = owfVar2;
    }
}
