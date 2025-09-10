package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum muv {
    NONE(false, false, false, false),
    TILT_UP(true, false, false, false),
    TILT_DOWN(false, true, false, false),
    PAN_LEFT(false, false, true, false),
    e(false, false, false, true),
    TILT_UP_AND_PAN_LEFT(true, false, true, false),
    TILT_UP_AND_PAN_RIGHT(true, false, false, true),
    h(false, true, true, false),
    TILT_DOWN_AND_PAN_RIGHT(false, true, false, true);

    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    muv(boolean z, boolean z2, boolean z3, boolean z4) {
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }
}
