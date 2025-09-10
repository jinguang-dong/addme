package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fgk implements pdm {
    public static final sgv a = sgv.g("fgk");
    public final fhe b;
    public final lat c;
    public final Executor d;
    public final String e;
    private final Map f;
    private final owf g;
    private final boolean h;
    private pdn i;
    private final pmv j;

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, uem] */
    public final synchronized void b() {
        Map map = this.f;
        if (map.isEmpty()) {
            ((sgt) ((sgt) a.c().h(shx.a, "BobaBufferListener")).M(98)).s("No preview streams available!");
            return;
        }
        pmv pmvVar = this.j;
        owf owfVar = this.g;
        pfu pfuVar = (pfu) pmvVar.b.a();
        pfuVar.getClass();
        our ourVar = (our) pmvVar.a.a();
        ourVar.getClass();
        Executor executor = (Executor) pmvVar.c.a();
        executor.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) pmvVar.d.a();
        scheduledExecutorService.getClass();
        owfVar.getClass();
        map.getClass();
        this.i = new kzl(pfuVar, ourVar, executor, scheduledExecutorService, owfVar, map, 2, null);
        if (!this.h) {
            ((sgt) ((sgt) a.c().h(shx.a, "BobaBufferListener")).M(96)).s("Rendering is disabled!!");
            return;
        }
        shl shlVar = shx.a;
        pdn pdnVar = this.i;
        pdnVar.getClass();
        pdnVar.l(this);
    }

    public final synchronized void c() {
        if (this.i == null) {
            shl shlVar = shx.a;
            return;
        }
        shl shlVar2 = shx.a;
        pdn pdnVar = this.i;
        pdnVar.getClass();
        pdnVar.m(this);
        pdn pdnVar2 = this.i;
        pdnVar2.getClass();
        pdnVar2.close();
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        pdo pdoVarB = phcVar.b();
        if (pdoVarB == null || pdoVarB.c % 2 == 0) {
            return;
        }
        ojl.bB(phcVar, new fuh(this, 1));
    }

    public fgk(sbv sbvVar, owf owfVar, pmv pmvVar, fhe fheVar, lat latVar, Executor executor, fgn fgnVar, rwc rwcVar) {
        this.f = sbvVar;
        this.g = owfVar;
        this.j = pmvVar;
        this.b = fheVar;
        this.c = latVar;
        this.d = executor;
        boolean z = false;
        if (fgnVar.b && fgnVar.c) {
            z = true;
        }
        this.h = z;
        this.e = rwcVar.h() ? ((peo) rwcVar.c()).d().a : GdpuLBytnYW.ZpMloGBCZwVYYy;
    }
}
