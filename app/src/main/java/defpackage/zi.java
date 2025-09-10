package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zi extends zt implements Set, ukh {
    public final zq a;

    public zi(zq zqVar) {
        super(zqVar);
        this.a = zqVar;
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.a.f(obj);
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        zq zqVar = this.a;
        int i = zqVar.g;
        for (Object obj : collection) {
            int iC = zqVar.c(obj);
            zqVar.b[iC] = obj;
            long[] jArr = zqVar.c;
            int i2 = zqVar.d;
            jArr[iC] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((iC & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            zqVar.d = iC;
            if (zqVar.e == Integer.MAX_VALUE) {
                zqVar.e = iC;
            }
        }
        return i != zqVar.g;
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zk(this, 1);
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.a.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        r13 = -1;
     */
    @Override // defpackage.zt, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r18) {
        /*
            r17 = this;
            r18.getClass()
            r0 = r17
            zq r0 = r0.a
            int r1 = r0.g
            java.util.Iterator r2 = r18.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L98
            java.lang.Object r3 = r2.next()
            if (r3 == 0) goto L20
            int r6 = r3.hashCode()
            goto L21
        L20:
            r6 = r5
        L21:
            int r7 = r0.f
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r8
            int r8 = r6 << 16
            r6 = r6 ^ r8
            int r8 = r6 >>> 7
            r8 = r8 & r7
        L2d:
            r9 = r6 & 127(0x7f, float:1.78E-43)
            long[] r10 = r0.a
            r11 = r8 & 7
            int r12 = r8 >> 3
            r13 = r10[r12]
            int r11 = r11 << 3
            long r13 = r13 >>> r11
            int r12 = r12 + r4
            r15 = r10[r12]
            int r10 = 64 - r11
            long r15 = r15 << r10
            long r10 = (long) r11
            long r10 = -r10
            r17 = r4
            r18 = r5
            long r4 = (long) r9
            r9 = 63
            long r9 = r10 >> r9
            long r9 = r9 & r15
            long r9 = r9 | r13
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r11
            long r4 = r4 ^ r9
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r4
            long r4 = ~r4
            long r4 = r4 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r11
        L62:
            r13 = 0
            int r15 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r15 == 0) goto L80
            int r13 = java.lang.Long.numberOfTrailingZeros(r4)
            int r13 = r13 >> 3
            int r13 = r13 + r8
            r13 = r13 & r7
            java.lang.Object[] r14 = r0.b
            r14 = r14[r13]
            boolean r14 = defpackage.a.ao(r14, r3)
            if (r14 == 0) goto L7b
            goto L8a
        L7b:
            r13 = -1
            long r13 = r13 + r4
            long r4 = r4 & r13
            goto L62
        L80:
            long r4 = ~r9
            r15 = 6
            long r4 = r4 << r15
            long r4 = r4 & r9
            long r4 = r4 & r11
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 == 0) goto L91
            r13 = -1
        L8a:
            if (r13 < 0) goto Ld
            r0.e(r13)
            goto Ld
        L91:
            int r5 = r18 + 8
            int r8 = r8 + r5
            r8 = r8 & r7
            r4 = r17
            goto L2d
        L98:
            r17 = r4
            int r0 = r0.g
            if (r1 == r0) goto L9f
            return r17
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi.removeAll(java.util.Collection):boolean");
    }

    @Override // defpackage.zt, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.a.h(collection);
    }
}
