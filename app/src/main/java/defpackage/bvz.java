package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvz extends bte implements bsq, bug, bwb {
    public boolean A;
    public uiq B;
    public bmz C;
    private boolean F;
    private boolean K;
    public final bvq f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public uiq n;
    public bmz o;
    public Object q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean x;
    public float z;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int E = 3;
    public long m = 0;
    public boolean p = true;
    public final buf v = new bvn(this);
    private final bdp G = new bdp(new bvz[16]);
    public boolean w = true;
    public long y = chp.k(0, 0, 15);
    private final uif H = new bol(this, 7);
    private final uif I = new bol(this, 6);
    public long D = 0;
    private final uif J = new bol(this, 8);

    public bvz(bvq bvqVar) {
        this.f = bvqVar;
    }

    private final bvx H() {
        return this.f.p;
    }

    private final void I() {
        boolean z = this.r;
        this.r = true;
        bvm bvmVarP = p();
        if (!z) {
            bvmVarP.n().ai();
            if (bvmVarP.af()) {
                bvm.ar(bvmVarP, true, 6);
            } else if (bvmVarP.ae()) {
                bvm.ap(bvmVarP, true, 6);
            }
        }
        bwi bwiVar = bvmVarP.n().v;
        for (bwi bwiVarO = bvmVarP.o(); !a.ao(bwiVarO, bwiVar) && bwiVarO != null; bwiVarO = bwiVarO.v) {
            if (bwiVarO.B) {
                bwiVarO.ac();
            }
        }
        bdp bdpVarI = bvmVarP.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bvmVar.f() != Integer.MAX_VALUE) {
                bvmVar.m().I();
                bvmVarP.T(bvmVar);
            }
        }
    }

    private final void J() {
        int i;
        bvm.ar(p(), false, 7);
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || p().x != 3) {
            return;
        }
        bvm bvmVarP = p();
        int iAw = bvmVarJ.aw();
        int i2 = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = bvmVarJ.x;
            }
        } else {
            i = 1;
        }
        bvmVarP.x = i;
    }

    private final void K(long j, uiq uiqVar, bmz bmzVar) throws Throwable {
        btd btaVar;
        bvm bvmVarP = p();
        try {
            this.s = true;
            if (!a.q(j, this.m) || this.K) {
                bvq bvqVar = this.f;
                if (bvqVar.j || bvqVar.i || this.K) {
                    this.u = true;
                    this.K = false;
                }
                B();
            }
            bvx bvxVarH = H();
            if (bvxVarH != null) {
                if (!byi.q(bvxVarH.p())) {
                    if (bvxVarH.x == 3) {
                        bvq bvqVar2 = bvxVarH.f;
                        if (!bvqVar2.b) {
                            bvqVar2.c = true;
                        }
                    }
                    if (bvxVarH.D()) {
                    }
                }
                bwi bwiVar = q().w;
                if (bwiVar == null || (btaVar = bwiVar.l) == null) {
                    bws bwsVarA = bvp.a(p());
                    uiq uiqVar2 = btf.a;
                    btaVar = new bta(bwsVarA);
                }
                bvx bvxVarH2 = H();
                bvxVarH2.getClass();
                bvm bvmVarJ = p().j();
                if (bvmVarJ != null) {
                    bvmVarJ.t.g = 0;
                }
                bvxVarH2.i = Integer.MAX_VALUE;
                btd.q(btaVar, bvxVarH2, chy.a(j), chy.b(j));
            }
            bvx bvxVarH3 = H();
            if (bvxVarH3 != null && !bvxVarH3.k) {
                bqs.c("Error: Placement happened before lookahead.");
            }
            E(j, uiqVar, bmzVar);
        } catch (Throwable th) {
            bvmVarP.as(th);
            throw new uer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    public final void A() {
        bij bijVarX;
        if (this.r) {
            this.r = false;
            bvm bvmVarP = p();
            bwi bwiVar = bvmVarP.n().v;
            for (bwi bwiVarO = bvmVarP.o(); !a.ao(bwiVarO, bwiVar) && bwiVarO != null; bwiVarO = bwiVarO.v) {
                if (bwiVarO.ap(ImageMetadata.SHADING_MODE)) {
                    boolean zH = bwj.h(ImageMetadata.SHADING_MODE);
                    if (zH) {
                        bijVarX = bwiVarO.x();
                    } else {
                        bijVarX = bwiVarO.x().p;
                        if (bijVarX == null) {
                        }
                    }
                    for (bij bijVarU = bwiVarO.U(zH); bijVarU != null && (bijVarU.o & ImageMetadata.SHADING_MODE) != 0; bijVarU = bijVarU.q) {
                        if ((bijVarU.n & ImageMetadata.SHADING_MODE) != 0) {
                            bup bupVarY = bijVarU;
                            ?? bdpVar = 0;
                            while (bupVarY != 0) {
                                if (bupVarY instanceof bwo) {
                                    ((bwo) bupVarY).a();
                                } else if ((bupVarY.n & ImageMetadata.SHADING_MODE) != 0 && (bupVarY instanceof bup)) {
                                    bij bijVar = bupVarY.y;
                                    int i = 0;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                    while (bijVar != null) {
                                        if ((bijVar.n & ImageMetadata.SHADING_MODE) != 0) {
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
                        if (bijVarU != bijVarX) {
                        }
                    }
                }
                bwiVarO.am();
            }
            bdp bdpVarI = p().i();
            Object[] objArr = bdpVarI.a;
            int i2 = bdpVarI.b;
            for (int i3 = 0; i3 < i2; i3++) {
                ((bvm) objArr[i3]).m().A();
            }
        }
    }

    public final void B() {
        if (this.f.k > 0) {
            bdp bdpVarI = p().i();
            Object[] objArr = bdpVarI.a;
            int i = bdpVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bvm bvmVar = (bvm) objArr[i2];
                bvq bvqVar = bvmVar.t;
                if ((bvqVar.i || bvqVar.j) && !bvqVar.n()) {
                    bvmVar.S(false);
                }
                bvqVar.o.B();
            }
        }
    }

    public final void C() {
        this.A = true;
        bvm bvmVarJ = p().j();
        j();
        bvm bvmVarP = p();
        bwi bwiVarN = bvmVarP.n();
        for (bwi bwiVarO = bvmVarP.o(); bwiVarO != bwiVarN; bwiVarO = ((bvh) bwiVarO).v) {
            bwiVarO.getClass();
        }
        if (0.0f != this.z) {
            this.z = 0.0f;
            if (bvmVarJ != null) {
                bvmVarJ.N();
            }
            if (bvmVarJ != null) {
                bvmVarJ.E();
            }
        }
        if (this.r) {
            p().n().ai();
        } else {
            if (bvmVarJ != null) {
                bvmVarJ.E();
            }
            I();
            if (this.g && bvmVarJ != null) {
                bvmVarJ.S(false);
            }
        }
        if (bvmVarJ == null) {
            this.i = 0;
        } else if (!this.g && bvmVarJ.aw() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                bqs.c("Place was called on a node which was placed already");
            }
            bvq bvqVar = bvmVarJ.t;
            int i = bvqVar.h;
            this.i = i;
            bvqVar.h = i + 1;
        }
        l();
    }

    public final boolean D(long j) throws Throwable {
        bvm bvmVarP = p();
        try {
            if (p().w) {
                bqs.b("measure is called on a deactivated node");
            }
            bws bwsVarA = bvp.a(p());
            bvm bvmVarJ = p().j();
            p().r = p().r || (bvmVarJ != null && bvmVarJ.r);
            if (!p().af() && a.q(this.d, j)) {
                bwsVarA.e(p(), false);
                p().V();
                return false;
            }
            this.v.f = false;
            k(aau.j);
            this.j = true;
            long j2 = q().c;
            v(j);
            if (F() != 5) {
                bqs.c("layout state is not idle before measure starts");
            }
            this.y = j;
            G(1);
            this.t = false;
            ((bxv) bvp.a(p())).t.c(p(), false, this.H);
            if (F() == 1) {
                y();
                G(5);
            }
            boolean z = (a.q(q().c, j2) && q().a == this.a && q().b == this.b) ? false : true;
            u((q().b & 4294967295L) | (q().a << 32));
            return z;
        } catch (Throwable th) {
            bvmVarP.as(th);
            throw new uer();
        }
    }

    public final void E(long j, uiq uiqVar, bmz bmzVar) {
        if (p().w) {
            bqs.b("place is called on a deactivated node");
        }
        G(3);
        boolean z = !this.k;
        this.m = j;
        this.n = uiqVar;
        this.o = bmzVar;
        this.k = true;
        this.A = false;
        bxv bxvVar = (bxv) bvp.a(p());
        bxvVar.k.e(p(), j, z);
        if (this.u || !this.r) {
            this.v.g = false;
            this.f.i(false);
            this.B = uiqVar;
            this.D = j;
            this.C = bmzVar;
            bxvVar.t.a(p(), false, this.J);
        } else {
            bwi bwiVarQ = q();
            bwiVarQ.at(chy.d(j, bwiVarQ.e), uiqVar, bmzVar);
            C();
        }
        G(5);
    }

    public final int F() {
        return this.f.q;
    }

    public final void G(int i) {
        this.f.q = i;
    }

    @Override // defpackage.bwb
    public final void N(boolean z) {
        if (z != q().i) {
            q().i = z;
            this.K = true;
        }
    }

    @Override // defpackage.bru
    public final int c(int i) {
        if (!byi.q(p())) {
            J();
            return q().c(i);
        }
        bvx bvxVarH = H();
        bvxVarH.getClass();
        return bvxVarH.c(i);
    }

    @Override // defpackage.bru
    public final int d(int i) {
        if (!byi.q(p())) {
            J();
            return q().d(i);
        }
        bvx bvxVarH = H();
        bvxVarH.getClass();
        return bvxVarH.d(i);
    }

    @Override // defpackage.bte
    public final void df(long j, uiq uiqVar) throws Throwable {
        K(j, uiqVar, null);
    }

    @Override // defpackage.bsu
    public final int dl(bqv bqvVar) {
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || bvmVarJ.aw() != 1) {
            bvm bvmVarJ2 = p().j();
            if (bvmVarJ2 != null && bvmVarJ2.aw() == 3) {
                this.v.d = true;
            }
        } else {
            this.v.c = true;
        }
        this.l = true;
        int iDl = q().dl(bqvVar);
        this.l = false;
        return iDl;
    }

    @Override // defpackage.bru
    public final int e(int i) {
        if (!byi.q(p())) {
            J();
            return q().e(i);
        }
        bvx bvxVarH = H();
        bvxVarH.getClass();
        return bvxVarH.e(i);
    }

    @Override // defpackage.bru
    public final int f(int i) {
        if (!byi.q(p())) {
            J();
            return q().f(i);
        }
        bvx bvxVarH = H();
        bvxVarH.getClass();
        return bvxVarH.f(i);
    }

    @Override // defpackage.bte, defpackage.bru
    public final Object g() {
        return this.q;
    }

    @Override // defpackage.bug
    public final buf h() {
        return this.v;
    }

    @Override // defpackage.bug
    public final bug i() {
        bvq bvqVar;
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || (bvqVar = bvmVarJ.t) == null) {
            return null;
        }
        return bvqVar.o;
    }

    @Override // defpackage.bug
    public final bwi j() {
        return p().n();
    }

    @Override // defpackage.bug
    public final void k(uiq uiqVar) {
        bdp bdpVarI = p().i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            uiqVar.a(((bvm) objArr[i2]).t.o);
        }
    }

    @Override // defpackage.bug
    public final void l() {
        this.x = true;
        buf bufVar = this.v;
        bufVar.g();
        if (this.u) {
            bdp bdpVarI = p().i();
            Object[] objArr = bdpVarI.a;
            int i = bdpVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bvm bvmVar = (bvm) objArr[i2];
                if (bvmVar.af() && bvmVar.ax() == 1 && bvmVar.ak(bvmVar.t.b())) {
                    bvm.ar(p(), false, 7);
                }
            }
        }
        if (this.F || (!this.l && !j().k && this.u)) {
            this.u = false;
            int iF = F();
            G(3);
            bvq bvqVar = this.f;
            bvqVar.j(false);
            bvm bvmVarP = p();
            ((bxv) bvp.a(bvmVarP)).t.b(bvmVarP, false, this.I);
            G(iF);
            if (j().k && bvqVar.i) {
                m();
            }
            this.F = false;
        }
        if (bufVar.d) {
            bufVar.e = true;
        }
        if (bufVar.b && bufVar.j()) {
            bufVar.f();
        }
        this.x = false;
    }

    @Override // defpackage.bug
    public final void m() {
        p().S(false);
    }

    @Override // defpackage.bug
    public final void n() {
        bvm.ar(p(), false, 7);
    }

    @Override // defpackage.bug
    public final boolean o() {
        return this.r;
    }

    public final bvm p() {
        return this.f.a;
    }

    public final bwi q() {
        return this.f.a();
    }

    @Override // defpackage.bsq
    public final bte r(long j) throws Throwable {
        int i = 3;
        if (p().x == 3) {
            p().x();
        }
        if (byi.q(p())) {
            bvx bvxVarH = H();
            bvxVarH.getClass();
            bvxVarH.w = 3;
            bvxVarH.r(j);
        }
        bvm bvmVarP = p();
        bvm bvmVarJ = bvmVarP.j();
        if (bvmVarJ != null) {
            if (this.E != 3 && !bvmVarP.r) {
                bqs.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAw = bvmVarJ.aw();
            int i2 = iAw - 1;
            if (iAw == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAw2 = bvmVarJ.aw();
                    Objects.toString(bko.s(iAw2));
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(bko.s(iAw2)));
                }
                i = 2;
            }
        }
        this.E = i;
        D(j);
        return this;
    }

    @Override // defpackage.bte
    public final int s() {
        return q().s();
    }

    @Override // defpackage.bte
    public final int t() {
        return q().t();
    }

    @Override // defpackage.bte
    public final void w(long j, bmz bmzVar) throws Throwable {
        K(j, null, bmzVar);
    }

    public final List x() {
        p().aa();
        if (!this.w) {
            return this.G.e();
        }
        bvm bvmVarP = p();
        bdp bdpVar = this.G;
        bdp bdpVarI = bvmVarP.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar = (bvm) objArr[i2];
            if (bdpVar.b <= i2) {
                bdpVar.n(bvmVar.t.o);
            } else {
                bdpVar.d(i2, bvmVar.t.o);
            }
        }
        bdpVar.h(bvmVarP.t().size(), bdpVar.b);
        this.w = false;
        return bdpVar.e();
    }

    public final void y() {
        this.u = true;
        this.F = true;
    }

    public final void z() {
        this.t = true;
    }
}
