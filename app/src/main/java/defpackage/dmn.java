package defpackage;

import defpackage.a;
import defpackage.bij;
import defpackage.dmm;
import defpackage.dmn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmn {
    public int a;
    public final List b;
    public final List c;
    public final List d;
    public buu e;
    public final bik f;
    public final zu g;
    public final zw h;
    public tym i;

    public dmn() {
        long[] jArr = zv.a;
        this.g = new zu((byte[]) null);
        int i = zx.a;
        this.h = new zw((byte[]) null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new bwa(this) { // from class: androidx.wear.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            private final dmn a;

            {
                this.a = this;
            }

            @Override // defpackage.bwa
            public final /* bridge */ /* synthetic */ bij a() {
                return new dmm(this.a);
            }

            @Override // defpackage.bwa
            public final /* synthetic */ void b(bij bijVar) {
                dmm dmmVar = (dmm) bijVar;
                dmn dmnVar = dmmVar.a;
                dmn dmnVar2 = this.a;
                if (a.ao(dmnVar, dmnVar2) || !dmmVar.m.w) {
                    return;
                }
                dmmVar.a.c();
                dmnVar2.e = dmmVar;
                dmmVar.a = dmnVar2;
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

    public static final int e(dlr dlrVar) {
        return chy.b(dlrVar.c());
    }

    public static /* synthetic */ void f(dmn dmnVar, dlr dlrVar, int i) {
        Object objA = dmnVar.g.a(dlrVar.k);
        objA.getClass();
        i(dlrVar, i, (scf) objA);
    }

    public static /* synthetic */ void g(dmn dmnVar, dlr dlrVar) {
        Object objA = dmnVar.g.a(dlrVar.k);
        objA.getClass();
        for (dml dmlVar : (dml[]) ((scf) objA).a) {
            if (dmlVar != null) {
                dmlVar.c = dlrVar.c();
            }
        }
    }

    public static final void h(scf scfVar, int i) {
        for (dml dmlVar : (dml[]) scfVar.a) {
            if (dmlVar != null) {
                long j = dmlVar.c;
                if (!a.q(j, 9223372034707292159L)) {
                    dmlVar.c = chy.d(j, i & 4294967295L);
                }
            }
        }
    }

    public static final void i(dlr dlrVar, int i, scf scfVar) {
        long jC = dlrVar.c();
        long jF = chy.f(jC, 0, i, 1);
        for (dml dmlVar : (dml[]) scfVar.a) {
            if (dmlVar != null) {
                dmlVar.c = chy.d(jF, chy.c(dlrVar.c(), jC));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r15 = this;
            zu r15 = r15.g
            boolean r0 = r15.d()
            if (r0 == 0) goto L5f
            java.lang.Object[] r0 = r15.c
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5c
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
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            r8 = r3
        L26:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L55
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L51
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            scf r9 = (defpackage.scf) r9
            java.lang.Object r9 = r9.a
            dml[] r9 = (defpackage.dml[]) r9
            int r11 = r9.length
            r12 = r3
        L45:
            if (r12 >= r11) goto L51
            r13 = r9[r12]
            if (r13 == 0) goto L4e
            r13.c()
        L4e:
            int r12 = r12 + 1
            goto L45
        L51:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L26
        L55:
            if (r9 != r10) goto L5c
        L57:
            if (r4 == r2) goto L5c
            int r4 = r4 + 1
            goto L13
        L5c:
            r15.i()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmn.a():void");
    }

    public final void b(Object obj) {
        Object obj2;
        scf scfVar = (scf) this.g.g(obj);
        if (scfVar == null || (obj2 = scfVar.a) == null) {
            return;
        }
        int i = 0;
        while (true) {
            dml[] dmlVarArr = (dml[]) obj2;
            if (i >= dmlVarArr.length) {
                return;
            }
            dml dmlVar = dmlVarArr[i];
            if (dmlVar != null) {
                dmlVar.c();
            }
            i++;
        }
    }

    public final void c() {
        a();
        this.i = null;
        this.a = -1;
    }

    public final dml d(Object obj) {
        Object obj2;
        scf scfVar = (scf) this.g.a(obj);
        if (scfVar == null || (obj2 = scfVar.a) == null) {
            return null;
        }
        return (dml) rnt.an((Object[]) obj2, 0);
    }
}
