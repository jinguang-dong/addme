package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byy extends bij implements cap {
    public ViewGroup a;

    public byy(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.cap
    public final Object d(bry bryVar, uif uifVar, uhb uhbVar) {
        long jS = byi.s(bryVar);
        Object objA = uifVar.a();
        bkg bkgVarE = objA != null ? ((bkg) objA).e(jS) : null;
        if (bkgVarE != null) {
            this.a.requestRectangleOnScreen(blb.c(bkgVarE), false);
        }
        return ufg.a;
    }
}
