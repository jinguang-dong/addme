package com.google.android.apps.camera.cameravisionkit;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.ar.core.R;
import defpackage.gqt;
import defpackage.gqv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NewQrGleamingView extends View {
    public final gqt a;
    public final Rect b;
    public gqv c;
    public Animator d;
    public int e;
    public int f;
    public final Point g;
    public final Rect h;
    private Integer i;
    private Integer j;
    private Integer k;
    private int l;

    public NewQrGleamingView(Context context) {
        super(context);
        this.a = new gqt(new Rect(), new Rect(), new Rect(), new Rect());
        this.b = new Rect();
        this.g = new Point();
        this.h = new Rect();
    }

    public final void a(RectF rectF) {
        float width = getWidth();
        float height = getHeight();
        Rect rect = new Rect((int) (rectF.left * width), (int) (rectF.top * height), (int) (rectF.right * width), (int) (rectF.bottom * height));
        int iMax = Math.max(rect.width(), this.j.intValue()) + this.k.intValue();
        int iMax2 = Math.max(rect.height(), this.j.intValue()) + this.k.intValue();
        Rect rect2 = this.b;
        rect2.set(0, 0, iMax, iMax2);
        int iWidth = rect2.width();
        int iHeight = rect2.height();
        this.e = (rect.centerX() - (iWidth / 2)) - this.l;
        int iCenterY = rect.centerY();
        int i = this.l;
        this.f = (iCenterY - (iHeight / 2)) - i;
        int iIntValue = (iHeight - this.i.intValue()) + this.l;
        int iIntValue2 = this.i.intValue();
        int i2 = this.l;
        gqt gqtVar = this.a;
        gqtVar.a.set(i, iIntValue, iIntValue2 + i2, i2 + iHeight);
        int iIntValue3 = (iWidth - this.i.intValue()) + this.l;
        int iIntValue4 = iHeight - this.i.intValue();
        int i3 = this.l;
        gqtVar.b.set(iIntValue3, iIntValue4 + i3, iWidth + i3, iHeight + i3);
        int i4 = this.l;
        gqtVar.c.set(i4, i4, this.i.intValue() + this.l, this.i.intValue() + this.l);
        int iIntValue5 = iWidth - this.i.intValue();
        int i5 = this.l;
        gqtVar.d.set(iIntValue5 + i5, i5, iWidth + i5, this.i.intValue() + this.l);
    }

    public final void b() {
        Animator animator = this.d;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void c(Point point, Rect rect) {
        this.g.set(point.x, point.y);
        this.h.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Integer num;
        gqv gqvVar = this.c;
        if (gqvVar == null || this.i == null || gqvVar.i == null || (num = gqvVar.h) == null) {
            return;
        }
        canvas.translate(num.intValue(), gqvVar.i.intValue());
        gqvVar.a.draw(canvas);
        gqvVar.b.draw(canvas);
        gqvVar.c.draw(canvas);
        gqvVar.d.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = Integer.valueOf((int) TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics()));
        this.j = Integer.valueOf((int) TypedValue.applyDimension(1, 40.0f, getContext().getResources().getDisplayMetrics()));
        this.k = Integer.valueOf((int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics()));
        this.l = (int) TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics());
        this.c = new gqv(getResources().getDrawable(R.drawable.qr_gleam_bottom_left, null), getResources().getDrawable(R.drawable.qr_gleam_bottom_right, null), getResources().getDrawable(R.drawable.qr_gleam_top_left, null), getResources().getDrawable(R.drawable.qr_gleam_top_right, null), this.l);
    }

    public NewQrGleamingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new gqt(new Rect(), new Rect(), new Rect(), new Rect());
        this.b = new Rect();
        this.g = new Point();
        this.h = new Rect();
    }
}
