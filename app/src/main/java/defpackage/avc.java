package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avc extends View {
    public avh b;
    public Boolean c;
    public Runnable d;
    public uif e;
    private Long g;
    private static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public avc(Context context) {
        super(context);
    }

    public final void a() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            runnable2.getClass();
            runnable2.run();
        } else {
            avh avhVar = this.b;
            if (avhVar != null) {
                avhVar.setState(a);
            }
        }
        avh avhVar2 = this.b;
        if (avhVar2 == null) {
            return;
        }
        avhVar2.setVisible(false, false);
        unscheduleDrawable(avhVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        avh avhVar = this.b;
        if (avhVar == null) {
            return;
        }
        Integer num = avhVar.b;
        if (num == null || num.intValue() != i) {
            avhVar.b = Integer.valueOf(i);
            avhVar.setRadius(i);
        }
        long jK = bko.k(bkv.d(j2), bkv.c(j2), bkv.b(j2), ukc.l(f2, 1.0f), bkv.f(j2));
        bkv bkvVar = avhVar.a;
        if (bkvVar == null || !a.q(bkvVar.g, jK)) {
            avhVar.a = new bkv(jK);
            avhVar.setColor(ColorStateList.valueOf(bko.h(jK)));
        }
        Rect rect = new Rect(0, 0, ukj.x(Float.intBitsToFloat((int) (j >> 32))), ukj.x(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        avhVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (jLongValue < 5) {
                mb mbVar = new mb(this, 6);
                this.d = mbVar;
                postDelayed(mbVar, 50L);
                this.g = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = a;
        }
        avh avhVar = this.b;
        if (avhVar != null) {
            avhVar.setState(iArr);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        uif uifVar = this.e;
        if (uifVar != null) {
            uifVar.a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
