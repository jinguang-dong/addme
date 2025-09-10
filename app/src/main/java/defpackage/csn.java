package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class csn extends uht implements uiv {
    int a;
    private /* synthetic */ Object b;

    public csn(uhb uhbVar) {
        super(3, uhbVar);
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        csn csnVar = new csn((uhb) obj3);
        csnVar.b = (crx) obj;
        return csnVar.b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) throws IOException {
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        this.a = 1;
        crx crxVar = (crx) obj2;
        crxVar.b();
        Object objR = coi.r(crxVar.a, new crw(crxVar, (uhb) null, 0), this);
        return objR == uhiVar ? uhiVar : objR;
    }
}
