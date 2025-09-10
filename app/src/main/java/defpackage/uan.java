package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uan implements uam {
    public static final qxt a;
    public static final qxt b;
    public static final qxt c;
    public static final qxt d;
    public static final qxt e;

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.apps.camera")).c().a().b();
        a = qxrVarB.h("Primes__enable_battery_logging", false);
        b = qxrVarB.h("Primes__enable_crash_logging", false);
        c = qxrVarB.h("Primes__enable_memory_logging", false);
        d = qxrVarB.h("Primes__enable_package_metrics_logging", false);
        e = qxrVarB.h("Primes__enable_timer_logging", false);
    }

    @Override // defpackage.uam
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.uam
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.uam
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.uam
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.uam
    public final boolean e() {
        return ((Boolean) e.b()).booleanValue();
    }
}
