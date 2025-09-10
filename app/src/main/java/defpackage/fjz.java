package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.views.ToggleUi;
import com.google.android.apps.camera.util.ui.GcaTextView;
import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fjz implements mxl {
    public EduImageView A;
    public CardView B;
    public LinearLayout C;
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public efh G;
    public efh H;
    public efh I;
    public HorizontalScrollView J;
    public LinearLayout K;
    public LinearLayout L;
    public boolean M;
    public final ktx P;
    public final mdy Q;
    public final mwq R;
    public final ocq S;
    private final mni U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    private final boolean Y;
    private final owf Z;
    private final pnq ac;
    private EduImageView ad;
    private CardView ae;
    private EduImageView af;
    private EduImageView ag;
    private EduImageView ah;
    private CardView ai;
    private CardView aj;
    private CardView ak;
    private ImageView al;
    private ImageView am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private MaterialButton aq;
    private LinearLayout ar;
    private GcaTextView as;
    private GcaTextView at;
    private int au;
    private int av;
    private final muu ax;
    public AccessibilityManager b;
    public PopupWindow c;
    public View d;
    public final Context e;
    public final MainActivityLayout f;
    public final owf g;
    public final out h;
    public final hjb i;
    public final owf m;
    public final owq n;
    public final owq o;
    public final uem p;
    public FrameLayout q;
    public LottieAnimationView r;
    public TextView s;
    public TextView t;
    public FrameLayout u;
    public ImageButton v;
    public MaterialButton w;
    public MaterialButton x;
    public ConstraintLayout y;
    public ImageButton z;
    public static final sgv a = sgv.g("fjz");
    private static final Duration T = Duration.ofSeconds(2);
    public long N = 0;
    private boolean aw = false;
    public boolean O = false;
    public final cku j = new cku();
    public final cku k = new cku();
    public final cku l = new cku();
    private final Handler aa = new Handler(Looper.getMainLooper());
    private final Handler ab = new Handler(Looper.getMainLooper());

    public fjz(muu muuVar, owf owfVar, mni mniVar, ocq ocqVar, hbj hbjVar, Context context, MainActivityLayout mainActivityLayout, owf owfVar2, out outVar, ktx ktxVar, hjb hjbVar, owf owfVar3, pnq pnqVar, owq owqVar, owq owqVar2, uem uemVar, mdy mdyVar, mwq mwqVar) {
        this.ax = muuVar;
        this.Z = owfVar;
        this.U = mniVar;
        this.S = ocqVar;
        this.V = hbjVar.o(gyi.j);
        this.W = hbjVar.o(gyi.k);
        this.X = hbjVar.p(gzo.bJ);
        this.Y = hbjVar.p(gzo.aO);
        this.m = owfVar3;
        this.g = owfVar2;
        this.e = context;
        this.f = mainActivityLayout;
        this.h = outVar;
        this.P = ktxVar;
        this.i = hjbVar;
        this.p = uemVar;
        this.ac = pnqVar;
        this.n = owqVar;
        this.o = owqVar2;
        this.Q = mdyVar;
        this.R = mwqVar;
    }

    public static final void u(MaterialButton materialButton, int i, int i2) {
        materialButton.n(ColorStateList.valueOf(i));
        materialButton.setTextColor(i2);
    }

    public static final void v(ViewGroup viewGroup, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ((sgt) a.c().M(236)).s("Cannot apply horizontal margins to layout.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i2);
        viewGroup.setLayoutParams(marginLayoutParams);
        viewGroup.requestLayout();
    }

    public static final void w(ImageButton imageButton, String str) {
        imageButton.setAccessibilityDelegate(new fjy(str));
    }

    private final void x(View view, boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = a(R.dimen.first_time_demo_image_width);
        layoutParams.height = a(R.dimen.first_time_demo_image_height);
        if (!z) {
            layoutParams.rightMargin = a(R.dimen.first_time_demo_image_side_margin);
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    private final void y(CardView cardView) {
        cardView.c(a(R.dimen.first_time_video_corner_radius));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) cardView.getLayoutParams();
        layoutParams.width = a(R.dimen.first_time_video_width);
        layoutParams.height = a(R.dimen.first_time_video_height);
        cardView.setLayoutParams(layoutParams);
        cardView.requestLayout();
    }

    private final void z() {
        ToggleUi toggleUi = this.ax.c;
        ToggleUi.ToggleButton toggleButton = toggleUi != null ? toggleUi.c : null;
        if (toggleButton != null) {
            Context context = this.e;
            toggleButton.setContentDescription(context.getString(R.string.cottage_help_context_desc));
            w(toggleButton, context.getString(R.string.cottage_accessibility_help_button_action));
        }
    }

    public final synchronized int a(int i) {
        float dimension;
        float f;
        try {
            dimension = ((int) r0.getResources().getDimension(i)) / ((Activity) this.e).getWindowManager().getCurrentWindowMetrics().getDensity();
            pnq pnqVar = this.ac;
            f = 2.25f;
            if (!pnqVar.y && !pnqVar.z) {
                if (pnqVar.A) {
                    f = 2.625f;
                } else if (pnqVar.B) {
                    f = 2.4375f;
                }
            }
        } catch (Resources.NotFoundException e) {
            ((sgt) ((sgt) a.c().i(e)).M(231)).t("Dimension not found: %d", i);
            return 0;
        }
        return (int) (dimension * f);
    }

    public final void d(TextView textView, TextView textView2, boolean z) {
        this.aa.postDelayed(new fie(this, z, String.format(Locale.ROOT, "%s. %s", textView.getText(), textView2.getText()), 3), T.toMillis());
    }

    public final void e() {
        k();
        this.o.a(false);
        this.i.h();
        this.aa.removeCallbacksAndMessages(null);
        this.P.k(fjz.class);
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }

    public final void f() {
        jsv.J(this.c != null, this.p);
        mni mniVar = this.U;
        if (mniVar.k()) {
            e();
            HorizontalScrollView horizontalScrollView = this.J;
            if (horizontalScrollView != null && horizontalScrollView.getViewTreeObserver().isAlive()) {
                this.J.getViewTreeObserver().removeOnScrollChangedListener(new fju(this));
            }
            mniVar.h();
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.c.dismiss();
    }

    public final void g() {
        this.ax.a(this);
    }

    public final void h() throws Resources.NotFoundException {
        if (this.X) {
            muu muuVar = this.ax;
            muuVar.g(rbb.b, R.string.add_me_help_button_accessibility, R.string.mode_cottage, true);
            muuVar.h(this);
        } else {
            muu muuVar2 = this.ax;
            muuVar2.e(new gx(this, 7, null), R.string.cottage_help_context_desc, true);
            muuVar2.h(this);
            z();
        }
    }

    public final void i() throws Resources.NotFoundException {
        if (this.X) {
            return;
        }
        muu muuVar = this.ax;
        muuVar.e(new gx(this, 13, null), R.string.cottage_help_context_desc, true);
        muuVar.h(this);
        z();
    }

    protected final void j() {
        Context context = this.e;
        Object obj = efm.c(context, R.raw.cottage_step_animation_step_1).a;
        obj.getClass();
        this.G = (efh) obj;
        Object obj2 = efm.c(context, R.raw.cottage_step_animation_3).a;
        obj2.getClass();
        this.H = (efh) obj2;
        Object obj3 = efm.c(context, R.raw.cottage_step_animation_4_v2).a;
        obj3.getClass();
        this.I = (efh) obj3;
        this.M = true;
    }

    public final void k() {
        this.ab.removeCallbacksAndMessages(null);
    }

    public final void l(int i) throws Resources.NotFoundException {
        if (i == 1) {
            h();
        } else {
            i();
        }
    }

    public final void m() {
        r(this.K);
        this.J.fullScroll(17);
    }

    public final void n(final int i) {
        if (this.S.ai("step_by_step_bottom_sheet_skip_instructions") > 0 || !this.V || !((fne) this.Z.dL()).b() || this.Y) {
            return;
        }
        this.h.execute(new Runnable() { // from class: fjv
            @Override // java.lang.Runnable
            public final void run() {
                final fjz fjzVar = this.a;
                int i2 = 1;
                int i3 = 0;
                jsv.J(fjzVar.c != null, fjzVar.p);
                if (fjzVar.c == null) {
                    return;
                }
                if (!fjzVar.M) {
                    fjzVar.j();
                }
                final int i4 = i;
                if (i4 == 1) {
                    fjzVar.w.setText(R.string.ok_button_text);
                    TextView textView = fjzVar.s;
                    Context context = fjzVar.e;
                    textView.setText(context.getString(R.string.step_by_step_photographer_title, 1));
                    fjzVar.t.setText(context.getString(R.string.step_1_instruction_1_2) + "\n" + context.getString(R.string.step_1_instruction_2));
                    fjzVar.r.f(fjzVar.G);
                    fjzVar.r.h(-1);
                    fjzVar.r.b();
                    fjzVar.r.setContentDescription(context.getString(R.string.step_edu_animation_1_desc));
                } else if (i4 == 2) {
                    fjzVar.w.setText(R.string.ok_button_text);
                    TextView textView2 = fjzVar.s;
                    Context context2 = fjzVar.e;
                    textView2.setText(context2.getString(R.string.step_by_step_photographer_title, 1));
                    fjzVar.t.setText(R.string.step_2_instruction_1_1);
                    fjzVar.r.f(fjzVar.H);
                    fjzVar.r.h(-1);
                    fjzVar.r.b();
                    fjzVar.r.setContentDescription(context2.getString(R.string.step_edu_animation_2_desc));
                } else {
                    fjzVar.w.setText(R.string.ok_button_text);
                    TextView textView3 = fjzVar.s;
                    Context context3 = fjzVar.e;
                    textView3.setText(context3.getString(R.string.step_by_step_photographer_title, 2));
                    fjzVar.t.setText(R.string.step_2_instruction_2);
                    fjzVar.r.f(fjzVar.I);
                    fjzVar.r.h(-1);
                    fjzVar.r.b();
                    fjzVar.r.setContentDescription(context3.getString(R.string.step_edu_animation_3_desc));
                    i4 = 3;
                }
                fjzVar.O = true;
                fjzVar.v.setVisibility(8);
                fjzVar.r.setOnClickListener(new gx(fjzVar, 14, null));
                fjzVar.v.setOnClickListener(new gx(fjzVar, 15, null));
                fjzVar.t.setMovementMethod(new ScrollingMovementMethod());
                fjzVar.t.setClickable(false);
                fjzVar.t.setLongClickable(false);
                MaterialButton materialButton = fjzVar.w;
                fjz.u(materialButton, ojl.aO(materialButton), ojl.aJ(fjzVar.w));
                fjzVar.w.setOnClickListener(new fjx(fjzVar, i4, i3));
                fjz.u(fjzVar.x, 0, ojl.aO(fjzVar.w));
                fjzVar.x.setOnClickListener(new fjx(fjzVar, i4, i2));
                PopupWindow popupWindow = fjzVar.c;
                popupWindow.getClass();
                popupWindow.setClippingEnabled(false);
                PopupWindow popupWindow2 = fjzVar.c;
                popupWindow2.getClass();
                popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: fjs
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() throws Resources.NotFoundException {
                        fjz fjzVar2 = fjzVar;
                        fjzVar2.r.c.o();
                        LottieAnimationView lottieAnimationView = fjzVar2.r;
                        lottieAnimationView.e.add(efg.PLAY_OPTION);
                        lottieAnimationView.c.i();
                        fjzVar2.v.setVisibility(8);
                        tpc tpcVarM = snz.a.m();
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        snz snzVar = (snz) tpcVarM.b;
                        snzVar.c = 33;
                        snzVar.b |= 1;
                        long jCurrentTimeMillis = System.currentTimeMillis() - fjzVar2.N;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        mdy mdyVar = fjzVar2.Q;
                        int i5 = i4;
                        snz snzVar2 = (snz) tpcVarM.b;
                        snzVar2.b |= 2;
                        snzVar2.d = jCurrentTimeMillis;
                        mdyVar.h((snz) tpcVarM.l());
                        fjzVar2.e();
                        fjzVar2.l(i5);
                    }
                });
                fjzVar.P.g(fjz.class);
                fjzVar.q((mxm) fjzVar.m.dL());
                PopupWindow popupWindow3 = fjzVar.c;
                popupWindow3.getClass();
                popupWindow3.showAtLocation(fjzVar.f, 119, 0, 0);
                fjzVar.o.a(true);
                fjzVar.N = System.currentTimeMillis();
                fjzVar.i.g();
                fjzVar.b = (AccessibilityManager) fjzVar.e.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = fjzVar.b;
                if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                    fjzVar.s.requestFocus();
                    fjzVar.d(fjzVar.s, fjzVar.t, false);
                }
                fjzVar.g();
            }
        });
    }

    public final void o(int i, Duration duration) {
        this.ab.postDelayed(new cmu(this, i, 5, null), duration.toMillis());
    }

    public final void p() {
        if (!s()) {
            owf owfVar = this.m;
            if (!((mxm) owfVar.dL()).equals(mxm.LANDSCAPE) && !((mxm) owfVar.dL()).equals(mxm.REVERSE_LANDSCAPE)) {
                if (((mxm) owfVar.dL()).equals(mxm.PORTRAIT) || ((mxm) owfVar.dL()).equals(mxm.REVERSE_PORTRAIT)) {
                    y(this.B);
                    y(this.ae);
                    x(this.ai, false);
                    this.ai.c(a(R.dimen.first_time_demo_image_corner_radius));
                    x(this.aj, false);
                    this.ai.c(a(R.dimen.first_time_demo_image_corner_radius));
                    x(this.ak, false);
                    this.ak.c(a(R.dimen.first_time_demo_image_corner_radius));
                    x(this.am, false);
                    x(this.al, true);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ap.getLayoutParams();
                    layoutParams.width = a(R.dimen.first_time_tips_bullets_width);
                    this.ap.setLayoutParams(layoutParams);
                    this.ap.requestLayout();
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.ar.getLayoutParams();
                    layoutParams2.width = a(R.dimen.first_time_tabs_bar_width);
                    this.ar.setLayoutParams(layoutParams2);
                    this.aq.setWidth(a(R.dimen.first_time_try_it_out_button_width));
                    return;
                }
                return;
            }
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ar.getLayoutParams();
        layoutParams3.width = a(R.dimen.first_time_tabs_bar_width_tablet);
        this.ar.setLayoutParams(layoutParams3);
        this.aq.setWidth(a(R.dimen.first_time_try_it_out_button_width_tablet));
    }

    public final void q(mxm mxmVar) {
        if (this.c == null) {
            return;
        }
        this.h.execute(new fjw(this, mxmVar, 0));
    }

    public final void r(LinearLayout linearLayout) {
        boolean z = this.aw;
        LinearLayout linearLayout2 = z ? this.K : this.L;
        GcaTextView gcaTextView = z ? this.as : this.at;
        if (linearLayout != linearLayout2) {
            this.aw = !z;
            Context context = this.e;
            linearLayout.setBackground(context.getDrawable(R.drawable.first_time_edu_tab_selected));
            GcaTextView gcaTextView2 = this.aw ? this.as : this.at;
            gcaTextView2.setStateDescription(context.getString(R.string.first_time_tab_selected_state));
            gcaTextView2.setTextColor(this.au);
            linearLayout2.setBackground(context.getDrawable(R.drawable.first_time_edu_tab_unselected));
            gcaTextView.setTextColor(this.av);
            gcaTextView.setStateDescription(context.getString(R.string.first_time_tab_unselected_state));
        }
    }

    public final boolean s() {
        return ((mxj) this.g.dL()).equals(mxj.TABLET_LAYOUT);
    }

    public final boolean t() {
        int i = 0;
        if (this.S.ai("step_by_step_bottom_sheet_skip_instructions") > 0 || !this.W || !((fne) this.Z.dL()).b() || this.Y) {
            return false;
        }
        out.a();
        Context context = this.e;
        FrameLayout frameLayout = new FrameLayout(context);
        this.q = frameLayout;
        View.inflate(context, R.layout.first_time_bottom_sheet, frameLayout);
        this.C = (LinearLayout) this.q.findViewById(R.id.first_time_bottom_sheet_layout);
        this.an = (TextView) this.q.findViewById(R.id.first_time_feature_title);
        this.ao = (TextView) this.q.findViewById(R.id.first_time_feature_desc);
        this.ar = (LinearLayout) this.q.findViewById(R.id.first_time_tabs_bar);
        this.K = (LinearLayout) this.q.findViewById(R.id.first_time_tabs_bar_about_label);
        this.as = (GcaTextView) this.q.findViewById(R.id.first_time_tabs_bar_about_text);
        this.L = (LinearLayout) this.q.findViewById(R.id.first_time_tabs_bar_more_info_label);
        this.at = (GcaTextView) this.q.findViewById(R.id.first_time_tabs_bar_more_info_text);
        this.au = this.as.getCurrentTextColor();
        this.av = this.at.getCurrentTextColor();
        this.D = (LinearLayout) this.q.findViewById(R.id.first_time_video_slider);
        this.J = (HorizontalScrollView) this.q.findViewById(R.id.first_time_video_scrollview);
        this.E = (LinearLayout) this.q.findViewById(R.id.first_time_edu_page_1);
        this.B = (CardView) this.q.findViewById(R.id.first_time_video_container_1);
        this.z = (ImageButton) this.q.findViewById(R.id.first_time_video_1_play_button);
        this.A = (EduImageView) this.q.findViewById(R.id.first_time_video_1);
        this.af = (EduImageView) this.q.findViewById(R.id.first_time_first_photo);
        this.ag = (EduImageView) this.q.findViewById(R.id.first_time_second_photo);
        this.ah = (EduImageView) this.q.findViewById(R.id.first_time_third_photo);
        this.ai = (CardView) this.q.findViewById(R.id.first_time_first_photo_container);
        this.aj = (CardView) this.q.findViewById(R.id.first_time_second_photo_container);
        this.ak = (CardView) this.q.findViewById(R.id.first_time_third_photo_container);
        this.al = (ImageView) this.q.findViewById(R.id.first_time_demo_plus_sign);
        this.am = (ImageView) this.q.findViewById(R.id.first_time_demo_equal_sign);
        this.F = (LinearLayout) this.q.findViewById(R.id.first_time_edu_page_2);
        this.ae = (CardView) this.q.findViewById(R.id.first_time_video_container_2);
        this.ad = (EduImageView) this.q.findViewById(R.id.first_time_video_2);
        this.ap = (TextView) this.q.findViewById(R.id.first_time_tips_bullets);
        this.aq = (MaterialButton) this.q.findViewById(R.id.first_time_try_it_out_button);
        if (!this.M) {
            j();
        }
        p();
        this.an.setText(R.string.mode_cottage);
        this.ao.setText(context.getString(R.string.first_time_feature_description, context.getString(R.string.mode_cottage)));
        this.A.c(context.getString(R.string.first_time_video_url_1), context.getString(R.string.first_time_video_description_1));
        this.z.setVisibility(8);
        byte[] bArr = null;
        this.A.setOnClickListener(new gx(this, 8, bArr));
        this.z.setOnClickListener(new gx(this, 9, bArr));
        this.ad.c(context.getString(R.string.first_time_video_url_2), context.getString(R.string.first_time_video_2_label));
        this.af.c(context.getString(R.string.first_time_first_photo_url), context.getString(R.string.first_time_first_photo_description));
        this.ag.c(context.getString(R.string.first_time_second_photo_url), context.getString(R.string.first_time_second_photo_description));
        this.ah.c(context.getString(R.string.first_time_third_photo_url), context.getString(R.string.first_time_third_photo_description));
        int iMeasureText = (int) this.ap.getPaint().measureText("• ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(R.string.first_time_video_2_bullet_1));
        String str = wzgaYJqO.taXeciUIAPba;
        spannableStringBuilder.append((CharSequence) str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(0, iMeasureText), 0, length, 0);
        spannableStringBuilder.append((CharSequence) context.getString(R.string.first_time_video_2_bullet_2));
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(0, iMeasureText), length, spannableStringBuilder.length(), 0);
        this.ap.setText(spannableStringBuilder);
        MaterialButton materialButton = this.aq;
        u(materialButton, ojl.aO(materialButton), ojl.aJ(this.aq));
        this.aq.setOnClickListener(new gx(this, 10, bArr));
        this.as.setStateDescription(context.getString(R.string.first_time_tab_selected_state));
        this.at.setStateDescription(context.getString(R.string.first_time_tab_unselected_state));
        m();
        this.K.setOnClickListener(new gx(this, 11, bArr));
        this.L.setOnClickListener(new gx(this, 12, bArr));
        this.C.addOnLayoutChangeListener(new fjt(this, i));
        this.U.m(35, -1, this.q);
        this.o.a(true);
        this.i.g();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.b = accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            d(this.an, this.ao, true);
        }
        return true;
    }
}
