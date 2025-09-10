package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guy {
    private final long b;
    private final long c;
    private final rwc d;
    private final int g;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    public rwc a = rvk.a;

    public guy(int i, long j, long j2, rwc rwcVar) {
        this.g = i;
        this.b = j;
        this.c = j2;
        this.d = rwcVar;
    }

    final synchronized void a(sqn sqnVar) {
        this.f.add(sqnVar);
    }

    final synchronized void b(long j) {
        this.e.add(Long.valueOf(j - this.c));
    }

    final synchronized sqo c(long j) {
        sqo sqoVar;
        tpc tpcVarM = sqo.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        int i = this.g;
        tph tphVar = tpcVarM.b;
        sqo sqoVar2 = (sqo) tphVar;
        sqoVar2.c = i - 1;
        sqoVar2.b |= 1;
        long j2 = this.c;
        long j3 = this.b;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        long j4 = j2 - j3;
        tph tphVar2 = tpcVarM.b;
        sqo sqoVar3 = (sqo) tphVar2;
        sqoVar3.b |= 2;
        sqoVar3.d = j4;
        List list = this.e;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sqo sqoVar4 = (sqo) tpcVarM.b;
        tpq tpqVar = sqoVar4.f;
        if (!tpqVar.c()) {
            sqoVar4.f = tph.u(tpqVar);
        }
        tnq.e(list, sqoVar4.f);
        long j5 = j - j2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sqo sqoVar5 = (sqo) tphVar3;
        sqoVar5.b |= 16;
        sqoVar5.h = j5;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        sqo sqoVar6 = (sqo) tpcVarM.b;
        sqoVar6.i = 2;
        sqoVar6.b |= 32;
        rwc rwcVar = this.d;
        if (rwcVar.h()) {
            tpc tpcVarM2 = soi.a.m();
            float f = ((jra) rwcVar.c()).b;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            soi soiVar = (soi) tpcVarM2.b;
            soiVar.b |= 2;
            soiVar.d = f;
            float f2 = ((jra) rwcVar.c()).c;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            soi soiVar2 = (soi) tpcVarM2.b;
            soiVar2.b |= 1;
            soiVar2.c = f2;
            int i2 = ((jra) rwcVar.c()).a;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            soi soiVar3 = (soi) tpcVarM2.b;
            soiVar3.b |= 4;
            soiVar3.e = i2;
            soi soiVar4 = (soi) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqo sqoVar7 = (sqo) tpcVarM.b;
            soiVar4.getClass();
            sqoVar7.g = soiVar4;
            sqoVar7.b |= 8;
        }
        if (this.a.h()) {
            long jLongValue = ((Long) this.a.c()).longValue() - j2;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqo sqoVar8 = (sqo) tpcVarM.b;
            sqoVar8.b |= 4;
            sqoVar8.e = jLongValue;
        }
        List list2 = this.f;
        if (!list2.isEmpty()) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqo sqoVar9 = (sqo) tpcVarM.b;
            tpn tpnVar = sqoVar9.j;
            if (!tpnVar.c()) {
                sqoVar9.j = tph.t(tpnVar);
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                sqoVar9.j.g(((sqn) it.next()).d);
            }
        }
        sqoVar = (sqo) tpcVarM.l();
        sqoVar.f.size();
        list2.size();
        return sqoVar;
    }
}
