package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpp extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private rpn e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, rpp] */
    public rpp(TabLayout tabLayout, Context context) {
        super(context);
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.p;
        if (i != 0) {
            Drawable drawableBJ = byi.bJ(context, i);
            this.c = drawableBJ;
            if (drawableBJ != null && drawableBJ.isStateful()) {
                drawableBJ.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.k != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.k;
            int[] iArr = rnl.a;
            int[] iArr2 = rnl.d;
            int iA = rnl.a(colorStateList, rnl.c);
            int[] iArr3 = rnl.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr2, iArr3, StateSet.NOTHING}, new int[]{iA, rnl.a(colorStateList, iArr3), rnl.a(colorStateList, rnl.a)});
            boolean z = tabLayout.y;
            gradientDrawable = new RippleDrawable(colorStateList2, true == z ? null : gradientDrawable, true != z ? gradientDrawable2 : null);
        }
        setBackground(gradientDrawable);
        tabLayout.invalidate();
        setPaddingRelative(tabLayout.c, tabLayout.d, tabLayout.e, tabLayout.f);
        setGravity(17);
        setOrientation(!tabLayout.v ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        int[] iArr4 = con.a;
        coi.j(this, systemIcon);
    }

    private static final void d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new fjt(view, 13, null));
    }

    public final void a(rpn rpnVar) {
        if (rpnVar != this.e) {
            this.e = rpnVar;
            b();
        }
    }

    final void b() {
        c();
        rpn rpnVar = this.e;
        boolean z = false;
        if (rpnVar != null) {
            TabLayout tabLayout = rpnVar.g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iA = tabLayout.a();
            if (iA != -1 && iA == rpnVar.d) {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void c() {
        boolean z;
        int i;
        rpn rpnVar = this.e;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        TextView textView2 = this.a;
        TabLayout tabLayout = this.d;
        textView2.setTextAppearance(tabLayout.g);
        if (!isSelected() || (i = tabLayout.i) == -1) {
            this.a.setTextAppearance(tabLayout.h);
        } else {
            this.a.setTextAppearance(i);
        }
        ColorStateList colorStateList = tabLayout.j;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView3 = this.a;
        ImageView imageView2 = this.b;
        rpn rpnVar2 = this.e;
        CharSequence charSequence = rpnVar2 != null ? rpnVar2.b : null;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        boolean z2 = !zIsEmpty;
        if (textView3 != null) {
            if (zIsEmpty) {
                z = false;
            } else {
                int i2 = this.e.f;
                z = true;
            }
            textView3.setText(true != z2 ? null : charSequence);
            textView3.setVisibility(true != z ? 8 : 0);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int iH = (z && imageView2.getVisibility() == 0) ? (int) qpt.H(getContext(), 8) : 0;
            if (tabLayout.v) {
                if (iH != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iH);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (iH != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iH;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        rpn rpnVar3 = this.e;
        CharSequence charSequence2 = rpnVar3 != null ? rpnVar3.c : null;
        if (true != z2) {
            charSequence = charSequence2;
        }
        setTooltipText(charSequence);
        d(this.b);
        d(this.a);
        if (rpnVar == null || TextUtils.isEmpty(rpnVar.c)) {
            return;
        }
        setContentDescription(rpnVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c;
        int[] drawableState = getDrawableState();
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
            this.d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cpt cptVar = new cpt(accessibilityNodeInfo);
        cptVar.p(ejs.p(0, 1, this.e.d, 1, isSelected()));
        if (isSelected()) {
            cptVar.n(false);
            cptVar.H(cps.e);
        }
        cptVar.v(getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.d;
        int i3 = tabLayout.q;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = tabLayout.m;
            if (isSelected() && tabLayout.i != -1) {
                f = tabLayout.n;
            }
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.o;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i4 != maxLines)) {
                if (tabLayout.u != 1 || f <= textSize || lineCount != 1 || ((layout = this.a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.a.setTextSize(0, f);
                    this.a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.e == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.e.a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
