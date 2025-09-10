package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivg implements kmz {
    public static final sgv a = sgv.g("ivg");
    private final let b;
    private final kmz c;
    private final owf d;
    private final our e;
    private final iwb f;

    public ivg(let letVar, owf owfVar, our ourVar, rwc rwcVar, ivb ivbVar, owf owfVar2, owf owfVar3, uem uemVar, ihr ihrVar, kmz kmzVar) {
        a.I(true);
        this.b = letVar;
        this.c = kmzVar;
        this.f = (iwb) ((rwg) rwcVar).a;
        this.e = ourVar;
        pdn pdnVarF = letVar.f();
        int iIntValue = ihrVar.fr().intValue() + 9;
        owf owfVarB = ((lcu) uemVar.a()).b();
        ovx ovxVar = new ovx(false);
        pdnVarF.l(new jmh(new AtomicInteger(Integer.MAX_VALUE), pdnVarF, ovxVar, 1));
        int i = 12;
        ijl ijlVar = new ijl(ovxVar, i);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVar.dK(ijlVar, sxoVar));
        owf owfVarH = owl.h(owfVar3, new nab(iIntValue, 1));
        fsn fsnVar = new fsn(owfVarB, owl.h(owfVarH, new idb(5)), owfVarH);
        ourVar.d(fsnVar.dK(new ijl(owfVarB, 13), sxoVar));
        this.d = owl.c(owl.c(fsnVar, ovxVar), owfVar2);
        pdnVarF.l(ivbVar);
        ourVar.d(new hty(pdnVarF, ivbVar, i, null));
        ourVar.d(ivbVar);
    }

    private final void d(ltd ltdVar, les lesVar) {
        lesVar.a();
        this.f.a(ltdVar);
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.d;
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.c.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kml] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        ggaVar.a.b();
        les lesVarA = this.b.a();
        try {
            try {
                iwb iwbVar = this.f;
                szh szhVar = new szh();
                ?? r3 = ggaVar.b;
                int i = r3.l().a;
                iwbVar.i = iwbVar.b.j(ggaVar, szhVar);
                rnt.M(iwbVar.i != null, "Motion Blur processor not available.");
                ske.W(szhVar, new fpc(iwbVar, ggaVar, 8, (short[]) null), iwbVar.e);
                this.e.d(new hye(szhVar, 7));
                r3.y(new ivf(szhVar));
                this.c.c(new kyj(1), ggaVar);
                szhVar.s();
            } catch (CancellationException | ExecutionException e) {
                ?? r2 = ggaVar.b;
                d(r2.l(), lesVarA);
                if (e instanceof CancellationException) {
                    r2.b(new hhr("Capture cancelled!"));
                    ggaVar.a.f();
                }
                throw new InterruptedException("Error executing capture command.");
            } catch (Exception e2) {
                d(ggaVar.b.l(), lesVarA);
                throw e2;
            }
        } finally {
            lesVarA.a();
            kmyVar.close();
        }
    }
}
