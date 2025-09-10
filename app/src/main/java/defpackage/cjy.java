package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjy {
    public final cjo a;
    public final cjo d;
    final ArrayList f;
    public ckm g;
    private final cjv h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public cjy(cjo cjoVar) {
        new ArrayList();
        this.g = null;
        this.h = new cjv();
        this.f = new ArrayList();
        this.a = cjoVar;
        this.d = cjoVar;
    }

    private final void e(ckh ckhVar, int i, ArrayList arrayList) {
        cjz cjzVar = ckhVar.h;
        for (cjx cjxVar : cjzVar.j) {
            if (cjxVar instanceof cjz) {
                g((cjz) cjxVar, i, ckhVar.i, arrayList, null);
            } else if (cjxVar instanceof ckh) {
                g(((ckh) cjxVar).h, i, ckhVar.i, arrayList, null);
            }
        }
        for (cjx cjxVar2 : ckhVar.i.j) {
            if (cjxVar2 instanceof cjz) {
                g((cjz) cjxVar2, i, cjzVar, arrayList, null);
            } else if (cjxVar2 instanceof ckh) {
                g(((ckh) cjxVar2).i, i, cjzVar, arrayList, null);
            }
        }
        if (i == 1) {
            for (cjx cjxVar3 : ((ckf) ckhVar).a.j) {
                if (cjxVar3 instanceof cjz) {
                    g((cjz) cjxVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(cjn cjnVar, int i, int i2, int i3, int i4) {
        cjv cjvVar = this.h;
        cjvVar.i = i;
        cjvVar.j = i3;
        cjvVar.a = i2;
        cjvVar.b = i4;
        this.g.a(cjnVar, cjvVar);
        cjnVar.C(cjvVar.c);
        cjnVar.x(cjvVar.d);
        cjnVar.F = cjvVar.f;
        cjnVar.u(cjvVar.e);
    }

    private final void g(cjz cjzVar, int i, cjz cjzVar2, ArrayList arrayList, cpq cpqVar) {
        ckh ckhVar = cjzVar.d;
        if (ckhVar.l == null) {
            cjo cjoVar = this.a;
            if (ckhVar == cjoVar.h || ckhVar == cjoVar.i) {
                return;
            }
            if (cpqVar == null) {
                cpqVar = new cpq(ckhVar);
                arrayList.add(cpqVar);
            }
            cpq cpqVar2 = cpqVar;
            ckhVar.l = cpqVar2;
            ((ArrayList) cpqVar2.a).add(ckhVar);
            cjz cjzVar3 = ckhVar.h;
            for (cjx cjxVar : cjzVar3.j) {
                if (cjxVar instanceof cjz) {
                    g((cjz) cjxVar, i, cjzVar2, arrayList, cpqVar2);
                }
            }
            cjz cjzVar4 = ckhVar.i;
            for (cjx cjxVar2 : cjzVar4.j) {
                if (cjxVar2 instanceof cjz) {
                    g((cjz) cjxVar2, i, cjzVar2, arrayList, cpqVar2);
                }
            }
            if (i == 1 && (ckhVar instanceof ckf)) {
                for (cjx cjxVar3 : ((ckf) ckhVar).a.j) {
                    if (cjxVar3 instanceof cjz) {
                        g((cjz) cjxVar3, 1, cjzVar2, arrayList, cpqVar2);
                    }
                }
            }
            Iterator it = cjzVar3.k.iterator();
            while (it.hasNext()) {
                g((cjz) it.next(), i, cjzVar2, arrayList, cpqVar2);
            }
            Iterator it2 = cjzVar4.k.iterator();
            while (it2.hasNext()) {
                g((cjz) it2.next(), i, cjzVar2, arrayList, cpqVar2);
            }
            if (i == 1 && (ckhVar instanceof ckf)) {
                Iterator it3 = ((ckf) ckhVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((cjz) it3.next(), 1, cjzVar2, arrayList, cpqVar2);
                }
            }
        }
    }

    public final int a(cjo cjoVar, int i) {
        ArrayList arrayList;
        long jA;
        cjo cjoVar2 = cjoVar;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            cpq cpqVar = (cpq) arrayList2.get(i2);
            Object obj = cpqVar.b;
            if (!(obj instanceof cjw) ? !(i != 0 ? (obj instanceof ckf) : (obj instanceof cke)) : ((cjw) obj).f != i) {
                cjz cjzVar = i == 0 ? cjoVar2.h.h : cjoVar2.i.h;
                cjz cjzVar2 = i == 0 ? cjoVar2.h.i : cjoVar2.i.i;
                boolean zContains = ((ckh) obj).h.k.contains(cjzVar);
                boolean zContains2 = ((ckh) cpqVar.b).i.k.contains(cjzVar2);
                long jA2 = ((ckh) cpqVar.b).a();
                if (zContains && zContains2) {
                    long jD = cpqVar.d(((ckh) cpqVar.b).h, j);
                    long jC = cpqVar.c(((ckh) cpqVar.b).i, j);
                    long j2 = jD - jA2;
                    ckh ckhVar = (ckh) cpqVar.b;
                    arrayList = arrayList2;
                    long j3 = ckhVar.i.e;
                    if (j2 >= (-r5)) {
                        j2 += j3;
                    }
                    long j4 = (-jC) - jA2;
                    long j5 = ckhVar.h.e;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    cjn cjnVar = ckhVar.d;
                    float f = i == 0 ? cjnVar.ae : cjnVar.af;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j6 / f) + (j2 / f2)) : 0L;
                    jA = (j5 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    if (zContains) {
                        jA = Math.max(cpqVar.d(((ckh) cpqVar.b).h, r0.e), ((ckh) cpqVar.b).h.e + jA2);
                    } else if (zContains2) {
                        jA = Math.max(-cpqVar.c(((ckh) cpqVar.b).i, r0.e), (-((ckh) cpqVar.b).i.e) + jA2);
                    } else {
                        jA = (r0.h.e + ((ckh) cpqVar.b).a()) - ((ckh) cpqVar.b).i.e;
                    }
                }
            } else {
                jA = j;
                arrayList = arrayList2;
            }
            jMax = Math.max(jMax, jA);
            i2++;
            cjoVar2 = cjoVar;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        cjo cjoVar = this.d;
        cjoVar.h.d();
        cjoVar.i.d();
        arrayList.add(cjoVar.h);
        arrayList.add(cjoVar.i);
        ArrayList arrayList2 = cjoVar.aI;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            cjn cjnVar = (cjn) arrayList2.get(i);
            if (cjnVar instanceof cjq) {
                arrayList.add(new ckc(cjnVar));
            } else {
                if (cjnVar.H()) {
                    if (cjnVar.f == null) {
                        cjnVar.f = new cjw(cjnVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cjnVar.f);
                } else {
                    arrayList.add(cjnVar.h);
                }
                if (cjnVar.I()) {
                    if (cjnVar.g == null) {
                        cjnVar.g = new cjw(cjnVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(cjnVar.g);
                } else {
                    arrayList.add(cjnVar.i);
                }
                if (cjnVar instanceof cjr) {
                    arrayList.add(new ckd(cjnVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ckh) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ckh ckhVar = (ckh) arrayList.get(i3);
            if (ckhVar.d != cjoVar) {
                ckhVar.b();
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        cpq.c = 0;
        cjo cjoVar2 = this.a;
        e(cjoVar2.h, 0, arrayList3);
        e(cjoVar2.i, 1, arrayList3);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        cjy cjyVar;
        cka ckaVar;
        ArrayList arrayList = this.a.aI;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            cjn cjnVar = (cjn) arrayList.get(i2);
            if (cjnVar.e) {
                cjyVar = this;
            } else {
                int[] iArr = cjnVar.aq;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = cjnVar.s;
                int i6 = cjnVar.t;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                cka ckaVar2 = cjnVar.h.e;
                boolean z3 = ckaVar2.i;
                cka ckaVar3 = cjnVar.i.e;
                boolean z4 = ckaVar3.i;
                if (z3 && z4) {
                    cjyVar = this;
                    cjyVar.f(cjnVar, 1, ckaVar2.f, 1, ckaVar3.f);
                    cjnVar.e = true;
                } else {
                    if (z3 && z2) {
                        this.f(cjnVar, 1, ckaVar2.f, 2, ckaVar3.f);
                        if (i4 == 3) {
                            cjnVar.i.e.m = cjnVar.h();
                        } else {
                            cjnVar.i.e.c(cjnVar.h());
                            cjnVar.e = true;
                        }
                    } else if (z4 && z) {
                        cjyVar = this;
                        cjyVar.f(cjnVar, 2, ckaVar2.f, 1, ckaVar3.f);
                        if (i == 3) {
                            cjnVar.h.e.m = cjnVar.j();
                        } else {
                            cjnVar.h.e.c(cjnVar.j());
                            cjnVar.e = true;
                        }
                    }
                    cjyVar = this;
                }
                if (cjnVar.e && (ckaVar = cjnVar.i.b) != null) {
                    ckaVar.c(cjnVar.ab);
                }
            }
            i2++;
            this = cjyVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.cjo r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjy.d(cjo):void");
    }
}
