package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ftv {
    private static final sgv w = sgv.g("ftv");
    private final owq A;
    private final hyd B;
    private final jjn C;
    private final owf D;
    private final owf E;
    private final owf F;
    private final imi J;
    private final kqy K;
    private final hbj L;
    public final owq a;
    public final owq c;
    public final owf d;
    public final owq e;
    public final owq f;
    public final owq g;
    public final owq h;
    public final owf i;
    public final tzj j;
    public final owq k;
    public Context l;
    public nan m;
    public AccessibilityManager.TouchExplorationStateChangeListener q;
    public final mtm s;
    public final mdy t;
    public AmbientMode.AmbientController u;
    public final ocq v;
    private final hyh x;
    private final out y;
    private final owq z;
    public final owq b = new ovx(false);
    public nkw n = nkw.UNINITIALIZED;
    public boolean o = false;
    public our p = new our();
    private boolean G = false;
    private boolean H = false;
    public boolean r = false;
    private boolean I = false;

    public ftv(owq owqVar, hyh hyhVar, out outVar, imi imiVar, mdy mdyVar, owq owqVar2, luj lujVar, owf owfVar, hbj hbjVar, kqy kqyVar, hyd hydVar, owq owqVar3, mtm mtmVar, ocq ocqVar, owf owfVar2, owf owfVar3, owq owqVar4, owq owqVar5, owq owqVar6, jjn jjnVar, tzj tzjVar, owq owqVar7, owf owfVar4, owf owfVar5) {
        this.x = hyhVar;
        this.y = outVar;
        this.a = owqVar;
        this.J = imiVar;
        this.t = mdyVar;
        this.d = owfVar;
        this.e = owqVar2;
        this.z = lujVar.a(luf.v);
        this.A = lujVar.a(luf.x);
        this.L = hbjVar;
        this.K = kqyVar;
        this.B = hydVar;
        this.h = owqVar3;
        this.s = mtmVar;
        this.v = ocqVar;
        this.D = owfVar2;
        this.i = owfVar3;
        this.f = owqVar4;
        this.g = owqVar5;
        this.c = owqVar6;
        this.C = jjnVar;
        this.j = tzjVar;
        this.k = owqVar7;
        this.E = owfVar4;
        this.F = owfVar5;
    }

    private final synchronized void A(boolean z, nan nanVar) {
        if (z) {
            if (!this.r) {
                this.J.a(nanVar);
                return;
            }
        }
        this.J.f(nanVar);
    }

    private final void B(int i, boolean z) {
        mtm mtmVar = this.s;
        if (mtmVar.m) {
            mtmVar.v(a(((Boolean) this.a.dL()).booleanValue(), (fug) this.h.dL(), this.n), i, z);
        } else {
            mtmVar.n(true);
        }
    }

    public static boolean q(kox koxVar, ltw ltwVar, jjq jjqVar, boolean z) {
        return (koxVar.e == 3 || ltwVar != ltw.OFF || jjqVar.f.isPresent() || jjqVar.g.isPresent() || z) ? false : true;
    }

    private final owq u() {
        return (this.o || ((Boolean) this.E.dL()).booleanValue()) ? this.A : this.z;
    }

    private final void v(owf owfVar) {
        this.p.d(owb.a(owfVar).dK(new fpe(this, 7), this.y));
    }

    private final void w(nkw nkwVar) {
        if (this.L.p(hac.L) && nkwVar.equals(nkw.NIGHT_SIGHT) && !this.o) {
            this.s.m(mtp.ASTRO, mtq.ENABLED);
        } else {
            this.k.a(false);
            this.s.m(mtp.ASTRO, mtq.GONE);
        }
        if (nkwVar.equals(nkw.NIGHT_SIGHT)) {
            this.s.m(mtp.OFF, mtq.GONE);
        } else {
            this.s.m(mtp.OFF, mtq.ENABLED);
        }
        if (((Boolean) this.D.dL()).booleanValue()) {
            this.s.m(mtp.AUTO, mtq.INACTIVE);
        } else {
            this.s.m(mtp.AUTO, mtq.ENABLED);
        }
        if (r()) {
            this.s.m(mtp.MAX, mtq.ENABLED);
        } else {
            mtm mtmVar = this.s;
            mtmVar.p(null);
            mtmVar.m(mtp.MAX, mtq.GONE);
        }
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        this.u = ambientController;
        this.s.a.add(ambientController);
        this.p.d(new fis(this, 10));
    }

    private final void x(nkw nkwVar) {
        this.p.d(owl.a(this.a, this.h, this.k).dK(new fcs(this, nkwVar, 5), this.y));
    }

    private final synchronized void y(boolean z) {
        this.K.g(z, R.drawable.gs_night_sight_auto_vd_theme_24, R.string.flash_ns_desc, "AutoNightSightToggleControllerImpl", krs.NIGHT_FRONT_PHOTO_FLASH);
    }

    private final synchronized void z(boolean z) {
        A(z, this.m);
    }

    public final mtp a(boolean z, fug fugVar, nkw nkwVar) {
        return (nkwVar == nkw.NIGHT_SIGHT || z) ? ((Boolean) this.D.dL()).booleanValue() ? mtp.MAX : fugVar.ordinal() != 1 ? mtp.AUTO : mtp.MAX : mtp.OFF;
    }

    public final paq b(nkw nkwVar, kow kowVar, owf owfVar) {
        if (!this.p.b()) {
            this.p.close();
        }
        this.p = new our();
        this.n = nkwVar;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        int i = 9;
        int i2 = 8;
        int i3 = 11;
        int i4 = 10;
        int i5 = 6;
        int i6 = 1;
        if (iOrdinal == 1 || iOrdinal == 6) {
            our ourVar = this.p;
            fpe fpeVar = new fpe(this, i4);
            out outVar = this.y;
            ourVar.d(kowVar.dK(fpeVar, outVar));
            this.p.d(this.e.dK(new fcs(this, kowVar, 4), outVar));
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.q;
            if (touchExplorationStateChangeListener != null) {
                this.v.X(touchExplorationStateChangeListener);
            }
            ocq ocqVar = this.v;
            rii riiVar = new rii(this, kowVar, i6);
            this.q = riiVar;
            ocqVar.W(riiVar);
            this.p.d(new fis(this, 7));
            this.p.d(owl.a(this.A, this.z).dK(new fpe(this, i3), outVar));
            our ourVar2 = this.p;
            owq owqVar = this.b;
            ourVar2.d(owl.a(this.c, owqVar).dK(new fpe(this, i2), outVar));
            our ourVar3 = this.p;
            hyh hyhVar = this.x;
            ourVar3.d(hyhVar.d().dK(new fpe(this, 12), outVar));
            this.p.d(hyhVar.b.dK(new fpe(this, 5), outVar));
            this.p.d(owqVar.dK(new fpe(this, i), outVar));
            this.p.d(owb.a(this.i).dK(new fcs(this, kowVar, i5), outVar));
            x(nkwVar);
            w(nkwVar);
            if (r()) {
                v(owfVar);
            }
        } else if (iOrdinal == 10) {
            x(nkwVar);
            w(nkwVar);
            if (this.L.p(hac.L)) {
                this.p.d(this.F.dK(new fpe(this, i5), this.y));
            }
            if (r()) {
                owq owqVar2 = this.b;
                owqVar2.a(true);
                owq owqVar3 = this.c;
                owqVar3.a(true);
                v(owfVar);
                o(((Boolean) owqVar3.dL()).booleanValue(), ((Boolean) ((ovx) owqVar2).d).booleanValue());
            }
        } else {
            if (iOrdinal != 11) {
                throw new IllegalStateException("Not supported for mode ".concat(String.valueOf(String.valueOf(nkwVar))));
            }
            this.a.a(true);
        }
        this.p.d(new fis(this, i2));
        return new fis(this, i);
    }

    public final void c(boolean z) {
        this.I = false;
        if (r()) {
            B(true != z ? 2 : 1, false);
        }
    }

    public final void d() {
        f(true);
    }

    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        this.s.f(z);
    }

    public final void g() {
        o(((Boolean) this.c.dL()).booleanValue(), ((Boolean) ((ovx) this.b).d).booleanValue());
    }

    public final void h() {
        if (r() || this.n != nkw.NIGHT_SIGHT) {
            d();
        }
    }

    public final synchronized void i(boolean z) {
        if (this.L.p(hac.H)) {
            y(z);
        } else {
            z(z);
        }
    }

    public final synchronized void j() {
        this.r = true;
        e();
        i(false);
    }

    public final synchronized void k() {
        this.r = false;
        hyh hyhVar = this.x;
        if (((Boolean) hyhVar.d().dL()).booleanValue()) {
            h();
            i(((Boolean) hyhVar.b.dL()).booleanValue());
        }
    }

    public final void l(Duration duration) {
        if (((Boolean) this.k.dL()).booleanValue()) {
            return;
        }
        if (this.n.equals(nkw.NIGHT_SIGHT) || ((Boolean) this.a.dL()).booleanValue()) {
            if (duration.isNegative() || duration.isZero()) {
                ((sgt) w.c().M(389)).u("Invalid capture duration %s", duration.toMillis());
                duration = Duration.ofSeconds(1L);
            }
            this.s.p(duration);
        }
    }

    public final void m(Duration duration, int i) {
        if (r()) {
            mtm mtmVar = this.s;
            if (mtmVar.t()) {
                if (i == 0) {
                    this.I = false;
                    mtmVar.q(duration, true);
                    return;
                }
                if (i != 100) {
                    if (!this.I) {
                        this.I = true;
                        boolean z = this.H && this.G;
                        Duration duration2 = mtmVar.n;
                        if (duration2 != null) {
                            mtmVar.m = true;
                            for (AmbientMode.AmbientController ambientController : mtmVar.a) {
                            }
                            mtmVar.k.setEnabled(false);
                            mtmVar.j.m(false, true);
                            double dC = mtmVar.k.c();
                            Duration duration3 = mtmVar.n;
                            if (duration3 != null) {
                                long millis = duration3.toMillis();
                                mtmVar.l = new mtj(mtmVar, millis, millis, dC, z);
                                mtmVar.l.start();
                            }
                            mtmVar.o.h(mtmVar.i.getString(R.string.start_countdown_announce_desc, Long.valueOf(mtm.x(duration2))));
                            return;
                        }
                        return;
                    }
                    if (i != 100) {
                        return;
                    }
                }
                this.I = false;
                if (mtmVar.m) {
                    int i2 = 3;
                    if (this.H && this.G) {
                        i2 = 1;
                    }
                    B(i2, true);
                }
            }
        }
    }

    public final synchronized void n() {
        boolean zBooleanValue;
        if (!((String) ((ovx) u()).d).equals("on") && ((String) ((ovx) u()).d).equals("ns") != (zBooleanValue = ((Boolean) ((ovx) this.b).d).booleanValue())) {
            if (zBooleanValue) {
                u().a("ns");
            } else {
                u().a("off");
            }
        }
    }

    public final void o(boolean z, boolean z2) {
        if (!z) {
            if (r()) {
                this.s.p(Duration.ZERO);
            } else {
                this.s.p(null);
            }
            d();
            return;
        }
        if (r()) {
            if (!z2) {
                this.s.p(Duration.ZERO);
                return;
            }
            owq owqVar = this.f;
            if (((Optional) owqVar.dL()).isPresent()) {
                l((Duration) ((Optional) owqVar.dL()).get());
            }
        }
    }

    public final synchronized void p() {
        String str = (String) ((ovx) u()).d;
        owq owqVar = this.b;
        boolean zBooleanValue = ((Boolean) ((ovx) owqVar).d).booleanValue();
        if (str.equals("ns")) {
            zBooleanValue = true;
        } else if (str.equals("off")) {
            zBooleanValue = false;
        }
        if (((Boolean) ((ovx) owqVar).d).booleanValue() != zBooleanValue) {
            owqVar.a(Boolean.valueOf(zBooleanValue));
            t(zBooleanValue, 3);
        }
    }

    public final boolean r() {
        return this.B.h;
    }

    public final void s(Duration duration) {
        if (r()) {
            B(2, false);
            this.H = this.C.A();
            mtm mtmVar = this.s;
            this.G = mtmVar.t();
            if (duration.compareTo(fue.a) < 0) {
                gzi gziVar = hac.a;
                e();
            } else {
                mtmVar.A(this.G);
                mtmVar.n(false);
            }
        }
    }

    public final void t(boolean z, int i) {
        mdy mdyVar = this.t;
        if (mdyVar != null) {
            float fFloatValue = ((Float) this.d.dL()).floatValue();
            nkw nkwVar = this.n;
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.CATSHARK_TOGGLE_CHANGE_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = sou.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            sou souVar = (sou) tphVar;
            souVar.b |= 1;
            souVar.c = z;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            sou souVar2 = (sou) tphVar2;
            souVar2.b |= 2;
            souVar2.d = fFloatValue;
            ssc sscVar = nkwVar.v;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            sou souVar3 = (sou) tphVar3;
            souVar3.e = sscVar.T;
            souVar3.b |= 4;
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            sou souVar4 = (sou) tpcVarM2.b;
            souVar4.f = i - 1;
            souVar4.b |= 8;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            sou souVar5 = (sou) tpcVarM2.l();
            souVar5.getClass();
            sodVar2.ad = souVar5;
            sodVar2.d |= 8;
            mdyVar.I(tpcVarM);
        }
    }
}
