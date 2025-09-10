package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfj {
    public final float[] a;
    public final float b;
    public final float c;

    public tfj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfj) {
            tfj tfjVar = (tfj) obj;
            if (Arrays.equals(this.a, tfjVar instanceof tfj ? tfjVar.a : tfjVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(tfjVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(tfjVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        return Float.floatToIntBits(this.c) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + Arrays.toString(this.a) + ", " + this.b + ", " + this.c + "}";
    }

    public tfj(float[] fArr, float f, float f2) {
        fArr.getClass();
        this.a = fArr;
        this.b = f;
        this.c = f2;
    }
}
