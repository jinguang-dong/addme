package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mwd {
    READY_TO_CAPTURE("Ready to capture", 15.0f, 17.5f, "green"),
    DISTANCE_1("distance 1", 22.5f, 25.0f, "#E8C86B"),
    DISTANCE_2("distance 2", 39.0f, 41.5f, "#FFA500"),
    DISTANCE_3("distance 3", 2.1474836E9f, 2.1474836E9f, "#FF8C00"),
    e("distance outer", 2.1474836E9f, 2.1474836E9f, "transparent"),
    IDLE("idle", 2.1474836E9f, 2.1474836E9f, "transparent"),
    FACE_TOO_FAR("Face too far", 2.1474836E9f, 2.1474836E9f, "yellow"),
    FACE_TOO_CLOSE("Face too close", 2.1474836E9f, 2.1474836E9f, "yellow"),
    OBJECT_TILT_UP("Object tilt up", 2.1474836E9f, 2.1474836E9f, "yellow"),
    OBJECT_TILT_DOWN("Object tilt down", 2.1474836E9f, 2.1474836E9f, "yellow"),
    OBJECT_PAN_LEFT("Object pan left", 2.1474836E9f, 2.1474836E9f, "yellow"),
    OBJECT_PAN_RIGHT("Object pan right", 2.1474836E9f, 2.1474836E9f, "yellow"),
    READY_TO_CAPTURE_MULTIPLE_FACES("Ready to capture(multi-faces)", 2.1474836E9f, 2.1474836E9f, "transparent"),
    READY_TO_CAPTURE_MULTIPLE_KEY_SUBJECT("Ready to capture(multiple key subject)", 2.1474836E9f, 2.1474836E9f, "transparent"),
    MULTIPLE_KEY_SUBJECT_CROPPED("Multiple key-subject cropped", 2.1474836E9f, 2.1474836E9f, "transparent");

    public final String p;
    public final String q;
    private final float s;
    private final float t;

    mwd(String str, float f, float f2, String str2) {
        this.p = str;
        this.s = f;
        this.t = f2;
        this.q = str2;
    }

    public final float a(boolean z) {
        return z ? this.s : this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.p;
    }
}
