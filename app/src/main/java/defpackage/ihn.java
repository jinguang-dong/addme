package defpackage;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihn implements mho, jhh, jhc, jhe {
    private final List a;
    private final mhq b;
    private final mhp c;
    private final nas d;
    private final luj e;
    private final hbj f;

    public ihn(Executor executor, hbj hbjVar, owq owqVar, mhp mhpVar, mhp mhpVar2, luj lujVar, nas nasVar, gnt gntVar, fdq fdqVar, owq owqVar2, out outVar, jgt jgtVar, krj krjVar, mhq mhqVar) {
        Object objA;
        Object obj;
        out outVar2;
        Object objA2;
        this.f = hbjVar;
        this.e = lujVar;
        this.b = mhqVar;
        this.c = mhpVar2;
        this.d = nasVar;
        if (hbjVar.p(gzs.aa)) {
            mhs mhsVar = new mhs();
            mhsVar.c(executor);
            mhsVar.d("HdrNet");
            mhsVar.e(new hjp(owqVar, 13));
            mhsVar.f(new hjp(owqVar, 14));
            mhsVar.g(mhpVar);
            objA = mhsVar.a();
        } else {
            objA = mhi.a;
        }
        if (mwq.z() && hbjVar.p(gzs.an)) {
            fdqVar.j().d(owqVar2.dK(new fcd(gntVar, owqVar2, nasVar, 2), outVar));
            fdqVar.j().d(gntVar.dK(new kzv(lujVar, gntVar, krjVar, owqVar2, nasVar, 1), executor));
            mhs mhsVar2 = new mhs();
            mhsVar2.c(executor);
            mhsVar2.d("HdrPlusTorch");
            outVar2 = outVar;
            obj = objA;
            mhsVar2.e(new hym(this, gntVar, lujVar, krjVar, owqVar2, nasVar, 3));
            mhsVar2.f(new cmc(this, nasVar, 20, null));
            mhsVar2.g(mhpVar2);
            objA2 = mhsVar2.a();
        } else {
            obj = objA;
            outVar2 = outVar;
            objA2 = mhi.a;
        }
        this.a = sbp.m(obj, objA2);
        outVar2.c(new img(this, jgtVar, 1));
    }

    public static final boolean e(gnt gntVar, nkw nkwVar) {
        return gntVar.j() ? nkwVar.equals(nkw.PHOTO) || nkwVar.equals(nkw.PORTRAIT) || nkwVar.equals(nkw.NIGHT_SIGHT) : nkwVar.equals(nkw.PHOTO) || nkwVar.equals(nkw.PORTRAIT);
    }

    public static final boolean f(gnt gntVar, luj lujVar, krj krjVar, owq owqVar) {
        return ((gntVar.i() && ((String) ((ovx) lujVar.a(luf.v)).d).equals("on") && krjVar.f) || (gntVar.j() && (((String) ((ovx) lujVar.a(luf.x)).d).equals("on") || ((String) ((ovx) lujVar.a(luf.J)).d).equals("torch")))) && e(gntVar, (nkw) owqVar.dL());
    }

    public final void a(boolean z) {
        if (this.f.p(gzs.an)) {
            this.e.d(luf.L, Boolean.valueOf(!z));
        }
    }

    @Override // defpackage.mho
    public final synchronized void d(mhp mhpVar) {
        sgk it = ((sbp) this.a).iterator();
        while (it.hasNext()) {
            ((mho) it.next()).d(mhpVar);
        }
    }

    @Override // defpackage.jhc
    public final void ea() {
        a(true);
        this.d.b();
    }

    @Override // defpackage.jhe
    public final void eb() {
        if (this.b.a().a(this.c)) {
            a(false);
        }
    }
}
