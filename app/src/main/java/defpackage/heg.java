package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heg implements tzt {
    private final tzx a;

    public heg(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Duration a() {
        Duration durationOfSeconds = Duration.ofSeconds(((Integer) ((hbj) this.a.a()).a(gzo.p).orElse(30)).intValue());
        durationOfSeconds.getClass();
        return durationOfSeconds;
    }
}
