package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingtoolbar.FloatingToolbarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rkv implements cny {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rkv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cny
    public final cpp a(View view, cpp cppVar) {
        int i = this.b;
        if (i == 0) {
            FloatingToolbarLayout floatingToolbarLayout = (FloatingToolbarLayout) this.a;
            if (!floatingToolbarLayout.a && !floatingToolbarLayout.c && !floatingToolbarLayout.b && !floatingToolbarLayout.d) {
                return cppVar;
            }
            cmh cmhVarF = cppVar.f(655);
            floatingToolbarLayout.e = cmhVarF.e;
            floatingToolbarLayout.f = cmhVarF.c;
            floatingToolbarLayout.h = cmhVarF.d;
            floatingToolbarLayout.g = cmhVarF.b;
            floatingToolbarLayout.a();
            return cppVar;
        }
        if (i == 1) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.a;
            cpp cppVar2 = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : cppVar;
            if (!Objects.equals(collapsingToolbarLayout.f, cppVar2)) {
                collapsingToolbarLayout.f = cppVar2;
                collapsingToolbarLayout.requestLayout();
            }
            return cppVar.l();
        }
        int iA = cppVar.a();
        row rowVar = (row) this.a;
        rowVar.l = iA;
        rowVar.m = cppVar.b();
        rowVar.n = cppVar.c();
        rowVar.h();
        return cppVar;
    }
}
