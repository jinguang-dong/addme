package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhf {
    public final uiq a;
    public Object b;
    public int c = -1;
    public final bdp d;
    public final ayw e;
    public int f;
    public final HashMap g;
    public zm h;
    public final zu i;
    public final zu j;
    public final zw k;
    public final zu l;

    public bhf(uiq uiqVar) {
        this.a = uiqVar;
        long[] jArr = zv.a;
        this.i = new zu((byte[]) null);
        this.j = new zu((byte[]) null);
        this.k = new zw((byte[]) null);
        this.d = new bdp(new ayv[16]);
        this.e = new bhe(this, 0);
        this.l = new zu((byte[]) null);
        this.g = new HashMap();
    }

    public final void a(Object obj, Object obj2) {
        zu zuVar = this.i;
        bds.c(zuVar, obj2, obj);
        if (!(obj2 instanceof ayv) || zu.e(zuVar, obj2)) {
            return;
        }
        bds.b(this.l, obj2);
        this.g.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.zm r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r0.f
            if (r3 <= 0) goto Lc
            goto L91
        Lc:
            r3 = r24
            int r3 = r3.h(r1, r2)
            boolean r4 = r1 instanceof defpackage.ayv
            r5 = 2
            if (r4 == 0) goto L7d
            if (r3 == r2) goto L7d
            r2 = r1
            ayv r2 = (defpackage.ayv) r2
            ayu r2 = r2.e()
            java.util.HashMap r4 = r0.g
            java.lang.Object r6 = r2.e
            r4.put(r1, r6)
            zm r2 = r2.d
            zu r4 = r0.l
            defpackage.bds.b(r4, r1)
            java.lang.Object[] r6 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L38:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            r13 = 0
        L4c:
            int r14 = r12 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L72
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r6[r14]
            bhl r14 = (defpackage.bhl) r14
            boolean r8 = r14 instanceof defpackage.bhm
            if (r8 == 0) goto L6f
            r8 = r14
            bhm r8 = (defpackage.bhm) r8
            r8.j(r5)
        L6f:
            defpackage.bds.a(r4, r14, r1)
        L72:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L4c
        L76:
            if (r14 != r15) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L38
        L7d:
            r2 = -1
            if (r3 != r2) goto L91
            boolean r2 = r1 instanceof defpackage.bhm
            if (r2 == 0) goto L8a
            r2 = r1
            bhm r2 = (defpackage.bhm) r2
            r2.j(r5)
        L8a:
            zu r0 = r0.i
            r2 = r23
            defpackage.bds.a(r0, r1, r2)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhf.b(java.lang.Object, int, java.lang.Object, zm):void");
    }
}
