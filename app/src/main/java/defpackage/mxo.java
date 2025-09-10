package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxo extends myd {
    protected final mxj a;
    protected boolean b;
    private final boolean o;
    private final boolean p;

    public mxo(mxt mxtVar, cku ckuVar, Context context, pnq pnqVar, boolean z, boolean z2) {
        super(mxtVar, ckuVar, context, pnqVar);
        this.a = mxtVar.j;
        this.p = z2;
        this.o = z;
    }

    private final mxm ab() {
        return this.o ? mxm.PORTRAIT : this.i;
    }

    @Override // defpackage.myd
    public final void A(View view) {
        int dimensionPixelSize;
        pae paeVarK = k();
        Size sizeJ = j(paeVarK.d, paeVarK.e);
        int id = view.getId();
        int width = sizeJ.getWidth();
        int iE = e();
        if (P()) {
            Resources resources = this.f;
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height) + resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
        } else {
            dimensionPixelSize = 0;
        }
        int height = (sizeJ.getHeight() + iE) - dimensionPixelSize;
        if (!aa()) {
            height = Math.max(this.f.getDimensionPixelSize(R.dimen.options_top_bar_height) + width, height);
        }
        int i = height;
        int iE2 = this.g.d() ? e() - this.f.getDimensionPixelSize(R.dimen.options_top_bar_height) : 0;
        cku ckuVar = this.c;
        ckuVar.l(id, width);
        ckuVar.k(id, i);
        mxn mxnVar = mxn.TOP;
        m(id, mxnVar, 0, mxnVar, iE2, width, i);
        l(id, width, i);
    }

    @Override // defpackage.myd
    public final void B(View view) {
        cku ckuVar = this.c;
        int id = view.getId();
        ckuVar.l(id, 0);
        ckuVar.k(id, -2);
        if (this.p) {
            ckuVar.i(id, 6, R.id.snap_panel, 7);
        } else {
            ckuVar.i(id, 6, 0, 6);
        }
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
    }

    @Override // defpackage.myd
    public final void C(View view) {
        M(view);
    }

    @Override // defpackage.myd
    public final void D(View view) {
        J(view);
    }

    @Override // defpackage.myd
    public void E(View view) {
        pae paeVarK = k();
        Size sizeJ = j(paeVarK.d, paeVarK.e);
        int id = view.getId();
        int width = sizeJ.getWidth();
        int height = sizeJ.getHeight();
        cku ckuVar = this.c;
        ckuVar.l(id, width);
        ckuVar.k(id, height);
        mxn mxnVar = mxn.TOP;
        m(id, mxnVar, 0, mxnVar, e(), width, height);
        l(id, width, height);
    }

    @Override // defpackage.myd
    public final void F() {
        Size size = this.k;
        if (size == null) {
            return;
        }
        int iC = c(size);
        int iB = b(size);
        cku ckuVar = this.c;
        ckuVar.l(R.id.rotating_gca_layout, iC);
        ckuVar.k(R.id.rotating_gca_layout, iB);
    }

    @Override // defpackage.myd
    public final void G(View view) {
        Size size = this.l;
        if (size != null && this.p) {
            X(view.getId(), c(size), b(size), 0, 0);
        }
    }

    @Override // defpackage.myd
    public void H(View view) throws Resources.NotFoundException {
        mxo mxoVar;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.supermode_switcher_height);
        int iA = a(id, dimensionPixelSize);
        if (this.b && this.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
            mxoVar = this;
            mxoVar.m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, 0, iA, dimensionPixelSize);
        } else {
            mxoVar = this;
            mxoVar.m(id, mxn.TOP, R.id.viewfinder_max_bottom, mxn.BOTTOM, Math.max(0, Math.min((mxoVar.Q() - nlj.c((Activity) mxoVar.d, view.getRootWindowInsets())) - dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.supermode_switcher_top_margin))), iA, dimensionPixelSize);
        }
        mxoVar.l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.myd
    public final void J(View view) {
        pae paeVarK = k();
        Rect rectI = i(paeVarK.d, paeVarK.e);
        View viewFindViewById = view.getRootView().findViewById(R.id.ark_values);
        int height = 0;
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0 && this.i == mxm.PORTRAIT) {
            height = viewFindViewById.getHeight() - this.f.getDimensionPixelSize(R.dimen.values_bar_offset_difference);
        }
        X(view.getId(), rectI.width(), rectI.height() - height, rectI.left, rectI.top + height);
    }

    @Override // defpackage.myd
    public final void K(View view) {
        mxm mxmVar = this.i;
        Size size = this.k;
        Size size2 = this.j;
        int id = view.getId();
        Rect rectH = h(size, size2);
        if (mxmVar.d()) {
            if (view.getRotation() != 0.0f) {
                cku ckuVar = this.c;
                ckuVar.t(id, 0.0f);
                ckuVar.u(id, 0.0f);
                ckuVar.v(id, 0.0f);
            }
            X(id, rectH.width(), rectH.height(), rectH.left, rectH.top);
            return;
        }
        if (this.l == null) {
            return;
        }
        if (this.p) {
            X(id, rectH.height(), rectH.width(), 0, 0);
            return;
        }
        cku ckuVar2 = this.c;
        ckuVar2.b(id).e.h = rectH.width() / 2.0f;
        ckuVar2.b(id).e.i = rectH.height() / 2.0f;
        ckuVar2.t(id, mxmVar.c().e);
        float fHeight = (rectH.height() - rectH.width()) / 2.0f;
        float fB = (b(r9) - c(r9)) / 2.0f;
        if (mxmVar.equals(mxm.LANDSCAPE)) {
            float f = -fHeight;
            ckuVar2.u(id, f - fB);
            ckuVar2.v(id, f);
        } else if (mxmVar.equals(mxm.REVERSE_LANDSCAPE)) {
            ckuVar2.u(id, fHeight - fB);
            ckuVar2.v(id, fHeight);
        }
        ckuVar2.l(id, rectH.height());
        ckuVar2.k(id, rectH.width());
        ckuVar2.j(id, 3, 0, 3, rectH.top);
        ckuVar2.j(id, 6, 0, 6, rectH.left);
    }

    @Override // defpackage.myd
    public final void L(int i) {
        Size size = this.l;
        if (size == null) {
            return;
        }
        if (this.p) {
            cku ckuVar = this.c;
            ckuVar.l(i, c(size));
            ckuVar.i(i, 6, R.id.snap_panel, 7);
        } else {
            cku ckuVar2 = this.c;
            ckuVar2.l(i, 0);
            ckuVar2.i(i, 6, 0, 6);
        }
        cku ckuVar3 = this.c;
        ckuVar3.i(i, 7, 0, 7);
        ckuVar3.i(i, 3, R.id.viewfinder_max_top, 4);
    }

    @Override // defpackage.myd
    public final void M(View view) {
        Size size = this.j;
        if (size == null) {
            return;
        }
        Rect rectH = h(this.l, size);
        X(view.getId(), rectH.width(), rectH.height(), rectH.left, rectH.top);
    }

    @Override // defpackage.myd
    public final void N(View view) {
        Rect rectI = i(3, 4);
        X(view.getId(), rectI.width(), rectI.height(), rectI.left, rectI.top);
    }

    @Override // defpackage.myd
    public void O(View view) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int i;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height);
        int iA = a(id, dimensionPixelSize2);
        if (this.b && this.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
            i = R.id.bottom_bar;
        } else if (Z()) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_bottom_margin) + resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_mode_slider_offset);
            i = R.id.mode_slider_ui;
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_bottom_margin);
            i = R.id.viewfinder_min_bottom;
        }
        mxn mxnVar = mxn.BOTTOM;
        m(id, mxnVar, i, mxn.TOP, dimensionPixelSize, iA, dimensionPixelSize2);
        l(id, iA, dimensionPixelSize2);
    }

    @Override // defpackage.myd
    public boolean P() {
        return true;
    }

    protected final int Q() {
        return d(9, 16, false);
    }

    protected final int a(int i, int i2) {
        cku ckuVar = this.c;
        ckuVar.k(i, i2);
        Size size = this.l;
        int iC = size == null ? 0 : c(size);
        ckuVar.l(i, iC);
        return iC;
    }

    @Override // defpackage.myd
    protected final int b(Size size) {
        return this.i.d() ? size.getHeight() : size.getWidth();
    }

    protected final int c(Size size) {
        return this.i.d() ? size.getWidth() : size.getHeight();
    }

    protected final int d(int i, int i2, boolean z) {
        Size size = this.l;
        if (size == null) {
            return 0;
        }
        int iG = g(i, i2) + j(i, i2).getHeight();
        return z ? iG : b(size) - iG;
    }

    protected final int e() {
        return g(3, 4);
    }

    protected final int f(boolean z) {
        return d(3, 4, z);
    }

    protected int g(int i, int i2) {
        if (this.l == null) {
            return 0;
        }
        float fB = b(r1) / c(this.l);
        return T(fB >= 2.2f ? this.f.getFloat(R.dimen.viewfinder_top_margin_ratio_large) : fB > 2.1f ? this.f.getFloat(R.dimen.viewfinder_top_margin_ratio_medium) : 0.0f);
    }

    @Override // defpackage.myd
    public final Rect h(Size size, Size size2) {
        Rect rectH;
        Size size3 = this.l;
        if (size2 == null || size3 == null) {
            return new Rect(0, 0, 0, 0);
        }
        if (!this.p) {
            return i(c(size2), b(size2));
        }
        Size size4 = this.k;
        if (size4 != null ? size4.getHeight() <= size4.getWidth() || aa() : !this.i.d()) {
            rectH = super.h(new Size(size3.getHeight(), size3.getWidth()), new Size(size2.getHeight(), size2.getWidth()));
        } else {
            rectH = super.h(size3, size2);
        }
        return i(rectH.width(), rectH.height());
    }

    public final Rect i(int i, int i2) {
        int width;
        int height;
        int i3;
        Size size = this.l;
        Size size2 = this.k;
        if (size2 == null || size == null) {
            return new Rect(0, 0, 0, 0);
        }
        Size sizeJ = j(i, i2);
        int iG = g(i, i2);
        if (this.g.equals(nkw.SERENGETI)) {
            iG += T(this.f.getFloat(R.dimen.serengeti_preview_container_height_proportion));
        }
        mxm mxmVarAb = ab();
        if (mxmVarAb.d()) {
            int width2 = sizeJ.getWidth();
            int height2 = sizeJ.getHeight();
            int i4 = iG;
            iG = this.p ? (size2.getWidth() - size.getWidth()) - ((size.getWidth() - width2) / 2) : (size.getWidth() - width2) / 2;
            width = height2;
            height = width2;
            i3 = i4;
        } else {
            width = sizeJ.getWidth();
            height = sizeJ.getHeight();
            int height3 = (size.getHeight() - width) / 2;
            if (mxmVarAb.equals(mxm.LANDSCAPE)) {
                i3 = height3;
            } else {
                int height4 = size2.getHeight() - size.getHeight();
                int height5 = (size.getHeight() - width) / 2;
                iG = (size2.getWidth() - height) - iG;
                i3 = height4 - height5;
            }
        }
        return new Rect(iG, i3, height + iG, width + i3);
    }

    protected final Size j(int i, int i2) {
        Size size = this.l;
        if (size == null) {
            return new Size(0, 0);
        }
        int iC = c(size);
        int iB = b(this.l);
        float f = i / i2;
        int i3 = (int) (iC / f);
        if (i3 > iB) {
            iC = (int) (iB * f);
        } else {
            iB = i3;
        }
        return new Size(iC, iB);
    }

    protected pae k() {
        return pae.c;
    }

    protected final void l(int i, int i2, int i3) {
        if (this.p) {
            mxn mxnVar = mxn.LEFT;
            mxn mxnVar2 = mxn.RIGHT;
            m(i, mxnVar, R.id.snap_panel, mxnVar2, 0, i2, i3);
            m(i, mxnVar2, 0, mxnVar2, 0, i2, i3);
            return;
        }
        mxn mxnVar3 = mxn.LEFT;
        m(i, mxnVar3, 0, mxnVar3, 0, i2, i3);
        mxn mxnVar4 = mxn.RIGHT;
        m(i, mxnVar4, 0, mxnVar4, 0, i2, i3);
    }

    protected final void m(int i, mxn mxnVar, int i2, mxn mxnVar2, int i3, int i4, int i5) {
        mxm mxmVarAb = ab();
        mxn mxnVar3 = mxn.LEFT;
        int iA = mxnVar.a(mxmVarAb);
        int iA2 = mxnVar2.a(mxmVarAb);
        int iOrdinal = mxmVarAb.ordinal();
        if (iOrdinal == 1) {
            int iOrdinal2 = mxnVar.ordinal();
            if (iOrdinal2 == 0) {
                i4 = -i5;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 == 3) {
                    i5 -= i4;
                    i3 += i5;
                }
            }
            i3 += i4;
        } else if (iOrdinal == 2) {
            int iOrdinal3 = mxnVar.ordinal();
            if (iOrdinal3 == 1) {
                i4 -= i5;
            } else if (iOrdinal3 == 2) {
                i4 = -i4;
            } else if (iOrdinal3 == 3) {
                i3 += i5;
            }
            i3 += i4;
        }
        this.c.j(i, iA, i2, iA2, i3);
    }

    @Override // defpackage.myd
    public void n() {
        int iE = e();
        cku ckuVar = this.c;
        ckuVar.r(R.id.viewfinder_max_top, iE);
        ckuVar.s(R.id.viewfinder_min_bottom, f(false));
        ckuVar.s(R.id.viewfinder_max_bottom, Q());
        Size size = this.l;
        if (this.k == null || size == null) {
            return;
        }
        this.b = (c(size) * 16) / 9 > b(size);
    }

    @Override // defpackage.myd
    public void o(View view) throws Resources.NotFoundException {
        mxo mxoVar;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bottom_bar_height);
        int iA = a(id, dimensionPixelSize);
        if (this.b && this.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
            mxoVar = this;
            mxoVar.m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_bottom_margin), iA, dimensionPixelSize);
        } else {
            mxoVar = this;
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_top_margin);
            mxn mxnVar = mxn.TOP;
            mxn mxnVar2 = mxn.BOTTOM;
            mxoVar.m(id, mxnVar, R.id.viewfinder_min_bottom, mxnVar2, dimensionPixelSize2, iA, dimensionPixelSize);
            mxoVar.m(id, mxnVar2, R.id.mode_switcher, mxnVar, 0, iA, dimensionPixelSize);
        }
        mxoVar.l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.myd
    public final void p(View view) {
        int id = view.getId();
        Size size = this.l;
        if (size == null) {
            return;
        }
        if (this.p) {
            cku ckuVar = this.c;
            ckuVar.l(id, c(size));
            ckuVar.i(id, 6, R.id.snap_panel, 7);
        } else {
            cku ckuVar2 = this.c;
            ckuVar2.l(id, 0);
            ckuVar2.i(id, 6, 0, 6);
        }
        cku ckuVar3 = this.c;
        ckuVar3.k(id, -2);
        ckuVar3.i(id, 7, 0, 7);
        ckuVar3.i(id, 4, 0, 4);
    }

    @Override // defpackage.myd
    public final void q(View view) {
        if (nlj.k(view)) {
            int id = view.getId();
            int iE = e();
            int iA = a(id, iE);
            mxn mxnVar = mxn.TOP;
            m(id, mxnVar, 0, mxnVar, 0, iA, iE);
            l(id, iA, iE);
        }
    }

    @Override // defpackage.myd
    public void r(View view) {
        Size size = this.k;
        if (size == null) {
            return;
        }
        X(view.getId(), size.getWidth(), size.getHeight(), 0, 0);
    }

    @Override // defpackage.myd
    public final void s(View view) {
        int id = view.getId();
        Size size = this.l;
        if (size == null) {
            return;
        }
        cku ckuVar = this.c;
        ckuVar.k(id, -2);
        if (this.p) {
            ckuVar.l(id, c(size));
            ckuVar.i(id, 6, R.id.snap_panel, 7);
        } else {
            ckuVar.l(id, 0);
            ckuVar.i(id, 6, 0, 6);
        }
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 3, R.id.viewfinder_max_top, 4);
    }

    @Override // defpackage.myd
    public final void t(View view) throws Resources.NotFoundException {
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_gradient_bar_height);
        int iA = a(id, dimensionPixelSize);
        m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, 0, iA, dimensionPixelSize);
        l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.myd
    public final void u(int i) {
        V(i, R.id.minibar_area, 0, 0);
        this.c.i(i, 7, R.id.minibar_area, 7);
    }

    @Override // defpackage.myd
    public void v(View view) {
        Size size = this.l;
        if (size == null) {
            return;
        }
        int id = view.getId();
        cku ckuVar = this.c;
        ckuVar.k(id, 0);
        if (this.p) {
            ckuVar.l(id, c(size));
            ckuVar.i(id, 6, R.id.snap_panel, 7);
        } else {
            ckuVar.l(id, 0);
            ckuVar.i(id, 6, 0, 6);
        }
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
        ckuVar.i(id, 3, R.id.mode_switcher, 3);
    }

    @Override // defpackage.myd
    public final void w(View view) throws Resources.NotFoundException {
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.manual_controls_slider_area_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.manual_controls_slider_zoom_offset);
        int iA = a(id, dimensionPixelSize);
        mxn mxnVar = mxn.BOTTOM;
        m(id, mxnVar, R.id.zoom_slider_area, mxnVar, dimensionPixelSize2, iA, dimensionPixelSize);
        l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.myd
    public void x(int i) throws Resources.NotFoundException {
        Size size = this.l;
        if (size == null) {
            return;
        }
        Resources resources = this.f;
        boolean z = this.p;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.minibar_area_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.minibar_area_vertical_margin);
        if (!z) {
            cku ckuVar = this.c;
            ckuVar.l(i, 0);
            U(i, 0, dimensionPixelSize, dimensionPixelSize);
            ckuVar.j(i, 4, R.id.viewfinder_max_top, 3, 0);
            return;
        }
        int dimensionPixelSize3 = this.d.getDisplay().getCutout() != null ? resources.getDimensionPixelSize(R.dimen.minibar_area_end_margin) : 0;
        int iC = c(size) - dimensionPixelSize;
        cku ckuVar2 = this.c;
        ckuVar2.l(i, iC - dimensionPixelSize3);
        ckuVar2.j(i, 7, 0, 7, dimensionPixelSize3);
        ckuVar2.j(i, 3, R.id.viewfinder_max_top, 3, dimensionPixelSize2);
    }

    @Override // defpackage.myd
    public void y(View view) throws Resources.NotFoundException {
        if (Z()) {
            int id = view.getId();
            Resources resources = this.f;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mode_slider_height);
            int iA = a(id, dimensionPixelSize);
            m(id, mxn.BOTTOM, R.id.bottom_bar, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_mode_slider_bottom_margin), iA, dimensionPixelSize);
            l(id, iA, dimensionPixelSize);
        }
    }

    @Override // defpackage.myd
    public void z(View view) throws Resources.NotFoundException {
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_mode_switcher_height);
        int iA = a(id, dimensionPixelSize);
        m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_mode_switcher_bottom_margin), iA, dimensionPixelSize);
        l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.myd
    public final void I(View view) {
    }
}
