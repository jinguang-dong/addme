package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class siy extends sja {
    public final int[] a;
    public final int b;
    private final sij c;
    private final sij d;

    public siy(sij sijVar, sij sijVar2) {
        int iH;
        this.c = sijVar;
        this.d = sijVar2;
        int iB = sijVar2.b();
        int i = 0;
        ske.f(iB <= 28, "metadata size too large");
        int[] iArr = new int[iB];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        while (i < iArr.length) {
            shl shlVarE = e(i);
            long j2 = shlVarE.d | j;
            if (j2 != j || (iH = h(shlVarE, iArr, i2)) == -1) {
                iArr[i2] = i;
                i2++;
            } else {
                iArr[iH] = shlVarE.b ? iArr[iH] | (1 << (i + 4)) : i;
            }
            i++;
            j = j2;
        }
        this.b = i2;
    }

    private final int h(shl shlVar, int[] iArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (shlVar.equals(e(iArr[i2] & 31))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.sja
    public final int a() {
        return this.b;
    }

    @Override // defpackage.sja
    public final Object b(shl shlVar) {
        ske.f(!shlVar.b, "key must be single valued");
        int[] iArr = this.a;
        int iH = h(shlVar, iArr, this.b);
        if (iH >= 0) {
            return shlVar.c(f(iArr[iH]));
        }
        return null;
    }

    @Override // defpackage.sja
    public final Set c() {
        return new siw(this);
    }

    @Override // defpackage.sja
    public final void d(siq siqVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            shl shlVarE = e(i2 & 31);
            if (shlVarE.b) {
                siqVar.b(shlVarE, new six(this, shlVarE, i2), obj);
            } else {
                siqVar.a(shlVarE, shlVarE.c(f(i2)), obj);
            }
        }
    }

    public final shl e(int i) {
        return (i >= 0 ? this.d : this.c).c(i);
    }

    public final Object f(int i) {
        return (i >= 0 ? this.d : this.c).e(i);
    }
}
