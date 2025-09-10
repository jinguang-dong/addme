package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbr {
    public final bij a;
    public final bvm b;
    public final cbn c;
    public boolean d;
    public final int e;
    private final boolean f;
    private cbr g;

    public cbr(bij bijVar, boolean z, bvm bvmVar, cbn cbnVar) {
        this.a = bijVar;
        this.f = z;
        this.b = bvmVar;
        this.c = cbnVar;
        this.e = bvmVar.c;
    }

    public static /* synthetic */ List m(cbr cbrVar, boolean z, int i) {
        return cbrVar.l((i & 1) != 0 ? !cbrVar.f : false, z & ((i & 2) == 0));
    }

    private final cbr p(cbk cbkVar, uiq uiqVar) {
        int i;
        int i2;
        cbn cbnVar = new cbn();
        cbnVar.a = false;
        cbnVar.b = false;
        uiqVar.a(cbnVar);
        cbq cbqVar = new cbq(uiqVar);
        if (cbkVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        cbr cbrVar = new cbr(cbqVar, false, new bvm(true, i + i2), cbnVar);
        cbrVar.d = true;
        cbrVar.g = this;
        return cbrVar;
    }

    private final void q(List list, cbn cbnVar) {
        if (this.c.b) {
            return;
        }
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            cbr cbrVar = (cbr) list.get(size2);
            if (!cbrVar.r()) {
                cbnVar.d(cbrVar.c);
                cbrVar.q(list, cbnVar);
            }
        }
    }

    private final boolean r() {
        return this.f && this.c.a;
    }

    private final void s(bvm bvmVar, List list) {
        bdp bdpVarH = bvmVar.h();
        Object[] objArr = bdpVarH.a;
        int i = bdpVarH.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar2 = (bvm) objArr[i2];
            if (bvmVar2.ag() && !bvmVar2.w) {
                if (bvmVar2.s.j(8)) {
                    list.add(clc.ac(bvmVar2, this.f));
                } else {
                    s(bvmVar2, list);
                }
            }
        }
    }

    private final void t(List list, List list2) {
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            cbr cbrVar = (cbr) list.get(size2);
            if (cbrVar.r()) {
                list2.add(cbrVar);
            } else if (!cbrVar.c.b) {
                cbrVar.t(list, list2);
            }
        }
    }

    public final long a() {
        bwi bwiVarE = e();
        if (bwiVarE == null) {
            return 0L;
        }
        if (true != bwiVarE.dm()) {
            bwiVarE = null;
        }
        if (bwiVarE != null) {
            return byi.s(bwiVarE);
        }
        return 0L;
    }

    public final long b() {
        bwi bwiVarE = e();
        if (bwiVarE != null) {
            return bwiVarE.c;
        }
        return 0L;
    }

    public final bkg c() {
        bwi bwiVarE = e();
        if (bwiVarE != null) {
            if (true != bwiVarE.dm()) {
                bwiVarE = null;
            }
            if (bwiVarE != null) {
                return byi.v(bwiVarE);
            }
        }
        return bkg.a;
    }

    public final bkg d() {
        bwi bwiVarE = e();
        if (bwiVarE != null) {
            if (true != bwiVarE.dm()) {
                bwiVarE = null;
            }
            if (bwiVarE != null) {
                return byi.w(bwiVarE);
            }
        }
        return bkg.a;
    }

    public final bwi e() {
        if (this.d) {
            cbr cbrVarH = h();
            if (cbrVarH != null) {
                return cbrVarH.e();
            }
            return null;
        }
        buo buoVarAb = clc.ab(this.b);
        if (buoVarAb == null) {
            buoVarAb = this.a;
        }
        return bko.C(buoVarAb, 8);
    }

    public final cbn f() {
        if (!r()) {
            return this.c;
        }
        cbn cbnVarA = this.c.a();
        q(new ArrayList(), cbnVarA);
        return cbnVarA;
    }

    public final cbr g() {
        return new cbr(this.a, true, this.b, this.c);
    }

    public final cbr h() {
        bvm bvmVarJ;
        cbr cbrVar = this.g;
        if (cbrVar != null) {
            return cbrVar;
        }
        boolean z = this.f;
        if (z) {
            bvmVarJ = this.b.j();
            while (bvmVarJ != null) {
                cbn cbnVarP = bvmVarJ.p();
                if (cbnVarP != null && cbnVarP.a) {
                    break;
                }
                bvmVarJ = bvmVarJ.j();
            }
            bvmVarJ = null;
        } else {
            bvmVarJ = null;
        }
        if (bvmVarJ == null) {
            bvmVarJ = this.b.j();
            while (true) {
                if (bvmVarJ == null) {
                    bvmVarJ = null;
                    break;
                }
                if (bvmVarJ.s.j(8)) {
                    break;
                }
                bvmVarJ = bvmVarJ.j();
            }
        }
        if (bvmVarJ == null) {
            return null;
        }
        return clc.ac(bvmVarJ, z);
    }

    public final List i() {
        return m(this, false, 7);
    }

    public final List j() {
        return m(this, true, 4);
    }

    public final boolean k() {
        if (this.d || !j().isEmpty()) {
            return false;
        }
        bvm bvmVarJ = this.b.j();
        while (true) {
            if (bvmVarJ == null) {
                bvmVarJ = null;
                break;
            }
            cbn cbnVarP = bvmVarJ.p();
            if (cbnVarP != null && cbnVarP.a) {
                break;
            }
            bvmVarJ = bvmVarJ.j();
        }
        return bvmVarJ == null;
    }

    public final List l(boolean z, boolean z2) {
        if (!z && this.c.b) {
            return ufw.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!r()) {
            return n(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        t(arrayList, arrayList2);
        return arrayList2;
    }

    public final List n(List list, boolean z) {
        if (this.d) {
            return ufw.a;
        }
        s(this.b, list);
        if (z) {
            cbn cbnVar = this.c;
            cbk cbkVar = (cbk) clc.ad(cbnVar, cbu.v);
            if (cbkVar != null && cbnVar.a && !list.isEmpty()) {
                list.add(p(cbkVar, new aaw(cbkVar, 18)));
            }
            cbz cbzVar = cbu.a;
            if (cbnVar.f(cbzVar) && !list.isEmpty() && cbnVar.a) {
                List list2 = (List) clc.ad(cbnVar, cbzVar);
                String str = list2 != null ? (String) ske.bD(list2) : null;
                if (str != null) {
                    list.add(0, p(null, new aaw(str, 19)));
                }
            }
        }
        return list;
    }
}
