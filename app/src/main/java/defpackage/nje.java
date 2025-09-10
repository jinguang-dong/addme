package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nje {
    public final Range a;
    public final Range b;
    public final uen c;

    public nje() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nje) {
            nje njeVar = (nje) obj;
            if (this.a.equals(njeVar.a) && this.b.equals(njeVar.b) && this.c.a(njeVar.c)) {
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
        uen uenVar = this.c;
        Range range = this.b;
        return "{" + this.a.toString() + ", " + range.toString() + ", " + uenVar.toString() + "}";
    }

    public nje(Range range, Range range2, uen uenVar) {
        range.getClass();
        this.a = range;
        range2.getClass();
        this.b = range2;
        uenVar.getClass();
        this.c = uenVar;
    }
}
