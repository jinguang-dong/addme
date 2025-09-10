package com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import com.google.ar.core.R;
import defpackage.nyi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearToggle extends ToggleButton {
    public WearToggle(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        Drawable buttonDrawable = super.getButtonDrawable();
        return buttonDrawable instanceof nyi ? ((nyi) buttonDrawable).getDrawable() : buttonDrawable;
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(new nyi(drawable));
    }

    public WearToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.wearToggleStyle);
    }

    public WearToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
