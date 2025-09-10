package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmr implements tzt {
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
    private final tzx n;
    private final /* synthetic */ int o;

    public gmr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, int i) {
        this.o = i;
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
        this.n = tzxVar14;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.o;
        if (i == 0) {
            ocq ocqVar = (ocq) this.a.a();
            krj krjVar = (krj) this.b.a();
            hbj hbjVar = (hbj) this.c.a();
            gav gavVar = (gav) this.d.a();
            tzx tzxVar = this.f;
            return new gmq(ocqVar, krjVar, hbjVar, gavVar, ((ims) this.e).b(), (owf) tzxVar.a(), (owf) this.g.a(), (owf) this.h.a(), (ScheduledExecutorService) this.i.a(), (owq) this.j.a(), (SharedPreferences) this.k.a(), ((hoa) this.l).b(), (owq) this.m.a(), (ggx) this.n.a());
        }
        if (i == 1) {
            tzx tzxVar2 = this.g;
            Resources resourcesB = ((hoa) this.j).b();
            naw nawVar = (naw) tzxVar2.a();
            tzx tzxVar3 = this.m;
            gtm gtmVarA = ((gjx) this.f).a();
            krj krjVar2 = (krj) tzxVar3.a();
            gbg gbgVar = (gbg) this.e.a();
            mhq mhqVar = (mhq) this.k.a();
            tzx tzxVar4 = this.c;
            tzx tzxVar5 = this.a;
            return new gds(resourcesB, nawVar, gtmVarA, krjVar2, gbgVar, mhqVar, ((mib) this.n).b(), ((mib) this.b).b(), ((mia) tzxVar5).b(), (out) tzxVar4.a(), (luj) this.h.a(), (luj) this.l.a(), (hbj) this.i.a(), (pnq) this.d.a());
        }
        rwc rwcVar = (rwc) this.d.a();
        rwc rwcVar2 = (rwc) this.i.a();
        Optional optional = (Optional) this.n.a();
        tzx tzxVar6 = this.f;
        Optional optionalEmpty = Optional.empty();
        Optional optional2 = (Optional) tzxVar6.a();
        tzx tzxVar7 = this.k;
        tzx tzxVar8 = this.b;
        tzx tzxVar9 = this.j;
        kgw kgwVarA = ((kiu) this.m).a();
        hxv hxvVarA = ((hxw) tzxVar9).a();
        tzj tzjVarB = tzs.b(tzxVar8);
        Executor executor = (Executor) this.e.a();
        hbj hbjVar2 = (hbj) this.c.a();
        pbn pbnVar = (pbn) this.a.a();
        tzx tzxVar10 = this.h;
        kqp kqpVarA = ((kqr) this.g).a();
        return new ids(rwcVar, rwcVar2, optional, optionalEmpty, optional2, kgwVarA, hxvVarA, tzjVarB, executor, hbjVar2, pbnVar, kqpVarA);
    }

    public gmr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, int i, byte[] bArr) {
        this.o = i;
        this.j = tzxVar;
        this.g = tzxVar2;
        this.f = tzxVar3;
        this.m = tzxVar4;
        this.e = tzxVar5;
        this.k = tzxVar6;
        this.n = tzxVar7;
        this.b = tzxVar8;
        this.a = tzxVar9;
        this.c = tzxVar10;
        this.h = tzxVar11;
        this.l = tzxVar12;
        this.i = tzxVar13;
        this.d = tzxVar14;
    }

    public gmr(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, int i, char[] cArr) {
        this.o = i;
        this.d = tzxVar;
        this.i = tzxVar2;
        this.n = tzxVar3;
        this.f = tzxVar4;
        this.m = tzxVar5;
        this.j = tzxVar6;
        this.b = tzxVar7;
        this.k = tzxVar8;
        this.e = tzxVar9;
        this.c = tzxVar10;
        this.a = tzxVar11;
        this.g = tzxVar12;
        this.h = tzxVar13;
        this.l = tzxVar14;
    }
}
