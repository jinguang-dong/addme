package defpackage;

import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msi implements msk {
    public fqf a;
    public msk b;
    private final msh c;
    private final mqb d;
    private final owq e;
    private final ndj f;
    private final out g;
    private final HotshotController h;
    private final owf i;
    private final owf j;
    private boolean k = false;
    private int l = -1;
    private final mbj m;
    private final luj n;
    private final mdy o;
    private final hbj p;

    public msi(msh mshVar, mqb mqbVar, owq owqVar, ndj ndjVar, mbj mbjVar, out outVar, HotshotController hotshotController, luj lujVar, mdy mdyVar, owf owfVar, hbj hbjVar, owf owfVar2) {
        this.c = mshVar;
        this.d = mqbVar;
        this.e = owqVar;
        this.m = mbjVar;
        this.f = ndjVar;
        this.g = outVar;
        this.h = hotshotController;
        this.n = lujVar;
        this.o = mdyVar;
        this.i = owfVar;
        this.p = hbjVar;
        this.j = owfVar2;
    }

    private final boolean j() {
        return ((Boolean) this.i.dL()).booleanValue() || ((Boolean) this.j.dL()).booleanValue();
    }

    private final int k() {
        HotshotController hotshotController = this.h;
        if (hotshotController.t() && ((ltw) this.e.dL()).equals(ltw.OFF)) {
            return hotshotController.x();
        }
        return 1;
    }

    private final void l(int i, int i2) {
        this.m.g(i, i2);
    }

    @Override // defpackage.msk
    public final void b() {
        fqf fqfVar = this.a;
        if (fqfVar == null || fqfVar.t) {
            msk mskVar = this.b;
            if (mskVar != null) {
                mskVar.b();
            }
            this.d.d();
            int iK = k();
            if (j()) {
                l(R.raw.astro_countdown_start, iK);
            } else {
                l(R.raw.timer_start, iK);
            }
        }
    }

    @Override // defpackage.msk
    public final void c(int i) {
        this.l = i;
        msk mskVar = this.b;
        if (mskVar != null) {
            mskVar.c(i);
        }
        int iK = k();
        if (j()) {
            if (i == 1) {
                l(R.raw.astro_countdown_final, iK);
                return;
            } else {
                if (i > 4 || i < 2) {
                    return;
                }
                l(R.raw.astro_countdown_increment, iK);
                return;
            }
        }
        if (i == 1) {
            l(R.raw.timer_final, iK);
        } else if (i == 2 || i == 3) {
            l(R.raw.timer_increment, iK);
        }
    }

    public final void d(fqf fqfVar, msk mskVar, our ourVar) {
        this.a = fqfVar;
        this.b = mskVar;
        ndj ndjVar = this.f;
        ndjVar.getClass();
        ourVar.d(this.e.dK(new lqn(ndjVar, 20), this.g));
        ourVar.d(new khc(this, 16));
        ourVar.d(new khc(this, 17));
    }

    public final void e(int i) {
        this.l = i;
        msh mshVar = this.c;
        mshVar.o = this;
        mshVar.c(i);
    }

    @Override // defpackage.msk
    public final void ev(boolean z) {
        this.k = false;
        this.l = 0;
        fqf fqfVar = this.a;
        if (fqfVar == null || fqfVar.t) {
            msk mskVar = this.b;
            if (mskVar != null) {
                mskVar.ev(z);
            }
            this.d.e();
            fqf fqfVar2 = this.a;
            if (fqfVar2 != null) {
                fqfVar2.n();
            }
        }
    }

    public final void f(int i) {
        this.k = true;
        e(i);
    }

    public final void g() {
        if (this.a == null) {
            return;
        }
        if (this.c.d()) {
            h();
            return;
        }
        int i = ((ltw) this.e.dL()).h;
        if (i > 0) {
            e(i);
            return;
        }
        fqf fqfVar = this.a;
        if (fqfVar != null) {
            fqfVar.n();
        }
    }

    public final boolean h() {
        if (this.k) {
            int iK = hgc.k(this.p, this.n);
            int i = iK == 2 ? 3 : iK == 1 ? 2 : iK == 3 ? 4 : 1;
            owq owqVar = this.e;
            int i2 = ((ltw) owqVar.dL()).equals(ltw.THREE) ? 3 : ((ltw) owqVar.dL()).equals(ltw.FIVE) ? 4 : ((ltw) owqVar.dL()).equals(ltw.TEN) ? 5 : ((ltw) owqVar.dL()).equals(ltw.OFF) ? 2 : 1;
            tpc tpcVarM = ssl.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            ssl sslVar = (ssl) tphVar;
            sslVar.c = i - 1;
            sslVar.b |= 1;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            ssl sslVar2 = (ssl) tphVar2;
            sslVar2.d = i2 - 1;
            sslVar2.b |= 2;
            int i3 = this.l;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            ssl sslVar3 = (ssl) tpcVarM.b;
            sslVar3.b = 4 | sslVar3.b;
            sslVar3.e = i3;
            this.o.x(22, null, null, null, null, null, (ssl) tpcVarM.l(), null);
            this.k = false;
        }
        msh mshVar = this.c;
        if (!mshVar.d()) {
            return false;
        }
        msk mskVar = this.b;
        if (mskVar != null) {
            mskVar.ev(true);
        }
        this.d.c();
        mshVar.a();
        return true;
    }

    public final boolean i() {
        return this.c.d();
    }
}
