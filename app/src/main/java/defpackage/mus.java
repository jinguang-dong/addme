package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mus {
    OFF(0),
    THREE_BY_THREE(1),
    FOUR_BY_FOUR(2),
    GOLDEN_RATIO(3);

    public final int e;

    mus(int i) {
        this.e = i;
    }

    public static mus a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? OFF : GOLDEN_RATIO : FOUR_BY_FOUR : THREE_BY_THREE : OFF;
    }
}
