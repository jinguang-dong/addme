package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dbf extends cnn {
    final /* synthetic */ dbg a;

    public dbf(dbg dbgVar) {
        this.a = dbgVar;
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        dbg dbgVar = this.a;
        dbgVar.d.c(view, cptVar);
        RecyclerView recyclerView = dbgVar.c;
        int iC = recyclerView.c(view);
        ki kiVar = recyclerView.l;
        if (kiVar instanceof daz) {
            ((daz) kiVar).o(iC);
        }
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
