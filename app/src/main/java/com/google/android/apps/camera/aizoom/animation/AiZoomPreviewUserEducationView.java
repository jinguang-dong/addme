package com.google.android.apps.camera.aizoom.animation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.R;
import defpackage.efh;
import defpackage.efm;
import defpackage.efs;
import defpackage.fha;
import defpackage.fhi;
import defpackage.ovx;
import defpackage.owf;
import defpackage.owq;
import defpackage.shl;
import defpackage.shx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AiZoomPreviewUserEducationView extends View {
    public final efs a;
    public final fha b;
    public owq c;
    public owf d;
    private final int e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final String j;
    private final TextPaint k;

    public AiZoomPreviewUserEducationView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.a = new efs();
        this.b = new fha(this);
        this.c = new ovx(fhi.a);
        this.d = new ovx(new RectF());
        setVisibility(8);
        Resources resources = getResources();
        this.f = resources.getDimension(R.dimen.boba_pearl_drag_edu_lottie_drawable_width);
        this.g = resources.getDimension(R.dimen.boba_pearl_drag_edu_lottie_drawable_height);
        this.h = resources.getDimension(R.dimen.boba_pearl_drag_edu_text_to_pip_bottom_offset);
        this.i = resources.getDimension(R.dimen.boba_pearl_drag_edu_text_static_layout_width);
        this.j = resources.getString(R.string.boba_pearl_drag_edu_text_str);
        int color = resources.getColor(R.color.boba_pearl_drag_edu_text_color, null);
        this.e = color;
        TextPaint textPaint = new TextPaint();
        this.k = textPaint;
        textPaint.setColor(color);
        textPaint.setTextSize(resources.getDimension(R.dimen.boba_pearl_drag_edu_text_size));
        textPaint.setTypeface(Typeface.create(Typeface.create("google-sans", 0), 500, false));
        resources.getDimension(R.dimen.boba_pearl_expansion_hint_drawable_width);
        resources.getDimension(R.dimen.boba_pearl_expansion_hint_drawable_height);
        resources.getDrawable(R.drawable.expansion_hint, null);
        resources.getDimension(R.dimen.boba_pearl_expansion_hint_to_pip_right_offset);
        resources.getDimension(R.dimen.boba_pearl_expansion_hint_to_pip_bottom_offset);
    }

    private final synchronized void c(Canvas canvas) {
        canvas.save();
        float f = this.f;
        float f2 = this.g;
        Rect rect = new Rect(0, 0, (int) f, (int) f2);
        efs efsVar = this.a;
        efsVar.setBounds(rect);
        canvas.translate(((RectF) this.d.dL()).centerX() - (f / 2.0f), ((RectF) this.d.dL()).centerY() - (f2 / 2.0f));
        efsVar.draw(canvas);
        canvas.restore();
        if (efsVar.u()) {
            return;
        }
        fha fhaVar = this.b;
        shl shlVar = shx.a;
        fhaVar.a = SystemClock.elapsedRealtime();
        efsVar.t(2);
        efsVar.n();
    }

    private final synchronized void d(Canvas canvas) {
        int i = ((fhi) this.c.dL()).c;
        TextPaint textPaint = this.k;
        textPaint.setAlpha(i);
        String str = this.j;
        int length = str.length();
        float f = this.i;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, length, textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
        canvas.save();
        canvas.translate(((RectF) this.d.dL()).centerX() - (f / 2.0f), (((RectF) this.d.dL()).bottom - staticLayoutBuild.getHeight()) - this.h);
        staticLayoutBuild.draw(canvas);
        canvas.restore();
    }

    public final void a() {
        shl shlVar = shx.a;
        b();
        efs efsVar = this.a;
        efsVar.l();
        efsVar.b.removeUpdateListener(this.b);
    }

    public final void b() {
        setVisibility(8);
        this.c.a(fhi.a);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (!((fhi) this.c.dL()).b) {
            boolean z = ((fhi) this.c.dL()).d;
        } else {
            c(canvas);
            d(canvas);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        Object obj = efm.c(getContext(), R.raw.boba_pearl_drag_edu).a;
        obj.getClass();
        this.a.v((efh) obj);
    }
}
