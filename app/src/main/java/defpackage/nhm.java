package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.ar.core.R;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhm extends View {
    private final float A;
    private final float B;
    private final boolean C;
    private int D;
    private int E;
    private int F;
    private float G;
    private float H;
    private final RectF I;
    private AnimatorSet J;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public float e;
    public int f;
    public int g;
    public long h;
    public int i;
    public boolean j;
    public boolean k;
    protected final boolean l;
    public String m;
    public AnimatorSet n;
    public int o;
    public mwq p;
    private final int q;
    private final Paint r;
    private final Interpolator s;
    private final Interpolator t;
    private final String u;
    private final float v;
    private final float w;
    private final float x;
    private final float y;
    private final float z;

    public nhm(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        super(context);
        this.o = 1;
        this.D = 0;
        this.I = new RectF();
        this.h = -1L;
        this.i = -1;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = "";
        this.n = null;
        this.J = null;
        setVisibility(4);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius_max);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.pie_progress_width);
        context.getResources().getDimensionPixelSize(R.dimen.pie_progress_width_large);
        this.s = new LinearInterpolator();
        this.t = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setAlpha(51);
        Paint paint2 = new Paint(paint);
        this.r = paint2;
        paint2.setAlpha(255);
        Paint paint3 = new Paint();
        this.b = paint3;
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(-1);
        paint3.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.cuttleface_countdown_text_size));
        paint3.setAlpha(165);
        Paint paint4 = new Paint(paint3);
        this.c = paint4;
        paint4.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.cuttleface_countdown_hint_text_size));
        paint4.setAlpha(255);
        this.u = context.getResources().getString(R.string.cuttleface_capturing_first);
        cme.a(context, R.font.google_sans_compat, new nhj(this));
        this.v = Math.abs((paint3.descent() + paint3.ascent()) / 2.0f);
        float fMeasureText = paint3.measureText("0:00");
        float fMeasureText2 = paint3.measureText(":");
        float fMeasureText3 = paint3.measureText("0");
        this.w = fMeasureText3;
        this.x = fMeasureText / 2.0f;
        this.y = fMeasureText2 / 2.0f;
        this.z = fMeasureText3 / 2.0f;
        this.A = Math.abs((paint4.descent() + paint4.ascent()) / 2.0f);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.countdown_hint_padding);
        Math.max(context.getResources().getDimensionPixelSize(R.dimen.pie_progress_radius_large), Math.hypot(r5 + r4 + r7 + paint4.getFontMetrics().bottom, paint4.measureText(r3) / 2.0f));
        this.C = context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private final void e(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.setInterpolator(this.t);
        valueAnimator.setDuration(167L);
        valueAnimator.addUpdateListener(animatorUpdateListener);
    }

    private final void f(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        valueAnimator.setInterpolator(this.s);
        valueAnimator.setDuration(133L);
        valueAnimator.addUpdateListener(animatorUpdateListener);
    }

    protected final void a(Canvas canvas, boolean z) {
        if (this.l) {
            float f = this.F + this.A;
            if (z) {
                f = f + this.v + this.B;
            }
            canvas.drawText(this.u, this.E, f, this.c);
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.J.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.g, 0.0f);
        f(valueAnimatorOfFloat, new nhi(this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        f(valueAnimatorOfFloat2, new nhi(this, 2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfFloat);
        if (this.j) {
            arrayList.add(valueAnimatorOfFloat2);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.J = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.J.addListener(new nhl(this));
        this.J.start();
    }

    public final void c(int i) {
        int iMin = Math.min(100, Math.max(i, 0));
        int i2 = 4;
        if (iMin != 0) {
            AnimatorSet animatorSet = this.n;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.n.cancel();
            }
            this.o = 4;
            this.D = (int) (iMin * 3.6f);
            invalidate();
            if (iMin == 100) {
                b();
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = this.J;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.J.cancel();
        }
        this.D = 0;
        AnimatorSet animatorSet3 = this.n;
        if (animatorSet3 != null && animatorSet3.isRunning()) {
            this.n.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.q, this.f);
        e(valueAnimatorOfInt, new nhi(this, 3));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.g);
        e(valueAnimatorOfFloat, new nhi(this, i2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        e(valueAnimatorOfFloat2, new nhi(this, 5));
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueAnimatorOfInt);
        arrayList.add(valueAnimatorOfFloat);
        if (this.j) {
            arrayList.add(valueAnimatorOfFloat2);
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.n = animatorSet4;
        animatorSet4.playTogether(arrayList);
        this.n.addListener(new nhk(this));
        this.n.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.o == 1) {
            return;
        }
        if (this.k) {
            canvas.drawCircle(this.E, this.F, this.d, this.a);
        }
        if (this.h != -1 && this.m.length() == 4) {
            a(canvas, true);
            if (this.C) {
                String strSubstring = this.m.substring(3, 4);
                float f = this.G;
                float f2 = this.z;
                float f3 = this.F;
                Paint paint = this.b;
                canvas.drawText(strSubstring, f + f2, f3, paint);
                String strSubstring2 = this.m.substring(2, 3);
                float f4 = this.G;
                float f5 = this.w;
                canvas.drawText(strSubstring2, f4 + f5 + f2, this.F, paint);
                canvas.drawText(":", (this.H - f5) - this.y, this.F, paint);
                canvas.drawText(this.m.substring(0, 1), this.H - f2, this.F, paint);
            } else {
                String strSubstring3 = this.m.substring(0, 1);
                float f6 = this.G;
                float f7 = this.z;
                float f8 = this.F;
                Paint paint2 = this.b;
                canvas.drawText(strSubstring3, f6 + f7, f8, paint2);
                float f9 = this.G;
                float f10 = this.w;
                canvas.drawText(":", f9 + f10 + this.y, this.F, paint2);
                canvas.drawText(this.m.substring(2, 3), (this.H - f10) - f7, this.F, paint2);
                canvas.drawText(this.m.substring(3, 4), this.H - f7, this.F, paint2);
            }
        } else if (this.i != -1) {
            a(canvas, true);
            canvas.drawText(String.valueOf(this.i), this.E, this.F, this.b);
        } else if (this.j) {
            a(canvas, false);
            mwq mwqVar = this.p;
            if (mwqVar != null) {
                mwqVar.h(this.u);
            }
        }
        int i = this.o;
        if (i == 4 || i == 3) {
            this.a.setStrokeWidth(this.e);
            Paint paint3 = this.r;
            paint3.setStrokeWidth(this.e);
            RectF rectF = this.I;
            int i2 = this.E;
            int i3 = this.d;
            int i4 = this.F;
            rectF.set(i2 - i3, i4 - i3, i2 + i3, i4 + i3);
            canvas.drawArc(rectF, -90.0f, this.D, false, paint3);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = (i3 - i) / 2;
            this.E = i5;
            this.F = (i4 - i2) / 2;
            float f = this.x;
            float f2 = i5;
            this.G = f2 - f;
            this.H = f2 + f;
        }
    }
}
