package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ech extends dcc {
    public ech(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcc
    protected final /* synthetic */ void b(dfq dfqVar, Object obj) {
        ebx ebxVar = (ebx) obj;
        dfqVar.g(1, ebxVar.b);
        dfqVar.e(2, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.u(ebxVar.x));
        dfqVar.g(3, ebxVar.c);
        dfqVar.g(4, ebxVar.d);
        dvx dvxVar = ebxVar.e;
        dvx dvxVar2 = dvx.a;
        dfqVar.c(5, cij.r(dvxVar));
        dfqVar.c(6, cij.r(ebxVar.f));
        dfqVar.e(7, ebxVar.g);
        dfqVar.e(8, ebxVar.h);
        dfqVar.e(9, ebxVar.i);
        dfqVar.e(10, ebxVar.k);
        dfqVar.e(11, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.r(ebxVar.y));
        dfqVar.e(12, ebxVar.l);
        dfqVar.e(13, ebxVar.m);
        dfqVar.e(14, ebxVar.n);
        dfqVar.e(15, ebxVar.o);
        dfqVar.e(16, ebxVar.p ? 1L : 0L);
        dfqVar.e(17, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.t(ebxVar.z));
        dfqVar.e(18, ebxVar.q);
        dfqVar.e(19, ebxVar.r);
        dfqVar.e(20, ebxVar.s);
        dfqVar.e(21, ebxVar.t);
        dfqVar.e(22, ebxVar.u);
        String str = ebxVar.v;
        if (str == null) {
            dfqVar.f(23);
        } else {
            dfqVar.g(23, str);
        }
        Boolean bool = ebxVar.w;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            dfqVar.f(24);
        } else {
            dfqVar.e(24, r3.intValue());
        }
        dvv dvvVar = ebxVar.j;
        dfqVar.e(25, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.s(dvvVar.j));
        dfqVar.c(26, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.p(dvvVar.b));
        dfqVar.e(27, dvvVar.c ? 1L : 0L);
        dfqVar.e(28, dvvVar.d ? 1L : 0L);
        dfqVar.e(29, dvvVar.e ? 1L : 0L);
        dfqVar.e(30, dvvVar.f ? 1L : 0L);
        dfqVar.e(31, dvvVar.g);
        dfqVar.e(32, dvvVar.h);
        dfqVar.c(33, AmbientLifecycleObserver.AmbientLifecycleCallback.CC.q(dvvVar.i));
    }

    @Override // defpackage.dcv
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
