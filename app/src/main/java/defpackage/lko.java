package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lko implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final /* synthetic */ int i;

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i) {
        this.i = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.i;
        if (i == 0) {
            return new lkn((leq) this.a.a(), (owq) this.b.a(), (owf) this.c.a(), (out) this.d.a(), (owq) this.e.a(), (owf) this.f.a(), (mdy) this.g.a(), (mwq) this.h.a());
        }
        if (i == 1) {
            pjo pjoVar = (pjo) this.h.a();
            owq owqVar = (owq) this.g.a();
            owf owfVar = (owf) this.f.a();
            owq owqVar2 = (owq) this.d.a();
            return new frf(new ied(owqVar, (sbv) this.c.a(), pjoVar, (our) this.e.a(), owfVar, owqVar2, (nms) this.b.a(), (out) this.a.a(), 2), "arkzr", 0);
        }
        if (i == 2) {
            tzx tzxVar = this.d;
            fdq fdqVarA = ((ixw) this.f).a();
            owf owfVar2 = (owf) tzxVar.a();
            luj lujVar = (luj) this.c.a();
            tzx tzxVar2 = this.e;
            tzx tzxVar3 = this.a;
            tzx tzxVar4 = this.g;
            return new lqq(this.h, this.b, tzxVar4, tzxVar3, tzxVar2, fdqVarA, owfVar2, lujVar);
        }
        if (i == 3) {
            tzx tzxVar5 = this.e;
            Object objA = this.c.a();
            out outVar = (out) tzxVar5.a();
            Handler handler = (Handler) this.d.a();
            tzx tzxVar6 = this.b;
            tzx tzxVar7 = this.a;
            Activity activityA = ((imn) this.f).a();
            Resources resourcesB = ((hoa) tzxVar7).b();
            hyh hyhVar = (hyh) tzxVar6.a();
            tzx tzxVar8 = this.h;
            return new lzt(this.g, tzxVar8, (mah) objA, outVar, handler, activityA, resourcesB, hyhVar);
        }
        if (i == 4) {
            return new mbj((mbq) this.d.a(), (mbq) this.b.a(), (mbq) this.f.a(), (mbq) this.a.a(), (pbn) this.g.a(), (out) this.e.a(), ((ixv) this.h).a(), (luj) this.c.a());
        }
        mni mniVar = (mni) this.f.a();
        tzx tzxVar9 = this.b;
        Context contextB = ((imm) this.h).b();
        mwq mwqVar = (mwq) tzxVar9.a();
        tzx tzxVar10 = this.c;
        Executor executorB = ((fry) this.a).b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) tzxVar10.a();
        luj lujVar2 = (luj) this.g.a();
        hbj hbjVar = (hbj) this.e.a();
        return new mck(mniVar, contextB, mwqVar, executorB, scheduledExecutorService, lujVar2, hbjVar);
    }

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, byte[] bArr) {
        this.i = i;
        this.h = tzxVar;
        this.g = tzxVar2;
        this.f = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
        this.b = tzxVar6;
        this.e = tzxVar7;
        this.a = tzxVar8;
    }

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, char[] cArr) {
        this.i = i;
        this.h = tzxVar;
        this.b = tzxVar2;
        this.g = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.d = tzxVar7;
        this.c = tzxVar8;
    }

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, int[] iArr) {
        this.i = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.f = tzxVar3;
        this.a = tzxVar4;
        this.g = tzxVar5;
        this.e = tzxVar6;
        this.h = tzxVar7;
        this.c = tzxVar8;
    }

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, short[] sArr) {
        this.i = i;
        this.g = tzxVar;
        this.h = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
        this.f = tzxVar6;
        this.a = tzxVar7;
        this.b = tzxVar8;
    }

    public lko(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, int i, boolean[] zArr) {
        this.i = i;
        this.f = tzxVar;
        this.h = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.c = tzxVar5;
        this.g = tzxVar6;
        this.e = tzxVar7;
        this.d = tzxVar8;
    }
}
