package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebe implements ebc {
    private final dco a;
    private final dcc b;

    public ebe(dco dcoVar) {
        this.a = dcoVar;
        this.b = new ebd(dcoVar);
    }

    @Override // defpackage.ebc
    public final Long a(String str) {
        dcu dcuVarA = dcu.a("SELECT long_value FROM Preference where `key`=?", 1);
        dcuVarA.g(1, str);
        dco dcoVar = this.a;
        dcoVar.k();
        Cursor cursorF = cwy.f(dcoVar, dcuVarA);
        try {
            Long lValueOf = null;
            if (cursorF.moveToFirst() && !cursorF.isNull(0)) {
                lValueOf = Long.valueOf(cursorF.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorF.close();
            dcuVarA.j();
        }
    }

    @Override // defpackage.ebc
    public final void b(ebb ebbVar) {
        dco dcoVar = this.a;
        dcoVar.k();
        dcoVar.l();
        try {
            this.b.a(ebbVar);
            dcoVar.p();
        } finally {
            this.a.n();
        }
    }
}
