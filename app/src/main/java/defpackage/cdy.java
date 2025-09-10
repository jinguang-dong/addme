package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdy {
    public final TextUtils.TruncateAt a;
    public final boolean b;
    public final Layout c;
    public final int d;
    public final int e;
    public final Paint.FontMetricsInt f;
    public final Rect g = new Rect();
    private final TextPaint h;
    private final cdv i;
    private final int j;
    private final float k;
    private final float l;
    private final boolean m;
    private final int n;
    private final ceh[] o;
    private cdu p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cdy(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, defpackage.cdv r34) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdy.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, int, int, int, int, int, int, cdv):void");
    }

    private final float k(int i) {
        if (i == this.d - 1) {
            return this.k + this.l;
        }
        return 0.0f;
    }

    public final float a(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.d - 1;
        if (i == i2 && (fontMetricsInt = this.f) != null) {
            return this.c.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return this.e + this.c.getLineBottom(i) + (i == i2 ? this.j : 0);
    }

    public final float b(int i) {
        return this.c.getLineTop(i) + (i == 0 ? 0 : this.e);
    }

    public final float c(int i, boolean z) {
        return i().a(i, true, z) + k(g(i));
    }

    public final float d(int i, boolean z) {
        return i().a(i, false, z) + k(g(i));
    }

    public final int e() {
        return (this.b ? this.c.getLineBottom(this.d - 1) : this.c.getHeight()) + this.e + this.j + this.n;
    }

    public final int f(int i) {
        Layout layout = this.c;
        return (cdz.c(layout, i) && this.a == TextUtils.TruncateAt.END) ? layout.getText().length() : layout.getLineEnd(i);
    }

    public final int g(int i) {
        return this.c.getLineForOffset(i);
    }

    public final int h(int i) {
        return this.c.getParagraphDirection(i);
    }

    public final cdu i() {
        cdu cduVar = this.p;
        if (cduVar != null) {
            return cduVar;
        }
        cdu cduVar2 = new cdu(this.c);
        this.p = cduVar2;
        return cduVar2;
    }

    public final CharSequence j() {
        return this.c.getText();
    }
}
