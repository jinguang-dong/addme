package com.google.android.apps.camera.ui.layout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import defpackage.mxj;
import defpackage.mxl;
import defpackage.mxm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RotatingGcaLayout extends GcaLayout implements mxl {
    private final int[] o;
    private mxj p;
    private mxm q;
    private boolean r;

    public RotatingGcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new int[2];
        this.p = mxj.PHONE_LAYOUT;
        this.q = mxm.PORTRAIT;
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        if (this.p != mxjVar) {
            this.r = true;
            if (!((Boolean) this.l.dL()).booleanValue() && getRotation() != 0.0f) {
                setRotation(0.0f);
            }
            this.p = mxjVar;
        }
        if (this.q != mxmVar) {
            if (((Boolean) this.l.dL()).booleanValue()) {
                float rotation = getRotation();
                float f = mxmVar.e;
                if (rotation != f) {
                    setRotation(f);
                }
            }
            this.q = mxmVar;
        }
    }

    @Override // com.google.android.apps.camera.ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (((Boolean) this.l.dL()).booleanValue()) {
            if (getRotation() == 0.0f) {
                setX(0.0f);
                setY(0.0f);
            } else {
                getLocationInWindow(this.o);
                int i5 = ((Activity) getContext()).isInMultiWindowMode() ? getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top : 0;
                float x = getX();
                float y = getY();
                float height = x - r0[0];
                float width = (y - r0[1]) + i5;
                if (getRotation() == mxm.LANDSCAPE.e) {
                    width += getWidth();
                } else if (getRotation() == mxm.REVERSE_LANDSCAPE.e) {
                    height += getHeight();
                }
                if (x != height) {
                    setX(height);
                }
                if (y != width) {
                    setY(width);
                }
            }
        } else if (this.r) {
            setX(0.0f);
            setY(0.0f);
            this.r = false;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
