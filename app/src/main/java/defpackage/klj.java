package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klj implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public klj(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kli a() {
        return new kli(((tzz) this.a).a(), (szh) this.b.a(), (Executor) this.c.a(), (pbn) this.d.a());
    }
}
