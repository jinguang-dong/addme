package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dox {
    public final float a;
    public final float b;
    private final float c;

    public dox(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = ((int) (f * f3)) / f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dox doxVar = (dox) obj;
        return this.c == doxVar.c && this.b == doxVar.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.b);
    }
}
