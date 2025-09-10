package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jra {
    public final int a;
    public final float b;
    public final float c;

    public jra() {
        throw null;
    }

    public static jra a(hle hleVar) {
        a.I(hleVar.a.length == 3);
        return new jra((int) hleVar.a(0), hleVar.a(1), hleVar.a(2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jra) {
            jra jraVar = (jra) obj;
            if (this.a == jraVar.a) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(jraVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(jraVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        return Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public jra(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + zflNUOOzDfM.hmYUtbrvC;
    }
}
