package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbk implements gbg, jhh, jhg {
    public final gbe a;
    ContentObserver b;
    boolean c;
    boolean d;
    public boolean e;
    private final gdi f;
    private final pnq g;
    private final owf i;
    private final owf j;
    private boolean l;
    private final hbj m;
    private final ngw n;
    private final ocq o;
    private final Object h = new Object();
    private gbj k = gbj.UNINITIALIZED;

    public gbk(jgt jgtVar, ngw ngwVar, gdi gdiVar, pnq pnqVar, gbe gbeVar, out outVar, ocq ocqVar, hbj hbjVar, luj lujVar, owf owfVar) {
        this.n = ngwVar;
        this.f = gdiVar;
        this.g = pnqVar;
        this.a = gbeVar;
        this.o = ocqVar;
        this.m = hbjVar;
        this.j = owfVar;
        this.i = owl.h(lujVar.a(luf.F), new fhy(12));
        outVar.c(new gbh(this, jgtVar, 0));
    }

    private final boolean g() {
        return this.l && ((Boolean) this.i.dL()).booleanValue();
    }

    @Override // defpackage.gbg
    public final rwc a() {
        rwc rwcVarJ;
        synchronized (this.h) {
            tpc tpcVarM = sue.a.m();
            boolean zEquals = this.k.equals(gbj.STARTED);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            sue sueVar = (sue) tphVar;
            sueVar.b |= 1;
            sueVar.c = zEquals;
            boolean z = this.d;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            sue sueVar2 = (sue) tphVar2;
            sueVar2.b |= 2;
            sueVar2.d = z;
            boolean z2 = this.e;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            sue sueVar3 = (sue) tpcVarM.b;
            sueVar3.b |= 4;
            sueVar3.e = z2;
            boolean zG = g();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sue sueVar4 = (sue) tpcVarM.b;
            sueVar4.b |= 8;
            sueVar4.f = zG;
            rwcVarJ = rwc.j((sue) tpcVarM.l());
        }
        return rwcVarJ;
    }

    @Override // defpackage.gbg
    public final void b(gaw gawVar) {
        synchronized (this.h) {
            boolean z = true;
            if (!this.m.p(gym.ao)) {
                oxj oxjVar = gawVar.d;
                if ((!oxjVar.e() || !gawVar.c.equals(oxh.FPS_60)) && (!oxjVar.d() || !gawVar.c.equals(oxh.FPS_60))) {
                    z = false;
                }
            }
            this.c = z;
            this.l = gawVar.B.equals(pka.FRONT);
            gdi gdiVar = this.f;
            gdiVar.getClass();
            this.b = new gbi(this, gdiVar.a());
            this.k = gbj.INITIALIZED;
        }
    }

    @Override // defpackage.gbg
    public final void c(boolean z) {
        this.e = z;
    }

    @Override // defpackage.gbg
    public final void d() {
        pnq pnqVar = this.g;
        boolean zR = this.o.r();
        int iIntValue = (pnqVar.u && ((muj) this.j.dL()).b == 2) ? ((Integer) this.m.a(gym.l).get()).intValue() : ((Integer) this.m.a(gym.k).get()).intValue();
        gbe gbeVar = this.a;
        int iA = gbeVar.a();
        gbeVar.a();
        boolean zG = g();
        if (zR || iA > iIntValue || zG) {
            return;
        }
        if (this.e || (this.c && !this.d)) {
            synchronized (this.h) {
                rnt.O(this.k.equals(gbj.INITIALIZED) || this.k.equals(gbj.STOPPED), "Cannot start from %s", this.k);
                gbeVar.d(2, true);
                if (this.b != null) {
                    ((ContentResolver) this.n.c).registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.b);
                }
                this.k = gbj.STARTED;
            }
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.d = false;
    }

    @Override // defpackage.gbg
    public final void f() {
        synchronized (this.h) {
            if (this.k.equals(gbj.STARTED)) {
                this.a.b();
                ContentObserver contentObserver = this.b;
                if (contentObserver != null) {
                    ((ContentResolver) this.n.c).unregisterContentObserver(contentObserver);
                }
                this.k = gbj.STOPPED;
            }
        }
    }
}
