package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njh {
    public final Range a;
    public final uen b;

    public njh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof njh) {
            njh njhVar = (njh) obj;
            if (this.a.equals(njhVar.a) && this.b.a(njhVar.b)) {
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
        uen uenVar = this.b;
        return "{" + this.a.toString() + ", " + uenVar.toString() + "}";
    }

    public njh(Range range, uen uenVar) {
        range.getClass();
        this.a = range;
        uenVar.getClass();
        this.b = uenVar;
    }
}
