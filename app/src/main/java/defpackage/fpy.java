package defpackage;

import android.app.admin.DevicePolicyManager;
import android.os.Handler;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fpy implements emw {
    public static final sgv a = sgv.g("fpy");
    public final Handler b;
    public emw c;
    public enn d;
    public ena e;
    public pjr f = null;
    public final HashSet g = new HashSet();
    private final fpw h;
    private final pjp i;
    private final DevicePolicyManager j;
    private final Executor k;
    private final Semaphore l;
    private final enq m;
    private final pmg n;
    private final mwq o;

    public fpy(Handler handler, fpw fpwVar, mwq mwqVar, pjp pjpVar, pmg pmgVar, DevicePolicyManager devicePolicyManager, Executor executor, Semaphore semaphore) {
        emw emwVar;
        fpx fpxVar = new fpx(this);
        this.m = fpxVar;
        this.b = handler;
        this.h = fpwVar;
        this.j = devicePolicyManager;
        this.n = pmgVar;
        this.o = mwqVar;
        this.i = pjpVar;
        this.k = executor;
        this.l = semaphore;
        enn ennVarA = fpwVar.a();
        this.d = ennVarA;
        if (ennVarA == null && (emwVar = this.c) != null) {
            emwVar.c(-1, "GETTING_CAMERA_INFO");
        }
        fpwVar.c(new enr(fpxVar, handler));
    }

    private final void l(fpw fpwVar, pjr pjrVar, Handler handler, emw emwVar) throws InterruptedException, hgw {
        try {
            if (this.j.getCameraDisabled(null)) {
                throw new hgw();
            }
            this.l.acquire();
            fpwVar.b(handler, pjrVar.a(), emwVar);
        } catch (hgw unused) {
            handler.post(new fjw(emwVar, pjrVar, 7));
        }
    }

    private final void m() {
        Semaphore semaphore = this.l;
        if (semaphore.availablePermits() == 0) {
            semaphore.release();
        }
    }

    @Override // defpackage.emw
    public final void a(int i) {
        emw emwVar = this.c;
        if (emwVar != null) {
            emwVar.a(i);
        }
        m();
    }

    @Override // defpackage.emw
    public final synchronized void b(ena enaVar) {
        int iA = enaVar.a();
        pjr pjrVar = this.f;
        int iA2 = pjrVar != null ? pjrVar.a() : -1;
        if (iA2 != iA) {
            k(false);
            return;
        }
        if (enaVar.g().a() != 1) {
            ena enaVar2 = this.e;
            if (enaVar2 != null && enaVar2.a() != iA) {
                k(false);
            }
            this.f = null;
            this.e = enaVar;
            emw emwVar = this.c;
            if (emwVar != null) {
                emwVar.b(enaVar);
            }
        } else {
            emw emwVar2 = this.c;
            if (emwVar2 != null) {
                emwVar2.c(iA, a.bE(iA2, "Camera ", " opened, but in UNOPENED state"));
            }
        }
    }

    @Override // defpackage.emw
    public final void c(int i, String str) {
        emw emwVar = this.c;
        if (emwVar != null) {
            emwVar.c(i, str);
        }
        m();
    }

    @Override // defpackage.emw
    public final void d(int i, String str) {
        g(i);
        emw emwVar = this.c;
        if (emwVar != null) {
            emwVar.d(i, str);
        }
        m();
    }

    @Override // defpackage.emw
    public final void e(ene eneVar, String str) {
        emw emwVar = this.c;
        if (emwVar != null) {
            emwVar.e(eneVar, str);
        }
        m();
    }

    public final int f() {
        enn ennVar = this.d;
        if (ennVar == null) {
            return -1;
        }
        return ennVar.a();
    }

    public final synchronized void g(int i) {
        pjr pjrVar = this.f;
        if (pjrVar != null) {
            pjrVar.a();
        }
        pjr pjrVar2 = this.f;
        if (pjrVar2 == null || pjrVar2.a() != i) {
            return;
        }
        this.f = null;
    }

    public final synchronized void h() {
        pjr pjrVar = this.f;
        if (pjrVar == null) {
            ((sgt) a.c().M(319)).s("doRequestCamera: might be interrupted by early release. return");
            return;
        }
        pmg pmgVar = this.n;
        synchronized (pmgVar.b) {
            Object obj = pmgVar.c;
            if (obj != null) {
                ((pjr) obj).equals(pjrVar);
            }
            pmgVar.c = pjrVar;
        }
        fpw fpwVar = this.h;
        fpwVar.getClass();
        ena enaVar = this.e;
        if (enaVar == null) {
            l(fpwVar, pjrVar, this.b, this);
        } else if (enaVar.a() != pjrVar.a()) {
            k(false);
            l(fpwVar, pjrVar, this.b, this);
        } else {
            try {
                enaVar.h().a(new as(enaVar, this.b, (emw) this, 12));
            } catch (RuntimeException e) {
                enaVar.d().c().c(e);
            }
        }
        this.d = this.h.a();
    }

    public final void i(int i) {
        g(i);
        ena enaVar = this.e;
        if (enaVar == null) {
            ((sgt) a.c().M(323)).t("releaseCamera: Try to release a not-yet-available camera(%s). Wait till it's available", i);
            return;
        }
        int iA = enaVar.a();
        if (iA != i) {
            ((sgt) a.c().M(322)).w("releaseCamera: Try to release a camera that is not opened. current=%s id=%s", iA, i);
            return;
        }
        pmg pmgVar = this.n;
        pjr pjrVarC = this.i.c(i);
        synchronized (pmgVar.b) {
            Object obj = pmgVar.c;
            if (obj != null && ((pjr) obj).equals(pjrVarC)) {
                pmgVar.c = null;
            }
        }
    }

    public final /* synthetic */ void j() {
        int iF = f();
        if (iF != -1) {
            pjr pjrVarC = this.i.c(iF);
            synchronized (this) {
                pjr pjrVar = this.f;
                if (pjrVar != null) {
                    if (pjrVar.equals(pjrVarC)) {
                        return;
                    } else {
                        i(this.f.a());
                    }
                }
                this.f = pjrVarC;
                this.o.K();
                this.k.execute(new cmu(this, iF, 7, null));
            }
        }
    }

    public final void k(boolean z) {
        fpw fpwVar = this.h;
        fpwVar.getClass();
        fpwVar.d(z);
        m();
    }
}
