package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.fwd;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SideButtonContainer extends ConstraintLayout implements fwd {
    private final boolean i;
    private final Drawable j;

    /* JADX WARN: Multi-variable type inference failed */
    public SideButtonContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzo.bw)) {
            z = true;
        }
        this.i = z;
        this.j = context.getResources().getDrawable(R.drawable.side_button_container_background, null);
    }

    @Override // defpackage.fwd
    public final void a() {
        if (this.i) {
            return;
        }
        setBackground(this.j);
    }

    @Override // defpackage.fwd
    public final void b() {
        setBackgroundColor(0);
    }

    @Override // defpackage.fwd
    public final void c() {
        setBackgroundColor(0);
    }
}
