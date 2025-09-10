package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ltf {
    UNKNOWN(false),
    NORMAL(false),
    HDR_PLUS(false),
    HDR_PLUS_AUTO(false),
    BURST(false),
    PANORAMA(false),
    PHOTOSPHERE(false),
    RENDER_PHOTO(false),
    IMAGE_INTENT(false),
    VIDEO(true),
    PORTRAIT(false),
    CYCLOPS_PANO(false),
    m(false),
    TIMELAPSE(true),
    LONG_SHOT(false),
    VIDEO_SNAPSHOT(true),
    CINEMATIC(true),
    AUTO_LONG_SHOT(false),
    AMBER(true),
    AMETHYST(true),
    TAXI(false),
    LANDSCAPE(false),
    ACTION_PAN(false),
    SQUAD(false),
    SQUAD_BURST(false),
    SQUAD_PRIMARY(false),
    HI_RES(false),
    COTTAGE(false),
    VIDEO_NIGHT_SIGHT(true),
    SERENGETI(false);

    public final boolean E;

    ltf(boolean z) {
        this.E = z;
    }
}
