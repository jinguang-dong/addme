package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.camera.ui.notificationchip.NotificationChipView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fjt implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fjt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        rjh rjhVar;
        int i9 = 2;
        switch (this.b) {
            case 0:
                fjz fjzVar = (fjz) this.a;
                ViewGroup.LayoutParams layoutParams = fjzVar.D.getLayoutParams();
                int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
                int width = (fjzVar.C.getWidth() - fjzVar.B.getWidth()) / 2;
                if (marginStart != width) {
                    fjz.v(fjzVar.D, width, width);
                    fjz.v(fjzVar.E, 0, width);
                    fjz.v(fjzVar.F, width, width);
                    fjzVar.F.setPadding(0, 0, width, 0);
                    fjzVar.F.requestLayout();
                    fjzVar.m();
                    if (fjzVar.J.getViewTreeObserver().isAlive()) {
                        fjzVar.J.getViewTreeObserver().removeOnScrollChangedListener(new fju(fjzVar));
                        fjzVar.J.getViewTreeObserver().addOnScrollChangedListener(new fju(fjzVar));
                    }
                    fjzVar.p();
                    break;
                }
                break;
            case 1:
                int i10 = i3 - i;
                ((fif) this.a).m.j = i10 > 0 ? view.getContext().getResources().getDimension(R.dimen.capture_preview_image_corner_radius) / i10 : 0.0f;
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((huc) this.a).f();
                break;
            case 3:
                view.removeOnLayoutChangeListener(this);
                huc hucVar = (huc) this.a;
                hucVar.c(((huw) hucVar.e.dL()).c);
                break;
            case 4:
                view.removeOnLayoutChangeListener(this);
                huc hucVar2 = (huc) this.a;
                hucVar2.c(((huw) hucVar2.e.dL()).c);
                break;
            case 5:
                Rect rect = new Rect(i, i2, i3, i4);
                irs irsVar = (irs) this.a;
                Rect rect2 = irsVar.x;
                if (!rect2.equals(rect)) {
                    rect2.set(rect);
                    if (irsVar.o.equals(mxj.PHONE_LAYOUT) && ((Activity) irsVar.g).isInMultiWindowMode() && nlj.l(irsVar.t.getContext())) {
                        irsVar.dismiss();
                        irsVar.f.f(fvv.MENU_UI_SHOWED);
                        irsVar.y = true;
                    } else if (irsVar.y) {
                        mxj mxjVar = irsVar.o;
                        mxj mxjVar2 = mxj.TABLET_LAYOUT;
                        irsVar.showAsDropDown(mxjVar.equals(mxjVar2) ? irsVar.l : irsVar.h.getDecorView(), irsVar.a(), irsVar.b(), true != irsVar.o.equals(mxjVar2) ? 5 : 0);
                        irsVar.f.e(fvv.MENU_UI_SHOWED);
                        irsVar.y = false;
                    }
                    irsVar.l();
                    break;
                }
                break;
            case 6:
                isa isaVar = (isa) this.a;
                if (isaVar.getContentView() != null && isaVar.isShowing()) {
                    Rect bounds = isaVar.c.getCurrentWindowMetrics().getBounds();
                    isaVar.update(bounds.width(), bounds.height());
                    break;
                }
                break;
            case 7:
                ((lle) this.a).g.a(Integer.valueOf(i4 - i2));
                break;
            case 8:
                mni mniVar = (mni) this.a;
                rjh rjhVar2 = mniVar.c;
                rjhVar2.getClass();
                int i11 = mniVar.f;
                if (i11 == -1) {
                    i11 = rjhVar2.getContext().getResources().getConfiguration().orientation;
                }
                mniVar.f = i11;
                if (i11 == 2) {
                    rjh rjhVar3 = mniVar.c;
                    if (rjhVar3 != null) {
                        rjhVar3.a().ar(3);
                    }
                } else {
                    NestedScrollView nestedScrollView = mniVar.h;
                    if (nestedScrollView != null && nestedScrollView.canScrollVertically(1) && (rjhVar = mniVar.c) != null) {
                        rjhVar.a().ar(4);
                    }
                }
                mnh mnhVar = mniVar.d;
                if (mnhVar != null) {
                    mnhVar.a(mniVar.f);
                    break;
                }
                break;
            case 9:
                mud mudVar = (mud) this.a;
                Layout layout = mudVar.e.getLayout();
                if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
                    mudVar.m();
                    break;
                }
                break;
            case 10:
                if (i2 != i6) {
                    view.post(new mub(this.a, i9));
                    break;
                }
                break;
            case 11:
                ((NotificationChipView) this.a).b();
                break;
            case 12:
                nbb nbbVar = (nbb) this.a;
                naz nazVarB = nbbVar.b();
                View viewFindViewById = nbbVar.getContentView().findViewById(nazVarB.e);
                mxm mxmVar = nbbVar.k;
                mxm mxmVar2 = mxm.LANDSCAPE;
                boolean z = nazVarB.f;
                View view2 = nbbVar.b;
                float fI = nbb.i(view2, z);
                float measuredWidth = view2.getMeasuredWidth();
                float f = nbbVar.o;
                float fI2 = nbb.i(viewFindViewById, z);
                float f2 = nazVarB.g;
                float translationX = z ? viewFindViewById.getTranslationX() : viewFindViewById.getTranslationY();
                int i12 = z ? nbbVar.l : nbbVar.m;
                int i13 = nbbVar.i;
                float f3 = measuredWidth / 2.0f;
                int i14 = mxmVar == mxmVar2 ? -1 : 1;
                float f4 = i13 / 2.0f;
                float f5 = fI2 + (f2 * f4);
                float f6 = fI + (i14 * (f3 + f));
                float fMin = (f6 >= f5 - translationX ? 1 : -1) * (nbbVar.j != 17 ? Math.min(Math.abs((translationX + f6) - f5), ((i12 / 2.0f) - nbbVar.h) - f4) : 0.0f);
                if (z) {
                    viewFindViewById.setTranslationX(fMin);
                } else {
                    viewFindViewById.setTranslationY(fMin);
                }
                nbbVar.getContentView().removeOnLayoutChangeListener(nbbVar.g);
                break;
            default:
                ((View) this.a).getVisibility();
                break;
        }
    }

    public fjt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
