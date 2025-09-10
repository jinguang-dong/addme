package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class usx extends utr implements usr, urk, uuj {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public usx(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object f(defpackage.usx r17, defpackage.url r18, defpackage.uhb r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usx.f(usx, url, uhb):java.lang.Object");
    }

    private final int n() {
        return (int) ((e() + this.h) - this.b);
    }

    private final int o() {
        return this.h + this.i;
    }

    private final long p() {
        return e() + this.h;
    }

    private final long q() {
        return e() + this.h + this.i;
    }

    private final long r(usz uszVar) {
        long j = uszVar.a;
        if (j >= p() && (this.g > 0 || j > e() || this.i == 0)) {
            return -1L;
        }
        return j;
    }

    private final void s() {
        utt[] uttVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        usy.b(objArr, e(), null);
        this.h--;
        long jE = e() + 1;
        if (this.b < jE) {
            this.b = jE;
        }
        if (this.c < jE) {
            if (this.e != 0 && (uttVarArr = this.d) != null) {
                for (utt uttVar : uttVarArr) {
                    if (uttVar != null) {
                        usz uszVar = (usz) uttVar;
                        long j = uszVar.a;
                        if (j >= 0 && j < jE) {
                            uszVar.a = jE;
                        }
                    }
                }
            }
            this.c = jE;
        }
        boolean z = unf.a;
    }

    private final void t(Object obj) {
        int iO = o();
        Object[] objArrW = this.a;
        if (objArrW == null) {
            objArrW = w(null, 0, 2);
        } else {
            int length = objArrW.length;
            if (iO >= length) {
                objArrW = w(objArrW, iO, length + length);
            }
        }
        usy.b(objArrW, e() + iO, obj);
    }

    private final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = unf.a;
        for (long jE = e(); jE < jMin; jE++) {
            Object[] objArr = this.a;
            objArr.getClass();
            usy.b(objArr, jE, null);
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    private final boolean v(Object obj) {
        if (this.e == 0) {
            boolean z = unf.a;
            if (this.f != 0) {
                t(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > 1) {
                    s();
                }
                this.c = e() + this.h;
            }
            return true;
        }
        int i2 = this.h;
        int i3 = this.g;
        if (i2 >= i3 && this.c <= this.b) {
            int i4 = this.j;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            if (i5 == 0) {
                return false;
            }
            if (i5 != 1) {
                throw new uet();
            }
        }
        t(obj);
        int i6 = this.h + 1;
        this.h = i6;
        if (i6 > i3) {
            s();
        }
        if (n() > this.f) {
            u(this.b + 1, this.c, p(), q());
        }
        return true;
    }

    private final Object[] w(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jE = e();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jE;
                usy.b(objArr2, j, usy.a(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final uhb[] x(uhb[] uhbVarArr) {
        utt[] uttVarArr;
        usz uszVar;
        uhb uhbVar;
        if (this.e != 0 && (uttVarArr = this.d) != null) {
            int length = uhbVarArr.length;
            int i = 0;
            uhbVarArr = uhbVarArr;
            while (i < uttVarArr.length) {
                utt uttVar = uttVarArr[i];
                if (uttVar != null && (uhbVar = (uszVar = (usz) uttVar).b) != null && r(uszVar) >= 0) {
                    int length2 = uhbVarArr.length;
                    uhbVarArr = uhbVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(uhbVarArr, Math.max(2, length2 + length2));
                        CopyOf.getClass();
                        uhbVarArr = CopyOf;
                    }
                    uhbVarArr[length] = uhbVar;
                    uszVar.b = null;
                    length++;
                }
                i++;
                uhbVarArr = uhbVarArr;
            }
        }
        return uhbVarArr;
    }

    @Override // defpackage.usr, defpackage.url
    public final Object a(Object obj, uhb uhbVar) throws Throwable {
        usx usxVar;
        Throwable th;
        uhb[] uhbVarArrX;
        usv usvVar;
        if (d(obj)) {
            return ufg.a;
        }
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        uhb[] uhbVarArrX2 = uts.a;
        synchronized (this) {
            try {
                if (v(obj)) {
                    try {
                        umlVar.fW(ufg.a);
                        uhbVarArrX = x(uhbVarArrX2);
                        usvVar = null;
                        usxVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        usxVar = this;
                        throw th;
                    }
                } else {
                    usxVar = this;
                    try {
                        usvVar = new usv(usxVar, e() + o(), obj, umlVar);
                        usxVar.t(usvVar);
                        usxVar.i++;
                        if (usxVar.g == 0) {
                            uhbVarArrX2 = usxVar.x(uhbVarArrX2);
                        }
                        uhbVarArrX = uhbVarArrX2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (usvVar != null) {
                    ung.r(umlVar, usvVar);
                }
                for (uhb uhbVar2 : uhbVarArrX) {
                    if (uhbVar2 != null) {
                        uhbVar2.fW(ufg.a);
                    }
                }
                Object objI = umlVar.i();
                uhi uhiVar = uhi.a;
                if (objI == uhiVar) {
                    uhbVar.getClass();
                }
                if (objI != uhiVar) {
                    objI = ufg.a;
                }
                return objI != uhiVar ? ufg.a : objI;
            } catch (Throwable th4) {
                th = th4;
                usxVar = this;
            }
        }
    }

    @Override // defpackage.usr
    public final boolean d(Object obj) {
        int i;
        boolean z;
        uhb[] uhbVarArrX = uts.a;
        synchronized (this) {
            if (v(obj)) {
                uhbVarArrX = x(uhbVarArrX);
                z = true;
            } else {
                z = false;
            }
        }
        for (uhb uhbVar : uhbVarArrX) {
            if (uhbVar != null) {
                uhbVar.fW(ufg.a);
            }
        }
        return z;
    }

    public final long e() {
        return Math.min(this.c, this.b);
    }

    protected final Object g() {
        Object[] objArr = this.a;
        objArr.getClass();
        return usy.a(objArr, (this.b + n()) - 1);
    }

    @Override // defpackage.uuj
    public final urk gb(uhf uhfVar, int i, int i2) {
        return usy.c(this, uhfVar, i, i2);
    }

    @Override // defpackage.usu, defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) {
        return f(this, urlVar, uhbVar);
    }

    @Override // defpackage.usr
    public final void gd() throws Throwable {
        usx usxVar;
        synchronized (this) {
            try {
                usxVar = this;
            } catch (Throwable th) {
                th = th;
                usxVar = this;
            }
            try {
                usxVar.u(p(), this.c, p(), q());
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                throw th3;
            }
        }
    }

    @Override // defpackage.utr
    public final /* synthetic */ utt h() {
        return new usz();
    }

    public final void i() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0 && usy.a(objArr, (e() + o()) - 1) == usy.a) {
                this.i--;
                usy.b(objArr, e() + o(), null);
            }
        }
    }

    public final uhb[] j(long j) {
        long j2;
        long j3;
        long j4;
        utt[] uttVarArr;
        boolean z = unf.a;
        if (j <= this.c) {
            long jE = e();
            long j5 = this.h + jE;
            int i = this.g;
            if (i == 0 && this.i > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.e != 0 && (uttVarArr = this.d) != null) {
                for (utt uttVar : uttVarArr) {
                    if (uttVar != null) {
                        long j6 = ((usz) uttVar).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.c) {
                long jP = p();
                int iMin = this.e > 0 ? Math.min(this.i, i - ((int) (jP - j5))) : this.i;
                uhb[] uhbVarArr = uts.a;
                long j7 = this.i + jP;
                if (iMin > 0) {
                    uhbVarArr = new uhb[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j4 = 1;
                    long j8 = jP;
                    while (true) {
                        if (jP >= j7) {
                            j2 = jE;
                            j3 = j5;
                            jP = j8;
                            break;
                        }
                        j2 = jE;
                        Object objA = usy.a(objArr, jP);
                        uwc uwcVar = usy.a;
                        if (objA != uwcVar) {
                            objA.getClass();
                            int i3 = i2 + 1;
                            j3 = j5;
                            usv usvVar = (usv) objA;
                            uhbVarArr[i2] = usvVar.d;
                            usy.b(objArr, jP, uwcVar);
                            usy.b(objArr, j8, usvVar.c);
                            long j9 = j8 + 1;
                            if (i3 >= iMin) {
                                jP = j9;
                                break;
                            }
                            i2 = i3;
                            j8 = j9;
                        } else {
                            j3 = j5;
                        }
                        jP++;
                        jE = j2;
                        j5 = j3;
                    }
                } else {
                    j2 = jE;
                    j3 = j5;
                    j4 = 1;
                }
                long j10 = jP - j2;
                long j11 = this.e == 0 ? jP : j3;
                long jMax = Math.max(this.b, jP - Math.min(this.f, (int) j10));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (a.ao(usy.a(objArr2, jMax), usy.a)) {
                        jP += j4;
                        jMax += j4;
                    }
                }
                u(jMax, j11, jP, j7);
                i();
                return uhbVarArr.length == 0 ? uhbVarArr : x(uhbVarArr);
            }
        }
        return uts.a;
    }

    @Override // defpackage.utr
    public final /* bridge */ /* synthetic */ utt[] k() {
        return new usz[2];
    }
}
