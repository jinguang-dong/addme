package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glq {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Optional e;
    public final int f;

    public glq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glq) {
            glq glqVar = (glq) obj;
            if (this.a == glqVar.a && this.b == glqVar.b && this.c == glqVar.c && this.d == glqVar.d && this.e.equals(glqVar.e)) {
                int i = this.f;
                int i2 = glqVar.f;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((true != this.d ? 1237 : 1231) ^ ((this.c ^ ((this.b ^ ((this.a ^ 1000003) * 1000003)) * 1000003)) * 1000003)) * 1000003) ^ this.e.hashCode();
        a.aQ(this.f);
        return (iHashCode * 1000003) ^ 1;
    }

    public final String toString() {
        int i = this.f;
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(this.e) + ", " + (i != 1 ? "null" : "NONE") + "}";
    }

    public glq(int i, int i2, int i3, boolean z, Optional optional) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = optional;
        this.f = 1;
    }
}
