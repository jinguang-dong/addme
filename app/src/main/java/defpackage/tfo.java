package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfo {
    public final float[] a;
    public final Bitmap b;
    public final float c;
    public final float d;

    public tfo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfo) {
            tfo tfoVar = (tfo) obj;
            if (Arrays.equals(this.a, tfoVar instanceof tfo ? tfoVar.a : tfoVar.a) && this.b.equals(tfoVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(tfoVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(tfoVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c);
        return Float.floatToIntBits(this.d) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Bitmap bitmap = this.b;
        return "{" + Arrays.toString(this.a) + ", " + bitmap.toString() + ", " + this.c + ", " + this.d + "}";
    }

    public tfo(float[] fArr, Bitmap bitmap, float f, float f2) {
        fArr.getClass();
        this.a = fArr;
        this.b = bitmap;
        this.c = f;
        this.d = f2;
    }
}
