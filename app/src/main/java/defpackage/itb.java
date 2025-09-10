package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class itb implements iam, hzi {
    private static final sgv b = sgv.g("itb");
    public final Map a = new HashMap();
    private final hxv c;
    private final hyh d;
    private final Executor e;
    private final int f;
    private final isy g;
    private final int h;
    private boolean i;
    private final hbj j;
    private final iso k;
    private final jod l;

    public itb(hxv hxvVar, hyh hyhVar, iso isoVar, isy isyVar, jod jodVar, hbj hbjVar, Executor executor) {
        this.c = hxvVar;
        this.d = hyhVar;
        this.g = isyVar;
        this.l = jodVar;
        this.k = isoVar;
        this.e = executor;
        this.h = ((Integer) hbjVar.a(hac.h).orElse(15)).intValue();
        this.f = ((Integer) hbjVar.a(hac.j).orElse(150000)).intValue();
        this.j = hbjVar;
    }

    public static final int h(iby ibyVar) {
        try {
            return ibyVar.a();
        } catch (IllegalStateException e) {
            ((sgt) ((sgt) ((sgt) b.c().h(shx.a, "KeplerProcessorImpl")).i(e)).M(2302)).s("Error getting the shot ID.");
            return -1;
        }
    }

    private final void j(iby ibyVar, String str) {
        ita itaVar = (ita) this.a.get(ibyVar);
        if (itaVar != null && itaVar.c.get()) {
            this.g.a(ibyVar);
        }
        f(ibyVar, str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        iby ibyVar;
        shl shlVar = shx.a;
        int i = ltdVar.a;
        Iterator it = this.a.keySet().iterator();
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
        if (ibyVar == null) {
            return;
        }
        j(ibyVar, "Shot aborted.");
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        lau lauVarK;
        try {
            ita itaVar = (ita) this.a.get(ibyVar);
            if (this.d.l() && itaVar != null) {
                ldi ldiVar = itaVar.a;
                int i = ldiVar.r;
                int i2 = itaVar.e;
                if (i < i2 && (lauVarK = lauVar.k()) != null) {
                    shl shlVar = shx.a;
                    ldiVar.c(lauVarK);
                    boolean z = itaVar.d;
                    if (!this.j.p(hac.U)) {
                        z &= ldiVar.r == i2;
                    }
                    if (z) {
                        if (!itaVar.c.getAndSet(true)) {
                            szh szhVar = new szh();
                            isy isyVar = this.g;
                            iby ibyVar2 = itaVar.b;
                            itg itgVar = itaVar.f;
                            pos posVar = itgVar.a.b;
                            itgVar.a(posVar);
                            isyVar.c(ibyVar2, ldiVar, i2, posVar, szhVar);
                            ske.W(szhVar, new iiz(this, itaVar, 2, null), this.e);
                        }
                        this.g.d(itaVar.b);
                    }
                }
            }
        } finally {
            lauVar.close();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        if (this.d.l()) {
            shl shlVar = shx.a;
            Map map = this.a;
            rnt.L(!map.containsKey(ibyVar));
            int iMin = burstSpec != null ? Math.min((int) burstSpec.c().a(), this.h) : this.h;
            hxv hxvVar = this.c;
            jod jodVar = this.l;
            hxu hxuVarA = hxvVar.a();
            boolean z = this.i;
            gga ggaVar = ibyVar.x;
            map.put(ibyVar, new ita(new ldi(ggaVar, hxuVarA, burstSpec, poeVar), ibyVar, new AtomicBoolean(), new itg((qqq) jodVar.a, (hqw) jodVar.b, ggaVar.b.o()), z, iMin));
        }
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        shl shlVar = shx.a;
        h(ibyVar);
        ita itaVar = (ita) this.a.get(ibyVar);
        if (itaVar != null) {
            AtomicBoolean atomicBoolean = itaVar.c;
            if (atomicBoolean.get()) {
                ldi ldiVar = itaVar.a;
                if (ldiVar.r < itaVar.e) {
                    j(ibyVar, "Kelper not produced since not enough frames.");
                    return;
                }
            }
            if (atomicBoolean.get()) {
                return;
            }
            f(ibyVar, "Kepler was never initiated.");
        }
    }

    public final void f(iby ibyVar, String str) {
        sgt sgtVar = (sgt) ((sgt) b.c().h(shx.a, "KeplerProcessorImpl")).M(2300);
        int iH = h(ibyVar);
        if (str == null) {
            str = "Unknown";
        }
        sgtVar.y("Shot cancelled. Shot id: %d. Reason: %s", iH, str);
        ita itaVar = (ita) this.a.remove(ibyVar);
        if (itaVar != null) {
            itaVar.a.b();
            itg itgVar = itaVar.f;
            itgVar.a.a();
            itgVar.b.d();
            ((mdo) itgVar.c).A.e(null);
        }
    }

    public final synchronized void g(long j) {
        shl shlVar = shx.a;
        this.i = j >= ((long) this.f);
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        this.k.f(ltdVar).f(this);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        this.i = false;
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        this.i = false;
        j(ibyVar, iagVar.getMessage());
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }
}
