package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tee {
    public final InterleavedImageU8 a;
    public final szx b;

    public tee() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tee) {
            tee teeVar = (tee) obj;
            if (this.a.equals(teeVar.a) && this.b.equals(teeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        szx szxVar = this.b;
        if (szxVar.C()) {
            iJ = szxVar.j();
        } else {
            int iJ2 = szxVar.aT;
            if (iJ2 == 0) {
                iJ2 = szxVar.j();
                szxVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        return iJ ^ (iHashCode * 1000003);
    }

    public final String toString() {
        szx szxVar = this.b;
        return "{" + this.a.toString() + ", " + szxVar.toString() + "}";
    }

    public tee(InterleavedImageU8 interleavedImageU8, szx szxVar) {
        this.a = interleavedImageU8;
        szxVar.getClass();
        this.b = szxVar;
    }
}
