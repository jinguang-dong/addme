package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uby implements ubx {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;
    public static final qzh d;
    public static final qzh e;

    static {
        qzn qznVar = ubm.a;
        a = qzi.a("45690808", 1000L, "google_camera_app", qznVar);
        b = qzi.c("45655467", false, "google_camera_app", qznVar);
        c = qzi.c("45693122", true, "google_camera_app", qznVar);
        d = qzi.a("45677245", 30L, "google_camera_app", qznVar);
        e = qzi.a("45679272", 30L, "google_camera_app", qznVar);
    }

    @Override // defpackage.ubx
    public final long a() {
        return ((Long) a.fr()).longValue();
    }

    @Override // defpackage.ubx
    public final long b() {
        return ((Long) d.fr()).longValue();
    }

    @Override // defpackage.ubx
    public final long c() {
        return ((Long) e.fr()).longValue();
    }

    @Override // defpackage.ubx
    public final boolean d() {
        return ((Boolean) b.fr()).booleanValue();
    }

    @Override // defpackage.ubx
    public final boolean e() {
        return ((Boolean) c.fr()).booleanValue();
    }
}
