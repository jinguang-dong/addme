package defpackage;

import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdl {
    public final cdk a;
    public final ccw b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public cdl(cdk cdkVar, ccw ccwVar, long j) {
        this.a = cdkVar;
        this.b = ccwVar;
        this.c = j;
        float fA = 0.0f;
        this.d = ccwVar.g.isEmpty() ? 0.0f : ((ccy) ccwVar.g.get(0)).g.a();
        if (!ccwVar.g.isEmpty()) {
            ccy ccyVar = (ccy) ske.bF(ccwVar.g);
            fA = ccyVar.a(ccyVar.g.c());
        }
        this.e = fA;
        this.f = ccwVar.f;
    }

    public static /* synthetic */ int i(cdl cdlVar, int i) {
        ccw ccwVar = cdlVar.b;
        ccwVar.b(i);
        List list = ccwVar.g;
        ccy ccyVar = (ccy) list.get(bqs.t(list, i));
        cch cchVar = ccyVar.g;
        return ccyVar.b(cchVar.b.f(ccyVar.e(i)));
    }

    public final float a(int i) {
        ccw ccwVar = this.b;
        ccwVar.b(i);
        List list = ccwVar.g;
        ccy ccyVar = (ccy) list.get(bqs.t(list, i));
        cch cchVar = ccyVar.g;
        return ccyVar.a(cchVar.b.b(ccyVar.e(i)));
    }

    public final int b() {
        return this.b.e;
    }

    public final int c(int i) {
        ccw ccwVar = this.b;
        ccy ccyVar = (ccy) ccwVar.g.get(i >= ccwVar.a().a() ? ske.bk(ccwVar.g) : i < 0 ? 0 : bqs.s(ccwVar.g, i));
        return ccyVar.c(ccyVar.g.b.g(ccyVar.d(i)));
    }

    public final int d(float f) {
        List list = this.b.g;
        int iBk = 0;
        if (f > 0.0f) {
            if (f < ((ccy) ske.bF(list)).f) {
                int size = list.size() - 1;
                int i = 0;
                while (true) {
                    if (i > size) {
                        iBk = -(i + 1);
                        break;
                    }
                    int i2 = (i + size) >>> 1;
                    ccy ccyVar = (ccy) list.get(i2);
                    char c = ccyVar.e <= f ? ccyVar.f <= f ? (char) 65535 : (char) 0 : (char) 1;
                    if (c >= 0) {
                        if (c <= 0) {
                            iBk = i2;
                            break;
                        }
                        size = i2 - 1;
                    } else {
                        i = i2 + 1;
                    }
                }
            } else {
                iBk = ske.bk(list);
            }
        }
        ccy ccyVar2 = (ccy) list.get(iBk);
        if (ccyVar2.b - ccyVar2.a == 0) {
            return ccyVar2.c;
        }
        cch cchVar = ccyVar2.g;
        float f2 = f - ccyVar2.e;
        cdy cdyVar = cchVar.b;
        return ccyVar2.c(cdyVar.c.getLineForVertical(((int) f2) - cdyVar.e));
    }

    public final int e(int i) {
        ccw ccwVar = this.b;
        ccwVar.b(i);
        List list = ccwVar.g;
        ccy ccyVar = (ccy) list.get(bqs.t(list, i));
        cch cchVar = ccyVar.g;
        return ccyVar.b(cchVar.b.c.getLineStart(ccyVar.e(i)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdl)) {
            return false;
        }
        cdl cdlVar = (cdl) obj;
        return a.ao(this.a, cdlVar.a) && a.ao(this.b, cdlVar.b) && a.q(this.c, cdlVar.c) && this.d == cdlVar.d && this.e == cdlVar.e && a.ao(this.f, cdlVar.f);
    }

    public final bkg f(int i) {
        float fD;
        float fD2;
        float fC;
        float fC2;
        ccw ccwVar = this.b;
        if (i < 0 || i >= ccwVar.a().b.length()) {
            cgh.a("offset(" + i + ") is out of bounds [0, " + ccwVar.a().a() + ')');
        }
        List list = ccwVar.g;
        ccy ccyVar = (ccy) list.get(bqs.s(list, i));
        cch cchVar = ccyVar.g;
        int iD = ccyVar.d(i);
        if (iD < 0 || iD >= cchVar.c.length()) {
            cgh.a("offset(" + iD + ") is out of bounds [0," + cchVar.c.length() + ')');
        }
        cdy cdyVar = cchVar.b;
        int i2 = iD + 1;
        int iG = cdyVar.g(iD);
        float fB = cdyVar.b(iG);
        float fA = cdyVar.a(iG);
        boolean z = cdyVar.h(iG) == 1;
        boolean zIsRtlCharAt = cdyVar.c.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z) {
                fC = cdyVar.d(iD, false);
                fC2 = cdyVar.d(i2, true);
            } else if (zIsRtlCharAt) {
                fC = cdyVar.c(iD, false);
                fC2 = cdyVar.c(i2, true);
            } else {
                fD = cdyVar.d(iD, false);
                fD2 = cdyVar.d(i2, true);
            }
            float f = fC2;
            fD2 = fC;
            fD = f;
        } else {
            fD = cdyVar.c(iD, false);
            fD2 = cdyVar.c(i2, true);
        }
        RectF rectF = new RectF(fD, fB, fD2, fA);
        return ccyVar.f(new bkg(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final cdl g(cdk cdkVar, long j) {
        return new cdl(cdkVar, this.b, j);
    }

    public final boolean h() {
        long j = this.c;
        ccw ccwVar = this.b;
        return ((float) ((int) (j >> 32))) < ccwVar.c || ccwVar.b || ((float) ((int) (j & 4294967295L))) < ccwVar.d;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.r(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int j(int i) {
        ccw ccwVar = this.b;
        if (i < 0 || i > ccwVar.a().b.length()) {
            cgh.a("offset(" + i + ") is out of bounds [0, " + ccwVar.a().a() + ']');
        }
        ccy ccyVar = (ccy) ccwVar.g.get(i == ccwVar.a().a() ? ske.bk(ccwVar.g) : bqs.s(ccwVar.g, i));
        cch cchVar = ccyVar.g;
        int iD = ccyVar.d(i);
        cdy cdyVar = cchVar.b;
        return cdyVar.h(cdyVar.g(iD)) == 1 ? 1 : 2;
    }

    public final bkn k(int i, int i2) {
        ccw ccwVar = this.b;
        if (i < 0 || i > i2 || i2 > ccwVar.a().b.length()) {
            cgh.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + ccwVar.a().b.length() + "), or start > end!");
        }
        if (i == i2) {
            return new bkn((byte[]) null);
        }
        bkn bknVar = new bkn((byte[]) null);
        List list = ccwVar.g;
        long jK = byx.k(i, i2);
        long j = cdn.a;
        ccv ccvVar = new ccv(bknVar, i, i2, 0);
        int size = list.size();
        for (int iS = bqs.s(list, Math.min(cdn.b(jK), cdn.a(jK))); iS < size; iS++) {
            ccy ccyVar = (ccy) list.get(iS);
            int i3 = ccyVar.a;
            if (i3 >= Math.max(cdn.b(jK), cdn.a(jK))) {
                break;
            }
            if (i3 != ccyVar.b) {
                ccvVar.a(ccyVar);
            }
        }
        return bknVar;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) cia.a(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
