package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Size;
import android.view.View;
import android.view.WindowInsets;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxp extends mxo {
    private int o;

    public mxp(mxt mxtVar, cku ckuVar, Context context, pnq pnqVar, boolean z) {
        super(mxtVar, ckuVar, context, pnqVar, z, false);
        this.o = 9;
        Size size = this.l;
        if (size == null) {
            return;
        }
        Activity activity = (Activity) context;
        if (activity.isInMultiWindowMode() && this.i.equals(mxm.PORTRAIT)) {
            View decorView = activity.getWindow().getDecorView();
            int iMax = Math.max(decorView.getHeight(), decorView.getWidth());
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            int i = (iMax - rootWindowInsets.getInsets(WindowInsets.Type.statusBars()).top) - rootWindowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
            if (size.getHeight() > i) {
                this.l = new Size(size.getWidth(), i);
            }
        }
    }

    private final int ab(int i, int i2, int i3) {
        int iB;
        int height;
        Size size = this.l;
        if (size == null || (iB = b(size)) == (height = j(i, i2).getHeight())) {
            return 0;
        }
        return (iB - height) - i3;
    }

    private final boolean ac(int i, int i2) {
        Size size;
        return i > i2 && (size = this.j) != null && i == c(size) && i2 == b(size);
    }

    private static final boolean ad(int i, int i2) {
        return i * 16 == i2 * 9;
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void E(View view) throws Resources.NotFoundException {
        if (!this.e.u) {
            super.E(view);
            return;
        }
        pae paeVarK = k();
        Size sizeJ = j(paeVarK.d, paeVarK.e);
        Resources resources = this.f;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.felix_preview_widgets_height);
        int dimensionPixelOffset2 = 0;
        int iE = aa() ? 0 : e();
        if (aa()) {
            int i = this.o;
            if (i == 0) {
                throw null;
            }
            if (i == 4) {
                dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.felix_preview_widgets_side_margin);
            }
        }
        int width = sizeJ.getWidth() - (dimensionPixelOffset2 + dimensionPixelOffset2);
        int id = view.getId();
        cku ckuVar = this.c;
        ckuVar.l(id, width);
        ckuVar.k(id, dimensionPixelOffset);
        mxn mxnVar = mxn.TOP;
        m(id, mxnVar, 0, mxnVar, iE, width, dimensionPixelOffset);
        l(id, width, dimensionPixelOffset);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void H(View view) throws Resources.NotFoundException {
        mxp mxpVar;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.supermode_switcher_height);
        int iA = a(id, dimensionPixelSize);
        if (this.e.u) {
            if (aa()) {
                int i = this.o;
                if (i == 0) {
                    throw null;
                }
                if (i != 2) {
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.felix_mw_supermode_switcher_bottom_margin);
                    mxn mxnVar = mxn.BOTTOM;
                    m(id, mxnVar, 0, mxnVar, dimensionPixelSize2, iA, dimensionPixelSize);
                }
            }
            mxpVar = this;
            mxn mxnVar2 = mxn.TOP;
            mxn mxnVar3 = mxn.BOTTOM;
            mxpVar.m(id, mxnVar2, R.id.mode_switcher, mxnVar3, 0, iA, dimensionPixelSize);
            mxpVar.m(id, mxnVar3, R.id.viewfinder_max_bottom, mxnVar2, 0, iA, dimensionPixelSize);
            this = mxpVar;
        } else {
            mxpVar = this;
            if (mxpVar.b && mxpVar.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
                mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, 0, iA, dimensionPixelSize);
            } else {
                int iMax = Math.max(0, Math.min((mxpVar.Q() - nlj.c((Activity) mxpVar.d, view.getRootWindowInsets())) - dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.supermode_switcher_top_margin)));
                int i2 = mxpVar.o;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    this = mxpVar;
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.autobahn_mode_switcher_bottom_margin);
                    cku ckuVar = this.c;
                    ckuVar.k(id, dimensionPixelSize);
                    ckuVar.l(id, 0);
                    ckuVar.j(id, 4, 0, 4, dimensionPixelSize3);
                } else if (i3 == 1) {
                    mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_mw_two_third_mode_switcher_bottom_margin), iA, dimensionPixelSize);
                } else if (i3 == 3) {
                    this = mxpVar;
                    mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_min_bottom, mxn.TOP, iMax, iA, dimensionPixelSize);
                } else if (i3 == 4) {
                    this = mxpVar;
                    int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.autobahn_mw_mode_switcher_bottom_margin);
                    cku ckuVar2 = this.c;
                    ckuVar2.k(id, dimensionPixelSize);
                    ckuVar2.l(id, 0);
                    ckuVar2.j(id, 4, 0, 4, dimensionPixelSize4);
                } else if (i3 == 5) {
                    this = mxpVar;
                    this.m(id, mxn.TOP, R.id.viewfinder_max_bottom, mxn.BOTTOM, iMax, iA, dimensionPixelSize);
                } else if (i3 != 6) {
                    if (i3 != 8) {
                        mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_max_bottom, mxn.TOP, 0, iA, dimensionPixelSize);
                    }
                    this = mxpVar;
                    this.m(id, mxn.TOP, R.id.viewfinder_max_bottom, mxn.BOTTOM, iMax, iA, dimensionPixelSize);
                } else {
                    this = mxpVar;
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.autobahn_mw_landscape_super_mode_switcher_bottom_margin);
                    cku ckuVar3 = this.c;
                    ckuVar3.k(id, dimensionPixelSize);
                    ckuVar3.l(id, 0);
                    ckuVar3.j(id, 4, 0, 4, dimensionPixelSize5);
                }
            }
            this = mxpVar;
        }
        this.l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void O(View view) throws Resources.NotFoundException {
        mxp mxpVar;
        int i;
        int i2;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.zoom_ui_container_height);
        int iA = a(id, dimensionPixelSize4);
        boolean z = this.b;
        int i3 = R.id.bottom_bar;
        if (z && this.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
        } else {
            if (!Z()) {
                int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_bottom_margin);
                int i4 = this.o;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 != 0) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 6 && i5 != 7) {
                                if (this.e.u) {
                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
                                } else {
                                    mxpVar = this;
                                    i = dimensionPixelSize5;
                                    i2 = R.id.viewfinder_min_bottom;
                                }
                            }
                        } else if (this.e.u) {
                            m(id, mxn.TOP, R.id.viewfinder_min_bottom, mxn.BOTTOM, resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_landscape_third_top_margin), iA, dimensionPixelSize4);
                            return;
                        } else {
                            mxpVar = this;
                            i = dimensionPixelSize5;
                            i2 = R.id.viewfinder_max_bottom;
                        }
                    }
                    mxpVar = this;
                    int dimensionPixelSize6 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
                    i2 = R.id.bottom_bar;
                    i = dimensionPixelSize6;
                } else {
                    mxpVar = this;
                    if (mxpVar.e.u) {
                        dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_mode_slider_offset) + resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
                        i = dimensionPixelSize5;
                        i2 = R.id.viewfinder_min_bottom;
                    }
                    i = dimensionPixelSize5;
                    i2 = R.id.viewfinder_max_bottom;
                }
                mxpVar.m(id, mxn.BOTTOM, i2, mxn.TOP, i, iA, dimensionPixelSize4);
                mxpVar.l(id, iA, dimensionPixelSize4);
            }
            boolean z2 = this.e.u;
            i3 = R.id.mode_slider_ui;
            if (z2) {
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_bottom_margin);
                dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_zoom_ui_mode_slider_offset);
            } else {
                dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_bottom_margin);
                dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.autobahn_zoom_ui_mode_slider_offset);
            }
            dimensionPixelSize = dimensionPixelSize2 + dimensionPixelSize3;
        }
        i = dimensionPixelSize;
        i2 = i3;
        mxpVar = this;
        mxpVar.m(id, mxn.BOTTOM, i2, mxn.TOP, i, iA, dimensionPixelSize4);
        mxpVar.l(id, iA, dimensionPixelSize4);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final boolean P() {
        if (this.e.u) {
            int i = this.o;
            if (i != 0) {
                return i != 5;
            }
            throw null;
        }
        Size size = this.j;
        if (size == null) {
            return true;
        }
        int i2 = this.o;
        if (i2 != 0) {
            return ((i2 == 5 || i2 == 1) && pae.h(size).equals(pae.c)) ? false : true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    @Override // defpackage.mxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int g(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxp.g(int, int):int");
    }

    @Override // defpackage.mxo
    protected final pae k() throws Resources.NotFoundException {
        int dimensionPixelSize;
        Size size = this.l;
        if (size == null || !this.e.u) {
            return pae.c;
        }
        int i = this.o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.felix_uncovered_preview_portrait_third_bottom_margin);
                break;
            case 1:
                dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.felix_uncovered_preview_portrait_half_bottom_margin);
                break;
            case 2:
            case 3:
            case 6:
            case 7:
                dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.felix_uncovered_preview_two_thirds_bottom_margin);
                break;
            case 4:
            default:
                dimensionPixelSize = 0;
                break;
            case 5:
            case 8:
                dimensionPixelSize = this.f.getDimensionPixelSize(R.dimen.felix_uncovered_preview_bottom_margin);
                break;
        }
        return pae.j(c(size), ((f(true) - dimensionPixelSize) - (Z() ? this.f.getDimensionPixelSize(R.dimen.mode_slider_height) : 0)) - e());
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void n() {
        Size size = this.l;
        int i = 9;
        if (size != null && aa() && !this.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
            Context context = this.d;
            if (Math.min(size.getWidth(), size.getHeight()) < context.getResources().getDimensionPixelSize(R.dimen.felix_third_screen_threshold)) {
                i = true != this.i.d() ? 5 : 1;
            } else {
                int iMin = Math.min(size.getWidth(), size.getHeight());
                i = (iMin <= context.getResources().getDimensionPixelSize(R.dimen.two_thirds_small_screen_threshold) || iMin >= context.getResources().getDimensionPixelSize(R.dimen.felix_two_thirds_screen_threshold)) ? Math.min(size.getWidth(), size.getHeight()) > context.getResources().getDimensionPixelSize(R.dimen.felix_two_thirds_screen_threshold) ? true != this.i.d() ? 8 : 4 : true != this.i.d() ? 6 : 2 : true != this.i.d() ? 7 : 3;
            }
        }
        this.o = i;
        super.n();
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void o(View view) throws Resources.NotFoundException {
        mxp mxpVar;
        int i;
        int i2;
        Resources resources = this.f;
        int id = view.getId();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bottom_bar_height);
        int iA = a(id, dimensionPixelSize);
        int i3 = this.o;
        if (i3 == 0) {
            throw null;
        }
        if (i3 == 1) {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_top_margin);
            if (this.e.u) {
                mxn mxnVar = mxn.TOP;
                mxn mxnVar2 = mxn.BOTTOM;
                mxpVar = this;
                mxpVar.m(id, mxnVar, R.id.viewfinder_min_bottom, mxnVar2, dimensionPixelSize2, iA, dimensionPixelSize);
                mxpVar.m(id, mxnVar2, R.id.viewfinder_max_bottom, mxnVar, 0, iA, dimensionPixelSize);
            } else {
                mxpVar = this;
                mxpVar.m(id, mxn.TOP, R.id.viewfinder_max_bottom, mxn.BOTTOM, resources.getDimensionPixelSize(R.dimen.autobahn_mw_bottom_bar_bottom_margin), iA, dimensionPixelSize);
            }
        } else if (i3 == 5) {
            int dimensionPixelSize3 = this.e.u ? resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_top_margin) : resources.getDimensionPixelSize(R.dimen.starfish2_bottom_bar_top_margin);
            mxn mxnVar3 = mxn.TOP;
            mxn mxnVar4 = mxn.BOTTOM;
            mxpVar = this;
            mxpVar.m(id, mxnVar3, R.id.viewfinder_max_bottom, mxnVar4, dimensionPixelSize3, iA, dimensionPixelSize);
            mxpVar.m(id, mxnVar4, R.id.mode_switcher, mxnVar3, 0, iA, dimensionPixelSize);
        } else if (i3 == 6) {
            if (this.e.u) {
                mxpVar = this;
                mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_min_bottom, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin), iA, dimensionPixelSize);
            } else {
                mxpVar = this;
                int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_top_margin);
                mxn mxnVar5 = mxn.TOP;
                mxn mxnVar6 = mxn.BOTTOM;
                mxpVar.m(id, mxnVar5, R.id.viewfinder_min_bottom, mxnVar6, dimensionPixelSize4, iA, dimensionPixelSize);
                mxpVar.m(id, mxnVar6, R.id.mode_switcher, mxnVar5, 0, iA, dimensionPixelSize);
            }
        } else if (i3 == 4 && this.e.d()) {
            mxpVar = this;
            mxpVar.m(id, mxn.BOTTOM, R.id.mode_switcher, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_bottom_margin), iA, dimensionPixelSize);
        } else {
            int i4 = this.o;
            if (i4 == 0) {
                throw null;
            }
            if ((i4 == 8 || i4 == 7) && this.e.d()) {
                mxpVar = this;
                mxpVar.m(id, mxn.BOTTOM, R.id.viewfinder_min_bottom, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin), iA, dimensionPixelSize);
            } else {
                mxpVar = this;
                boolean z = mxpVar.e.u;
                int i5 = R.id.viewfinder_max_bottom;
                if (!z) {
                    int dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin);
                    if (mxpVar.b && mxpVar.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
                        i = R.id.viewfinder_max_bottom;
                    } else {
                        mxpVar.m(id, mxn.TOP, R.id.viewfinder_min_bottom, mxn.BOTTOM, resources.getDimensionPixelSize(R.dimen.autobahn_bottom_bar_top_margin), iA, dimensionPixelSize);
                        dimensionPixelSize5 = 0;
                        i = R.id.mode_switcher;
                    }
                    mxpVar.m(id, mxn.BOTTOM, i, mxn.TOP, dimensionPixelSize5, iA, dimensionPixelSize);
                } else if (mxpVar.b && mxpVar.a.equals(mxj.SIMPLIFIED_LAYOUT)) {
                    i2 = i5;
                    mxpVar.m(id, mxn.BOTTOM, i2, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin), iA, dimensionPixelSize);
                } else if (mxpVar.aa()) {
                    i2 = R.id.mode_switcher;
                    mxpVar.m(id, mxn.BOTTOM, i2, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin), iA, dimensionPixelSize);
                } else {
                    i5 = R.id.viewfinder_min_bottom;
                    i2 = i5;
                    mxpVar.m(id, mxn.BOTTOM, i2, mxn.TOP, resources.getDimensionPixelSize(R.dimen.autobahn_felix_bottom_bar_bottom_margin), iA, dimensionPixelSize);
                }
            }
        }
        mxpVar.l(id, iA, dimensionPixelSize);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void r(View view) {
        Size size = this.l;
        if (size == null) {
            return;
        }
        X(view.getId(), size.getWidth(), size.getHeight(), 0, 0);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void v(View view) {
        if (this.e.u) {
            super.v(view);
            return;
        }
        int id = view.getId();
        cku ckuVar = this.c;
        ckuVar.k(id, 0);
        ckuVar.l(id, 0);
        ckuVar.i(id, 6, 0, 6);
        ckuVar.i(id, 7, 0, 7);
        ckuVar.i(id, 4, 0, 4);
        int i = this.o;
        if (i == 0) {
            throw null;
        }
        if (i == 1 || i == 4) {
            ckuVar.j(id, 3, R.id.mode_switcher, 3, this.f.getDimensionPixelSize(R.dimen.mw_manual_controls_slider_panel_offset));
        } else {
            ckuVar.i(id, 3, R.id.mode_switcher, 3);
        }
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void x(int i) throws Resources.NotFoundException {
        Resources resources = this.f;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.minibar_area_horizontal_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.minibar_area_vertical_margin);
        if (this.e.u) {
            int i2 = this.o;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 != 0 && i3 != 1 && i3 != 3) {
                super.x(i);
                return;
            }
            cku ckuVar = this.c;
            ckuVar.l(i, 0);
            U(i, 0, dimensionPixelSize, dimensionPixelSize);
            ckuVar.j(i, 3, R.id.viewfinder_max_top, 3, dimensionPixelSize2);
            return;
        }
        int i4 = this.o;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 != 0) {
            if (i5 != 1 && i5 != 3) {
                if (i5 == 4) {
                    cku ckuVar2 = this.c;
                    ckuVar2.l(i, 0);
                    U(i, 0, dimensionPixelSize, dimensionPixelSize);
                    ckuVar2.j(i, 4, R.id.viewfinder_max_top, 3, dimensionPixelSize2);
                    return;
                }
                if (i5 != 6) {
                    if (i5 != 7) {
                        cku ckuVar3 = this.c;
                        ckuVar3.l(i, 0);
                        U(i, 0, dimensionPixelSize, dimensionPixelSize);
                        ckuVar3.j(i, 4, R.id.viewfinder_max_top, 3, 0);
                        return;
                    }
                }
            }
            cku ckuVar4 = this.c;
            ckuVar4.l(i, 0);
            U(i, 0, dimensionPixelSize, dimensionPixelSize);
            ckuVar4.j(i, 3, R.id.viewfinder_max_top, 4, dimensionPixelSize2);
            return;
        }
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.minibar_area_wm_horizontal_margin);
        cku ckuVar5 = this.c;
        ckuVar5.l(i, 0);
        U(i, 0, dimensionPixelSize3, dimensionPixelSize3);
        ckuVar5.j(i, 4, R.id.viewfinder_max_top, 3, dimensionPixelSize2);
    }

    @Override // defpackage.mxo, defpackage.myd
    public final void y(View view) throws Resources.NotFoundException {
        int i;
        if (Z()) {
            int id = view.getId();
            Resources resources = this.f;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mode_slider_height);
            int iA = a(id, dimensionPixelSize);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_mode_slider_bottom_margin);
            int i2 = this.o;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = R.id.viewfinder_min_bottom;
            if (i3 == 0) {
                if (this.e.u) {
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_mode_slider_bottom_margin);
                    i = dimensionPixelSize2;
                    i4 = R.id.bottom_bar;
                }
                i = dimensionPixelSize2;
            } else if (i3 != 4) {
                if (this.e.u) {
                    dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.autobahn_felix_mode_slider_bottom_margin);
                }
                i = dimensionPixelSize2;
                i4 = R.id.bottom_bar;
            } else {
                if (this.e.u) {
                    i4 = R.id.viewfinder_max_bottom;
                    dimensionPixelSize2 = 0;
                }
                i = dimensionPixelSize2;
            }
            m(id, mxn.BOTTOM, i4, mxn.TOP, i, iA, dimensionPixelSize);
            l(id, iA, dimensionPixelSize);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    @Override // defpackage.mxo, defpackage.myd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.view.View r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxp.z(android.view.View):void");
    }
}
