package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfa implements lez {
    private static final sgv a = sgv.g("lfa");
    private final Set b;

    public lfa(Set set) {
        this.b = scn.F(set);
    }

    @Override // defpackage.lez
    public final boolean a(pdk pdkVar) {
        try {
            ojl.bA(pdkVar);
            poe poeVarD = pdkVar.d();
            if (poeVarD == null) {
                ((sgt) a.c().M(4085)).v("Missing metadata for frame %s.", pdkVar.b());
                return false;
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (!((khf) it.next()).a(poeVarD)) {
                    ((sgt) a.c().M(4083)).v("Frame rejected: %s.", pdkVar.b());
                    return false;
                }
            }
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            ((sgt) a.c().M(4084)).v("Wait for metadata for frame %s got interrupted.", pdkVar.b());
            return false;
        }
    }
}
