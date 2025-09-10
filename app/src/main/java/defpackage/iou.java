package defpackage;

import android.os.SystemClock;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iou {
    public final List a;
    public nkw b;
    public sqg c;
    public int d;
    public boolean e;
    public int f;
    private final nkw g;
    private final iqh h;
    private final muj i;
    private final pka j;
    private final paq k;
    private final boolean l;
    private final iqm m;
    private iot n;
    private long o;
    private final mdy p;

    public iou(gnt gntVar, owf owfVar, ndj ndjVar, mdy mdyVar, nkw nkwVar, iqh iqhVar, int i, sqg sqgVar, boolean z, iqm iqmVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.h = iqhVar;
        this.i = (muj) owfVar.dL();
        this.j = gntVar.a();
        this.p = mdyVar;
        this.g = nkwVar;
        this.o = SystemClock.uptimeMillis();
        this.b = nkwVar;
        this.f = i;
        this.c = sqgVar;
        ios iosVar = new ios();
        iosVar.e(this.b);
        iosVar.f(this.f);
        iosVar.b(this.c);
        iosVar.c(0);
        iosVar.d(0L);
        iot iotVarA = iosVar.a();
        this.n = iotVarA;
        arrayList.add(iotVarA);
        this.k = ndjVar.e(new ior(this));
        this.l = z;
        this.m = iqmVar;
    }

    private final void c(long j, int i) {
        List list;
        iot iotVar = this.n;
        long j2 = iotVar.d + j;
        int i2 = iotVar.c + i;
        ios iosVar = new ios(iotVar);
        iosVar.d(j2);
        iosVar.c(i2);
        this.n = iosVar.a();
        int i3 = 0;
        while (true) {
            list = this.a;
            if (i3 >= list.size()) {
                i3 = -1;
                break;
            }
            iot iotVar2 = (iot) list.get(i3);
            if (this.n.a.equals(iotVar2.a)) {
                iot iotVar3 = this.n;
                int i4 = iotVar3.e;
                int i5 = iotVar2.e;
                if (i4 == 0) {
                    throw null;
                }
                if (i4 == i5 && iotVar3.b.equals(iotVar2.b)) {
                    break;
                }
            }
            i3++;
        }
        if (i3 != -1) {
            list.remove(i3);
            list.add(this.n);
        }
    }

    public final void a(int i) {
        int i2;
        if (this.e) {
            return;
        }
        c(SystemClock.uptimeMillis() - this.o, this.d);
        tpc tpcVarM = sqi.a.m();
        int iOrdinal = this.h.ordinal();
        int i3 = 3;
        if (iOrdinal == 0) {
            i2 = 1;
        } else if (iOrdinal == 1) {
            i2 = 2;
        } else if (iOrdinal == 2) {
            i2 = 3;
        } else {
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
            i2 = 4;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sqi sqiVar = (sqi) tphVar;
        sqiVar.c = i2 - 1;
        sqiVar.b |= 1;
        nkw nkwVar = this.g;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ssc sscVar = nkwVar.v;
        tph tphVar2 = tpcVarM.b;
        sqi sqiVar2 = (sqi) tphVar2;
        sqiVar2.d = sscVar.T;
        sqiVar2.b |= 2;
        int iBp = qpt.bp(this.i.b);
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sqi sqiVar3 = (sqi) tpcVarM.b;
        sqiVar3.e = iBp - 1;
        sqiVar3.b |= 4;
        boolean zEquals = this.j.equals(pka.FRONT);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqi sqiVar4 = (sqi) tpcVarM.b;
        sqiVar4.b |= 8;
        sqiVar4.f = zEquals;
        List<iot> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (iot iotVar : list) {
            tpc tpcVarM2 = sqh.a.m();
            ssc sscVar2 = iotVar.a.v;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            sqh sqhVar = (sqh) tphVar3;
            sqhVar.c = sscVar2.T;
            sqhVar.b |= 1;
            int i4 = iotVar.e;
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            tph tphVar4 = tpcVarM2.b;
            sqh sqhVar2 = (sqh) tphVar4;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            sqhVar2.d = i5;
            sqhVar2.b |= 2;
            sqg sqgVar = iotVar.b;
            if (!tphVar4.C()) {
                tpcVarM2.o();
            }
            tph tphVar5 = tpcVarM2.b;
            sqh sqhVar3 = (sqh) tphVar5;
            sqhVar3.e = sqgVar.e;
            sqhVar3.b |= 4;
            int i6 = iotVar.c;
            if (!tphVar5.C()) {
                tpcVarM2.o();
            }
            tph tphVar6 = tpcVarM2.b;
            sqh sqhVar4 = (sqh) tphVar6;
            sqhVar4.b |= 8;
            sqhVar4.f = i6;
            long j = iotVar.d;
            if (!tphVar6.C()) {
                tpcVarM2.o();
            }
            sqh sqhVar5 = (sqh) tpcVarM2.b;
            sqhVar5.b |= 16;
            sqhVar5.g = j;
            arrayList.add((sqh) tpcVarM2.l());
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqi sqiVar5 = (sqi) tpcVarM.b;
        tpw tpwVar = sqiVar5.h;
        if (!tpwVar.c()) {
            sqiVar5.h = tph.v(tpwVar);
        }
        tnq.e(arrayList, sqiVar5.h);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar7 = tpcVarM.b;
        sqi sqiVar6 = (sqi) tphVar7;
        sqiVar6.g = i - 1;
        sqiVar6.b |= 16;
        boolean z = this.l;
        if (!tphVar7.C()) {
            tpcVarM.o();
        }
        sqi sqiVar7 = (sqi) tpcVarM.b;
        sqiVar7.b |= 32;
        sqiVar7.i = z;
        int iOrdinal2 = this.m.ordinal();
        if (iOrdinal2 == 0) {
            i3 = 1;
        } else if (iOrdinal2 == 1) {
            i3 = 2;
        } else if (iOrdinal2 != 2) {
            if (iOrdinal2 == 3) {
                i3 = 4;
            } else {
                if (iOrdinal2 != 4) {
                    throw new RuntimeException(null, null);
                }
                i3 = 5;
            }
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqi sqiVar8 = (sqi) tpcVarM.b;
        sqiVar8.j = i3 - 1;
        sqiVar8.b |= 64;
        sqi sqiVar9 = (sqi) tpcVarM.l();
        mdy mdyVar = this.p;
        tpc tpcVarM3 = sod.a.m();
        soc socVar = soc.aE;
        if (!tpcVarM3.b.C()) {
            tpcVarM3.o();
        }
        tph tphVar8 = tpcVarM3.b;
        sod sodVar = (sod) tphVar8;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar8.C()) {
            tpcVarM3.o();
        }
        sod sodVar2 = (sod) tpcVarM3.b;
        sqiVar9.getClass();
        sodVar2.aF = sqiVar9;
        sodVar2.e |= 2;
        mdyVar.I(tpcVarM3);
        this.e = true;
        list.clear();
        this.k.close();
        this.o = SystemClock.uptimeMillis();
        this.d = 0;
    }

    public final void b(final nkw nkwVar, final int i, final sqg sqgVar) {
        Optional optionalEmpty;
        c(SystemClock.uptimeMillis() - this.o, this.d);
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                optionalEmpty = Optional.empty();
                break;
            }
            iot iotVar = (iot) it.next();
            if (iotVar.a.equals(nkwVar)) {
                int i2 = iotVar.e;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == i && iotVar.b.equals(sqgVar)) {
                    optionalEmpty = Optional.of(iotVar);
                    break;
                }
            }
        }
        this.n = (iot) optionalEmpty.orElseGet(new Supplier() { // from class: ioq
            @Override // java.util.function.Supplier
            public final Object get() {
                ios iosVar = new ios();
                iosVar.e(nkwVar);
                iosVar.f(i);
                iosVar.b(sqgVar);
                iosVar.d(0L);
                iosVar.c(0);
                iot iotVarA = iosVar.a();
                this.a.a.add(iotVarA);
                return iotVarA;
            }
        });
        this.o = SystemClock.uptimeMillis();
        this.d = 0;
    }
}
