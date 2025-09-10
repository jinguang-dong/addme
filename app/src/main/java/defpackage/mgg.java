package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgg implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public mgg(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mgh a() {
        Context contextB = ((imm) this.a).b();
        luj lujVar = (luj) this.b.a();
        lqc lqcVar = (lqc) this.c.a();
        return new mgh(contextB, lujVar, rwc.j(lqcVar), ((ixw) this.d).a());
    }
}
