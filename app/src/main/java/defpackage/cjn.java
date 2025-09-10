package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cjn {
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final cjm J;
    public final cjm K;
    public final cjm L;
    public final cjm M;
    public final cjm N;
    final cjm O;
    final cjm P;
    public final cjm Q;
    public final cjm[] R;
    protected final ArrayList S;
    public final boolean[] T;
    public cjn U;
    int V;
    public int W;
    public float X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public int ad;
    public float ae;
    public float af;
    public Object ag;
    public int ah;
    public String ai;
    public int aj;
    public int ak;
    public final float[] al;
    public final cjn[] am;
    public final cjn[] an;
    public int ao;
    public int ap;
    public final int[] aq;
    private boolean b;
    public cjw f;
    public cjw g;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    public boolean e = false;
    public cke h = null;
    public ckf i = null;
    public final boolean[] j = {true, true};
    private boolean a = true;
    public int k = -1;
    public int l = -1;

    public cjn() {
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        cjm cjmVar = new cjm(this, 2);
        this.J = cjmVar;
        cjm cjmVar2 = new cjm(this, 3);
        this.K = cjmVar2;
        cjm cjmVar3 = new cjm(this, 4);
        this.L = cjmVar3;
        cjm cjmVar4 = new cjm(this, 5);
        this.M = cjmVar4;
        cjm cjmVar5 = new cjm(this, 6);
        this.N = cjmVar5;
        cjm cjmVar6 = new cjm(this, 8);
        this.O = cjmVar6;
        cjm cjmVar7 = new cjm(this, 9);
        this.P = cjmVar7;
        cjm cjmVar8 = new cjm(this, 7);
        this.Q = cjmVar8;
        this.R = new cjm[]{cjmVar, cjmVar3, cjmVar2, cjmVar4, cjmVar5, cjmVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        this.aq = new int[]{1, 1};
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        this.ah = 0;
        this.ai = null;
        this.aj = 0;
        this.ak = 0;
        this.al = new float[]{-1.0f, -1.0f};
        this.am = new cjn[]{null, null};
        this.an = new cjn[]{null, null};
        this.ao = -1;
        this.ap = -1;
        arrayList.add(cjmVar);
        arrayList.add(cjmVar2);
        arrayList.add(cjmVar3);
        arrayList.add(cjmVar4);
        arrayList.add(cjmVar6);
        arrayList.add(cjmVar7);
        arrayList.add(cjmVar8);
        arrayList.add(cjmVar5);
    }

    private final boolean a(int i) {
        cjm cjmVar;
        cjm cjmVar2;
        cjm[] cjmVarArr = this.R;
        int i2 = i + i;
        cjm cjmVar3 = cjmVarArr[i2];
        cjm cjmVar4 = cjmVar3.e;
        return (cjmVar4 == null || cjmVar4.e == cjmVar3 || (cjmVar2 = (cjmVar = cjmVarArr[i2 + 1]).e) == null || cjmVar2.e != cjmVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b9 A[PHI: r0
      0x04b9: PHI (r0v17 int) = (r0v16 int), (r0v21 int), (r0v21 int), (r0v21 int) binds: [B:284:0x04a9, B:286:0x04af, B:287:0x04b1, B:289:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(defpackage.cjf r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.cji r34, defpackage.cji r35, int r36, boolean r37, defpackage.cjm r38, defpackage.cjm r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.c(cjf, boolean, boolean, boolean, boolean, cji, cji, int, boolean, cjm, cjm, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void A(int i) {
        if (i < 0) {
            this.ad = 0;
        } else {
            this.ad = i;
        }
    }

    public final void B(int i) {
        if (i < 0) {
            this.ac = 0;
        } else {
            this.ac = i;
        }
    }

    public final void C(int i) {
        this.V = i;
        int i2 = this.ac;
        if (i < i2) {
            this.V = i2;
        }
    }

    public void D(boolean z, boolean z2) {
        int i;
        int i2;
        cke ckeVar = this.h;
        boolean z3 = z & ckeVar.g;
        ckf ckfVar = this.i;
        boolean z4 = z2 & ckfVar.g;
        int i3 = ckeVar.h.f;
        int i4 = ckfVar.h.f;
        int i5 = ckeVar.i.f;
        int i6 = ckfVar.i.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (z3) {
            this.Z = i3;
        }
        if (z4) {
            this.aa = i4;
        }
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        if (z3) {
            int i8 = i5 - i3;
            if (this.aq[0] == 1 && i8 < (i2 = this.V)) {
                i8 = i2;
            }
            this.V = i8;
            int i9 = this.ac;
            if (i8 < i9) {
                this.V = i9;
            }
        }
        if (z4) {
            int i10 = i6 - i4;
            if (this.aq[1] == 1 && i10 < (i = this.W)) {
                i10 = i;
            }
            this.W = i10;
            int i11 = this.ad;
            if (i10 < i11) {
                this.W = i11;
            }
        }
    }

    final boolean E() {
        return (this instanceof cjt) || (this instanceof cjq);
    }

    public final boolean F(int i) {
        if (i == 0) {
            return (this.J.e != null ? 1 : 0) + (this.L.e != null ? 1 : 0) < 2;
        }
        return ((this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0)) + (this.N.e != null ? 1 : 0) < 2;
    }

    public final boolean G(int i, int i2) {
        cjm cjmVar;
        cjm cjmVar2;
        cjm cjmVar3;
        cjm cjmVar4;
        if (i == 0) {
            cjm cjmVar5 = this.J;
            cjm cjmVar6 = cjmVar5.e;
            return cjmVar6 != null && cjmVar6.c && (cjmVar4 = (cjmVar3 = this.L).e) != null && cjmVar4.c && (cjmVar4.a() - cjmVar3.b()) - (cjmVar5.e.a() + cjmVar5.b()) >= i2;
        }
        cjm cjmVar7 = this.K;
        cjm cjmVar8 = cjmVar7.e;
        if (cjmVar8 != null && cjmVar8.c && (cjmVar2 = (cjmVar = this.M).e) != null && cjmVar2.c && (cjmVar2.a() - cjmVar.b()) - (cjmVar7.e.a() + cjmVar7.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        cjm cjmVar = this.J;
        cjm cjmVar2 = cjmVar.e;
        if (cjmVar2 != null && cjmVar2.e == cjmVar) {
            return true;
        }
        cjm cjmVar3 = this.L;
        cjm cjmVar4 = cjmVar3.e;
        return cjmVar4 != null && cjmVar4.e == cjmVar3;
    }

    public final boolean I() {
        cjm cjmVar = this.K;
        cjm cjmVar2 = cjmVar.e;
        if (cjmVar2 != null && cjmVar2.e == cjmVar) {
            return true;
        }
        cjm cjmVar3 = this.M;
        cjm cjmVar4 = cjmVar3.e;
        return cjmVar4 != null && cjmVar4.e == cjmVar3;
    }

    public final boolean J() {
        return this.a && this.ah != 8;
    }

    public cjm K(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? this.Q : this.N : this.M : this.L : this.K : this.J;
    }

    public final int L(int i) {
        return i == 0 ? M() : N();
    }

    public final int M() {
        return this.aq[0];
    }

    public final int N() {
        return this.aq[1];
    }

    public final void O(int i, cjn cjnVar, int i2, int i3, int i4) {
        K(i).j(cjnVar.K(i2), i3, i4);
    }

    public final void P(int i) {
        this.aq[0] = i;
    }

    public final void Q(int i) {
        this.aq[1] = i;
    }

    public void R(boolean z) {
        int i;
        ckf ckfVar;
        cke ckeVar;
        int iO = cjf.o(this.J);
        int iO2 = cjf.o(this.K);
        int iO3 = cjf.o(this.L);
        int iO4 = cjf.o(this.M);
        if (z && (ckeVar = this.h) != null) {
            cjz cjzVar = ckeVar.h;
            if (cjzVar.i) {
                cjz cjzVar2 = ckeVar.i;
                if (cjzVar2.i) {
                    iO = cjzVar.f;
                    iO3 = cjzVar2.f;
                }
            }
        }
        if (z && (ckfVar = this.i) != null) {
            cjz cjzVar3 = ckfVar.h;
            if (cjzVar3.i) {
                cjz cjzVar4 = ckfVar.i;
                if (cjzVar4.i) {
                    iO2 = cjzVar3.f;
                    iO4 = cjzVar4.f;
                }
            }
        }
        if (iO3 - iO < 0 || iO4 - iO2 < 0 || iO == Integer.MIN_VALUE || iO == Integer.MAX_VALUE || iO2 == Integer.MIN_VALUE || iO2 == Integer.MAX_VALUE || iO3 == Integer.MIN_VALUE || iO3 == Integer.MAX_VALUE || iO4 == Integer.MIN_VALUE || iO4 == Integer.MAX_VALUE) {
            iO = 0;
            iO2 = 0;
            iO3 = 0;
            iO4 = 0;
        }
        this.Z = iO;
        this.aa = iO2;
        if (this.ah == 8) {
            this.V = 0;
            this.W = 0;
            return;
        }
        int i2 = iO3 - iO;
        int[] iArr = this.aq;
        int i3 = iArr[0];
        if (i3 == 1) {
            int i4 = this.V;
            if (i2 < i4) {
                i2 = i4;
            }
            i3 = 1;
        }
        int i5 = iO4 - iO2;
        if (iArr[1] == 1 && i5 < (i = this.W)) {
            i5 = i;
        }
        this.V = i2;
        this.W = i5;
        int i6 = this.ad;
        if (i5 < i6) {
            this.W = i6;
        }
        int i7 = this.ac;
        if (i2 < i7) {
            this.V = i7;
        } else {
            i7 = i2;
        }
        int i8 = this.w;
        if (i8 > 0 && i3 == 3) {
            this.V = Math.min(i7, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && iArr[1] == 3) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.V;
        if (i2 != i10) {
            this.k = i10;
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.l = i11;
        }
    }

    public void S(pmg pmgVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r13v44, types: [cjo] */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(defpackage.cjf r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.b(cjf, boolean):void");
    }

    public boolean d() {
        return this.ah != 8;
    }

    public boolean e() {
        if (this.b) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean f() {
        if (this.m) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public final int g() {
        return l() + this.W;
    }

    public final int h() {
        if (this.ah == 8) {
            return 0;
        }
        return this.W;
    }

    public final int i() {
        return k() + this.V;
    }

    public final int j() {
        if (this.ah == 8) {
            return 0;
        }
        return this.V;
    }

    public final int k() {
        cjn cjnVar = this.U;
        return cjnVar != null ? ((cjo) cjnVar).ar + this.Z : this.Z;
    }

    public final int l() {
        cjn cjnVar = this.U;
        return cjnVar != null ? ((cjo) cjnVar).as + this.aa : this.aa;
    }

    public final cjn m(int i) {
        cjm cjmVar;
        cjm cjmVar2;
        if (i == 0) {
            cjm cjmVar3 = this.L;
            cjmVar2 = cjmVar3.e;
            if (cjmVar2 == null || cjmVar2.e != cjmVar3) {
                return null;
            }
        } else if (i != 1 || (cjmVar2 = (cjmVar = this.M).e) == null || cjmVar2.e != cjmVar) {
            return null;
        }
        return cjmVar2.d;
    }

    public final cjn n(int i) {
        cjm cjmVar;
        cjm cjmVar2;
        if (i == 0) {
            cjm cjmVar3 = this.J;
            cjmVar2 = cjmVar3.e;
            if (cjmVar2 == null || cjmVar2.e != cjmVar3) {
                return null;
            }
        } else if (i != 1 || (cjmVar2 = (cjmVar = this.K).e) == null || cjmVar2.e != cjmVar) {
            return null;
        }
        return cjmVar2.d;
    }

    public final ckh o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(cjo cjoVar, cjf cjfVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            cjs.a(cjoVar, cjfVar, this);
            hashSet.remove(this);
            b(cjfVar, cjoVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((cjm) it.next()).d.p(cjoVar, cjfVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((cjm) it2.next()).d.p(cjoVar, cjfVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((cjm) it3.next()).d.p(cjoVar, cjfVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((cjm) it4.next()).d.p(cjoVar, cjfVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((cjm) it5.next()).d.p(cjoVar, cjfVar, hashSet, 1, true);
            }
        }
    }

    public final void q(cjf cjfVar) {
        cjfVar.b(this.J);
        cjfVar.b(this.K);
        cjfVar.b(this.L);
        cjfVar.b(this.M);
        if (this.ab > 0) {
            cjfVar.b(this.N);
        }
    }

    public final void r() {
        if (this.h == null) {
            this.h = new cke(this);
        }
        if (this.i == null) {
            this.i = new ckf(this);
        }
    }

    public void s() {
        this.J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.U = null;
        this.E = Float.NaN;
        this.V = 0;
        this.W = 0;
        this.X = 0.0f;
        this.Y = -1;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.5f;
        this.af = 0.5f;
        int[] iArr = this.aq;
        iArr[0] = 1;
        iArr[1] = 1;
        this.ag = null;
        this.ah = 0;
        this.aj = 0;
        this.ak = 0;
        float[] fArr = this.al;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.a = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cjm cjmVar = (cjm) arrayList.get(i);
            cjmVar.c = false;
            cjmVar.b = 0;
        }
    }

    public String toString() {
        String str = "";
        StringBuilder sb = new StringBuilder("");
        if (this.ai != null) {
            str = "id: " + this.ai + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(this.aa);
        sb.append(") - (");
        sb.append(this.V);
        sb.append(" x ");
        sb.append(this.W);
        sb.append(")");
        return sb.toString();
    }

    public final void u(int i) {
        this.ab = i;
        this.F = i > 0;
    }

    public final void v(int i, int i2) {
        if (this.b) {
            return;
        }
        this.J.e(i);
        this.L.e(i2);
        this.Z = i;
        this.V = i2 - i;
        this.b = true;
    }

    public final void w(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.aa = i;
        this.W = i2 - i;
        if (this.F) {
            this.N.e(i + this.ab);
        }
        this.m = true;
    }

    public final void x(int i) {
        this.W = i;
        int i2 = this.ad;
        if (i < i2) {
            this.W = i2;
        }
    }

    protected final void y(int i, boolean z) {
        this.T[i] = z;
    }

    public final void z(int i, int i2) {
        this.H = i;
        this.I = i2;
        this.a = false;
    }
}
