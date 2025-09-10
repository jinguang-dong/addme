package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cic implements cig {
    private final float a;

    public cic(float f) {
        this.a = f;
    }

    @Override // defpackage.cig
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.cig
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cic) && Float.compare(this.a, ((cic) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
