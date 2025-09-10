package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ten {
    public final Bitmap a;
    public final RectF b;
    public final float c;

    public ten() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ten) {
            ten tenVar = (ten) obj;
            if (this.a.equals(tenVar.a) && this.b.equals(tenVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(tenVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return Float.floatToIntBits(this.c) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        RectF rectF = this.b;
        return "{" + this.a.toString() + ", " + rectF.toString() + ", " + this.c + "}";
    }

    public ten(Bitmap bitmap, RectF rectF, float f) {
        bitmap.getClass();
        this.a = bitmap;
        this.b = rectF;
        this.c = f;
    }
}
