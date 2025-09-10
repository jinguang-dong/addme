package defpackage;

import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhn implements PowerManager.OnThermalStatusChangedListener, mhq, jhh, jgl, jgm {
    private static final sgv c = sgv.g("mhn");
    public final List a = new ArrayList();
    private final mhm d;
    private boolean e;
    private mhp f;
    private mhp g;
    private final mdy h;

    public mhn(mdy mdyVar, mhm mhmVar, jgj jgjVar, out outVar) {
        mhp mhpVar = mhp.i;
        this.f = mhpVar;
        this.g = mhpVar;
        this.h = mdyVar;
        this.d = mhmVar;
        gzi gziVar = gzo.a;
        synchronized (this) {
            if (!this.e) {
                mhmVar.b(this);
                this.e = true;
            }
        }
        ins.f(outVar, jgjVar, this);
    }

    @Override // defpackage.mhq
    public final synchronized mhp a() {
        return this.f;
    }

    @Override // defpackage.jgl
    public final void b() {
        this.g = (mhp) b.get(Integer.valueOf(this.d.a()));
    }

    @Override // defpackage.jgm
    public final void c() {
        mhp mhpVar = (mhp) b.get(Integer.valueOf(this.d.a()));
        mhp mhpVar2 = this.g;
        if (mhpVar == null || mhpVar2 == null) {
            ((sgt) c.c().M(4772)).s("Skip logging due to unknown thermal status");
            return;
        }
        mdy mdyVar = this.h;
        tpc tpcVarM = stw.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        stw stwVar = (stw) tphVar;
        stwVar.e = 2;
        stwVar.b |= 16;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        int i = mhpVar2.j;
        tph tphVar2 = tpcVarM.b;
        stw stwVar2 = (stw) tphVar2;
        if (i == 0) {
            throw null;
        }
        stwVar2.d = i - 1;
        stwVar2.b |= 8;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        int i2 = mhpVar.j;
        stw stwVar3 = (stw) tpcVarM.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        stwVar3.c = i3;
        stwVar3.b |= 4;
        mdyVar.l((stw) tpcVarM.l());
    }

    @Override // defpackage.mhq
    public final paq d(mho mhoVar) {
        mhp mhpVar;
        synchronized (this) {
            this.a.add(mhoVar);
            mhpVar = this.f;
        }
        if (mhpVar != mhp.i) {
            mhoVar.d(mhpVar);
        }
        return new ktu(this, mhoVar, 9);
    }

    public final synchronized void e() {
        if (this.e) {
            ((sgt) c.c().M(4774)).s("Was already registered as ThermalStatusListener on AppStart");
        } else {
            this.d.b(this);
        }
        this.e = true;
    }

    public final synchronized void f() {
        if (this.e) {
            final mhm mhmVar = this.d;
            mhmVar.e.execute(new Runnable() { // from class: mhl
                @Override // java.lang.Runnable
                public final void run() {
                    mhm mhmVar2 = mhmVar;
                    PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = this;
                    synchronized (mhmVar2) {
                        if (mhmVar2.d) {
                            mhmVar2.b.removeThermalStatusListener(onThermalStatusChangedListener);
                            return;
                        }
                        ((sgt) mhm.a.c().M(4767)).s("removeThermalStatusListener called, but listener not yet registered.");
                        rnt.M(mhmVar2.c, "Listener is neither registered, nor waiting to be registered.");
                        mhmVar2.c = false;
                    }
                }
            });
        } else {
            ((sgt) c.c().M(4776)).s("Was not registered as ThermalStatusListener on AppStop");
        }
        this.e = false;
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public final void onThermalStatusChanged(int i) {
        sbp sbpVarJ;
        mhp mhpVar;
        Map map = b;
        Integer numValueOf = Integer.valueOf(i);
        map.get(numValueOf);
        mhp mhpVar2 = (mhp) map.get(numValueOf);
        if (mhpVar2 == null) {
            ((sgt) c.c().M(4780)).t("Ignoring call to onThermalStatusChanged with unknown status value: %d", i);
            return;
        }
        synchronized (this) {
            if (mhpVar2 == this.f) {
                return;
            }
            tpc tpcVarM = stw.a.m();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            stw stwVar = (stw) tphVar;
            stwVar.e = 1;
            stwVar.b |= 16;
            int i2 = this.f.j;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            stw stwVar2 = (stw) tphVar2;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            stwVar2.d = i3;
            stwVar2.b |= 8;
            int i4 = mhpVar2.j;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            stw stwVar3 = (stw) tpcVarM.b;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            stwVar3.c = i5;
            stwVar3.b |= 4;
            this.f = mhpVar2;
            this.h.l((stw) tpcVarM.l());
            synchronized (this) {
                sbpVarJ = sbp.j(this.a);
                mhpVar = this.f;
            }
            int size = sbpVarJ.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((mho) sbpVarJ.get(i6)).d(mhpVar);
            }
        }
    }
}
