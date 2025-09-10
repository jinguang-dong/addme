package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvm implements axy, bwt, bwr {
    private final boolean B;
    private int C;
    private bdp D;
    private boolean E;
    private bvm F;
    private cbn G;
    private final bdp H;
    private boolean I;
    private bwi J;
    private boolean K;
    private bik L;
    private bik M;
    private int N;
    private final byz O;
    private ebn P;
    public int c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public bvm h;
    public bws i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public bsr n;
    public chq o;
    public cib p;
    public caa q;
    public boolean r;
    public final bwe s;
    public final bvq t;
    public bsn u;
    public boolean v;
    public boolean w;
    public int x;
    public bfk y;
    private static final bvk z = new bvj();
    public static final uif a = bnk.e;
    private static final caa A = new bvi();
    public static final Comparator b = new wp(6);

    public bvm() {
        this(false, 3, null);
    }

    private final String aB(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        bdp bdpVarI = i();
        Object[] objArr = bdpVarI.a;
        int i3 = bdpVarI.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((bvm) objArr[i4]).aB(i + 1));
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        strSubstring.getClass();
        return strSubstring;
    }

    private final String aC(bvm bvmVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(bvmVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(al(this));
        sb.append(" Other tree: ");
        bvm bvmVar2 = bvmVar.F;
        sb.append(bvmVar2 != null ? al(bvmVar2) : null);
        return sb.toString();
    }

    private final void aE() {
        bvm bvmVar;
        if (this.C > 0) {
            this.E = true;
        }
        if (!this.B || (bvmVar = this.F) == null) {
            return;
        }
        bvmVar.aE();
    }

    private final void aF(bvm bvmVar) {
        if (bvmVar.t.k > 0) {
            this.t.g(r0.k - 1);
        }
        if (this.i != null) {
            bvmVar.z();
        }
        bvmVar.F = null;
        bvmVar.o().w = null;
        if (bvmVar.B) {
            this.C--;
            bdp bdpVar = (bdp) bvmVar.O.b;
            Object[] objArr = bdpVar.a;
            int i = bdpVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((bvm) objArr[i2]).o().w = null;
            }
        }
        aE();
        N();
    }

    private final void aG() {
        G();
        bvm bvmVarJ = j();
        if (bvmVarJ != null) {
            bvmVarJ.E();
        }
        F();
    }

    private final void aH(bvm bvmVar) {
        if (a.ao(bvmVar, this.h)) {
            return;
        }
        this.h = bvmVar;
        if (bvmVar != null) {
            bvq bvqVar = this.t;
            if (bvqVar.p == null) {
                bvqVar.p = new bvx(bvqVar);
            }
            bwi bwiVar = n().v;
            for (bwi bwiVarO = o(); !a.ao(bwiVarO, bwiVar) && bwiVarO != null; bwiVarO = bwiVarO.v) {
                bwiVarO.z();
            }
        } else {
            bvq bvqVar2 = this.t;
            bvqVar2.p = null;
            bvqVar2.e = false;
            bvqVar2.d = false;
        }
        G();
    }

    static /* synthetic */ String al(bvm bvmVar) {
        return bvmVar.aB(0);
    }

    public static /* synthetic */ void ap(bvm bvmVar, boolean z2, int i) {
        bvm bvmVarJ;
        if (bvmVar.h == null) {
            bqs.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        bws bwsVar = bvmVar.i;
        if (bwsVar == null || bvmVar.k || bvmVar.B) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z3 = i2 != 0;
        boolean z4 = 1 == ((z2 ? 1 : 0) & (i3 ^ 1));
        bwsVar.j(bvmVar, true, z4, z3);
        if (i4 != 0) {
            bvx bvxVarL = bvmVar.l();
            bvxVarL.getClass();
            bvm bvmVarJ2 = bvxVarL.p().j();
            int i5 = bvxVarL.p().x;
            if (bvmVarJ2 == null || i5 == 3) {
                return;
            }
            while (bvmVarJ2.x == i5 && (bvmVarJ = bvmVarJ2.j()) != null) {
                bvmVarJ2 = bvmVarJ;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                if (bvmVarJ2.h != null) {
                    ap(bvmVarJ2, z4, 6);
                    return;
                } else {
                    ar(bvmVarJ2, z4, 6);
                    return;
                }
            }
            if (i6 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (bvmVarJ2.h != null) {
                bvmVarJ2.R(z4);
            } else {
                bvmVarJ2.S(z4);
            }
        }
    }

    public static /* synthetic */ void ar(bvm bvmVar, boolean z2, int i) {
        bws bwsVar;
        bvm bvmVarJ;
        if (bvmVar.k || bvmVar.B || (bwsVar = bvmVar.i) == null) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z3 = i2 != 0;
        boolean z4 = 1 == ((z2 ? 1 : 0) & (i3 ^ 1));
        bwsVar.j(bvmVar, false, z4, z3);
        if (i4 != 0) {
            bvz bvzVarM = bvmVar.m();
            bvm bvmVarJ2 = bvzVarM.p().j();
            int i5 = bvzVarM.p().x;
            if (bvmVarJ2 == null || i5 == 3) {
                return;
            }
            while (bvmVarJ2.x == i5 && (bvmVarJ = bvmVarJ2.j()) != null) {
                bvmVarJ2 = bvmVarJ;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                ar(bvmVarJ2, z4, 6);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                bvmVarJ2.S(z4);
            }
        }
    }

    public final void A(bku bkuVar, bmz bmzVar) throws Throwable {
        try {
            o().Z(bkuVar, bmzVar);
        } catch (Throwable th) {
            as(th);
            throw new uer();
        }
    }

    public final void B() {
        if (this.h != null) {
            ap(this, false, 5);
        } else {
            ar(this, false, 5);
        }
        cho choVarB = this.t.b();
        if (choVarB != null) {
            bws bwsVar = this.i;
            if (bwsVar != null) {
                bwsVar.g(this, choVarB.a);
                return;
            }
            return;
        }
        bws bwsVar2 = this.i;
        if (bwsVar2 != null) {
            byi.n(bwsVar2);
        }
    }

    public final void C(long j, buy buyVar, int i, boolean z2) {
        bwi bwiVarO = o();
        uiq uiqVar = bwi.o;
        o().ab(bwi.q, bwiVarO.as(j), buyVar, i, z2);
    }

    public final void D(int i, bvm bvmVar) {
        if (bvmVar.F != null && bvmVar.i != null) {
            bqs.c(aC(bvmVar));
        }
        bvmVar.F = this;
        this.O.e(i, bvmVar);
        N();
        if (bvmVar.B) {
            this.C++;
        }
        aE();
        bws bwsVar = this.i;
        if (bwsVar != null) {
            bvmVar.v(bwsVar);
        }
        if (bvmVar.t.k > 0) {
            bvq bvqVar = this.t;
            bvqVar.g(bvqVar.k + 1);
        }
    }

    public final void F() {
        bwi bwiVarO = o();
        bwi bwiVarN = n();
        while (bwiVarO != bwiVarN) {
            bwiVarO.getClass();
            bvh bvhVar = (bvh) bwiVarO;
            bwq bwqVar = bvhVar.C;
            if (bwqVar != null) {
                bwqVar.invalidate();
            }
            bwiVarO = bvhVar.v;
        }
        bwq bwqVar2 = n().C;
        if (bwqVar2 != null) {
            bwqVar2.invalidate();
        }
    }

    public final void G() {
        if (this.B) {
            bvm bvmVarJ = j();
            if (bvmVarJ != null) {
                bvmVarJ.G();
                return;
            }
            return;
        }
        this.g = true;
        if (this.h != null) {
            ap(this, false, 7);
        } else {
            ar(this, false, 7);
        }
    }

    public final void H() {
        if (this.m) {
            return;
        }
        if (this.s.b.q != null || ab()) {
            this.l = true;
            return;
        }
        cbn cbnVar = this.G;
        this.m = true;
        uka ukaVar = new uka();
        ukaVar.a = new cbn();
        bwu bwuVar = ((bxv) bvp.a(this)).t;
        bwuVar.d(this, bwuVar.b, new bvl(this, ukaVar));
        this.m = false;
        this.G = (cbn) ukaVar.a;
        this.l = false;
        bws bwsVarA = bvp.a(this);
        ((bxv) bwsVarA).J.d(this, cbnVar);
        bwsVarA.l();
    }

    public final void I() {
        bvm bvmVarJ;
        if (this.x == 3) {
            y();
        }
        bvx bvxVarL = l();
        bvxVarL.getClass();
        try {
            bvxVarL.g = true;
            if (!bvxVarL.k) {
                bqs.c("replace() called on item that was not placed");
            }
            bvxVarL.v = false;
            boolean zO = bvxVarL.o();
            bvxVarL.F(bvxVarL.m, bvxVarL.n, bvxVarL.o);
            if (zO && !bvxVarL.v && (bvmVarJ = bvxVarL.p().j()) != null) {
                bvmVarJ.R(false);
            }
        } finally {
            bvxVarL.g = false;
        }
    }

    public final void J() {
        this.t.o.y();
    }

    public final void K() {
        this.t.d = true;
    }

    public final void L() {
        this.t.o.z();
    }

    public final void M(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i > i2 ? i + i4 : i;
                int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
                byz byzVar = this.O;
                byzVar.e(i6, (bvm) byzVar.d(i5));
            }
            N();
            aE();
            G();
        }
    }

    public final void N() {
        if (!this.B) {
            this.I = true;
            return;
        }
        bvm bvmVarJ = j();
        if (bvmVarJ != null) {
            bvmVarJ.N();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uif] */
    public final void O() {
        byz byzVar = this.O;
        bdp bdpVar = (bdp) byzVar.b;
        int i = bdpVar.b;
        while (true) {
            i--;
            if (i < 0) {
                bdpVar.g();
                byzVar.a.a();
                return;
            }
            aF((bvm) bdpVar.a[i]);
        }
    }

    public final void P(int i, int i2) {
        if (i2 < 0) {
            bqs.b(a.bE(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            byz byzVar = this.O;
            aF((bvm) ((bdp) byzVar.b).a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void Q() {
        bvm bvmVarJ;
        if (this.x == 3) {
            y();
        }
        bvz bvzVarM = m();
        try {
            bvzVarM.g = true;
            if (!bvzVarM.k) {
                bqs.c("replace called on unplaced item");
            }
            boolean z2 = bvzVarM.r;
            bvzVarM.E(bvzVarM.m, bvzVarM.n, bvzVarM.o);
            if (z2 && !bvzVarM.A && (bvmVarJ = bvzVarM.p().j()) != null) {
                bvmVarJ.S(false);
            }
        } finally {
        }
    }

    public final void R(boolean z2) {
        bws bwsVar;
        if (this.B || (bwsVar = this.i) == null) {
            return;
        }
        bwsVar.k(this, true, z2);
    }

    public final void S(boolean z2) {
        bws bwsVar;
        this.g = true;
        if (this.B || (bwsVar = this.i) == null) {
            return;
        }
        bwsVar.k(this, false, z2);
    }

    public final void T(bvm bvmVar) {
        int iAw = bvmVar.aw();
        int i = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        if (i != 4) {
            int iAw2 = bvmVar.aw();
            Objects.toString(bko.s(iAw2));
            throw new IllegalStateException("Unexpected state ".concat(bko.s(iAw2)));
        }
        if (bvmVar.ae()) {
            ap(bvmVar, true, 6);
            return;
        }
        if (bvmVar.ad()) {
            bvmVar.R(true);
        }
        if (bvmVar.af()) {
            ar(bvmVar, true, 6);
        } else if (bvmVar.ac()) {
            bvmVar.S(true);
        }
    }

    public final void U() {
        bwe bweVar = this.s;
        for (bij bijVar = bweVar.e; bijVar != null; bijVar = bijVar.p) {
            if (bijVar.w) {
                bijVar.F();
            }
        }
        bweVar.f();
        bweVar.c();
    }

    public final void V() {
        bdp bdpVarI = i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            int i3 = bvmVar.N;
            bvmVar.x = i3;
            if (i3 != 3) {
                bvmVar.V();
            }
        }
    }

    public final void W(chq chqVar) {
        if (a.ao(this.o, chqVar)) {
            return;
        }
        this.o = chqVar;
        aG();
        for (bij bijVar = this.s.f; bijVar != null; bijVar = bijVar.q) {
            bijVar.cY();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [azr, java.lang.Object] */
    public final void X(bsr bsrVar) {
        if (a.ao(this.n, bsrVar)) {
            return;
        }
        this.n = bsrVar;
        ebn ebnVar = this.P;
        if (ebnVar != null) {
            ebnVar.b.b(bsrVar);
        }
        G();
    }

    public final void Y(bik bikVar) {
        if (this.B && this.L != bik.c) {
            bqs.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.w) {
            bqs.b("modifier is updated when deactivated");
        }
        if (!ag()) {
            this.M = bikVar;
            return;
        }
        aD(bikVar);
        if (this.l) {
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void Z(caa caaVar) {
        if (a.ao(this.q, caaVar)) {
            return;
        }
        this.q = caaVar;
        bwe bweVar = this.s;
        if ((bweVar.a() & 16) != 0) {
            for (bij bijVar = bweVar.f; bijVar != null; bijVar = bijVar.q) {
                if ((bijVar.n & 16) != 0) {
                    bup bupVarY = bijVar;
                    ?? bdpVar = 0;
                    while (bupVarY != 0) {
                        if (bupVarY instanceof bww) {
                            ((bww) bupVarY).l();
                        } else if ((bupVarY.n & 16) != 0 && (bupVarY instanceof bup)) {
                            bij bijVar2 = bupVarY.y;
                            int i = 0;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                            while (bijVar2 != null) {
                                if ((bijVar2.n & 16) != 0) {
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
                if ((bijVar.o & 16) == 0) {
                    return;
                }
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
    @Override // defpackage.bwr
    public final void a() {
        bij bijVar;
        bwi bwiVarN = n();
        boolean zH = bwj.h(128);
        if (zH) {
            bijVar = ((bva) bwiVarN).f;
        } else {
            bijVar = ((bva) bwiVarN).f.p;
            if (bijVar == null) {
                return;
            }
        }
        for (bij bijVarU = bwiVarN.U(zH); bijVarU != null && (bijVarU.o & 128) != 0; bijVarU = bijVarU.q) {
            if ((bijVarU.n & 128) != 0) {
                bup bupVarY = bijVarU;
                ?? bdpVar = 0;
                while (bupVarY != 0) {
                    if (bupVarY instanceof bvd) {
                        ((bvd) bupVarY).dd(n());
                    } else if ((bupVarY.n & 128) != 0 && (bupVarY instanceof bup)) {
                        bij bijVar2 = bupVarY.y;
                        int i = 0;
                        bupVarY = bupVarY;
                        bdpVar = bdpVar;
                        while (bijVar2 != null) {
                            if ((bijVar2.n & 128) != 0) {
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
            if (bijVarU == bijVar) {
                return;
            }
        }
    }

    public final ebn aA() {
        ebn ebnVar = this.P;
        if (ebnVar != null) {
            return ebnVar;
        }
        ebn ebnVar2 = new ebn(this, this.n);
        this.P = ebnVar2;
        return ebnVar2;
    }

    public final void aa() {
        if (this.C <= 0 || !this.E) {
            return;
        }
        this.E = false;
        bdp bdpVar = this.D;
        if (bdpVar == null) {
            bdpVar = new bdp(new bvm[16]);
            this.D = bdpVar;
        }
        bdpVar.g();
        bdp bdpVar2 = (bdp) this.O.b;
        Object[] objArr = bdpVar2.a;
        int i = bdpVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bvmVar.B) {
                bdpVar.o(bdpVar.b, bvmVar.i());
            } else {
                bdpVar.n(bvmVar);
            }
        }
        this.t.d();
    }

    public final boolean ab() {
        return this.M != null;
    }

    public final boolean ac() {
        return this.t.n();
    }

    public final boolean ad() {
        return this.t.e;
    }

    public final boolean ae() {
        return this.t.d;
    }

    public final boolean af() {
        return this.t.o.t;
    }

    public final boolean ag() {
        return this.i != null;
    }

    public final boolean ah() {
        return m().r;
    }

    public final boolean ai() {
        return m().s;
    }

    public final boolean aj(cho choVar) {
        if (choVar == null || this.h == null) {
            return false;
        }
        bvx bvxVarL = l();
        bvxVarL.getClass();
        return bvxVarL.E(choVar.a);
    }

    public final boolean ak(cho choVar) {
        if (choVar == null) {
            return false;
        }
        if (this.x == 3) {
            x();
        }
        return m().D(choVar.a);
    }

    public final void am(long j, buy buyVar, boolean z2) {
        bwi bwiVarO = o();
        uiq uiqVar = bwi.o;
        o().ab(bwi.r, bwiVarO.as(j), buyVar, 1, z2);
    }

    public final void as(Throwable th) throws Throwable {
        bhv bhvVar = (bhv) this.y.h(bhw.a);
        if (bhvVar == null) {
            throw th;
        }
        bhvVar.b(th, this);
        throw th;
    }

    public final void at() {
    }

    public final void au() {
        this.K = true;
    }

    public final void av() {
        this.g = false;
    }

    public final int aw() {
        return this.t.q;
    }

    public final int ax() {
        return m().E;
    }

    public final int ay() {
        int i;
        bvx bvxVarL = l();
        if (bvxVarL == null || (i = bvxVarL.w) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void az(bfk bfkVar) {
        this.y = bfkVar;
        W((chq) bfkVar.h(bze.c));
        cib cibVar = (cib) bfkVar.h(bze.h);
        if (this.p != cibVar) {
            this.p = cibVar;
            aG();
            for (bij bijVar = this.s.f; bijVar != null; bijVar = bijVar.q) {
                bijVar.cO();
            }
        }
        Z((caa) bfkVar.h(bze.j));
        bwe bweVar = this.s;
        if ((bweVar.a() & 32768) != 0) {
            for (bij bijVar2 = bweVar.f; bijVar2 != null; bijVar2 = bijVar2.q) {
                if ((bijVar2.n & 32768) != 0) {
                    bup bupVarY = bijVar2;
                    ?? bdpVar = 0;
                    while (bupVarY != 0) {
                        if (bupVarY instanceof bun) {
                            bij bijVarB = ((bun) bupVarY).B();
                            if (bijVarB.w) {
                                bwj.g(bijVarB);
                            } else {
                                bijVarB.u = true;
                            }
                        } else if ((bupVarY.n & 32768) != 0 && (bupVarY instanceof bup)) {
                            bij bijVar3 = bupVarY.y;
                            int i = 0;
                            bupVarY = bupVarY;
                            bdpVar = bdpVar;
                            while (bijVar3 != null) {
                                if ((bijVar3.n & 32768) != 0) {
                                    i++;
                                    bdpVar = bdpVar;
                                    if (i == 1) {
                                        bupVarY = bijVar3;
                                    } else {
                                        if (bdpVar == 0) {
                                            bdpVar = new bdp(new bij[16]);
                                        }
                                        if (bupVarY != 0) {
                                            bdpVar.n(bupVarY);
                                        }
                                        bdpVar.n(bijVar3);
                                        bupVarY = 0;
                                    }
                                }
                                bijVar3 = bijVar3.q;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bupVarY = bko.y(bdpVar);
                    }
                }
                if ((bijVar2.o & 32768) == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.axy
    public final void b() {
        bsn bsnVar = this.u;
        if (bsnVar != null) {
            bsnVar.b();
        }
        this.w = true;
        U();
        if (ag()) {
            this.G = null;
            this.l = false;
        }
        bws bwsVar = this.i;
        if (bwsVar != null) {
            bxv bxvVar = (bxv) bwsVar;
            bxvVar.k.f(this);
            bit bitVar = bxvVar.H;
            if (bitVar == null || !bitVar.f.e(this.c)) {
                return;
            }
            bitVar.h.ax(bitVar.a, this.c, false);
        }
    }

    @Override // defpackage.axy
    public final void c() {
        bsn bsnVar = this.u;
        if (bsnVar != null) {
            bsnVar.f();
        }
        bwi bwiVar = n().v;
        for (bwi bwiVarO = o(); !a.ao(bwiVarO, bwiVar) && bwiVarO != null; bwiVarO = bwiVarO.v) {
            bwiVarO.aj();
        }
    }

    public final float d() {
        return m().z;
    }

    @Override // defpackage.bwt
    public final boolean dn() {
        return ag();
    }

    public final int e() {
        return this.t.o.b;
    }

    public final int f() {
        return m().i;
    }

    public final int g() {
        return this.t.o.a;
    }

    public final bdp h() {
        if (this.I) {
            bdp bdpVar = this.H;
            bdpVar.g();
            bdpVar.o(bdpVar.b, i());
            bdpVar.j(b);
            this.I = false;
        }
        return this.H;
    }

    public final bdp i() {
        Object obj;
        aa();
        if (this.C == 0) {
            obj = this.O.b;
        } else {
            obj = this.D;
            obj.getClass();
        }
        return (bdp) obj;
    }

    public final bvm j() {
        do {
            this = this.F;
            if (this == null) {
                break;
            }
        } while (this.B);
        return this;
    }

    public final bvo k() {
        return ((bxv) bvp.a(this)).e;
    }

    public final bvx l() {
        return this.t.p;
    }

    public final bvz m() {
        return this.t.o;
    }

    public final bwi n() {
        return this.s.c;
    }

    public final bwi o() {
        return this.s.d;
    }

    public final cbn p() {
        if (ag() && !this.w && this.s.j(8)) {
            return this.G;
        }
        return null;
    }

    public final Boolean q() {
        bvx bvxVarL = l();
        if (bvxVarL != null) {
            return Boolean.valueOf(bvxVarL.o());
        }
        return null;
    }

    public final List r() {
        bvx bvxVarL = l();
        bvxVarL.getClass();
        bvxVarL.p().t();
        if (!bvxVarL.r) {
            return bvxVarL.q.e();
        }
        bvm bvmVarP = bvxVarL.p();
        bdp bdpVar = bvxVarL.q;
        bdp bdpVarI = bvmVarP.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bdpVar.b <= i2) {
                bvx bvxVar = bvmVar.t.p;
                bvxVar.getClass();
                bdpVar.n(bvxVar);
            } else {
                bvx bvxVar2 = bvmVar.t.p;
                bvxVar2.getClass();
                bdpVar.d(i2, bvxVar2);
            }
        }
        bdpVar.h(bvmVarP.t().size(), bdpVar.b);
        bvxVarL.r = false;
        return bdpVar.e();
    }

    public final List s() {
        return m().x();
    }

    public final List t() {
        return i().e();
    }

    public final String toString() {
        return blb.B(this) + " children: " + t().size() + " measurePolicy: " + this.n;
    }

    public final List u() {
        return ((bdp) this.O.b).e();
    }

    public final void v(bws bwsVar) {
        bvm bvmVar;
        cbn cbnVarP;
        if (this.i != null) {
            bqs.c("Cannot attach " + this + " as it already is attached.  Tree: " + al(this));
        }
        bvm bvmVar2 = this.F;
        if (bvmVar2 != null && !a.ao(bvmVar2.i, bwsVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(bwsVar);
            sb.append(") than the parent's owner(");
            bvm bvmVarJ = j();
            sb.append(bvmVarJ != null ? bvmVarJ.i : null);
            sb.append("). This tree: ");
            sb.append(al(this));
            sb.append(" Parent tree: ");
            bvm bvmVar3 = this.F;
            sb.append(bvmVar3 != null ? al(bvmVar3) : null);
            bqs.c(sb.toString());
        }
        bvm bvmVarJ2 = j();
        if (bvmVarJ2 == null) {
            m().r = true;
            bvx bvxVarL = l();
            if (bvxVarL != null) {
                bvxVarL.x = 1;
            }
        }
        o().w = bvmVarJ2 != null ? bvmVarJ2.n() : null;
        this.i = bwsVar;
        this.j = (bvmVarJ2 != null ? bvmVarJ2.j : -1) + 1;
        bik bikVar = this.M;
        if (bikVar != null) {
            aD(bikVar);
        }
        this.M = null;
        bxv bxvVar = (bxv) bwsVar;
        bxvVar.G.f(this.c, this);
        bvm bvmVar4 = this.F;
        if (bvmVar4 == null || (bvmVar = bvmVar4.h) == null) {
            bvmVar = this.h;
        }
        aH(bvmVar);
        if (this.h == null && this.s.j(512)) {
            aH(this);
        }
        if (!this.w) {
            this.s.b();
        }
        bdp bdpVar = (bdp) this.O.b;
        Object[] objArr = bdpVar.a;
        int i = bdpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bvm) objArr[i2]).v(bwsVar);
        }
        if (!this.w) {
            this.s.e();
        }
        G();
        if (bvmVarJ2 != null) {
            bvmVarJ2.G();
        }
        bwi bwiVar = n().v;
        for (bwi bwiVarO = o(); !a.ao(bwiVarO, bwiVar) && bwiVarO != null; bwiVarO = bwiVarO.v) {
            bwiVarO.ao(bwiVarO.x, true);
            bwq bwqVar = bwiVarO.C;
            if (bwqVar != null) {
                bwqVar.invalidate();
            }
        }
        this.t.m();
        if (!this.w && this.s.j(8)) {
            H();
        }
        bit bitVar = bxvVar.H;
        if (bitVar == null || (cbnVarP = p()) == null || !bay.q(cbnVarP)) {
            return;
        }
        bitVar.f.d(this.c);
        bitVar.h.ax(bitVar.a, this.c, true);
    }

    public final void x() {
        this.N = this.x;
        this.x = 3;
        bdp bdpVarI = i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bvmVar.x != 3) {
                bvmVar.x();
            }
        }
    }

    public final void y() {
        this.N = this.x;
        this.x = 3;
        bdp bdpVarI = i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bvmVar.x == 2) {
                bvmVar.y();
            }
        }
    }

    public final void z() {
        buf bufVar;
        bws bwsVar = this.i;
        if (bwsVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            bvm bvmVarJ = j();
            sb.append(bvmVarJ != null ? al(bvmVarJ) : null);
            bqs.a(sb.toString());
            throw new uer();
        }
        bvm bvmVarJ2 = j();
        if (bvmVarJ2 != null) {
            bvmVarJ2.E();
            bvmVarJ2.G();
            m().E = 3;
            bvx bvxVarL = l();
            if (bvxVarL != null) {
                bvxVarL.w = 3;
            }
        }
        bvq bvqVar = this.t;
        bvqVar.o.v.h();
        bvx bvxVar = bvqVar.p;
        if (bvxVar != null && (bufVar = bvxVar.p) != null) {
            bufVar.h();
        }
        bwe bweVar = this.s;
        bweVar.f();
        this.k = true;
        bdp bdpVar = (bdp) this.O.b;
        Object[] objArr = bdpVar.a;
        int i = bdpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bvm) objArr[i2]).z();
        }
        this.k = false;
        bweVar.c();
        bxv bxvVar = (bxv) bwsVar;
        bxvVar.G.d(this.c);
        bvy bvyVar = bxvVar.u;
        bvyVar.g.i(this);
        ((bdp) bvyVar.h.a).m(this);
        bxvVar.s = true;
        bxvVar.k.f(this);
        bit bitVar = bxvVar.H;
        if (bitVar != null && bitVar.f.e(this.c)) {
            bitVar.h.ax(bitVar.a, this.c, false);
        }
        this.i = null;
        aH(null);
        this.j = 0;
        bvz bvzVarM = m();
        bvzVarM.i = Integer.MAX_VALUE;
        bvzVarM.h = Integer.MAX_VALUE;
        bvzVarM.r = false;
        bvx bvxVarL2 = l();
        if (bvxVarL2 != null) {
            bvxVarL2.i = Integer.MAX_VALUE;
            bvxVarL2.h = Integer.MAX_VALUE;
            bvxVarL2.x = 3;
        }
        if (bweVar.j(8)) {
            cbn cbnVar = this.G;
            this.G = null;
            this.l = false;
            bxvVar.J.d(this, cbnVar);
            bwsVar.l();
        }
    }

    public bvm(boolean z2, int i) {
        this.B = z2;
        this.c = i;
        this.d = 9223372034707292159L;
        this.e = 0L;
        this.f = 9223372034707292159L;
        this.g = true;
        this.O = new byz(new bdp(new bvm[16]), new bol(this, 5), (byte[]) null);
        this.H = new bdp(new bvm[16]);
        this.I = true;
        this.n = z;
        this.o = bvp.a;
        this.p = cib.a;
        this.q = A;
        this.y = ayq.a;
        this.x = 3;
        this.N = 3;
        this.s = new bwe(this);
        this.t = new bvq(this);
        this.K = true;
        this.L = bik.c;
    }

    private final void aD(bik bikVar) {
        bwe bweVar;
        bdp bdpVar;
        bwd bwdVar;
        bwe bweVar2 = this.s;
        boolean zJ = bweVar2.j(16);
        boolean zJ2 = bweVar2.j(1024);
        this.L = bikVar;
        bij bijVar = bweVar2.f;
        bwd bwdVar2 = bweVar2.b;
        if (bijVar == bwdVar2) {
            bqs.c("padChain called on already padded chain");
        }
        bij bijVar2 = bweVar2.f;
        bijVar2.p = bwdVar2;
        bwdVar2.q = bijVar2;
        bdp bdpVar2 = bweVar2.g;
        int i = bdpVar2 != null ? bdpVar2.b : 0;
        bdp bdpVar3 = bweVar2.h;
        if (bdpVar3 == null) {
            bdpVar3 = new bdp(new bii[16]);
        }
        bdp bdpVar4 = bweVar2.i;
        bdpVar4.n(bikVar);
        aaw aawVar = null;
        while (true) {
            int i2 = bdpVar4.b;
            if (i2 == 0) {
                break;
            }
            bik bikVar2 = (bik) bdpVar4.c(i2 - 1);
            if (bikVar2 instanceof bif) {
                bif bifVar = (bif) bikVar2;
                bdpVar4.n(bifVar.b);
                bdpVar4.n(bifVar.a);
            } else if (bikVar2 instanceof bii) {
                bdpVar3.n(bikVar2);
            } else {
                if (aawVar == null) {
                    aawVar = new aaw(bdpVar3, 11);
                }
                bikVar2.c(aawVar);
            }
        }
        int i3 = bdpVar3.b;
        String str = mNLbzhCxd.DuDVxgZ;
        boolean z2 = true;
        if (i3 == i) {
            bij bijVar3 = bwdVar2.q;
            int i4 = 0;
            while (true) {
                if (bijVar3 == null || i4 >= i) {
                    break;
                }
                if (bdpVar2 == null) {
                    bqs.a(str);
                    throw new uer();
                }
                bii biiVar = (bii) bdpVar2.a[i4];
                bii biiVar2 = (bii) bdpVar3.a[i4];
                int iP = byi.p(biiVar, biiVar2);
                if (iP == 0) {
                    bijVar3 = bijVar3.p;
                    break;
                }
                if (iP == 1) {
                    bwe.m(biiVar, biiVar2, bijVar3);
                }
                bijVar3 = bijVar3.q;
                i4++;
            }
            if (i4 < i) {
                if (bdpVar2 == null) {
                    bqs.a(str);
                    throw new uer();
                }
                if (bijVar3 == null) {
                    bqs.a(PJGqOKsIpSdZ.jAQsOTDreIVV);
                    throw new uer();
                }
                bdpVar = bdpVar3;
                bij bijVar4 = bijVar3;
                bweVar = bweVar2;
                bweVar.g(i4, bdpVar2, bdpVar, bijVar4, !bweVar2.a.ab());
                bwdVar = bwdVar2;
            }
            bweVar = bweVar2;
            bdpVar = bdpVar3;
            bwdVar = bwdVar2;
            z2 = false;
        } else {
            bvm bvmVar = bweVar2.a;
            if (bvmVar.ab() && i == 0) {
                bij bijVarK = bwdVar2;
                for (int i5 = 0; i5 < bdpVar3.b; i5++) {
                    bijVarK = bwe.k((bii) bdpVar3.a[i5], bijVarK);
                }
                bweVar2.h();
                bweVar = bweVar2;
                bdpVar = bdpVar3;
                bwdVar = bwdVar2;
            } else if (i3 != 0) {
                if (bdpVar2 == null) {
                    bdpVar2 = new bdp(new bii[16]);
                }
                bweVar = bweVar2;
                bdpVar = bdpVar3;
                bwdVar = bwdVar2;
                bweVar.g(0, bdpVar2, bdpVar, bwdVar, !bvmVar.ab());
            } else {
                if (bdpVar2 == null) {
                    bqs.a(str);
                    throw new uer();
                }
                bij bijVar5 = bwdVar2.q;
                for (int i6 = 0; bijVar5 != null && i6 < bdpVar2.b; i6++) {
                    bijVar5 = bwe.l(bijVar5).q;
                }
                bva bvaVar = bweVar2.c;
                bvm bvmVarJ = bvmVar.j();
                bvaVar.w = bvmVarJ != null ? bvmVarJ.n() : null;
                bweVar2.d = bvaVar;
                bweVar = bweVar2;
                bdpVar = bdpVar3;
                bwdVar = bwdVar2;
                z2 = false;
            }
        }
        bweVar.g = bdpVar;
        if (bdpVar2 != null) {
            bdpVar2.g();
        } else {
            bdpVar2 = null;
        }
        bweVar.h = bdpVar2;
        bij bijVar6 = bwdVar.q;
        if (bijVar6 == null) {
            bijVar6 = bweVar.e;
        }
        bijVar6.p = null;
        bwdVar.q = null;
        bwdVar.o = -1;
        bwdVar.s = null;
        if (bijVar6 == bwdVar) {
            bqs.c("trimChain did not update the head");
        }
        bweVar.f = bijVar6;
        if (z2) {
            bweVar.i();
        }
        boolean zJ3 = bweVar.j(16);
        boolean zJ4 = bweVar.j(1024);
        this.t.m();
        if (this.h == null && bweVar.j(512)) {
            aH(this);
        }
        if (zJ == zJ3 && zJ2 == zJ4) {
            return;
        }
        cce cceVar = ((bxv) bvp.a(this)).k;
        if (!ag()) {
            return;
        }
        ccd ccdVar = cceVar.a;
        int i7 = this.c & 67108863;
        Object obj = ccdVar.b;
        int i8 = ccdVar.a;
        int i9 = 0;
        while (true) {
            long[] jArr = (long[]) obj;
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                return;
            }
            int i10 = i9 + 2;
            long j = jArr[i10];
            if ((((int) j) & 67108863) == i7) {
                jArr[i10] = (4611686018427387903L & j) | ((zJ4 ? 1L : 0L) * 4611686018427387904L) | ((zJ3 ? 1L : 0L) * Long.MIN_VALUE);
                return;
            }
            i9 += 3;
        }
    }

    public final void E() {
        if (this.K) {
            bwi bwiVarN = n();
            bwi bwiVar = o().w;
            this.J = null;
            while (true) {
                if (a.ao(bwiVarN, bwiVar)) {
                    break;
                }
                if ((bwiVarN != null ? bwiVarN.C : null) != null) {
                    this.J = bwiVarN;
                    break;
                }
                bwiVarN = bwiVarN != null ? bwiVarN.w : null;
            }
        }
        bwi bwiVar2 = this.J;
        if (bwiVar2 != null && bwiVar2.C == null) {
            bqs.a(nWEkBGOQPWQp.iXyGqYWwmpcFmM);
            throw new uer();
        }
        if (bwiVar2 != null) {
            bwiVar2.ac();
            return;
        }
        bvm bvmVarJ = j();
        if (bvmVarJ != null) {
            bvmVarJ.E();
        }
    }

    public /* synthetic */ bvm(boolean z2, int i, byte[] bArr) {
        this(1 == ((z2 ? 1 : 0) & ((i & 1) ^ 1)), cbp.a());
    }
}
