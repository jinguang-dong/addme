package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwi extends bvt implements bsq, bry, bwt {
    public static final bwg q;
    public static final bwg r;
    public bku A;
    public boolean B;
    public bwq C;
    private boolean D;
    private chq E;
    private cib F;
    private bss H;
    private bke I;
    private bvc J;
    private uiu K;
    private bmz M;
    private zm N;
    private boolean h;
    public final bvm s;
    public boolean t;
    public boolean u;
    public bwi v;
    public bwi w;
    public uiq x;
    public bmz z;
    private static final uiq f = aau.l;
    public static final uiq o = aau.k;
    public static final blm p = new blm();
    private static final bvc g = new bvc();
    private float G = 0.8f;
    public long y = 0;
    private final uif L = new bol(this, 10);

    static {
        bld.d();
        q = new bwf(1);
        r = new bwf(0);
    }

    public bwi(bvm bvmVar) {
        this.s = bvmVar;
        this.E = bvmVar.o;
        this.F = bvmVar.p;
    }

    private final uiu C() {
        uiu uiuVar = this.K;
        if (uiuVar != null) {
            return uiuVar;
        }
        cam camVar = new cam(this, new bol(this, 9), 1);
        this.K = camVar;
        return camVar;
    }

    private final void D(bwi bwiVar, bke bkeVar, boolean z) {
        if (bwiVar == this) {
            return;
        }
        bwi bwiVar2 = this.w;
        if (bwiVar2 != null) {
            bwiVar2.D(bwiVar, bkeVar, z);
        }
        long j = this.y;
        float fA = chy.a(j);
        bkeVar.a -= fA;
        bkeVar.c -= fA;
        float fB = chy.b(j);
        bkeVar.b -= fB;
        bkeVar.d -= fB;
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            bwqVar.d(bkeVar, true);
            if (this.D && z) {
                long j2 = this.c;
                bkeVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    private final boolean aA(boolean z) {
        bws bwsVar;
        boolean z2 = false;
        if (this.M != null) {
            return false;
        }
        bwq bwqVar = this.C;
        if (bwqVar == null) {
            if (this.x != null) {
                bqs.c("null layer with a non-null layerBlock");
            }
            return false;
        }
        uiq uiqVar = this.x;
        if (uiqVar == null) {
            bqs.a("updateLayerParameters requires a non-null layerBlock");
            throw new uer();
        }
        blm blmVar = p;
        blmVar.s(1.0f);
        blmVar.t(1.0f);
        blmVar.l(1.0f);
        blmVar.y(0.0f);
        blmVar.z(0.0f);
        blmVar.u(0.0f);
        long j = bla.a;
        blmVar.m(j);
        blmVar.w(j);
        blmVar.r(0.0f);
        blmVar.o(8.0f);
        blmVar.x(blt.a);
        blmVar.v(bll.a);
        blmVar.p(false);
        blmVar.B();
        blmVar.A();
        blmVar.n(3);
        blmVar.q(0);
        blmVar.p = 9205357640488583168L;
        blmVar.t = null;
        blmVar.a = 0;
        bvm bvmVar = this.s;
        blmVar.q = bvmVar.o;
        blmVar.r = bvmVar.p;
        blmVar.p = chp.G(this.c);
        Y().d(this, f, new bol(uiqVar, 11));
        bvc bvcVar = this.J;
        if (bvcVar == null) {
            bvcVar = new bvc();
            this.J = bvcVar;
        }
        bvc bvcVar2 = g;
        bvcVar2.a = bvcVar.a;
        bvcVar2.b = bvcVar.b;
        bvcVar2.c = bvcVar.c;
        bvcVar2.d = bvcVar.d;
        bvcVar2.e = bvcVar.e;
        bvcVar2.f = bvcVar.f;
        bvcVar2.g = bvcVar.g;
        bvcVar.a = blmVar.b;
        bvcVar.b = blmVar.c;
        bvcVar.c = blmVar.e;
        bvcVar.d = blmVar.f;
        bvcVar.e = blmVar.j;
        bvcVar.f = blmVar.k;
        bvcVar.g = blmVar.l;
        bwqVar.i(blmVar);
        boolean z3 = this.D;
        boolean z4 = blmVar.n;
        this.D = z4;
        this.G = blmVar.d;
        if (bvcVar2.a == bvcVar.a && bvcVar2.b == bvcVar.b && bvcVar2.c == bvcVar.c && bvcVar2.d == bvcVar.d && bvcVar2.e == bvcVar.e && bvcVar2.f == bvcVar.f && a.q(bvcVar2.g, bvcVar.g)) {
            z2 = true;
        }
        boolean z5 = !z2;
        if (z && ((!z2 || z3 != z4) && (bwsVar = bvmVar.i) != null)) {
            bwsVar.i(bvmVar);
        }
        return z5;
    }

    private final long aB(bwi bwiVar, long j) {
        if (bwiVar == this) {
            return j;
        }
        bwi bwiVar2 = this.w;
        return (bwiVar2 == null || a.ao(bwiVar, bwiVar2)) ? as(j) : as(bwiVar2.aB(bwiVar, j));
    }

    private static final bwi aC(bry bryVar) {
        bwi bwiVarA;
        bsp bspVar = bryVar instanceof bsp ? (bsp) bryVar : null;
        if (bspVar != null && (bwiVarA = bspVar.a()) != null) {
            return bwiVarA;
        }
        bryVar.getClass();
        return (bwi) bryVar;
    }

    public static /* synthetic */ boolean aw(bwi bwiVar) {
        return bwiVar.aA(true);
    }

    private final void ay(bij bijVar, bwg bwgVar, long j, buy buyVar, int i, boolean z) {
        if (bijVar == null) {
            A(bwgVar, j, buyVar, i, z);
            return;
        }
        int i2 = buyVar.a;
        buyVar.d(i2 + 1, buyVar.a());
        buyVar.a++;
        buyVar.b.o(bijVar);
        buyVar.c.b(amo.s(-1.0f, z, false));
        ay(byi.o(bijVar, bwgVar.a()), bwgVar, j, buyVar, i, z);
        buyVar.a = i2;
    }

    private final void az(bij bijVar, bwg bwgVar, long j, buy buyVar, int i, boolean z, float f2) {
        if (bijVar == null) {
            A(bwgVar, j, buyVar, i, z);
            return;
        }
        int i2 = buyVar.a;
        buyVar.d(i2 + 1, buyVar.a());
        buyVar.a++;
        buyVar.b.o(bijVar);
        buyVar.c.b(amo.s(f2, z, false));
        ak(byi.o(bijVar, bwgVar.a()), bwgVar, j, buyVar, i, z, f2, true);
        buyVar.a = i2;
    }

    public void A(bwg bwgVar, long j, buy buyVar, int i, boolean z) {
        bwi bwiVar = this.v;
        if (bwiVar != null) {
            bwiVar.ab(bwgVar, bwiVar.as(j), buyVar, i, z);
        }
    }

    public void B(bku bkuVar, bmz bmzVar) {
        throw null;
    }

    @Override // defpackage.bvt
    public final long E() {
        return this.y;
    }

    @Override // defpackage.bvt
    public final bry F() {
        return this;
    }

    @Override // defpackage.bvt
    public final bss G() {
        bss bssVar = this.H;
        if (bssVar != null) {
            return bssVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.bvt
    public final bvm H() {
        return this.s;
    }

    @Override // defpackage.bvt
    public final bvt I() {
        return this.v;
    }

    @Override // defpackage.bvt
    public final bvt J() {
        return this.w;
    }

    @Override // defpackage.bvt
    public final void M() {
        bmz bmzVar = this.M;
        if (bmzVar != null) {
            w(this.y, bmzVar);
        } else {
            df(this.y, this.x);
        }
    }

    @Override // defpackage.bvt
    public final boolean O() {
        return this.H != null;
    }

    protected final float Q(long j, long j2) {
        if (t() >= Float.intBitsToFloat((int) (j2 >> 32)) && s() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR = R(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - t());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fMax2 = Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - s());
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax2);
        long j3 = jFloatToRawIntBits << 32;
        long j4 = jFloatToRawIntBits2 & 4294967295L;
        if (fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        long j5 = j3 | j4;
        int i = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i) > fIntBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i2 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i2) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat(i);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat6 * fIntBitsToFloat6);
    }

    public final long R(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - t();
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - s()) / 2.0f;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final long S() {
        return this.E.dp(this.s.q.e());
    }

    public final bij T(int i) {
        bij bijVarX;
        boolean zH = bwj.h(i);
        if (zH) {
            bijVarX = x();
        } else {
            bijVarX = x().p;
            if (bijVarX == null) {
                return null;
            }
        }
        for (bij bijVarU = U(zH); bijVarU != null && (bijVarU.o & i) != 0; bijVarU = bijVarU.q) {
            if ((bijVarU.n & i) != 0) {
                return bijVarU;
            }
            if (bijVarU == bijVarX) {
                return null;
            }
        }
        return null;
    }

    public final bij U(boolean z) {
        bij bijVarX;
        bvm bvmVar = this.s;
        if (bvmVar.o() == this) {
            return bvmVar.s.f;
        }
        if (!z) {
            bwi bwiVar = this.w;
            if (bwiVar == null) {
                return null;
            }
            return bwiVar.x();
        }
        bwi bwiVar2 = this.w;
        if (bwiVar2 == null || (bijVarX = bwiVar2.x()) == null) {
            return null;
        }
        return bijVarX.q;
    }

    public final bke V() {
        bke bkeVar = this.I;
        if (bkeVar != null) {
            return bkeVar;
        }
        bke bkeVar2 = new bke();
        this.I = bkeVar2;
        return bkeVar2;
    }

    public final bug W() {
        return this.s.t.o;
    }

    public final bwi X(bwi bwiVar) {
        bvm bvmVar = bwiVar.s;
        bvm bvmVar2 = this.s;
        if (bvmVar == bvmVar2) {
            bij bijVarX = bwiVar.x();
            bij bijVarX2 = x();
            if (!bijVarX2.B().w) {
                bqs.c("visitLocalAncestors called on an unattached node");
            }
            bij bijVarB = bijVarX2.B();
            while (true) {
                bijVarB = bijVarB.p;
                if (bijVarB == null) {
                    return this;
                }
                if ((bijVarB.n & 2) != 0 && bijVarB == bijVarX) {
                    break;
                }
            }
        } else {
            bvm bvmVarJ = bvmVar;
            while (bvmVarJ.j > bvmVar2.j) {
                bvmVarJ = bvmVarJ.j();
                bvmVarJ.getClass();
            }
            bvm bvmVarJ2 = bvmVar2;
            while (bvmVarJ2.j > bvmVarJ.j) {
                bvmVarJ2 = bvmVarJ2.j();
                bvmVarJ2.getClass();
            }
            while (bvmVarJ != bvmVarJ2) {
                bvmVarJ = bvmVarJ.j();
                bvmVarJ2 = bvmVarJ2.j();
                if (bvmVarJ == null || bvmVarJ2 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (bvmVarJ2 == bvmVar2) {
                return this;
            }
            if (bvmVarJ != bvmVar) {
                return bvmVarJ.n();
            }
        }
        return bwiVar;
    }

    public final bwu Y() {
        return ((bxv) bvp.a(this.s)).t;
    }

    public final void Z(bku bkuVar, bmz bmzVar) {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            bwqVar.c(bkuVar, bmzVar);
            return;
        }
        long j = this.y;
        float fA = chy.a(j);
        float fB = chy.b(j);
        bkuVar.h(fA, fB);
        aa(bkuVar, bmzVar);
        bkuVar.h(-fA, -fB);
    }

    @Override // defpackage.chq
    public final float a() {
        return this.s.o.a();
    }

    public final void aa(bku bkuVar, bmz bmzVar) {
        bwi bwiVar;
        bku bkuVar2;
        bmz bmzVar2;
        bij bijVarT = T(4);
        if (bijVarT == null) {
            B(bkuVar, bmzVar);
            return;
        }
        bvo bvoVarK = this.s.k();
        long jG = chp.G(this.c);
        bdp bdpVar = null;
        while (bijVarT != null) {
            if (bijVarT instanceof buu) {
                bwiVar = this;
                bkuVar2 = bkuVar;
                bmzVar2 = bmzVar;
                bvoVarK.q(bkuVar2, jG, bwiVar, (buu) bijVarT, bmzVar2);
            } else {
                bwiVar = this;
                bkuVar2 = bkuVar;
                bmzVar2 = bmzVar;
                if ((bijVarT.n & 4) != 0 && (bijVarT instanceof bup)) {
                    int i = 0;
                    for (bij bijVar = ((bup) bijVarT).y; bijVar != null; bijVar = bijVar.q) {
                        if ((bijVar.n & 4) != 0) {
                            i++;
                            if (i == 1) {
                                bijVarT = bijVar;
                            } else {
                                if (bdpVar == null) {
                                    bdpVar = new bdp(new bij[16]);
                                }
                                if (bijVarT != null) {
                                    bdpVar.n(bijVarT);
                                }
                                bdpVar.n(bijVar);
                                bijVarT = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                bkuVar = bkuVar2;
                this = bwiVar;
                bmzVar = bmzVar2;
            }
            bijVarT = bko.y(bdpVar);
            bkuVar = bkuVar2;
            this = bwiVar;
            bmzVar = bmzVar2;
        }
    }

    public final void ab(bwg bwgVar, long j, buy buyVar, int i, boolean z) {
        bwi bwiVar;
        boolean z2;
        float f2;
        boolean z3;
        bij bijVarT = T(bwgVar.a());
        if (!ar(j)) {
            if (a.p(i, 1)) {
                float fQ = Q(j, S());
                if ((Float.floatToRawIntBits(fQ) & Integer.MAX_VALUE) >= 2139095040 || !buyVar.e(fQ, false)) {
                    return;
                }
                az(bijVarT, bwgVar, j, buyVar, i, false, fQ);
                return;
            }
            return;
        }
        if (bijVarT == null) {
            A(bwgVar, j, buyVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < t() && fIntBitsToFloat2 < s()) {
            ay(bijVarT, bwgVar, j, buyVar, i, z);
            return;
        }
        float fQ2 = !a.p(i, 1) ? Float.POSITIVE_INFINITY : Q(j, S());
        if ((Float.floatToRawIntBits(fQ2) & Integer.MAX_VALUE) < 2139095040) {
            z2 = z;
            if (buyVar.e(fQ2, z2)) {
                bwiVar = this;
                f2 = fQ2;
                z3 = true;
                bwiVar.ak(bijVarT, bwgVar, j, buyVar, i, z2, f2, z3);
            }
            bwiVar = this;
        } else {
            bwiVar = this;
            z2 = z;
        }
        f2 = fQ2;
        z3 = false;
        bwiVar.ak(bijVarT, bwgVar, j, buyVar, i, z2, f2, z3);
    }

    public final void ac() {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            bwqVar.invalidate();
            return;
        }
        bwi bwiVar = this.w;
        if (bwiVar != null) {
            bwiVar.ac();
        }
    }

    public final void ad() {
        if (this.C != null || this.x == null) {
            return;
        }
        bwq bwqVarM = byi.m(bvp.a(this.s), C(), this.L, this.M, 8);
        bwqVarM.f(this.c);
        bwqVarM.e(this.y);
        bwqVarM.invalidate();
        this.C = bwqVarM;
    }

    public final void ae() {
        this.s.t.f();
    }

    public final void af() {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            bwqVar.b();
            this.L.a();
            this.C = null;
        }
    }

    public final void ag() {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            bwqVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void ah() {
        bij bijVarX;
        if (ap(128)) {
            bgj bgjVarA = bay.A();
            uiq uiqVarI = bgjVarA != null ? bgjVarA.i() : null;
            bgj bgjVarB = bay.B(bgjVarA);
            try {
                boolean zH = bwj.h(128);
                if (!zH) {
                    bijVarX = x().p;
                    if (bijVarX == null) {
                    }
                }
                bijVarX = x();
                for (bij bijVarU = U(zH); bijVarU != null; bijVarU = bijVarU.q) {
                    if ((bijVarU.o & 128) == 0) {
                        break;
                    }
                    if ((bijVarU.n & 128) != 0) {
                        ?? bdpVar = 0;
                        bup bupVarY = bijVarU;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bvd) {
                                ((bvd) bupVarY).k(this.c);
                            } else if ((bupVarY.n & 128) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar != null) {
                                    if ((bijVar.n & 128) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar = bijVar.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    if (bijVarU == bijVarX) {
                        break;
                    }
                }
            } finally {
                bay.E(bgjVarA, bgjVarB, uiqVarI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void ai() {
        bij bijVarX;
        boolean zH = bwj.h(128);
        if (zH) {
            bijVarX = x();
        } else {
            bijVarX = x().p;
            if (bijVarX == null) {
                return;
            }
        }
        for (bij bijVarU = U(zH); bijVarU != null && (bijVarU.o & 128) != 0; bijVarU = bijVarU.q) {
            if ((bijVarU.n & 128) != 0) {
                bup bupVarY = bijVarU;
                ?? bdpVar = 0;
                while (bupVarY != 0) {
                    if (bupVarY instanceof bvd) {
                        ((bvd) bupVarY).dd(this);
                    } else if ((bupVarY.n & 128) != 0 && (bupVarY instanceof bup)) {
                        bij bijVar = bupVarY.y;
                        int i = 0;
                        bupVarY = bupVarY;
                        bdpVar = bdpVar;
                        while (bijVar != null) {
                            if ((bijVar.n & 128) != 0) {
                                i++;
                                bdpVar = bdpVar;
                                if (i == 1) {
                                    bupVarY = bijVar;
                                } else {
                                    if (bdpVar == 0) {
                                        bdpVar = new bdp(new bij[16]);
                                    }
                                    if (bupVarY != 0) {
                                        bdpVar.n(bupVarY);
                                    }
                                    bdpVar.n(bijVar);
                                    bupVarY = 0;
                                }
                            }
                            bijVar = bijVar.q;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                        }
                        if (i != 1) {
                        }
                    }
                    bupVarY = bko.y(bdpVar);
                }
            }
            if (bijVarU == bijVarX) {
                return;
            }
        }
    }

    public final void aj() {
        this.h = true;
        this.L.a();
        am();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[PHI: r3
      0x0184: PHI (r3v19 bdp) = (r3v1 bdp), (r3v1 bdp), (r3v21 bdp) binds: [B:46:0x0154, B:48:0x0158, B:62:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ak(defpackage.bij r13, defpackage.bwg r14, long r15, defpackage.buy r17, int r18, boolean r19, float r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwi.ak(bij, bwg, long, buy, int, boolean, float, boolean):void");
    }

    public final void al(bke bkeVar, boolean z, boolean z2) {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            if (this.D) {
                if (z2) {
                    long jS = S();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jS >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS & 4294967295L)) / 2.0f;
                    long j = this.c;
                    bkeVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (4294967295L & j)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.c;
                    bkeVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (bkeVar.c()) {
                    return;
                }
            }
            bwqVar.d(bkeVar, false);
        }
        long j3 = this.y;
        float fA = chy.a(j3);
        bkeVar.a += fA;
        bkeVar.c += fA;
        float fB = chy.b(j3);
        bkeVar.b += fB;
        bkeVar.d += fB;
    }

    public final void am() {
        if (this.C != null) {
            if (this.M != null) {
                this.M = null;
            }
            ao(null, false);
            this.s.S(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Type inference failed for: r7v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bdp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void an(defpackage.bss r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwi.an(bss):void");
    }

    public final boolean ap(int i) {
        bij bijVarU = U(bwj.h(i));
        return (bijVarU == null || (bijVarU.B().o & i) == 0) ? false : true;
    }

    public final boolean aq() {
        if (this.C != null && this.G <= 0.0f) {
            return true;
        }
        bwi bwiVar = this.w;
        if (bwiVar != null) {
            return bwiVar.aq();
        }
        return false;
    }

    protected final boolean ar(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        bwq bwqVar = this.C;
        return bwqVar == null || !this.D || bwqVar.j(j);
    }

    public final long as(long j) {
        long j2 = this.y;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - chy.a(j2);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - chy.b(j2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        bwq bwqVar = this.C;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (jFloatToRawIntBits << 32);
        return bwqVar != null ? bwqVar.a(jFloatToRawIntBits2, true) : jFloatToRawIntBits2;
    }

    public final void at(long j, uiq uiqVar, bmz bmzVar) {
        if (bmzVar != null) {
            if (uiqVar != null) {
                bqs.b("both ways to create layers shouldn't be used together");
            }
            if (this.M != bmzVar) {
                this.M = null;
                ao(null, false);
                this.M = bmzVar;
            }
            if (this.C == null) {
                bvm bvmVar = this.s;
                bws bwsVarA = bvp.a(bvmVar);
                uiu uiuVarC = C();
                uif uifVar = this.L;
                bwq bwqVarM = byi.m(bwsVarA, uiuVarC, uifVar, bmzVar, 8);
                bwqVarM.f(this.c);
                bwqVarM.e(j);
                this.C = bwqVarM;
                bvmVar.au();
                uifVar.a();
            }
        } else {
            if (this.M != null) {
                this.M = null;
                ao(null, false);
            }
            ao(uiqVar, false);
        }
        if (!a.q(this.y, j)) {
            bvm bvmVar2 = this.s;
            bvp.a(bvmVar2).o(-4.0f);
            this.y = j;
            bvmVar2.t.o.B();
            bwq bwqVar = this.C;
            if (bwqVar != null) {
                bwqVar.e(j);
            } else {
                bwi bwiVar = this.w;
                if (bwiVar != null) {
                    bwiVar.ac();
                }
            }
            P(this);
            bws bwsVar = bvmVar2.i;
            if (bwsVar != null) {
                bwsVar.i(bvmVar2);
            }
        }
        if (this.k) {
            return;
        }
        L(G());
    }

    public final long au(long j) {
        bwq bwqVar = this.C;
        if (bwqVar != null) {
            j = bwqVar.a(j, false);
        }
        return chp.H(j, this.y);
    }

    protected final void ax(bku bkuVar, fnd fndVar) {
        long j = this.c;
        bkuVar.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, fndVar);
    }

    @Override // defpackage.chw
    public final float b() {
        return this.s.o.b();
    }

    @Override // defpackage.bte
    public void df(long j, uiq uiqVar) {
        if (!this.t) {
            at(j, uiqVar, null);
            return;
        }
        bvu bvuVarY = y();
        bvuVarY.getClass();
        at(bvuVarY.h, uiqVar, null);
    }

    @Override // defpackage.bry
    public final boolean dm() {
        return x().w;
    }

    @Override // defpackage.bwt
    public final boolean dn() {
        return (this.C == null || this.h || !this.s.ag()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.bte, defpackage.bru
    public final Object g() {
        bvm bvmVar = this.s;
        bwe bweVar = bvmVar.s;
        if (!bweVar.j(64)) {
            return null;
        }
        x();
        uka ukaVar = new uka();
        for (bij bijVar = bweVar.e; bijVar != null; bijVar = bijVar.p) {
            if ((bijVar.n & 64) != 0) {
                bup bupVarY = bijVar;
                ?? bdpVar = 0;
                while (bupVarY != 0) {
                    if (bupVarY instanceof bwv) {
                        chq chqVar = bvmVar.o;
                        ukaVar.a = ((bwv) bupVarY).de(ukaVar.a);
                    } else if ((bupVarY.n & 64) != 0 && (bupVarY instanceof bup)) {
                        bij bijVar2 = bupVarY.y;
                        int i = 0;
                        bupVarY = bupVarY;
                        bdpVar = bdpVar;
                        while (bijVar2 != null) {
                            if ((bijVar2.n & 64) != 0) {
                                i++;
                                bdpVar = bdpVar;
                                if (i == 1) {
                                    bupVarY = bijVar2;
                                } else {
                                    if (bdpVar == 0) {
                                        bdpVar = new bdp(new bij[16]);
                                    }
                                    if (bupVarY != 0) {
                                        bdpVar.n(bupVarY);
                                    }
                                    bdpVar.n(bijVar2);
                                    bupVarY = 0;
                                }
                            }
                            bijVar2 = bijVar2.q;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                        }
                        if (i != 1) {
                        }
                    }
                    bupVarY = bko.y(bdpVar);
                }
            }
        }
        return ukaVar.a;
    }

    @Override // defpackage.bry
    public final long h() {
        return this.c;
    }

    @Override // defpackage.bry
    public final long i(bry bryVar, long j) {
        return q(bryVar, j);
    }

    @Override // defpackage.bry
    public final long j(long j) {
        if (!dm()) {
            bqs.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ae();
        while (this != null) {
            j = this.au(j);
            this = this.w;
        }
        return j;
    }

    @Override // defpackage.bry
    public final long k(long j) {
        if (!dm()) {
            bqs.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return bvp.a(this.s).a(j(0L));
    }

    @Override // defpackage.bry
    public final long l(long j) {
        bvm bvmVar = this.s;
        long j2 = j(j);
        bxv bxvVar = (bxv) bvp.a(bvmVar);
        bxvVar.w();
        return bld.a(bxvVar.v, j2);
    }

    @Override // defpackage.brv
    public final cib m() {
        return this.s.p;
    }

    @Override // defpackage.bry
    public final bkg n(bry bryVar, boolean z) {
        if (!dm()) {
            bqs.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!bryVar.dm()) {
            bqs.c(a.bz(bryVar, "LayoutCoordinates ", " is not attached!"));
        }
        bwi bwiVarAC = aC(bryVar);
        bwiVarAC.ae();
        bwi bwiVarX = X(bwiVarAC);
        bke bkeVarV = V();
        bkeVarV.a = 0.0f;
        bkeVarV.b = 0.0f;
        bkeVarV.c = (int) (bryVar.h() >> 32);
        bkeVarV.d = (int) (bryVar.h() & 4294967295L);
        while (bwiVarAC != bwiVarX) {
            bwiVarAC.al(bkeVarV, z, false);
            if (bkeVarV.c()) {
                return bkg.a;
            }
            bwiVarAC = bwiVarAC.w;
            bwiVarAC.getClass();
        }
        D(bwiVarX, bkeVarV, z);
        return acv.o(bkeVarV);
    }

    @Override // defpackage.bry
    public final long q(bry bryVar, long j) {
        if (bryVar instanceof bsp) {
            bsp bspVar = (bsp) bryVar;
            bspVar.a().ae();
            return bspVar.q(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        bwi bwiVarAC = aC(bryVar);
        bwiVarAC.ae();
        bwi bwiVarX = X(bwiVarAC);
        while (bwiVarAC != bwiVarX) {
            j = bwiVarAC.au(j);
            bwiVarAC = bwiVarAC.w;
            bwiVarAC.getClass();
        }
        return aB(bwiVarX, j);
    }

    @Override // defpackage.bte
    public void w(long j, bmz bmzVar) {
        if (!this.t) {
            at(j, null, bmzVar);
            return;
        }
        bvu bvuVarY = y();
        bvuVarY.getClass();
        at(bvuVarY.h, null, bmzVar);
    }

    public abstract bij x();

    public abstract bvu y();

    public abstract void z();

    public final void ao(uiq uiqVar, boolean z) {
        bws bwsVar;
        if (uiqVar != null && this.M != null) {
            bqs.b(yoGAhrpjU.eEkfRhAemIO);
        }
        bvm bvmVar = this.s;
        boolean z2 = true;
        if (!z && this.x == uiqVar && a.ao(this.E, bvmVar.o) && this.F == bvmVar.p) {
            z2 = false;
        }
        this.E = bvmVar.o;
        this.F = bvmVar.p;
        if (!bvmVar.ag() || uiqVar == null) {
            this.x = null;
            bwq bwqVar = this.C;
            if (bwqVar != null) {
                bwqVar.b();
                bvmVar.au();
                this.L.a();
                if (dm() && bvmVar.ah() && (bwsVar = bvmVar.i) != null) {
                    bwsVar.i(bvmVar);
                }
            }
            this.C = null;
            this.B = false;
            return;
        }
        this.x = uiqVar;
        if (this.C != null) {
            if (z2 && aw(this)) {
                ((bxv) bvp.a(bvmVar)).k.d(bvmVar);
                return;
            }
            return;
        }
        bws bwsVarA = bvp.a(bvmVar);
        uiu uiuVarC = C();
        uif uifVar = this.L;
        bwq bwqVarM = byi.m(bwsVarA, uiuVarC, uifVar, null, 4);
        bwqVarM.f(this.c);
        bwqVarM.e(this.y);
        this.C = bwqVarM;
        aw(this);
        bvmVar.au();
        uifVar.a();
    }

    @Override // defpackage.bry
    public final bry o() {
        if (!dm()) {
            bqs.c(VnmwoBe.WkWdQtTD);
        }
        ae();
        return this.s.o().w;
    }
}
