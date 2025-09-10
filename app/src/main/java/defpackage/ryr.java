package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryr extends sem implements Serializable {
    private static final long serialVersionUID = 0;
    final rvu a;
    final sem b;

    public ryr(rvu rvuVar, sem semVar) {
        this.a = rvuVar;
        this.b = semVar;
    }

    @Override // defpackage.sem, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        rvu rvuVar = this.a;
        return this.b.compare(rvuVar.apply(obj), rvuVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ryr) {
            ryr ryrVar = (ryr) obj;
            if (this.a.equals(ryrVar.a) && this.b.equals(ryrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return "Ordering.natural().onResultOf(" + this.a.toString() + ")";
    }
}
