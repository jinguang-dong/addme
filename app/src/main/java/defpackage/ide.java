package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ide {
    public final float a;
    public final Optional b;
    public final float c;
    private final float d;

    public ide() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ide) {
            ide ideVar = (ide) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(ideVar.a)) {
                if (Float.floatToIntBits(this.d) == Float.floatToIntBits(ideVar.d) && this.b.equals(ideVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(ideVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ this.b.hashCode();
        return Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.d + ", " + String.valueOf(this.b) + ", " + this.c + "}";
    }

    public ide(float f, float f2, Optional optional, float f3) {
        this.a = f;
        this.d = f2;
        this.b = optional;
        this.c = f3;
    }
}
