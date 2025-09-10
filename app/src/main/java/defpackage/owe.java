package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owe implements owf {
    public final List a;

    public owe(Collection collection) {
        this.a = sbp.j(collection);
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        List list = this.a;
        if (list.isEmpty()) {
            executor.execute(new ooc(pauVar, 11));
            return new pan(0);
        }
        owd owdVar = new owd(this, pauVar, executor);
        our ourVar = new our();
        owr owrVar = new owr();
        for (int i = 0; i < list.size(); i++) {
            ourVar.d(((owf) list.get(i)).dK(new owc(owdVar, i), owrVar));
        }
        return ourVar;
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((owf) it.next()).dL());
        }
        return arrayList;
    }
}
