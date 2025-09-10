package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jmw {
    public static final sgv a = sgv.g("jmw");
    public final luj e;
    public final hbj g;
    public final owd h;
    private final owq i;
    private final hyh j;
    private volatile jnp k;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final Object d = new Object();
    public volatile int f = 1;

    public jmw(owq owqVar, owd owdVar, hbj hbjVar, hyh hyhVar, luj lujVar) {
        this.i = owqVar;
        this.h = owdVar;
        this.g = hbjVar;
        this.j = hyhVar;
        this.e = lujVar;
        gzi gziVar = gzq.a;
    }

    public final void a(boolean z) {
        gga ggaVarE = e();
        if (ggaVarE != null) {
            ((jpb) ggaVarE.c).a(z);
        }
        if (z) {
            this.h.g();
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, owf] */
    public final synchronized boolean b() {
        jnp jnpVar = this.k;
        if (jnpVar == null) {
            return false;
        }
        gga ggaVarE = e();
        if (ggaVarE != null) {
            kiq kiqVar = (kiq) ggaVarE.d.dL();
            if (kiqVar.equals(kiq.NORMAL_WITH_FLASH) || kiqVar.equals(kiq.HDR_PLUS_WITH_TORCH) || kiqVar.equals(kiq.c)) {
                return false;
            }
        }
        if (!((Boolean) this.i.dL()).booleanValue() && !((Boolean) this.j.b.dL()).booleanValue()) {
            if (jnpVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void c(jnp jnpVar) {
        if (this.k == null) {
            this.k = jnpVar;
        } else {
            ((sgt) a.c().M(2850)).s("Cannot attach UI controller when already attached!");
        }
    }

    public final synchronized void d(jnp jnpVar) {
        if (this.k == jnpVar) {
            this.k = null;
        } else {
            ((sgt) a.c().M(2852)).s("Cannot detach UI controller. Values mismatch.");
        }
    }

    public final gga e() {
        synchronized (this.d) {
            List list = this.b;
            if (list.isEmpty()) {
                return null;
            }
            return (gga) ujp.aQ(list);
        }
    }
}
