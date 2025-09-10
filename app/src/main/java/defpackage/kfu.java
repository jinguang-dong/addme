package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfu {
    public final PointF a;
    public final RectF b;
    public final int c;
    public final int d;

    public kfu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kfu) {
            kfu kfuVar = (kfu) obj;
            if (this.a.equals(kfuVar.a) && this.b.equals(kfuVar.b)) {
                int i = this.d;
                int i2 = kfuVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c == kfuVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.aF(i);
        return this.c ^ (((iHashCode * 1000003) ^ i) * 1000003);
    }

    public final String toString() {
        RectF rectF = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(rectF) + ", " + gsn.ac(this.d) + ", " + this.c + "}";
    }

    public kfu(PointF pointF, RectF rectF, int i, int i2) {
        this.a = pointF;
        this.b = rectF;
        this.d = i;
        this.c = i2;
    }
}
