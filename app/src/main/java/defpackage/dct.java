package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@ueo
/* loaded from: classes2.dex */
public final class dct extends dfb {
    private dbx a;
    private final List c;
    private final dcr d;
    private final String e;
    private final String f;

    public dct(dbx dbxVar, dcr dcrVar) {
        super(24);
        this.c = dbxVar.d;
        this.a = dbxVar;
        this.d = dcrVar;
        this.e = "08b926448d86528e697981ddd30459f7";
        this.f = "149fd8ad55885d3fe3549a37a0163243";
    }

    private final void g(dfa dfaVar) {
        dfaVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dfaVar.g(cpo.j(this.e));
    }

    @Override // defpackage.dfb
    public final void a(dfa dfaVar) {
        Cursor cursorB = dfaVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) == 0) {
                    z = true;
                }
            }
            ujk.e(cursorB, null);
            dcr dcrVar = this.d;
            dcrVar.b(dfaVar);
            if (!z) {
                dcs dcsVarA = dcrVar.a(dfaVar);
                if (!dcsVarA.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(dcsVarA.b)));
                }
            }
            g(dfaVar);
            for (cpo cpoVar : this.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.dfb
    public final void b(dfa dfaVar, int i, int i2) throws Exception {
        d(dfaVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // defpackage.dfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.dfa r5) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.b(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La9
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> La9
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            r3 = 0
            defpackage.ujk.e(r0, r3)
            if (r1 == 0) goto L5c
            dez r0 = new dez
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.a(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L32
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L55
            goto L33
        L32:
            r1 = r3
        L33:
            defpackage.ujk.e(r0, r3)
            java.lang.String r0 = r4.e
            boolean r2 = defpackage.a.ao(r0, r1)
            if (r2 != 0) goto L69
            java.lang.String r2 = r4.f
            boolean r2 = defpackage.a.ao(r2, r1)
            if (r2 == 0) goto L47
            goto L69
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r2 = ", found: "
            java.lang.String r5 = defpackage.mn.f(r1, r0, r5, r2)
            r4.<init>(r5)
            throw r4
        L55:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            defpackage.ujk.e(r0, r4)
            throw r5
        L5c:
            dcr r0 = r4.d
            dcs r0 = r0.a(r5)
            boolean r1 = r0.a
            if (r1 == 0) goto L97
            r4.g(r5)
        L69:
            dcr r0 = r4.d
            dyi r0 = (defpackage.dyi) r0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.a
            r0.a = r5
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r5.g(r1)
            ddo r1 = new ddo
            r1.<init>(r5)
            r0.t(r1)
            java.util.List r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            cpo r1 = (defpackage.cpo) r1
            r1.k(r5)
            goto L84
        L94:
            r4.a = r3
            return
        L97:
            java.lang.String r4 = r0.b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        La9:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> Lab
        Lab:
            r5 = move-exception
            defpackage.ujk.e(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dct.c(dfa):void");
    }

    @Override // defpackage.dfb
    public final void d(dfa dfaVar, int i, int i2) throws Exception {
        List listB;
        dbx dbxVar = this.a;
        if (dbxVar != null && (listB = cgh.B(dbxVar.o, i, i2)) != null) {
            int i3 = dei.a;
            cgh.z(new ddo(dfaVar));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                ((ddx) it.next()).b(new ddo(dfaVar));
            }
            dcs dcsVarA = this.d.a(dfaVar);
            if (!dcsVarA.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(dcsVarA.b)));
            }
            g(dfaVar);
            return;
        }
        dbx dbxVar2 = this.a;
        if (dbxVar2 == null || cgh.y(dbxVar2, i, i2)) {
            throw new IllegalStateException(a.bD(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        dfaVar.g("DROP TABLE IF EXISTS `Dependency`");
        dfaVar.g("DROP TABLE IF EXISTS `WorkSpec`");
        dfaVar.g("DROP TABLE IF EXISTS `WorkTag`");
        dfaVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        dfaVar.g("DROP TABLE IF EXISTS `WorkName`");
        dfaVar.g("DROP TABLE IF EXISTS `WorkProgress`");
        dfaVar.g("DROP TABLE IF EXISTS `Preference`");
        for (cpo cpoVar : this.c) {
        }
        this.d.b(dfaVar);
    }

    @Override // defpackage.dfb
    public final void e() {
    }
}
