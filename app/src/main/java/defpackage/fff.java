package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fff {
    public final float a;
    public final float b;
    public final float c;

    public fff() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fff) {
            fff fffVar = (fff) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(fffVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(fffVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(fffVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        return Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public fff(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + mNLbzhCxd.GhrRfHJygK;
    }
}
