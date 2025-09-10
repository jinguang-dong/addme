package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcl extends dfb {
    final /* synthetic */ dbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcl(dbw dbwVar, int i) {
        super(i);
        this.a = dbwVar;
    }

    @Override // defpackage.dfb
    public final void b(dfa dfaVar, int i, int i2) {
        d(dfaVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // defpackage.dfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.dfa r10) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            ddo r1 = new ddo
            r1.<init>(r10)
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'"
            ddw r2 = r1.a(r2)
            boolean r3 = r2.j()     // Catch: java.lang.Throwable -> Ld5
            r4 = 0
            if (r3 == 0) goto L20
            long r5 = r2.b(r4)     // Catch: java.lang.Throwable -> Ld5
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r4
        L21:
            dbw r5 = r9.a
            r6 = 0
            defpackage.ske.ay(r2, r6)
            if (r3 == 0) goto L66
            java.lang.String r0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            ddw r0 = r1.a(r0)
            boolean r2 = r0.j()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L3a
            java.lang.String r2 = r0.d(r4)     // Catch: java.lang.Throwable -> L5f
            goto L3b
        L3a:
            r2 = r6
        L3b:
            defpackage.ske.ay(r0, r6)
            dcp r0 = r5.b
            java.lang.String r3 = r0.b
            boolean r4 = defpackage.a.ao(r3, r2)
            if (r4 != 0) goto Lad
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.a.ao(r0, r2)
            if (r0 == 0) goto L51
            goto Lad
        L51:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r0 = ", found: "
            java.lang.String r10 = defpackage.mn.f(r2, r3, r10, r0)
            r9.<init>(r10)
            throw r9
        L5f:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L61
        L61:
            r10 = move-exception
            defpackage.ske.ay(r0, r9)
            throw r10
        L66:
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.cog.p(r1, r2)
            dcp r2 = r5.b     // Catch: java.lang.Throwable -> L94
            kbz r3 = r2.g(r1)     // Catch: java.lang.Throwable -> L94
            boolean r4 = r3.a     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L7e
            r2.f()     // Catch: java.lang.Throwable -> L94
            r5.a(r1)     // Catch: java.lang.Throwable -> L94
            ufg r0 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L94
            goto L99
        L7e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r3.b     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L94
            r4.append(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L94
            throw r2     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            java.lang.Object r0 = defpackage.rnt.aM(r0)
        L99:
            boolean r2 = defpackage.uex.b(r0)
            if (r2 == 0) goto La7
            r2 = r0
            ufg r2 = (defpackage.ufg) r2
            java.lang.String r2 = "END TRANSACTION"
            defpackage.cog.p(r1, r2)
        La7:
            java.lang.Throwable r0 = defpackage.uex.a(r0)
            if (r0 != 0) goto Lcf
        Lad:
            dcp r0 = r5.b
            r0.c(r1)
            java.util.List r0 = r5.c
            java.util.Iterator r0 = r0.iterator()
        Lb8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r0.next()
            cpo r2 = (defpackage.cpo) r2
            dfa r3 = r1.a
            r2.k(r3)
            goto Lb8
        Lca:
            dbw r9 = r9.a
            r9.d = r10
            return
        Lcf:
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            defpackage.cog.p(r1, r9)
            throw r0
        Ld5:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r10 = move-exception
            defpackage.ske.ay(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcl.c(dfa):void");
    }

    @Override // defpackage.dfb
    public final void d(dfa dfaVar, int i, int i2) {
        ddo ddoVar = new ddo(dfaVar);
        dbw dbwVar = this.a;
        dbx dbxVar = dbwVar.a;
        List listB = cgh.B(dbxVar.o, i, i2);
        if (listB == null) {
            if (cgh.y(dbxVar, i, i2)) {
                throw new IllegalStateException(a.bD(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."));
            }
            dcp dcpVar = dbwVar.b;
            dcpVar.b(ddoVar);
            for (cpo cpoVar : dbwVar.c) {
            }
            dcpVar.a(ddoVar);
            return;
        }
        dcp dcpVar2 = dbwVar.b;
        dcpVar2.d(ddoVar);
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            ((ddx) it.next()).b(ddoVar);
        }
        kbz kbzVarG = dcpVar2.g(ddoVar);
        if (!kbzVarG.a) {
            throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(kbzVarG.b)));
        }
        dcpVar2.f();
        dbwVar.a(ddoVar);
    }

    @Override // defpackage.dfb
    public final void a(dfa dfaVar) throws Exception {
        ddo ddoVar = new ddo(dfaVar);
        ddw ddwVarA = ddoVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (ddwVarA.j()) {
                if (ddwVarA.b(0) == 0) {
                    z = true;
                }
            }
            dbw dbwVar = this.a;
            ske.ay(ddwVarA, null);
            dcp dcpVar = dbwVar.b;
            dcpVar.a(ddoVar);
            if (!z) {
                kbz kbzVarG = dcpVar.g(ddoVar);
                if (!kbzVarG.a) {
                    throw new IllegalStateException(LmJPKwPBa.NHSdTREdnv.concat(String.valueOf(kbzVarG.b)));
                }
            }
            dbwVar.a(ddoVar);
            dcpVar.e();
            for (cpo cpoVar : dbwVar.c) {
            }
        } finally {
        }
    }
}
