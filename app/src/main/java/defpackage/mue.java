package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.ui.elapsedtimeui.LongPressElapsedTimeView;
import com.google.ar.core.R;
import j$.time.Duration;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mue implements mua {
    private static final sgv b = sgv.g("mue");
    public LongPressElapsedTimeView a;
    private final Activity c;
    private final mua d;
    private final rww e;
    private ElapsedTimerView f;
    private ViewGroup g;
    private Resources h;
    private final int[] i = new int[2];
    private int j;
    private final boolean k;
    private final int l;
    private final boolean m;
    private final owf n;
    private final luj o;

    public mue(Activity activity, mua muaVar, luj lujVar, hbj hbjVar, rww rwwVar, owf owfVar) {
        this.c = activity;
        this.d = muaVar;
        this.o = lujVar;
        this.e = rwwVar;
        this.n = owfVar;
        this.k = hbjVar.p(gzz.p);
        this.l = ((Integer) hbjVar.a(gzz.a).get()).intValue();
        this.m = hbjVar.p(gzo.bw);
    }

    private final void l() throws Resources.NotFoundException {
        int dimensionPixelSize;
        if (!this.k) {
            this.f.a().setBackground(this.h.getDrawable(R.drawable.bg_text_on_video_recording_counter, null));
            int dimensionPixelSize2 = this.h.getDimensionPixelSize(R.dimen.legacy_elapsed_timer_text_size);
            int dimensionPixelSize3 = this.h.getDimensionPixelSize(R.dimen.timer_side_padding);
            this.f.d().setTextSize(0, dimensionPixelSize2);
            this.f.d().setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
            this.f.d().setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
            this.f.c().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f.c().setVisibility(8);
            return;
        }
        if (this.m) {
            this.a.a().setBackground(this.h.getDrawable(R.drawable.bg_elapsed_timer, null));
            dimensionPixelSize = this.h.getDimensionPixelSize(R.dimen.elapsed_timer_text_size);
            ((ImageView) this.a.findViewById(R.id.indicator_icon)).getDrawable().setTint(this.h.getColor(R.color.elapsed_timer_text_color, null));
        } else {
            this.a.a().setBackground(this.h.getDrawable(R.drawable.bg_text_on_video_recording_counter, null));
            dimensionPixelSize = this.h.getDimensionPixelSize(R.dimen.long_shot_elapsed_timer_text_size);
            int dimensionPixelSize4 = this.h.getDimensionPixelSize(R.dimen.timer_side_padding);
            this.a.c().setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
            this.a.c().setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
            if (this.a.b() != null) {
                this.a.b().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                this.a.b().setVisibility(8);
            }
        }
        this.a.c().setTextSize(0, dimensionPixelSize);
    }

    private final void m(ViewGroup viewGroup, int i) {
        LongPressElapsedTimeView longPressElapsedTimeView;
        if (viewGroup != this.g && (longPressElapsedTimeView = this.a) != null) {
            viewGroup.removeView(longPressElapsedTimeView);
            this.g.addView(this.a);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.bottomMargin = this.j;
        layoutParams.topMargin = this.j;
        layoutParams.gravity = i | 1;
        this.a.setLayoutParams(layoutParams);
    }

    private final void n(cku ckuVar, View view) {
        View viewFindViewById = this.c.findViewById(R.id.bottom_bar);
        int[] iArr = this.i;
        viewFindViewById.getLocationInWindow(iArr);
        jea.p(ckuVar, view, (iArr[1] - this.h.getDimensionPixelSize(R.dimen.timer_height)) - this.h.getDimensionPixelOffset(R.dimen.long_press_bottom_padding));
    }

    private final void o(cku ckuVar, View view) {
        View viewFindViewById = this.c.findViewById(R.id.mode_switcher);
        int[] iArr = this.i;
        viewFindViewById.getLocationInWindow(iArr);
        int height = (iArr[1] + (viewFindViewById.getHeight() / 2)) - (this.h.getDimensionPixelSize(R.dimen.timer_height) / 2);
        if (!((Boolean) this.n.dL()).booleanValue()) {
            jea.p(ckuVar, view, height);
        } else {
            rww rwwVar = this.e;
            jea.o(ckuVar, view, height, (rwwVar.fr() == null || ((mxu) rwwVar.fr()).a.c == null) ? new Size(0, 0) : ((mxu) rwwVar.fr()).a.c);
        }
    }

    @Override // defpackage.mua
    public final /* synthetic */ paq a() {
        return new kxk(4);
    }

    @Override // defpackage.mua
    public final void b(boolean z) {
        if (!this.k) {
            this.d.b(z);
            return;
        }
        if (z) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.a;
            longPressElapsedTimeView.removeCallbacks(longPressElapsedTimeView.e);
            this.a.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction(new mub(this, 5));
        } else {
            this.a.animate().cancel();
            this.a.setAlpha(0.0f);
            this.a.setVisibility(8);
        }
    }

    @Override // defpackage.mua
    public final void c() {
        this.d.c();
    }

    @Override // defpackage.mua
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.mua
    public final void g() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Activity activity = this.c;
        Display display = activity.getDisplay();
        if (display == null) {
            throw new IllegalStateException("Orientation can not be determined");
        }
        boolean z = this.k;
        mxm mxmVarI = z ? nlj.i(display, this.a.getContext()) : nlj.i(display, this.f.getContext());
        rww rwwVar = this.e;
        if ((rwwVar.fr() != null && ((mxu) rwwVar.fr()).a.j.a()) || mxmVarI.d()) {
            ViewGroup viewGroup = z ? this.a : this.f;
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(R.id.activity_root_view);
            viewGroup2.addView(viewGroup);
            viewGroup.bringToFront();
            cku ckuVar = new cku();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
            ckuVar.g(constraintLayout);
            if (this.m) {
                o(ckuVar, viewGroup);
            } else {
                luj lujVar = this.o;
                int iBH = qpt.bH(((Integer) lujVar.b(luf.e)).intValue());
                if (rwwVar.fr() == null || !((mxu) rwwVar.fr()).a.j.a()) {
                    int i = iBH - 1;
                    if (i != 0) {
                        if (i != 1) {
                            ((sgt) b.b().M(5052)).s("Invalid aspect ratio detected!");
                        } else {
                            n(ckuVar, viewGroup);
                        }
                    } else if (((Boolean) lujVar.b(luf.D)).booleanValue()) {
                        n(ckuVar, viewGroup);
                    } else {
                        int[] iArr = this.i;
                        View viewFindViewById = activity.findViewById(R.id.shutter_button);
                        viewFindViewById.getLocationInWindow(iArr);
                        jea.p(ckuVar, viewGroup, (((iArr[1] + (viewFindViewById.getHeight() / 2)) - this.h.getDimensionPixelSize(R.dimen.long_pressed_photo_button_radius)) - this.h.getDimensionPixelSize(R.dimen.timer_height)) - this.h.getDimensionPixelOffset(R.dimen.long_press_bottom_padding));
                    }
                } else {
                    o(ckuVar, viewGroup);
                }
            }
            ckuVar.c(constraintLayout);
            i(0L);
            l();
            viewGroup.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new mub(viewGroup, 6));
        } else if (z) {
            i(0L);
            if (this.g != null) {
                Display display2 = activity.getDisplay();
                if (display2 == null) {
                    throw new IllegalStateException("Orientation can not be determined");
                }
                mxm mxmVarI2 = nlj.i(display2, this.a.getContext());
                ViewGroup viewGroup3 = (ViewGroup) this.a.getParent();
                int iOrdinal = mxmVarI2.ordinal();
                if (iOrdinal == 1) {
                    m(viewGroup3, 80);
                } else if (iOrdinal == 2) {
                    m(viewGroup3, 48);
                }
            }
            l();
            this.a.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new mub(this, 4));
        } else {
            this.d.g();
        }
        if (z) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.a;
            int i2 = this.l;
            if (i2 == 0) {
                longPressElapsedTimeView.c.startAnimation(longPressElapsedTimeView.a);
            } else if (i2 == 1) {
                longPressElapsedTimeView.c.startAnimation(longPressElapsedTimeView.b);
            } else {
                if (i2 != 2) {
                    return;
                }
                longPressElapsedTimeView.e.run();
            }
        }
    }

    @Override // defpackage.mua
    public final void i(long j) {
        if (!this.k) {
            this.d.i(j);
            return;
        }
        LongPressElapsedTimeView longPressElapsedTimeView = this.a;
        String elapsedTime = DateUtils.formatElapsedTime(Duration.ofMillis(j).toSeconds());
        longPressElapsedTimeView.d = true;
        longPressElapsedTimeView.c().setText(elapsedTime);
    }

    @Override // defpackage.mua
    public final void k(ViewGroup viewGroup) {
        boolean z = this.k;
        if (z) {
            this.a = (LongPressElapsedTimeView) viewGroup;
        } else {
            this.f = (ElapsedTimerView) viewGroup;
        }
        this.h = viewGroup.getResources();
        if (z) {
            ViewGroup viewGroup2 = (ViewGroup) this.a.getRootView();
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.camera_app_root);
            if (viewGroup3 != null) {
                viewGroup2 = viewGroup3;
            }
            this.g = (ViewGroup) viewGroup2.findViewById(R.id.uncovered_preview_layout);
            this.j = this.h.getDimensionPixelSize(R.dimen.recording_time_landscape_vertical_margin);
        }
    }

    @Override // defpackage.mua
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.mua
    public final void e(mtz mtzVar) {
    }

    @Override // defpackage.mua
    public final void h(long j) {
    }

    @Override // defpackage.mua
    public final void j(long j, int i) {
    }
}
