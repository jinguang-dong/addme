package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcf implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public jcf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jcc a() {
        iyu iyuVar = (iyu) this.a.a();
        msh mshVar = (msh) this.b.a();
        Executor executor = (Executor) this.c.a();
        mwq mwqVar = (mwq) this.d.a();
        fqy fqyVar = iyuVar.K;
        return new jcc(fqyVar, fqyVar.e, executor, mshVar, mwqVar);
    }
}
