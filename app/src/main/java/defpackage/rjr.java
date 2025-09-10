package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjr {
    private static final double t = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView a;
    public final rnx c;
    public final rnx d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public roc m;
    public ColorStateList n;
    public Drawable o;
    public LayerDrawable p;
    public boolean r;
    private rnx u;
    private ValueAnimator v;
    private final TimeInterpolator w;
    private final int x;
    private final int y;
    public final Rect b = new Rect();
    public boolean q = false;
    public float s = 0.0f;

    public rjr(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.a = materialCardView;
        rnx rnxVar = new rnx(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.c = rnxVar;
        rnxVar.j(materialCardView.getContext());
        rnxVar.v();
        rob robVar = new rob(rnxVar.i());
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, xu.a, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            robVar.a(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new rnx();
        f(new roc(robVar));
        this.w = qpt.G(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, rhn.a);
        this.x = rnt.f(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.y = rnt.f(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float o() {
        rnt rntVar = this.m.j;
        rnx rnxVar = this.c;
        float fMax = Math.max(q(rntVar, rnxVar.c()), q(this.m.k, rnxVar.d()));
        rnt rntVar2 = this.m.l;
        float[] fArr = rnxVar.i;
        float fQ = q(rntVar2, fArr != null ? fArr[1] : rnxVar.a.a.d.a(rnxVar.h()));
        rnt rntVar3 = this.m.m;
        float[] fArr2 = rnxVar.i;
        return Math.max(fMax, Math.max(fQ, q(rntVar3, fArr2 != null ? fArr2[2] : rnxVar.a.a.e.a(rnxVar.h()))));
    }

    private final boolean p() {
        return this.c.u();
    }

    private static final float q(rnt rntVar, float f) {
        if (rntVar instanceof roa) {
            return (float) ((1.0d - t) * f);
        }
        if (rntVar instanceof rns) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        return this.a.a() + (m() ? o() : 0.0f);
    }

    public final float b() {
        return (this.a.a() * 1.5f) + (m() ? o() : 0.0f);
    }

    public final Drawable c() {
        if (this.o == null) {
            this.u = new rnx(this.m);
            this.o = new RippleDrawable(this.k, null, this.u);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.a.a) {
            int iCeil2 = (int) Math.ceil(b());
            iCeil = (int) Math.ceil(a());
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new rjq(drawable, iCeil, i, iCeil, i);
    }

    public final void e(boolean z, boolean z2) {
        Drawable drawable = this.j;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.s = f;
                return;
            }
            float f2 = z ? 1.0f - this.s : this.s;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.s, f);
            this.v = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new nhi(this, 11));
            this.v.setInterpolator(this.w);
            this.v.setDuration((long) ((z ? this.x : this.y) * f2));
            this.v.start();
        }
    }

    public final void f(roc rocVar) {
        this.m = rocVar;
        rnx rnxVar = this.c;
        rnxVar.m(rocVar);
        rnxVar.u();
        this.d.m(rocVar);
        rnx rnxVar2 = this.u;
        if (rnxVar2 != null) {
            rnxVar2.m(rocVar);
        }
    }

    public final void g() {
        Drawable drawable = this.i;
        Drawable drawableC = n() ? c() : this.d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void h() {
        float fBr = 0.0f;
        float fO = (l() || m()) ? o() : 0.0f;
        MaterialCardView materialCardView = this.a;
        if (materialCardView.b && materialCardView.a) {
            fBr = (float) ((1.0d - t) * a.br(materialCardView.e));
        }
        Rect rect = this.b;
        int i = (int) (fO - fBr);
        materialCardView.c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        a.bs(materialCardView.e);
    }

    public final void i() {
        this.d.q(this.h, this.n);
    }

    public final boolean j() {
        return (this.g & 80) == 80;
    }

    public final boolean k() {
        return (this.g & 8388613) == 8388613;
    }

    public final boolean l() {
        return this.a.b && !p();
    }

    public final boolean m() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.b && p() && materialCardView.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    public final boolean n() {
        MaterialCardView materialCardView = this.a;
        boolean zIsClickable = materialCardView.isClickable();
        MaterialCardView materialCardView2 = materialCardView;
        if (zIsClickable) {
            return true;
        }
        while (materialCardView2.isDuplicateParentStateEnabled() && (materialCardView2.getParent() instanceof View)) {
            materialCardView2 = (View) materialCardView2.getParent();
        }
        return materialCardView2.isClickable();
    }
}
