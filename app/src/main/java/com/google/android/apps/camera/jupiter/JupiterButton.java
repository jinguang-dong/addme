package com.google.android.apps.camera.jupiter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.fwd;
import defpackage.gzo;
import defpackage.ht;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class JupiterButton extends ht implements fwd {
    public boolean a;
    private final boolean b;
    private final Drawable c;
    private final Drawable d;

    /* JADX WARN: Multi-variable type inference failed */
    public JupiterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.a = false;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) {
            z = true;
        }
        this.b = z;
        Drawable drawable = context.getDrawable(R.drawable.jupiter_button_activated_background);
        drawable.getClass();
        this.c = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.jupiter_button_deactivated_background);
        drawable2.getClass();
        this.d = drawable2;
    }

    @Override // defpackage.fwd
    public final void a() {
        if (this.b) {
            return;
        }
        setBackgroundColor(0);
    }

    @Override // defpackage.fwd
    public final void b() {
        if (this.b) {
            return;
        }
        setBackground(this.a ? this.c : this.d);
    }

    @Override // defpackage.fwd
    public final void c() {
        if (this.b) {
            return;
        }
        setBackground(this.a ? this.c : this.d);
    }
}
