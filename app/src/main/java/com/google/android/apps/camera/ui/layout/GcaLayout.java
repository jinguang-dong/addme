package com.google.android.apps.camera.ui.layout;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ckl;
import defpackage.cku;
import defpackage.gzi;
import defpackage.gzj;
import defpackage.hbj;
import defpackage.inl;
import defpackage.mxe;
import defpackage.mxf;
import defpackage.owf;
import defpackage.owq;
import defpackage.pnq;
import defpackage.rnt;
import defpackage.rww;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GcaLayout extends ConstraintLayout {
    public rww i;
    public AtomicReference j;
    public pnq k;
    public owq l;
    public owf m;
    public hbj n;

    public GcaLayout(Context context) {
        super(context);
        g(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g(Context context) {
        ((mxe) ((inl) context).c(mxe.class)).b(this);
        if (this.n != null) {
            gzi gziVar = gzj.a;
        }
    }

    private static final void h(cku ckuVar, int i) {
        ckuVar.f(i, 3);
        ckuVar.f(i, 6);
        ckuVar.f(i, 7);
        ckuVar.f(i, 4);
    }

    private static final void i(cku ckuVar, Consumer consumer, int i) {
        h(ckuVar, i);
        consumer.accept(Integer.valueOf(i));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mxf;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: dQ */
    public final ckl generateDefaultLayoutParams() {
        return new mxf(1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: eX */
    public final ckl generateLayoutParams(AttributeSet attributeSet) {
        return new mxf(getContext(), attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mxf(1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object tag = getTag();
        rnt.x(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r11, int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.ui.layout.GcaLayout.onMeasure(int, int):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new mxf(layoutParams);
    }

    public GcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(context);
    }
}
