package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.nji;
import defpackage.njj;
import defpackage.njk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TracedFrameLayout extends FrameLayout {
    private final njj a;

    public TracedFrameLayout(Context context) {
        super(context);
        this.a = a(this);
    }

    private static njj a(View view) {
        Object tag = view.getTag();
        return tag == null ? nji.a : new njk(tag.toString());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        njj njjVar = this.a;
        njjVar.a("draw");
        super.draw(canvas);
        njjVar.b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        njj njjVar = this.a;
        njjVar.a("onLayout");
        super.onLayout(z, i, i2, i3, i4);
        njjVar.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        njj njjVar = this.a;
        njjVar.a("onMeasure");
        super.onMeasure(i, i2);
        njjVar.b();
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(this);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = a(this);
    }
}
