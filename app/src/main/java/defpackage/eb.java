package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eb implements cny {
    final /* synthetic */ eo a;

    public eb(eo eoVar) {
        this.a = eoVar;
    }

    @Override // defpackage.cny
    public final cpp a(View view, cpp cppVar) {
        boolean z;
        int iD = cppVar.d();
        int iD2 = cppVar.d();
        eo eoVar = this.a;
        ActionBarContextView actionBarContextView = eoVar.o;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) eoVar.o.getLayoutParams();
            boolean z2 = false;
            if (eoVar.o.isShown()) {
                if (eoVar.G == null) {
                    eoVar.G = new Rect();
                    eoVar.H = new Rect();
                }
                Rect rect = eoVar.G;
                Rect rect2 = eoVar.H;
                rect.set(cppVar.b(), cppVar.d(), cppVar.c(), cppVar.a());
                cmh cmhVarF = cppVar.f(2);
                Insets systemWindowInsets = eoVar.t.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                cmh cmhVarB = cmh.b(Math.max(0, cmhVarF.b - rect2.left), Math.max(0, cmhVarF.c - rect2.top), Math.max(0, cmhVarF.d - rect2.right), Math.max(0, cmhVarF.e - rect2.bottom));
                int i = marginLayoutParams.leftMargin;
                int i2 = cmhVarB.b;
                if (i == i2 && marginLayoutParams.rightMargin == cmhVarB.d) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = cmhVarB.d;
                    z = true;
                }
                ActionBarContextView actionBarContextView2 = eoVar.o;
                int i3 = rect.left - i2;
                int i4 = rect.top;
                int i5 = rect.right - cmhVarB.d;
                actionBarContextView2.k = i3;
                actionBarContextView2.l = i4;
                actionBarContextView2.m = i5;
                actionBarContextView2.n();
                if (!eoVar.w && rect.top > 0) {
                    iD2 = 0;
                }
                z2 = z;
            }
            if (z2) {
                eoVar.o.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = cppVar.b();
            int iC = cppVar.c();
            int iA = cppVar.a();
            cpd cpdVar = new cpd(cppVar);
            cpdVar.c(cmh.b(iB, iD2, iC, iA));
            cppVar = cpdVar.a();
        }
        return con.c(view, cppVar);
    }
}
