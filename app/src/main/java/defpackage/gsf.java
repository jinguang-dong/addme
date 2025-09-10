package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum gsf implements tpk {
    UNKNOWN(0),
    OPEN(1),
    WPA(2),
    WEP(3),
    SAE(4),
    UNRECOGNIZED(-1);

    private final int h;

    gsf(int i) {
        this.h = i;
    }

    public static gsf b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return WPA;
        }
        if (i == 3) {
            return WEP;
        }
        if (i != 4) {
            return null;
        }
        return SAE;
    }

    @Override // defpackage.tpk
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
