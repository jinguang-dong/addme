package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum gyb implements tpk {
    FACING_UNSPECIFIED(0),
    FACING_BACK(1),
    FACING_FRONT(2),
    FACING_EXTERNAL(3);

    public final int e;

    gyb(int i) {
        this.e = i;
    }

    public static gyb b(int i) {
        if (i == 0) {
            return FACING_UNSPECIFIED;
        }
        if (i == 1) {
            return FACING_BACK;
        }
        if (i == 2) {
            return FACING_FRONT;
        }
        if (i != 3) {
            return null;
        }
        return FACING_EXTERNAL;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
