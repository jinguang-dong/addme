package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum spi implements tpk {
    UNKNOWN(0),
    HOLD_STILL(1),
    AVOID_BLANK_SCENE(2),
    NEEDS_LIGHT(3),
    MOVE_CAMERA(4),
    GENERIC_SCENE_SUGGESTION(5);

    public final int g;

    spi(int i) {
        this.g = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
