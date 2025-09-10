package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oay extends obd {
    final /* synthetic */ oba a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oay(oba obaVar, oar oarVar) {
        super(oarVar);
        this.a = obaVar;
    }

    @Override // defpackage.obd
    public final void a() {
        oba obaVar = this.a;
        try {
            oav oavVar = obaVar.c;
            oak.a();
            oavVar.z();
            obv obvVar = oavVar.d;
            if (obvVar.c(86400000L)) {
                obvVar.b();
                oavVar.q("Deleting stale hits (if any)");
                oavVar.r("Deleted stale hits, count", Integer.valueOf(oavVar.b().delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)})));
            }
            obaVar.F();
        } catch (SQLiteException e) {
            obaVar.u("Failed to delete stale hits", e);
        }
        obaVar.d.d(86400000L);
    }
}
