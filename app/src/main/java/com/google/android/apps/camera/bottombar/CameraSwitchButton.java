package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.fvp;
import defpackage.fwd;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CameraSwitchButton extends ScalableButton implements fwd {
    public Animatable a;
    public View.OnClickListener b;
    private final boolean c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
        this.c = z;
        this.d = context.getResources().getDrawable(R.drawable.camera_switch_button_background, null);
        this.f = context.getResources().getDrawable(R.drawable.front_back_switch_button_24px_animation, null);
        this.e = context.getResources().getDrawable(R.drawable.front_back_switch_button_animation, null);
        super.setOnClickListener(new fvp(this, 4));
        setFocusable(false);
        if (z) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    @Override // defpackage.fwd
    public final void a() {
        setImageDrawable(this.f);
        if (this.c) {
            return;
        }
        setBackgroundColor(0);
    }

    @Override // defpackage.fwd
    public final void c() {
        setImageDrawable(this.e);
        if (this.c) {
            return;
        }
        setBackground(this.d);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    @Override // defpackage.fwd
    public final void b() {
    }
}
