package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum muy {
    NO_CROPPED(false, false, false, false),
    ONE_SIDE_CROPPED_LEFT(true, false, false, false),
    ONE_SIDE_CROPPED_TOP(false, true, false, false),
    ONE_SIDE_CROPPED_RIGHT(false, false, true, false),
    ONE_SIDE_CROPPED_BOTTOM(false, false, false, true),
    TWO_SIDE_CROPPED_TOP_LEFT(true, true, false, false),
    TWO_SIDE_CROPPED_TOP_RIGHT(false, true, true, false),
    TWO_SIDE_CROPPED_BOTTOM_RIGHT(false, false, true, true),
    TWO_SIDE_CROPPED_BOTTOM_LEFT(true, false, false, true),
    TWO_SIDE_CROPPED_UP_DOWN(false, true, false, true),
    TWO_SIDE_CROPPED_LEFT_RIGHT(true, false, true, false),
    THREE_SIDE_CROPPED_EXCEPT_LEFT(false, true, true, true),
    THREE_SIDE_CROPPED_EXCEPT_TOP(true, false, true, true),
    n(true, true, false, true),
    THREE_SIDE_CROPPED_EXCEPT_BOTTOM(true, true, true, false),
    FOUR_SIDE_CROPPED(true, true, true, true);

    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    muy(boolean z, boolean z2, boolean z3, boolean z4) {
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = z4;
    }

    public static muy b(boolean z, boolean z2, boolean z3, boolean z4) {
        for (muy muyVar : values()) {
            if (muyVar.q == z && muyVar.r == z2 && muyVar.s == z3 && muyVar.t == z4) {
                return muyVar;
            }
        }
        return NO_CROPPED;
    }

    public final muy a(muy muyVar) {
        return b(this.q || muyVar.q, this.r || muyVar.r, this.s || muyVar.s, this.t || muyVar.t);
    }

    public final boolean c() {
        return this.q || this.r || this.s || this.t;
    }
}
