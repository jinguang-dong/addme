package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjo extends cju {
    public int ar;
    public int as;
    public int b;
    public final got aH = new got(this);
    public final cjy a = new cjy(this);
    public ckm aG = null;
    public boolean c = false;
    public final cjf d = new cjf();
    public int at = 0;
    public int au = 0;
    public cjl[] av = new cjl[4];
    public cjl[] aw = new cjl[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final cjv aF = new cjv();

    public static void X(cjn cjnVar, ckm ckmVar, cjv cjvVar) {
        int i;
        int i2;
        if (ckmVar == null) {
            return;
        }
        if (cjnVar.ah == 8 || (cjnVar instanceof cjq) || (cjnVar instanceof cjk)) {
            cjvVar.c = 0;
            cjvVar.d = 0;
            return;
        }
        cjvVar.i = cjnVar.M();
        cjvVar.j = cjnVar.N();
        cjvVar.a = cjnVar.j();
        cjvVar.b = cjnVar.h();
        cjvVar.g = false;
        cjvVar.h = 0;
        boolean z = cjvVar.i == 3;
        boolean z2 = cjvVar.j == 3;
        boolean z3 = z && cjnVar.X > 0.0f;
        boolean z4 = z2 && cjnVar.X > 0.0f;
        if (z && cjnVar.F(0) && cjnVar.s == 0 && !z3) {
            cjvVar.i = 2;
            if (z2 && cjnVar.t == 0) {
                cjvVar.i = 1;
            }
            z = false;
        }
        if (z2 && cjnVar.F(1) && cjnVar.t == 0 && !z4) {
            cjvVar.j = 2;
            if (z && cjnVar.s == 0) {
                cjvVar.j = 1;
            }
            z2 = false;
        }
        if (cjnVar.e()) {
            cjvVar.i = 1;
            z = false;
        }
        if (cjnVar.f()) {
            cjvVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (cjnVar.u[0] == 4) {
                cjvVar.i = 1;
            } else if (!z2) {
                if (cjvVar.j == 1) {
                    i2 = cjvVar.b;
                } else {
                    cjvVar.i = 2;
                    ckmVar.a(cjnVar, cjvVar);
                    i2 = cjvVar.d;
                }
                cjvVar.i = 1;
                cjvVar.a = (int) (cjnVar.X * i2);
            }
        }
        if (z4) {
            if (cjnVar.u[1] == 4) {
                cjvVar.j = 1;
            } else if (!z) {
                if (cjvVar.i == 1) {
                    i = cjvVar.a;
                } else {
                    cjvVar.j = 2;
                    ckmVar.a(cjnVar, cjvVar);
                    i = cjvVar.c;
                }
                cjvVar.j = 1;
                float f = i;
                if (cjnVar.Y == -1) {
                    cjvVar.b = (int) (f / cjnVar.X);
                } else {
                    cjvVar.b = (int) (cjnVar.X * f);
                }
            }
        }
        ckmVar.a(cjnVar, cjvVar);
        cjnVar.C(cjvVar.c);
        cjnVar.x(cjvVar.d);
        cjnVar.F = cjvVar.f;
        cjnVar.u(cjvVar.e);
        cjvVar.h = 0;
        boolean z5 = cjvVar.g;
    }

    private final void Z(cjm cjmVar, cji cjiVar) {
        cjf cjfVar = this.d;
        cjfVar.g(cjiVar, cjfVar.b(cjmVar), 0, 5);
    }

    private final void aa(cjm cjmVar, cji cjiVar) {
        cjf cjfVar = this.d;
        cjfVar.g(cjfVar.b(cjmVar), cjiVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.cjn
    public final void D(boolean z, boolean z2) {
        super.D(z, z2);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((cjn) this.aI.get(i)).D(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05ee A[PHI: r4
      0x05ee: PHI (r4v1 int) = (r4v0 int), (r4v43 int) binds: [B:137:0x0233, B:143:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0712 A[Catch: Exception -> 0x08da, TryCatch #4 {Exception -> 0x08da, blocks: (B:384:0x0689, B:393:0x06ac, B:395:0x06b8, B:396:0x06bb, B:398:0x06bf, B:400:0x06c9, B:423:0x06f8, B:403:0x06d2, B:422:0x06f5, B:424:0x06ff, B:425:0x0704, B:427:0x070c, B:429:0x0712, B:430:0x071a, B:432:0x0720), top: B:610:0x0689 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x08ac A[Catch: Exception -> 0x08d8, TryCatch #6 {Exception -> 0x08d8, blocks: (B:520:0x089b, B:522:0x089f, B:529:0x08ac, B:531:0x08c3, B:533:0x08c7, B:534:0x08cb), top: B:614:0x089b }] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0940 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x094d A[LOOP:14: B:560:0x094b->B:561:0x094d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0772 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.cju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjo.T():void");
    }

    public final void U(int i) {
        this.ax = i;
        cjf.a = W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V(boolean r13, int r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjo.V(boolean, int):boolean");
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    final void a(cjn cjnVar, int i) {
        if (i == 0) {
            int i2 = this.at + 1;
            cjl[] cjlVarArr = this.aw;
            int length = cjlVarArr.length;
            if (i2 >= length) {
                this.aw = (cjl[]) Arrays.copyOf(cjlVarArr, length + length);
            }
            cjl[] cjlVarArr2 = this.aw;
            int i3 = this.at;
            cjlVarArr2[i3] = new cjl(cjnVar, 0, this.c);
            this.at = i3 + 1;
            return;
        }
        int i4 = this.au + 1;
        cjl[] cjlVarArr3 = this.av;
        int length2 = cjlVarArr3.length;
        if (i4 >= length2) {
            this.av = (cjl[]) Arrays.copyOf(cjlVarArr3, length2 + length2);
        }
        cjl[] cjlVarArr4 = this.av;
        int i5 = this.au;
        cjlVarArr4[i5] = new cjl(cjnVar, 1, this.c);
        this.au = i5 + 1;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.cju, defpackage.cjn
    public final void s() {
        this.d.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }
}
