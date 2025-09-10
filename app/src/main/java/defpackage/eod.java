package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eod implements cny {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eod(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cny
    public final cpp a(View view, cpp cppVar) {
        int i = this.b;
        if (i == 0) {
            cmh cmhVarF = cppVar.f(655);
            view.setPadding(cmhVarF.b, ((nh) this.a).getWindow().getDecorView().getRootWindowInsets().getInsets(1).top, cmhVarF.d, cmhVarF.e);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
            return cpp.a;
        }
        if (i == 1) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, cppVar)) {
                coordinatorLayout.e = cppVar;
                boolean z = cppVar.d() > 0;
                coordinatorLayout.f = z;
                coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                if (!cppVar.r()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        int[] iArr = con.a;
                        if (childAt.getFitsSystemWindows() && ((clf) childAt.getLayoutParams()).a != null && cppVar.r()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
        } else {
            if (i != 2) {
                rjh rjhVar = (rjh) this.a;
                rjg rjgVar = rjhVar.g;
                if (rjgVar != null) {
                    rjhVar.a.D.remove(rjgVar);
                }
                rjhVar.g = new rjg(rjhVar.b, cppVar);
                rjhVar.g.d(rjhVar.getWindow());
                rjhVar.a.ak(rjhVar.g);
                return cppVar;
            }
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            cpp cppVar2 = true != appBarLayout.getFitsSystemWindows() ? null : cppVar;
            if (!Objects.equals(appBarLayout.c, cppVar2)) {
                appBarLayout.c = cppVar2;
                appBarLayout.k();
                appBarLayout.requestLayout();
                return cppVar;
            }
        }
        return cppVar;
    }

    public /* synthetic */ eod(nh nhVar, int i) {
        this.b = i;
        this.a = nhVar;
    }
}
