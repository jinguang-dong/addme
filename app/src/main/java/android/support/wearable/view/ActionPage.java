package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.ar.core.R;
import defpackage.mo;
import defpackage.mp;
import defpackage.mu;
import j$.util.Objects;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class ActionPage extends ViewGroup {
    private final mp a;
    private mu b;
    private int c;
    private float d;
    private final Point e;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private boolean j;

    public ActionPage(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.j = true;
        if (this.h != windowInsets.isRound()) {
            this.h = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.i != systemWindowInsetBottom) {
            this.i = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.h) {
            this.i = (int) Math.max(this.i, getMeasuredHeight() * 0.09375f);
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j) {
            return;
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Point point = this.e;
        this.b.layout((int) (point.x - this.d), (int) (point.y - this.d), (int) (point.x + this.d), (int) (point.y + this.d));
        int i5 = (int) (((i3 - i) - this.f) / 2.0f);
        this.a.layout(i5, this.b.getBottom(), this.f + i5, this.b.getBottom() + this.g);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        float f = measuredHeight;
        int measuredWidth = getMeasuredWidth();
        float f2 = measuredWidth;
        mu muVar = this.b;
        if (muVar.e != 1 || muVar.c == null) {
            int iMin = (int) (Math.min(measuredWidth, measuredHeight) * 0.45f);
            this.c = iMin;
            this.d = iMin / 2.0f;
            this.b.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        } else {
            muVar.measure(0, 0);
            int iMin2 = Math.min(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
            this.c = iMin2;
            this.d = iMin2 / 2.0f;
        }
        if (this.h) {
            this.e.set(measuredWidth / 2, measuredHeight / 2);
            this.f = (int) (f2 * 0.625f);
            this.i = (int) (0.09375f * f);
        } else {
            this.e.set(measuredWidth / 2, (int) (0.43f * f));
            this.f = (int) (f2 * 0.892f);
        }
        this.g = (int) ((f - (this.e.y + this.d)) - this.i);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        mu muVar = this.b;
        if (muVar != null) {
            muVar.setEnabled(z);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        mu muVar = this.b;
        if (muVar != null) {
            muVar.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public final void setStateListAnimator(StateListAnimator stateListAnimator) {
        mu muVar = this.b;
        if (muVar != null) {
            muVar.setStateListAnimator(stateListAnimator);
        }
    }

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_ActionPage);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new Point();
        this.b = new mu(context);
        mp mpVar = new mp(context);
        this.a = mpVar;
        mpVar.a(17);
        mpVar.b(2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo.b, i, i2);
        float dimension = 1.0f;
        int i3 = 0;
        String string = null;
        float dimension2 = 0.0f;
        int i4 = 1;
        for (int i5 = 0; i5 < typedArrayObtainStyledAttributes.getIndexCount(); i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 7) {
                mu muVar = this.b;
                muVar.b = typedArrayObtainStyledAttributes.getColorStateList(7);
                muVar.a.getPaint().setColor(muVar.b.getDefaultColor());
            } else if (index == 4) {
                mu muVar2 = this.b;
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
                Drawable drawable2 = muVar2.c;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                if (muVar2.c != drawable) {
                    muVar2.c = drawable;
                    muVar2.requestLayout();
                    muVar2.invalidate();
                }
                Drawable drawable3 = muVar2.c;
                if (drawable3 != null) {
                    drawable3.setCallback(muVar2);
                }
            } else if (index == 14) {
                mu muVar3 = this.b;
                muVar3.e = typedArrayObtainStyledAttributes.getInt(14, 0);
                if (muVar3.c != null) {
                    muVar3.invalidate();
                    muVar3.requestLayout();
                }
            } else if (index == 13) {
                this.b.b(typedArrayObtainStyledAttributes.getColor(13, -1));
            } else if (index == 17) {
                this.b.a(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
            } else if (index == 5) {
                mp mpVar2 = this.a;
                CharSequence text = typedArrayObtainStyledAttributes.getText(5);
                if (text != null) {
                    if (!Objects.equals(mpVar2.c, text)) {
                        mpVar2.a = null;
                        mpVar2.c = text;
                        mpVar2.requestLayout();
                        mpVar2.invalidate();
                    }
                } else {
                    throw new RuntimeException("Can not set ActionLabel text to null");
                }
            } else if (index == 16) {
                mp mpVar3 = this.a;
                float fApplyDimension = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(16, 10.0f), mpVar3.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension != mpVar3.f) {
                    mpVar3.a = null;
                    mpVar3.f = fApplyDimension;
                    mpVar3.requestLayout();
                    mpVar3.invalidate();
                }
            } else if (index == 15) {
                mp mpVar4 = this.a;
                float fApplyDimension2 = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(15, 60.0f), mpVar4.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension2 != mpVar4.g) {
                    mpVar4.a = null;
                    mpVar4.g = fApplyDimension2;
                    mpVar4.requestLayout();
                    mpVar4.invalidate();
                }
            } else if (index == 2) {
                mp mpVar5 = this.a;
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
                colorStateList.getClass();
                mpVar5.b = colorStateList;
                mpVar5.e();
            } else if (index == 6) {
                this.a.b(typedArrayObtainStyledAttributes.getInt(6, 2));
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(10);
            } else if (index == 0) {
                i4 = typedArrayObtainStyledAttributes.getInt(0, i4);
            } else {
                if (index == 1) {
                    i3 = typedArrayObtainStyledAttributes.getInt(1, i3);
                } else if (index == 3) {
                    this.a.a(typedArrayObtainStyledAttributes.getInt(3, 17));
                } else if (index == 8) {
                    dimension2 = typedArrayObtainStyledAttributes.getDimension(8, dimension2);
                } else if (index == 9) {
                    dimension = typedArrayObtainStyledAttributes.getDimension(9, dimension);
                } else if (index == 12) {
                    this.b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(12, 0)));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        mp mpVar6 = this.a;
        if (mpVar6.e != dimension2 || mpVar6.d != dimension) {
            mpVar6.e = dimension2;
            mpVar6.d = dimension;
            if (mpVar6.a != null) {
                mpVar6.a = null;
                mpVar6.requestLayout();
                mpVar6.invalidate();
            }
        }
        this.a.d(string, i4, i3);
        addView(this.a);
        addView(this.b);
    }
}
