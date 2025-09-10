package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum iqm {
    NOT_SET(0),
    STANDARD(1),
    REAR_CAMERA_SELFIE(2),
    DUAL_SCREEN(3),
    MADE_YOU_LOOK(4);

    public final int f;

    iqm(int i) {
        this.f = i;
    }

    public static iqm b(luj lujVar) {
        int iIntValue = ((Integer) lujVar.b(luf.ba)).intValue();
        return iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? NOT_SET : MADE_YOU_LOOK : DUAL_SCREEN : REAR_CAMERA_SELFIE : STANDARD : NOT_SET;
    }

    public final iqh a() {
        int iOrdinal = ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iqh.NONE : iqh.URANUS : iqh.SATURN : iqh.JUPITER;
    }
}
