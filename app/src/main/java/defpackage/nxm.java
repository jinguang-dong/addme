package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nxm extends lh {
    final /* synthetic */ nxn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxm(nxn nxnVar) {
        super(nxnVar);
        this.c = nxnVar;
    }

    @Override // defpackage.lh, defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        cptVar.n(true);
        cptVar.s(false);
        cps cpsVar = cps.e;
        cptVar.H(cpsVar);
        cptVar.h(new cps(cpsVar.a(), this.c.i));
    }

    @Override // defpackage.lh, defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.i(view, i, bundle);
        }
        Iterator it = this.c.c.af.iterator();
        while (it.hasNext()) {
            ((nxk) it.next()).a();
        }
        return true;
    }
}
