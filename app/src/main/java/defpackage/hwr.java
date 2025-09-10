package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwr {
    private long i;
    private long j;
    private float k;
    private int m;
    private final double[] a = new double[16];
    private final ocq r = new ocq((byte[]) null);
    private final ocq s = new ocq((byte[]) null);
    private final ocq t = new ocq((byte[]) null);
    private final ocq u = new ocq((byte[]) null);
    private final ocq v = new ocq((byte[]) null);
    private final ocq w = new ocq((byte[]) null);
    private final ocq x = new ocq((byte[]) null);
    private final ocq y = new ocq((byte[]) null);
    private final ocq z = new ocq((byte[]) null);
    private final nni b = new nni();
    private final nni c = new nni();
    private final nni d = new nni();
    private final nni e = new nni();
    private final nni f = new nni();
    private final nni g = new nni();
    private final nni h = new nni();
    private final qrh L = new qrh(null);
    private boolean l = false;
    private boolean n = true;
    private final ocq A = new ocq((byte[]) null);
    private final ocq B = new ocq((byte[]) null);
    private final ocq C = new ocq((byte[]) null);
    private final ocq D = new ocq((byte[]) null);
    private final ocq E = new ocq((byte[]) null);
    private final ocq F = new ocq((byte[]) null);
    private final ocq G = new ocq((byte[]) null);
    private final ocq H = new ocq((byte[]) null);
    private final nni o = new nni();
    private final nni p = new nni();
    private final nni q = new nni();
    private final ocq I = new ocq((byte[]) null);
    private final ocq J = new ocq((byte[]) null);
    private final ocq K = new ocq((byte[]) null);

    private hwr() {
    }

    public static hwr b() {
        hwr hwrVar = new hwr();
        hwrVar.e();
        return hwrVar;
    }

    private final void i() {
        ocq ocqVar = this.s;
        ocq ocqVar2 = this.I;
        ocqVar.o(ocqVar2);
        ocq ocqVar3 = this.J;
        ocq ocqVar4 = this.t;
        ocq.l(ocqVar4, ocqVar2, ocqVar3);
        ocq.l(ocqVar, ocqVar3, ocqVar4);
        ocqVar.h();
    }

    private final void j(ocq ocqVar, nni nniVar) {
        nni nniVar2 = this.g;
        nni nniVar3 = this.d;
        ocq.m(ocqVar, nniVar2, nniVar3);
        nni nniVar4 = this.c;
        ocq ocqVar2 = this.K;
        qrh qrhVar = this.L;
        qrhVar.h(nniVar3, nniVar4, ocqVar2);
        double d = ocqVar2.d(0, 0) + ocqVar2.d(1, 1) + ocqVar2.d(2, 2);
        nniVar.g((ocqVar2.d(2, 1) - ocqVar2.d(1, 2)) / 2.0d, (ocqVar2.d(0, 2) - ocqVar2.d(2, 0)) / 2.0d, (ocqVar2.d(1, 0) - ocqVar2.d(0, 1)) / 2.0d);
        double d2 = (d - 1.0d) * 0.5d;
        double dB = nniVar.b();
        if (d2 > 0.7071067811865476d) {
            if (dB > 0.0d) {
                nniVar.e(Math.asin(dB) / dB);
                return;
            }
            return;
        }
        if (d2 > -0.7071067811865476d) {
            nniVar.e(Math.acos(d2) / dB);
            return;
        }
        double dAsin = 3.141592653589793d - Math.asin(dB);
        double d3 = ocqVar2.d(0, 0) - d2;
        double d4 = ocqVar2.d(1, 1) - d2;
        double d5 = ocqVar2.d(2, 2) - d2;
        Object obj = qrhVar.d;
        double d6 = d3 * d3;
        double d7 = d4 * d4;
        double d8 = d5 * d5;
        if (d6 > d7 && d6 > d8) {
            ((nni) obj).g(d3, (ocqVar2.d(1, 0) + ocqVar2.d(0, 1)) / 2.0d, (ocqVar2.d(0, 2) + ocqVar2.d(2, 0)) / 2.0d);
        } else if (d7 > d8) {
            ((nni) obj).g((ocqVar2.d(1, 0) + ocqVar2.d(0, 1)) / 2.0d, d4, (ocqVar2.d(2, 1) + ocqVar2.d(1, 2)) / 2.0d);
        } else {
            ((nni) obj).g((ocqVar2.d(0, 2) + ocqVar2.d(2, 0)) / 2.0d, (ocqVar2.d(2, 1) + ocqVar2.d(1, 2)) / 2.0d, d5);
        }
        nni nniVar5 = (nni) obj;
        if (nni.a(nniVar5, nniVar) < 0.0d) {
            nniVar5.e(-1.0d);
        }
        nniVar5.d();
        nniVar5.e(dAsin);
        nniVar.f(nniVar5);
    }

    public final double a() {
        ocq ocqVar = this.r;
        double d = ocqVar.d(2, 0);
        double d2 = ocqVar.d(2, 1);
        if (Math.sqrt((d * d) + (d2 * d2)) < 0.1d) {
            return 0.0d;
        }
        double dAtan2 = (-90.0d) - ((Math.atan2(d2, d) / 3.141592653589793d) * 180.0d);
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return dAtan2 >= 360.0d ? dAtan2 - 360.0d : dAtan2;
    }

    public final synchronized void c(float[] fArr, long j) {
        double d = fArr[0];
        double d2 = fArr[1];
        double d3 = fArr[2];
        nni nniVar = this.c;
        nniVar.g(d, d2, d3);
        if (this.j != 0) {
            ocq ocqVar = this.r;
            nni nniVar2 = this.b;
            j(ocqVar, nniVar2);
            for (int i = 0; i < 3; i++) {
                nni nniVar3 = this.q;
                nniVar3.h();
                if (i == 0) {
                    nniVar3.a = 1.0E-7d;
                } else if (i == 1) {
                    nniVar3.b = 1.0E-7d;
                } else {
                    nniVar3.c = 1.0E-7d;
                }
                ocq ocqVar2 = this.D;
                qrh.i(nniVar3, ocqVar2);
                ocq ocqVar3 = this.E;
                ocq.l(ocqVar2, ocqVar, ocqVar3);
                nni nniVar4 = this.o;
                j(ocqVar3, nniVar4);
                nni nniVar5 = this.p;
                nniVar5.g(nniVar2.a - nniVar4.a, nniVar2.b - nniVar4.b, nniVar2.c - nniVar4.c);
                nniVar5.e(1.0E7d);
                this.y.g(i, nniVar5);
            }
            ocq ocqVar4 = this.y;
            ocq ocqVar5 = this.F;
            ocqVar4.o(ocqVar5);
            ocq ocqVar6 = this.t;
            ocq ocqVar7 = this.G;
            ocq.l(ocqVar6, ocqVar5, ocqVar7);
            ocq ocqVar8 = this.H;
            ocq.l(ocqVar4, ocqVar7, ocqVar8);
            ocq ocqVar9 = this.w;
            ocq ocqVar10 = this.x;
            Object obj = ocqVar8.a;
            double d4 = ((double[]) obj)[0];
            Object obj2 = ocqVar9.a;
            double d5 = d4 + ((double[]) obj2)[0];
            Object obj3 = ocqVar10.a;
            ((double[]) obj3)[0] = d5;
            ((double[]) obj3)[1] = ((double[]) obj)[1] + ((double[]) obj2)[1];
            ((double[]) obj3)[2] = ((double[]) obj)[2] + ((double[]) obj2)[2];
            ((double[]) obj3)[3] = ((double[]) obj)[3] + ((double[]) obj2)[3];
            ((double[]) obj3)[4] = ((double[]) obj)[4] + ((double[]) obj2)[4];
            ((double[]) obj3)[5] = ((double[]) obj)[5] + ((double[]) obj2)[5];
            ((double[]) obj3)[6] = ((double[]) obj)[6] + ((double[]) obj2)[6];
            ((double[]) obj3)[7] = ((double[]) obj)[7] + ((double[]) obj2)[7];
            ((double[]) obj3)[8] = ((double[]) obj)[8] + ((double[]) obj2)[8];
            ocqVar10.p(ocqVar5);
            ocqVar4.o(ocqVar7);
            ocq.l(ocqVar7, ocqVar5, ocqVar8);
            ocq ocqVar11 = this.z;
            ocq.l(ocqVar6, ocqVar8, ocqVar11);
            nni nniVar6 = this.f;
            ocq.m(ocqVar11, nniVar2, nniVar6);
            ocq.l(ocqVar11, ocqVar4, ocqVar5);
            ocqVar7.h();
            Object obj4 = ocqVar7.a;
            double d6 = ((double[]) obj4)[0];
            Object obj5 = ocqVar5.a;
            ((double[]) obj4)[0] = d6 - ((double[]) obj5)[0];
            ((double[]) obj4)[1] = ((double[]) obj4)[1] - ((double[]) obj5)[1];
            ((double[]) obj4)[2] = ((double[]) obj4)[2] - ((double[]) obj5)[2];
            ((double[]) obj4)[3] = ((double[]) obj4)[3] - ((double[]) obj5)[3];
            ((double[]) obj4)[4] = ((double[]) obj4)[4] - ((double[]) obj5)[4];
            ((double[]) obj4)[5] = ((double[]) obj4)[5] - ((double[]) obj5)[5];
            ((double[]) obj4)[6] = ((double[]) obj4)[6] - ((double[]) obj5)[6];
            ((double[]) obj4)[7] = ((double[]) obj4)[7] - ((double[]) obj5)[7];
            ((double[]) obj4)[8] = ((double[]) obj4)[8] - ((double[]) obj5)[8];
            ocq.l(ocqVar7, ocqVar6, ocqVar5);
            ocqVar6.n(ocqVar5);
            ocq ocqVar12 = this.s;
            qrh.i(nniVar6, ocqVar12);
            ocq.l(ocqVar12, ocqVar, ocqVar);
            i();
        } else {
            this.L.h(this.g, nniVar, this.r);
        }
        this.j = j;
    }

    public final synchronized void d(float[] fArr, long j) {
        if (this.i != 0) {
            float f = (j - r4) * 1.0E-9f;
            if (f > 0.04f) {
                f = this.n ? this.k : 0.01f;
            } else if (this.l) {
                this.k = (this.k * 0.95f) + (0.050000012f * f);
                int i = this.m + 1;
                this.m = i;
                if (i > 10.0f) {
                    this.n = true;
                }
            } else {
                this.k = f;
                this.m = 1;
                this.l = true;
            }
            nni nniVar = this.e;
            float f2 = -f;
            nniVar.g(fArr[0] * f2, fArr[1] * f2, fArr[2] * f2);
            ocq ocqVar = this.s;
            qrh.i(nniVar, ocqVar);
            ocq ocqVar2 = this.B;
            ocq ocqVar3 = this.r;
            ocqVar2.n(ocqVar3);
            ocq.l(ocqVar, ocqVar3, ocqVar2);
            ocqVar3.n(ocqVar2);
            i();
            ocq ocqVar4 = this.C;
            ocqVar4.n(this.u);
            Object obj = ocqVar4.a;
            double d = f * f;
            ((double[]) obj)[0] = ((double[]) obj)[0] * d;
            ((double[]) obj)[1] = ((double[]) obj)[1] * d;
            ((double[]) obj)[2] = ((double[]) obj)[2] * d;
            ((double[]) obj)[3] = ((double[]) obj)[3] * d;
            ((double[]) obj)[4] = ((double[]) obj)[4] * d;
            ((double[]) obj)[5] = ((double[]) obj)[5] * d;
            ((double[]) obj)[6] = ((double[]) obj)[6] * d;
            ((double[]) obj)[7] = ((double[]) obj)[7] * d;
            ((double[]) obj)[8] = ((double[]) obj)[8] * d;
            Object obj2 = this.t.a;
            ((double[]) obj2)[0] = ((double[]) obj2)[0] + ((double[]) obj)[0];
            ((double[]) obj2)[1] = ((double[]) obj2)[1] + ((double[]) obj)[1];
            ((double[]) obj2)[2] = ((double[]) obj2)[2] + ((double[]) obj)[2];
            ((double[]) obj2)[3] = ((double[]) obj2)[3] + ((double[]) obj)[3];
            ((double[]) obj2)[4] = ((double[]) obj2)[4] + ((double[]) obj)[4];
            ((double[]) obj2)[5] = ((double[]) obj2)[5] + ((double[]) obj)[5];
            ((double[]) obj2)[6] = ((double[]) obj2)[6] + ((double[]) obj)[6];
            ((double[]) obj2)[7] = ((double[]) obj2)[7] + ((double[]) obj)[7];
            ((double[]) obj2)[8] = ((double[]) obj2)[8] + ((double[]) obj)[8];
        }
        this.i = j;
    }

    public final void e() {
        this.i = 0L;
        this.j = 0L;
        this.r.h();
        this.s.h();
        ocq ocqVar = this.t;
        ocqVar.j();
        ocqVar.i(25.0d);
        ocq ocqVar2 = this.u;
        ocqVar2.j();
        ocqVar2.i(1.0d);
        ocq ocqVar3 = this.v;
        ocqVar3.j();
        ocqVar3.i(0.0625d);
        ocq ocqVar4 = this.w;
        ocqVar4.j();
        ocqVar4.i(0.5625d);
        this.x.j();
        this.y.j();
        this.z.j();
        this.b.h();
        this.c.h();
        this.d.h();
        this.e.h();
        this.f.h();
        this.g.g(0.0d, 0.0d, 9.81d);
        this.h.g(0.0d, 1.0d, 0.0d);
    }

    public final synchronized void f(double d) {
        double dA = ((d - a()) / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(dA);
        double dCos = Math.cos(dA);
        double[][] dArr = {new double[]{dCos, -dSin, 0.0d}, new double[]{dSin, dCos, 0.0d}, new double[]{0.0d, 0.0d, 1.0d}};
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        double d4 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d5 = dArr3[0];
        double d6 = dArr3[1];
        double d7 = dArr3[2];
        double[] dArr4 = dArr[2];
        double d8 = dArr4[0];
        double d9 = dArr4[1];
        double d10 = dArr4[2];
        ocq ocqVar = this.A;
        ocqVar.f(d2, d3, d4, d5, d6, d7, d8, d9, d10);
        ocq ocqVar2 = this.r;
        ocq.l(ocqVar2, ocqVar, ocqVar2);
    }

    public final boolean g() {
        return this.j != 0;
    }

    public final double[] h() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.a[(i2 * 4) + i] = this.r.d(i, i2);
            }
        }
        double[] dArr = this.a;
        dArr[11] = 0.0d;
        dArr[7] = 0.0d;
        dArr[3] = 0.0d;
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[15] = 1.0d;
        return dArr;
    }
}
