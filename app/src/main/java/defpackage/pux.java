package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum pux implements tpk {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);

    private final int f;

    pux(int i) {
        this.f = i;
    }

    public static pux b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return SHARED_PREFERENCES_ONLY;
        }
        if (i == 2) {
            return SHARED_PREFERENCES_AND_PROTOSTORE;
        }
        if (i != 3) {
            return null;
        }
        return PROTOSTORE_ONLY;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
