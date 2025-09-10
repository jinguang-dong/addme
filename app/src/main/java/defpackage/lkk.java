package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lkk {
    AUTO,
    ULTRAWIDE,
    WIDE,
    TELE;

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal == 3) {
            return 4;
        }
        throw new RuntimeException(null, null);
    }
}
