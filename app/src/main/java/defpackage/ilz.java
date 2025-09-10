package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilz implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public ilz(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final iix a() {
        Context contextB = ((imm) this.a).b();
        mfs mfsVar = (mfs) this.b.a();
        ocq ocqVar = (ocq) this.c.a();
        return new iix(contextB, mfsVar, ocqVar.ag(mfsVar), (Set) this.d.a());
    }
}
