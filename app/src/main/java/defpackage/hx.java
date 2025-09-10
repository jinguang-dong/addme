package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hx extends RadioButton {
    private final hq a;
    private final hn b;
    private final in c;
    private byz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        ly.a(context);
        lw.d(this, getContext());
        hq hqVar = new hq(this);
        this.a = hqVar;
        hqVar.b(attributeSet, R.attr.radioButtonStyle);
        hn hnVar = new hn(this);
        this.b = hnVar;
        hnVar.b(attributeSet, R.attr.radioButtonStyle);
        in inVar = new in(this);
        this.c = inVar;
        inVar.c(attributeSet, R.attr.radioButtonStyle);
        a().G(attributeSet, R.attr.radioButtonStyle);
    }

    private final byz a() {
        if (this.d == null) {
            this.d = new byz((TextView) this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.a();
        }
        in inVar = this.c;
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

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.b;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(byi.bJ(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        in inVar = this.c;
        if (inVar != null) {
            inVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        in inVar = this.c;
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

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        hq hqVar = this.a;
        if (hqVar != null) {
            hqVar.c();
        }
    }
}
