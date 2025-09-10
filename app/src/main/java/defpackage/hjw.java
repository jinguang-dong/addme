package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjw implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public hjw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hjv a() {
        return new hjv(new kjc(2), (Executor) this.a.a(), (hbj) this.b.a(), ((pba) this.c).a());
    }
}
