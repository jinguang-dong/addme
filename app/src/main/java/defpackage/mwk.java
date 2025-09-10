package defpackage;

import android.graphics.Rect;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwk {
    public final mux a;
    public final muy b;
    public final float c;
    public final mwr d;
    public final Rect e;

    public mwk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwk) {
            mwk mwkVar = (mwk) obj;
            if (this.a.equals(mwkVar.a) && this.b.equals(mwkVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(mwkVar.c) && this.d.equals(mwkVar.d) && this.e.equals(mwkVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d.hashCode();
        return this.e.hashCode() ^ (iHashCode * 1000003);
    }

    public mwk(mux muxVar, muy muyVar, float f, mwr mwrVar, Rect rect) {
        muxVar.getClass();
        this.a = muxVar;
        muyVar.getClass();
        this.b = muyVar;
        this.c = f;
        mwrVar.getClass();
        this.d = mwrVar;
        rect.getClass();
        this.e = rect;
    }

    public final String toString() {
        Rect rect = this.e;
        mwr mwrVar = this.d;
        muy muyVar = this.b;
        return HHdu.VdJgcAolJT + this.a.toString() + ", " + muyVar.toString() + ", " + this.c + ", " + mwrVar.toString() + ", " + rect.toString() + "}";
    }
}
