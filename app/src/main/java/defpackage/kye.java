package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kye {
    public static final sgv a = sgv.g("kye");
    public final let b;
    public final lat c;
    public final kyu d;
    public final hyi e;
    public final pbn f;
    public final kwr g;
    public final ley h;
    public final tgq i;
    public final Executor j;
    public final pfu k;
    public final ifn l;
    public final qrh m;

    public kye(qrh qrhVar, pfu pfuVar, lat latVar, let letVar, kyu kyuVar, ifn ifnVar, hyi hyiVar, pbn pbnVar, kwr kwrVar, ley leyVar, tgq tgqVar, Executor executor) {
        this.m = qrhVar;
        this.k = pfuVar;
        this.b = letVar;
        this.c = latVar;
        this.d = kyuVar;
        this.l = ifnVar;
        this.e = hyiVar;
        this.f = pbnVar;
        this.g = kwrVar;
        this.h = leyVar;
        this.i = tgqVar;
        this.j = executor;
    }

    public static final void b(pdk pdkVar) throws TimeoutException {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!pdkVar.f() && !pdkVar.g() && !ojl.bv(pdkVar).a.await(500L, timeUnit)) {
                throw new TimeoutException("Timeout elapsed");
            }
        } catch (TimeoutException unused) {
            ((sgt) a.c().M(3699)).s("Unable to complete frame on time.");
            pdkVar.close();
        }
    }

    public final void a(kmy kmyVar) {
        pbn pbnVar = this.f;
        pbnVar.f("closingCaptureLock");
        kmyVar.close();
        pbnVar.g();
    }

    public final List c(boolean z, kze kzeVar, gga ggaVar, iby ibyVar) {
        this.l.a(ggaVar, ibyVar.p);
        if (z && kzeVar != null) {
            kzeVar.b();
        }
        return new ArrayList();
    }
}
