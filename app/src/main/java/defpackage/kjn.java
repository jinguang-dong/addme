package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjn implements kle {
    public final lss a;
    public final kfl b;
    public pao c;
    public final /* synthetic */ kjo d;
    public final ocq e;
    private final kke f;
    private final List g = new ArrayList();

    public kjn(kjo kjoVar, kke kkeVar, lss lssVar, kfl kflVar, ocq ocqVar) {
        this.d = kjoVar;
        this.f = kkeVar;
        this.a = lssVar;
        this.b = kflVar;
        this.e = ocqVar;
    }

    private final List b(List list) {
        int size = list.size();
        List list2 = this.g;
        a.I(size == list2.size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new kiy(new pkg((poj) list.get(i)), ((kiy) list2.get(i)).k()));
        }
        return arrayList;
    }

    private final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((poj) it.next()).close();
        }
    }

    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
        this.c = pao.b(this.a.e());
        this.g.add(new kiy(pojVar, syuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x015e A[Catch: all -> 0x01fb, TryCatch #4 {all -> 0x01fb, blocks: (B:27:0x011b, B:28:0x011e, B:30:0x0124, B:32:0x0145, B:35:0x0156, B:36:0x015a, B:38:0x015e, B:39:0x0163), top: B:66:0x011b }] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjn.close():void");
    }
}
