package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxu {
    public final mxt a;
    public final myd b;

    public mxu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        myd mydVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxu) {
            mxu mxuVar = (mxu) obj;
            if (this.a.equals(mxuVar.a) && ((mydVar = this.b) != null ? mydVar.equals(mxuVar.b) : mxuVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        myd mydVar = this.b;
        return (mydVar == null ? 0 : mydVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public mxu(mxt mxtVar, myd mydVar) {
        this.a = mxtVar;
        this.b = mydVar;
    }

    public final String toString() {
        myd mydVar = this.b;
        return OPuAVreQM.ZZTrjGegRM + this.a.toString() + ", " + String.valueOf(mydVar) + "}";
    }
}
