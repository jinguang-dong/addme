package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mib implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public mib(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final mhr b() {
        if (this.b != 0) {
            sdy sdyVar = new sdy(null);
            sdyVar.h(mhp.HEAT_SEVERE);
            sdyVar.i(mhp.HEAT_CRITICAL);
            mhr mhrVarG = sdyVar.g();
            hbj hbjVar = (hbj) this.a.a();
            sdy sdyVar2 = new sdy(null);
            Map map = mhq.b;
            sdyVar2.h((mhp) Map.EL.getOrDefault(map, hbjVar.a(hav.o).get(), mhrVarG.a));
            sdyVar2.i((mhp) Map.EL.getOrDefault(map, hbjVar.a(hav.p).get(), mhrVarG.b));
            return sdyVar2.g();
        }
        sdy sdyVar3 = new sdy(null);
        sdyVar3.h(mhp.HEAT_CRITICAL);
        sdyVar3.i(mhp.HEAT_EMERGENCY);
        mhr mhrVarG2 = sdyVar3.g();
        hbj hbjVar2 = (hbj) this.a.a();
        sdy sdyVar4 = new sdy(null);
        java.util.Map map2 = mhq.b;
        sdyVar4.h((mhp) Map.EL.getOrDefault(map2, hbjVar2.a(hav.q).get(), mhrVarG2.a));
        sdyVar4.i((mhp) Map.EL.getOrDefault(map2, hbjVar2.a(hav.r).get(), mhrVarG2.b));
        return sdyVar4.g();
    }
}
