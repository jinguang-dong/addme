package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrv implements tzt {
    private final tzx a;

    public jrv(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ejt a() {
        return new ejt((Executor) this.a.a());
    }
}
