package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubl implements ubk {
    public static final qxt a;
    public static final qxt b;
    public static final qxt c;
    public static final qxt d;
    public static final qxt e;
    public static final qxt f;
    public static final qxt g;
    public static final qxt h;

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.gms.icing.mdd")).c().b();
        qxrVarB.f("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        qxrVarB.h("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = qxrVarB.f("cellular_charging_gcm_task_period", 21600L);
        int i = 6;
        b = qxrVarB.i("cellular_task_constraint_overrides", new qdm(i), "CAEQARgA");
        qxrVarB.f("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        qxrVarB.h("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        c = qxrVarB.f("charging_gcm_task_period", 21600L);
        qxrVarB.f("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        qxrVarB.h("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        d = qxrVarB.f("maintenance_gcm_task_period", 86400L);
        e = qxrVarB.i("maintenance_task_constraint_overrides", new qdm(i), "CAEQARgA");
        f = qxrVarB.i("routine_task_constraint_overrides", new qdm(i), "CAEQARgA");
        qxrVarB.f("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        qxrVarB.h("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        g = qxrVarB.f("wifi_charging_gcm_task_period", 21600L);
        h = qxrVarB.i("wifi_task_constraint_overrides", new qdm(i), "CAEQARgA");
    }

    @Override // defpackage.ubk
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.ubk
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.ubk
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.ubk
    public final long d() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.ubk
    public final pty e() {
        return (pty) b.b();
    }

    @Override // defpackage.ubk
    public final pty f() {
        return (pty) e.b();
    }

    @Override // defpackage.ubk
    public final pty g() {
        return (pty) f.b();
    }

    @Override // defpackage.ubk
    public final pty h() {
        return (pty) h.b();
    }
}
