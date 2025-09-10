package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ef implements fe {
    final /* synthetic */ eo a;
    private final fe b;

    public ef(eo eoVar, fe feVar) {
        this.a = eoVar;
        this.b = feVar;
    }

    @Override // defpackage.fe
    public final void a(ff ffVar) {
        fh fhVar = (fh) this.b;
        fhVar.a.onDestroyActionMode(fhVar.e(ffVar));
        eo eoVar = this.a;
        if (eoVar.p != null) {
            eoVar.i.getDecorView().removeCallbacks(eoVar.q);
        }
        if (eoVar.o != null) {
            eoVar.A();
            ejs ejsVarM = con.m(eoVar.o);
            ejsVarM.j(0.0f);
            eoVar.I = ejsVarM;
            eoVar.I.l(new ee(this));
        }
        eoVar.n = null;
        ViewGroup viewGroup = eoVar.t;
        int[] iArr = con.a;
        coe.b(viewGroup);
        eoVar.E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fe
    public final boolean b(ff ffVar, MenuItem menuItem) {
        fh fhVar = (fh) this.b;
        return fhVar.a.onActionItemClicked(fhVar.e(ffVar), new gi(fhVar.b, menuItem));
    }

    @Override // defpackage.fe
    public final boolean c(ff ffVar, Menu menu) {
        fh fhVar = (fh) this.b;
        return fhVar.a.onCreateActionMode(fhVar.e(ffVar), fhVar.f(menu));
    }

    @Override // defpackage.fe
    public final void d(ff ffVar, Menu menu) {
        ViewGroup viewGroup = this.a.t;
        int[] iArr = con.a;
        coe.b(viewGroup);
        fh fhVar = (fh) this.b;
        fhVar.a.onPrepareActionMode(fhVar.e(ffVar), fhVar.f(menu));
    }
}
