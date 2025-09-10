package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdf implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;

    public gdf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8) {
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
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gdd a() throws PackageManager.NameNotFoundException {
        ((imm) this.a).b();
        vds vdsVarA = ((gde) this.b).a();
        pqn pqnVarB = pqn.b();
        lta ltaVar = (lta) this.c.a();
        gda gdaVar = (gda) this.d.a();
        ngw ngwVar = (ngw) this.e.a();
        hbj hbjVar = (hbj) this.f.a();
        hbc hbcVarB = hmp.b();
        owf owfVar = (owf) this.g.a();
        fri friVar = new fri();
        return new gdd(vdsVarA, pqnVarB, ltaVar, gdaVar, ngwVar, hbjVar, hbcVarB, owfVar, friVar);
    }
}
