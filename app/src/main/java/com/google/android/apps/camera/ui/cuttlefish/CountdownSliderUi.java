package com.google.android.apps.camera.ui.cuttlefish;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.ui.views.CountdownSnapSlider;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.fve;
import defpackage.gzo;
import defpackage.iff;
import defpackage.iyy;
import defpackage.mtn;
import defpackage.mto;
import defpackage.mtq;
import defpackage.mxj;
import defpackage.mxm;
import defpackage.ojl;
import defpackage.qpt;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CountdownSliderUi extends FrameLayout {
    public CountdownSnapSlider a;
    public mxm b;
    public ValueAnimator c;
    public final Map d;
    public boolean e;
    private mxj f;
    private PointF g;
    private Optional h;
    private ValueAnimator i;
    private float j;
    private boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    public CountdownSliderUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = mxj.PHONE_LAYOUT;
        this.b = mxm.PORTRAIT;
        this.h = Optional.empty();
        this.k = true;
        this.d = new HashMap();
        this.e = false;
        if (context instanceof fdi) {
            this.e = ((fdi) context).b().p(gzo.bw);
        }
    }

    public static final ValueAnimator q(View view, boolean z, long j) {
        return y(view, z, j, new iyy(4));
    }

    private final ValueAnimator r(View view, boolean z) {
        return q(view, z, 200L);
    }

    private final void s() {
        String strH = h();
        TextView textViewD = d();
        if (strH.isEmpty()) {
            textViewD.setVisibility(4);
        } else {
            textViewD.setVisibility(0);
        }
    }

    private final void t(TextView textView, double d, float f) throws Resources.NotFoundException {
        double d2 = this.j;
        float width = this.a.getWidth();
        float dimension = getResources().getDimension(R.dimen.label_dim);
        double d3 = d2 - d;
        float f2 = (textView == f() ? -1 : textView == e() ? 1 : textView == b() ? 2 : 0) * this.j;
        Map map = this.d;
        mto mtoVar = (mto) map.get(textView);
        mtoVar.getClass();
        textView.setTranslationX((((width / 2.0f) + f2) - (dimension / 2.0f)) + ((float) d3) + mtoVar.e);
        mto mtoVar2 = (mto) map.get(textView);
        mtoVar2.getClass();
        if (mtoVar2.c == mtq.GONE) {
            textView.setVisibility(8);
            textView.setAlpha(0.0f);
        } else {
            textView.setVisibility(f <= 0.0f ? 8 : 0);
            textView.setAlpha(f);
        }
    }

    private final boolean u(TextView textView) {
        Map map = this.d;
        return map.containsKey(textView) && ((mto) map.get(textView)).c != mtq.GONE;
    }

    private final boolean v(float f, float f2, View view) {
        float x = ((View) view.getParent()).getX() + view.getX();
        float width = view.getWidth();
        float y = findViewById(R.id.countdown_slider_frame).getY();
        return f >= x && f <= x + width && f2 >= y && f2 <= ((float) view.getHeight()) + y;
    }

    private final boolean w() {
        return this.f.a() && !this.b.d();
    }

    private static final ValueAnimator y(View view, boolean z, long j, Runnable runnable) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), true != z ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new fve(view, 16));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addListener(new mtn(z, view, runnable));
        return valueAnimatorOfFloat;
    }

    public final ImageView a() {
        return (ImageView) findViewById(R.id.selected_option_icon);
    }

    public final TextView b() {
        return (TextView) findViewById(R.id.astro_value_label);
    }

    public final TextView c() {
        return (TextView) findViewById(R.id.auto_value_label);
    }

    final TextView d() {
        return (TextView) findViewById(R.id.center_tick_text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.g = new PointF(x, y);
            ImageView imageViewA = a();
            if (v(x, y, imageViewA)) {
                this.a.onTouchEvent(motionEvent);
                this.h = Optional.of(imageViewA);
                return true;
            }
            for (TextView textView : this.d.keySet()) {
                if (v(x, y, textView)) {
                    this.a.onTouchEvent(motionEvent);
                    this.h = Optional.of(textView);
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            if (this.h.isPresent()) {
                if (Math.hypot(x - this.g.x, y - this.g.y) < 1.0d) {
                    ((View) this.h.get()).callOnClick();
                } else {
                    this.a.onTouchEvent(motionEvent);
                }
                this.h = Optional.empty();
                return true;
            }
        } else if (actionMasked == 2 && this.h.isPresent()) {
            this.a.onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final TextView e() {
        return (TextView) findViewById(R.id.max_value_label);
    }

    public final TextView f() {
        return (TextView) findViewById(R.id.min_value_label);
    }

    public final CountdownSnapSlider g() {
        return (CountdownSnapSlider) findViewById(R.id.countdown_slider_view);
    }

    final String h() {
        return d().getText().toString();
    }

    public final void i(boolean z) {
        if (z) {
            if (getVisibility() == 0 && getAlpha() == 1.0f) {
                return;
            }
        } else if (getVisibility() == 8) {
            return;
        }
        ValueAnimator valueAnimatorQ = q(this, z, true != z ? 83L : 167L);
        valueAnimatorQ.start();
        this.c = valueAnimatorQ;
    }

    public final void j(mxj mxjVar, mxm mxmVar) throws Resources.NotFoundException {
        this.b = mxmVar;
        this.f = mxjVar;
        p();
        CountdownSnapSlider countdownSnapSlider = this.a;
        n(countdownSnapSlider.a(countdownSnapSlider.c()));
        View viewFindViewById = this.e ? findViewById(R.id.center_tick_text_container) : d();
        y(viewFindViewById, false, 100L, new iff(this, viewFindViewById, mxmVar, d(), 8)).start();
        qpt.aQ(a(), mxmVar);
    }

    public final void k(String str, String str2) {
        if (h().equals(str)) {
            return;
        }
        TextView textViewD = d();
        textViewD.setText(str);
        textViewD.setContentDescription(str2);
        s();
    }

    public final void l(TextView textView, mtq mtqVar) {
        mto mtoVar = (mto) this.d.get(textView);
        mtoVar.getClass();
        mtqVar.getClass();
        mtoVar.c = mtqVar;
        if (mtqVar == mtq.INACTIVE) {
            textView.setClickable(false);
            textView.setContentDescription(getResources().getString(R.string.disabled_label_desc, textView.getText()));
            textView.setTextColor(ojl.aS(this));
            Drawable background = textView.getBackground();
            if (background != null) {
                background.setTint(ojl.aS(this));
                return;
            }
            return;
        }
        textView.setClickable(true);
        textView.setContentDescription(textView.getText());
        textView.setTextColor(ojl.aO(this));
        Drawable background2 = textView.getBackground();
        if (background2 != null) {
            background2.setTint(ojl.aO(this));
        }
    }

    public final void m(boolean z, boolean z2) {
        int i;
        Map map = this.d;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextView textView = (TextView) it.next();
            mto mtoVar = (mto) map.get(textView);
            mtoVar.getClass();
            if (mtoVar.c != mtq.GONE) {
                if (z2) {
                    ValueAnimator valueAnimator = mtoVar.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorR = r(textView, z);
                    valueAnimatorR.start();
                    mtoVar.d = valueAnimatorR;
                } else {
                    i = true == z ? 0 : 8;
                    textView.setAlpha(true == z ? 1.0f : 0.0f);
                    textView.setVisibility(i);
                }
            }
        }
        ImageView imageViewA = a();
        if (!z2) {
            i = true == z ? 0 : 8;
            imageViewA.setAlpha(true == z ? 1.0f : 0.0f);
            imageViewA.setVisibility(i);
        } else {
            ValueAnimator valueAnimator2 = this.i;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorR2 = r(imageViewA, z);
            this.i = valueAnimatorR2;
            valueAnimatorR2.start();
        }
    }

    public final void n(double d) throws Resources.NotFoundException {
        for (TextView textView : this.d.keySet()) {
            t(textView, d, textView.getAlpha());
        }
    }

    public final void o(double d, float f) throws Resources.NotFoundException {
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            t((TextView) it.next(), d, f);
        }
        a().setAlpha(f);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        if (this.e) {
            layoutInflater.inflate(R.layout.countdown_slider_layout_freeway, this);
        } else {
            layoutInflater.inflate(R.layout.countdown_slider_layout, this);
        }
        s();
        this.a = g();
        Map map = this.d;
        TextView textViewF = f();
        mtq mtqVar = mtq.ENABLED;
        map.put(textViewF, new mto(R.string.min_value_label, R.drawable.ns_off_icon_padded, mtqVar));
        map.put(c(), new mto(R.string.auto_value_label, R.drawable.ns_auto_icon_padded, mtqVar));
        map.put(e(), new mto(R.string.max_value_label, R.drawable.ns_max_icon_padded, mtqVar));
        map.put(b(), new mto(R.string.astro_value_label, R.drawable.astro_icon_padded, mtqVar));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j(this.f, this.b);
        }
        if (this.k) {
            this.k = false;
            this.j = (float) this.a.a(1.0d);
            p();
            CountdownSnapSlider countdownSnapSlider = this.a;
            n(countdownSnapSlider.a(countdownSnapSlider.c()));
        }
    }

    public final void p() {
        TextView textViewE = u(b()) ? e() : u(e()) ? c() : null;
        boolean zW = w();
        boolean z = w() && !Locale.getDefault().getLanguage().equals("en");
        a().setVisibility(true != zW ? 0 : 8);
        Map map = this.d;
        for (TextView textView : map.keySet()) {
            if (z) {
                x(textView, Optional.empty(), textView == textViewE ? 0 : ((mto) map.get(textView)).b);
            } else {
                x(textView, (zW && textView == textViewE) ? Optional.empty() : Optional.of(Integer.valueOf(((mto) map.get(textView)).a)), 0);
            }
            l(textView, ((mto) map.get(textView)).c);
        }
        Resources resources = getResources();
        boolean zW2 = w();
        int dimensionPixelOffset = zW2 ? resources.getDimensionPixelOffset(R.dimen.slider_y_offset_vertical) : resources.getDimensionPixelOffset(R.dimen.slider_y_offset_default);
        CountdownSnapSlider countdownSnapSlider = this.a;
        countdownSnapSlider.d = dimensionPixelOffset;
        countdownSnapSlider.a.set(countdownSnapSlider.getWidth() / 2.0f, (countdownSnapSlider.getHeight() / 2.0f) - countdownSnapSlider.d);
        int i = zW2 ? this.b.c().e : 0;
        for (TextView textView2 : map.keySet()) {
            if (zW2) {
                textView2.setPadding(0, 0, 0, 0);
                textView2.setGravity(17);
            } else {
                textView2.setPadding(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.label_bottom_padding));
                textView2.setGravity(81);
            }
            textView2.setRotation(i);
        }
        TextView textViewF = f();
        TextView textViewC = c();
        TextView textViewE2 = e();
        TextView textViewB = b();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.label_dim) / 3;
        if (!w()) {
            mto mtoVar = (mto) map.get(textViewF);
            mtoVar.getClass();
            mtoVar.e = 0.0f;
            mto mtoVar2 = (mto) map.get(textViewC);
            mtoVar2.getClass();
            mtoVar2.e = 0.0f;
            mto mtoVar3 = (mto) map.get(textViewE2);
            mtoVar3.getClass();
            mtoVar3.e = 0.0f;
            mto mtoVar4 = (mto) map.get(textViewB);
            mtoVar4.getClass();
            mtoVar4.e = 0.0f;
            return;
        }
        float f = dimensionPixelSize;
        float f2 = -dimensionPixelSize;
        if (u(textViewB)) {
            mto mtoVar5 = (mto) map.get(textViewF);
            mtoVar5.getClass();
            mtoVar5.e = 0.0f;
            mto mtoVar6 = (mto) map.get(textViewC);
            mtoVar6.getClass();
            mtoVar6.e = f2;
            mto mtoVar7 = (mto) map.get(textViewE2);
            mtoVar7.getClass();
            mtoVar7.e = 0.0f;
            mto mtoVar8 = (mto) map.get(textViewB);
            mtoVar8.getClass();
            mtoVar8.e = f;
            return;
        }
        if (u(textViewE2)) {
            mto mtoVar9 = (mto) map.get(textViewF);
            mtoVar9.getClass();
            mtoVar9.e = f2;
            mto mtoVar10 = (mto) map.get(textViewC);
            mtoVar10.getClass();
            mtoVar10.e = 0.0f;
            mto mtoVar11 = (mto) map.get(textViewE2);
            mtoVar11.getClass();
            mtoVar11.e = f;
            mto mtoVar12 = (mto) map.get(textViewB);
            mtoVar12.getClass();
            mtoVar12.e = 0.0f;
            return;
        }
        mto mtoVar13 = (mto) map.get(textViewF);
        mtoVar13.getClass();
        mtoVar13.e = f2;
        mto mtoVar14 = (mto) map.get(textViewC);
        mtoVar14.getClass();
        mtoVar14.e = f;
        mto mtoVar15 = (mto) map.get(textViewE2);
        mtoVar15.getClass();
        mtoVar15.e = 0.0f;
        mto mtoVar16 = (mto) map.get(textViewB);
        mtoVar16.getClass();
        mtoVar16.e = 0.0f;
    }

    private static final void x(TextView textView, Optional optional, int i) {
        textView.setBackgroundResource(i);
        if (optional.isPresent()) {
            textView.setText(((Integer) optional.get()).intValue());
        } else {
            textView.setText(nWEkBGOQPWQp.eVaCPwtj);
        }
    }
}
