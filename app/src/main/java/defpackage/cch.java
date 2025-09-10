package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cch {
    public final cgo a;
    public final cdy b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final int f;
    private final long g;

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cch(defpackage.cgo r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cch.<init>(cgo, int, int, long):void");
    }

    static /* synthetic */ cdy i(cch cchVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        float fE = cchVar.e();
        cgp cgpVarG = cchVar.g();
        cgm cgmVar = cgn.a;
        cgo cgoVar = cchVar.a;
        return new cdy(cchVar.c, fE, cgpVarG, i, truncateAt, cgoVar.e, i3, i5, i6, i7, i4, i2, cgoVar.d);
    }

    public final float a() {
        return d(0);
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return d(f() - 1);
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        cdy cdyVar = this.b;
        return cdyVar.e + ((i != cdyVar.d + (-1) || (fontMetricsInt = cdyVar.f) == null) ? cdyVar.c.getLineBaseline(i) : cdyVar.b(i) - fontMetricsInt.ascent);
    }

    public final float e() {
        return cho.b(this.g);
    }

    public final int f() {
        return this.b.d;
    }

    public final cgp g() {
        return this.a.b;
    }

    public final boolean h() {
        return this.b.b;
    }

    public final void j(int i) {
        this.b.c(i, false);
    }

    public final void k(bku bkuVar, long j, blo bloVar, chd chdVar, byi byiVar) {
        int i = g().a;
        cgp cgpVarG = g();
        cgpVarG.c(j);
        cgpVarG.d(bloVar);
        cgpVarG.e(chdVar);
        cgpVarG.f(byiVar);
        cgpVarG.a(3);
        Canvas canvasA = bkk.a(bkuVar);
        if (h()) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, e(), b());
        }
        cdy cdyVar = this.b;
        if (canvasA.getClipBounds(cdyVar.g)) {
            int i2 = cdyVar.e;
            if (i2 != 0) {
                canvasA.translate(0.0f, i2);
            }
            cdx cdxVar = cdz.a;
            cdxVar.a = canvasA;
            cdyVar.c.draw(cdxVar);
            if (i2 != 0) {
                canvasA.translate(0.0f, -i2);
            }
        }
        if (h()) {
            canvasA.restore();
        }
        g().a(i);
    }
}
