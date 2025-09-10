package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hqc {
    private static final sgv a = sgv.g(oUZhwRhE.IQGtevXE);
    private final Map b = new HashMap();

    private final synchronized hqa f(long j) {
        for (hqa hqaVar : this.b.values()) {
            if (hqaVar.a.a == j) {
                return hqaVar;
            }
        }
        ((sgt) a.c().M(1437)).u("Mediastore record not found for %s", j);
        return null;
    }

    public final rwc a(long j) {
        return rwc.i(f(j));
    }

    public final synchronized rwc b(ltd ltdVar) {
        return rwc.i((hqa) this.b.get(ltdVar));
    }

    public final synchronized List c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (hqa hqaVar : this.b.values()) {
            if (hqaVar.f()) {
                arrayList.add(hqaVar);
            }
        }
        arrayList.size();
        return arrayList;
    }

    public final synchronized hqa d(ltd ltdVar) {
        hqa hqaVar;
        Map map = this.b;
        rnt.F(map.containsKey(ltdVar), "No session associated with session: %s", ltdVar);
        hqaVar = (hqa) map.remove(ltdVar);
        hqaVar.getClass();
        return hqaVar;
    }

    public final synchronized void e(ltd ltdVar, hqa hqaVar) {
        Map map = this.b;
        rnt.J(!map.containsKey(ltdVar), "Already contain pending ProcessingMedia <%s> for session <%s>. Now attempting to associate ProcessingMedia <%s> with same session.", map.get(ltdVar), ltdVar, hqaVar);
        map.put(ltdVar, hqaVar);
    }
}
