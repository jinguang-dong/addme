package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bic {
    private final float a;

    public bic(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, cib cibVar) {
        cib cibVar2 = cib.a;
        float f = this.a;
        if (cibVar != cibVar2) {
            f = -f;
        }
        return Math.round(((i2 - i) / 2.0f) * (f + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bic) && Float.compare(this.a, ((bic) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
