package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum svv implements Comparator {
    TRUE_FIRST(1, "Booleans.trueFirst()"),
    FALSE_FIRST(-1, "Booleans.falseFirst()");

    private final int d;
    private final String e;

    svv(int i, String str) {
        this.d = i;
        this.e = str;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        return (bool.booleanValue() ? this.d : 0) - (((Boolean) obj).booleanValue() ? this.d : 0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
