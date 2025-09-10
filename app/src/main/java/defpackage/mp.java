package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class mp extends View {
    public Layout a;
    public ColorStateList b;
    public CharSequence c;
    public float d;
    public float e;
    public float f;
    public float g;
    private final TextPaint h;
    private final float i;
    private final float j;
    private int k;
    private int l;
    private float m;
    private int n;
    private int o;

    public mp(Context context) {
        super(context, null, 0, 0);
        this.k = 8388659;
        this.d = 1.0f;
        this.e = 0.0f;
        this.n = Integer.MAX_VALUE;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.scaledDensity;
        this.f = 10.0f * f2;
        this.g = f2 * 60.0f;
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, mo.a, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getText(4);
        this.f = typedArrayObtainStyledAttributes.getDimension(10, this.f);
        this.g = typedArrayObtainStyledAttributes.getDimension(9, this.g);
        this.b = typedArrayObtainStyledAttributes.getColorStateList(2);
        this.n = typedArrayObtainStyledAttributes.getInt(5, 2);
        if (this.b != null) {
            e();
        }
        textPaint.setTextSize(this.g);
        d(typedArrayObtainStyledAttributes.getString(8), typedArrayObtainStyledAttributes.getInt(0, -1), typedArrayObtainStyledAttributes.getInt(1, -1));
        this.k = typedArrayObtainStyledAttributes.getInt(3, this.k);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) this.j);
        this.i = typedArrayObtainStyledAttributes.getFloat(7, this.i);
        typedArrayObtainStyledAttributes.recycle();
        if (this.c == null) {
            this.c = "";
        }
    }

    private final Layout f(int i, int i2, Layout.Alignment alignment) {
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.g;
        this.m = f;
        TextPaint textPaint = this.h;
        textPaint.setTextSize(f);
        int i3 = i - paddingLeft;
        StaticLayout staticLayout = new StaticLayout(this.c, textPaint, i3, alignment, this.d, this.e, true);
        boolean z = staticLayout.getLineCount() > this.n;
        int i4 = i2 - paddingTop;
        boolean z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > i4;
        boolean z3 = textPaint.getTextSize() > this.f;
        if (z || z2) {
            while (true) {
                if ((!z && !z2) || !z3) {
                    break;
                }
                float f2 = this.m - 1.0f;
                this.m = f2;
                textPaint.setTextSize(f2);
                staticLayout = new StaticLayout(this.c, textPaint, i3, alignment, this.d, this.e, true);
                z2 = staticLayout.getLineTop(staticLayout.getLineCount()) > i4;
                z = staticLayout.getLineCount() > this.n;
                z3 = textPaint.getTextSize() > this.f;
            }
        }
        this.o = Math.min(this.n, staticLayout.getLineCount());
        return staticLayout;
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            invalidate();
        }
    }

    public final void b(int i) {
        if (this.n != i) {
            this.n = i;
            this.a = null;
            requestLayout();
            invalidate();
        }
    }

    public final void c(Typeface typeface) {
        TextPaint textPaint = this.h;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
        if (this.a != null) {
            requestLayout();
            invalidate();
        }
    }

    public final void d(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                c(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i2 <= 0) {
            TextPaint textPaint = this.h;
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            c(typefaceCreate);
            return;
        }
        Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
        c(typefaceDefaultFromStyle);
        int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
        TextPaint textPaint2 = this.h;
        textPaint2.setFakeBoldText(1 == (i3 & 1));
        textPaint2.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        e();
    }

    public final void e() {
        int colorForState = this.b.getColorForState(getDrawableState(), 0);
        if (colorForState != this.l) {
            this.l = colorForState;
            invalidate();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a != null) {
            canvas.save();
            TextPaint textPaint = this.h;
            textPaint.setColor(this.l);
            textPaint.drawableState = getDrawableState();
            float paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int height = getHeight() - (getPaddingTop() + getPaddingBottom());
            int lineTop = this.a.getLineTop(this.o);
            int i = this.k & ScriptIntrinsicBLAS.TRANSPOSE;
            canvas.translate(paddingLeft, paddingTop + (i != 16 ? (i == 48 || i != 80) ? 0 : height - lineTop : (height - lineTop) / 2));
            canvas.clipRect(0, 0, getWidth() - getPaddingRight(), this.a.getLineTop(this.o));
            this.a.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getMode(r11)
            int r10 = android.view.View.MeasureSpec.getSize(r10)
            r2 = -1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L13
            r4 = r10
            goto L14
        L13:
            r4 = r2
        L14:
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            if (r1 != r3) goto L1c
            r5 = r11
            goto L1d
        L1c:
            r5 = r2
        L1d:
            if (r4 != r2) goto L38
            android.text.TextPaint r4 = r9.h
            float r6 = r9.g
            r4.setTextSize(r6)
            java.lang.CharSequence r6 = r9.c
            float r6 = android.text.Layout.getDesiredWidth(r6, r4)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r7 = r9.m
            r4.setTextSize(r7)
            r4 = r6
        L38:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r6) goto L40
            int r4 = java.lang.Math.min(r4, r10)
        L40:
            int r10 = r9.getTextAlignment()
            r0 = 3
            r7 = 1
            if (r10 == r7) goto L5c
            r7 = 2
            if (r10 == r7) goto L59
            if (r10 == r0) goto L56
            r0 = 4
            if (r10 == r0) goto L53
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L74
        L53:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L74
        L56:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L74
        L59:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L74
        L5c:
            int r10 = r9.k
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r10 = r10 & r8
            if (r10 == r7) goto L53
            if (r10 == r0) goto L59
            r0 = 5
            if (r10 == r0) goto L56
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r10 == r0) goto L59
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r10 == r0) goto L56
            goto L59
        L74:
            if (r5 != r2) goto L7d
            if (r1 != r6) goto L7a
            r5 = r11
            goto L7d
        L7a:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L7d:
            android.text.Layout r0 = r9.a
            if (r0 != 0) goto L88
            android.text.Layout r10 = r9.f(r4, r5, r10)
            r9.a = r10
            goto L9c
        L88:
            int r0 = r0.getWidth()
            android.text.Layout r2 = r9.a
            int r2 = r2.getHeight()
            if (r0 != r4) goto L96
            if (r2 == r5) goto L9c
        L96:
            android.text.Layout r10 = r9.f(r4, r5, r10)
            r9.a = r10
        L9c:
            android.text.Layout r10 = r9.a
            if (r10 != 0) goto La5
            r10 = 0
            r9.setMeasuredDimension(r10, r10)
            return
        La5:
            if (r1 == r3) goto Laf
            int r0 = r10.getLineCount()
            int r5 = r10.getLineTop(r0)
        Laf:
            if (r1 != r6) goto Lb5
            int r5 = java.lang.Math.min(r5, r11)
        Lb5:
            r9.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.a = null;
        requestLayout();
        invalidate();
    }
}
