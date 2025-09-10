package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ucn implements ucm {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;

    static {
        qzn qznVar = ubm.a;
        a = qzi.a("45679554", 17L, "google_camera_app", qznVar);
        b = qzi.c("45683331", true, "google_camera_app", qznVar);
        c = qzi.c("45685869", false, "google_camera_app", qznVar);
    }

    @Override // defpackage.ucm
    public final long a() {
        return ((Long) a.fr()).longValue();
    }

    @Override // defpackage.ucm
    public final boolean b() {
        return ((Boolean) b.fr()).booleanValue();
    }

    @Override // defpackage.ucm
    public final boolean c() {
        return ((Boolean) c.fr()).booleanValue();
    }
}
