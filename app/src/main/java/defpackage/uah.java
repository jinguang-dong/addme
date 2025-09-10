package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uah implements uag {
    public static final qxt a;
    public static final qxt b;
    public static final qxt c;
    public static final qxt d;
    public static final qxt e;
    public static final qxt f;

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.apps.camera")).c().a().b();
        a = qxrVarB.f("InAppUpdate__chip_delay_hours", 0L);
        b = qxrVarB.h("InAppUpdate__chip_dismissable", true);
        c = qxrVarB.f("InAppUpdate__chip_dismissal_limit", 2L);
        d = qxrVarB.f("InAppUpdate__chip_min_staleness_days", 0L);
        e = qxrVarB.f("InAppUpdate__chip_show_limit", 2L);
        f = qxrVarB.f("InAppUpdate__chip_timeout_seconds", 10L);
    }

    @Override // defpackage.uag
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.uag
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.uag
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.uag
    public final long d() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.uag
    public final long e() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.uag
    public final boolean f() {
        return ((Boolean) b.b()).booleanValue();
    }
}
