package defpackage;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lrp {
    public static final sgv a = sgv.g("lrp");
    public final Map b = new LinkedHashMap();
    public final out c;
    private final lsr d;
    private final ocq e;

    public lrp(lsr lsrVar, out outVar, ocq ocqVar) {
        this.d = lsrVar;
        this.c = outVar;
        this.e = ocqVar;
    }

    public final lss a(ltd ltdVar) {
        lss lssVar;
        Map map = this.b;
        synchronized (map) {
            lssVar = (lss) map.get(ltdVar);
        }
        return lssVar;
    }

    public final File b(String str) {
        return this.d.a(str);
    }

    public final void c(lss lssVar) {
        mdq mdqVarAh = this.e.ah(lssVar.l());
        mdm mdmVarO = lssVar.o();
        mdmVarO.getClass();
        ((mdo) mdmVarO).o = mdqVarAh;
        lssVar.y(mdqVarAh);
        Map map = this.b;
        synchronized (map) {
            map.put(lssVar.l(), lssVar);
        }
    }
}
