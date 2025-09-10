package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apw implements apv {
    private final float a;

    public apw(float f) {
        this.a = f;
    }

    @Override // defpackage.apv
    public final float a(long j, chq chqVar) {
        return chqVar.dk(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apw) && cht.b(this.a, ((apw) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
