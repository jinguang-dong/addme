package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgf implements dgm {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public dgf(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.dgm
    public final void b(dgp dgpVar) {
        dgpVar.F(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.dgm
    public final void e(dgp dgpVar) {
        dgpVar.F(this);
        dgpVar.D(this);
    }

    @Override // defpackage.dgm
    public final /* synthetic */ void f(dgp dgpVar) {
        com.s(this, dgpVar);
    }

    @Override // defpackage.dgm
    public final /* synthetic */ void g(dgp dgpVar) {
        com.t(this, dgpVar);
    }

    @Override // defpackage.dgm
    public final void c() {
    }

    @Override // defpackage.dgm
    public final void d() {
    }

    @Override // defpackage.dgm
    public final void a(dgp dgpVar) {
    }
}
