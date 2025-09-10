package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mkr {
    public mkx A;
    public final imi B;
    public final gli C;
    public final gln D;
    public final iyu E;
    public final ktx F;
    public final luj G;
    public final hbj H;
    public final gtm I;
    public final gsn J;
    public oge K;
    private final owq M;
    private final uem N;
    private final owq O;
    private nan P;
    private nan Q;
    private final mte S;
    public final owq a;
    public final owq b;
    public final fvu e;
    public final gnt f;
    public final Context g;
    public final mts h;
    public final mua i;
    public final our j;
    public final out k;
    public final ndj l;
    public final itl m;
    public final owq n;
    public final mmk o;
    public final fuf p;
    public final lhm q;
    public final ngw s;
    public final owq t;
    public final ndo u;
    public final itk v;
    public final nqp w;
    public final glr x;
    public mky z;
    public final AtomicLong c = new AtomicLong(0);
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean L = new AtomicBoolean(false);
    public final AtomicBoolean r = new AtomicBoolean(false);
    public rwc y = rvk.a;
    private paq R = null;

    public mkr(fvu fvuVar, gnt gntVar, Context context, mts mtsVar, final mua muaVar, hbj hbjVar, our ourVar, owq owqVar, owq owqVar2, owq owqVar3, out outVar, imi imiVar, ndj ndjVar, itl itlVar, iyu iyuVar, gli gliVar, gln glnVar, uem uemVar, nqp nqpVar, mmk mmkVar, gtm gtmVar, final owq owqVar4, owq owqVar5, ktx ktxVar, luj lujVar, fuf fufVar, lhm lhmVar, ngw ngwVar, owq owqVar6, owq owqVar7, qwz qwzVar, mte mteVar) {
        this.e = fvuVar;
        this.f = gntVar;
        this.g = context;
        this.i = muaVar;
        this.H = hbjVar;
        this.k = outVar;
        this.B = imiVar;
        this.l = ndjVar;
        this.j = ourVar;
        this.m = itlVar;
        this.E = iyuVar;
        this.C = gliVar;
        this.D = glnVar;
        this.N = uemVar;
        this.M = owqVar;
        this.n = owqVar2;
        this.h = mtsVar;
        this.w = nqpVar;
        this.o = mmkVar;
        this.A = (mkx) owqVar3.dL();
        this.I = gtmVar;
        this.a = owqVar4;
        this.b = owqVar5;
        this.F = ktxVar;
        if (hbjVar.p(gzy.j)) {
            hbjVar.p(gzy.k);
        }
        this.G = lujVar;
        this.p = fufVar;
        this.q = lhmVar;
        this.s = ngwVar;
        this.O = owqVar6;
        this.t = owqVar7;
        this.S = mteVar;
        this.J = new mko(this);
        this.u = new mkp(this);
        this.v = new mkq(this, qwzVar, 0);
        this.x = new glr() { // from class: mkn
            @Override // defpackage.glr
            public final void a(int i) {
                mkr mkrVar = this.a;
                if (mkrVar.K != null) {
                    owq owqVar8 = owqVar4;
                    mky mkyVar = mkrVar.z;
                    mkyVar.getClass();
                    mkx mkxVar = (mkx) mkyVar.h.get(i);
                    mkrVar.A = mkxVar;
                    oge ogeVar = mkrVar.K;
                    mjl mjlVar = (mjl) ogeVar.b;
                    mjlVar.u.a(mkxVar);
                    mjlVar.t.a(Double.valueOf(mjlVar.N.b(mkxVar)));
                    ((mkr) ogeVar.a).q.c();
                    if (((Boolean) owqVar8.dL()).booleanValue()) {
                        muaVar.f();
                    }
                }
            }
        };
    }

    final void a() {
        this.l.O(false);
    }

    final void b() {
        this.l.O(true);
    }

    public final void c(float f) {
        this.k.c(new jbj(this, f, 4));
    }

    public final void d() {
        this.e.q(true);
    }

    final void e(boolean z) {
        this.L.set(z);
    }

    final void f(boolean z) {
        if (this.P == null) {
            nao naoVar = new nao();
            naoVar.j = 2;
            naoVar.a = true;
            Context context = this.g;
            naoVar.h = context;
            naoVar.e = context.getResources().getString(R.string.vid_chip_low_battery_warning);
            this.P = naoVar.a();
        }
        if (z) {
            this.B.a(this.P);
        } else {
            this.B.f(this.P);
        }
    }

    final void g(boolean z) {
        if (this.H.p(haw.i)) {
            if (this.Q == null) {
                nao naoVar = new nao();
                naoVar.j = 2;
                naoVar.a = true;
                Context context = this.g;
                naoVar.h = context;
                naoVar.e = context.getResources().getString(R.string.notification_static_recording_af_locked);
                naoVar.f = context.getResources().getString(R.string.notification_static_recording_af_locked_announcement);
                this.Q = naoVar.a();
            }
            if (z && k() && this.f.i()) {
                this.B.a(this.Q);
            } else {
                this.B.f(this.Q);
            }
        }
    }

    public final void h(Runnable runnable, boolean z) {
        this.k.c(new lqd(this.s.e, (Object) (z ? nkw.TIME_LAPSE : nkw.UNINITIALIZED), (Object) runnable, 10, (short[]) null));
    }

    final void i() {
        owq owqVar = this.b;
        if (!((fyx) owqVar.dL()).a()) {
            this.R = this.S.c();
        }
        if (!((Boolean) ((ovx) this.O).d).booleanValue()) {
            this.k.c(new mjh(this, 12));
        }
        this.a.a(true);
        owqVar.a(fyx.RECORDING);
        this.o.d(true);
        this.q.c();
        if (this.A.equals(mkx.AUTO)) {
            this.C.f(false);
        } else {
            gln glnVar = this.D;
            glnVar.c(glnVar.m);
            if (this.H.p(haw.j)) {
                glnVar.i(0);
                glnVar.c(0);
            }
        }
        this.t.a(false);
        this.D.k = false;
    }

    final void j() {
        boolean z = this.z.a(((Double) this.M.dL()).doubleValue()) != 1.0d;
        mty mtyVarA = mtz.a();
        mtyVarA.e(z);
        mtyVarA.d(true);
        mtz mtzVarA = mtyVarA.a();
        mua muaVar = this.i;
        muaVar.e(mtzVarA);
        muaVar.getClass();
        this.k.c(new mjh(muaVar, 9));
        rwc rwcVarJ = rwc.j(((gdn) this.N).a());
        this.y = rwcVarJ;
        ((gdm) rwcVarJ.c()).h();
        paq paqVar = this.R;
        if (paqVar != null) {
            paqVar.close();
            this.R = null;
        }
    }

    final boolean k() {
        return ((Boolean) this.a.dL()).booleanValue();
    }

    final boolean l() {
        return (this.d.get() || this.L.get()) ? false : true;
    }
}
