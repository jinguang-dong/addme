package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSlider;
import com.google.android.apps.camera.ui.modeslider.ModeSliderUi;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gli implements paq, jhh, jhe, jhc, mxl {
    private static final sgv n = sgv.g("gli");
    private final hbj A;
    public final owq a;
    public final fvu b;
    public final itl d;
    public final mzb e;
    public final mzz f;
    public final ndj g;
    public final rww i;
    public ModeSliderUi k;
    public final gln l;
    public final myt m;
    private final owq p;
    private final gnt q;
    private final Set s;
    private final out t;
    private final tzj u;
    private final owf v;
    private final uem w;
    private ObjectAnimator y;
    private final mdy z;
    private final AtomicBoolean o = new AtomicBoolean(false);
    public final Object h = new Object();
    public nkw j = nkw.UNINITIALIZED;
    private mxj x = mxj.PHONE_LAYOUT;
    private final our r = new our();
    public final Set c = new HashSet();

    public gli(jgt jgtVar, owq owqVar, owq owqVar2, fvu fvuVar, itl itlVar, out outVar, myt mytVar, mzb mzbVar, mzz mzzVar, gln glnVar, ndj ndjVar, Set set, gnt gntVar, tzj tzjVar, rww rwwVar, owf owfVar, mdy mdyVar, hbj hbjVar, uem uemVar) {
        this.a = owqVar;
        this.p = owqVar2;
        this.b = fvuVar;
        this.q = gntVar;
        this.d = itlVar;
        this.t = outVar;
        this.m = mytVar;
        this.e = mzbVar;
        this.f = mzzVar;
        this.l = glnVar;
        this.g = ndjVar;
        this.u = tzjVar;
        this.i = rwwVar;
        this.v = owfVar;
        this.z = mdyVar;
        this.s = new HashSet(set);
        this.A = hbjVar;
        this.w = uemVar;
        outVar.c(new cmc(this, jgtVar, 6, null));
    }

    private final int n(nkw nkwVar, String str) {
        ryo ryoVarA = this.m.a(nkwVar);
        int i = 0;
        while (true) {
            if (i >= ryoVarA.r().size()) {
                i = -1;
                break;
            }
            if (ryoVarA.s(Integer.valueOf(i), str)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        throw new IllegalArgumentException("No speed id found");
    }

    private final void o(nkw nkwVar, boolean z) throws Resources.NotFoundException {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        boolean z2;
        LinearLayout.LayoutParams layoutParams;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        glp glpVar = new glp(null);
        glpVar.c(-1);
        myt mytVar = this.m;
        glpVar.a = n(nkwVar, mytVar.b(nkwVar));
        glpVar.f = (byte) (glpVar.f | 1);
        nkw nkwVar2 = nkw.TIME_LAPSE;
        if (nkwVar.equals(nkwVar2)) {
            glpVar.c(n(nkwVar2, mytVar.c()));
        }
        glpVar.g = 1;
        if (nkwVar.equals(nkwVar2)) {
            glpVar.b(R.drawable.quantum_gm_ic_fast_forward_white_18);
            glpVar.e = this.A.p(haw.j) ? Optional.of("auto_timelapse_tooltip") : Optional.empty();
            glpVar.a(false);
        } else {
            glpVar.b(R.drawable.quantum_gm_ic_slow_motion_video_white_18);
            glpVar.e = Optional.empty();
            glpVar.a(true);
        }
        hbj hbjVar = this.A;
        gzg gzgVar = gzo.by;
        if (!hbjVar.p(gzgVar)) {
            this.e.f();
        }
        jsv.J(this.k != null, this.w);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        if (marginLayoutParams != null) {
            boolean zP = hbjVar.p(gzo.bw);
            int i5 = R.dimen.camcorder_mode_slider_bottom_margin;
            if (zP && this.x.equals(mxj.PHONE_LAYOUT)) {
                i5 = R.dimen.camcorder_mode_slider_bottom_margin_freeway;
            }
            marginLayoutParams.bottomMargin = this.k.getContext().getResources().getDimensionPixelSize(i5);
            this.k.setLayoutParams(marginLayoutParams);
        }
        gln glnVar = this.l;
        ryo ryoVarA = mytVar.a(nkwVar);
        RecordSpeedSlider recordSpeedSliderA = this.k.a();
        if (glpVar.f != 15 || glpVar.g == 0) {
            throw new IllegalStateException();
        }
        glq glqVar = new glq(glpVar.a, glpVar.b, glpVar.c, glpVar.d, glpVar.e);
        int i6 = glqVar.b;
        int i7 = glqVar.a;
        int i8 = glqVar.f;
        glnVar.i = recordSpeedSliderA;
        glnVar.o = glqVar;
        glnVar.s = new szh();
        glnVar.e(false);
        ryoVarA.r().size();
        if (i8 == 0) {
            throw null;
        }
        glnVar.m = -1;
        glnVar.k = true;
        ArrayList arrayList = glnVar.a;
        arrayList.clear();
        for (int i9 = 0; i9 < ((ryb) ryoVarA).b; i9++) {
            arrayList.add(i9, false);
        }
        glnVar.i(i7);
        glnVar.n = i7;
        if (i6 == -1) {
            i = i7;
        } else {
            glnVar.i(i6);
            i = i6;
        }
        AtomicInteger atomicInteger = glnVar.b;
        if (atomicInteger.get() == -1) {
            atomicInteger.set(i);
        }
        hbj hbjVar2 = glnVar.v;
        boolean z3 = hbjVar2.p(gzgVar) && glnVar.q.equals(mxj.TABLET_LAYOUT);
        glnVar.l = z3;
        RecordSpeedSlider recordSpeedSlider = glnVar.i;
        int i10 = glqVar.c;
        int i11 = glnVar.m;
        boolean zP2 = hbjVar2.p(gzo.bw);
        recordSpeedSlider.removeAllViews();
        recordSpeedSlider.a.set(-1);
        Resources resources = recordSpeedSlider.getResources();
        recordSpeedSlider.b = ryoVarA;
        recordSpeedSlider.i = 1;
        recordSpeedSlider.e = i11;
        recordSpeedSlider.f = i10;
        recordSpeedSlider.d = z3;
        recordSpeedSlider.h = zP2;
        recordSpeedSlider.g = recordSpeedSlider.getResources().getDimensionPixelSize(zP2 ? R.dimen.record_speed_slider_option_side_padding_freeway : R.dimen.record_speed_slider_option_side_padding);
        int iA = recordSpeedSlider.a();
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width);
        int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width_medium);
        int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width_medium);
        int dimensionPixelSize7 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width_large);
        int dimensionPixelSize8 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width_large);
        float dimensionPixelSize9 = resources.getDimensionPixelSize(true != zP2 ? R.dimen.record_speed_slider_text_size : R.dimen.record_speed_slider_text_size_freeway);
        float fA = nlj.a(resources.getDimension(true != zP2 ? R.dimen.record_speed_slider_text_letter_spacing : R.dimen.record_speed_slider_text_letter_spacing_freeway));
        Drawable drawable = resources.getDrawable(R.drawable.quantum_gm_ic_arrow_back_white_18, null);
        Drawable drawable2 = resources.getDrawable(R.drawable.quantum_gm_ic_arrow_forward_white_18, null);
        if (recordSpeedSlider.d) {
            i2 = dimensionPixelSize4;
            int dimensionPixelSize10 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.tablet_record_speed_slider_padding);
            i3 = dimensionPixelSize7;
            i4 = dimensionPixelSize5;
            recordSpeedSlider.setBackground(recordSpeedSlider.getResources().getDrawable(R.drawable.bg_record_speed_slider_tablet, null));
            recordSpeedSlider.setPadding(dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10, dimensionPixelSize10);
            recordSpeedSlider.setOrientation(1);
            recordSpeedSlider.setRotation(270.0f);
        } else {
            i2 = dimensionPixelSize4;
            i3 = dimensionPixelSize7;
            i4 = dimensionPixelSize5;
            int dimensionPixelSize11 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_padding);
            recordSpeedSlider.setBackground(recordSpeedSlider.getResources().getDrawable(true != recordSpeedSlider.h ? R.drawable.bg_record_speed_slider : R.drawable.bg_record_speed_slider_freeway, null));
            recordSpeedSlider.setPadding(dimensionPixelSize11, 0, dimensionPixelSize11, 0);
            recordSpeedSlider.setOrientation(0);
            recordSpeedSlider.setRotation(0.0f);
        }
        int i12 = 0;
        while (i12 < iA) {
            if (i12 == recordSpeedSlider.e) {
                str = "";
            } else {
                ryo ryoVar = recordSpeedSlider.b;
                recordSpeedSlider.m(i12);
                str = (String) ryoVar.b(Integer.valueOf(i12)).get(0);
            }
            if (recordSpeedSlider.i == 0) {
                throw null;
            }
            String string = i12 == recordSpeedSlider.e ? recordSpeedSlider.getResources().getString(R.string.accessibility_back_to_video_description) : (String) recordSpeedSlider.b.b(Integer.valueOf(i12)).get(1);
            int i13 = iA;
            TextView textView = new TextView(recordSpeedSlider.getContext());
            RecordSpeedSlider recordSpeedSlider2 = recordSpeedSliderA;
            int dimensionPixelSize12 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_knob_height);
            glq glqVar2 = glqVar;
            int i14 = i;
            int dimensionPixelSize13 = recordSpeedSlider.getResources().getDimensionPixelSize(true != recordSpeedSlider.h ? R.dimen.tablet_record_speed_slider_knob_width : R.dimen.tablet_record_speed_slider_knob_width_freeway);
            int dimensionPixelSize14 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.tablet_record_speed_slider_knob_bottom_margin);
            if (recordSpeedSlider.d) {
                layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize13, dimensionPixelSize12);
                z2 = true;
                layoutParams.gravity = 1;
                if (i12 < i13 - 1) {
                    layoutParams.bottomMargin = dimensionPixelSize14;
                }
            } else {
                z2 = true;
                if (true == recordSpeedSlider.h) {
                    dimensionPixelSize12 = -1;
                }
                layoutParams = new LinearLayout.LayoutParams(-2, dimensionPixelSize12);
                layoutParams.gravity = 8388627;
            }
            textView.setLayoutParams(layoutParams);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setSingleLine(z2);
            textView.setBackgroundColor(0);
            textView.setGravity(17);
            recordSpeedSlider.l(textView, qpt.P(textView, R.attr.colorOnSurface));
            textView.setTextAlignment(4);
            textView.setTextSize(0, dimensionPixelSize9);
            textView.setText(str);
            textView.setLetterSpacing(fA);
            textView.setContentDescription(string);
            int dimensionPixelSize15 = recordSpeedSlider.getResources().getDimensionPixelSize(true != zP2 ? R.dimen.record_speed_slider_option_vertical_padding : R.dimen.record_speed_slider_option_vertical_padding_freeway);
            textView.setPadding(0, dimensionPixelSize15, 0, dimensionPixelSize15);
            textView.setOnClickListener(new fjx(recordSpeedSlider, i12, 2));
            if (zP2) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_min_width_freeway);
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_knob_max_width_freeway);
            } else if (str.length() > 3) {
                dimensionPixelSize2 = dimensionPixelSize8;
                dimensionPixelSize = i3;
            } else if (str.length() > 2) {
                dimensionPixelSize2 = dimensionPixelSize6;
                dimensionPixelSize = i4;
            } else {
                dimensionPixelSize = dimensionPixelSize3;
                dimensionPixelSize2 = i2;
            }
            textView.setMinWidth(dimensionPixelSize);
            textView.setMaxWidth(dimensionPixelSize2);
            if (i12 == i11) {
                int dimensionPixelSize16 = resources.getDimensionPixelSize(R.dimen.record_speed_slider_arrow_min_width);
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                textView.setMinWidth(dimensionPixelSize16);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(0);
                textView.setPadding((dimensionPixelSize16 / 2) - intrinsicWidth, 0, 0, 0);
            } else {
                int i15 = recordSpeedSlider.g;
                textView.setPadding(i15, 0, i15, 0);
            }
            recordSpeedSlider.addView(textView, i12);
            i12++;
            iA = i13;
            recordSpeedSliderA = recordSpeedSlider2;
            glqVar = glqVar2;
            i = i14;
        }
        RecordSpeedSlider recordSpeedSlider3 = recordSpeedSliderA;
        glq glqVar3 = glqVar;
        int i16 = i;
        int iMin = Math.min(recordSpeedSlider.getRootView().getMeasuredWidth(), recordSpeedSlider.getRootView().getMeasuredHeight());
        if (!recordSpeedSlider.b.u()) {
            int dimensionPixelSize17 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_margin);
            int i17 = iMin - (dimensionPixelSize17 + dimensionPixelSize17);
            int iA2 = recordSpeedSlider.a();
            int dimensionPixelSize18 = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.record_speed_slider_side_padding);
            recordSpeedSlider.measure(0, 0);
            if (recordSpeedSlider.getMeasuredWidth() > i17) {
                int measuredWidth = ((recordSpeedSlider.getMeasuredWidth() - (dimensionPixelSize18 + dimensionPixelSize18)) - i17) / iA2;
                for (int i18 = 0; i18 < iA2; i18++) {
                    TextView textView2 = (TextView) recordSpeedSlider.getChildAt(i18);
                    int minWidth = textView2.getMinWidth();
                    int maxWidth = textView2.getMaxWidth();
                    textView2.setMinWidth(minWidth - measuredWidth);
                    textView2.setMaxWidth(maxWidth - measuredWidth);
                }
            }
        }
        recordSpeedSlider.setOnTouchListener(new fuo(recordSpeedSlider, 3));
        recordSpeedSlider.requestLayout();
        recordSpeedSlider.invalidate();
        glnVar.i.measure(0, 0);
        int measuredHeight = glnVar.i.getMeasuredHeight();
        int measuredWidth2 = glnVar.i.getMeasuredWidth();
        if (glnVar.l) {
            glnVar.i.getLayoutParams().height = measuredHeight;
            glnVar.i.getLayoutParams().width = -2;
        } else {
            glnVar.i.getLayoutParams().height = -2;
            glnVar.i.getLayoutParams().width = measuredWidth2;
        }
        RecordSpeedSlider recordSpeedSlider4 = glnVar.i;
        View.OnLayoutChangeListener onLayoutChangeListener = glnVar.h;
        recordSpeedSlider4.removeOnLayoutChangeListener(onLayoutChangeListener);
        glnVar.i.addOnLayoutChangeListener(onLayoutChangeListener);
        glnVar.s.c(new glk(glnVar, recordSpeedSlider3, glqVar3, i16, 0), glnVar.e);
        if (!z && !glnVar.q.equals(glnVar.r)) {
            glnVar.e(true);
        }
        glnVar.r = glnVar.q;
    }

    private final void p(boolean z, boolean z2) {
        jsv.J(this.k != null, this.w);
        synchronized (this.h) {
            if (k(this.j) && this.o.get()) {
                j(this.q.a(), ((Boolean) this.v.dL()).booleanValue());
                if (!z) {
                    this.k.setAlpha(1.0f);
                    if (z2) {
                        this.e.d();
                    } else {
                        this.e.e();
                    }
                    g(true);
                    this.l.f();
                    return;
                }
                ObjectAnimator objectAnimator = this.y;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.k, (Property<ModeSliderUi, Float>) View.ALPHA, this.k.getAlpha(), 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setStartDelay(50L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.addListener(new glh(this, z2));
                this.y = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
                return;
            }
            ((sgt) n.c().M(942)).F("Ignore showing video mode slider. Current mode: %s, Ready to show UI: %b", this.j, this.o.get());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final View a(ViewStub viewStub) throws Resources.NotFoundException {
        if (this.k == null) {
            this.k = (ModeSliderUi) viewStub.inflate();
        }
        this.k.setOnTouchListener(new fuo(this, 2, null));
        mzb mzbVar = this.e;
        ModeSliderUi modeSliderUi = this.k;
        ModeSlider modeSliderB = modeSliderUi.b();
        RecordSpeedSlider recordSpeedSliderA = this.k.a();
        Set set = this.s;
        mzbVar.f = modeSliderUi;
        mzbVar.g = modeSliderB;
        mzbVar.h = recordSpeedSliderA;
        mzbVar.i = set;
        this.l.w = new AmbientModeSupport.AmbientController(this);
        ModeSlider modeSliderB2 = this.k.b();
        myt mytVar = this.m;
        List list = modeSliderB2.d;
        list.clear();
        list.addAll(mytVar.a);
        modeSliderB2.removeAllViews();
        modeSliderB2.a.set(-1);
        int size = list.size();
        float dimensionPixelSize = modeSliderB2.getResources().getDimensionPixelSize(R.dimen.mode_slider_mode_text_size);
        float fA = nlj.a(modeSliderB2.getResources().getDimension(R.dimen.mode_slider_mode_text_letter_spacing));
        for (int i = 0; i < size; i++) {
            ?? r9 = ((myu) list.get(i)).c;
            ?? r10 = ((myu) list.get(i)).d;
            TextView textView = new TextView(modeSliderB2.getContext());
            textView.setLayoutParams(modeSliderB2.f);
            textView.setSingleLine(true);
            textView.setBackgroundColor(0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText((CharSequence) r9);
            textView.setGravity(17);
            modeSliderB2.j(textView, qpt.P(textView, R.attr.colorOnSurface));
            textView.setTextAlignment(4);
            textView.setTextSize(0, dimensionPixelSize);
            textView.setLetterSpacing(fA);
            int i2 = modeSliderB2.b;
            textView.setPadding(i2, 0, i2, 0);
            textView.setContentDescription(r10);
            textView.setOnClickListener(new fjx(modeSliderB2, i, 3));
            modeSliderB2.addView(textView, i);
        }
        int dimensionPixelSize2 = modeSliderB2.getResources().getDimensionPixelSize(R.dimen.mode_slider_side_padding);
        modeSliderB2.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        modeSliderB2.setOnTouchListener(new fuo(modeSliderB2, 11));
        modeSliderB2.c = new glg(this);
        mzbVar.a();
        our ourVar = this.r;
        ourVar.d(this.a.dK(new gej(this, 13), ojl.ce()));
        ourVar.d(this.p.dK(new gej(this, 14), this.t));
        ourVar.d(owl.a(this.q, this.v).dK(new gej(this, 15), ojl.ce()));
        return this.k;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.e.c();
        this.c.clear();
        this.s.clear();
        this.r.close();
    }

    public final void d(boolean z, float f) {
        if (this.k == null) {
            return;
        }
        if (!z) {
            g(false);
            this.k.setAlpha(f);
            if (f > 0.0f) {
                this.e.d();
                return;
            } else {
                this.e.c();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.k, (Property<ModeSliderUi, Float>) View.ALPHA, this.k.getAlpha(), f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new gwt(this, f, 1));
        this.y = objectAnimatorOfFloat;
        objectAnimatorOfFloat.start();
    }

    public final void e() {
        this.b.m(true);
        this.f.m(true);
        this.g.M(true);
        this.d.k(1);
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        synchronized (this.h) {
            gln glnVar = this.l;
            glnVar.p = mxmVar;
            glnVar.q = mxjVar;
            if (this.x != mxjVar) {
                this.x = mxjVar;
                if (k(this.j)) {
                    o(this.j, false);
                }
            }
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.o.set(false);
        ObjectAnimator objectAnimator = this.y;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.o.set(true);
    }

    public final void f(boolean z) {
        d(z, 0.0f);
    }

    public final void g(boolean z) {
        jsv.J(this.k != null, this.w);
        if (z) {
            this.k.b().d();
        } else {
            this.k.b().c();
        }
    }

    public final void h(boolean z) {
        p(z, true);
    }

    public final void i(nkw nkwVar) throws Resources.NotFoundException {
        if (nkwVar.equals(nkw.VIDEO)) {
            p(false, false);
        } else {
            o(nkwVar, true);
        }
        tzj tzjVar = this.u;
        ((nqp) tzjVar.a()).v();
        ((nqp) tzjVar.a()).x();
    }

    public final void j(pka pkaVar, boolean z) {
        ModeSlider modeSliderB = this.k.b();
        Iterator it = this.m.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((myu) it.next()).b) {
                if (pkaVar.equals(pka.FRONT) || z) {
                    modeSliderB.getChildAt(i).setVisibility(8);
                } else {
                    modeSliderB.getChildAt(i).setVisibility(0);
                }
            }
            i++;
        }
    }

    public final boolean k(nkw nkwVar) {
        return this.m.b.containsKey(nkwVar);
    }

    public final boolean l(nkw nkwVar) {
        synchronized (this.h) {
            if (this.j.equals(nkwVar)) {
                return false;
            }
            if (!k(nkwVar)) {
                throw new IllegalArgumentException(eld.b(nkwVar, "Unsupported application mode: "));
            }
            this.j = nkwVar;
            this.z.K(nkwVar.v);
            jsv.J(this.k != null, this.w);
            g(false);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((glj) it.next()).a();
            }
            ModeSlider modeSliderB = this.k.b();
            myu myuVar = (myu) this.m.b.get(nkwVar);
            myuVar.getClass();
            List list = modeSliderB.d;
            if (!list.contains(myuVar)) {
                throw new IllegalArgumentException("Unsupported mode item: ".concat(myuVar.toString()));
            }
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext() && !((myu) it2.next()).equals(myuVar)) {
                i++;
            }
            modeSliderB.h(i, false);
            return true;
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
