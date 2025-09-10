package defpackage;

import android.app.Activity;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgr implements jhh, jhe, jhc, jfz {
    public final Activity a;
    public final Window b;
    private final owf c;
    private boolean d;

    public mgr(Activity activity, owf owfVar, out outVar, our ourVar) {
        this.a = activity;
        this.c = owfVar;
        this.b = activity.getWindow();
        ourVar.d(owb.a(owfVar).dK(new lqn(this, 16), outVar));
    }

    private final void i(WindowInsetsController windowInsetsController, int i, boolean z) {
        if (g(i) == z) {
            return;
        }
        if (z) {
            windowInsetsController.show(i);
        } else {
            windowInsetsController.hide(i);
        }
    }

    public final void a(boolean z) {
        WindowInsetsController insetsController = this.b.getInsetsController();
        if (h() == z || this.d || insetsController == null) {
            return;
        }
        h();
        if (z) {
            insetsController.setSystemBarsAppearance(16, 16);
        } else {
            insetsController.setSystemBarsAppearance(0, 16);
        }
    }

    public final void d() {
        WindowInsets rootWindowInsets;
        Window window = this.b;
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        i(insetsController, WindowInsets.Type.statusBars(), this.a.isInMultiWindowMode());
        owf owfVar = this.c;
        int iNavigationBars = WindowInsets.Type.navigationBars();
        boolean z = true;
        if (((mxj) owfVar.dL()).a() && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null && rootWindowInsets.getInsets(WindowInsets.Type.tappableElement()).bottom != 0) {
            z = false;
        }
        i(insetsController, iNavigationBars, z);
    }

    public final void e() {
        f();
        d();
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.d = true;
    }

    @Override // defpackage.jhe
    public final void eb() {
        this.d = false;
        e();
    }

    public final void f() {
        if (this.d) {
            return;
        }
        Window window = this.b;
        if (window.isNavigationBarContrastEnforced()) {
            window.setNavigationBarContrastEnforced(false);
        }
        window.setDecorFitsSystemWindows(this.a.isInMultiWindowMode());
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null || insetsController.getSystemBarsBehavior() == 2) {
            return;
        }
        insetsController.setSystemBarsBehavior(2);
    }

    public final boolean g(int i) {
        WindowInsets rootWindowInsets = this.b.getDecorView().getRootWindowInsets();
        return rootWindowInsets == null || rootWindowInsets.isVisible(i);
    }

    public final boolean h() {
        WindowInsetsController insetsController = this.b.getInsetsController();
        return (insetsController == null || (insetsController.getSystemBarsAppearance() & 16) == 0) ? false : true;
    }

    @Override // defpackage.jfz
    public final void l(boolean z) {
        if (this.d || !z) {
            return;
        }
        e();
    }
}
