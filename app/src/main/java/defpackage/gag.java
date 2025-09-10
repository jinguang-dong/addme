package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gag extends oww {
    public gag(gnt gntVar, lup lupVar, lup lupVar2) {
        super(owl.a(lupVar, lupVar2, gntVar.b));
        gzg gzgVar = haq.a;
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        List list = (List) obj;
        ltv ltvVar = (ltv) list.get(0);
        ltv ltvVar2 = (ltv) list.get(1);
        pka pkaVar = (pka) list.get(2);
        return !pka.BACK.equals(pkaVar) ? pka.FRONT.equals(pkaVar) ? ltvVar2 : ltv.OFF : ltvVar;
    }
}
