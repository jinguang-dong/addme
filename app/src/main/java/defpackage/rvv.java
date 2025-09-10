package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvv implements Serializable, rvu {
    private static final long serialVersionUID = 0;
    private final Object a = null;

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.rvu
    public final boolean equals(Object obj) {
        if (!(obj instanceof rvv)) {
            return false;
        }
        Object obj2 = ((rvv) obj).a;
        return a.K(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
