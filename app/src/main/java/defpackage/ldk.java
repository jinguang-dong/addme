package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldk implements hzi, iam {
    private static final sgv a = sgv.g("ldk");
    private final jlm b;
    private final HashMap c = new HashMap();
    private final owf d;
    private final iso e;

    public ldk(iso isoVar, jlm jlmVar, owf owfVar) {
        this.e = isoVar;
        this.b = jlmVar;
        this.d = owfVar;
    }

    private final synchronized void f(iby ibyVar) {
        paq paqVar = (paq) this.c.remove(ibyVar);
        if (paqVar != null) {
            paqVar.close();
        } else {
            ((sgt) a.c().M(4001)).t("Couldn't find in-flight shotId=%s", ibyVar.a());
        }
    }

    private final synchronized void g(iby ibyVar) {
        plz plzVarA;
        ibyVar.a();
        float fMax = Math.max(1.0f, ((Float) this.d.dL()).floatValue());
        ShotParams shotParamsB = ibyVar.b();
        float f = true != GcamModuleJNI.ShotParams_allow_spatial_rgb_get(shotParamsB.a, shotParamsB) ? 2.0f : 6.0f;
        Float fValueOf = Float.valueOf(f);
        if (fMax <= 0.0f) {
            ((sgt) jlm.a.c().M(2818)).G(PNlJufQ.qXhjjcS, 1, fValueOf, Float.valueOf(fMax));
            plzVarA = null;
        } else {
            jlm jlmVar = this.b;
            pas pasVarB = jlmVar.d ? jlmVar.c.b : jlmVar.c.b();
            pmj pmjVar = jlmVar.b;
            long j = pmjVar.b;
            pmjVar.f();
            int i = pasVarB.a;
            int i2 = pasVarB.b;
            plzVarA = pmjVar.a((long) ((pasVarB.b() / Math.pow(fMax, 2.0d)) * f));
        }
        if (plzVarA != null) {
            this.c.put(ibyVar, plzVarA);
        } else {
            ((sgt) a.c().M(4007)).t("Not able to reserve memory immediately for shotId=%s", ibyVar.a());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final synchronized void a(ltd ltdVar) {
        iby ibyVar;
        ((sgt) a.c().M(3997)).v("AbortShot for shotId=%s", ltdVar);
        Iterator it = this.c.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ibyVar = null;
                break;
            } else {
                ibyVar = (iby) it.next();
                if (ibyVar.x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        if (ibyVar != null) {
            ibyVar.a();
            f(ibyVar);
        }
    }

    @Override // defpackage.hzi
    public final synchronized void b(iby ibyVar, lau lauVar) {
        ibyVar.a();
        lauVar.close();
        if (this.c.containsKey(ibyVar)) {
            return;
        }
        g(ibyVar);
    }

    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        ibyVar.a();
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        this.e.f(ltdVar).f(this);
        int i = ltdVar.a;
    }

    @Override // defpackage.iam
    public final synchronized void m(iby ibyVar) {
        ibyVar.a();
        f(ibyVar);
    }

    @Override // defpackage.iam
    public final void o(iby ibyVar, mdr mdrVar) {
        ibyVar.a();
        f(ibyVar);
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        ibyVar.a();
        f(ibyVar);
    }
}
