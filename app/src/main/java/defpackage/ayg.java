package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayg implements ayc {
    public bqs B;
    private final Set C;
    private bac E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private int J;
    private final ArrayList K;
    private axq L;
    private bbv M;
    private final bhv N;
    private bht O;
    private ym Q;
    private final bhe R;
    public final axr a;
    public final ayk b;
    public final baw c;
    public final bbt d;
    public final bbt e;
    public int[] f;
    public boolean g;
    public boolean i;
    public boolean j;
    public int l;
    public boolean m;
    public boolean n;
    public bav o;
    public baw p;
    public baz q;
    public boolean r;
    public bbt s;
    public final bbu t;
    public final uhf u;
    public boolean v;
    public long w;
    public final ayn x;
    public bfk y;
    public yq z;
    private final ArrayList D = new ArrayList();
    private final lwm S = new lwm(null);
    public final List h = new ArrayList();
    private final lwm T = new lwm(null);
    private bfk P = bfk.d;
    public final lwm A = new lwm(null);
    public int k = -1;

    public ayg(axr axrVar, ayk aykVar, baw bawVar, Set set, bbt bbtVar, bbt bbtVar2, ayn aynVar) {
        this.a = axrVar;
        this.b = aykVar;
        this.c = bawVar;
        this.C = set;
        this.d = bbtVar;
        this.e = bbtVar2;
        this.x = aynVar;
        this.m = aykVar.m() || aykVar.k();
        this.R = new bhe(this, 1);
        this.K = new ArrayList();
        bav bavVarB = bawVar.b();
        bavVarB.r();
        this.o = bavVarB;
        baw bawVar2 = new baw();
        if (aykVar.m()) {
            bawVar2.e();
        }
        if (aykVar.k()) {
            bawVar2.d();
        }
        this.p = bawVar2;
        baz bazVarC = bawVar2.c();
        bazVarC.z(true);
        this.q = bazVarC;
        this.t = new bbu(this, bbtVar);
        bav bavVarB2 = this.p.b();
        try {
            axq axqVarG = bavVarB2.g(0);
            bavVarB2.r();
            this.L = axqVarG;
            this.M = new bbv();
            this.N = new bhv(this);
            uhf uhfVarC = aykVar.c();
            uhf uhfVarP = P();
            this.u = uhfVarC.plus(uhfVarP == null ? uhg.a : uhfVarP);
        } catch (Throwable th) {
            bavVarB2.r();
            throw th;
        }
    }

    private final void aA() {
        bav bavVar = this.o;
        int i = bavVar.h;
        this.G = i >= 0 ? bavVar.b[(i * 5) + 1] & 67108863 : 0;
        bavVar.u();
    }

    private final void aB(int i) {
        aa(i, null, 0, null);
    }

    private final void aC(boolean z, Object obj) {
        if (z) {
            bav bavVar = this.o;
            if (bavVar.i <= 0) {
                if ((bavVar.b[(bavVar.f * 5) + 1] & 1073741824) == 0) {
                    bad.a("Expected a node group");
                }
                bavVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.o.h() != obj) {
            bbu bbuVar = this.t;
            bbuVar.j(false);
            bdk bdkVar = bbuVar.a.a;
            bdkVar.h(bda.a);
            bdj.a(bdkVar, 0, obj);
        }
        this.o.v();
    }

    private final void aD(int i, int i2) {
        int iN = N(i);
        if (iN != i2) {
            ArrayList arrayList = this.D;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN2 = N(i) + (i2 - iN);
                ad(i, iN2);
                int i3 = size;
                while (true) {
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    bac bacVar = (bac) arrayList.get(i3);
                    if (bacVar != null && bacVar.d(i, iN2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                if (i < 0) {
                    i = this.o.h;
                } else if (this.o.B(i)) {
                    return;
                } else {
                    i = this.o.e(i);
                }
            }
        }
    }

    private final void aE(Object obj) {
        Q();
        ae(obj);
    }

    private final void aG() {
        if (this.I) {
            ayi.i("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final bfk aH(int i) {
        bfk bfkVar;
        if (this.v && this.r) {
            int iL = this.q.q;
            while (iL > 0) {
                if (this.q.i(iL) == 202 && a.ao(this.q.u(iL), ayi.c)) {
                    Object objT = this.q.t(iL);
                    objT.getClass();
                    bfk bfkVar2 = (bfk) objT;
                    this.y = bfkVar2;
                    return bfkVar2;
                }
                iL = this.q.l(iL);
            }
        }
        if (this.o.c > 0) {
            while (i > 0) {
                if (this.o.b(i) == 202 && a.ao(this.o.m(i), ayi.c)) {
                    yq yqVar = this.z;
                    if (yqVar == null || (bfkVar = (bfk) yqVar.a(i)) == null) {
                        Object objJ = this.o.j(i);
                        objJ.getClass();
                        bfkVar = (bfk) objJ;
                    }
                    this.y = bfkVar;
                    return bfkVar;
                }
                i = this.o.e(i);
            }
        }
        bfk bfkVar3 = this.P;
        this.y = bfkVar3;
        return bfkVar3;
    }

    private static final int aI(int i) {
        return (-2) - i;
    }

    private final int an(int i) {
        int iE = this.o.e(i) + 1;
        int i2 = 0;
        while (iE < i) {
            if (!this.o.z(iE)) {
                i2++;
            }
            iE += this.o.c(iE);
        }
        return i2;
    }

    private static final int ao(ayg aygVar, int i, int i2, boolean z, int i3) {
        bav bavVar = aygVar.o;
        if (!bavVar.y(i2)) {
            if (!bavVar.w(i2)) {
                if (bavVar.B(i2)) {
                    return 1;
                }
                return bavVar.d(i2);
            }
            int iC = bavVar.c(i2) + i2;
            int iAo = 0;
            for (int iC2 = i2 + 1; iC2 < iC; iC2 += bavVar.c(iC2)) {
                boolean zB = bavVar.B(iC2);
                if (zB) {
                    bbu bbuVar = aygVar.t;
                    bbuVar.i();
                    bbuVar.d(bavVar.o(iC2));
                }
                iAo += ao(aygVar, i, iC2, zB || z, zB ? 0 : i3 + iAo);
                if (zB) {
                    bbu bbuVar2 = aygVar.t;
                    bbuVar2.i();
                    bbuVar2.f();
                }
            }
            if (bavVar.B(i2)) {
                return 1;
            }
            return iAo;
        }
        int iB = bavVar.b(i2);
        Object objM = bavVar.m(i2);
        if (iB == 126665345) {
            if (objM instanceof azp) {
                azq azqVarAp = ap(aygVar, i2);
                if (azqVarAp != null) {
                    ayk aykVar = aygVar.b;
                    aykVar.d(azqVarAp);
                    bbu bbuVar3 = aygVar.t;
                    bbuVar3.k();
                    ayn aynVar = aygVar.x;
                    bdk bdkVar = bbuVar3.a.a;
                    bdkVar.h(bcq.a);
                    bdj.c(bdkVar, aynVar, aykVar, azqVarAp);
                }
                if (!z || i2 == i) {
                    return bavVar.d(i2);
                }
                bbu bbuVar4 = aygVar.t;
                bbuVar4.i();
                bbuVar4.g();
                int iD = bbuVar4.a().B(i2) ? 1 : bbuVar4.a().d(i2);
                if (iD <= 0) {
                    return 0;
                }
                bbuVar4.l(i3, iD);
                return 0;
            }
        } else if (iB == 206 && a.ao(objM, ayi.e)) {
            Object objL = bavVar.l(i2, 0);
            aye ayeVar = objL instanceof aye ? (aye) objL : null;
            if (ayeVar != null) {
                for (ayg aygVar2 : ayeVar.a.a) {
                    baw bawVar = aygVar2.c;
                    if (bawVar.b > 0 && (bawVar.a[1] & 67108864) != 0) {
                        ayn aynVar2 = aygVar2.x;
                        synchronized (aynVar2.b) {
                            Object andSet = aynVar2.a.getAndSet(ufy.a);
                            if (!a.ao(andSet, ayo.a) && andSet != null) {
                                if (andSet instanceof Set) {
                                    aynVar2.f((Set) andSet, false);
                                } else {
                                    if (!(andSet instanceof Object[])) {
                                        AtomicReference atomicReference = aynVar2.a;
                                        Objects.toString(atomicReference);
                                        ayi.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                                        throw new uer();
                                    }
                                    for (Set set : (Set[]) andSet) {
                                        aynVar2.f(set, false);
                                    }
                                }
                            }
                            zu zuVarP = aynVar2.p();
                            try {
                                aynVar2.h.ak(zuVarP);
                            } catch (Throwable th) {
                                aynVar2.l = zuVarP;
                                throw th;
                            }
                        }
                        bbt bbtVar = new bbt();
                        aygVar2.s = bbtVar;
                        bav bavVarB = bawVar.b();
                        try {
                            aygVar2.o = bavVarB;
                            bbu bbuVar5 = aygVar2.t;
                            bbt bbtVar2 = bbuVar5.a;
                            try {
                                bbuVar5.a = bbtVar;
                                aygVar2.ay(0);
                                bbuVar5.g();
                                if (bbuVar5.b) {
                                    bbuVar5.m();
                                    bbuVar5.b();
                                }
                            } finally {
                            }
                        } finally {
                            bavVarB.r();
                        }
                    }
                    aygVar.b.q(aygVar2.x);
                }
            }
            return bavVar.d(i2);
        }
        if (bavVar.B(i2)) {
            return 1;
        }
        return bavVar.d(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.azq ap(defpackage.ayg r13, int r14) {
        /*
            bav r0 = r13.o
            int r0 = r0.b(r14)
            bav r1 = r13.o
            java.lang.Object r1 = r1.m(r14)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L88
            boolean r0 = r1 instanceof defpackage.azp
            if (r0 == 0) goto L88
            bav r0 = r13.o
            boolean r0 = r0.w(r14)
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            az(r13, r0, r14)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r12 = r0
            goto L30
        L2f:
            r12 = r3
        L30:
            bav r0 = r13.o
            java.lang.Object r0 = r0.m(r14)
            r0.getClass()
            r5 = r0
            azp r5 = (defpackage.azp) r5
            bav r0 = r13.o
            r1 = 0
            java.lang.Object r6 = r0.l(r14, r1)
            bav r0 = r13.o
            axq r9 = r0.g(r14)
            bav r0 = r13.o
            int r0 = r0.c(r14)
            int r0 = r0 + r14
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r1 = r13.h
            int r2 = defpackage.ayi.c(r1, r14)
        L5b:
            int r3 = r1.size()
            if (r2 >= r3) goto L7a
            java.lang.Object r3 = r1.get(r2)
            azf r3 = (defpackage.azf) r3
            int r4 = r3.b
            if (r4 >= r0) goto L7a
            bai r4 = r3.a
            java.lang.Object r3 = r3.c
            uev r7 = new uev
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L5b
        L7a:
            ayn r7 = r13.x
            baw r8 = r13.c
            azq r4 = new azq
            bfk r11 = r13.aH(r14)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.ap(ayg, int):azq");
    }

    private final void aq(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        aq(this.o.e(i), i2);
        if (this.o.B(i)) {
            this.t.d(this.o.o(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f0  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ar(boolean r38) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.ar(boolean):void");
    }

    private final void as() {
        if (this.q.r) {
            baz bazVarC = this.p.c();
            this.q = bazVarC;
            bazVarC.J();
            this.r = false;
            this.y = null;
        }
    }

    private final void at(boolean z, bac bacVar) {
        this.D.add(this.E);
        this.E = bacVar;
        lwm lwmVar = this.S;
        lwmVar.e(this.G);
        lwmVar.e(this.H);
        lwmVar.e(this.F);
        if (z) {
            this.F = 0;
        }
        this.G = 0;
        this.H = 0;
    }

    private final void au() {
        baw bawVar = new baw();
        if (this.m) {
            bawVar.e();
        }
        if (this.b.k()) {
            bawVar.d();
        }
        this.p = bawVar;
        baz bazVarC = bawVar.c();
        bazVarC.z(true);
        this.q = bazVarC;
    }

    private final void aw() {
        ay(this.o.f);
        bbu bbuVar = this.t;
        bbuVar.h();
        bbuVar.a.a.h(bcs.a);
        int i = bbuVar.d;
        bav bavVarA = bbuVar.a();
        bbuVar.d = i + bay.a(bavVarA.b, bavVarA.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ax(int r7, int r8, int r9) {
        /*
            r6 = this;
            bav r0 = r6.o
            if (r7 != r8) goto L5
            goto L17
        L5:
            if (r7 == r9) goto L55
            if (r8 == r9) goto L55
            int r1 = r0.e(r7)
            if (r1 != r8) goto L11
            r9 = r8
            goto L55
        L11:
            int r1 = r0.e(r8)
            if (r1 != r7) goto L19
        L17:
            r9 = r7
            goto L55
        L19:
            int r1 = r0.e(r7)
            int r2 = r0.e(r8)
            if (r1 != r2) goto L28
            int r9 = r0.e(r7)
            goto L55
        L28:
            int r1 = defpackage.ayi.b(r0, r7, r9)
            int r9 = defpackage.ayi.b(r0, r8, r9)
            int r2 = r1 - r9
            r3 = 0
            r5 = r7
            r4 = r3
        L35:
            if (r4 >= r2) goto L3e
            int r5 = r0.e(r5)
            int r4 = r4 + 1
            goto L35
        L3e:
            int r9 = r9 - r1
            r1 = r8
        L40:
            if (r3 >= r9) goto L49
            int r1 = r0.e(r1)
            int r3 = r3 + 1
            goto L40
        L49:
            if (r5 == r1) goto L54
            int r5 = r0.e(r5)
            int r1 = r0.e(r1)
            goto L49
        L54:
            r9 = r5
        L55:
            if (r7 <= 0) goto L69
            if (r7 == r9) goto L69
            boolean r1 = r0.B(r7)
            if (r1 == 0) goto L64
            bbu r1 = r6.t
            r1.f()
        L64:
            int r7 = r0.e(r7)
            goto L55
        L69:
            r6.aq(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.ax(int, int, int):void");
    }

    private final void ay(int i) {
        boolean zB = this.o.B(i);
        if (zB) {
            bbu bbuVar = this.t;
            bbuVar.i();
            bbuVar.d(this.o.o(i));
        }
        ao(this, i, i, zB, 0);
        bbu bbuVar2 = this.t;
        bbuVar2.i();
        if (zB) {
            bbuVar2.f();
        }
    }

    private static final void az(ayg aygVar, List list, int i) {
        int iC = aygVar.o.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (aygVar.o.y(iC2)) {
                azq azqVarAp = ap(aygVar, iC2);
                if (azqVarAp != null) {
                    list.add(azqVarAp);
                }
            } else if (aygVar.o.w(iC2)) {
                az(aygVar, list, iC2);
            }
            iC2 += aygVar.o.c(iC2);
        }
    }

    @Override // defpackage.ayc
    public final boolean A(long j) {
        Object objQ = Q();
        if ((objQ instanceof Long) && j == ((Number) objQ).longValue()) {
            return false;
        }
        ae(Long.valueOf(j));
        return true;
    }

    @Override // defpackage.ayc
    public final boolean B(Object obj) {
        if (a.ao(Q(), obj)) {
            return false;
        }
        ae(obj);
        return true;
    }

    @Override // defpackage.ayc
    public final boolean C(boolean z) {
        Object objQ = Q();
        if ((objQ instanceof Boolean) && z == ((Boolean) objQ).booleanValue()) {
            return false;
        }
        ae(Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.ayc
    public final boolean D(Object obj) {
        if (Q() == obj) {
            return false;
        }
        ae(obj);
        return true;
    }

    @Override // defpackage.ayc
    public final boolean E() {
        if (!G() || this.i) {
            return true;
        }
        bai baiVarO = O();
        return (baiVarO == null || (baiVarO.a & 4) == 0) ? false : true;
    }

    @Override // defpackage.ayc
    public final boolean F() {
        return this.v;
    }

    @Override // defpackage.ayc
    public final boolean G() {
        bai baiVarO;
        return (this.v || this.j || this.i || (baiVarO = O()) == null || (baiVarO.a & 8) != 0) ? false : true;
    }

    @Override // defpackage.ayc
    public final boolean H(boolean z, int i) {
        return (i == 0 && (this.v || this.j)) || z || !G();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[EDGE_INSN: B:54:0x0070->B:29:0x0070 BREAK  A[LOOP:0: B:15:0x0030->B:28:0x006d], EDGE_INSN: B:55:0x0070->B:29:0x0070 BREAK  A[LOOP:0: B:15:0x0030->B:28:0x006d]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // defpackage.ayc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bai I() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.I():bai");
    }

    @Override // defpackage.ayc
    public final void J() {
        aa(1219399079, null, 0, null);
    }

    @Override // defpackage.ayc
    public final void K(Object obj) {
        if (!this.v && this.o.a() == 207 && !a.ao(this.o.h(), obj) && this.k < 0) {
            this.k = this.o.f;
            this.j = true;
        }
        aa(207, null, 0, obj);
    }

    @Override // defpackage.ayc
    public final void L() {
    }

    @Override // defpackage.ayc
    public final bfk M() {
        return ag();
    }

    public final int N(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.o.d(i) : i2;
        }
        ym ymVar = this.Q;
        if (ymVar == null || ymVar.a(i) < 0) {
            return 0;
        }
        int iA = ymVar.a(i);
        if (iA < 0) {
            a.bo(a.bv(i, "Cannot find value for key "));
        }
        return ymVar.c[iA];
    }

    public final bai O() {
        if (this.l != 0) {
            return null;
        }
        ArrayList arrayList = this.K;
        if (bbn.b(arrayList)) {
            return (bai) arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public final bhv P() {
        if (this.m) {
            return this.N;
        }
        return null;
    }

    public final Object Q() {
        if (this.v) {
            aG();
            return ayb.a;
        }
        Object objN = this.o.n();
        return (!this.j || (objN instanceof aye)) ? objN : ayb.a;
    }

    public final Object R() {
        if (this.v) {
            aG();
            return ayb.a;
        }
        Object objN = this.o.n();
        return (!this.j || (objN instanceof aye)) ? objN instanceof bar ? ((bar) objN).a : objN : ayb.a;
    }

    public final List S() {
        RandomAccess arrayList;
        if (!this.m) {
            return ufw.a;
        }
        ArrayList arrayList2 = new ArrayList();
        baz bazVar = this.q;
        arrayList2.addAll(bad.m(bazVar, bazVar.o, null));
        bav bavVar = this.o;
        if (bavVar.e || bavVar.c == 0) {
            arrayList = ufw.a;
        } else {
            arrayList = new ArrayList();
            int iE = bavVar.h;
            Object objValueOf = Integer.valueOf(bavVar.j - bay.e(bavVar.b, iE));
            while (iE >= 0) {
                bad.n(bavVar.a.h(iE), objValueOf);
                objValueOf = bavVar.g(iE);
                iE = bavVar.e(iE);
            }
        }
        arrayList2.addAll(arrayList);
        arrayList2.addAll(T());
        return arrayList2;
    }

    public final List T() {
        ayk aykVar = this.b;
        ayj ayjVarB = aykVar.b();
        if (true != (ayjVarB instanceof ayn)) {
            ayjVarB = null;
        }
        if (ayjVarB == null) {
            return ufw.a;
        }
        ayn aynVar = (ayn) ayjVarB;
        bav bavVarB = aynVar.d.b();
        try {
            Integer numJ = bad.j(bavVarB, aykVar, 0, bavVarB.c);
            if (numJ == null) {
                return ufw.a;
            }
            try {
                return bad.k(aynVar.d.b(), numJ.intValue(), 0);
            } finally {
            }
        } finally {
        }
    }

    public final void U() {
        V();
        this.D.clear();
        this.S.d();
        this.T.d();
        this.A.d();
        this.z = null;
        bbv bbvVar = this.M;
        bbvVar.b.g();
        bbvVar.a.g();
        this.w = 0L;
        this.l = 0;
        this.I = false;
        this.v = false;
        this.j = false;
        this.n = false;
        this.k = -1;
        bav bavVar = this.o;
        if (!bavVar.e) {
            bavVar.r();
        }
        if (this.q.r) {
            return;
        }
        au();
    }

    public final void V() {
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.w = 0L;
        this.I = false;
        bbu bbuVar = this.t;
        bbuVar.b = false;
        bbuVar.h.d();
        bbuVar.d = 0;
        this.K.clear();
        this.f = null;
        this.Q = null;
    }

    public final void W() {
        if (!this.q.r) {
            ayi.i("Check failed");
        }
        au();
    }

    public final void X() {
        this.K.clear();
        this.h.clear();
        this.d.g();
        this.z = null;
    }

    public final void Y() {
        ar(false);
    }

    public final void Z() {
        this.G += this.o.f();
    }

    @Override // defpackage.ayc
    public final /* synthetic */ int a() {
        return a.r(this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void aa(int i, Object obj, int i2, Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        bac bacVar;
        boolean z;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        long[] jArr3;
        char c;
        long[] jArr4;
        char c2;
        int i7;
        long jRotateLeft;
        Object obj3 = obj;
        aG();
        int i8 = this.H;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!a.ao(obj2, ayb.a)) {
                        jRotateLeft = Long.rotateLeft(this.w, 3) ^ obj2.hashCode();
                    }
                    this.w = Long.rotateLeft(jRotateLeft, 3) ^ j2;
                }
                jRotateLeft = Long.rotateLeft(this.w, 3) ^ i3;
                this.w = Long.rotateLeft(jRotateLeft, 3) ^ j2;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = Long.rotateLeft(this.w, 3) ^ i3;
            this.w = Long.rotateLeft(jRotateLeft, 3) ^ j2;
        } else {
            if (obj3 instanceof Enum) {
                iHashCode = ((Enum) obj3).ordinal();
                j = this.w;
            } else {
                iHashCode = obj3.hashCode();
                j = this.w;
            }
            this.w = Long.rotateLeft(Long.rotateLeft(j, 3) ^ iHashCode, 3);
            i3 = i;
        }
        int i9 = 1;
        boolean z2 = true;
        if (obj3 == null) {
            this.H++;
        }
        boolean z3 = i2 != 0;
        int i10 = -1;
        if (this.v) {
            this.o.q();
            baz bazVar = this.q;
            int i11 = bazVar.o;
            if (z3) {
                bazVar.N(i3, ayb.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = ayb.a;
                    }
                    bazVar.K(i3, obj3, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = ayb.a;
                    }
                    bazVar.M(i3, obj3);
                }
                z2 = false;
            }
            bac bacVar2 = this.E;
            if (bacVar2 != null) {
                azh azhVar = new azh(i3, -1, aI(i11), -1);
                bacVar2.c(azhVar, this.F - bacVar2.b);
                bacVar2.e(azhVar);
            }
            at(z2, null);
            return;
        }
        byte b = i2 == 1 && this.j;
        if (this.E == null) {
            int iA = this.o.a();
            if (b != true && iA == i3 && a.ao(obj3, this.o.i())) {
                aC(z3, obj2);
                i4 = -1;
            } else {
                bav bavVar = this.o;
                ArrayList arrayList = new ArrayList();
                if (bavVar.i <= 0) {
                    int iA2 = bavVar.f;
                    while (iA2 < bavVar.g) {
                        int[] iArr = bavVar.b;
                        int i12 = iA2 * 5;
                        int i13 = i10;
                        int i14 = iArr[i12];
                        Object objP = bavVar.p(iArr, iA2);
                        int i15 = iArr[i12 + 1];
                        if ((i15 & 1073741824) == 0) {
                            i9 = i15 & 67108863;
                        }
                        arrayList.add(new azh(i14, objP, iA2, i9));
                        iA2 += bay.a(iArr, iA2);
                        i10 = i13;
                        i9 = 1;
                    }
                }
                i4 = i10;
                this.E = new bac(arrayList, this.F);
            }
        } else {
            i4 = -1;
        }
        bac bacVar3 = this.E;
        if (bacVar3 != null) {
            Object azgVar = obj3 != null ? new azg(Integer.valueOf(i3), obj3) : Integer.valueOf(i3);
            zu zuVar = ((bdl) bacVar3.e.a()).a;
            Object objA = zuVar.a(azgVar);
            if (objA == null) {
                objA = null;
            } else if (objA instanceof zo) {
                zo zoVar = (zo) objA;
                Object objH = zoVar.h(0);
                if (zoVar.f()) {
                    zuVar.g(azgVar);
                }
                if (zoVar.b == 1) {
                    zuVar.j(azgVar, zoVar.b());
                }
                objA = objH;
            } else {
                zuVar.g(azgVar);
            }
            azh azhVar2 = (azh) objA;
            if (b == true || azhVar2 == null) {
                boolean z4 = z3;
                this.o.q();
                boolean z5 = true;
                this.v = true;
                this.y = null;
                as();
                this.q.y();
                baz bazVar2 = this.q;
                int i16 = bazVar2.o;
                if (z4) {
                    bazVar2.N(i3, ayb.a);
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = ayb.a;
                        }
                        bazVar2.K(i3, obj3, obj2);
                    } else {
                        if (obj3 == null) {
                            obj3 = ayb.a;
                        }
                        bazVar2.M(i3, obj3);
                    }
                    z5 = false;
                }
                this.L = this.q.r(i16);
                azh azhVar3 = new azh(i3, Integer.valueOf(i4), aI(i16), i4);
                bacVar3.c(azhVar3, this.F - bacVar3.b);
                bacVar3.e(azhVar3);
                bacVar = new bac(new ArrayList(), z5 ? 0 : this.F);
                z3 = z5;
            } else {
                bacVar3.e(azhVar2);
                this.F = bacVar3.a(azhVar2) + bacVar3.b;
                yq yqVar = bacVar3.f;
                int i17 = azhVar2.c;
                azd azdVar = (azd) yqVar.a(i17);
                int i18 = azdVar != null ? azdVar.a : i4;
                int i19 = bacVar3.c;
                int i20 = i18 - i19;
                if (i18 > i19) {
                    Object[] objArr = yqVar.c;
                    long[] jArr5 = yqVar.a;
                    int length = jArr5.length - 2;
                    if (length >= 0) {
                        int i21 = 0;
                        char c3 = 7;
                        while (true) {
                            long j3 = jArr5[i21];
                            z = z3;
                            if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length)) >>> 31);
                                int i23 = 0;
                                while (i23 < i22) {
                                    if ((j3 & 255) < 128) {
                                        c2 = c3;
                                        azd azdVar2 = (azd) objArr[(i21 << 3) + i23];
                                        jArr4 = jArr5;
                                        int i24 = azdVar2.a;
                                        if (i24 == i18) {
                                            azdVar2.a = i19;
                                        } else if (i19 <= i24 && i24 < i18) {
                                            azdVar2.a = i24 + 1;
                                        }
                                    } else {
                                        jArr4 = jArr5;
                                        c2 = c3;
                                    }
                                    j3 >>= 8;
                                    i23++;
                                    jArr5 = jArr4;
                                    c3 = c2;
                                }
                                jArr3 = jArr5;
                                c = c3;
                                if (i22 != 8) {
                                    break;
                                }
                            } else {
                                jArr3 = jArr5;
                                c = c3;
                            }
                            if (i21 == length) {
                                break;
                            }
                            i21++;
                            z3 = z;
                            jArr5 = jArr3;
                            c3 = c;
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    if (i19 > i18) {
                        Object[] objArr2 = yqVar.c;
                        long[] jArr6 = yqVar.a;
                        int length2 = jArr6.length - 2;
                        if (length2 >= 0) {
                            int i25 = 0;
                            while (true) {
                                long j4 = jArr6[i25];
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        if ((j4 & 255) < 128) {
                                            azd azdVar3 = (azd) objArr2[(i25 << 3) + i27];
                                            jArr2 = jArr6;
                                            int i28 = azdVar3.a;
                                            if (i28 == i18) {
                                                azdVar3.a = i19;
                                            } else {
                                                i6 = i18;
                                                if (i6 + 1 <= i28 && i28 < i19) {
                                                    azdVar3.a = i28 - 1;
                                                }
                                                j4 >>= 8;
                                                i27++;
                                                jArr6 = jArr2;
                                                i18 = i6;
                                            }
                                        } else {
                                            jArr2 = jArr6;
                                        }
                                        i6 = i18;
                                        j4 >>= 8;
                                        i27++;
                                        jArr6 = jArr2;
                                        i18 = i6;
                                    }
                                    jArr = jArr6;
                                    i5 = i18;
                                    if (i26 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr6;
                                    i5 = i18;
                                }
                                if (i25 == length2) {
                                    break;
                                }
                                i25++;
                                jArr6 = jArr;
                                i18 = i5;
                            }
                        }
                    }
                }
                bbu bbuVar = this.t;
                bbuVar.e(i17);
                this.o.t(i17);
                if (i20 > 0) {
                    bbuVar.h();
                    bdk bdkVar = bbuVar.a.a;
                    bdkVar.h(bcn.a);
                    bdkVar.c[bdkVar.d - bdkVar.a[bdkVar.b - 1].b] = i20;
                }
                aC(z, obj2);
                z3 = z;
                bacVar = null;
            }
        } else {
            bacVar = null;
        }
        at(z3, bacVar);
    }

    public final void ab(int i, Object obj) {
        aa(i, obj, 0, null);
    }

    public final void ac(Object obj) {
        int i;
        bav bavVar;
        int i2;
        baz bazVar;
        if (obj instanceof baq) {
            baq baqVar = (baq) obj;
            axq axqVarG = null;
            if (this.v) {
                baz bazVar2 = this.q;
                int i3 = bazVar2.o;
                if (i3 > bazVar2.q + 1) {
                    int i4 = i3 - 1;
                    int iL = bazVar2.l(i4);
                    while (true) {
                        i2 = i4;
                        i4 = iL;
                        bazVar = this.q;
                        if (i4 == bazVar.q || i4 < 0) {
                            break;
                        } else {
                            iL = bazVar.l(i4);
                        }
                    }
                    axqVarG = bazVar.r(i2);
                }
            } else {
                bav bavVar2 = this.o;
                int i5 = bavVar2.f;
                if (i5 > bavVar2.h + 1) {
                    int i6 = i5 - 1;
                    int iE = bavVar2.e(i6);
                    while (true) {
                        i = i6;
                        i6 = iE;
                        bavVar = this.o;
                        if (i6 == bavVar.h || i6 < 0) {
                            break;
                        } else {
                            iE = bavVar.e(i6);
                        }
                    }
                    axqVarG = bavVar.g(i);
                }
            }
            bar barVar = new bar(baqVar, axqVarG);
            if (this.v) {
                bdk bdkVar = this.t.a.a;
                bdkVar.h(bcr.a);
                bdj.a(bdkVar, 0, barVar);
            }
            this.C.add(obj);
            obj = barVar;
        }
        ae(obj);
    }

    public final void ad(int i, int i2) {
        if (N(i) != i2) {
            if (i < 0) {
                ym ymVar = this.Q;
                if (ymVar == null) {
                    ymVar = new ym((byte[]) null);
                    this.Q = ymVar;
                }
                ymVar.c(i, i2);
                return;
            }
            int[] iArr = this.f;
            if (iArr == null) {
                iArr = new int[this.o.c];
                Arrays.fill(iArr, 0, iArr.length, -1);
                this.f = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void ae(Object obj) {
        if (this.v) {
            this.q.Z(obj);
            return;
        }
        bav bavVar = this.o;
        if (!bavVar.l) {
            bbu bbuVar = this.t;
            axq axqVarG = bavVar.g(bavVar.h);
            bdk bdkVar = bbuVar.a.a;
            bdkVar.h(bbx.a);
            bdj.b(bdkVar, 0, axqVarG, 1, obj);
            return;
        }
        int iE = bavVar.j - bay.e(bavVar.b, bavVar.h);
        bbu bbuVar2 = this.t;
        int i = iE - 1;
        if (bbuVar2.a().h - bbuVar2.d >= 0) {
            bbuVar2.j(true);
            bdk bdkVar2 = bbuVar2.a.a;
            bdkVar2.h(bdc.a);
            bdj.a(bdkVar2, 0, obj);
            bdkVar2.c[bdkVar2.d - bdkVar2.a[bdkVar2.b - 1].b] = i;
            return;
        }
        bav bavVar2 = this.o;
        axq axqVarG2 = bavVar2.g(bavVar2.h);
        bdk bdkVar3 = bbuVar2.a.a;
        bdkVar3.h(bcz.a);
        bdj.b(bdkVar3, 0, obj, 1, axqVarG2);
        bdkVar3.c[bdkVar3.d - bdkVar3.a[bdkVar3.b - 1].b] = i;
    }

    public final boolean af(bai baiVar, Object obj) {
        axq axqVar = baiVar.c;
        if (axqVar == null) {
            return false;
        }
        int iA = this.o.a.a(axqVar);
        if (!this.n || iA < this.o.f) {
            return false;
        }
        List list = this.h;
        int iD = ayi.d(list, iA);
        if (iD < 0) {
            int i = iD + 1;
            if (true != (obj instanceof ayv)) {
                obj = null;
            }
            list.add(-i, new azf(baiVar, iA, obj));
        } else {
            azf azfVar = (azf) list.get(iD);
            if (obj instanceof ayv) {
                Object obj2 = azfVar.c;
                if (obj2 == null) {
                    azfVar.c = obj;
                } else if (obj2 instanceof zw) {
                    ((zw) obj2).j(obj);
                } else {
                    int i2 = zx.a;
                    zw zwVar = new zw(2);
                    zwVar.h(obj2);
                    zwVar.h(obj);
                    azfVar.c = zwVar;
                }
            } else {
                azfVar.c = null;
            }
        }
        return true;
    }

    public final bfk ag() {
        bfk bfkVar = this.y;
        return bfkVar != null ? bfkVar : aH(this.o.h);
    }

    public final bfk ah(bfk bfkVar, bfk bfkVar2) {
        bfj bfjVar = new bfj(bfkVar);
        bfjVar.putAll(bfkVar2);
        bfk bfkVarA = bfjVar.a();
        ab(204, ayi.d);
        aE(bfkVarA);
        aE(bfkVar2);
        Y();
        return bfkVarA;
    }

    public final void ai(bfk bfkVar) {
        yq yqVar = this.z;
        if (yqVar == null) {
            yqVar = new yq((byte[]) null);
            this.z = yqVar;
        }
        yqVar.f(this.o.f, bfkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: all -> 0x0240, TryCatch #0 {all -> 0x0240, blocks: (B:7:0x002c, B:9:0x005b, B:10:0x0061, B:12:0x0065, B:15:0x007c, B:17:0x0088, B:18:0x0092, B:21:0x00a5, B:22:0x00a8, B:69:0x01e3, B:71:0x0203, B:72:0x0208, B:74:0x0210, B:75:0x0215, B:80:0x0238, B:81:0x023f, B:14:0x006d, B:23:0x00ae, B:25:0x00b5, B:26:0x00c2, B:29:0x00c8, B:31:0x00d0, B:32:0x00e3, B:34:0x00eb, B:35:0x00f0, B:39:0x0109, B:41:0x0111, B:50:0x016e, B:54:0x017f, B:58:0x018e, B:60:0x0196, B:61:0x01a8, B:63:0x01ac, B:64:0x01bb, B:66:0x01bf, B:67:0x01d2, B:43:0x0129, B:44:0x013b, B:46:0x013f, B:47:0x0155, B:48:0x0158), top: B:91:0x002c, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aj(defpackage.zu r17, defpackage.uiu r18) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.aj(zu, uiu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ak(defpackage.zu r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L61
            r6 = 0
        L10:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            int r9 = r6 - r4
            r10 = 0
        L23:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]
            r11 = r3[r11]
            r13.getClass()
            bai r13 = (defpackage.bai) r13
            axq r14 = r13.c
            if (r14 == 0) goto L56
            java.util.List r15 = r0.h
            int r14 = r14.a
            bau r5 = defpackage.bau.a
            if (r11 != r5) goto L4e
            r11 = 0
        L4e:
            azf r5 = new azf
            r5.<init>(r13, r14, r11)
            r15.add(r5)
        L56:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L23
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r6 == r4) goto L61
            int r6 = r6 + 1
            goto L10
        L61:
            java.util.List r0 = r0.h
            java.util.Comparator r1 = defpackage.ayi.f
            defpackage.ske.bs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.ak(zu):void");
    }

    public final void al(azp azpVar, bfk bfkVar, Object obj) {
        t(126665345, azpVar);
        aE(obj);
        long j = this.w;
        try {
            this.w = 126665345L;
            if (this.v) {
                baz.X(this.q);
            }
            boolean z = (this.v || a.ao(this.o.h(), bfkVar)) ? false : true;
            if (z) {
                ai(bfkVar);
            }
            aa(202, ayi.c, 0, bfkVar);
            this.y = null;
            boolean z2 = this.i;
            this.i = z;
            bdq.f(this, new bfh(316014703, true, new arv(2)));
            this.i = z2;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x0050, B:25:0x0051, B:27:0x0057, B:20:0x0042), top: B:35:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void am(defpackage.ayn r9, defpackage.ayn r10, java.lang.Integer r11, java.util.List r12, defpackage.uif r13) {
        /*
            r8 = this;
            boolean r0 = r8.n
            int r1 = r8.F
            r2 = 1
            r8.n = r2     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r8.F = r2     // Catch: java.lang.Throwable -> L5f
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L5f
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2a
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L5f
            uev r6 = (defpackage.uev) r6     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L5f
            bai r7 = (defpackage.bai) r7     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L24
            r8.af(r7, r6)     // Catch: java.lang.Throwable -> L5f
            goto L27
        L24:
            r8.af(r7, r5)     // Catch: java.lang.Throwable -> L5f
        L27:
            int r4 = r4 + 1
            goto Lf
        L2a:
            if (r9 == 0) goto L57
            if (r11 == 0) goto L33
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L5f
            goto L34
        L33:
            r11 = -1
        L34:
            if (r10 == 0) goto L51
            boolean r12 = defpackage.a.ao(r10, r9)     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L51
            if (r11 < 0) goto L51
            r9.e = r10     // Catch: java.lang.Throwable -> L5f
            r9.f = r11     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L4b
            r9.e = r5     // Catch: java.lang.Throwable -> L5f
            r9.f = r2     // Catch: java.lang.Throwable -> L5f
            goto L55
        L4b:
            r10 = move-exception
            r9.e = r5     // Catch: java.lang.Throwable -> L5f
            r9.f = r2     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L51:
            java.lang.Object r10 = r13.a()     // Catch: java.lang.Throwable -> L5f
        L55:
            if (r10 != 0) goto L5a
        L57:
            r13.a()     // Catch: java.lang.Throwable -> L5f
        L5a:
            r8.n = r0
            r8.F = r1
            return
        L5f:
            r9 = move-exception
            r8.n = r0
            r8.F = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.am(ayn, ayn, java.lang.Integer, java.util.List, uif):void");
    }

    @Override // defpackage.ayc
    public final long b() {
        return this.w;
    }

    @Override // defpackage.ayc
    public final ayc c(int i) {
        bai baiVar;
        boolean z;
        u(i);
        if (this.v) {
            bai baiVar2 = new bai(this.x);
            this.K.add(baiVar2);
            ae(baiVar2);
            baiVar2.h(this.J);
            return this;
        }
        azf azfVarF = ayi.f(this.h, this.o.h);
        Object objN = this.o.n();
        if (a.ao(objN, ayb.a)) {
            baiVar = new bai(this.x);
            ae(baiVar);
        } else {
            objN.getClass();
            baiVar = (bai) objN;
        }
        if (azfVarF == null) {
            int i2 = baiVar.a;
            if ((i2 & 64) != 0) {
                baiVar.a = i2 & (-65);
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        baiVar.d(z);
        this.K.add(baiVar);
        baiVar.h(this.J);
        int i3 = baiVar.a;
        if ((i3 & 256) != 0) {
            baiVar.a = i3 & (-257);
            baiVar.f(true);
            bdk bdkVar = this.t.a.a;
            bdkVar.h(bcx.a);
            bdj.a(bdkVar, 0, baiVar);
        }
        return this;
    }

    @Override // defpackage.ayc
    public final bht d() {
        bht bhtVar = this.O;
        if (bhtVar != null) {
            return bhtVar;
        }
        aym aymVar = new aym(this.x);
        this.O = aymVar;
        return aymVar;
    }

    @Override // defpackage.ayc
    public final Object e(ayp aypVar) {
        return bay.J(ag(), aypVar);
    }

    @Override // defpackage.ayc
    public final Object f() {
        return R();
    }

    @Override // defpackage.ayc
    public final uhf g() {
        return this.u;
    }

    @Override // defpackage.ayc
    public final void h(Object obj, uiu uiuVar) {
        if (this.v) {
            bdk bdkVar = this.M.a;
            bdkVar.h(bdb.a);
            bdj.a(bdkVar, 0, obj);
            uiuVar.getClass();
            ukc.e(uiuVar, 2);
            bdj.a(bdkVar, 1, uiuVar);
            return;
        }
        bbu bbuVar = this.t;
        bbuVar.g();
        bdk bdkVar2 = bbuVar.a.a;
        bdkVar2.h(bdb.a);
        uiuVar.getClass();
        ukc.e(uiuVar, 2);
        bdj.b(bdkVar2, 0, obj, 1, uiuVar);
    }

    @Override // defpackage.ayc
    public final void i() {
        this.g = true;
        this.m = true;
        this.c.e();
        this.p.e();
        baz bazVar = this.q;
        baw bawVar = bazVar.a;
        bazVar.e = bawVar.i;
        bazVar.s = bawVar.j;
    }

    @Override // defpackage.ayc
    public final void j(uif uifVar) {
        aF();
        if (!this.v) {
            ayi.i("createNode() can only be called when inserting");
        }
        int i = ((int[]) this.S.b)[r0.a - 1];
        baz bazVar = this.q;
        axq axqVarR = bazVar.r(bazVar.q);
        this.G++;
        bbv bbvVar = this.M;
        bdk bdkVar = bbvVar.a;
        bdkVar.h(bck.a);
        bdj.a(bdkVar, 0, uifVar);
        bdkVar.c[bdkVar.d - bdkVar.a[bdkVar.b - 1].b] = i;
        bdj.a(bdkVar, 1, axqVarR);
        bdk bdkVar2 = bbvVar.b;
        bdkVar2.h(bcp.a);
        bdkVar2.c[bdkVar2.d - bdkVar2.a[bdkVar2.b - 1].b] = i;
        bdj.a(bdkVar2, 0, axqVarR);
    }

    @Override // defpackage.ayc
    public final void k(boolean z) {
        if (this.G != 0) {
            ayi.i("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.v) {
            return;
        }
        if (!z) {
            aA();
            return;
        }
        bav bavVar = this.o;
        int i = bavVar.f;
        int i2 = bavVar.g;
        bbu bbuVar = this.t;
        bbuVar.j(false);
        bbuVar.a.a.h(bcb.a);
        ayi.j(this.h, i, i2);
        this.o.u();
    }

    @Override // defpackage.ayc
    public final void l() {
        Y();
        bai baiVarO = O();
        if (baiVarO == null || !baiVarO.k()) {
            return;
        }
        baiVarO.a |= 2;
    }

    @Override // defpackage.ayc
    public final void m() {
        ar(true);
    }

    @Override // defpackage.ayc
    public final void n() {
        Y();
    }

    @Override // defpackage.ayc
    public final void o() {
        Y();
    }

    @Override // defpackage.ayc
    public final void p() {
        if (this.j && this.o.h == this.k) {
            this.k = -1;
            this.j = false;
        }
        ar(false);
    }

    @Override // defpackage.ayc
    public final void q(uif uifVar) {
        bdk bdkVar = this.t.a.a;
        bdkVar.h(bcv.a);
        bdj.a(bdkVar, 0, uifVar);
    }

    @Override // defpackage.ayc
    public final void r() {
        if (this.G != 0) {
            ayi.i("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.v) {
            return;
        }
        bai baiVarO = O();
        if (baiVarO != null && !baiVarO.i()) {
            baiVarO.g(true);
        }
        if (this.h.isEmpty()) {
            aA();
        } else {
            av();
        }
    }

    @Override // defpackage.ayc
    public final void s() {
        aa(-127, null, 0, null);
    }

    @Override // defpackage.ayc
    public final void t(int i, Object obj) {
        aa(i, obj, 0, null);
    }

    @Override // defpackage.ayc
    public final void u(int i) {
        int i2;
        if (this.E != null) {
            aa(i, null, 0, null);
            return;
        }
        aG();
        this.w = Long.rotateLeft(Long.rotateLeft(this.w, 3) ^ i, 3) ^ this.H;
        this.H++;
        bav bavVar = this.o;
        if (this.v) {
            bavVar.q();
            this.q.M(i, ayb.a);
            at(false, null);
            return;
        }
        if (bavVar.a() == i && ((i2 = bavVar.f) >= bavVar.g || (bavVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            bavVar.v();
            at(false, null);
            return;
        }
        if (!bavVar.A()) {
            int i3 = this.F;
            int i4 = bavVar.f;
            aw();
            this.t.l(i3, bavVar.f());
            ayi.j(this.h, i4, bavVar.f);
        }
        bavVar.q();
        this.v = true;
        this.y = null;
        as();
        baz bazVar = this.q;
        bazVar.y();
        int i5 = bazVar.o;
        bazVar.M(i, ayb.a);
        this.L = bazVar.r(i5);
        at(false, null);
    }

    @Override // defpackage.ayc
    public final void v() {
        aa(125, null, 2, null);
        this.I = true;
    }

    @Override // defpackage.ayc
    public final void w(Object obj) {
        ac(obj);
    }

    @Override // defpackage.ayc
    public final void x() {
        aF();
        if (this.v) {
            ayi.i("useNode() called while inserting");
        }
        bav bavVar = this.o;
        Object objO = bavVar.o(bavVar.h);
        bbu bbuVar = this.t;
        bbuVar.d(objO);
        if (this.j && (objO instanceof axy)) {
            bbuVar.g();
            bbuVar.a.a.h(bde.a);
        }
    }

    @Override // defpackage.ayc
    public final boolean y(float f) {
        Object objQ = Q();
        if ((objQ instanceof Float) && f == ((Number) objQ).floatValue()) {
            return false;
        }
        ae(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.ayc
    public final boolean z(int i) {
        Object objQ = Q();
        if ((objQ instanceof Integer) && i == ((Number) objQ).intValue()) {
            return false;
        }
        ae(Integer.valueOf(i));
        return true;
    }

    private final void aF() {
        if (!this.I) {
            ayi.i(mPfBwqXsnpXI.yBQLTFbEmyP);
        }
        this.I = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (defpackage.bai.p((defpackage.ayv) r12, r5) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void av() {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayg.av():void");
    }
}
