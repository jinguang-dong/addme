package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum mkw {
    DEFAULT_30_FPS,
    LOW_12_FPS,
    ULTRA_LOW_4_FPS;

    public final oxh a(mky mkyVar) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return mkyVar.c();
        }
        if (iOrdinal == 1) {
            return oxh.c(12, mkyVar.e);
        }
        if (iOrdinal == 2) {
            return oxh.c(4, mkyVar.e);
        }
        throw new RuntimeException(null, null);
    }
}
