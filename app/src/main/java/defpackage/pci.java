package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pci {
    public static final pch a = new pch(false);
    public final pbc b;
    private final ScheduledExecutorService c;
    private final Object d = new Object();
    private final pch e;
    private our f;
    private ouk g;

    private final ouk c(our ourVar) {
        synchronized (this.d) {
            if (this.e.a) {
                return new ouk(ourVar, sxo.a, null);
            }
            return new ouk(ourVar, sxo.a, new ovj(new ovi(this.c, 1000L, TimeUnit.MILLISECONDS)));
        }
    }

    public final our a() {
        our ourVarC;
        synchronized (this.d) {
            ourVarC = this.f.c();
        }
        return ourVarC;
    }

    public final paq b(String str) {
        hku hkuVar;
        synchronized (this.d) {
            paq paqVarA = this.g.a();
            if (paqVarA == null) {
                this.b.f(a.bw(str, "Failed to acquire token requested by:", "; creating new wakelock"));
                our ourVar = new our();
                this.f = ourVar;
                ouk oukVarC = c(ourVar);
                this.g = oukVarC;
                paqVarA = oukVarC.a();
                paqVarA.getClass();
            }
            this.b.b(mn.g(str, qcjAcSmlN.POgHImkgcskDbuR));
            hkuVar = new hku(this, str, paqVarA, 4);
        }
        return hkuVar;
    }

    public pci(ScheduledExecutorService scheduledExecutorService, pbc pbcVar, rwc rwcVar) {
        this.c = scheduledExecutorService;
        pbc pbcVarA = pbcVar.a(GdpuLBytnYW.zaJAyaldylh);
        this.b = pbcVarA;
        pch pchVar = (pch) rwcVar.e(a);
        this.e = pchVar;
        our ourVar = new our();
        this.f = ourVar;
        this.g = c(ourVar);
        pbcVarA.b("Configured: ".concat(pchVar.toString()));
    }
}
