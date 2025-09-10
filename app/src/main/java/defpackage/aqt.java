package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqt {
    public chq a;
    public cdl b;
    private ccm c;
    private int d;
    private boolean e;
    private int f;
    private List g;
    private cdo i;
    private ccx j;
    private cib k;
    private long n;
    private qqq o;
    private long h = aqs.a;
    private int l = -1;
    private int m = -1;

    public /* synthetic */ aqt(ccm ccmVar, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2, List list) {
        this.c = ccmVar;
        this.o = qqqVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = list;
        this.i = cdoVar;
    }

    private final void i() {
        this.j = null;
        this.b = null;
        this.m = -1;
        this.l = -1;
    }

    public final int a(int i, cib cibVar) {
        int i2 = this.l;
        int i3 = this.m;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jD = chp.d(0, i, 0, Integer.MAX_VALUE);
        float f = b(jD, cibVar).d;
        int iN = ukc.n(bay.X(f), cho.c(jD));
        this.l = i;
        this.m = iN;
        return iN;
    }

    public final ccw b(long j, cib cibVar) {
        ccx ccxVarC = c(cibVar);
        long jW = bay.W(j, this.e, this.d, ccxVarC.a());
        boolean z = this.e;
        int i = this.d;
        return new ccw(ccxVarC, jW, bay.V(z, i, this.f), i);
    }

    public final ccx c(cib cibVar) {
        ccx ccxVar = this.j;
        if (ccxVar == null || cibVar != this.k || ccxVar.c()) {
            this.k = cibVar;
            ccm ccmVar = this.c;
            cdo cdoVarJ = byx.j(this.i, cibVar);
            chq chqVar = this.a;
            chqVar.getClass();
            qqq qqqVar = this.o;
            List list = this.g;
            if (list == null) {
                list = ufw.a;
            }
            ccxVar = new ccx(ccmVar, cdoVarJ, list, chqVar, qqqVar);
        }
        this.j = ccxVar;
        return ccxVar;
    }

    public final cdl d() {
        cdl cdlVar = this.b;
        if (cdlVar != null) {
            return cdlVar;
        }
        toString();
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(toString()));
    }

    public final cdl e(cib cibVar, long j, ccw ccwVar) {
        float fMin = Math.min(ccwVar.a.a(), ccwVar.c);
        ccm ccmVar = this.c;
        cdo cdoVar = this.i;
        List list = this.g;
        if (list == null) {
            list = ufw.a;
        }
        int i = this.f;
        boolean z = this.e;
        int i2 = this.d;
        chq chqVar = this.a;
        chqVar.getClass();
        return new cdl(new cdk(ccmVar, cdoVar, list, i, z, i2, chqVar, cibVar, this.o, j), ccwVar, chp.e(j, (bay.X(fMin) << 32) | (bay.X(ccwVar.d) & 4294967295L)));
    }

    public final void f(long j) {
        this.n = j | (this.n << 2);
    }

    public final void g(chq chqVar) {
        chq chqVar2 = this.a;
        long jA = chqVar != null ? aqs.a(chqVar) : aqs.a;
        if (chqVar2 == null) {
            this.a = chqVar;
            this.h = jA;
        } else if (chqVar == null || !a.q(this.h, jA)) {
            this.a = chqVar;
            this.h = jA;
            f(1L);
            i();
        }
    }

    public final void h(ccm ccmVar, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2, List list) {
        this.c = ccmVar;
        boolean zV = cdoVar.v(this.i);
        this.i = cdoVar;
        if (!zV) {
            f(0L);
            this.j = null;
            this.b = null;
            this.m = -1;
            this.l = -1;
        }
        this.o = qqqVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = list;
        f(2L);
        i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.b != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) aqs.b(this.h));
        sb.append(", history=");
        sb.append(this.n);
        sb.append(", constraints=");
        cdl cdlVar = this.b;
        sb.append(cdlVar != null ? new cho(cdlVar.a.i) : "null");
        sb.append(')');
        return sb.toString();
    }
}
