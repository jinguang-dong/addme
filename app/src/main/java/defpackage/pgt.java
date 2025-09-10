package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgt implements pau {
    public final syu a;
    private final Set b;

    public pgt(scn scnVar) {
        ArrayList arrayList = new ArrayList();
        this.b = scnVar;
        sgj sgjVarListIterator = scnVar.listIterator();
        while (sgjVarListIterator.hasNext()) {
            arrayList.add(((pel) sgjVarListIterator.next()).a);
        }
        this.a = swz.j(ske.I(arrayList), new jie(4), sxo.a);
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        pnx pnxVar = (pnx) obj;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((pel) it.next()).a(pnxVar);
        }
    }
}
