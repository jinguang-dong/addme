package defpackage;

import androidx.work.Worker;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsl extends ujq implements uif {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsl(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [bud, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, uif] */
    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        ayn aynVar;
        switch (this.b) {
            case 0:
                bsd bsdVar = (bsd) this.a;
                if (!bsdVar.a() && (aynVar = bsdVar.g) != null) {
                    aynVar.k();
                }
                return ufg.a;
            case 1:
                ((bkb) this.a).o();
                return ufg.a;
            case 2:
                bjq bjqVar = (bjq) this.a;
                bjqVar.a = false;
                HashSet hashSet = new HashSet();
                bdp bdpVar = (bdp) bjqVar.c;
                Object[] objArr = bdpVar.a;
                int i = bdpVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    bvm bvmVar = (bvm) objArr[i2];
                    ocq ocqVar = (ocq) ((bdp) bjqVar.b).a[i2];
                    bij bijVar = bvmVar.s.f;
                    if (bijVar.w) {
                        bjq.c(bijVar, ocqVar, hashSet);
                    }
                }
                bdpVar.g();
                ((bdp) bjqVar.b).g();
                bdp bdpVar2 = (bdp) bjqVar.e;
                Object[] objArr2 = bdpVar2.a;
                int i3 = bdpVar2.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    bui buiVar = (bui) objArr2[i4];
                    ocq ocqVar2 = (ocq) ((bdp) bjqVar.d).a[i4];
                    if (buiVar.w) {
                        bjq.c(buiVar, ocqVar2, hashSet);
                    }
                }
                bdpVar2.g();
                ((bdp) bjqVar.d).g();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((bui) it.next()).t();
                }
                return ufg.a;
            case 3:
                ((bui) this.a).t();
                return ufg.a;
            case 4:
                ((bji) this.a).e();
                return ufg.a;
            case 5:
                ?? r9 = this.a;
                bii biiVar = ((bui) r9).a;
                biiVar.getClass();
                ((ald) biiVar).d(r9);
                return ufg.a;
            case 6:
                return ((Worker) this.a).b();
            case 7:
                this.a.a();
                return ufg.a;
            default:
                return new cpo[((urk[]) this.a).length];
        }
    }
}
