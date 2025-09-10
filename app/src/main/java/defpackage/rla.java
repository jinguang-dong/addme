package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rla {
    private Rect A;
    private final RectF B;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private Typeface M;
    private CharSequence N;
    private boolean O;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private int V;
    private int W;
    private boolean X;
    private final TextPaint Y;
    private final TextPaint Z;
    public final View a;
    private TimeInterpolator aa;
    private TimeInterpolator ab;
    private float ac;
    private float ad;
    private float ae;
    private ColorStateList af;
    private float ag;
    private float ah;
    private float ai;
    private ColorStateList aj;
    private float ak;
    private float al;
    private float am;
    private StaticLayout an;
    private float ao;
    private float ap;
    private float aq;
    private CharSequence ar;
    private boolean as;
    public float b;
    public boolean c;
    public float d;
    public int e;
    public ColorStateList f;
    public ColorStateList g;
    public int h;
    public Typeface i;
    public Typeface j;
    public Typeface k;
    public Typeface l;
    public Typeface m;
    public Typeface n;
    public CharSequence p;
    public int[] q;
    public eze u;
    public eze v;
    public AmbientMode.AmbientCallback w;
    private float x;
    private final Rect y;
    private final Rect z;
    private int C = 16;
    private int D = 16;
    private float E = 15.0f;
    private float F = 15.0f;
    public TextUtils.TruncateAt o = TextUtils.TruncateAt.END;
    private boolean P = true;
    public int r = 1;
    public float s = 1.0f;
    public int t = 1;

    public rla(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.Y = textPaint;
        this.Z = new TextPaint(textPaint);
        this.z = new Rect();
        this.y = new Rect();
        this.B = new RectF();
        this.d = x();
        e(view.getContext().getResources().getConfiguration());
    }

    private final int A(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.q;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void B() {
        float f;
        float f2 = this.b;
        if (this.c) {
            this.B.set(f2 < this.d ? this.y : this.z);
        } else {
            RectF rectF = this.B;
            float f3 = this.y.left;
            Rect rect = this.z;
            rectF.left = y(f3, rect.left, f2, this.aa);
            rectF.top = y(this.G, this.H, f2, this.aa);
            rectF.right = y(r2.right, rect.right, f2, this.aa);
            rectF.bottom = y(r2.bottom, rect.bottom, f2, this.aa);
        }
        if (!this.c) {
            this.K = y(this.I, this.J, f2, this.aa);
            this.L = y(this.G, this.H, f2, this.aa);
            E(f2);
            f = f2;
        } else if (f2 < this.d) {
            this.K = this.I;
            this.L = this.G;
            E(0.0f);
            f = 0.0f;
        } else {
            this.K = this.J;
            this.L = this.H - Math.max(0, this.e);
            E(1.0f);
            f = 1.0f;
        }
        TimeInterpolator timeInterpolator = rhn.b;
        this.ap = 1.0f - y(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.a;
        view.postInvalidateOnAnimation();
        this.aq = y(1.0f, 0.0f, f2, timeInterpolator);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.g;
        ColorStateList colorStateList2 = this.f;
        if (colorStateList != colorStateList2) {
            this.Y.setColor(z(A(colorStateList2), c(), f));
        } else {
            this.Y.setColor(c());
        }
        float f4 = this.ak;
        float f5 = this.al;
        if (f4 != f5) {
            this.Y.setLetterSpacing(y(f5, f4, f2, timeInterpolator));
        } else {
            this.Y.setLetterSpacing(f4);
        }
        this.S = y(this.ag, this.ac, f2, null);
        this.T = y(this.ah, this.ad, f2, null);
        this.U = y(this.ai, this.ae, f2, null);
        int iZ = z(A(this.aj), A(this.af), f2);
        this.V = iZ;
        TextPaint textPaint = this.Y;
        textPaint.setShadowLayer(this.S, this.T, this.U, iZ);
        if (this.c) {
            int alpha = textPaint.getAlpha();
            float f6 = this.d;
            textPaint.setAlpha((int) ((f2 <= f6 ? rhn.a(1.0f, 0.0f, this.x, f6, f2) : rhn.a(0.0f, 1.0f, f6, 1.0f, f2)) * alpha));
            textPaint.setShadowLayer(this.S, this.T, this.U, qpt.O(this.V, textPaint.getAlpha()));
        }
        view.postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C(float r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rla.C(float, boolean):void");
    }

    private final void D(TextPaint textPaint) {
        textPaint.setTextSize(this.F);
        textPaint.setTypeface(this.i);
        textPaint.setLetterSpacing(this.ak);
    }

    private final void E(float f) {
        C(f, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean F(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static boolean G(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private final boolean H() {
        if (this.r <= 1) {
            return false;
        }
        return !this.O || this.c;
    }

    private static final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private final float x() {
        float f = this.x;
        return f + ((1.0f - f) * 0.5f);
    }

    private static float y(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = rhn.a;
        return f + (f3 * (f2 - f));
    }

    private static int z(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public final float a() {
        TextPaint textPaint = this.Z;
        D(textPaint);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final float b() {
        TextPaint textPaint = this.Z;
        textPaint.setTextSize(this.E);
        textPaint.setTypeface(this.l);
        textPaint.setLetterSpacing(this.al);
        return (-textPaint.ascent()) + textPaint.descent();
    }

    public final int c() {
        return A(this.g);
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.N != null) {
            RectF rectF = this.B;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.Y;
            textPaint.setTextSize(this.R);
            float f = this.K;
            float f2 = this.L;
            float f3 = this.Q;
            if (f3 != 1.0f && !this.c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (!H() || (this.c && this.b <= this.d)) {
                canvas.translate(f, f2);
                this.an.draw(canvas);
            } else {
                float lineStart = this.K - this.an.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.c) {
                    textPaint.setAlpha((int) (this.aq * alpha));
                    textPaint.setShadowLayer(this.S, this.T, this.U, qpt.O(this.V, textPaint.getAlpha()));
                    this.an.draw(canvas);
                }
                if (!this.c) {
                    textPaint.setAlpha((int) (this.ap * alpha));
                }
                textPaint.setShadowLayer(this.S, this.T, this.U, qpt.O(this.V, textPaint.getAlpha()));
                int lineBaseline = this.an.getLineBaseline(0);
                CharSequence charSequence = this.ar;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
                textPaint.setShadowLayer(this.S, this.T, this.U, this.V);
                if (!this.c) {
                    String strTrim = this.ar.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.an.getLineEnd(0), str.length()), 0.0f, f4, (Paint) textPaint);
                }
                canvas = canvas;
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void e(Configuration configuration) {
        Typeface typeface = this.k;
        if (typeface != null) {
            this.j = qsy.m(configuration, typeface);
        }
        Typeface typeface2 = this.n;
        if (typeface2 != null) {
            this.m = qsy.m(configuration, typeface2);
        }
        Typeface typeface3 = this.j;
        if (typeface3 == null) {
            typeface3 = this.k;
        }
        this.i = typeface3;
        Typeface typeface4 = this.m;
        if (typeface4 == null) {
            typeface4 = this.n;
        }
        this.l = typeface4;
        g(true);
    }

    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        float fI;
        StaticLayout staticLayout;
        View view = this.a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        C(1.0f, z);
        CharSequence charSequence = this.N;
        if (charSequence != null && (staticLayout = this.an) != null) {
            this.ar = TextUtils.ellipsize(charSequence, this.Y, staticLayout.getWidth(), this.o);
        }
        CharSequence charSequence2 = this.ar;
        if (charSequence2 != null) {
            this.ao = I(this.Y, charSequence2);
        } else {
            this.ao = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.D, this.O ? 1 : 0);
        Rect rect = this.A;
        if (rect == null) {
            rect = this.z;
        }
        int i = absoluteGravity & ScriptIntrinsicBLAS.TRANSPOSE;
        if (i == 48) {
            this.H = rect.top;
        } else if (i != 80) {
            TextPaint textPaint = this.Y;
            this.H = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.H = rect.bottom + this.Y.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.J = rect.centerX() - (this.ao / 2.0f);
        } else if (i2 != 5) {
            this.J = rect.left;
        } else {
            this.J = rect.right - this.ao;
        }
        float f = this.ao;
        Rect rect2 = this.z;
        if (f <= rect2.width()) {
            float fMax = this.J + Math.max(0.0f, rect2.left - this.J);
            this.J = fMax;
            this.J = fMax + Math.min(0.0f, rect2.right - (this.J + this.ao));
        }
        if (a() <= rect2.height()) {
            float fMax2 = this.H + Math.max(0.0f, rect2.top - this.H);
            this.H = fMax2;
            float f2 = rect2.bottom;
            float f3 = this.H;
            TextPaint textPaint2 = this.Z;
            D(textPaint2);
            this.H = fMax2 + Math.min(0.0f, f2 - (f3 + (-textPaint2.ascent())));
        }
        C(0.0f, z);
        float height = this.an != null ? r13.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.an;
        if (staticLayout2 == null || this.r <= 1) {
            CharSequence charSequence3 = this.N;
            fI = charSequence3 != null ? I(this.Y, charSequence3) : 0.0f;
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.an;
        this.h = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.C, this.O ? 1 : 0);
        int i3 = absoluteGravity2 & ScriptIntrinsicBLAS.TRANSPOSE;
        if (i3 == 48) {
            this.G = this.y.top;
        } else if (i3 != 80) {
            this.G = this.y.centerY() - (height / 2.0f);
        } else {
            this.G = (this.y.bottom - height) + (this.as ? this.Y.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.I = this.y.centerX() - (fI / 2.0f);
        } else if (i4 != 5) {
            this.I = this.y.left;
        } else {
            this.I = this.y.right - fI;
        }
        E(this.b);
        B();
    }

    public final void h(int i, int i2, int i3, int i4) {
        Rect rect = this.z;
        if (G(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.X = true;
    }

    public final void i(int i, int i2, int i3, int i4) {
        if (this.A == null) {
            this.A = new Rect(i, i2, i3, i4);
            this.X = true;
        }
        if (G(this.A, i, i2, i3, i4)) {
            return;
        }
        this.A.set(i, i2, i3, i4);
        this.X = true;
    }

    public final void j(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        View view = this.a;
        rnk rnkVar = new rnk(view.getContext(), i);
        ColorStateList colorStateList = rnkVar.i;
        if (colorStateList != null) {
            this.g = colorStateList;
        }
        float f = rnkVar.j;
        if (f != 0.0f) {
            this.F = f;
        }
        ColorStateList colorStateList2 = rnkVar.a;
        if (colorStateList2 != null) {
            this.af = colorStateList2;
        }
        this.ad = rnkVar.e;
        this.ae = rnkVar.f;
        this.ac = rnkVar.g;
        this.ak = rnkVar.h;
        eze ezeVar = this.v;
        if (ezeVar != null) {
            ezeVar.d();
        }
        this.v = new eze(new rkz(this, 1), rnkVar.a());
        rnkVar.c(view.getContext(), this.v);
        f();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            f();
        }
    }

    public final void l(int i) {
        if (this.D != i) {
            this.D = i;
            f();
        }
    }

    public final void m(int i, int i2, int i3, int i4, boolean z) {
        Rect rect = this.y;
        if (G(rect, i, i2, i3, i4) && z == this.as) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.X = true;
        this.as = z;
    }

    public final void n(int i) {
        if (i != this.r) {
            this.r = i;
            f();
        }
    }

    public final void o(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        View view = this.a;
        rnk rnkVar = new rnk(view.getContext(), i);
        ColorStateList colorStateList = rnkVar.i;
        if (colorStateList != null) {
            this.f = colorStateList;
        }
        float f = rnkVar.j;
        if (f != 0.0f) {
            this.E = f;
        }
        ColorStateList colorStateList2 = rnkVar.a;
        if (colorStateList2 != null) {
            this.aj = colorStateList2;
        }
        this.ah = rnkVar.e;
        this.ai = rnkVar.f;
        this.ag = rnkVar.g;
        this.al = rnkVar.h;
        eze ezeVar = this.u;
        if (ezeVar != null) {
            ezeVar.d();
        }
        this.u = new eze(new rkz(this, 0), rnkVar.a());
        rnkVar.c(view.getContext(), this.u);
        f();
    }

    public final void p(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            f();
        }
    }

    public final void q(int i) {
        if (this.C != i) {
            this.C = i;
            f();
        }
    }

    public final void r(float f) {
        float fC = clc.C(f, 0.0f, 1.0f);
        if (fC != this.b) {
            this.b = fC;
            B();
        }
    }

    public final void s(float f) {
        this.x = f;
        this.d = x();
    }

    public final void t(TimeInterpolator timeInterpolator) {
        this.aa = timeInterpolator;
        f();
    }

    public final void u(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.p, charSequence)) {
            this.p = charSequence;
            this.N = null;
            f();
        }
    }

    public final void v(TimeInterpolator timeInterpolator) {
        this.ab = timeInterpolator;
        f();
    }

    public final void w() {
        this.P = false;
    }
}
