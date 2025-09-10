package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ase {
    public final float a = 6.0f;
    public final float b = 12.0f;
    public final float c = 8.0f;
    public final float d = 8.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ase)) {
            return false;
        }
        ase aseVar = (ase) obj;
        float f = aseVar.a;
        if (!cht.b(6.0f, 6.0f)) {
            return false;
        }
        float f2 = aseVar.b;
        if (!cht.b(12.0f, 12.0f)) {
            return false;
        }
        float f3 = aseVar.c;
        if (!cht.b(8.0f, 8.0f)) {
            return false;
        }
        float f4 = aseVar.d;
        return cht.b(8.0f, 8.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(6.0f) * 31) + Float.floatToIntBits(12.0f)) * 31) + Float.floatToIntBits(8.0f)) * 31) + Float.floatToIntBits(8.0f);
    }
}
