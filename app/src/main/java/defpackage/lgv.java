package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgv implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public lgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.f != 0 ? b() : b();
    }

    public final syu b() {
        if (this.f != 0) {
            rwr rwrVar = (rwr) this.b.a();
            lgk lgkVarA = ((lfo) this.c).a();
            rwc rwcVarB = ((ixr) this.d).b();
            Executor executor = (Executor) this.e.a();
            gzi gziVar = hak.a;
            return qpt.bV(lgkVarA, rwcVarB, rnt.U(((hbj) rwrVar.b).f(hak.ag)), false, executor);
        }
        rwr rwrVar2 = (rwr) this.b.a();
        lgk lgkVarA2 = ((lfo) this.c).a();
        rwc rwcVarB2 = ((ixr) this.d).b();
        Executor executor2 = (Executor) this.e.a();
        gzi gziVar2 = hak.a;
        return qpt.bV(lgkVarA2, rwcVarB2, rnt.U(((hbj) rwrVar2.b).f(hak.ah)), true, executor2);
    }
}
