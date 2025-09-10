package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxr extends myd {
    public mxr(mxt mxtVar, cku ckuVar, Context context, pnq pnqVar) {
        super(mxtVar, ckuVar, context, pnqVar);
    }

    private final Size a() {
        Size size = this.k;
        return size == null ? new Size(0, 0) : new Size(size.getWidth(), size.getHeight() / 2);
    }

    @Override // defpackage.myd
    public final void A(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jarvis_options_container_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jarvis_options_container_top_margin);
        Y(view.getId(), dimensionPixelSize, dimensionPixelSize, a().getHeight() + dimensionPixelSize2, dimensionPixelSize2);
        view.bringToFront();
    }

    @Override // defpackage.myd
    public final void B(View view) {
        cku ckuVar = this.c;
        int id = view.getId();
        ckuVar.l(id, 0);
        ckuVar.k(id, -2);
        ckuVar.i(id, 6, 0, 6);
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
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
        if (this.k == null || this.j == null) {
            return;
        }
        Size sizeA = a();
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jarvis_preview_widgets_side_margins);
        X(view.getId(), sizeA.getWidth() - (dimensionPixelSize + dimensionPixelSize), sizeA.getHeight(), dimensionPixelSize, sizeA.getHeight() - resources.getDimensionPixelOffset(R.dimen.jarvis_preview_widgets_top_margin_offset));
    }

    @Override // defpackage.myd
    public final void F() {
        cku ckuVar = this.c;
        ckuVar.l(R.id.rotating_gca_layout, 0);
        ckuVar.k(R.id.rotating_gca_layout, 0);
    }

    @Override // defpackage.myd
    public final void H(View view) throws Resources.NotFoundException {
        if (this.m) {
            int id = view.getId();
            Resources resources = this.f;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.supermode_switcher_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jarvis_supermode_switcher_left_margin_portrait);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.gesture_nav_offset);
            RectF rectF = new RectF();
            if (this.k != null) {
                rectF.set(resources.getDimensionPixelSize(R.dimen.options_entry_button_left_margin) + dimensionPixelSize2, (r3.getHeight() - dimensionPixelSize) - resources.getDimensionPixelSize(R.dimen.gesture_nav_offset), (r3.getWidth() - dimensionPixelSize2) - resources.getDimensionPixelSize(R.dimen.supermode_switcher_internal_horizontal_margin), r3.getHeight() - dimensionPixelSize3);
            }
            cku ckuVar = this.c;
            ckuVar.k(id, dimensionPixelSize);
            ckuVar.l(id, 0);
            ckuVar.j(id, 4, 0, 4, dimensionPixelSize3);
            U(id, 0, R(rectF) + dimensionPixelSize2, dimensionPixelSize2 + S(rectF));
        }
    }

    @Override // defpackage.myd
    public final void I(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        W(view.getId(), resources.getDimensionPixelSize(R.dimen.timer_widget_width), resources.getDimensionPixelSize(R.dimen.timer_widget_height), R.id.zoom_slider_area, resources.getDimensionPixelSize(R.dimen.timer_widget_zoom_ui_offset));
    }

    @Override // defpackage.myd
    public final void J(View view) {
        Size size;
        Size size2 = this.k;
        if (size2 == null || (size = this.j) == null) {
            return;
        }
        View viewFindViewById = view.getRootView().findViewById(R.id.ark_values);
        int height = 0;
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            height = viewFindViewById.getHeight() - this.f.getDimensionPixelSize(R.dimen.values_bar_offset_tabletop);
        }
        Rect rectH = h(size2, size);
        X(view.getId(), rectH.width(), rectH.height() - height, rectH.left, rectH.top + height);
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
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_zoom_ui_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.starfish_zoom_ui_bottom_bar_offset);
        if (Z()) {
            dimensionPixelSize3 += resources.getDimensionPixelSize(R.dimen.mode_slider_offset);
        }
        W(view.getId(), dimensionPixelSize, dimensionPixelSize2, R.id.bottom_bar, dimensionPixelSize3);
    }

    @Override // defpackage.myd
    public final boolean P() {
        return false;
    }

    @Override // defpackage.myd
    public final Rect h(Size size, Size size2) {
        if (size == null || size2 == null) {
            return new Rect();
        }
        Rect rectH = super.h(a(), size2);
        if (rectH.top != 0) {
            rectH.bottom -= rectH.top;
            rectH.top = 0;
        }
        return rectH;
    }

    @Override // defpackage.myd
    public final void o(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        W(view.getId(), resources.getDimensionPixelSize(R.dimen.starfish_bottom_bar_width), resources.getDimensionPixelSize(R.dimen.bottom_bar_height), R.id.mode_switcher, resources.getDimensionPixelSize(R.dimen.jarvis_bottom_bar_mode_switcher_offset));
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
        cku ckuVar = this.c;
        int id = view.getId();
        ckuVar.l(id, 0);
        ckuVar.k(id, -2);
        ckuVar.i(id, 6, 0, 6);
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 3, R.id.viewfinder_max_bottom, 4);
    }

    @Override // defpackage.myd
    public final void t(View view) throws Resources.NotFoundException {
        z(view);
    }

    @Override // defpackage.myd
    public final void u(int i) throws Resources.NotFoundException {
        Resources resources = this.f;
        cku ckuVar = this.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jarvis_help_ui_zoom_offset);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jarvis_help_ui_right_margin);
        ckuVar.j(i, 4, R.id.zoom_slider_area, 4, dimensionPixelSize);
        ckuVar.j(i, 7, 0, 7, dimensionPixelSize2);
    }

    @Override // defpackage.myd
    public final void v(View view) {
        cku ckuVar = this.c;
        int id = view.getId();
        ckuVar.k(id, 0);
        ckuVar.l(id, 0);
        ckuVar.i(id, 6, 0, 6);
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
        ckuVar.i(id, 3, R.id.mode_switcher, 3);
    }

    @Override // defpackage.myd
    public final void w(View view) throws Resources.NotFoundException {
        cku ckuVar = this.c;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.manual_controls_slider_area_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.manual_controls_slider_zoom_offset);
        ckuVar.k(id, dimensionPixelSize);
        ckuVar.l(id, 0);
        ckuVar.j(id, 4, R.id.zoom_slider_area, 4, dimensionPixelSize2);
        U(id, 0, 0, 0);
    }

    @Override // defpackage.myd
    public final void x(int i) throws Resources.NotFoundException {
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_minibar_area_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tab_minibar_area_top_margin);
        RectF rectF = new RectF();
        if (this.k != null) {
            rectF.set(dimensionPixelSize, dimensionPixelSize2, r3.getWidth() - dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.tab_minibar_area_height) + dimensionPixelSize2);
        }
        cku ckuVar = this.c;
        ckuVar.l(i, 0);
        U(i, 0, R(rectF) + dimensionPixelSize, dimensionPixelSize + S(rectF));
        ckuVar.j(i, 3, 0, 3, dimensionPixelSize2);
    }

    @Override // defpackage.myd
    public final void y(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.tab_mode_slider_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mode_slider_height);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.starfish_mode_slider_bottom_bar_offset);
        if (Z()) {
            W(view.getId(), dimensionPixelSize, dimensionPixelSize2, R.id.bottom_bar, dimensionPixelSize3);
        }
    }

    @Override // defpackage.myd
    public final void z(View view) throws Resources.NotFoundException {
        if (this.k == null) {
            return;
        }
        int id = view.getId();
        Resources resources = this.f;
        cku ckuVar = this.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jarvis_mode_switcher_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.tab_mode_switcher_side_margins_landscape);
        ckuVar.k(id, dimensionPixelSize);
        ckuVar.l(id, 0);
        U(id, 0, dimensionPixelSize2, dimensionPixelSize2);
        if (this.m) {
            ckuVar.j(id, 4, R.id.supermode_switcher_frame, 3, resources.getDimensionPixelSize(R.dimen.starfish_mode_switcher_supermode_switcher_offset));
        } else {
            ckuVar.j(id, 4, 0, 4, resources.getDimensionPixelSize(R.dimen.gesture_nav_offset));
        }
    }

    @Override // defpackage.myd
    public final void G(View view) {
    }
}
