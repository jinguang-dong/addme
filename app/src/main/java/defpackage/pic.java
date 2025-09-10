package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
enum pic {
    CLOSED("Closed"),
    NOT_READY_TO_NEXT("NoReadyToNextImage"),
    OLD_RESULT("OldResult"),
    NEWER_PENDING_RESULT("NewerPendingResult"),
    NO_NEXT_RESULT("NoNextResult"),
    NULL_DISTRIBUTION("OldFrame");

    public final String g;

    pic(String str) {
        this.g = str;
    }
}
