package defpackage;

import j$.time.Clock;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public heq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hep a() {
        syx syxVarC = hee.c();
        ExecutorService executorServiceB = hee.b();
        Clock clockD = hee.d();
        ((hef) this.a).b().booleanValue();
        return new hep(syxVarC, executorServiceB, clockD, ((pba) this.b).a(), this.c);
    }
}
