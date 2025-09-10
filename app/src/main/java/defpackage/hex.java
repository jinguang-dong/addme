package defpackage;

import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase_Impl;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hex extends dcp {
    final /* synthetic */ ShotDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hex(ShotDatabase_Impl shotDatabase_Impl) {
        super(9, "d5a320f0e030e16072c0c60f65398e1d", "9330e297cee824d2d260a862d56ce4e4");
        this.d = shotDatabase_Impl;
    }

    @Override // defpackage.dcp
    public final void a(ddo ddoVar) {
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS `shots` (`shot_id` INTEGER NOT NULL, `title` TEXT, `start_millis` INTEGER NOT NULL, `persisted_millis` INTEGER NOT NULL, `canceled_millis` INTEGER NOT NULL, `deleted_millis` INTEGER NOT NULL, `most_recent_event_millis` INTEGER NOT NULL, `capture_session_type` TEXT, `capture_session_shot_id` TEXT, `pid` INTEGER NOT NULL, `stuck` INTEGER NOT NULL, `failed` INTEGER NOT NULL, PRIMARY KEY(`shot_id`))");
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS `shot_log` (`sequence` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `shot_id` INTEGER NOT NULL, `time_millis` INTEGER NOT NULL, `message` TEXT, FOREIGN KEY(`shot_id`) REFERENCES `shots`(`shot_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        cog.p(ddoVar, "CREATE INDEX IF NOT EXISTS `index_shot_log_shot_id_sequence` ON `shot_log` (`shot_id`, `sequence`)");
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cog.p(ddoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd5a320f0e030e16072c0c60f65398e1d')");
    }

    @Override // defpackage.dcp
    public final void b(ddo ddoVar) {
        cog.p(ddoVar, "DROP TABLE IF EXISTS `shots`");
        cog.p(ddoVar, "DROP TABLE IF EXISTS `shot_log`");
    }

    @Override // defpackage.dcp
    public final void c(ddo ddoVar) throws Exception {
        cog.p(ddoVar, "PRAGMA foreign_keys = ON");
        this.d.t(ddoVar);
    }

    @Override // defpackage.dcp
    public final void d(ddo ddoVar) throws Exception {
        cgh.z(ddoVar);
    }

    @Override // defpackage.dcp
    public final void e() {
    }

    @Override // defpackage.dcp
    public final void f() {
    }

    @Override // defpackage.dcp
    public final kbz g(ddo ddoVar) throws Exception {
        HashMap map = new HashMap(12);
        map.put("shot_id", new dek("shot_id", "INTEGER", true, 1, null, 1));
        map.put("title", new dek("title", "TEXT", false, 0, null, 1));
        map.put("start_millis", new dek("start_millis", "INTEGER", true, 0, null, 1));
        map.put("persisted_millis", new dek("persisted_millis", "INTEGER", true, 0, null, 1));
        map.put("canceled_millis", new dek(JvFFEwFNdCrxf.oYfXWMAAebc, "INTEGER", true, 0, null, 1));
        map.put("deleted_millis", new dek("deleted_millis", "INTEGER", true, 0, null, 1));
        map.put("most_recent_event_millis", new dek("most_recent_event_millis", "INTEGER", true, 0, null, 1));
        map.put("capture_session_type", new dek("capture_session_type", "TEXT", false, 0, null, 1));
        map.put("capture_session_shot_id", new dek("capture_session_shot_id", "TEXT", false, 0, null, 1));
        map.put("pid", new dek("pid", "INTEGER", true, 0, null, 1));
        map.put("stuck", new dek("stuck", "INTEGER", true, 0, null, 1));
        map.put("failed", new dek("failed", "INTEGER", true, 0, null, 1));
        den denVar = new den("shots", map, new HashSet(0), new HashSet(0));
        den denVarT = cgh.t(ddoVar, "shots");
        if (!cgh.s(denVar, denVarT)) {
            return new kbz(false, "shots(com.google.android.apps.camera.debug.shottracker.db.ShotEntity).\n Expected:\n" + cgh.o(denVar) + "\n Found:\n" + cgh.o(denVarT));
        }
        HashMap map2 = new HashMap(4);
        map2.put("sequence", new dek("sequence", "INTEGER", true, 1, null, 1));
        map2.put("shot_id", new dek("shot_id", "INTEGER", true, 0, null, 1));
        map2.put("time_millis", new dek("time_millis", "INTEGER", true, 0, null, 1));
        map2.put("message", new dek("message", "TEXT", false, 0, null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new del("shots", "CASCADE", "NO ACTION", Arrays.asList("shot_id"), Arrays.asList("shot_id")));
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new dem("index_shot_log_shot_id_sequence", false, Arrays.asList("shot_id", "sequence"), Arrays.asList("ASC", "ASC")));
        den denVar2 = new den("shot_log", map2, hashSet, hashSet2);
        den denVarT2 = cgh.t(ddoVar, "shot_log");
        if (cgh.s(denVar2, denVarT2)) {
            return new kbz(true, (String) null);
        }
        return new kbz(false, "shot_log(com.google.android.apps.camera.debug.shottracker.db.ShotLogEntity).\n Expected:\n" + cgh.o(denVar2) + "\n Found:\n" + cgh.o(denVarT2));
    }
}
