package defpackage;

import j$.time.Clock;
import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hec implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;

    public hec(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final heb a() {
        out outVar = (out) this.b.a();
        pbc pbcVarA = ((pba) this.c).a();
        pbn pbnVar = (pbn) this.d.a();
        Clock clockD = hee.d();
        Duration durationA = ((heg) this.e).a();
        ((hef) this.f).b().booleanValue();
        return new heb(outVar, pbcVarA, pbnVar, clockD, durationA, (ScheduledExecutorService) this.g.a(), (mdy) this.h.a(), (hel) this.i.a());
    }
}
