package defpackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmh {
    public final Object a;
    public final int b;
    public int c;
    public final Object d;
    public final Map e;

    public pmh(nkw nkwVar, int i) {
        this.e = new HashMap();
        this.d = new HashMap();
        this.a = nkwVar;
        this.b = i;
    }

    public static final void a() {
        rnt.B(true, "Size was < 0.");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    public final srb b() {
        tpc tpcVarM = srb.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        Object obj = this.a;
        tph tphVar = tpcVarM.b;
        srb srbVar = (srb) tphVar;
        srbVar.b |= 1;
        srbVar.c = ((nkw) obj).u;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        int i = this.b;
        tph tphVar2 = tpcVarM.b;
        srb srbVar2 = (srb) tphVar2;
        srbVar2.d = i - 1;
        srbVar2.b |= 2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        srb srbVar3 = (srb) tphVar3;
        srbVar3.e = 1;
        srbVar3.b |= 4;
        int i2 = this.c;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        srb srbVar4 = (srb) tphVar4;
        srbVar4.b |= 8;
        srbVar4.f = i2;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        srb srbVar5 = (srb) tpcVarM.b;
        srbVar5.b |= 16;
        srbVar5.i = 2;
        Map map = this.e;
        for (Integer num : map.keySet()) {
            int iIntValue = num.intValue();
            hdl hdlVar = (hdl) map.get(num);
            tpc tpcVarM2 = sqz.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar5 = tpcVarM2.b;
            sqz sqzVar = (sqz) tphVar5;
            sqzVar.b |= 1;
            sqzVar.c = iIntValue;
            int i3 = hdlVar.a;
            if (!tphVar5.C()) {
                tpcVarM2.o();
            }
            tph tphVar6 = tpcVarM2.b;
            sqz sqzVar2 = (sqz) tphVar6;
            sqzVar2.b |= 2;
            sqzVar2.d = i3;
            int i4 = hdlVar.b;
            if (!tphVar6.C()) {
                tpcVarM2.o();
            }
            tph tphVar7 = tpcVarM2.b;
            sqz sqzVar3 = (sqz) tphVar7;
            sqzVar3.b |= 4;
            sqzVar3.e = i4;
            int i5 = hdlVar.c;
            if (!tphVar7.C()) {
                tpcVarM2.o();
            }
            tph tphVar8 = tpcVarM2.b;
            sqz sqzVar4 = (sqz) tphVar8;
            sqzVar4.b |= 8;
            sqzVar4.f = i5;
            int i6 = hdlVar.d;
            if (!tphVar8.C()) {
                tpcVarM2.o();
            }
            sqz sqzVar5 = (sqz) tpcVarM2.b;
            sqzVar5.b |= 16;
            sqzVar5.g = i6;
            sqz sqzVar6 = (sqz) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srb srbVar6 = (srb) tpcVarM.b;
            sqzVar6.getClass();
            tpw tpwVar = srbVar6.g;
            if (!tpwVar.c()) {
                srbVar6.g = tph.v(tpwVar);
            }
            srbVar6.g.add(sqzVar6);
        }
        ?? r11 = this.d;
        for (Integer num2 : r11.keySet()) {
            int iIntValue2 = num2.intValue();
            tpc tpcVarM3 = sra.a.m();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            sra sraVar = (sra) tpcVarM3.b;
            sraVar.b |= 1;
            sraVar.c = iIntValue2;
            int iIntValue3 = ((Integer) r11.get(num2)).intValue();
            if (!tpcVarM3.b.C()) {
                tpcVarM3.o();
            }
            sra sraVar2 = (sra) tpcVarM3.b;
            sraVar2.b |= 2;
            sraVar2.d = iIntValue3;
            sra sraVar3 = (sra) tpcVarM3.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srb srbVar7 = (srb) tpcVarM.b;
            sraVar3.getClass();
            tpw tpwVar2 = srbVar7.h;
            if (!tpwVar2.c()) {
                srbVar7.h = tph.v(tpwVar2);
            }
            srbVar7.h.add(sraVar3);
        }
        return (srb) tpcVarM.l();
    }

    public final void c() {
        this.c++;
    }

    public pmh(int i) {
        rnt.B(true, "maxSize must be > 0.");
        this.b = i;
        this.a = new Object();
        this.d = new LinkedList();
        this.e = new HashMap();
    }
}
