package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbw {
    public final dbx a;
    public final dcp b;
    public final List c;
    public dfa d;
    public final ddp e;

    public dbw() {
        throw null;
    }

    private final void d() {
        dfe dfeVarB = b();
        if (dfeVarB != null) {
            boolean z = this.a.n == 3;
            dfn dfnVar = (dfn) dfeVarB;
            if (dfnVar.f.b()) {
                dfnVar.a().setWriteAheadLoggingEnabled(z);
            }
            dfnVar.g = z;
        }
    }

    public final void a(ddo ddoVar) {
        cog.p(ddoVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cog.p(ddoVar, cpo.j(this.b.b));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [dfe, java.lang.Object] */
    public final dfe b() {
        ddp ddpVar = this.e;
        if (true != (ddpVar instanceof ddp)) {
            ddpVar = null;
        }
        if (ddpVar != null) {
            return ddpVar.a.a;
        }
        return null;
    }

    public final void c() {
        this.e.close();
    }

    public dbw(dbx dbxVar, dcp dcpVar) {
        this.a = dbxVar;
        this.b = dcpVar;
        this.c = dbxVar.d;
        this.e = new ddp(new cxb(dbxVar.c.a(cog.o(dbxVar.a, dbxVar.b, new dcl(this, dcpVar.a), false, false)), (byte[]) null));
        d();
    }

    public dbw(dbx dbxVar, uiq uiqVar) {
        this.a = dbxVar;
        this.b = new dck();
        this.c = dbxVar.d;
        this.e = new ddp(new cxb(uiqVar.a(new dbx(dbxVar.a, dbxVar.b, dbxVar.c, dbxVar.o, ske.bK(dbxVar.d, new dcm(new asj(this, 12))), dbxVar.e, dbxVar.n, dbxVar.f, dbxVar.g, dbxVar.h, dbxVar.i, dbxVar.j, dbxVar.k, dbxVar.l)), (byte[]) null));
        d();
    }
}
