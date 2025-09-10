package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hk implements fz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.fz
    public final void D(gb gbVar) {
        int i = this.b;
        if (i == 0) {
            fz fzVar = ((ActionMenuView) this.a).d;
            if (fzVar != null) {
                fzVar.D(gbVar);
                return;
            }
            return;
        }
        if (i != 1) {
            Toolbar toolbar = (Toolbar) this.a;
            if (!toolbar.a.m()) {
                toolbar.C.q(gbVar);
            }
            fz fzVar2 = toolbar.A;
            if (fzVar2 != null) {
                fzVar2.D(gbVar);
                return;
            }
            return;
        }
        eu euVar = (eu) this.a;
        if (euVar.c.l()) {
            euVar.a.onPanelClosed(108, gbVar);
            return;
        }
        Window.Callback callback = euVar.a;
        if (callback.onPreparePanel(0, null, gbVar)) {
            callback.onMenuOpened(108, gbVar);
        }
    }

    @Override // defpackage.fz
    public final boolean H(gb gbVar, MenuItem menuItem) {
        AmbientMode.AmbientController ambientController;
        if (this.b == 0 && (ambientController = ((ActionMenuView) this.a).e) != null) {
            Toolbar toolbar = (Toolbar) ambientController.a;
            if (toolbar.C.r(menuItem)) {
                return true;
            }
            AmbientMode.AmbientController ambientController2 = toolbar.D;
            return ambientController2 != null && ((eu) ambientController2.a).a.onMenuItemSelected(0, menuItem);
        }
        return false;
    }
}
