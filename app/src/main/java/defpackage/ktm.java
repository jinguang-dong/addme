package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktm implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ktm(Object obj, Enum r2, int i) {
        this.c = i;
        this.b = obj;
        this.a = r2;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, ksd] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mhh mhhVar;
        int i = this.c;
        if (i == 0) {
            ?? r9 = this.b;
            if (r9 != 0) {
                kto ktoVar = (kto) this.a;
                r9.a(ktoVar.p, ktoVar.isEnabled());
                return;
            }
            return;
        }
        if (i == 1) {
            kqy kqyVar = (kqy) this.b;
            if (kqyVar.f) {
                ((krj) kqyVar.c.a()).y(1, (krs) this.a);
                return;
            }
            return;
        }
        if (i == 2) {
            Object obj = this.b;
            kto ktoVar2 = (kto) this.a;
            ksb ksbVar = ktoVar2.o;
            if (ksbVar != null) {
                krq krqVar = ktoVar2.k;
                ksa ksaVar = ((krr) obj).a;
                if (ksbVar.v(krqVar.a, ksaVar, ktoVar2.p == ksaVar)) {
                    return;
                }
            }
            ksc kscVar = ktoVar2.n;
            if (kscVar != null) {
                kscVar.w(((krr) obj).a, ktoVar2.k.a, 1);
                return;
            }
            return;
        }
        int i2 = 3;
        if (i != 3) {
            ModeSwitcher modeSwitcher = (ModeSwitcher) this.b;
            if (!modeSwitcher.e) {
                ((sgt) ModeSwitcher.a.c().M(5255)).s("Ignore mode chip click, mode switcher is disabled.");
                return;
            }
            Object obj2 = this.a;
            syj.i(view);
            modeSwitcher.k(3, modeSwitcher.g, (nkw) obj2, true);
            return;
        }
        mhe mheVar = (mhe) this.b;
        if (((Boolean) ((ovx) mheVar.m.j).d).booleanValue() || mheVar.l.k()) {
            return;
        }
        hbj hbjVar = mheVar.H;
        gzg gzgVar = gzy.r;
        if (hbjVar.p(gzgVar) && ((mhh) mheVar.a.dL()).equals(mhh.ON)) {
            return;
        }
        if (((mhg) mheVar.b.dL()).equals(mhg.TRANSITION_TO_ACTIVE)) {
            mhhVar = hbjVar.p(gzgVar) ? mhh.AUTO : mhh.ON;
        } else {
            mhh mhhVar2 = (mhh) mheVar.a.dL();
            mhh mhhVar3 = mhh.OFF;
            mhhVar = mhhVar2.equals(mhhVar3) ? hbjVar.p(gzgVar) ? mhh.AUTO : mhh.ON : mhhVar3;
        }
        mheVar.a.a(mhhVar);
        mheVar.p(mhhVar);
        if (hbjVar.p(gzy.o)) {
            luj lujVar = mheVar.E;
            lujVar.d(luf.aF, Integer.valueOf(mhhVar.d));
            if (!mhhVar.equals(mhh.ON)) {
                lujVar.d(luf.r, Boolean.valueOf(mhh.b(mhhVar)));
            }
        }
        sbk sbkVar = mheVar.C;
        int iOrdinal = mhhVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 4;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i2 = 2;
            }
        }
        tpc tpcVarM = stv.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        Object obj3 = this.a;
        tph tphVar = tpcVarM.b;
        stv stvVar = (stv) tphVar;
        stvVar.c = i2 - 1;
        stvVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        ssc sscVar = ((nkw) obj3).v;
        tph tphVar2 = tpcVarM.b;
        stv stvVar2 = (stv) tphVar2;
        stvVar2.d = sscVar.T;
        stvVar2.b |= 2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        stv stvVar3 = (stv) tpcVarM.b;
        stvVar3.e = 1;
        stvVar3.b |= 4;
        sbkVar.h((stv) tpcVarM.l());
        mheVar.t();
    }

    public /* synthetic */ ktm(kto ktoVar, Object obj, int i) {
        this.c = i;
        this.a = ktoVar;
        this.b = obj;
    }
}
