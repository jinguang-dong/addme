package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqu {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public chq e;
    public boolean f;
    public cda h;
    public cib i;
    public cch k;
    public qqq l;
    private cdo m;
    private long q;
    private long n = aqs.a;
    public long g = 0;
    public long j = chp.g(0, 0, 0, 0);
    private int o = -1;
    private int p = -1;

    public aqu(String str, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = cdoVar;
        this.l = qqqVar;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    private final void g() {
        this.k = null;
        this.h = null;
        this.i = null;
        this.o = -1;
        this.p = -1;
        this.j = chp.g(0, 0, 0, 0);
        this.g = 0L;
        this.f = false;
    }

    public final int a(int i, cib cibVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = chp.d(0, i, 0, Integer.MAX_VALUE);
        int iN = ukc.n(bay.X(e(jD, cibVar).b()), cho.c(jD));
        this.o = i;
        this.p = iN;
        return iN;
    }

    public final cda b(cib cibVar) {
        cda cgoVar = this.h;
        if (cgoVar == null || cibVar != this.i || cgoVar.c()) {
            this.i = cibVar;
            String str = this.a;
            cdo cdoVarJ = byx.j(this.m, cibVar);
            ufw ufwVar = ufw.a;
            chq chqVar = this.e;
            chqVar.getClass();
            cgoVar = new cgo(str, cdoVarJ, ufwVar, ufwVar, this.l, chqVar);
        }
        this.h = cgoVar;
        return cgoVar;
    }

    public final void c(long j) {
        this.q = j | (this.q << 2);
    }

    public final void d(chq chqVar) {
        chq chqVar2 = this.e;
        long jA = chqVar != null ? aqs.a(chqVar) : aqs.a;
        if (chqVar2 == null) {
            this.e = chqVar;
            this.n = jA;
        } else if (chqVar == null || !a.q(this.n, jA)) {
            this.e = chqVar;
            this.n = jA;
            c(1L);
            g();
        }
    }

    public final cch e(long j, cib cibVar) {
        cda cdaVarB = b(cibVar);
        long jW = bay.W(j, this.c, this.b, cdaVarB.a());
        boolean z = this.c;
        int i = this.b;
        return new cch((cgo) cdaVarB, bay.V(z, i, this.d), i, jW);
    }

    public final void f(String str, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = cdoVar;
        this.l = qqqVar;
        this.b = i;
        this.c = z;
        this.d = i2;
        c(2L);
        g();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.k != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) aqs.b(this.n));
        sb.append(yoGAhrpjU.xLwODAivjpwSkT);
        sb.append(this.q);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
