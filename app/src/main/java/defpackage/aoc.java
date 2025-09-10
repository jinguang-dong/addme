package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoc {
    public cho b;
    public int c;
    public int d;
    public int f;
    public int g;
    public aoa[] a = aof.a;
    public int e = 1;

    public static /* synthetic */ void b(aoc aocVar, anb anbVar, und undVar, byz byzVar, int i, int i2) {
        long jB = anbVar.b(0);
        aocVar.a(anbVar, undVar, byzVar, i, i2, !anbVar.b ? chy.b(jB) : chy.a(jB));
    }

    public final void a(anb anbVar, und undVar, byz byzVar, int i, int i2, int i3) {
        for (aoa aoaVar : this.a) {
        }
        this.f = i;
        this.g = i2;
        int length = this.a.length;
        for (int iA = anbVar.a(); iA < length; iA++) {
            aoa aoaVar2 = this.a[iA];
            if (aoaVar2 != null) {
                aoaVar2.b();
            }
        }
        if (this.a.length != anbVar.a()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.a, anbVar.a());
            objArrCopyOf.getClass();
            this.a = (aoa[]) objArrCopyOf;
        }
        this.b = new cho(anbVar.f);
        this.c = i3;
        this.d = 0;
        this.e = 1;
        int iA2 = anbVar.a();
        for (int i4 = 0; i4 < iA2; i4++) {
            if (aof.a(anbVar.c(i4)) != null) {
                if (this.a[i4] != null) {
                    throw null;
                }
                this.a[i4] = new aoa(undVar, byzVar);
                throw null;
            }
            aoa aoaVar3 = this.a[i4];
            if (aoaVar3 != null) {
                aoaVar3.b();
            }
            this.a[i4] = null;
        }
    }
}
