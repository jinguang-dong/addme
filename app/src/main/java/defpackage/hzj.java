package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzj implements hzi {
    private final Set a;
    private final pbn b;
    private final lat c;
    private final gox d;

    public hzj(Set set, pbn pbnVar, gox goxVar, lat latVar) {
        set.size();
        this.a = set;
        this.b = pbnVar;
        this.d = goxVar;
        this.c = latVar;
    }

    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f("abort#".concat(String.valueOf(hziVar.getClass().getName())));
            hziVar.a(ltdVar);
            pbnVar.g();
        }
    }

    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f("begin#".concat(String.valueOf(hziVar.getClass().getName())));
            hziVar.c(ibyVar, burstSpec, poeVar);
            pbnVar.g();
        }
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        ibyVar.a();
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f("endPayload#".concat(String.valueOf(hziVar.getClass().getName())));
            hziVar.d(ibyVar, burstSpec);
            pbnVar.g();
        }
    }

    @Override // defpackage.hzi
    public final void e(iby ibyVar) {
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f("endZslPayload#".concat(String.valueOf(hziVar.getClass().getName())));
            hziVar.e(ibyVar);
            pbnVar.g();
        }
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f("start#".concat(String.valueOf(hziVar.getClass().getName())));
            hziVar.i(ltdVar);
            pbnVar.g();
        }
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        int i = lauVar.e;
        rnt.L(i != 1);
        for (hzi hziVar : this.a) {
            pbn pbnVar = this.b;
            pbnVar.f(qcjAcSmlN.lJdbJewtgvjp.concat(String.valueOf(hziVar.getClass().getName())));
            lau lauVarK = lauVar.k();
            if (lauVarK != null) {
                hziVar.b(ibyVar, lauVarK);
            } else {
                lauVar.b();
                hziVar.b(ibyVar, this.c.c(new hxi(lauVar.b(), lauVar.c(), lauVar.d()), i));
            }
            pbnVar.g();
        }
        pdo pdoVarB = lauVar.b();
        if (pdoVarB != null) {
            this.d.A(ibyVar.a(), pdoVarB.b);
        }
    }
}
