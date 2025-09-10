package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjr implements tzt {
    private final tzx a;
    private final tzx b;

    public kjr(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kjq a() {
        return new kjq((Executor) this.a.a(), (hbj) this.b.a());
    }
}
