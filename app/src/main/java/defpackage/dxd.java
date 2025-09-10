package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxd extends ddx {
    public static final dxd c = new dxd();

    private dxd() {
        super(1, 2);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        dfaVar.g("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        dfaVar.g("DROP TABLE IF EXISTS alarmInfo");
        dfaVar.g(CZAHo.bDNHkDyYAu);
    }
}
