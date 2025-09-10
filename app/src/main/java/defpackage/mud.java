package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.text.format.DateUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mud implements mua {
    public static final /* synthetic */ int i = 0;
    private static final mtz j = mtz.a().a();
    public final owq a;
    public ElapsedTimerView b;
    public nlr c;
    public TextView d;
    public TextView e;
    public long f;
    public long g;
    private final Activity k;
    private final out l;
    private final rww m;
    private final Optional n;
    private final boolean o;
    private final owf p;
    private View.OnLayoutChangeListener q;
    private Resources s;
    private ImageView t;
    private ViewGroup u;
    private View v;
    private int w;
    private paq x;
    private boolean y;
    private final hbj z;
    private mtz r = j;
    public boolean h = false;

    public mud(Activity activity, hbj hbjVar, out outVar, owq owqVar, rww rwwVar, Optional optional, owf owfVar) {
        this.k = activity;
        this.z = hbjVar;
        this.l = outVar;
        this.a = owqVar;
        this.m = rwwVar;
        this.n = optional;
        this.o = hbjVar.p(gzo.bw);
        this.p = owfVar;
    }

    public static final String o(long j2) {
        MeasureFormat measureFormat = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
        if (j2 < 60) {
            return measureFormat.formatMeasures(new Measure(Long.valueOf(j2), MeasureUnit.SECOND));
        }
        if (j2 < 3600) {
            return measureFormat.formatMeasures(new Measure(Integer.valueOf((int) (j2 / 60)), MeasureUnit.MINUTE), new Measure(Integer.valueOf((int) (j2 % 60)), MeasureUnit.SECOND));
        }
        int i2 = (int) (j2 / 60);
        return measureFormat.formatMeasures(new Measure(Integer.valueOf(i2 / 60), MeasureUnit.HOUR), new Measure(Integer.valueOf(i2 % 60), MeasureUnit.MINUTE), new Measure(Long.valueOf(j2 % 60), MeasureUnit.SECOND));
    }

    private final void p(ViewGroup viewGroup, int i2) {
        if (viewGroup != this.u) {
            viewGroup.removeView(this.b);
            this.u.addView(this.b);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams.bottomMargin = this.w;
        layoutParams.topMargin = this.w;
        layoutParams.gravity = i2 | 1;
        this.b.setLayoutParams(layoutParams);
    }

    private final void q(ViewGroup viewGroup) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        viewGroup.removeView(this.b);
        ViewGroup viewGroup2 = (ViewGroup) this.k.findViewById(R.id.activity_root_view);
        viewGroup2.addView(this.b);
        this.b.bringToFront();
        cku ckuVar = new cku();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
        ckuVar.g(constraintLayout);
        int y = (int) ((this.v.getY() + (this.v.getHeight() / 2.0f)) - (this.s.getDimensionPixelSize(R.dimen.timer_height) / 2.0f));
        if (((Boolean) this.p.dL()).booleanValue()) {
            rww rwwVar = this.m;
            jea.o(ckuVar, this.b, y, (rwwVar.fr() == null || ((mxu) rwwVar.fr()).a.c == null) ? new Size(0, 0) : ((mxu) rwwVar.fr()).a.c);
        } else {
            jea.p(ckuVar, this.b, y);
        }
        ckuVar.c(constraintLayout);
    }

    @Override // defpackage.mua
    public final paq a() throws Resources.NotFoundException {
        if (!((Boolean) this.a.dL()).booleanValue()) {
            return new kxk(5);
        }
        this.b.animate().cancel();
        this.c.d();
        return new mpc(this, 3, null);
    }

    @Override // defpackage.mua
    public final void b(boolean z) {
        View view;
        int i2 = 0;
        this.h = false;
        paq paqVar = this.x;
        if (paqVar != null) {
            paqVar.close();
        }
        if (z) {
            this.b.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction(new mub(this, i2));
        } else {
            this.b.animate().cancel();
            this.b.setAlpha(0.0f);
            this.b.setVisibility(8);
            m();
        }
        gzi gziVar = gzo.a;
        this.a.a(false);
        if (((AccessibilityManager) this.k.getSystemService("accessibility")).isTouchExplorationEnabled() && (view = this.v) != null) {
            view.setFocusable(true);
            this.v.setImportantForAccessibility(1);
        }
        View view2 = this.v;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.q);
        }
        this.n.ifPresent(new lig(4));
    }

    @Override // defpackage.mua
    public final void c() throws Resources.NotFoundException {
        this.h = true;
        this.y = this.e.getVisibility() == 0;
        String string = this.s.getString(R.string.video_recording_paused_indicator, DateUtils.formatElapsedTime(this.f));
        this.b.f(string);
        this.n.ifPresent(new ktp(string, 7));
    }

    @Override // defpackage.mua
    public final void d() throws Resources.NotFoundException {
        this.h = false;
        String elapsedTime = DateUtils.formatElapsedTime(this.f);
        this.b.f(elapsedTime);
        this.n.ifPresent(new mdw(elapsedTime, 5));
        if (this.y) {
            f();
        }
    }

    @Override // defpackage.mua
    public final void e(mtz mtzVar) {
        this.r = mtzVar;
        this.n.ifPresent(new mdw(mtzVar, 4));
    }

    @Override // defpackage.mua
    public final void f() throws Resources.NotFoundException {
        int dimensionPixelSize;
        int color;
        boolean z = this.o;
        if (z) {
            dimensionPixelSize = this.s.getDimensionPixelSize(R.dimen.timer_side_padding);
            color = this.s.getColor(R.color.elapsed_timer_text_color, null);
        } else {
            dimensionPixelSize = this.s.getDimensionPixelSize(R.dimen.timer_side_padding_legacy);
            color = this.s.getColor(R.color.elapsed_timer_text_color_legacy, null);
        }
        this.e.setTextSize(0, this.s.getDimensionPixelSize(R.dimen.elapsed_timer_text_size));
        Activity activity = this.k;
        Drawable drawable = activity.getDrawable(R.drawable.quantum_gm_ic_trending_flat_white_18);
        drawable.getClass();
        drawable.setTint(color);
        mtz mtzVar = this.r;
        Drawable drawable2 = mtzVar.b ? activity.getDrawable(R.drawable.quantum_gm_ic_mic_off_white_18) : ((Boolean) mtzVar.d.dL()).booleanValue() ? activity.getDrawable(R.drawable.gm_filled_mic_external_on_white_18) : ((Boolean) this.r.e.dL()).booleanValue() ? activity.getDrawable(R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        if (drawable2 != null) {
            drawable2.setTint(color);
        }
        boolean z2 = this.e.getResources().getConfiguration().getLayoutDirection() == 1;
        if (z2) {
            drawable.setLayoutDirection(1);
            drawable.setAutoMirrored(true);
        }
        if (z) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(dimensionPixelSize);
            if (z2) {
                this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else {
                this.e.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.e.setLayoutParams(layoutParams);
        } else {
            this.e.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            if (z2) {
                this.e.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
            } else {
                this.e.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
            }
        }
        boolean z3 = this.e.getResources().getConfiguration().getLayoutDirection() == 1;
        TextView textView = this.d;
        textView.setPadding(z3 ? 0 : textView.getPaddingLeft(), 0, z3 ? this.d.getPaddingRight() : 0, 0);
        if (!z) {
            this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.e.setVisibility(0);
    }

    @Override // defpackage.mua
    public final void g() {
        View view;
        mtz mtzVar = this.r;
        this.x = owl.a(mtzVar.d, mtzVar.e).dK(new mix(this, 10), this.l);
        this.h = false;
        i(0L);
        if (this.u != null) {
            n();
        }
        l();
        h(0L);
        this.e.addOnLayoutChangeListener(new fjt(this, 9));
        this.b.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new mub(this, 3));
        this.a.a(true);
        if (((AccessibilityManager) this.k.getSystemService("accessibility")).isTouchExplorationEnabled() && (view = this.v) != null) {
            view.setFocusable(false);
            this.v.setImportantForAccessibility(2);
        }
        gzi gziVar = gzo.a;
        View view2 = this.v;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(this.q);
        }
        this.n.ifPresent(new lig(5));
    }

    @Override // defpackage.mua
    public final void h(long j2) {
        long seconds = Duration.ofMillis(j2).toSeconds();
        this.g = seconds;
        this.b.e(DateUtils.formatElapsedTime(seconds));
    }

    @Override // defpackage.mua
    public final void i(long j2) {
        long seconds = Duration.ofMillis(j2).toSeconds();
        this.f = seconds;
        String elapsedTime = DateUtils.formatElapsedTime(seconds);
        this.b.f(elapsedTime);
        this.n.ifPresent(new mdw(elapsedTime, 3));
    }

    @Override // defpackage.mua
    public final void j(long j2, int i2) {
        i(j2);
        if (this.r.a) {
            long j3 = this.f * i2;
            this.g = j3;
            this.b.e(DateUtils.formatElapsedTime(j3));
        }
    }

    @Override // defpackage.mua
    public final void k(ViewGroup viewGroup) {
        Resources resources = viewGroup.getResources();
        this.s = resources;
        this.w = resources.getDimensionPixelSize(R.dimen.recording_time_landscape_vertical_margin);
        this.b = (ElapsedTimerView) viewGroup;
        this.c = new nlr(viewGroup);
        TextView textViewD = this.b.d();
        this.d = textViewD;
        textViewD.setCompoundDrawablePadding(this.s.getDimensionPixelSize(R.dimen.indicator_padding));
        TextView textViewC = this.b.c();
        this.e = textViewC;
        textViewC.setCompoundDrawablePadding(this.s.getDimensionPixelSize(R.dimen.indicator_padding));
        this.t = this.b.b();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getRootView();
        this.u = (ViewGroup) viewGroup2.findViewById(R.id.viewfinder_ui);
        this.v = viewGroup2.findViewById(R.id.mode_switcher);
        this.q = new fjt(this, 10);
        gzi gziVar = gzo.a;
        viewGroup.setAccessibilityDelegate(new muc(this));
    }

    public final void l() {
        Drawable drawable;
        int color;
        int dimensionPixelSize = this.s.getDimensionPixelSize(R.dimen.elapsed_timer_text_size);
        boolean z = this.o;
        if (z) {
            drawable = this.s.getDrawable(R.drawable.bg_elapsed_timer, null);
            color = this.s.getColor(R.color.elapsed_timer_text_color, null);
            int dimensionPixelSize2 = this.s.getDimensionPixelSize(R.dimen.timer_side_padding);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams.setMarginStart(true != this.r.c ? dimensionPixelSize2 : 0);
            layoutParams.setMarginEnd(dimensionPixelSize2);
            this.d.setLayoutParams(layoutParams);
        } else {
            drawable = this.s.getDrawable(R.drawable.bg_elapsed_timer_legacy, null);
            color = this.s.getColor(R.color.elapsed_timer_text_color_legacy, null);
            int dimensionPixelSize3 = this.s.getDimensionPixelSize(R.dimen.timer_side_padding_legacy);
            this.d.setPadding(dimensionPixelSize3, 0, true != this.r.c ? dimensionPixelSize3 : 0, 0);
        }
        this.b.a().setBackground(drawable);
        this.d.setTextSize(0, dimensionPixelSize);
        this.t.getDrawable().setTint(color);
        this.t.setVisibility(true != this.r.c ? 8 : 0);
        mtz mtzVar = this.r;
        Drawable drawable2 = mtzVar.b ? this.k.getDrawable(R.drawable.quantum_gm_ic_mic_off_white_18) : ((Boolean) mtzVar.d.dL()).booleanValue() ? this.k.getDrawable(R.drawable.gm_filled_mic_external_on_white_18) : ((Boolean) this.r.e.dL()).booleanValue() ? this.k.getDrawable(R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        if (drawable2 != null) {
            drawable2.setTint(color);
        }
        if (z) {
            this.d.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
            if (this.r.a) {
                f();
                return;
            } else {
                m();
                return;
            }
        }
        if (this.r.a) {
            this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            f();
        } else {
            this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
            m();
        }
    }

    public final void m() {
        this.e.setVisibility(8);
        this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (this.o) {
            return;
        }
        TextView textView = this.d;
        textView.setPadding(textView.getPaddingLeft(), 0, this.d.getPaddingLeft(), 0);
    }

    public final void n() {
        mxm mxmVarI = nlj.i(this.b.getDisplay(), this.b.getContext());
        ViewGroup viewGroup = (ViewGroup) this.b.getParent();
        rww rwwVar = this.m;
        if (rwwVar.fr() != null && ((mxu) rwwVar.fr()).a.j.a()) {
            q(viewGroup);
            return;
        }
        int iOrdinal = mxmVarI.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                p(viewGroup, 80);
                return;
            } else if (iOrdinal == 2) {
                p(viewGroup, 48);
                return;
            } else if (iOrdinal != 3) {
                return;
            }
        }
        q(viewGroup);
    }
}
