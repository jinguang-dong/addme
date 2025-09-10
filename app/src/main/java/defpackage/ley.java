package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ley {
    private static final sgv d = sgv.g("ley");
    public final our a;
    public final hbj b;
    public final qqq c;
    private final hzs e;
    private final lat f;

    public ley(qqq qqqVar, hzs hzsVar, lat latVar, hbj hbjVar, our ourVar) {
        this.c = qqqVar;
        this.e = hzsVar;
        this.f = latVar;
        this.b = hbjVar;
        this.a = ourVar;
    }

    private final Set c(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pdk pdkVar = (pdk) it.next();
            pdo pdoVarB = pdkVar.b();
            if (pdoVarB != null && !b(pdkVar)) {
                hashSet.add(pdoVarB);
            }
        }
        return hashSet;
    }

    public final Set a(List list) {
        if (!this.b.p(gzs.X)) {
            return sfd.a;
        }
        Set setC = c(list);
        if (list.isEmpty() || setC.size() != list.size()) {
            return setC;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pdk pdkVar = (pdk) it.next();
            poe poeVarD = pdkVar.d();
            if (poeVarD != null) {
                hashSet.add(Integer.valueOf(this.e.c(poeVarD, this.f.a(pdkVar).l().d())));
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            this.e.t(((Integer) it2.next()).intValue());
        }
        Set setC2 = c(list);
        if (setC2.size() == list.size()) {
            ((sgt) d.b().M(4081)).s("[live-tb] Binning has claimed all frames. Giving up and sending all frames to Gcam.");
            setC2.clear();
        }
        return setC2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [sgt, shi] */
    public final boolean b(pdk pdkVar) {
        lat latVar = this.f;
        poe poeVarD = pdkVar.d();
        lau lauVarA = latVar.a(pdkVar);
        if (poeVarD != null) {
            try {
                if (this.e.z(poeVarD, lauVarA.l().d())) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                ((sgt) ((sgt) d.c().i(e)).M((char) 4082)).s("Error locking frame.");
            }
        }
        return false;
    }
}
