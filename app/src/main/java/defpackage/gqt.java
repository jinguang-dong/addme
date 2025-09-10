package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqt {
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;

    public gqt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqt) {
            gqt gqtVar = (gqt) obj;
            if (this.a.equals(gqtVar.a) && this.b.equals(gqtVar.b) && this.c.equals(gqtVar.c) && this.d.equals(gqtVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Rect rect = this.d;
        Rect rect2 = this.c;
        Rect rect3 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(rect3) + ", " + String.valueOf(rect2) + ", " + String.valueOf(rect) + "}";
    }

    public gqt(Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a = rect;
        this.b = rect2;
        this.c = rect3;
        this.d = rect4;
    }
}
