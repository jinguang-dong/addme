package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nst implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public nst(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nss a() {
        ((imm) this.a).b();
        Executor executor = (Executor) this.b.a();
        oet oetVarA = ((nsw) this.c).a();
        opu opuVarA = ((nsv) this.d).a();
        ((nsx) this.e).a();
        return new nss(executor, oetVarA, opuVarA);
    }
}
