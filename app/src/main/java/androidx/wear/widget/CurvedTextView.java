package androidx.wear.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.djc;
import defpackage.dta;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CurvedTextView extends View {
    public boolean a;
    public float b;
    public int c;
    public float d;
    public String e;
    public int f;
    private final Path g;
    private final Path h;
    private final TextPaint i;
    private final Rect j;
    private final Rect k;
    private String l;
    private float m;
    private float n;
    private int o;
    private float p;
    private float q;
    private float r;
    private float s;
    private Typeface t;
    private boolean u;
    private TextUtils.TruncateAt v;
    private boolean w;

    public CurvedTextView(Context context) {
        this(context, null);
    }

    private final void d(Typeface typeface, int i, int i2) {
        if (i2 >= 0) {
            Typeface typefaceCreate = Typeface.create(typeface, Math.min(1000, i2), (i & 2) != 0);
            this.t = typefaceCreate;
            this.i.setTypeface(typefaceCreate);
            return;
        }
        if (i > 0) {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            TextPaint textPaint = this.i;
            if (!typefaceDefaultFromStyle.equals(textPaint.getTypeface())) {
                textPaint.setTypeface(typefaceDefaultFromStyle);
                this.t = typefaceDefaultFromStyle;
            }
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            textPaint.setFakeBoldText(1 == (i3 & 1));
            textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            TextPaint textPaint2 = this.i;
            textPaint2.setFakeBoldText(false);
            textPaint2.setTextSkewX(0.0f);
            if ((typeface != null && !typeface.equals(textPaint2.getTypeface())) || (typeface == null && textPaint2.getTypeface() != null)) {
                textPaint2.setTypeface(typeface);
                this.t = typeface;
            }
        }
        b();
    }

    private static final void e(TypedArray typedArray, dta dtaVar, boolean z) {
        int i;
        if (z) {
            int[] iArr = djc.a;
            i = 3;
        } else {
            int[] iArr2 = djc.a;
            i = 4;
        }
        if (typedArray.hasValue(i)) {
            dtaVar.a = typedArray.getColorStateList(i);
        }
        boolean z2 = !z;
        dtaVar.b = typedArray.getDimensionPixelSize(z2 ? 1 : 0, (int) dtaVar.b);
        dtaVar.f = typedArray.getInt(true == z ? 2 : 3, dtaVar.f);
        int i2 = typedArray.getInt(true == z ? 1 : 2, dtaVar.e);
        dtaVar.e = i2;
        if (i2 != -1 && !dtaVar.d) {
            dtaVar.c = null;
        }
        int i3 = true != z ? 7 : 10;
        if (typedArray.hasValue(i3)) {
            dtaVar.c = typedArray.getString(i3);
            dtaVar.d = z2;
        }
        dtaVar.g = typedArray.getInt(true != z ? 11 : 14, dtaVar.g);
        dtaVar.h = typedArray.getFloat(true != z ? 8 : 11, dtaVar.h);
        int i4 = true != z ? 9 : 12;
        if (typedArray.hasValue(i4)) {
            dtaVar.i = typedArray.getString(i4);
        }
        int i5 = true == z ? 13 : 10;
        if (typedArray.hasValue(i5)) {
            dtaVar.j = typedArray.getString(i5);
        }
    }

    public final int a() {
        TextPaint textPaint = this.i;
        return Math.round(textPaint.getFontMetrics().descent - textPaint.getFontMetrics().ascent);
    }

    public final void b() {
        this.a = true;
        requestLayout();
        postInvalidate();
    }

    public final boolean c(float f, float f2) {
        float fMin = Math.min(getWidth(), getHeight());
        int paddingTop = this.u ? getPaddingTop() : getPaddingBottom();
        TextPaint textPaint = this.i;
        float f3 = (fMin / 2.0f) - paddingTop;
        float f4 = (f3 - textPaint.getFontMetrics().descent) + textPaint.getFontMetrics().ascent;
        float width = f - (getWidth() / 2);
        float height = f2 - (getHeight() / 2);
        float f5 = (width * width) + (height * height);
        return f5 >= f4 * f4 && f5 <= f3 * f3 && ((float) Math.toDegrees(Math.atan2((double) Math.abs(width), (double) (-height)))) < this.b / 2.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.widget.CurvedTextView.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.i;
        textPaint.setColor(this.f);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawTextOnPath(this.l, this.g, 0.0f, 0.0f, textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.e);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float f;
        int paddingBottom;
        super.onMeasure(i, i2);
        String str = this.e;
        int length = str.length();
        Rect rect = this.j;
        TextPaint textPaint = this.i;
        textPaint.getTextBounds(str, 0, length, rect);
        float fMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        if (this.u) {
            f = textPaint.getFontMetrics().ascent;
            paddingBottom = getPaddingTop();
        } else {
            f = -textPaint.getFontMetrics().descent;
            paddingBottom = getPaddingBottom();
        }
        this.m = (fMin / 2.0f) + (f - paddingBottom);
        float fMin2 = Math.min(((((rect.width() + getPaddingLeft()) + getPaddingRight()) / this.m) / 3.1415927f) * 180.0f, 359.9f);
        this.n = fMin2;
        this.b = Math.max(Math.min(this.r, fMin2), this.q);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.e);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w || motionEvent.getAction() == 0) {
            float x = motionEvent.getX() - (getWidth() / 2);
            float y = motionEvent.getY() - (getHeight() / 2);
            double d = -Math.toRadians(this.p);
            double d2 = x;
            double dCos = Math.cos(d) * d2;
            double d3 = y;
            double dSin = Math.sin(d) * d3;
            float width = (float) ((dCos - dSin) + (getWidth() / 2));
            float fSin = (float) ((d2 * Math.sin(d)) + (d3 * Math.cos(d)) + (getHeight() / 2));
            if (!this.w && c(width, fSin)) {
                this.w = true;
            }
            if (this.w) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.w = false;
                }
                motionEvent.offsetLocation(width - motionEvent.getX(), fSin - motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    public CurvedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public CurvedTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CurvedTextView(android.content.Context r12, android.util.AttributeSet r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.widget.CurvedTextView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
