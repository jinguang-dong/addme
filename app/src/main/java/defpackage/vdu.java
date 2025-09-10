package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdu {
    public final int a;
    public final int b;
    public final boolean c;
    public final Size d;
    public final int e;

    public vdu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vdu) {
            vdu vduVar = (vdu) obj;
            if (this.a == vduVar.a && this.b == vduVar.b && this.c == vduVar.c && this.d.equals(vduVar.d) && this.e == vduVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ (((((true != this.c ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + String.valueOf(this.d) + ", " + this.e + "}";
    }

    public vdu(int i, int i2, boolean z, Size size, int i3) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = size;
        this.e = i3;
    }
}
