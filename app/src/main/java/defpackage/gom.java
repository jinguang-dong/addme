package defpackage;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase_Impl;
import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gom extends dcp {
    final /* synthetic */ CameraFatalErrorTrackerDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gom(CameraFatalErrorTrackerDatabase_Impl cameraFatalErrorTrackerDatabase_Impl) {
        super(5, "e7b45086cd950266a3a3a8f0da0a57b0", "c9b58355d6a76cd8d24dcaa135d48342");
        this.d = cameraFatalErrorTrackerDatabase_Impl;
    }

    @Override // defpackage.dcp
    public final void a(ddo ddoVar) {
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS `FatalErrorCounts` (`cameraId` TEXT NOT NULL, `failuresBeforeRebootDuringOpen` INTEGER NOT NULL, `failuresAfterRebootDuringOpen` INTEGER NOT NULL, `failuresBeforeRebootDuringSession` INTEGER NOT NULL, `failuresAfterRebootDuringSession` INTEGER NOT NULL, `lastFatalErrorTimestamp` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, PRIMARY KEY(`cameraId`))");
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS `EnumerationErrorCounts` (`errorCode` INTEGER NOT NULL, `failuresBeforeReboot` INTEGER NOT NULL, `failuresAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, `lastFailureTimestamp` INTEGER NOT NULL, PRIMARY KEY(`errorCode`))");
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS `HardwareHelpDialogCounts` (`reason` INTEGER, `impressionsBeforeReboot` INTEGER NOT NULL, `impressionsAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, PRIMARY KEY(`reason`))");
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cog.p(ddoVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e7b45086cd950266a3a3a8f0da0a57b0')");
    }

    @Override // defpackage.dcp
    public final void b(ddo ddoVar) {
        cog.p(ddoVar, "DROP TABLE IF EXISTS `FatalErrorCounts`");
        cog.p(ddoVar, "DROP TABLE IF EXISTS `EnumerationErrorCounts`");
        cog.p(ddoVar, "DROP TABLE IF EXISTS `HardwareHelpDialogCounts`");
    }

    @Override // defpackage.dcp
    public final void c(ddo ddoVar) throws Exception {
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
        HashMap map = new HashMap(7);
        map.put("cameraId", new dek("cameraId", "TEXT", true, 1, null, 1));
        map.put("failuresBeforeRebootDuringOpen", new dek("failuresBeforeRebootDuringOpen", GdpuLBytnYW.MYkvZrdBDgCiZ, true, 0, null, 1));
        map.put("failuresAfterRebootDuringOpen", new dek("failuresAfterRebootDuringOpen", "INTEGER", true, 0, null, 1));
        map.put("failuresBeforeRebootDuringSession", new dek("failuresBeforeRebootDuringSession", "INTEGER", true, 0, null, 1));
        map.put("failuresAfterRebootDuringSession", new dek("failuresAfterRebootDuringSession", "INTEGER", true, 0, null, 1));
        map.put(yoGAhrpjU.mKHtZknuUjcBU, new dek("lastFatalErrorTimestamp", "INTEGER", true, 0, null, 1));
        map.put("rebootCount", new dek("rebootCount", "INTEGER", true, 0, null, 1));
        den denVar = new den("FatalErrorCounts", map, new HashSet(0), new HashSet(0));
        den denVarT = cgh.t(ddoVar, "FatalErrorCounts");
        if (!cgh.s(denVar, denVarT)) {
            return new kbz(false, "FatalErrorCounts(com.google.android.apps.camera.camerafatalerror.FatalErrorCounts).\n Expected:\n" + cgh.o(denVar) + "\n Found:\n" + cgh.o(denVarT));
        }
        HashMap map2 = new HashMap(5);
        map2.put("errorCode", new dek("errorCode", "INTEGER", true, 1, null, 1));
        map2.put("failuresBeforeReboot", new dek("failuresBeforeReboot", "INTEGER", true, 0, null, 1));
        map2.put("failuresAfterReboot", new dek("failuresAfterReboot", "INTEGER", true, 0, null, 1));
        map2.put("rebootCount", new dek("rebootCount", "INTEGER", true, 0, null, 1));
        map2.put("lastFailureTimestamp", new dek("lastFailureTimestamp", "INTEGER", true, 0, null, 1));
        den denVar2 = new den("EnumerationErrorCounts", map2, new HashSet(0), new HashSet(0));
        den denVarT2 = cgh.t(ddoVar, "EnumerationErrorCounts");
        if (!cgh.s(denVar2, denVarT2)) {
            return new kbz(false, "EnumerationErrorCounts(com.google.android.apps.camera.camerafatalerror.EnumerationErrorCounts).\n Expected:\n" + cgh.o(denVar2) + "\n Found:\n" + cgh.o(denVarT2));
        }
        HashMap map3 = new HashMap(4);
        map3.put("reason", new dek("reason", "INTEGER", false, 1, null, 1));
        map3.put("impressionsBeforeReboot", new dek("impressionsBeforeReboot", "INTEGER", true, 0, null, 1));
        map3.put("impressionsAfterReboot", new dek("impressionsAfterReboot", "INTEGER", true, 0, null, 1));
        map3.put("rebootCount", new dek("rebootCount", "INTEGER", true, 0, null, 1));
        den denVar3 = new den("HardwareHelpDialogCounts", map3, new HashSet(0), new HashSet(0));
        den denVarT3 = cgh.t(ddoVar, "HardwareHelpDialogCounts");
        if (cgh.s(denVar3, denVarT3)) {
            return new kbz(true, (String) null);
        }
        return new kbz(false, "HardwareHelpDialogCounts(com.google.android.apps.camera.camerafatalerror.HardwareHelpDialogCounts).\n Expected:\n" + cgh.o(denVar3) + "\n Found:\n" + cgh.o(denVarT3));
    }
}
