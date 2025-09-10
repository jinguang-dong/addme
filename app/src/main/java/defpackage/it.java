package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class it extends ToggleButton {
    private final hn a;
    private final in b;
    private byz c;

    public it(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        lw.d(this, getContext());
        hn hnVar = new hn(this);
        this.a = hnVar;
        hnVar.b(attributeSet, R.attr.buttonStyleToggle);
        in inVar = new in(this);
        this.b = inVar;
        inVar.c(attributeSet, R.attr.buttonStyleToggle);
        a().G(attributeSet, R.attr.buttonStyleToggle);
    }

    private final byz a() {
        if (this.c == null) {
            this.c = new byz((TextView) this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        cty.e();
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.a;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        in inVar = this.b;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        cty.e();
        super.setFilters(inputFilterArr);
    }
}
