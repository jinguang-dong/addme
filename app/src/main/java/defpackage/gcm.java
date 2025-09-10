package defpackage;

import android.view.Surface;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.pairip.VMRunner;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gcm implements gce {
    public pdn A;
    public gal B;
    public owq C;
    public hfs D;
    public fcr E;
    public rwc F;
    public final gbp G;
    public final rwc H;
    public final owq I;
    public final Executor J;
    public final Set K;
    public paq L;
    public paq M;
    public boolean N;
    public final pfw O;
    public final fzb P;
    public final ipt Q;
    public pfu R;
    public ngn S;
    public final noy T;
    public final hbj U;
    public final gox V;
    public final hbp W;
    public final cxb X;
    private final boolean Z;
    private final gcp aa;
    private final pbn ab;
    private final ngw ac;
    private final jod ad;
    public final Object c = new Object();
    public final gav d;
    public final fyg e;
    public final uem f;
    public final rwc g;
    public final int h;
    public gaw i;
    public peo j;
    public peo k;
    public peo l;
    public peo m;
    public peo n;
    public peo o;
    public peo p;
    public rwc q;
    public rwc r;
    public npq s;
    public Surface t;
    public pdv u;
    public pdv v;
    public pdv w;
    public pdn x;
    public pdn y;
    public pdn z;
    public static final sgv a = sgv.g(nWEkBGOQPWQp.AKfgubV);
    private static final Integer Y = 1;
    public static final fsx b = new gch();

    public gcm(gav gavVar, pfw pfwVar, fyg fygVar, uem uemVar, rwc rwcVar, fzb fzbVar, gcp gcpVar, cxb cxbVar, hbj hbjVar, gox goxVar, hbp hbpVar, jod jodVar, noy noyVar, gbp gbpVar, rwc rwcVar2, owq owqVar, Executor executor, Set set, ngw ngwVar, pbn pbnVar, ipt iptVar) {
        rvk rvkVar = rvk.a;
        this.q = rvkVar;
        this.r = rvkVar;
        this.N = false;
        this.d = gavVar;
        this.O = pfwVar;
        this.e = fygVar;
        this.f = uemVar;
        this.g = rwcVar;
        this.P = fzbVar;
        this.aa = gcpVar;
        this.X = cxbVar;
        this.h = ((Integer) hbjVar.a(gzo.b).get()).intValue() + ((Integer) hbjVar.a(gzo.c).get()).intValue();
        this.Z = hbjVar.o(gzo.am);
        this.V = goxVar;
        this.W = hbpVar;
        this.ad = jodVar;
        this.T = noyVar;
        this.G = gbpVar;
        this.H = rwcVar2;
        this.I = owqVar;
        this.J = executor;
        this.K = set;
        this.ac = ngwVar;
        this.ab = pbnVar;
        this.U = hbjVar;
        this.Q = iptVar;
    }

    private static long c(gaw gawVar) {
        return gawVar.J ? 2L : 1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final peq d(pjr pjrVar, boolean z) {
        synchronized (this.c) {
            gaw gawVar = this.i;
            gawVar.getClass();
            if (!gawVar.H && !z) {
                pep pepVarA = peq.a();
                pepVarA.r(pet.SURFACE_VIEW);
                ngn ngnVar = this.S;
                ngnVar.getClass();
                pepVarA.p(ngnVar.a);
                pepVarA.b(pjrVar);
                pepVarA.n(gawVar.f);
                pepVarA.f(true);
                pepVarA.i(34);
                pepVarA.e(c(gawVar));
                if (this.q.h()) {
                    Y.intValue();
                    pepVarA.q(1);
                }
                return pepVarA.a();
            }
            boolean z2 = gawVar.L;
            int i = z2 ? true != gawVar.J ? 35 : 54 : 34;
            long j = true != z2 ? 256L : 65795L;
            pep pepVarA2 = peq.a();
            pepVarA2.r(pet.IMAGE_READER);
            pepVarA2.b(pjrVar);
            pepVarA2.n(gawVar.f);
            pepVarA2.i(i);
            pepVarA2.c(30);
            pepVarA2.s(j);
            pepVarA2.h(true);
            pepVarA2.f(true);
            pepVarA2.e(c(gawVar));
            return pepVarA2.a();
        }
    }

    private static peo e(pfu pfuVar, peq peqVar) {
        if (peqVar == null) {
            return null;
        }
        return pfuVar.a.b(peqVar);
    }

    public void a() {
        VMRunner.invoke("Topz1Ry7PxWZZHsP", new Object[]{this});
    }

    public final void b(pdn pdnVar, peo peoVar) {
        pdnVar.l(new fmz(this, peoVar, 3));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            pfu pfuVar = this.R;
            if (pfuVar != null) {
                pfuVar.close();
                this.R = null;
            }
            pdn pdnVar = this.x;
            if (pdnVar != null) {
                pdnVar.close();
                this.x = null;
            }
            pdn pdnVar2 = this.y;
            if (pdnVar2 != null) {
                pdnVar2.close();
                this.y = null;
            }
            pdn pdnVar3 = this.z;
            if (pdnVar3 != null) {
                pdnVar3.close();
                this.z = null;
            }
            pdn pdnVar4 = this.A;
            if (pdnVar4 != null) {
                pdnVar4.close();
                this.A = null;
            }
            paq paqVar = this.L;
            if (paqVar != null) {
                paqVar.close();
                this.L = null;
            }
            paq paqVar2 = this.M;
            if (paqVar2 != null) {
                paqVar2.close();
                this.M = null;
            }
            npq npqVar = this.s;
            if (npqVar != null) {
                npqVar.close();
                this.s = null;
            }
            this.u = null;
            this.v = null;
            this.w = null;
            this.G.b();
            this.N = true;
        }
    }
}
