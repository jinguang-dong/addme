package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxq extends myd {
    private final boolean a;

    public mxq(mxt mxtVar, cku ckuVar, Context context, pnq pnqVar, hbj hbjVar) {
        super(mxtVar, ckuVar, context, pnqVar);
        this.a = hbjVar.p(gzo.bw);
    }

    private final int a(int i) {
        if (e()) {
            return i + (f() ? this.f.getDimensionPixelSize(R.dimen.starfish_portrait_side_margin_offset) : this.f.getDimensionPixelSize(R.dimen.starfish_landscape_side_margin_offset));
        }
        return i;
    }

    private final int c() throws Resources.NotFoundException {
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height);
        pnq pnqVar = this.e;
        return a(dimensionPixelSize + ((pnqVar.u || pnqVar.k()) ? f() ? resources.getDimensionPixelSize(R.dimen.tab_zoom_ui_left_margin_portrait) : resources.getDimensionPixelSize(R.dimen.tab_zoom_ui_left_margin) : this.a ? f() ? resources.getDimensionPixelSize(R.dimen.freeway_tab_zoom_ui_portrait_left_margin) : resources.getDimensionPixelSize(R.dimen.freeway_tab_zoom_ui_left_margin) : resources.getDimensionPixelSize(R.dimen.starfish2_tab_zoom_ui_left_margin)));
    }

    private final pae d() {
        Size size = this.j;
        return size == null ? pae.c : pae.h(size);
    }

    private final boolean e() {
        pnq pnqVar = this.e;
        return pnqVar.B || pnqVar.u;
    }

    private final boolean f() {
        Size size = this.k;
        return size == null ? this.i.d() : size.getHeight() > size.getWidth() && !aa();
    }

    private final boolean g() {
        return this.e.B && !this.a && this.i == mxm.LANDSCAPE && d().equals(pae.a);
    }

    @Override // defpackage.myd
    public final void A(View view) throws Resources.NotFoundException {
        Size size = this.k;
        if (size == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_options_container_zoom_offset);
        int dimensionPixelSize2 = f() ? resources.getDimensionPixelSize(R.dimen.tab_options_container_top_margin_portrait) : resources.getDimensionPixelSize(R.dimen.tab_options_container_top_margin_landscape);
        int i = true != Z() ? R.id.mode_switcher : R.id.mode_slider_ui;
        int iC = c() + dimensionPixelSize;
        int width = size.getWidth() - (iC + iC);
        if (!f() && !aa() && !e()) {
            width -= size.getWidth() / 2;
        }
        int i2 = width;
        int id = view.getId();
        cku ckuVar = this.c;
        ckuVar.j(id, 6, R.id.zoom_slider_area, 6, dimensionPixelSize);
        ckuVar.j(id, 3, 0, 3, dimensionPixelSize2);
        ckuVar.i(id, 4, i, 3);
        ckuVar.k(id, 0);
        ckuVar.l(id, -2);
        ckuVar.b(id).d.ab = i2;
    }

    @Override // defpackage.myd
    public final void B(View view) {
        Size size = this.k;
        if (size == null || !(view instanceof ViewGroup)) {
            return;
        }
        int id = view.getId();
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) view).getChildAt(0).getLayoutParams();
        layoutParams.getClass();
        int i = layoutParams.width;
        int i2 = layoutParams.height;
        int height = (!f() || e()) ? (size.getHeight() - i) / 2 : ((size.getHeight() * 3) / 5) - (i / 2);
        cku ckuVar = this.c;
        ckuVar.l(id, i);
        ckuVar.k(id, i2);
        ckuVar.j(id, 6, 0, 6, i2);
        ckuVar.j(id, 3, 0, 3, height);
    }

    @Override // defpackage.myd
    public final void C(View view) {
        M(view);
    }

    @Override // defpackage.myd
    public final void D(View view) {
        M(view);
    }

    @Override // defpackage.myd
    public final void E(View view) throws Resources.NotFoundException {
        Size size = this.k;
        if (size == null || this.j == null) {
            return;
        }
        Resources resources = this.f;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 700.0f, resources.getDisplayMetrics());
        int dimensionPixelSize = e() ? f() ? resources.getDimensionPixelSize(R.dimen.autobahn_starfish_preview_widgets_side_margins_portrait) : resources.getDimensionPixelSize(R.dimen.autobahn_starfish_preview_widgets_side_margins_landscape) : f() ? size.getWidth() < iApplyDimension ? resources.getDimensionPixelSize(R.dimen.autobahn_starfish_preview_widgets_side_margins_portrait) : resources.getDimensionPixelSize(R.dimen.tab_preview_widgets_side_margins_portrait) : resources.getDimensionPixelSize(R.dimen.tab_preview_widgets_side_margins_landscape);
        int width = size.getWidth() - (dimensionPixelSize + dimensionPixelSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tab_preview_widgets_height);
        X(view.getId(), width, dimensionPixelSize2, dimensionPixelSize, (!f() || e()) ? (size.getHeight() - dimensionPixelSize2) / 2 : size.getWidth() < iApplyDimension ? ((size.getHeight() * 3) / 5) - (dimensionPixelSize2 / 2) : resources.getDimensionPixelSize(R.dimen.tab_preview_widgets_top_margin_portrait));
    }

    @Override // defpackage.myd
    public final void F() {
        cku ckuVar = this.c;
        ckuVar.l(R.id.rotating_gca_layout, 0);
        ckuVar.k(R.id.rotating_gca_layout, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // defpackage.myd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(android.view.View r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxq.H(android.view.View):void");
    }

    @Override // defpackage.myd
    public final void J(View view) throws Resources.NotFoundException {
        Size size;
        Size size2 = this.k;
        if (size2 == null || (size = this.j) == null) {
            return;
        }
        Rect rectH = h(size2, size);
        int iC = c();
        Resources resources = this.f;
        int dimensionPixelSize = iC + resources.getDimensionPixelSize(R.dimen.tab_uncovered_preview_zoom_offset);
        boolean zAa = aa();
        int iMax = zAa ? 0 : Math.max(rectH.left, dimensionPixelSize);
        int width = zAa ? size2.getWidth() : Math.min(rectH.right, size2.getWidth() - dimensionPixelSize);
        int dimensionPixelSize2 = f() ? resources.getDimensionPixelSize(R.dimen.tab_uncovered_preview_top_margin_portrait) : resources.getDimensionPixelSize(R.dimen.tab_uncovered_preview_top_margin_landscape);
        if (this.g.equals(nkw.SERENGETI)) {
            iMax = rectH.left;
            width = rectH.right;
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.serengeti_tab_uncovered_preview_top_margin) + (size2.getHeight() / 2);
        }
        int i = iMax;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_height);
        if (!zAa) {
            dimensionPixelSize3 += resources.getDimensionPixelSize(R.dimen.gesture_nav_offset);
        }
        int dimensionPixelSize4 = dimensionPixelSize3 + (Z() ? resources.getDimensionPixelSize(R.dimen.mode_slider_offset) : resources.getDimensionPixelSize(R.dimen.tab_uncovered_preview_mode_switcher_offset));
        View viewFindViewById = view.getRootView().findViewById(R.id.ark_values);
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            dimensionPixelSize2 += viewFindViewById.getHeight() - resources.getDimensionPixelSize(R.dimen.values_bar_offset_difference);
        }
        Y(view.getId(), i, size2.getWidth() - width, dimensionPixelSize2, dimensionPixelSize4);
    }

    @Override // defpackage.myd
    public final void L(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.values_bar_width);
        cku ckuVar = this.c;
        ckuVar.l(i, dimensionPixelSize);
        ckuVar.i(i, 6, 0, 6);
        ckuVar.i(i, 7, 0, 7);
        ckuVar.i(i, 3, R.id.minibar_area, 3);
    }

    @Override // defpackage.myd
    public final void M(View view) {
        Size size;
        Size size2 = this.k;
        if (size2 == null || (size = this.j) == null) {
            return;
        }
        Rect rectH = h(size2, size);
        X(view.getId(), rectH.width(), rectH.height(), rectH.left, rectH.top);
    }

    @Override // defpackage.myd
    public final void N(View view) {
        M(view);
    }

    @Override // defpackage.myd
    public final void O(View view) throws Resources.NotFoundException {
        Size size = this.k;
        if (size == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_zoom_ui_width);
        X(view.getId(), dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height), c(), (!f() || e()) ? (size.getHeight() - dimensionPixelSize) / 2 : ((size.getHeight() * 3) / 5) - (dimensionPixelSize / 2));
    }

    @Override // defpackage.myd
    public final boolean P() {
        return true;
    }

    @Override // defpackage.myd
    public final Rect h(Size size, Size size2) throws Resources.NotFoundException {
        if (size == null || size2 == null) {
            return new Rect();
        }
        Rect rectH = super.h(size, size2);
        int iMax = rectH.top;
        int dimensionPixelSize = rectH.left;
        if (rectH.top == 0 || aa()) {
            if (this.i.d() && rectH.width() < size.getWidth() && rectH.width() >= size.getWidth() / 2) {
                pnq pnqVar = this.e;
                if (pnqVar.u) {
                    dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.tab_viewfinder_left_margin);
                } else if (pnqVar.d() && d().equals(pae.c) && !this.a) {
                    dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.ct_tab_viewfinder_left_margin);
                }
            }
        } else if (!this.e.d()) {
            iMax = Math.max(iMax, this.f.getDimensionPixelSize(R.dimen.tab_viewfinder_top_margin));
        } else if (d().equals(pae.a) && !this.a) {
            mxm mxmVar = this.i;
            if (mxmVar.equals(mxm.LANDSCAPE)) {
                iMax = this.f.getDimensionPixelSize(R.dimen.starfish2_tab_viewfinder_top_margin);
            } else if (mxmVar.equals(mxm.REVERSE_LANDSCAPE)) {
                iMax = this.f.getDimensionPixelSize(R.dimen.starfish2_tab_viewfinder_top_margin_reverse_landscape);
            }
        }
        return new Rect(dimensionPixelSize, iMax, rectH.width() + dimensionPixelSize, rectH.height() + iMax);
    }

    @Override // defpackage.myd
    public final void n() {
        cku ckuVar = this.c;
        ckuVar.r(R.id.viewfinder_max_top, 0);
        ckuVar.s(R.id.viewfinder_min_bottom, 0);
        ckuVar.s(R.id.viewfinder_max_bottom, 0);
    }

    @Override // defpackage.myd
    public final void o(View view) throws Resources.NotFoundException {
        int dimensionPixelSize;
        Size size = this.k;
        if (size == null) {
            return;
        }
        pnq pnqVar = this.e;
        boolean z = pnqVar.u;
        int i = R.dimen.tab_freeway_bottom_bar_right_margin_landscape;
        if (!z && !pnqVar.k()) {
            dimensionPixelSize = this.a ? this.f.getDimensionPixelSize(R.dimen.tab_freeway_bottom_bar_right_margin_landscape) : this.f.getDimensionPixelSize(R.dimen.starfish2_tab_bottom_bar_right_margin_portrait);
        } else if (f()) {
            dimensionPixelSize = this.f.getDimensionPixelSize(true != this.a ? R.dimen.tab_bottom_bar_right_margin_portrait : R.dimen.tab_freeway_bottom_bar_right_margin_portrait);
        } else {
            Resources resources = this.f;
            if (true != this.a) {
                i = R.dimen.tab_bottom_bar_right_margin_landscape;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(i);
        }
        int iA = a(dimensionPixelSize);
        Resources resources2 = this.f;
        boolean z2 = this.a;
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.tab_bottom_bar_width);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(true != z2 ? R.dimen.bottom_bar_height : R.dimen.tab_freeway_bottom_bar_height);
        X(view.getId(), dimensionPixelSize2, dimensionPixelSize3, (size.getWidth() - dimensionPixelSize3) - iA, (!f() || e()) ? (size.getHeight() + dimensionPixelSize2) / 2 : ((size.getHeight() * 3) / 5) + (dimensionPixelSize2 / 2));
    }

    @Override // defpackage.myd
    public final void p(View view) {
        cku ckuVar = this.c;
        int id = view.getId();
        ckuVar.l(id, 0);
        ckuVar.k(id, -2);
        ckuVar.i(id, 6, 0, 6);
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
    }

    @Override // defpackage.myd
    public final void q(View view) throws Resources.NotFoundException {
        if (nlj.k(view)) {
            Point pointD = nlj.d(view);
            int id = view.getId();
            int dimensionPixelOffset = this.f.getDimensionPixelOffset(R.dimen.tablet_cutout_bar_height);
            int i = pointD.y - (dimensionPixelOffset / 2);
            cku ckuVar = this.c;
            ckuVar.l(id, 0);
            ckuVar.k(id, dimensionPixelOffset);
            U(id, 0, 0, 0);
            ckuVar.j(id, 3, 0, 3, i);
        }
    }

    @Override // defpackage.myd
    public final void s(View view) {
        int iHeight;
        int i;
        int iHeight2;
        Size size = this.k;
        if (size == null) {
            return;
        }
        int id = view.getId();
        Rect rectH = h(size, this.j);
        mxm mxmVar = this.i;
        if (mxmVar.d()) {
            iHeight2 = rectH.width();
            i = rectH.left;
            iHeight = 0;
        } else if (mxmVar.equals(mxm.LANDSCAPE)) {
            iHeight2 = rectH.height();
            int i2 = rectH.left;
            iHeight = rectH.bottom;
            i = i2;
        } else {
            int iT = T(this.f.getFloat(R.dimen.serengeti_preview_container_height_proportion));
            int iHeight3 = rectH.height();
            int i3 = iT + rectH.left;
            iHeight = rectH.bottom - rectH.height();
            i = i3;
            iHeight2 = iHeight3;
        }
        cku ckuVar = this.c;
        ckuVar.l(id, iHeight2);
        ckuVar.k(id, -2);
        ckuVar.j(id, 6, 0, 6, i);
        ckuVar.j(id, 3, 0, 3, iHeight);
    }

    @Override // defpackage.myd
    public final void t(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        int id = view.getId();
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_height);
        if (!aa()) {
            dimensionPixelSize += resources.getDimensionPixelSize(R.dimen.gesture_nav_offset);
        }
        cku ckuVar = this.c;
        ckuVar.k(id, dimensionPixelSize);
        ckuVar.l(id, 0);
        ckuVar.i(id, 4, 0, 4);
        U(id, 0, 0, 0);
    }

    @Override // defpackage.myd
    public final void u(int i) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int i2;
        if (!f()) {
            dimensionPixelSize = this.e.d() ? this.f.getDimensionPixelSize(R.dimen.starfish2_landscape_help_ui_right_margin) : this.f.getDimensionPixelSize(R.dimen.tab_landscape_help_ui_right_margin);
        } else {
            if (!this.e.d()) {
                i2 = 0;
                V(i, R.id.minibar_area, 0, 0);
                this.c.j(i, 7, R.id.minibar_area, 7, i2);
            }
            dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.starfish2_portrait_help_ui_right_margin);
        }
        i2 = dimensionPixelSize;
        V(i, R.id.minibar_area, 0, 0);
        this.c.j(i, 7, R.id.minibar_area, 7, i2);
    }

    @Override // defpackage.myd
    public final void v(View view) throws Resources.NotFoundException {
        Size size = this.k;
        if (size == null) {
            return;
        }
        pnq pnqVar = this.e;
        int dimensionPixelSize = pnqVar.d() ? this.f.getDimensionPixelSize(R.dimen.starfish2_manual_controls_panel_width) : this.f.getDimensionPixelSize(R.dimen.tab_manual_controls_panel_width);
        Resources resources = this.f;
        boolean z = this.a;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.manual_controls_panel_height);
        if (z) {
            dimensionPixelSize = pnqVar.d() ? resources.getDimensionPixelSize(R.dimen.tab_unfold_freeway_manual_controls_panel_width) : pnqVar.k() ? resources.getDimensionPixelSize(R.dimen.tab_freeway_manual_controls_panel_width) : resources.getDimensionPixelSize(R.dimen.starfish2_freeway_manual_controls_panel_width);
            dimensionPixelSize2 = pnqVar.u ? resources.getDimensionPixelSize(R.dimen.starfish2_freeway_manual_controls_panel_height) : resources.getDimensionPixelSize(R.dimen.freeway_manual_controls_panel_height);
        }
        int i = dimensionPixelSize;
        int i2 = dimensionPixelSize2;
        X(view.getId(), i, i2, i2, (!f() || e()) ? (size.getHeight() - i) / 2 : ((size.getHeight() * 3) / 5) - (i / 2));
    }

    @Override // defpackage.myd
    public final void w(View view) throws Resources.NotFoundException {
        Size size = this.k;
        if (size == null) {
            return;
        }
        int id = view.getId();
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.manual_controls_slider_area_height);
        int height = size.getHeight();
        X(id, height, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.manual_controls_panel_height) + dimensionPixelSize + resources.getDimensionPixelSize(R.dimen.manual_controls_slider_panel_offset), (!f() || e()) ? (size.getHeight() - height) / 2 : ((size.getHeight() * 3) / 5) - (height / 2));
    }

    @Override // defpackage.myd
    public final void x(int i) throws Resources.NotFoundException {
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_minibar_area_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tab_minibar_area_top_margin);
        if (f()) {
            pnq pnqVar = this.e;
            if (pnqVar.u) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.felix_portrait_minibar_area_horizontal_margin);
            } else if (pnqVar.d()) {
                dimensionPixelSize = this.a ? resources.getDimensionPixelSize(R.dimen.freeway_portrait_minibar_area_horizontal_margin) : resources.getDimensionPixelSize(R.dimen.starfish2_portrait_minibar_area_horizontal_margin);
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.starfish2_minibar_area_top_margin);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tangor_portrait_minibar_area_horizontal_margin);
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tangor_portrait_minibar_area_top_margin);
            }
        } else {
            pnq pnqVar2 = this.e;
            if (pnqVar2.d() && this.i.equals(mxm.REVERSE_LANDSCAPE)) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.felix_portrait_minibar_area_top_margin);
            } else if (pnqVar2.u) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.felix_landscape_minibar_area_vertical_margin);
            }
        }
        int i2 = dimensionPixelSize2;
        RectF rectF = new RectF();
        if (this.k != null) {
            rectF.set(dimensionPixelSize, i2, r3.getWidth() - dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.tab_minibar_area_height) + i2);
        }
        cku ckuVar = this.c;
        ckuVar.l(i, 0);
        U(i, 0, R(rectF) + dimensionPixelSize, dimensionPixelSize + S(rectF));
        ckuVar.j(i, 3, 0, 3, i2);
    }

    @Override // defpackage.myd
    public final void y(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_mode_slider_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mode_slider_height);
        if (Z()) {
            W(view.getId(), dimensionPixelSize, dimensionPixelSize2, R.id.mode_switcher, 0);
        }
    }

    @Override // defpackage.myd
    public final void z(View view) throws Resources.NotFoundException {
        int dimensionPixelSize;
        Size size = this.k;
        if (size == null) {
            return;
        }
        int id = view.getId();
        Resources resources = this.f;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_height);
        if (aa()) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = g() ? resources.getDimensionPixelSize(R.dimen.starfish2_landscape_bottom_offset) : resources.getDimensionPixelSize(R.dimen.gesture_nav_offset);
        }
        int iA = a(size.getWidth() > resources.getDimensionPixelSize(R.dimen.tangor_third_screen_threshold) ? f() ? resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_side_margins_portrait) : resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_side_margins_landscape) : 0);
        cku ckuVar = this.c;
        ckuVar.k(id, dimensionPixelSize2);
        ckuVar.l(id, 0);
        ckuVar.j(id, 4, 0, 4, dimensionPixelSize);
        U(id, 0, iA, iA);
    }

    @Override // defpackage.myd
    public final void G(View view) {
    }

    @Override // defpackage.myd
    public final void I(View view) {
    }
}
