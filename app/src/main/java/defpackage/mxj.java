package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mxj {
    TABLET_LAYOUT,
    PHONE_LAYOUT,
    SIMPLIFIED_LAYOUT,
    JARVIS_LAYOUT;

    public final boolean a() {
        return this == TABLET_LAYOUT || this == JARVIS_LAYOUT;
    }

    public final boolean b() {
        return this == PHONE_LAYOUT || this == SIMPLIFIED_LAYOUT;
    }
}
