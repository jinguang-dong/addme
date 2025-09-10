package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;
import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fq extends jl {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.jl
    public final gq a() {
        hc hcVar;
        AmbientMode.AmbientController ambientController = this.a.c;
        if (ambientController == null || (hcVar = ((hg) ambientController.a).j) == null) {
            return null;
        }
        return hcVar.a();
    }

    @Override // defpackage.jl
    public final boolean b() {
        gq gqVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        ga gaVar = actionMenuItemView.b;
        return gaVar != null && gaVar.b(actionMenuItemView.a) && (gqVarA = a()) != null && gqVarA.u();
    }
}
