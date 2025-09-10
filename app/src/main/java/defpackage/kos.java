package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kos implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final tzx m;

    public kos(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
        this.m = tzxVar13;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* bridge */ /* synthetic */ Object a() {
        pfu pfuVar = (pfu) this.a.a();
        long jLongValue = ((ihq) this.d).a().longValue();
        rwc rwcVar = (rwc) this.e.a();
        tzj tzjVarB = tzs.b(this.f);
        tzj tzjVarB2 = tzs.b(this.g);
        tzj tzjVarB3 = tzs.b(this.h);
        hyd hydVar = (hyd) this.i.a();
        ihr ihrVar = (ihr) this.j.a();
        boolean zBooleanValue = ((Boolean) this.k.a()).booleanValue();
        owf owfVar = (owf) this.m.a();
        boolean zH = rwcVar.h();
        tzx tzxVar = this.b;
        if (zH) {
            return ((kxh) tzxVar).a().m(jLongValue, pfuVar.c((pdv) rwcVar.c(), hydVar.a), ihrVar, 2);
        }
        if (zBooleanValue) {
            return new kws((lcu) this.l.a());
        }
        tzx tzxVar2 = this.c;
        if (!((Map) tzjVarB3.a()).isEmpty()) {
            return ((kxc) tzxVar2).a().f(owfVar, (Map) tzjVarB3.a(), jLongValue, hydVar.a, ihrVar);
        }
        if (((Map) tzjVarB.a()).size() == 1) {
            return ((kxh) tzxVar).a().m(jLongValue, pfuVar.c((pdv) ((Map) tzjVarB.a()).values().iterator().next(), hydVar.a), ihrVar, 2);
        }
        a.I(((Map) tzjVarB.a()).size() > 1);
        return ((kxc) tzxVar2).a().f(owfVar, (Map) tzjVarB2.a(), jLongValue, hydVar.a, ihrVar);
    }
}
