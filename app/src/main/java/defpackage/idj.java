package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idj {
    public final ieb a;
    public final int b;

    public idj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idj) {
            idj idjVar = (idj) obj;
            if (this.b == idjVar.b && this.a.equals(idjVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aF(i);
        return this.a.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public idj(int i, ieb iebVar) {
        this.b = i;
        iebVar.getClass();
        this.a = iebVar;
    }

    public final String toString() {
        return clFzVRcygwbq.JUweNeEkenqn + ezh.R(this.b) + ", " + this.a.toString() + "}";
    }
}
