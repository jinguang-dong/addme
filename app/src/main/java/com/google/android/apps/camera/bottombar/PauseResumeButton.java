package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gsn;
import defpackage.gzo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PauseResumeButton extends ImageButton {
    private static final int[] f = {R.attr.state_paused};
    public final Context a;
    public boolean b;
    public boolean c;
    public Drawable d;
    public gsn e;
    private final boolean g;
    private Drawable h;

    /* JADX WARN: Multi-variable type inference failed */
    public PauseResumeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.g = (context instanceof fdi) && ((fdi) context).b().p(gzo.bw);
        this.a = context;
    }

    public final void a() {
        if (this.h == null || this.b) {
            this.h = this.a.getResources().getDrawable(R.drawable.ic_pause_circle_outline_24px, null);
        }
        setImageDrawable(this.h);
        if (!this.g) {
            setBackground(this.a.getResources().getDrawable(R.drawable.crossfade_button_background));
        }
        this.c = false;
        setContentDescription(getResources().getString(R.string.pause_video_recording));
        refreshDrawableState();
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (!this.c) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, f);
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b) {
            a();
            this.b = false;
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.c) {
            gsn gsnVar = this.e;
            if (gsnVar != null) {
                gsnVar.f();
            }
        } else {
            gsn gsnVar2 = this.e;
            if (gsnVar2 != null) {
                gsnVar2.e();
            }
        }
        return super.performClick();
    }
}
