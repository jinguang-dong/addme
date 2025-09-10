package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum nkw {
    UNINITIALIZED(0, ssc.UNKNOWN_MODE),
    PHOTO(1, ssc.PHOTO_CAPTURE),
    VIDEO(2, ssc.VIDEO_CAPTURE),
    IMAX(3, ssc.IMAX_PANO),
    PHOTO_SPHERE(4, ssc.PHOTO_SPHERE),
    SLOW_MOTION(5, ssc.SLOW_MOTION),
    PORTRAIT(7, ssc.PORTRAIT),
    IMAGE_INTENT(8, ssc.PHOTO_CAPTURE_INTENT),
    VIDEO_INTENT(9, ssc.VIDEO_CAPTURE_INTENT),
    LENS(11, ssc.LENS),
    NIGHT_SIGHT(14, ssc.NIGHT_SIGHT),
    TIME_LAPSE(15, ssc.TIMELAPSE),
    SETTINGS(16, ssc.SETTINGS),
    AMBER(21, ssc.VIDEO_PORTRAIT),
    ROOSTER(22, ssc.CINEMATIC_PAN),
    LANDSCAPE(23, ssc.MOTION_LANDSCAPE),
    ACTION_PAN(24, ssc.MOTION_ACTION_PAN),
    SERENGETI(25, ssc.SERENGETI),
    COTTAGE(26, ssc.COTTAGE),
    VIDEO_NIGHT_SIGHT(27, ssc.VEGA);

    public final int u;
    public final ssc v;

    nkw(int i, ssc sscVar) {
        this.u = i;
        this.v = sscVar;
    }

    public final boolean a() {
        return this == VIDEO || this == VIDEO_NIGHT_SIGHT;
    }

    public final boolean b() {
        return this == PHOTO || this == IMAGE_INTENT || this == PORTRAIT || this == NIGHT_SIGHT || this == LANDSCAPE || this == ACTION_PAN;
    }

    public final boolean c() {
        return this == VIDEO || this == VIDEO_INTENT || this == AMBER || this == ROOSTER || this == TIME_LAPSE || this == VIDEO_NIGHT_SIGHT || this == SLOW_MOTION;
    }

    public final boolean d() {
        return this == IMAGE_INTENT || this == VIDEO_INTENT;
    }

    public final boolean e() {
        return this == PHOTO || this == SLOW_MOTION || this == PORTRAIT || this == LANDSCAPE || this == ACTION_PAN || this == NIGHT_SIGHT;
    }
}
