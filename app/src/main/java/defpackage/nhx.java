package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhx {
    public final int a;
    public final String b;
    public final Size c;
    public final int d;

    public nhx(int i, String str, Size size, int i2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = size;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhx)) {
            return false;
        }
        nhx nhxVar = (nhx) obj;
        return this.a == nhxVar.a && a.ao(this.b, nhxVar.b) && a.ao(this.c, nhxVar.c) && this.d == nhxVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    public final String toString() {
        return "IconConfig(resId=" + this.a + ", contentDescription=" + this.b + ", size=" + this.c + ", color=" + this.d + ")";
    }
}
