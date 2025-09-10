package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ee extends cow {
    final /* synthetic */ ef a;

    public ee(ef efVar) {
        this.a = efVar;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void a() {
        eo eoVar = this.a.a;
        eoVar.o.setVisibility(8);
        PopupWindow popupWindow = eoVar.p;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (eoVar.o.getParent() instanceof View) {
            View view = (View) eoVar.o.getParent();
            int[] iArr = con.a;
            coe.b(view);
        }
        eoVar.o.i();
        eoVar.I.l(null);
        eoVar.I = null;
        ViewGroup viewGroup = eoVar.t;
        int[] iArr2 = con.a;
        coe.b(viewGroup);
    }
}
