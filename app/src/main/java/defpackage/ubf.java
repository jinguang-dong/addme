package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubf implements ube {
    public static final qxt a;
    public static final qxt b;
    public static final qxt c;
    public static final qxt d;
    public static final qxt e;
    public static final qxt f;
    public static final qxt g;
    public static final qxt h;
    public static final qxt i;

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.gms.icing.mdd")).c().b();
        a = qxrVarB.f("abs_free_space_after_download", 524288000L);
        b = qxrVarB.f("abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        c = qxrVarB.f("abs_free_space_after_download_low_storage_allowed", 104857600L);
        d = qxrVarB.h("downloader_enforce_https", true);
        e = qxrVarB.f("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = qxrVarB.f("downloader_max_threads", 2L);
        g = qxrVarB.h("enforce_low_storage_behavior", true);
        h = new qxm(qxrVarB, "fraction_free_space_after_download", Double.valueOf(0.1d), true);
        i = qxrVarB.f("time_to_wait_for_downloader", 120000L);
    }

    @Override // defpackage.ube
    public final double a() {
        return ((Double) h.b()).doubleValue();
    }

    @Override // defpackage.ube
    public final long b() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.ube
    public final long c() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.ube
    public final long d() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.ube
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.ube
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.ube
    public final long g() {
        return ((Long) i.b()).longValue();
    }

    @Override // defpackage.ube
    public final boolean h() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.ube
    public final boolean i() {
        return ((Boolean) g.b()).booleanValue();
    }
}
