package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnz extends bof {
    public final float a;
    public final float b;

    public bnz(float f, float f2) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnz)) {
            return false;
        }
        bnz bnzVar = (bnz) obj;
        return Float.compare(this.a, bnzVar.a) == 0 && Float.compare(this.b, bnzVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}
