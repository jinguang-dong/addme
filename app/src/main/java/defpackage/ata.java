package defpackage;

/* compiled from: PG */
@ueo
/* loaded from: classes.dex */
public final class ata {
    public final float a;
    private final float b = 10.0f;
    private final float c = 10.0f;

    public ata(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ata)) {
            return false;
        }
        ata ataVar = (ata) obj;
        if (this.a != ataVar.a) {
            return false;
        }
        float f = ataVar.b;
        float f2 = ataVar.c;
        return true;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(10.0f)) * 31) + Float.floatToIntBits(10.0f);
    }

    public final String toString() {
        return "ResistanceConfig(basis=" + this.a + ", factorAtMin=10.0, factorAtMax=10.0)";
    }
}
