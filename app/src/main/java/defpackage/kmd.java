package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmd {
    public final Float a;
    private final Pair b;

    public kmd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kmd) {
            kmd kmdVar = (kmd) obj;
            Float f = this.a;
            if (f != null ? f.equals(kmdVar.a) : kmdVar.a == null) {
                Pair pair = this.b;
                if (pair != null ? pair.equals(kmdVar.b) : kmdVar.b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        Pair pair = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        return "{" + this.a + ", " + String.valueOf(this.b) + "}";
    }

    public kmd(Float f, Pair pair) {
        this.a = f;
        this.b = pair;
    }
}
