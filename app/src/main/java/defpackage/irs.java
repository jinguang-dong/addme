package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class irs extends PopupWindow {
    private static final sgv C = sgv.g("irs");
    public final hbj B;
    private final AccessibilityManager D;
    private final Handler E;
    private Runnable F;
    public final sbp a;
    public final AccessibilityNodeInfo.AccessibilityAction b;
    public final AccessibilityNodeInfo.AccessibilityAction c;
    public final AccessibilityNodeInfo.AccessibilityAction d;
    public final AccessibilityNodeInfo.AccessibilityAction e;
    public final fvu f;
    public final Context g;
    public final Window h;
    public final ira i;
    public final irv j;
    public View k;
    public View l;
    public View.OnLayoutChangeListener m;
    public ConstraintLayout n;
    public LinearLayout p;
    public ImageButton q;
    public ImageButton r;
    public ImageButton s;
    public View t;
    public iqz v;
    public syu z;
    public mxj o = mxj.PHONE_LAYOUT;
    public Optional u = Optional.empty();
    public boolean w = false;
    public final Rect x = new Rect(0, 0, 0, 0);
    public boolean y = false;
    private mxm G = mxm.PORTRAIT;
    public UranusCharacterItem A = null;

    public irs(AccessibilityManager accessibilityManager, Context context, Window window, Handler handler, fvu fvuVar, hbj hbjVar, ira iraVar, irv irvVar, iqz iqzVar) {
        this.D = accessibilityManager;
        this.g = context;
        this.f = fvuVar;
        this.h = window;
        this.E = handler;
        this.B = hbjVar;
        this.i = iraVar;
        this.j = irvVar;
        this.v = iqzVar;
        this.b = new AccessibilityNodeInfo.AccessibilityAction(16, context.getString(R.string.uranus_character_unselected_action_accessibility));
        this.c = new AccessibilityNodeInfo.AccessibilityAction(16, context.getString(R.string.uranus_character_selected_action_accessibility));
        this.d = new AccessibilityNodeInfo.AccessibilityAction(16, context.getString(R.string.uranus_voice_off_button_action_accessibility));
        this.e = new AccessibilityNodeInfo.AccessibilityAction(16, context.getString(R.string.uranus_voice_on_button_action_accessibility));
        sbk sbkVar = new sbk();
        if (hbjVar.p(gza.h)) {
            sbkVar.h(iqz.JOY);
        }
        sbkVar.i(iqz.GEO, iqz.PEEKING_CHICKEN, iqz.PUFFER_FISH, iqz.BLOCK_BUDDIES);
        this.a = sbkVar.g();
    }

    public static final void p(ViewGroup viewGroup) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new ChangeImageTransform());
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }

    private final void q(boolean z) {
        View view = this.k;
        if (view == null) {
            return;
        }
        ckl cklVar = (ckl) view.getLayoutParams();
        int iD = d();
        int iC = c(R.dimen.character_menu_width_collapse);
        if (cklVar != null) {
            cklVar.width = iD - iC;
            this.k.setLayoutParams(cklVar);
        }
        this.k.setVisibility(true != z ? 8 : 0);
    }

    private final void r(boolean z) {
        ckl cklVar;
        ImageButton imageButton = this.s;
        if (imageButton == null || (cklVar = (ckl) imageButton.getLayoutParams()) == null) {
            return;
        }
        if (z) {
            cklVar.rightMargin = c(R.dimen.character_collapse_button_right_margin);
            ImageButton imageButton2 = this.s;
            Context context = this.g;
            imageButton2.setImageDrawable(context.getDrawable(R.drawable.quantum_gm_ic_keyboard_arrow_left_white_24));
            this.s.setContentDescription(context.getString(R.string.uranus_expand_button_accessibility));
        } else {
            cklVar.rightMargin = c(R.dimen.character_expand_button_right_margin);
            ImageButton imageButton3 = this.s;
            Context context2 = this.g;
            imageButton3.setImageDrawable(context2.getDrawable(R.drawable.quantum_gm_ic_keyboard_arrow_right_white_24));
            this.s.setContentDescription(context2.getString(R.string.uranus_collapse_button_accessibility));
        }
        this.s.setLayoutParams(cklVar);
    }

    private final void s(boolean z) {
        ckl cklVar;
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout == null || (cklVar = (ckl) constraintLayout.getLayoutParams()) == null) {
            return;
        }
        int iD = d();
        int iC = c(R.dimen.character_menu_width_collapse);
        if (z) {
            cklVar.width = iC;
            cklVar.leftMargin = iD - iC;
        } else {
            cklVar.width = iD;
            cklVar.leftMargin = 0;
        }
        this.n.setLayoutParams(cklVar);
    }

    private final void t(boolean z) {
        LinearLayout.LayoutParams layoutParams;
        Optional optionalF = f(this.v);
        if (optionalF.isEmpty() || this.p == null || (layoutParams = (LinearLayout.LayoutParams) ((UranusCharacterItem) optionalF.get()).getLayoutParams()) == null) {
            return;
        }
        if (z) {
            this.p.setPadding(0, 0, 0, 0);
            this.p.setBackgroundColor(0);
            layoutParams.width = c(R.dimen.character_selected_item_width_with_collapse);
        } else {
            int iC = c(R.dimen.character_menu_list_vertical_padding);
            int iC2 = c(R.dimen.character_menu_list_horizontal_padding);
            this.p.setPadding(iC2, iC, iC2, iC);
            this.p.setBackground(this.g.getDrawable(R.drawable.popup_character_menu_background));
            layoutParams.width = c(R.dimen.character_selected_item_width_with_expand);
        }
        ((UranusCharacterItem) optionalF.get()).setLayoutParams(layoutParams);
    }

    public final int a() {
        if (this.o.equals(mxj.TABLET_LAYOUT)) {
            if (this.l != null) {
                return (-(getWidth() - this.l.getMeasuredWidth())) + c(R.dimen.character_menu_horizontal_offset);
            }
            return 0;
        }
        if (!this.o.equals(mxj.PHONE_LAYOUT)) {
            return 0;
        }
        int iOrdinal = this.G.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? -c(R.dimen.character_window_x_offset_split_screen) : -c(R.dimen.character_window_y_offset_split_screen) : -((this.h.getDecorView().getMeasuredWidth() - e()) - c(R.dimen.character_window_y_offset_split_screen));
    }

    public final int b() {
        int measuredHeight;
        int iC;
        int i;
        int iC2;
        int iC3;
        if (!this.o.equals(mxj.TABLET_LAYOUT)) {
            if (!this.o.equals(mxj.PHONE_LAYOUT)) {
                return 0;
            }
            Window window = this.h;
            WindowInsets rootWindowInsets = window.getDecorView().getRootWindowInsets();
            rootWindowInsets.getClass();
            int iOrdinal = this.G.ordinal();
            if (iOrdinal == 1) {
                measuredHeight = window.getDecorView().getMeasuredHeight() - rootWindowInsets.getInsets(WindowInsets.Type.statusBars()).top;
                iC = c(R.dimen.character_window_x_offset_split_screen);
            } else if (iOrdinal != 2) {
                measuredHeight = window.getDecorView().getMeasuredHeight() - rootWindowInsets.getInsets(WindowInsets.Type.statusBars()).top;
                iC = c(R.dimen.character_window_y_offset_split_screen);
            } else {
                iC2 = c(R.dimen.character_window_height) + rootWindowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
                iC3 = c(R.dimen.character_window_x_offset_split_screen);
            }
            i = measuredHeight - iC;
            return -i;
        }
        View view = this.l;
        if (view == null) {
            return 0;
        }
        iC2 = view.getMeasuredHeight() + getHeight();
        iC3 = c(R.dimen.character_menu_vertical_offset);
        i = iC2 + iC3;
        return -i;
    }

    public final int c(int i) {
        return this.g.getResources().getDimensionPixelSize(i);
    }

    final int d() {
        int iC = c(R.dimen.character_item_margin_horizontal);
        int i = iC + iC;
        return c(R.dimen.character_menu_width_without_items) + c(R.dimen.character_selected_item_width_with_expand) + i + ((c(R.dimen.character_unselected_item_width) + i) * (((sex) this.a).c - 1));
    }

    public final int e() {
        return d() + c(R.dimen.character_window_width_without_items);
    }

    public final Optional f(iqz iqzVar) {
        UranusCharacterItem uranusCharacterItem = null;
        for (int i = 0; i < this.p.getChildCount(); i++) {
            UranusCharacterItem uranusCharacterItem2 = (UranusCharacterItem) this.p.getChildAt(i);
            if (true == uranusCharacterItem2.g.equals(iqzVar)) {
                uranusCharacterItem = uranusCharacterItem2;
            }
        }
        return Optional.ofNullable(uranusCharacterItem);
    }

    public final void g() {
        if (this.w) {
            return;
        }
        this.w = true;
        s(true);
        r(true);
        t(true);
        q(true);
        for (int i = 0; i < this.p.getChildCount(); i++) {
            UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) this.p.getChildAt(i);
            if (!uranusCharacterItem.g.equals(this.v)) {
                uranusCharacterItem.setVisibility(8);
            }
        }
        p((ViewGroup) this.n.getParent());
    }

    public final void h() {
        if (this.w) {
            this.w = false;
            s(false);
            r(false);
            t(false);
            q(false);
            for (int i = 0; i < this.p.getChildCount(); i++) {
                UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) this.p.getChildAt(i);
                if (!uranusCharacterItem.g.equals(this.v)) {
                    uranusCharacterItem.setVisibility(0);
                }
            }
            p((ViewGroup) this.n.getParent());
        }
    }

    public final void i(mxj mxjVar, mxm mxmVar) {
        this.G = mxmVar;
        if (this.t != null) {
            if (this.o.equals(mxj.PHONE_LAYOUT)) {
                int iOrdinal = this.G.ordinal();
                if (iOrdinal == 1) {
                    this.t.setRotation(-90.0f);
                    this.t.setTranslationY((e() - c(R.dimen.character_window_height)) / 2.0f);
                } else if (iOrdinal != 2) {
                    this.t.setRotation(0.0f);
                    this.t.setTranslationY(0.0f);
                } else {
                    this.t.setRotation(90.0f);
                    this.t.setTranslationY((-(e() - c(R.dimen.character_window_height))) / 2.0f);
                }
            } else {
                this.t.setRotation(0.0f);
                this.t.setTranslationY(0.0f);
            }
        }
        l();
        if (this.o != mxjVar && isShowing()) {
            dismiss();
            mxj mxjVar2 = mxj.TABLET_LAYOUT;
            showAsDropDown(mxjVar.equals(mxjVar2) ? this.l : this.h.getDecorView(), a(), b(), true != mxjVar.equals(mxjVar2) ? 5 : 0);
        }
        this.o = mxjVar;
    }

    public final void j() {
        Runnable runnable = this.F;
        if (runnable != null) {
            this.E.removeCallbacks(runnable);
        }
    }

    public final void k(isg isgVar) {
        syu syuVarI;
        if (this.A == null) {
            return;
        }
        if (n()) {
            UranusCharacterItem uranusCharacterItem = this.A;
            uranusCharacterItem.getClass();
            uranusCharacterItem.f(2);
            j();
            if (isgVar.c.p(gza.h)) {
                hbp hbpVar = isgVar.e;
                rvk rvkVar = rvk.a;
                jlk jlkVar = new jlk(rvkVar, rvkVar, rvkVar, rvkVar);
                szh szhVar = new szh();
                hbpVar.p(hbpVar.o(), new jlc(hbpVar, szhVar, jlkVar));
                syuVarI = swz.i(szhVar, new fym(isgVar, 12), isgVar.b);
            } else {
                int i = sbp.d;
                syuVarI = ske.M(sex.a);
            }
            this.z = swz.i(syuVarI, new fym(this, 9), ojl.ce());
            return;
        }
        irv irvVar = this.j;
        ipd ipdVar = new ipd(this, isgVar, 4);
        mle mleVar = irvVar.e;
        if (mleVar != null) {
            mleVar.i();
        }
        View view = irvVar.d;
        if (view == null) {
            irvVar.d = View.inflate(irvVar.c, R.layout.uranus_internet_requirement_toast_layout, null);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(irvVar.d);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) ((Activity) irvVar.c).findViewById(R.id.activity_root_view);
        View view2 = irvVar.d;
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.chip_text);
        View view3 = irvVar.d;
        view3.getClass();
        ((TextView) view3.findViewById(R.id.retry_button)).setOnClickListener(ipdVar);
        mld mldVar = new mld();
        mldVar.b = viewGroup2;
        View view4 = irvVar.d;
        view4.getClass();
        mldVar.c = view4;
        mldVar.d = R.drawable.uranus_download_toast_background;
        mldVar.j = irvVar.f;
        mldVar.h = 1;
        if (irvVar.b.isEnabled()) {
            mldVar.f = true;
            mldVar.g = true;
        } else {
            mldVar.a = irv.a;
        }
        irvVar.e = mldVar.a();
        irvVar.e.m();
        textView.post(new ild(textView, 16));
    }

    public final void l() {
        if (this.l == null || getContentView() == null || !isShowing()) {
            return;
        }
        update(this.o.equals(mxj.TABLET_LAYOUT) ? this.l : this.h.getDecorView(), a(), b(), e(), c(R.dimen.character_window_height));
    }

    public final void m(ImageButton imageButton, ImageButton imageButton2) {
        imageButton.setSelected(true);
        imageButton.setBackground(this.g.getDrawable(R.drawable.voice_selection_background));
        imageButton2.setSelected(false);
        imageButton2.setBackgroundColor(0);
    }

    public final boolean n() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.g.getSystemService("connectivity");
        if (connectivityManager == null) {
            ((sgt) C.c().M(2253)).s("ConnectivityManager is null");
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            ((sgt) C.c().M(2252)).s("No network available");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(13);
    }

    public final void o() {
        if (this.D.isEnabled()) {
            return;
        }
        Runnable runnable = this.F;
        if (runnable == null) {
            this.F = new ild(this, 15);
        } else {
            this.E.removeCallbacks(runnable);
        }
        this.E.postDelayed(this.F, 3000L);
    }
}
