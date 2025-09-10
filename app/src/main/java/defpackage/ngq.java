package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngq {
    public final Bitmap a;
    public final int b;
    public final rwc c;
    public final boolean d;

    public ngq() {
        throw null;
    }

    public static ngq b(Bitmap bitmap, int i) {
        return new ngq(bitmap, i, rwc.i(null), true);
    }

    public final Rect a() {
        Bitmap bitmap = this.a;
        return new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ngq) {
            ngq ngqVar = (ngq) obj;
            if (this.a.equals(ngqVar.a) && this.b == ngqVar.b && this.c.equals(ngqVar.c) && this.d == ngqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.d ? 1237 : 1231) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        rwc rwcVar = this.c;
        return "{" + this.a.toString() + ", " + this.b + ", " + rwcVar.toString() + ", " + this.d + "}";
    }

    public ngq(Bitmap bitmap, int i, rwc rwcVar, boolean z) {
        bitmap.getClass();
        this.a = bitmap;
        this.b = i;
        this.c = rwcVar;
        this.d = z;
    }
}
