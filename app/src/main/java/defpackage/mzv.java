package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzv {
    public final Rect a;
    public final int b;

    public mzv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzv) {
            mzv mzvVar = (mzv) obj;
            if (this.a.equals(mzvVar.a) && this.b == mzvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", " + this.b + "}";
    }

    public mzv(Rect rect, int i) {
        this.a = rect;
        this.b = i;
    }
}
