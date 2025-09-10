package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.ar.core.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkt {
    static final TimeInterpolator a = rhn.c;
    public static final int b = R.attr.motionDurationLong2;
    public static final int c = R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = R.attr.motionDurationMedium1;
    public static final int e = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public final FloatingActionButton B;
    final AmbientModeSupport.AmbientController C;
    private StateListAnimator D;
    public roc l;
    public rnx m;
    public Drawable n;
    public rki o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public rhr w;
    public rhr x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final Rect E = new Rect();
    private final RectF F = new RectF();
    private final RectF G = new RectF();
    private final Matrix H = new Matrix();

    public rkt(FloatingActionButton floatingActionButton, AmbientModeSupport.AmbientController ambientController) {
        this.B = floatingActionButton;
        this.C = ambientController;
    }

    private final Animator m(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.B;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    public final int a() {
        if (this.q) {
            return Math.max((this.u - this.B.b()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet b(rhr rhrVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.B;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        rhrVar.b("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        rhrVar.b("scale").b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        rhrVar.b("scale").b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.H;
        d(f4, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new rhp(), new rkr(this), new Matrix(matrix));
        rhrVar.b("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        rkf.c(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f2, final float f3, final float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.B;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f5 = this.y;
        final Matrix matrix = new Matrix(this.H);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rko
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fA = rhn.a(alpha, f2, 0.0f, 0.2f, fFloatValue);
                rkt rktVar = this.a;
                FloatingActionButton floatingActionButton2 = rktVar.B;
                floatingActionButton2.setAlpha(fA);
                float f6 = f3;
                float f7 = scaleX;
                floatingActionButton2.setScaleX(f7 + ((f6 - f7) * fFloatValue));
                float f8 = scaleY;
                floatingActionButton2.setScaleY(f8 + ((f6 - f8) * fFloatValue));
                float f9 = f4;
                float f10 = f5;
                float f11 = f10 + (fFloatValue * (f9 - f10));
                rktVar.y = f11;
                Matrix matrix2 = matrix;
                rktVar.d(f11, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        rkf.c(animatorSet, arrayList);
        animatorSet.setDuration(rnt.f(floatingActionButton.getContext(), i2, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(qpt.G(floatingActionButton.getContext(), i3, rhn.b));
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        if (this.B.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.F;
        RectF rectF2 = this.G;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public final void e(float f2, float f3, float f4) {
        FloatingActionButton floatingActionButton = this.B;
        if (floatingActionButton.getStateListAnimator() == this.D) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, m(f2, f4));
            stateListAnimator.addState(g, m(f2, f3));
            stateListAnimator.addState(h, m(f2, f3));
            stateListAnimator.addState(i, m(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, m(0.0f, 0.0f));
            this.D = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (k()) {
            i();
        }
    }

    public final void f(float f2) {
        this.y = f2;
        Matrix matrix = this.H;
        d(f2, matrix);
        this.B.setImageMatrix(matrix);
    }

    public final void g(roc rocVar) {
        this.l = rocVar;
        rnx rnxVar = this.m;
        if (rnxVar != null) {
            rnxVar.m(rocVar);
        }
        rki rkiVar = this.o;
        if (rkiVar != null) {
            rkiVar.h = rocVar;
            rkiVar.invalidateSelf();
        }
    }

    public final void h() {
        f(this.y);
    }

    public final void i() {
        Rect rect = this.E;
        AmbientModeSupport.AmbientController ambientController = this.C;
        if (ambientController.e()) {
            int iA = a();
            int iMax = Math.max(iA, (int) Math.ceil(this.B.getElevation() + this.t));
            int iMax2 = Math.max(iA, (int) Math.ceil(r3 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
        } else if (j()) {
            int iB = (this.u - this.B.b()) / 2;
            rect.set(iB, iB, iB, iB);
        } else {
            rect.set(0, 0, 0, 0);
        }
        coe.e(this.p, "Didn't initialize content background");
        if (k()) {
            ambientController.d(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            ambientController.d(this.p);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ambientController.a;
        floatingActionButton.c.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    final boolean j() {
        return this.q && this.B.b() < this.u;
    }

    final boolean k() {
        return this.C.e() || j();
    }

    public final boolean l() {
        FloatingActionButton floatingActionButton = this.B;
        return floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
    }
}
