package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwm {
    public final mwd a;
    public final Paint b;

    public mwm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwm) {
            mwm mwmVar = (mwm) obj;
            if (this.a.equals(mwmVar.a) && this.b.equals(mwmVar.b)) {
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
        return "{" + this.a.p + ", " + this.b.toString() + "}";
    }

    public mwm(mwd mwdVar, Paint paint) {
        mwdVar.getClass();
        this.a = mwdVar;
        this.b = paint;
    }
}
