package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum jry {
    UNKNOWN(1),
    CANCEL_AFTER_SHUTDOWN(2),
    CANCELLED_EXTERNALLY(3),
    STATIC_SCENE_OR_NO_BETTER_FRAME(5),
    START_TOO_CLOSE_TO_SHUTTER(5),
    TOO_SHORT(6),
    LONG_PRESS_TOO_SHORT(7),
    TEST_REASON(8);

    public final int i;

    jry(int i) {
        this.i = i;
    }
}
