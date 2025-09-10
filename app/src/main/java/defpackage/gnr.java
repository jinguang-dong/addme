package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnr {
    public final oxh a;
    public final oxj b;
    public final gax c;

    public gnr() {
        throw null;
    }

    public static sxx a() {
        sxx sxxVar = new sxx();
        sxxVar.d(oxh.FPS_AUTO);
        sxxVar.e(oxj.RES_UNKNOWN);
        sxxVar.b = gax.b().a();
        return sxxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnr) {
            gnr gnrVar = (gnr) obj;
            if (this.a.equals(gnrVar.a) && this.b.equals(gnrVar.b) && this.c.equals(gnrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        gax gaxVar = this.c;
        oxj oxjVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(oxjVar) + ", " + String.valueOf(gaxVar) + "}";
    }

    public gnr(oxh oxhVar, oxj oxjVar, gax gaxVar) {
        this.a = oxhVar;
        this.b = oxjVar;
        this.c = gaxVar;
    }
}
