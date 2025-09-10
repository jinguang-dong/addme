package android.support.v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.bn;
import defpackage.byz;
import defpackage.cok;
import defpackage.cty;
import defpackage.hn;
import defpackage.im;
import defpackage.in;
import defpackage.lw;
import defpackage.ly;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    public final hn a;
    private final in b;
    private im c;
    private byz d;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private final byz c() {
        if (this.d == null) {
            this.d = new byz((TextView) this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.a();
        }
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    final im eM() {
        if (this.c == null) {
            this.c = new im(this, new bn(this, 6));
        }
        return this.c;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        cok.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return eM().b;
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return eM().a;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        cty.e();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        c();
        cty.e();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return eM().b(str);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        in inVar = this.b;
        if (inVar != null) {
            inVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        eM().a(typeface);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ly.a(context);
        lw.d(this, getContext());
        hn hnVar = new hn(this);
        this.a = hnVar;
        hnVar.b(attributeSet, i);
        in inVar = new in(this);
        this.b = inVar;
        inVar.c(attributeSet, i);
        inVar.a();
        c().G(attributeSet, i);
    }
}
