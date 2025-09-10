package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egx implements egg, egy {
    public final boolean a;
    public final ehd b;
    public final ehd c;
    public final ehd d;
    public final int e;
    private final List f = new ArrayList();

    public egx(ejh ejhVar, ejf ejfVar) {
        this.a = ejfVar.d;
        this.e = ejfVar.e;
        ehd ehdVarA = ejfVar.a.a();
        this.b = ehdVarA;
        ehd ehdVarA2 = ejfVar.b.a();
        this.c = ehdVarA2;
        ehd ehdVarA3 = ejfVar.c.a();
        this.d = ehdVarA3;
        ejhVar.i(ehdVarA);
        ejhVar.i(ehdVarA2);
        ejhVar.i(ehdVarA3);
        ehdVarA.h(this);
        ehdVarA2.h(this);
        ehdVarA3.h(this);
    }

    final void a(egy egyVar) {
        this.f.add(egyVar);
    }

    @Override // defpackage.egy
    public final void d() {
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                return;
            }
            ((egy) list.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.egg
    public final String g() {
        throw null;
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
    }
}
