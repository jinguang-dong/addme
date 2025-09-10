package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ge extends coi implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int b = 0;
    public final ActionProvider a;
    private AmbientMode.AmbientController c;

    public ge(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.coi
    public final View a(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.coi
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.coi
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.coi
    public final boolean d() {
        return this.a.isVisible();
    }

    @Override // defpackage.coi
    public final boolean e() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.coi
    public final boolean f() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.coi
    public final void g(AmbientMode.AmbientController ambientController) {
        this.c = ambientController;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        AmbientMode.AmbientController ambientController = this.c;
        if (ambientController != null) {
            ((gd) ambientController.a).j.C();
        }
    }
}
