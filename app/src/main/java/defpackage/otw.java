package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otw {
    private static ouc a;

    public static synchronized ouc a() {
        if (a == null) {
            b(new ouc());
        }
        return a;
    }

    public static synchronized void b(ouc oucVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = oucVar;
    }
}
