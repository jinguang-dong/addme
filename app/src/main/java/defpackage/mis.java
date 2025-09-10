package defpackage;

import android.content.IntentFilter;
import androidx.wear.ambient.AmbientMode;
import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mis extends mku {
    private static final sgv b = sgv.g("mis");
    public final muu a;
    private final gnt c;
    private final owq d;
    private final pbn e;
    private final gfq f;
    private final juh g;
    private final ipq h;
    private final nrc i;
    private final owf j;
    private jai k;
    private final hbj l;
    private final hbp m;

    public mis(gnt gntVar, owq owqVar, hbp hbpVar, pbn pbnVar, gfq gfqVar, juh juhVar, ipq ipqVar, nrc nrcVar, muu muuVar, owf owfVar, hbj hbjVar) {
        this.c = gntVar;
        this.d = owqVar;
        this.e = pbnVar;
        this.m = hbpVar;
        this.f = gfqVar;
        this.g = juhVar;
        this.h = ipqVar;
        this.i = nrcVar;
        this.a = muuVar;
        this.j = owfVar;
        this.l = hbjVar;
    }

    public final jai b() {
        jai jaiVar = this.k;
        rnt.x(jaiVar);
        return jaiVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fqf
    public final void eA() {
        if (this.k == null) {
            ((sgt) b.c().M(4818)).s("Cheetah component is not initialized, aborting pause");
            return;
        }
        mjl mjlVarA = b().a();
        mje mjeVar = mjlVarA.A;
        mkr mkrVar = mjlVarA.D;
        mkrVar.q.b();
        mkrVar.h.d(false);
        mkrVar.D.d(mkrVar.x);
    }

    @Override // defpackage.fqf
    public final void eB() {
        if (this.t) {
            b().a().d();
        }
    }

    @Override // defpackage.fqf
    public final void eC() {
        if (this.k == null) {
            ((sgt) b.c().M(4819)).s("Cheetah component is not initialized, aborting resume");
            return;
        }
        mjl mjlVarA = b().a();
        mjlVarA.A.h();
        mkr mkrVar = mjlVarA.D;
        mkrVar.z = mjlVarA.N;
        mkrVar.q.d();
        mkrVar.h.d(true);
        mkrVar.D.a(mkrVar.x);
    }

    @Override // defpackage.fqf
    public final void l() {
        this.f.a = nkw.TIME_LAPSE;
        this.e.f("Cheetah-ModuleStart");
        this.d.a(true);
        hbp hbpVar = this.m;
        this.k = new jai((izm) hbpVar.a, (izc) hbpVar.b, (izh) hbpVar.c);
        b().a().a(this.c.a());
        mjl mjlVarA = b().a();
        mjlVarA.l.a(mii.STATE_PREPARING_ON_START);
        mkr mkrVar = mjlVarA.D;
        mkrVar.e.A(mkrVar.J);
        mkrVar.m.b(mkrVar.v);
        our ourVar = mkrVar.j;
        ourVar.d(mkrVar.l.e(mkrVar.u));
        ourVar.d(new kxj(mkrVar, 20));
        ourVar.d(new mpc(mkrVar, 1, null));
        final mke mkeVar = mjlVarA.C;
        ojl.ck(mkeVar.p.a(), new paf() { // from class: mka
            @Override // defpackage.paf
            public final void a(Object obj) {
                mgn mgnVar = (mgn) obj;
                mgnVar.getClass();
                mkeVar.a(mgnVar, true);
            }
        }, mkeVar.d);
        mhs mhsVar = new mhs();
        mhsVar.d("TimeLapsePoorVideoQualityWarning");
        out outVar = mkeVar.f;
        mhsVar.c(outVar);
        mhsVar.g(mhp.HEAT_CRITICAL);
        mhsVar.f(new Runnable() { // from class: mjs
            @Override // java.lang.Runnable
            public final void run() {
                mkeVar.g.a(nav.POOR_VIDEO_QUALITY);
            }
        });
        mhsVar.e(new Runnable() { // from class: mjv
            @Override // java.lang.Runnable
            public final void run() {
                ((sgt) mke.a.c().M(4884)).s("Device temperature is too high that may impact video quality.");
                mkeVar.g.d(nav.POOR_VIDEO_QUALITY);
            }
        });
        mht mhtVarA = mhsVar.a();
        mhs mhsVar2 = new mhs();
        mhsVar2.d("TimeLapseHeatEmergency");
        mhsVar2.c(outVar);
        mhsVar2.g(mhp.HEAT_EMERGENCY);
        mhsVar2.f(new Runnable() { // from class: mjw
            @Override // java.lang.Runnable
            public final void run() {
                mke mkeVar2 = mkeVar;
                mkr mkrVar2 = mkeVar2.j;
                mkrVar2.e(false);
                if (mkrVar2.l()) {
                    mkrVar2.b();
                }
                naw nawVar = mkeVar2.g;
                nawVar.a(nav.RECORDING_STOPPED);
                nawVar.a(nav.RECORDING_DISABLED);
            }
        });
        mhsVar2.e(new Runnable() { // from class: mjx
            @Override // java.lang.Runnable
            public final void run() {
                ((sgt) mke.a.c().M(4885)).s("Device temperature is too high to do recording.");
                mke mkeVar2 = mkeVar;
                mkr mkrVar2 = mkeVar2.j;
                mkrVar2.e(true);
                mkrVar2.a();
                mkeVar2.g.d(mkrVar2.k() ? nav.RECORDING_STOPPED : nav.RECORDING_DISABLED);
                ((mjl) mkeVar2.q.a).k(2);
            }
        });
        mkeVar.n = sbp.m(mhtVarA, mhsVar2.a());
        our ourVar2 = mkeVar.e;
        ourVar2.d(mkeVar.i.d(new mho() { // from class: mjy
            @Override // defpackage.mho
            public final void d(mhp mhpVar) {
                sbp sbpVar = mkeVar.n;
                int i = ((sex) sbpVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((mho) sbpVar.get(i2)).d(mhpVar);
                }
            }
        }));
        naw nawVar = mkeVar.g;
        nawVar.getClass();
        ourVar2.d(new kxj(nawVar, 19));
        synchronized (mkeVar.l) {
            AtomicBoolean atomicBoolean = mkeVar.b;
            if (!atomicBoolean.get()) {
                mkeVar.c.registerReceiver(mkeVar.k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                atomicBoolean.set(true);
            }
        }
        mjlVarA.A.i();
        mjlVarA.f.set(false);
        mjlVarA.g.set(false);
        if (mjlVarA.F != null) {
            mjlVarA.v.execute(new mir(mjlVarA, 16));
        }
        miv mivVar = mjlVarA.o;
        mjk mjkVar = new mjk(mjlVarA);
        synchronized (mivVar.j) {
            mivVar.o = new mit(mivVar, mjkVar);
        }
        miv mivVar2 = mjlVarA.o;
        mkr mkrVar2 = mjlVarA.D;
        mkrVar2.getClass();
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(mkrVar2, null);
        synchronized (mivVar2.j) {
            mivVar2.v = ambientController;
        }
        ovx ovxVar = mjlVarA.l;
        if (((mii) ovxVar.d).equals(mii.STATE_IDLE) || ((mii) ovxVar.d).equals(mii.STATE_PROCESSING)) {
            out outVar2 = mjlVarA.p;
            mkl mklVar = mjlVarA.B;
            mklVar.getClass();
            outVar2.c(new mir(mklVar, 18));
        }
        this.g.b(this, nkw.TIME_LAPSE, b().b());
        this.h.a(new mir(this, 1), new mir(this, 0), b().b());
        if (this.l.p(gzo.bJ)) {
            this.a.g(rbb.x, R.string.learn_about_timelapse_accessibility, R.string.mode_timelapse, false);
            b().b().d(new kxj(this, 15));
            b().b().d(this.j.dK(new lld(this, 19), ojl.ce()));
        }
        this.e.g();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (this.k == null) {
            ((sgt) b.c().M(4817)).s("Cheetah component is not initialized, aborting onBackPressed");
            return false;
        }
        mjl mjlVarA = b().a();
        boolean zA = mii.a((mii) mjlVarA.l.d);
        mjlVarA.j(1);
        return zA;
    }

    @Override // defpackage.fqf
    public final void s(Runnable runnable) {
        nrc nrcVar = this.i;
        if (nrcVar.b < nrcVar.a(nkw.TIME_LAPSE)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.fqf
    public final void w() {
    }

    @Override // defpackage.fqf
    public final void m() {
        if (this.k == null) {
            ((sgt) b.c().M(4820)).s(wzgaYJqO.hrCyFbbroSlZ);
            return;
        }
        this.e.f("Cheetah-StopModule");
        mjl mjlVarA = b().a();
        ovx ovxVar = mjlVarA.l;
        if (((mii) ovxVar.d).equals(mii.STATE_PRE_RECORDING)) {
            ((sgt) mjl.a.c().M(4866)).s("Pre-recording state, set statechart back to stop recording.");
            ovxVar.a(mii.STATE_RECORDING_ERROR);
            out outVar = mjlVarA.p;
            mkl mklVar = mjlVarA.B;
            mklVar.getClass();
            outVar.c(new mir(mklVar, 12));
        }
        mjlVarA.j(true != ((mii) ovxVar.d).equals(mii.STATE_RECORDING_ERROR) ? 7 : 9);
        if (mjlVarA.F != null) {
            mjlVarA.v.execute(new mir(mjlVarA, 13));
        }
        if (((mii) ovxVar.d).equals(mii.STATE_PROCESSING)) {
            mjlVarA.I.c(new mir(mjlVarA, 14), mjlVarA.p);
        } else {
            out outVar2 = mjlVarA.p;
            mkl mklVar2 = mjlVarA.B;
            mklVar2.getClass();
            outVar2.c(new mir(mklVar2, 15));
            mjlVarA.A.j();
            mke mkeVar = mjlVarA.C;
            synchronized (mkeVar.l) {
                AtomicBoolean atomicBoolean = mkeVar.b;
                if (atomicBoolean.get()) {
                    mkeVar.c.unregisterReceiver(mkeVar.k);
                    atomicBoolean.set(false);
                }
            }
            mjlVarA.D.f(false);
            mjlVarA.l.a(mii.STATE_UNINITIALIZED);
            mjlVarA.b(mjlVarA.f.get(), mjlVarA.g.get());
        }
        b().b().close();
        this.k = null;
        this.e.g();
    }
}
