package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvw implements Serializable, rvu {
    private static final long serialVersionUID = 0;
    private final rvu a;
    private final rvu b;

    public rvw(rvu rvuVar, rvu rvuVar2) {
        this.a = rvuVar;
        rvuVar2.getClass();
        this.b = rvuVar2;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        return this.a.apply(this.b.apply(obj));
    }

    @Override // defpackage.rvu
    public final boolean equals(Object obj) {
        if (obj instanceof rvw) {
            rvw rvwVar = (rvw) obj;
            if (this.b.equals(rvwVar.b) && this.a.equals(rvwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        rvu rvuVar = this.b;
        return this.a.toString() + "(" + rvuVar.toString() + ")";
    }
}
