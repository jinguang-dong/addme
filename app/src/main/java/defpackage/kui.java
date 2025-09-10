package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kui implements tzt {
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
    private final /* synthetic */ int l;

    public kui(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i) {
        this.l = i;
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
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        if (this.l != 0) {
            gnt gntVar = (gnt) this.i.a();
            hzs hzsVar = (hzs) this.e.a();
            iso isoVar = (iso) this.j.a();
            owq owqVar = (owq) this.b.a();
            hbj hbjVar = (hbj) this.g.a();
            tzx tzxVar = this.d;
            tzx tzxVar2 = this.k;
            return new kcq(gntVar, hzsVar, isoVar, owqVar, hbjVar, ((lsd) this.a).a(), ((itf) tzxVar2).a(), (mky) tzxVar.a(), ((ggu) this.c).a(), (out) this.f.a(), (pbn) this.h.a());
        }
        pjr pjrVar = (pjr) this.a.a();
        pei peiVar = (pei) this.b.a();
        tzx tzxVar3 = this.e;
        tzx tzxVar4 = this.d;
        Set setA = ((tzz) this.c).a();
        Set setA2 = ((tzz) tzxVar4).a();
        kuj kujVar = (kuj) tzxVar3.a();
        pek pekVar = (pek) this.f.a();
        pek pekVar2 = (pek) this.g.a();
        pek pekVar3 = (pek) this.h.a();
        hfs hfsVar = (hfs) this.i.a();
        scn scnVar = (scn) this.j.a();
        hbj hbjVar2 = (hbj) this.k.a();
        pjrVar.getClass();
        peiVar.getClass();
        setA.getClass();
        setA2.getClass();
        kujVar.getClass();
        pekVar.getClass();
        pekVar2.getClass();
        pekVar3.getClass();
        hfsVar.getClass();
        scnVar.getClass();
        hbjVar2.getClass();
        pds pdsVarA = pdt.a();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            pdsVarA.d((peq) it.next());
        }
        if (!setA2.isEmpty()) {
            pdsVarA.c(setA2);
        }
        pdsVarA.f(pjrVar);
        pdsVarA.h(peiVar);
        pdsVarA.l(kujVar);
        pdsVarA.e(hfsVar);
        pdsVarA.k(pekVar);
        pdsVarA.j(pekVar2);
        pdsVarA.a = pekVar3;
        pdsVarA.i(scnVar);
        return pdsVarA.a();
    }

    public kui(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, int i, byte[] bArr) {
        this.l = i;
        this.i = tzxVar;
        this.e = tzxVar2;
        this.j = tzxVar3;
        this.b = tzxVar4;
        this.g = tzxVar5;
        this.a = tzxVar6;
        this.k = tzxVar7;
        this.d = tzxVar8;
        this.c = tzxVar9;
        this.f = tzxVar10;
        this.h = tzxVar11;
    }
}
