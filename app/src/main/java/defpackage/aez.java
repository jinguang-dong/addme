package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aez extends aen implements bun {
    private final yx j;
    private final yx k;

    public aez(uif uifVar, ocq ocqVar, afr afrVar, boolean z, cbk cbkVar) {
        super(ocqVar, afrVar, false, z, null, cbkVar, uifVar);
        int i = yy.a;
        this.j = new yx((byte[]) null);
        this.k = new yx((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A() {
        /*
            r21 = this;
            r0 = r21
            yx r1 = r0.j
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
            r13 = 8
            if (r4 < 0) goto L4b
            r14 = r12
            r15 = 128(0x80, double:6.3E-322)
        L19:
            r5 = r3[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L2d:
            if (r8 >= r7) goto L44
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L40
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r2[r19]
            uol r19 = (defpackage.uol) r19
            defpackage.ujp.Z(r19)
        L40:
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L2d
        L44:
            if (r7 != r13) goto L4f
        L46:
            if (r14 == r4) goto L4f
            int r14 = r14 + 1
            goto L19
        L4b:
            r15 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L4f:
            r1.d()
            yx r0 = r0.k
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8c
            r4 = r12
        L5e:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L87
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r12
        L70:
            if (r8 >= r7) goto L85
            long r19 = r5 & r17
            int r14 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r14 < 0) goto L7c
            long r5 = r5 >> r13
            int r8 = r8 + 1
            goto L70
        L7c:
            int r0 = r4 << 3
            int r0 = r0 + r8
            r0 = r1[r0]
            acv r0 = (defpackage.acv) r0
            r0 = 0
            throw r0
        L85:
            if (r7 != r13) goto L8c
        L87:
            if (r4 == r3) goto L8c
            int r4 = r4 + 1
            goto L5e
        L8c:
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aez.A():void");
    }

    @Override // defpackage.aen
    public final Object a(bqc bqcVar, uhb uhbVar) throws Throwable {
        Object objE = ajq.e(bqcVar, new aey(this, (uhb) null, 0), new sh(this, 9), uhbVar);
        return objE == uhi.a ? objE : ufg.a;
    }

    @Override // defpackage.bij
    public final void da() {
        A();
    }

    @Override // defpackage.aen
    protected final void f() {
        A();
    }

    @Override // defpackage.aen
    protected final void t(KeyEvent keyEvent) {
        yx yxVar = this.j;
        long jG = akg.G(keyEvent);
        if (yxVar.a(jG) != null) {
            uol uolVar = (uol) yxVar.a(jG);
            boolean z = false;
            if (uolVar != null) {
                if (uolVar.t()) {
                    uolVar.s(null);
                } else {
                    z = true;
                }
            }
            yxVar.c(jG);
            if (z) {
                return;
            }
        }
        ((aen) this).b.a();
    }

    @Override // defpackage.aen
    protected final void w(KeyEvent keyEvent) {
        if (((acv) this.k.a(akg.G(keyEvent))) != null) {
            throw null;
        }
    }
}
