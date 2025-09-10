package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtp {
    public static final dtp a = new dtp("UNKNOWN");
    public static final dtp b = new dtp("UNSUPPORTED");
    public static final dtp c = new dtp("UNAVAILABLE");
    public static final dtp d = new dtp("AVAILABLE");
    public static final dtp e = new dtp("ACTIVE");
    private final String f;

    private dtp(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
