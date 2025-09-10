package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkc extends du {
    private final Drawable b;
    private final Rect c;

    /* JADX WARN: Illegal instructions before constructor call */
    public rkc(Context context, int i) {
        int iV = v(context);
        Context contextA = rqb.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(iV != 0 ? new on(contextA, iV) : contextA, i == 0 ? v(context) : i);
        Context contextA2 = a();
        Resources.Theme theme = contextA2.getTheme();
        int[] iArr = rkd.a;
        TypedArray typedArrayA = rlg.a(contextA2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, contextA2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = contextA2.getResources().getConfiguration().getLayoutDirection();
        this.c = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iS = qpt.S(contextA2, rnt.h(contextA2, R.attr.colorSurface, getClass().getCanonicalName()));
        TypedArray typedArrayObtainStyledAttributes = contextA2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes.getColor(4, iS);
        typedArrayObtainStyledAttributes.recycle();
        rnx rnxVar = new rnx(contextA2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        rnxVar.j(contextA2);
        rnxVar.n(ColorStateList.valueOf(color));
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
        float dimension = typedValue.getDimension(a().getResources().getDisplayMetrics());
        if (typedValue.type == 5 && dimension >= 0.0f) {
            rnxVar.m(rnxVar.a.a.e(dimension));
        }
        this.b = rnxVar;
    }

    private static int v(Context context) {
        TypedValue typedValueG = rnt.g(context, R.attr.materialAlertDialogTheme);
        if (typedValueG == null) {
            return 0;
        }
        return typedValueG.data;
    }

    @Override // defpackage.du
    public final dv b() {
        dv dvVarB = super.b();
        Window window = dvVarB.getWindow();
        View decorView = window.getDecorView();
        float elevation = decorView.getElevation();
        Drawable drawable = this.b;
        ((rnx) drawable).l(elevation);
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new rkb(dvVarB, rect));
        return dvVarB;
    }

    public final void k(boolean z) {
        this.a.k = z;
    }

    public final void l(int i) {
        dq dqVar = this.a;
        dqVar.f = dqVar.a.getText(i);
    }

    public final void m(CharSequence charSequence) {
        super.h(charSequence);
    }

    public final void n(int i, DialogInterface.OnClickListener onClickListener) {
        dq dqVar = this.a;
        dqVar.i = dqVar.a.getText(i);
        dqVar.j = onClickListener;
    }

    public final void o(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.i(charSequence, onClickListener);
    }

    public final void p(DialogInterface.OnKeyListener onKeyListener) {
        super.e(onKeyListener);
    }

    public final void q(int i, DialogInterface.OnClickListener onClickListener) {
        dq dqVar = this.a;
        dqVar.g = dqVar.a.getText(i);
        dqVar.h = onClickListener;
    }

    public final void r(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.j(charSequence, onClickListener);
    }

    public final void s(int i) {
        dq dqVar = this.a;
        dqVar.d = dqVar.a.getText(i);
    }

    public final void t(CharSequence charSequence) {
        super.f(charSequence);
    }

    public final void u(View view) {
        super.g(view);
    }
}
