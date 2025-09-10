package com.google.android.apps.camera.bottombar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.ar.core.R;
import defpackage.cot;
import defpackage.ctg;
import defpackage.cth;
import defpackage.ctj;
import defpackage.ctn;
import defpackage.cto;
import defpackage.ctp;
import defpackage.dtg;
import defpackage.fdi;
import defpackage.fve;
import defpackage.fvp;
import defpackage.fvy;
import defpackage.fvz;
import defpackage.fwa;
import defpackage.fwb;
import defpackage.gzo;
import defpackage.mmr;
import defpackage.mmw;
import defpackage.mwq;
import defpackage.ojl;
import defpackage.out;
import defpackage.rnt;
import defpackage.rvk;
import defpackage.rwc;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ThumbnailView extends ImageButton {
    private final float A;
    private final Paint B;
    private final Paint C;
    private final float D;
    private final Paint E;
    private final float F;
    private final float G;
    private final float H;
    private final Paint I;
    private final Paint J;
    private final ValueAnimator K;
    private fwb L;
    private cth M;
    private ctg N;
    private boolean O;
    private final View.OnClickListener P;
    public final ctn a;
    public rwc b;
    public rwc c;
    public AnimatorSet d;
    public float e;
    public float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public ValueAnimator k;
    public float l;
    public float m;
    public float n;
    public float o;
    public fwb p;
    public fwb q;
    public mwq r;
    private final boolean s;
    private final cto t;
    private final RectF u;
    private final float v;
    private final float w;
    private final float x;
    private final float y;
    private final float z;

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        ctn ctnVar = new ctn();
        this.a = ctnVar;
        cto ctoVar = new cto(ctnVar);
        this.t = ctoVar;
        rvk rvkVar = rvk.a;
        this.b = rvkVar;
        this.c = rvkVar;
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.7f, 0.0f);
        this.K = valueAnimatorOfFloat;
        int i2 = 0;
        this.O = false;
        fvp fvpVar = new fvp(this, 5, null);
        this.P = fvpVar;
        if (context instanceof fdi) {
            this.s = ((fdi) context).b().p(gzo.bw);
        } else {
            this.s = false;
        }
        super.setOnClickListener(fvpVar);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: fvx
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean zC = false;
                if (!view.isClickable()) {
                    return false;
                }
                ThumbnailView thumbnailView = this.a;
                if (thumbnailView.b.h()) {
                    Iterator it = ((mod) ((rnu) thumbnailView.b.c()).a).b.iterator();
                    while (it.hasNext()) {
                        zC |= ((mob) it.next()).c();
                    }
                }
                return zC;
            }
        });
        setClickable(true);
        setLongClickable(false);
        getResources().getDimension(R.dimen.rounded_thumbnail_padding);
        this.v = getResources().getDimension(R.dimen.rounded_thumbnail_diameter_min);
        float dimension = getResources().getDimension(R.dimen.rounded_thumbnail_diameter_max);
        this.w = dimension;
        this.x = dimension;
        float dimension2 = this.s ? getResources().getDimension(R.dimen.freeway_bottom_bar_side_button_side_length) : getResources().getDimension(R.dimen.rounded_thumbnail_diameter_normal);
        this.g = dimension2;
        float f = (float) (dimension2 * 0.3d);
        this.y = f;
        this.A = getResources().getDimension(R.dimen.freeway_bottom_bar_side_button_corner_radius);
        this.z = getResources().getDimension(R.dimen.rounded_thumbnail_type_icon_size);
        float dimension3 = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        this.h = dimension3;
        this.u = new RectF(0.0f, 0.0f, dimension3, dimension3);
        this.H = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_diameter_min);
        this.i = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_thick_max);
        this.j = getResources().getDimension(R.dimen.rounded_thumbnail_ripple_ring_thick_min);
        getResources().getDimensionPixelOffset(R.dimen.rounded_thumbnail_shrink_size);
        if (this.s) {
            ctp ctpVar = new ctp();
            mmw mmwVar = mmr.b;
            ctpVar.e(mmwVar.b);
            ctpVar.c(mmwVar.a);
            this.M = new dtg(this, i);
            this.N = new fvy(this, i2);
            ctoVar.s = ctpVar;
            ctoVar.k(1.0f / (dimension2 - f));
        }
        Paint paint = new Paint(1);
        this.J = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new fve(this, i));
        Paint paint2 = new Paint(1);
        this.I = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.B = paint3;
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(1);
        this.C = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        float dimension4 = getResources().getDimension(R.dimen.rounded_thumbnail_inner_stroke_width);
        this.D = dimension4;
        paint4.setStrokeWidth(dimension4);
        paint4.setColor(-1);
        Paint paint5 = new Paint(1);
        this.E = paint5;
        paint5.setColor(ojl.aT(this));
        paint5.setStyle(Paint.Style.FILL);
        this.F = getResources().getDimension(R.dimen.badge_size);
        this.G = getResources().getDimension(R.dimen.badge_offset_from_center);
        c(b(2), 2, 0, false);
        if (this.s) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    private final void d(Canvas canvas, float f, float f2, float f3, Paint paint, float f4) {
        canvas.drawRoundRect(this.u, f3, f3, paint);
        Paint paint2 = this.C;
        float f5 = this.D / f4;
        paint2.setStrokeWidth(f5);
        canvas.drawCircle(f, f2, f3 - (f5 / 2.0f), paint2);
    }

    public final void a() {
        fwb fwbVar = this.q;
        if (fwbVar != null && fwbVar.d && fwbVar.e) {
            this.L = fwbVar;
            if (this.s) {
                return;
            }
            this.q = null;
        }
    }

    public final Bitmap b(int i) throws Resources.NotFoundException {
        Drawable drawable;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i2 = (int) this.g;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, config);
        boolean z = this.s;
        if (!z) {
            bitmapCreateBitmap.eraseColor(getResources().getColor(R.color.indicator_background, null));
        }
        int i3 = i - 1;
        if (i3 == 2) {
            drawable = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
        } else if (i3 == 3) {
            drawable = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
            drawable.mutate().setTint(ojl.aN(this));
            bitmapCreateBitmap.eraseColor(ojl.aT(this));
        } else if (i3 == 4) {
            drawable = getResources().getDrawable(R.drawable.ic_camera_thumbnail, null);
        } else if (i3 != 5) {
            drawable = getResources().getDrawable(R.drawable.gs_photo_library_vd_24, null);
            if (!z) {
                bitmapCreateBitmap.eraseColor(-10525848);
            }
        } else {
            drawable = getResources().getDrawable(R.drawable.ic_videocam_thumbnail, null);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawable != null) {
            float f = this.z;
            int i4 = (int) ((i2 - f) / 2.0f);
            int i5 = ((int) f) + i4;
            drawable.setBounds(i4, i4, i5, i5);
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public final void c(Bitmap bitmap, int i, int i2, boolean z) throws Resources.NotFoundException {
        bitmap.getClass();
        out.a();
        int i3 = 4;
        this.O = i != 4 && z;
        if (this.p == null) {
            fwb fwbVar = new fwb(this.h, "");
            fwbVar.f = true;
            this.p = fwbVar;
        }
        fwb fwbVar2 = this.p;
        if (fwbVar2.c == null) {
            bitmap.getWidth();
            bitmap.getHeight();
            float f = fwbVar2.a;
            BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            if (bitmap.getWidth() != f || bitmap.getHeight() != f) {
                Matrix matrix = new Matrix();
                float fMax = Math.max((bitmap.getHeight() - bitmap.getWidth()) / 2.0f, 0.0f);
                float fMax2 = Math.max((bitmap.getWidth() - bitmap.getHeight()) / 2.0f, 0.0f);
                float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                RectF rectF = new RectF(fMax2, fMax, fMax2 + fMin, fMin + fMax);
                matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, f, f), Matrix.ScaleToFit.FILL);
                matrix.preRotate(i2, rectF.centerX(), rectF.centerY());
                bitmapShader.setLocalMatrix(matrix);
            }
            fwbVar2.c = new Paint();
            fwbVar2.c.setAntiAlias(true);
            fwbVar2.c.setShader(bitmapShader);
        }
        byte[] bArr = null;
        if (getVisibility() != 0) {
            this.L = null;
            this.q = null;
        }
        if (z) {
            setContentDescription(getResources().getString(R.string.accessibility_mars_button));
        } else {
            setContentDescription(getResources().getString(R.string.accessibility_filmstrip_toggle));
        }
        fwb fwbVar3 = this.p;
        rnt.x(fwbVar3);
        boolean z2 = fwbVar3.f;
        if (!z2) {
            if (!this.s) {
                this.L = null;
            }
            fwb fwbVar4 = this.q;
            if (fwbVar4 != null) {
                this.L = fwbVar4;
                fwbVar4.a();
                this.L.b();
            }
        }
        fwb fwbVar5 = this.p;
        this.q = fwbVar5;
        this.p = null;
        if (z2) {
            if (this.d == null) {
                this.e = this.g;
                this.f = 0.0f;
                rnt.x(fwbVar5);
                fwbVar5.b();
            }
            if (this.k == null) {
                fwb fwbVar6 = this.q;
                rnt.x(fwbVar6);
                fwbVar6.a();
            }
            invalidate();
            return;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.d.removeAllListeners();
            this.d.cancel();
            this.d = null;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.k.removeAllListeners();
            this.k.cancel();
            this.k = null;
        }
        cto ctoVar = this.t;
        if (ctoVar != null && ctoVar.n) {
            cth cthVar = this.M;
            if (cthVar != null) {
                ctj.d(ctoVar.r, cthVar);
            }
            ctg ctgVar = this.N;
            if (ctgVar != null) {
                ctj.d(ctoVar.q, ctgVar);
            }
            ctoVar.c();
        }
        setVisibility(0);
        if (this.s) {
            this.a.a = this.y;
            cth cthVar2 = this.M;
            if (cthVar2 != null) {
                ctoVar.j(cthVar2);
            }
            ctg ctgVar2 = this.N;
            if (ctgVar2 != null) {
                ctoVar.i(ctgVar2);
            }
            ctoVar.m(this.g);
        } else {
            Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.v, this.w);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
            valueAnimatorOfFloat.addUpdateListener(new cot(this, 2, bArr));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.x, this.g);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.setInterpolator(interpolatorLoadInterpolator);
            valueAnimatorOfFloat2.addUpdateListener(new cot(this, 3, bArr));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            this.d.addListener(new fvz(this));
            this.d.start();
            Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.linear_out_slow_in);
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.H, this.h);
            this.k = valueAnimatorOfFloat3;
            valueAnimatorOfFloat3.setDuration(200L);
            this.k.setInterpolator(interpolatorLoadInterpolator2);
            this.k.addListener(new fwa(this));
            this.k.addUpdateListener(new cot(this, i3, bArr));
            this.k.setStartDelay(100L);
            this.k.start();
        }
        mwq mwqVar = this.r;
        if (mwqVar != null) {
            fwb fwbVar7 = this.q;
            rnt.x(fwbVar7);
            mwqVar.h(fwbVar7.b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) throws Resources.NotFoundException {
        float f;
        float f2;
        ValueAnimator valueAnimator;
        Paint paint;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.u;
        canvas.clipRect(rectF);
        float f3 = this.g;
        float f4 = width / 2.0f;
        float f5 = height / 2.0f;
        float f6 = this.h;
        fwb fwbVar = this.L;
        if (fwbVar == null || (paint = fwbVar.c) == null) {
            f = 2.0f;
        } else {
            float f7 = f3 / f6;
            canvas.save();
            canvas.scale(f7, f7, f4, f5);
            if (this.s) {
                paint.setAntiAlias(false);
                paint.setFilterBitmap(false);
                float f8 = this.e;
                float f9 = this.A / f7;
                float f10 = this.D / f7;
                float f11 = f8 / f7;
                canvas.translate(0.0f, f11);
                Path path = new Path();
                rectF.inset(f10, f10);
                float f12 = f9 - f10;
                path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                float f13 = -f10;
                rectF.inset(f13, f13);
                f = 2.0f;
                rectF.top -= f11;
                rectF.bottom -= f11;
                rectF.inset(f10, f10);
                Path path2 = new Path();
                path2.addRoundRect(rectF, f12, f12, Path.Direction.CW);
                Path path3 = new Path();
                path3.op(path, path2, Path.Op.INTERSECT);
                canvas.drawPath(path3, paint);
                rectF.inset(f13, f13);
                rectF.bottom += f11;
                rectF.top += f11;
            } else {
                f = 2.0f;
                d(canvas, f4, f5, f4, paint, f7);
            }
            canvas.restore();
        }
        if (this.q != null) {
            boolean z = this.s;
            if (!z && this.m > 0.0f && (valueAnimator = this.k) != null && valueAnimator.isRunning()) {
                Paint paint2 = this.I;
                paint2.setAlpha((int) (this.n * 255.0f));
                paint2.setStrokeWidth(this.m);
                canvas.save();
                canvas.drawCircle(f4, f5, this.l / f, paint2);
                canvas.restore();
            }
            canvas.save();
            fwb fwbVar2 = this.q;
            rnt.x(fwbVar2);
            Paint paint3 = fwbVar2.c;
            if (paint3 == null) {
                f2 = 255.0f;
            } else if (z) {
                paint3.setAntiAlias(true);
                paint3.setFilterBitmap(false);
                float f14 = f3 / f6;
                canvas.scale(f14, f14, f4, f5);
                float f15 = f3 - this.e;
                float f16 = this.A;
                float f17 = this.D;
                float f18 = f15 / f14;
                canvas.translate(0.0f, -f18);
                rectF.top += f18;
                float f19 = f17 / f14;
                rectF.inset(f19, f19);
                f2 = 255.0f;
                if (rectF.bottom > rectF.top) {
                    float f20 = (f16 / f14) - f19;
                    canvas.drawRoundRect(rectF, f20, f20, paint3);
                }
                float f21 = -f19;
                rectF.inset(f21, f21);
                rectF.top -= f18;
            } else {
                f2 = 255.0f;
                float f22 = this.e / f6;
                canvas.scale(f22, f22, f4, f5);
                d(canvas, f4, f5, f4, paint3, f22);
            }
            Paint paint4 = this.B;
            paint4.setAlpha((int) (this.f * f2));
            if (!z) {
                canvas.drawCircle(f4, f5, f6 / f, paint4);
            }
            canvas.restore();
        } else {
            f2 = 255.0f;
        }
        if (this.O) {
            if (this.s) {
                Drawable drawable = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                float f23 = this.F / f;
                drawable.setBounds((int) (f4 - f23), (int) (f5 - f23), (int) (f4 + f23), (int) (f23 + f5));
                drawable.draw(canvas);
            } else {
                float f24 = this.G;
                float f25 = f4 + f24;
                float f26 = f24 + f5;
                float f27 = this.F;
                float f28 = this.D;
                float f29 = (f27 - f28) / f;
                canvas.drawCircle(f25, f26, f29, this.E);
                Drawable drawable2 = getResources().getDrawable(R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                drawable2.mutate().setTint(ojl.aN(this));
                float f30 = f27 / f;
                int i = (int) (f25 - (f27 / 4.0f));
                int i2 = ((int) f30) + i;
                drawable2.setBounds(i, i, i2, i2);
                drawable2.draw(canvas);
                Paint paint5 = this.C;
                paint5.setStrokeWidth(f28);
                canvas.drawCircle(f25, f26, f29, paint5);
            }
        }
        if (this.o > 0.0f) {
            canvas.save();
            float f31 = f3 / f6;
            canvas.scale(f31, f31, f4, f5);
            Paint paint6 = this.J;
            paint6.setAlpha((int) (this.o * f2));
            if (this.s) {
                float f32 = this.A / f31;
                canvas.drawRoundRect(rectF, f32, f32, paint6);
            } else {
                canvas.drawCircle(f4, f5, f6 / f, paint6);
            }
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = (int) this.h;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.c = rwc.i(onClickListener);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (z) {
            this.o = 0.7f;
            invalidate();
        } else if (this.o > 0.0f) {
            this.K.start();
        }
    }
}
