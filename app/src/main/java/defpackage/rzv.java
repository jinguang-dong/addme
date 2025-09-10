package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzv extends rzw implements Serializable {
    public static final rzv a = new rzv();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ long a(Comparable comparable, Comparable comparable2) {
        return ((Integer) comparable2).intValue() - ((Integer) comparable).intValue();
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ Comparable c() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ Comparable d(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue + 1);
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ Comparable e(Comparable comparable, long j) {
        Integer num = (Integer) comparable;
        if (j >= 0) {
            return Integer.valueOf(ske.Y(num.longValue() + j));
        }
        throw new IllegalArgumentException(mn.h(j, "distance cannot be negative but was: "));
    }

    @Override // defpackage.rzw
    public final /* bridge */ /* synthetic */ Comparable f(Comparable comparable) {
        int iIntValue = ((Integer) comparable).intValue();
        if (iIntValue == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(iIntValue - 1);
    }

    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
