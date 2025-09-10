package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwh implements tzt {
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
    private final tzx o;
    private final /* synthetic */ int p;

    public lwh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, tzx tzxVar15, int i) {
        this.p = i;
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
        this.o = tzxVar15;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        if (this.p != 0) {
            tzx tzxVar = this.i;
            Context contextB = ((imm) this.a).b();
            krz krzVar = (krz) tzxVar.a();
            owq owqVar = (owq) this.g.a();
            tzx tzxVar2 = this.h;
            Executor executorB = ((fry) this.d).b();
            owf owfVar = (owf) tzxVar2.a();
            tzx tzxVar3 = this.e;
            return new krn(contextB, krzVar, owqVar, executorB, owfVar, ((ixw) this.l).a(), ((ims) this.j).b(), (owf) tzxVar3.a(), (hbj) this.c.a(), (owf) this.n.a(), (owf) this.o.a(), (owf) this.m.a(), (owf) this.f.a(), (krj) this.k.a(), (mwq) this.b.a());
        }
        Context contextB2 = ((imm) this.a).b();
        hbc hbcVarB = hmp.b();
        String str = lwj.a;
        String strValueOf = String.valueOf(str);
        String strValueOf2 = String.valueOf(str);
        Executor executor = (Executor) this.b.a();
        Executor executor2 = (Executor) this.c.a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.a();
        out outVar = (out) this.e.a();
        gox goxVar = (gox) this.f.a();
        lwm lwmVar = (lwm) this.g.a();
        hfw hfwVar = (hfw) this.h.a();
        lwl lwlVar = (lwl) this.i.a();
        luj lujVar = (luj) this.j.a();
        luj lujVar2 = (luj) this.k.a();
        tzx tzxVar4 = this.o;
        PackageInfo packageInfoA = ((nmz) this.n).a();
        pbn pbnVar = (pbn) tzxVar4.a();
        tzx tzxVar5 = this.m;
        return new lwf(contextB2, hbcVarB, strValueOf.concat(".br"), strValueOf2.concat(".json"), executor, executor2, scheduledExecutorService, outVar, goxVar, lwmVar, hfwVar, lwlVar, lujVar, lujVar2, this.l, tzxVar5, packageInfoA, pbnVar);
    }

    public lwh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, tzx tzxVar15, int i, byte[] bArr) {
        this.p = i;
        this.a = tzxVar;
        this.i = tzxVar2;
        this.g = tzxVar3;
        this.d = tzxVar4;
        this.h = tzxVar5;
        this.l = tzxVar6;
        this.j = tzxVar7;
        this.e = tzxVar8;
        this.c = tzxVar9;
        this.n = tzxVar10;
        this.o = tzxVar11;
        this.m = tzxVar12;
        this.f = tzxVar13;
        this.k = tzxVar14;
        this.b = tzxVar15;
    }
}
