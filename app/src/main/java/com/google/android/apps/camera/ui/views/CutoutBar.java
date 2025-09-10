package com.google.android.apps.camera.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fdi;
import defpackage.gyr;
import defpackage.gys;
import defpackage.sgv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CutoutBar extends View {
    public static final sgv a = sgv.g("com.google.android.apps.camera.ui.views.CutoutBar");
    public final gyr b;
    public float c;
    public float d;
    public float e;

    /* JADX WARN: Multi-variable type inference failed */
    public CutoutBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.b = gys.a(((fdi) context).b());
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.c;
        float f2 = this.d;
        float f3 = this.e;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        canvas.drawCircle(f, f2, f3, paint);
    }
}
