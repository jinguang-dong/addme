package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbf implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public hbf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hbe a() {
        return new hbe(((imv) this.a).b(), (ScheduledExecutorService) this.b.a(), (pbn) this.c.a());
    }
}
