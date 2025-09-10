package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfy implements tzt {
    private final tzx a;
    private final tzx b;

    public kfy(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ovi a() {
        return new ovi((ScheduledExecutorService) this.a.a(), ((hzb) this.b).b().intValue(), TimeUnit.SECONDS);
    }
}
