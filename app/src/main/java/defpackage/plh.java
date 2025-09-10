package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class plh implements plb {
    final /* synthetic */ plj a;
    private final String b;
    private final List c = new ArrayList(6000);
    private boolean d = true;

    public plh(plj pljVar, String str) {
        this.a = pljVar;
        this.b = str;
    }

    @Override // defpackage.plb
    public final String a() {
        return this.b;
    }

    @Override // defpackage.plb
    public final synchronized void b(long j, long j2, pla plaVar) {
        List list;
        int i;
        if (!this.d) {
            int i2 = sbp.d;
            plaVar.a(sex.a);
            return;
        }
        plj pljVar = this.a;
        synchronized (pljVar) {
            list = this.c;
            list.clear();
            int i3 = pljVar.b;
            while (true) {
                if (i3 >= 6000) {
                    break;
                }
                pld pldVar = (pld) pljVar.a.get(i3);
                long j3 = pldVar.e;
                if (j3 > j2) {
                    break;
                }
                if (j3 >= j) {
                    pld pldVar2 = (pld) pljVar.c.N();
                    pldVar2.a(pldVar);
                    list.add(pldVar2);
                }
                i3++;
            }
            for (int i4 = 0; i4 < pljVar.b; i4++) {
                pld pldVar3 = (pld) pljVar.a.get(i4);
                long j4 = pldVar3.e;
                if (j4 > j2) {
                    break;
                }
                if (j4 >= j) {
                    pld pldVar4 = (pld) pljVar.c.N();
                    pldVar4.a(pldVar3);
                    list.add(pldVar4);
                }
            }
        }
        plaVar.a(list);
        synchronized (pljVar) {
            for (i = 0; i < list.size(); i++) {
                pljVar.c.O((pld) list.get(i));
            }
            list.clear();
        }
    }

    @Override // defpackage.plb, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = false;
        this.a.c(this);
    }
}
