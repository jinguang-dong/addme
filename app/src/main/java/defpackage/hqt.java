package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqt implements tzt {
    private final tzx a;
    private final tzx b;

    public hqt(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hqs a() {
        return new hqs(((hqv) this.a).a(), (Executor) this.b.a());
    }
}
