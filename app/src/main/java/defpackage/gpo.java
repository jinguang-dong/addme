package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpo {
    public final RectF a;
    private final PointF b;

    public gpo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpo) {
            gpo gpoVar = (gpo) obj;
            if (this.a.equals(gpoVar.a) && this.b.equals(gpoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        PointF pointF = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(pointF) + "}";
    }

    public gpo(RectF rectF, PointF pointF) {
        this.a = rectF;
        this.b = pointF;
    }
}
