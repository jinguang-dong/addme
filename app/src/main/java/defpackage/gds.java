package defpackage;

import android.content.res.Resources;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gds implements mho {
    public final mhq a;
    public final out b;
    public final pnq c;
    public final gdu d;
    public final gdu e;
    public final gdu f;
    public final gdu g;
    public final naw h;
    public gjw j;
    public sbp k;
    public paq l;
    public fxm n;
    public final hbj o;
    public final gtm p;
    private final luj q;
    public final Object i = new Object();
    public boolean m = false;

    public gds(Resources resources, naw nawVar, gtm gtmVar, krj krjVar, gbg gbgVar, mhq mhqVar, final mhr mhrVar, final mhr mhrVar2, mhp mhpVar, out outVar, luj lujVar, luj lujVar2, hbj hbjVar, pnq pnqVar) {
        final int i = 0;
        this.h = nawVar;
        this.p = gtmVar;
        this.a = mhqVar;
        this.b = outVar;
        this.q = lujVar2;
        this.o = hbjVar;
        this.c = pnqVar;
        reb rebVar = new reb((char[]) null);
        rebVar.i(outVar);
        rebVar.d = "VideoRecording";
        rebVar.h(false);
        gzg gzgVar = gym.aq;
        rebVar.j(hbjVar.p(gzgVar) ? mhp.HEAT_EMERGENCY : mhrVar2.b);
        rebVar.a = new gdt(this) { // from class: gdr
            public final /* synthetic */ gds a;

            {
                this.a = this;
            }

            @Override // defpackage.gdt
            public final mhp a(gaw gawVar) {
                if (i != 0) {
                    boolean zG = this.a.g(gawVar);
                    mhr mhrVar3 = mhrVar2;
                    return zG ? mhrVar3.a : mhrVar3.b;
                }
                boolean zG2 = this.a.g(gawVar);
                mhr mhrVar4 = mhrVar2;
                return zG2 ? mhrVar4.a : mhrVar4.b;
            }
        };
        rebVar.b = new gbh(this, nawVar, 4);
        rebVar.c = new gbh(this, nawVar, 5);
        this.d = rebVar.g();
        reb rebVar2 = new reb((char[]) null);
        rebVar2.i(outVar);
        rebVar2.h(false);
        rebVar2.d = "PoorVideoQualityWarning";
        mhp mhpVar2 = mhp.HEAT_CRITICAL;
        rebVar2.j(mhpVar2);
        rebVar2.b = new gba(nawVar, 14);
        rebVar2.c = new gba(nawVar, 15);
        this.e = rebVar2.g();
        reb rebVar3 = new reb((char[]) null);
        rebVar3.i(outVar);
        rebVar3.h(false);
        rebVar3.d = "VideoTorch";
        rebVar3.j(mhpVar);
        rebVar3.b = new eml(this, lujVar, resources, krjVar, nawVar, 2);
        rebVar3.c = new gbh(this, nawVar, 3);
        this.f = rebVar3.g();
        reb rebVar4 = new reb((char[]) null);
        rebVar4.i(outVar);
        rebVar4.d = "VideoDisplay";
        rebVar4.h(false);
        rebVar4.j(hbjVar.p(gzgVar) ? mhpVar2 : mhrVar.b);
        final int i2 = 1;
        rebVar4.a = new gdt(this) { // from class: gdr
            public final /* synthetic */ gds a;

            {
                this.a = this;
            }

            @Override // defpackage.gdt
            public final mhp a(gaw gawVar) {
                if (i2 != 0) {
                    boolean zG = this.a.g(gawVar);
                    mhr mhrVar3 = mhrVar;
                    return zG ? mhrVar3.a : mhrVar3.b;
                }
                boolean zG2 = this.a.g(gawVar);
                mhr mhrVar4 = mhrVar;
                return zG2 ? mhrVar4.a : mhrVar4.b;
            }
        };
        rebVar4.b = new gba(gbgVar, 11);
        rebVar4.c = new gba(gbgVar, 12);
        this.g = rebVar4.g();
    }

    public final synchronized mhp a() {
        return this.a.a();
    }

    public final void b() {
        paq paqVar = this.l;
        if (paqVar != null) {
            paqVar.close();
            this.l = null;
        }
    }

    public final void c(boolean z) {
        this.q.d(luf.K, Boolean.valueOf(z));
    }

    @Override // defpackage.mho
    public final synchronized void d(mhp mhpVar) {
        sbp sbpVar = this.k;
        int size = sbpVar.size();
        for (int i = 0; i < size; i++) {
            ((mho) sbpVar.get(i)).d(mhpVar);
        }
    }

    public final boolean e() {
        return this.j.m();
    }

    public final boolean f(String str) {
        Optional optionalFindFirst = Collection.EL.stream(this.k).filter(new fme(str, 5)).findFirst();
        return optionalFindFirst.isPresent() && a().a(((gdu) optionalFindFirst.get()).a());
    }

    public final boolean g(gaw gawVar) {
        if (gawVar.s) {
            return false;
        }
        hbj hbjVar = this.o;
        if (hbjVar.p(gym.F) && gawVar.d.e() && gawVar.c == oxh.FPS_60) {
            return true;
        }
        return hbjVar.p(gym.ag) && gawVar.d.d() && gawVar.c == oxh.FPS_60;
    }
}
