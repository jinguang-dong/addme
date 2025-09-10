package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itf implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public itf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hbp a() {
        return new hbp((iso) this.a.a(), (jid) this.b.a(), (Executor) this.c.a());
    }
}
