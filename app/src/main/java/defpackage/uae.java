package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uae implements uad {
    public static final qxt a;
    public static final qxt b;

    @Override // defpackage.uad
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.uad
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    static {
        qxr qxrVarB = new qxr(qxc.a("com.google.android.apps.camera")).c().a().b();
        qxrVarB.f("General__camera_perfetto_trigger_millis", 1000L);
        qxrVarB.f(LmJPKwPBa.RVWzNXr, 3000L);
        qxrVarB.f("General__camera_slow_launch_trigger_ms", 3000L);
        qxrVarB.h("General__enable_fsb", false);
        qxrVarB.h("General__enable_init_executor_reroute", false);
        qxrVarB.f("General__fatal_error_tracker_days_to_reset", 4L);
        qxrVarB.f("General__g", 2L);
        qxrVarB.f("General__init_executor_reroute_time_millis", 2000L);
        qxrVarB.f("General__shutter_blocked_time_threshold_millis", 500L);
        a = qxrVarB.f("General__sideline_max_attempts", 3L);
        b = qxrVarB.h(SHXc.bCBALJzgv, false);
        qxrVarB.f("General__sst_threshold_millis", 360L);
        qxrVarB.f("General__svj_threshold_millis", 250L);
    }
}
