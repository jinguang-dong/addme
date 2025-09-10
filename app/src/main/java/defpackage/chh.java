package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chh {
    public static final chh a = new chh(null);
    public final float b;
    public final float c;

    public chh(byte[] bArr) {
        this.b = 1.0f;
        this.c = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chh)) {
            return false;
        }
        chh chhVar = (chh) obj;
        float f = chhVar.b;
        float f2 = chhVar.c;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=1.0, skewX=0.0)";
    }

    public chh() {
        this(null);
    }
}
