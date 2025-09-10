package defpackage;

import com.google.googlex.gcam.BurstSpec;
import j$.lang.Iterable$EL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ldt implements hzi, paq {
    public static final sgv a = sgv.g("ldt");
    public final kzi b;
    public final lat c;
    public final Map d = new HashMap();
    private final hzi e;
    private final ovx f;

    public ldt(hzi hziVar, kzi kziVar, ovx ovxVar, lat latVar) {
        this.e = hziVar;
        this.b = kziVar;
        this.f = ovxVar;
        this.c = latVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        synchronized (this) {
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((lds) entry.getValue()).a.x.b.l().equals(ltdVar)) {
                    this.b.m((pdm) entry.getValue());
                    it.remove();
                }
            }
            this.f.a(Boolean.valueOf(!r0.isEmpty()));
        }
        this.e.a(ltdVar);
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        this.e.b(ibyVar, lauVar);
    }

    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        iea ieaVar = ibyVar.p;
        if (ieaVar.a() == idz.ZOOM && ieaVar.c == 2) {
            lds ldsVar = new lds(this, ibyVar);
            synchronized (this) {
                this.d.put(Integer.valueOf(ibyVar.a()), ldsVar);
                this.f.a(true);
            }
            ibyVar.a();
            this.b.l(ldsVar);
        }
        this.e.c(ibyVar, burstSpec, poeVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        synchronized (this) {
            Map map = this.d;
            if (map.isEmpty()) {
                return;
            }
            ((sgt) a.b().M(4060)).s("Closing with pending shots, ending prematurely.");
            scn scnVarF = scn.F(map.values());
            map.clear();
            Iterable$EL.forEach(scnVarF, new lji(this, 1));
        }
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        synchronized (this) {
            if (this.d.containsKey(Integer.valueOf(ibyVar.a()))) {
                ((sgt) a.c().M(4061)).t("Shot %s is throttled, and waiting for pending frames.", ibyVar.a());
            } else {
                this.f.a(Boolean.valueOf(!r0.isEmpty()));
                this.e.d(ibyVar, burstSpec);
            }
        }
    }

    @Override // defpackage.hzi
    public final void e(iby ibyVar) {
        this.e.e(ibyVar);
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        this.e.i(ltdVar);
    }
}
