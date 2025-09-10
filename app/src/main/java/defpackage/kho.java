package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kho implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public kho(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final syu a() {
        return !((hbj) this.a.a()).p(hae.w) ? ske.M(rvk.a) : ((jid) this.b.a()).f().c((ScheduledExecutorService) this.c.a());
    }
}
