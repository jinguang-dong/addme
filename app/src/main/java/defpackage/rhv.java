package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhv extends cnn {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public rhv(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        cptVar.m(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() == 0) {
            return;
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View viewAp = AppBarLayout.BaseBehavior.ap(this.b);
        if (viewAp != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((rhx) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (baseBehavior.c() != (-appBarLayout.f())) {
                        cptVar.h(cps.m);
                        cptVar.x(true);
                    }
                    if (baseBehavior.c() != 0) {
                        if (!viewAp.canScrollVertically(-1)) {
                            cptVar.h(cps.n);
                            cptVar.x(true);
                            return;
                        } else {
                            if ((-appBarLayout.b()) != 0) {
                                cptVar.h(cps.n);
                                cptVar.x(true);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i != 8192) {
            return super.i(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.c() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View viewAp = AppBarLayout.BaseBehavior.ap(coordinatorLayout);
            if (!viewAp.canScrollVertically(-1)) {
                this.a.i(true);
                return true;
            }
            AppBarLayout appBarLayout = this.a;
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.aq(coordinatorLayout, appBarLayout, viewAp, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
