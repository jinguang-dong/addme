package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hgu {
    private static final sgv a = sgv.g("hgu");
    private final pbn b;
    private final Map c = new HashMap();
    private final hbj d;
    private final cxb e;

    public hgu(hbj hbjVar, pbn pbnVar, cxb cxbVar) {
        this.d = hbjVar;
        this.b = pbnVar;
        this.e = cxbVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final void a(hhs hhsVar) {
        pbr pbrVarB;
        if (hhsVar.a()) {
            ((sgt) ((sgt) a.b().i(hhsVar)).M((char) 1295)).s("Shot Exception!");
            synchronized (this) {
                Class<?> cls = hhsVar.getClass();
                Map map = this.c;
                pbrVarB = (pbr) map.get(cls);
                if (pbrVarB == null) {
                    pbrVarB = this.b.b("ShotFailure:" + cls.getSimpleName());
                    map.put(cls, pbrVarB);
                }
            }
            pbrVarB.b();
            cxb.I();
        }
        gzi gziVar = gzo.a;
    }
}
