package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ana implements bss {
    public final anb a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final und f;
    public final chq g;
    public final long h;
    public final List i;
    public final int j;
    public final int k;
    public final int l;
    public final aii m;
    public final int n;
    public final int o;
    private final bss p;
    private final boolean q;

    public /* synthetic */ ana(anb anbVar, int i, boolean z, float f, bss bssVar, float f2, boolean z2, und undVar, chq chqVar, long j, List list, int i2, int i3, int i4, aii aiiVar, int i5, int i6) {
        this.a = anbVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.p = bssVar;
        this.e = f2;
        this.q = z2;
        this.f = undVar;
        this.g = chqVar;
        this.h = j;
        this.i = list;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = aiiVar;
        this.n = i5;
        this.o = i6;
    }

    @Override // defpackage.bss
    public final int a() {
        return this.p.a();
    }

    @Override // defpackage.bss
    public final int b() {
        return this.p.b();
    }

    public final long c() {
        return (b() << 32) | (a() & 4294967295L);
    }

    public final ana d(int i, boolean z) {
        anb anbVar;
        int i2;
        anb anbVar2;
        long jB;
        if (!this.q) {
            List list = this.i;
            if (!list.isEmpty() && (anbVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < anbVar.i) {
                anb anbVar3 = (anb) ske.bB(list);
                anb anbVar4 = (anb) ske.bF(list);
                if (!anbVar3.k && !anbVar4.k) {
                    if (i < 0) {
                        if (Math.min((anbVar3.g + anbVar3.i) - this.j, (anbVar4.g + anbVar4.i) - this.k) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(this.j - anbVar3.g, this.k - anbVar4.g) <= i) {
                        return null;
                    }
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        anb anbVar5 = (anb) list.get(i3);
                        if (!anbVar5.k) {
                            anbVar5.g += i;
                            int[] iArr = anbVar5.n;
                            int length = iArr.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                int i5 = i4 & 1;
                                boolean z2 = anbVar5.b;
                                if (z2) {
                                    if (i5 == 0) {
                                        i5 = 0;
                                        if (z2) {
                                        }
                                    }
                                    iArr[i4] = iArr[i4] + i;
                                } else if (z2 && i5 == 0) {
                                    iArr[i4] = iArr[i4] + i;
                                }
                            }
                            if (z) {
                                int iA = anbVar5.a();
                                int i6 = 0;
                                while (i6 < iA) {
                                    aoa aoaVarB = anbVar5.e.b(anbVar5.d, i6);
                                    if (aoaVarB != null) {
                                        boolean z3 = anbVar5.b;
                                        long j = aoaVarB.c;
                                        if (z3) {
                                            anbVar2 = anbVar;
                                            jB = (chy.a(j) << 32) | (Integer.valueOf(chy.b(j) + i).intValue() & 4294967295L);
                                        } else {
                                            anbVar2 = anbVar;
                                            jB = (chy.b(j) & 4294967295L) | (Integer.valueOf(chy.a(j) + i).intValue() << 32);
                                        }
                                        aoaVarB.c = jB;
                                    } else {
                                        anbVar2 = anbVar;
                                    }
                                    i6++;
                                    anbVar = anbVar2;
                                }
                            }
                        }
                        i3++;
                        anbVar = anbVar;
                    }
                    return new ana(anbVar, i2, this.c || i > 0, i, this.p, this.e, false, this.f, this.g, this.h, list, this.j, this.k, this.l, this.m, this.n, this.o);
                }
            }
        }
        return null;
    }

    @Override // defpackage.bss
    public final Map e() {
        return this.p.e();
    }

    @Override // defpackage.bss
    public final void f() {
        this.p.f();
    }

    @Override // defpackage.bss
    public final void g() {
        this.p.g();
    }
}
