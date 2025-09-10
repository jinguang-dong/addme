package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ew extends cow {
    final /* synthetic */ ez a;

    public ew(ez ezVar) {
        this.a = ezVar;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void a() {
        View view;
        ez ezVar = this.a;
        if (ezVar.j && (view = ezVar.e) != null) {
            view.setTranslationY(0.0f);
            ezVar.c.setTranslationY(0.0f);
        }
        ezVar.c.setVisibility(8);
        ezVar.c.a(false);
        ezVar.l = null;
        fe feVar = ezVar.h;
        if (feVar != null) {
            feVar.a(ezVar.g);
            ezVar.g = null;
            ezVar.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = ezVar.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = con.a;
            coe.b(actionBarOverlayLayout);
        }
    }
}
