package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class too {
    public final ton a;
    public int b;
    public int c = 0;
    private int d;

    private too(ton tonVar) {
        byte[] bArr = tpx.b;
        this.a = tonVar;
        tonVar.e = this;
    }

    private final void Q(Object obj, trg trgVar, tow towVar) {
        int i = this.d;
        this.d = tsa.c(tsa.a(this.b), 4);
        try {
            trgVar.l(obj, this, towVar);
            if (this.b == this.d) {
            } else {
                throw new tpz("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, trg trgVar, tow towVar) throws tpz {
        ton tonVar = this.a;
        int iN = tonVar.n();
        tonVar.N();
        int iE = tonVar.e(iN);
        tonVar.b++;
        trgVar.l(obj, this, towVar);
        tonVar.z(0);
        tonVar.b--;
        tonVar.A(iE);
    }

    private final void S(int i) throws tpz {
        if (this.a.d() != i) {
            throw new tpz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void T(int i) throws tpz {
        if ((i & 3) != 0) {
            throw new tpz("Failed to parse the message.");
        }
    }

    private static final void U(int i) throws tpz {
        if ((i & 7) != 0) {
            throw new tpz("Failed to parse the message.");
        }
    }

    public static too p(ton tonVar) {
        too tooVar = tonVar.e;
        return tooVar != null ? tooVar : new too(tonVar);
    }

    public final void A(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tpiVar.g(tonVar.f());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.f());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Integer.valueOf(tonVar3.f()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.f()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void B(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB == 2) {
                ton tonVar = this.a;
                int iN = tonVar.n();
                T(iN);
                int iD = tonVar.d() + iN;
                do {
                    tpiVar.g(tonVar.g());
                } while (tonVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new tpy();
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.g());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 == 2) {
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                T(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(tonVar3.g()));
                } while (tonVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new tpy();
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.g()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void C(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tqh) {
            tqh tqhVar = (tqh) list;
            int iB = tsa.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iN = tonVar.n();
                U(iN);
                int iD = tonVar.d() + iN;
                do {
                    tqhVar.f(tonVar.o());
                } while (tonVar.d() < iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tqhVar.f(tonVar2.o());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                U(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(tonVar3.o()));
                } while (tonVar3.d() < iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Long.valueOf(tonVar4.o()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void D(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpa) {
            tpa tpaVar = (tpa) list;
            int iB = tsa.b(this.b);
            if (iB == 2) {
                ton tonVar = this.a;
                int iN = tonVar.n();
                T(iN);
                int iD = tonVar.d() + iN;
                do {
                    tpaVar.g(tonVar.c());
                } while (tonVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new tpy();
            }
            do {
                ton tonVar2 = this.a;
                tpaVar.g(tonVar2.c());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 == 2) {
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                T(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(tonVar3.c()));
                } while (tonVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new tpy();
            }
            do {
                ton tonVar4 = this.a;
                list.add(Float.valueOf(tonVar4.c()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void E(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tpiVar.g(tonVar.h());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.h());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Integer.valueOf(tonVar3.h()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.h()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void F(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tqh) {
            tqh tqhVar = (tqh) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tqhVar.f(tonVar.p());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tqhVar.f(tonVar2.p());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Long.valueOf(tonVar3.p()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Long.valueOf(tonVar4.p()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void G(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB == 2) {
                ton tonVar = this.a;
                int iN = tonVar.n();
                T(iN);
                int iD = tonVar.d() + iN;
                do {
                    tpiVar.g(tonVar.k());
                } while (tonVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new tpy();
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.k());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 == 2) {
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                T(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(tonVar3.k()));
                } while (tonVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new tpy();
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.k()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void H(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tqh) {
            tqh tqhVar = (tqh) list;
            int iB = tsa.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iN = tonVar.n();
                U(iN);
                int iD = tonVar.d() + iN;
                do {
                    tqhVar.f(tonVar.t());
                } while (tonVar.d() < iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tqhVar.f(tonVar2.t());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                U(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(tonVar3.t()));
                } while (tonVar3.d() < iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Long.valueOf(tonVar4.t()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void I(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tpiVar.g(tonVar.l());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.l());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Integer.valueOf(tonVar3.l()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.l()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void J(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tqh) {
            tqh tqhVar = (tqh) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tqhVar.f(tonVar.u());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tqhVar.f(tonVar2.u());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Long.valueOf(tonVar3.u()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Long.valueOf(tonVar4.u()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list, boolean z) throws tpy {
        int iM;
        int iM2;
        if (tsa.b(this.b) != 2) {
            throw new tpy();
        }
        if ((list instanceof tqf) && !z) {
            tqf tqfVar = (tqf) list;
            do {
                o();
                tqfVar.b();
                ton tonVar = this.a;
                if (tonVar.C()) {
                    return;
                } else {
                    iM2 = tonVar.m();
                }
            } while (iM2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                ton tonVar2 = this.a;
                if (tonVar2.C()) {
                    return;
                } else {
                    iM = tonVar2.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void L(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tpi) {
            tpi tpiVar = (tpi) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tpiVar.g(tonVar.n());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tpiVar.g(tonVar2.n());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Integer.valueOf(tonVar3.n()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Integer.valueOf(tonVar4.n()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void M(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tqh) {
            tqh tqhVar = (tqh) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    tqhVar.f(tonVar.v());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                tqhVar.f(tonVar2.v());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Long.valueOf(tonVar3.v()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Long.valueOf(tonVar4.v()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void N(int i) throws tpy {
        if (tsa.b(this.b) != i) {
            throw new tpy();
        }
    }

    public final boolean O() throws tpy {
        N(0);
        return this.a.D();
    }

    public final boolean P() {
        int i;
        ton tonVar = this.a;
        if (tonVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return tonVar.E(i);
    }

    public final double a() throws tpy {
        N(1);
        return this.a.b();
    }

    public final float b() throws tpy {
        N(5);
        return this.a.c();
    }

    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.b = iM;
            this.c = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        if (iM == 0 || iM == this.d) {
            return Integer.MAX_VALUE;
        }
        return tsa.a(iM);
    }

    public final int d() throws tpy {
        N(0);
        return this.a.f();
    }

    public final int e() throws tpy {
        N(5);
        return this.a.g();
    }

    public final int f() throws tpy {
        N(0);
        return this.a.h();
    }

    public final int g() throws tpy {
        N(5);
        return this.a.k();
    }

    public final int h() throws tpy {
        N(0);
        return this.a.l();
    }

    public final int i() throws tpy {
        N(0);
        return this.a.n();
    }

    public final long j() throws tpy {
        N(1);
        return this.a.o();
    }

    public final long k() throws tpy {
        N(0);
        return this.a.p();
    }

    public final long l() throws tpy {
        N(1);
        return this.a.t();
    }

    public final long m() throws tpy {
        N(0);
        return this.a.u();
    }

    public final long n() throws tpy {
        N(0);
        return this.a.v();
    }

    public final toj o() throws tpy {
        N(2);
        return this.a.w();
    }

    public final Object q(Ctry ctry, Class cls, tow towVar) {
        Ctry ctry2 = Ctry.DOUBLE;
        switch (ctry.ordinal()) {
            case 0:
                return Double.valueOf(a());
            case 1:
                return Float.valueOf(b());
            case 2:
                return Long.valueOf(k());
            case 3:
                return Long.valueOf(n());
            case 4:
                return Integer.valueOf(f());
            case 5:
                return Long.valueOf(j());
            case 6:
                return Integer.valueOf(e());
            case 7:
                return Boolean.valueOf(O());
            case 8:
                return v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return t(cls, towVar);
            case 11:
                return o();
            case 12:
                return Integer.valueOf(i());
            case 13:
                return Integer.valueOf(d());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(g());
            case 15:
                return Long.valueOf(l());
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(m());
        }
    }

    public final Object r(trg trgVar, tow towVar) {
        Object objE = trgVar.e();
        Q(objE, trgVar, towVar);
        trgVar.g(objE);
        return objE;
    }

    public final Object s(trg trgVar, tow towVar) throws tpz {
        Object objE = trgVar.e();
        R(objE, trgVar, towVar);
        trgVar.g(objE);
        return objE;
    }

    public final Object t(Class cls, tow towVar) {
        N(2);
        return s(tra.a.a(cls), towVar);
    }

    public final String u() throws tpy {
        N(2);
        return this.a.x();
    }

    public final String v() throws tpy {
        N(2);
        return this.a.y();
    }

    public final void w(Object obj, trg trgVar, tow towVar) throws tpy {
        N(3);
        Q(obj, trgVar, towVar);
    }

    public final void x(Object obj, trg trgVar, tow towVar) throws tpz {
        N(2);
        R(obj, trgVar, towVar);
    }

    public final void y(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof toa) {
            toa toaVar = (toa) list;
            int iB = tsa.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iD = tonVar.d() + tonVar.n();
                do {
                    toaVar.f(tonVar.D());
                } while (tonVar.d() < iD);
                S(iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                toaVar.f(tonVar2.D());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iD2 = tonVar3.d() + tonVar3.n();
                do {
                    list.add(Boolean.valueOf(tonVar3.D()));
                } while (tonVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Boolean.valueOf(tonVar4.D()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void z(List list) throws tpz {
        int iM;
        int iM2;
        if (list instanceof tot) {
            tot totVar = (tot) list;
            int iB = tsa.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new tpy();
                }
                ton tonVar = this.a;
                int iN = tonVar.n();
                U(iN);
                int iD = tonVar.d() + iN;
                do {
                    totVar.f(tonVar.b());
                } while (tonVar.d() < iD);
                return;
            }
            do {
                ton tonVar2 = this.a;
                totVar.f(tonVar2.b());
                if (tonVar2.C()) {
                    return;
                } else {
                    iM2 = tonVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = tsa.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new tpy();
                }
                ton tonVar3 = this.a;
                int iN2 = tonVar3.n();
                U(iN2);
                int iD2 = tonVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(tonVar3.b()));
                } while (tonVar3.d() < iD2);
                return;
            }
            do {
                ton tonVar4 = this.a;
                list.add(Double.valueOf(tonVar4.b()));
                if (tonVar4.C()) {
                    return;
                } else {
                    iM = tonVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}
