package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyi extends dcr {
    public final /* synthetic */ WorkDatabase_Impl a;

    public dyi(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
    }

    @Override // defpackage.dcr
    public final void b(dfa dfaVar) {
        dfaVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dfaVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dfaVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        dfaVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dfaVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.dcr
    public final dcs a(dfa dfaVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new dek("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new dek("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new dem("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new dem("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        den denVar = new den("Dependency", map, hashSet, hashSet2);
        den denVarA = den.a(dfaVar, "Dependency");
        boolean zS = cgh.s(denVar, denVarA);
        String str = CGlJpiVWrCQOq.QGZKYByPmwmGfgV;
        if (!zS) {
            return new dcs(false, a.bC(denVarA, denVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", str));
        }
        HashMap map2 = new HashMap(33);
        map2.put("id", new dek("id", "TEXT", true, 1, null, 1));
        map2.put("state", new dek("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new dek(nWEkBGOQPWQp.cFMk, "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new dek("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new dek("input", "BLOB", true, 0, null, 1));
        map2.put("output", new dek("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new dek("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new dek("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new dek("flex_duration", "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new dek("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new dek("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new dek("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new dek("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        map2.put("minimum_retention_duration", new dek("minimum_retention_duration", CZAHo.UmCYgjDB, true, 0, null, 1));
        map2.put("schedule_requested_at", new dek("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new dek("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new dek("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new dek("period_count", "INTEGER", true, 0, "0", 1));
        map2.put("generation", new dek("generation", "INTEGER", true, 0, "0", 1));
        map2.put("next_schedule_time_override", new dek("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        map2.put("next_schedule_time_override_generation", new dek("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        map2.put("stop_reason", new dek("stop_reason", TOnSyMaYeslEl.oEsoIzMzIgANlT, true, 0, "-256", 1));
        map2.put("trace_tag", new dek("trace_tag", "TEXT", false, 0, null, 1));
        map2.put("backoff_on_system_interruptions", new dek("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        map2.put("required_network_type", new dek("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("required_network_request", new dek("required_network_request", "BLOB", true, 0, "x''", 1));
        map2.put("requires_charging", new dek("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new dek("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new dek("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new dek("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new dek("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new dek("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new dek("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new dem("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new dem("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        den denVar2 = new den("WorkSpec", map2, hashSet3, hashSet4);
        den denVarA2 = den.a(dfaVar, "WorkSpec");
        if (!cgh.s(denVar2, denVarA2)) {
            return new dcs(false, a.bC(denVarA2, denVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", str));
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new dek("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new dek("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new dem("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        String str2 = YyLACfm.tnPx;
        den denVar3 = new den(str2, map3, hashSet5, hashSet6);
        den denVarA3 = den.a(dfaVar, str2);
        if (!cgh.s(denVar3, denVarA3)) {
            return new dcs(false, a.bC(denVarA3, denVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", str));
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new dek("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new dek("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new dek("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        den denVar4 = new den("SystemIdInfo", map4, hashSet7, new HashSet(0));
        den denVarA4 = den.a(dfaVar, "SystemIdInfo");
        if (!cgh.s(denVar4, denVarA4)) {
            return new dcs(false, a.bC(denVarA4, denVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", str));
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new dek("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new dek("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new dem("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        den denVar5 = new den("WorkName", map5, hashSet8, hashSet9);
        den denVarA5 = den.a(dfaVar, "WorkName");
        if (!cgh.s(denVar5, denVarA5)) {
            return new dcs(false, a.bC(denVarA5, denVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", str));
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new dek("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new dek("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new del("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        den denVar6 = new den("WorkProgress", map6, hashSet10, new HashSet(0));
        den denVarA6 = den.a(dfaVar, "WorkProgress");
        if (!cgh.s(denVar6, denVarA6)) {
            return new dcs(false, a.bC(denVarA6, denVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", str));
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new dek("key", "TEXT", true, 1, null, 1));
        map7.put("long_value", new dek("long_value", "INTEGER", false, 0, null, 1));
        den denVar7 = new den("Preference", map7, new HashSet(0), new HashSet(0));
        den denVarA7 = den.a(dfaVar, "Preference");
        return !cgh.s(denVar7, denVarA7) ? new dcs(false, a.bC(denVarA7, denVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", str)) : new dcs(true, null);
    }
}
