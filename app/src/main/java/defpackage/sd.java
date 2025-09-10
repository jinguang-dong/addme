package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sd {
    public final ta a;
    public final rq b;

    public sd(ta taVar, rq rqVar) {
        this.a = taVar;
        this.b = rqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return a.ao(this.a, sdVar.a) && a.ao(this.b, sdVar.b);
    }

    public final int hashCode() {
        ta taVar = this.a;
        int iHashCode = taVar == null ? 0 : taVar.hashCode();
        rq rqVar = this.b;
        return (iHashCode * 31) + (rqVar != null ? rqVar.hashCode() : 0);
    }

    public sd() {
        this(null, null);
    }

    public final String toString() {
        return OPuAVreQM.lepWkKbubaqZWGJ + this.a + ", androidCameraState=" + this.b + ')';
    }
}
