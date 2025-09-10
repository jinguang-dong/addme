package defpackage;

import j$.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpw implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;

    public kpw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rwc a() {
        String str;
        pfu pfuVar = (pfu) this.a.a();
        Map map = (Map) this.b.a();
        Map map2 = (Map) this.c.a();
        owf owfVar = (owf) this.d.a();
        Executor executor = (Executor) this.e.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f.a();
        our ourVar = (our) this.g.a();
        if (map.isEmpty()) {
            return rvk.a;
        }
        if (map.size() > 1) {
            pdv pdvVar = (pdv) map.get(lcz.RAW_WIDE);
            pdvVar.getClass();
            str = ((peo) Collection.EL.stream(pdvVar.d()).findFirst().get()).d().a;
        } else {
            str = ((peo) Collection.EL.stream(((pdv) map.values().iterator().next()).d()).findFirst().get()).d().a;
        }
        kzl kzlVar = new kzl(pfuVar, ourVar, executor, scheduledExecutorService, owfVar, qpt.cd(map, map2), 2, str);
        ourVar.d(kzlVar);
        return rwc.j(kzlVar);
    }
}
