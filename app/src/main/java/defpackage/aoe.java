package defpackage;

import defpackage.a;
import defpackage.aob;
import defpackage.aoe;
import defpackage.bij;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoe {
    public final List a;
    public buu b;
    public final bik c;
    private int d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final zu i;
    private final zw j;
    private qzx k;

    public aoe() {
        long[] jArr = zv.a;
        this.i = new zu((byte[]) null);
        int i = zx.a;
        this.j = new zw((byte[]) null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.a = new ArrayList();
        this.c = new bwa(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            private final aoe a;

            {
                this.a = this;
            }

            @Override // defpackage.bwa
            public final /* bridge */ /* synthetic */ bij a() {
                return new aob(this.a);
            }

            @Override // defpackage.bwa
            public final /* synthetic */ void b(bij bijVar) {
                aob aobVar = (aob) bijVar;
                aoe aoeVar = aobVar.a;
                aoe aoeVar2 = this.a;
                if (a.ao(aoeVar, aoeVar2) || !aobVar.m.w) {
                    return;
                }
                aobVar.a.c();
                aoeVar2.b = aobVar;
                aobVar.a = aoeVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && a.ao(this.a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
            }
        };
    }

    static /* synthetic */ void d(aoe aoeVar, anb anbVar, int i) {
        Object objA = aoeVar.i.a(anbVar.d);
        objA.getClass();
        j(anbVar, i, (aoc) objA);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() {
        /*
            r15 = this;
            zu r15 = r15.i
            boolean r0 = r15.d()
            if (r0 == 0) goto L5d
            java.lang.Object[] r0 = r15.c
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L13:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            r8 = r3
        L26:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L4f
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            aoc r9 = (defpackage.aoc) r9
            aoa[] r9 = r9.a
            int r11 = r9.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r9[r12]
            if (r13 == 0) goto L4c
            r13.b()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L26
        L53:
            if (r9 != r10) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L13
        L5a:
            r15.i()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.f():void");
    }

    private final void g(Object obj) {
        aoa[] aoaVarArr;
        aoc aocVar = (aoc) this.i.g(obj);
        if (aocVar == null || (aoaVarArr = aocVar.a) == null) {
            return;
        }
        for (aoa aoaVar : aoaVarArr) {
            if (aoaVar != null) {
                aoaVar.b();
            }
        }
    }

    private static final boolean h(anb anbVar) {
        int iA = anbVar.a();
        for (int i = 0; i < iA; i++) {
            if (aof.a(anbVar.c(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private static final int i(anb anbVar) {
        long jB = anbVar.b(0);
        return anbVar.b ? chy.b(jB) : chy.a(jB);
    }

    private static final void j(anb anbVar, int i, aoc aocVar) {
        int i2 = 0;
        long jB = anbVar.b(0);
        long jF = anbVar.b ? chy.f(jB, 0, i, 1) : chy.f(jB, i, 0, 2);
        aoa[] aoaVarArr = aocVar.a;
        int length = aoaVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            aoa aoaVar = aoaVarArr[i2];
            int i4 = i3 + 1;
            if (aoaVar != null) {
                aoaVar.c = chy.d(jF, chy.c(anbVar.b(i3), jB));
            }
            i2++;
            i3 = i4;
        }
    }

    private final void k(anb anbVar) {
        Object objA = this.i.a(anbVar.d);
        objA.getClass();
        aoa[] aoaVarArr = ((aoc) objA).a;
        int length = aoaVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            aoa aoaVar = aoaVarArr[i];
            int i3 = i2 + 1;
            if (aoaVar != null) {
                aoaVar.c = anbVar.b(i2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int l(int[] iArr, anb anbVar) {
        int iMax = 0;
        for (int i = 0; i <= 0; i++) {
            int i2 = iArr[i] + anbVar.i;
            iArr[i] = i2;
            iMax = Math.max(iMax, i2);
        }
        return iMax;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            aoa aoaVar = (aoa) list.get(i);
            bmz bmzVar = aoaVar.e;
            if (bmzVar != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), chy.b(aoaVar.c) + ((int) (bmzVar.k & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), chy.a(aoaVar.c) + ((int) (bmzVar.k >> 32))) << 32);
            }
        }
        return jMax;
    }

    public final aoa b(Object obj, int i) {
        aoa[] aoaVarArr;
        aoc aocVar = (aoc) this.i.a(obj);
        if (aocVar == null || (aoaVarArr = aocVar.a) == null) {
            return null;
        }
        return aoaVarArr[i];
    }

    public final void c() {
        f();
        this.k = null;
        this.d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r38, int r39, int r40, java.util.List r41, defpackage.qzx r42, defpackage.anc r43, boolean r44, boolean r45, boolean r46, int r47, int r48, defpackage.und r49, defpackage.byz r50) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoe.e(int, int, int, java.util.List, qzx, anc, boolean, boolean, boolean, int, int, und, byz):void");
    }
}
