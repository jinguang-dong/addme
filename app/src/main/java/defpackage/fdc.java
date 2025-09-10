package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdc {
    public final int a;
    public final Rect b;
    public final int c;

    public fdc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fdc) {
            fdc fdcVar = (fdc) obj;
            if (this.a == fdcVar.a && this.b.equals(fdcVar.b) && this.c == fdcVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.aF(i);
        return i ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + ", " + gsn.ac(this.c) + "}";
    }

    public fdc(int i, Rect rect, int i2) {
        this.a = i;
        rect.getClass();
        this.b = rect;
        this.c = i2;
    }
}
