package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pth {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public pth(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pth)) {
            return false;
        }
        pth pthVar = (pth) obj;
        return a.ao(this.a, pthVar.a) && this.b == pthVar.b && this.c == pthVar.c && this.d == pthVar.d && this.e == pthVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + a.o(this.d)) * 31) + this.e;
    }

    public final String toString() {
        return "FontInfo(uri=" + this.a + ", ttcIndex=" + this.b + ", weight=" + this.c + ", isItalic=" + this.d + ", resultCode=" + this.e + ")";
    }
}
