package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sgg {
    public final Object a;
    public int b;
    public int c;
    public long d;
    public sgg e;
    public sgg f;
    public sgg g;
    public sgg h;
    private int i;

    public sgg() {
        this.a = null;
        this.b = 1;
    }

    private final int j() {
        return k(this.e) - k(this.f);
    }

    private static int k(sgg sggVar) {
        if (sggVar == null) {
            return 0;
        }
        return sggVar.i;
    }

    private static long l(sgg sggVar) {
        if (sggVar == null) {
            return 0L;
        }
        return sggVar.d;
    }

    private final sgg m() {
        int i = this.b;
        this.b = 0;
        sgi.u(e(), g());
        sgg sggVar = this.e;
        if (sggVar == null) {
            return this.f;
        }
        sgg sggVar2 = this.f;
        if (sggVar2 == null) {
            return sggVar;
        }
        long j = i;
        if (sggVar.i >= sggVar2.i) {
            sgg sggVarE = e();
            sggVarE.e = this.e.o(sggVarE);
            sggVarE.f = this.f;
            sggVarE.c = this.c - 1;
            sggVarE.d = this.d - j;
            return sggVarE.n();
        }
        sgg sggVarG = g();
        sggVarG.f = this.f.p(sggVarG);
        sggVarG.e = this.e;
        sggVarG.c = this.c - 1;
        sggVarG.d = this.d - j;
        return sggVarG.n();
    }

    private final sgg n() {
        int iJ = j();
        if (iJ == -2) {
            sgg sggVar = this.f;
            sggVar.getClass();
            if (sggVar.j() > 0) {
                this.f = this.f.r();
            }
            return q();
        }
        if (iJ != 2) {
            t();
            return this;
        }
        sgg sggVar2 = this.e;
        sggVar2.getClass();
        if (sggVar2.j() < 0) {
            this.e = this.e.q();
        }
        return r();
    }

    private final sgg o(sgg sggVar) {
        sgg sggVar2 = this.f;
        if (sggVar2 == null) {
            return this.e;
        }
        this.f = sggVar2.o(sggVar);
        this.c--;
        this.d -= sggVar.b;
        return n();
    }

    private final sgg p(sgg sggVar) {
        sgg sggVar2 = this.e;
        if (sggVar2 == null) {
            return this.f;
        }
        this.e = sggVar2.p(sggVar);
        this.c--;
        this.d -= sggVar.b;
        return n();
    }

    private final sgg q() {
        rnt.L(this.f != null);
        sgg sggVar = this.f;
        this.f = sggVar.e;
        sggVar.e = this;
        sggVar.d = this.d;
        sggVar.c = this.c;
        s();
        sggVar.t();
        return sggVar;
    }

    private final sgg r() {
        rnt.L(this.e != null);
        sgg sggVar = this.e;
        this.e = sggVar.f;
        sggVar.f = this;
        sggVar.d = this.d;
        sggVar.c = this.c;
        s();
        sggVar.t();
        return sggVar;
    }

    private final void s() {
        sgg sggVar = this.e;
        int iT = sgi.t(sggVar) + 1;
        sgg sggVar2 = this.f;
        this.c = iT + sgi.t(sggVar2);
        this.d = this.b + l(sggVar) + l(sggVar2);
        t();
    }

    private final void t() {
        this.i = Math.max(k(this.e), k(this.f)) + 1;
    }

    final int a(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar == null) {
                return 0;
            }
            return sggVar.a(comparator, obj);
        }
        if (iCompare <= 0) {
            return this.b;
        }
        sgg sggVar2 = this.f;
        if (sggVar2 != null) {
            return sggVar2.a(comparator, obj);
        }
        return 0;
    }

    final sgg b(Comparator comparator, Object obj, int i, int[] iArr) {
        long j = i;
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar == null) {
                iArr[0] = 0;
                this.e = new sgg(obj, i);
                sgi.v(e(), this.e, this);
                this.i = Math.max(2, this.i);
                this.c++;
                this.d += j;
                return this;
            }
            int i2 = sggVar.i;
            sgg sggVarB = sggVar.b(comparator, obj, i, iArr);
            this.e = sggVarB;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += j;
            return sggVarB.i == i2 ? this : n();
        }
        if (iCompare <= 0) {
            int i3 = this.b;
            iArr[0] = i3;
            a.I(((long) i3) + j <= 2147483647L);
            this.b += i;
            this.d += j;
            return this;
        }
        sgg sggVar2 = this.f;
        if (sggVar2 != null) {
            int i4 = sggVar2.i;
            sgg sggVarB2 = sggVar2.b(comparator, obj, i, iArr);
            this.f = sggVarB2;
            if (iArr[0] == 0) {
                this.c++;
            }
            this.d += j;
            return sggVarB2.i != i4 ? n() : this;
        }
        iArr[0] = 0;
        sgg sggVar3 = new sgg(obj, i);
        this.f = sggVar3;
        sgi.v(this, sggVar3, g());
        this.i = Math.max(2, this.i);
        this.c++;
        this.d += j;
        return this;
    }

    public final sgg c(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar != null) {
                return (sgg) rnt.X(sggVar.c(comparator, obj), this);
            }
        } else if (iCompare != 0) {
            sgg sggVar2 = this.f;
            if (sggVar2 == null) {
                return null;
            }
            return sggVar2.c(comparator, obj);
        }
        return this;
    }

    public final sgg d(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare > 0) {
            sgg sggVar = this.f;
            if (sggVar != null) {
                return (sgg) rnt.X(sggVar.d(comparator, obj), this);
            }
        } else if (iCompare != 0) {
            sgg sggVar2 = this.e;
            if (sggVar2 == null) {
                return null;
            }
            return sggVar2.d(comparator, obj);
        }
        return this;
    }

    public final sgg e() {
        sgg sggVar = this.g;
        sggVar.getClass();
        return sggVar;
    }

    final sgg f(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar != null) {
                this.e = sggVar.f(comparator, obj, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.c--;
                        this.d -= i2;
                    } else {
                        this.d -= i;
                    }
                }
                return i2 == 0 ? this : n();
            }
        } else {
            if (iCompare <= 0) {
                int i3 = this.b;
                iArr[0] = i3;
                if (i >= i3) {
                    return m();
                }
                this.b = i3 - i;
                this.d -= i;
                return this;
            }
            sgg sggVar2 = this.f;
            if (sggVar2 != null) {
                this.f = sggVar2.f(comparator, obj, i, iArr);
                int i4 = iArr[0];
                if (i4 > 0) {
                    if (i >= i4) {
                        this.c--;
                        this.d -= i4;
                    } else {
                        this.d -= i;
                    }
                }
                return n();
            }
        }
        iArr[0] = 0;
        return this;
    }

    public final sgg g() {
        sgg sggVar = this.h;
        sggVar.getClass();
        return sggVar;
    }

    final sgg h(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar != null) {
                this.e = sggVar.h(comparator, obj, i, iArr);
                int i2 = iArr[0];
                if (i2 == i) {
                    if (i2 != 0) {
                        this.c--;
                    }
                    this.d += -i2;
                }
                return n();
            }
        } else {
            if (iCompare <= 0) {
                int i3 = this.b;
                iArr[0] = i3;
                return i == i3 ? m() : this;
            }
            sgg sggVar2 = this.f;
            if (sggVar2 != null) {
                this.f = sggVar2.h(comparator, obj, i, iArr);
                int i4 = iArr[0];
                if (i4 == i) {
                    if (i4 != 0) {
                        this.c--;
                    }
                    this.d += -i4;
                }
                return n();
            }
        }
        iArr[0] = 0;
        return this;
    }

    final sgg i(Comparator comparator, Object obj, int[] iArr) {
        int iCompare = comparator.compare(obj, this.a);
        if (iCompare < 0) {
            sgg sggVar = this.e;
            if (sggVar != null) {
                this.e = sggVar.i(comparator, obj, iArr);
                if (iArr[0] != 0) {
                    this.c--;
                }
                this.d += -r3;
                return n();
            }
        } else {
            if (iCompare <= 0) {
                iArr[0] = this.b;
                return m();
            }
            sgg sggVar2 = this.f;
            if (sggVar2 != null) {
                this.f = sggVar2.i(comparator, obj, iArr);
                if (iArr[0] != 0) {
                    this.c--;
                }
                this.d += -r3;
                return n();
            }
        }
        iArr[0] = 0;
        return this;
    }

    public final String toString() {
        return new sei(this.a, this.b).toString();
    }

    public sgg(Object obj, int i) {
        a.I(i > 0);
        this.a = obj;
        this.b = i;
        this.d = i;
        this.c = 1;
        this.i = 1;
        this.e = null;
        this.f = null;
    }
}
