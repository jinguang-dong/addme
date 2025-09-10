package defpackage;

import android.graphics.PointF;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcp extends nqg implements paq {
    public final FocusIndicatorView c;
    private final pka d;
    private final Set e;
    private final msh f;
    private final rwc g;
    private final mmk h;
    private final owf i;
    private final owf j;
    private our k;
    private paq l;
    private final hbj o;
    private final hnw p;
    private final mwq q;
    public nlt a = null;
    public nlt b = null;
    private boolean m = false;
    private final oun n = new fco(this, 0);

    public fcp(our ourVar, hnw hnwVar, FocusIndicatorView focusIndicatorView, pka pkaVar, Set set, msh mshVar, rwc rwcVar, mmk mmkVar, owf owfVar, owf owfVar2, hbj hbjVar, mwq mwqVar) {
        this.p = hnwVar;
        this.c = focusIndicatorView;
        this.d = pkaVar;
        this.e = set;
        this.f = mshVar;
        this.g = rwcVar;
        this.h = mmkVar;
        this.i = owfVar;
        this.j = owfVar2;
        this.o = hbjVar;
        this.q = mwqVar;
        ourVar.d(this);
    }

    @Override // defpackage.nqh
    public final synchronized boolean a(PointF pointF) {
        if (!this.m && !this.f.d()) {
            nlt nltVar = this.a;
            if (nltVar != null) {
                nltVar.c();
            }
            nlt nltVar2 = this.b;
            if (nltVar2 != null) {
                nltVar2.c();
            }
            our ourVar = this.k;
            if (ourVar != null) {
                ourVar.close();
            }
            paq paqVar = this.l;
            if (paqVar != null) {
                paqVar.close();
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((nqg) it.next()).a(pointF);
            }
            mmk mmkVar = this.h;
            rwc rwcVar = this.g;
            fcy fcyVarE = mmkVar.e();
            if (!rwcVar.h() || !((Boolean) this.j.dL()).booleanValue() || this.o.p(gzy.l) || ((mhe) rwcVar.c()).v()) {
                FocusIndicatorView focusIndicatorView = this.c;
                focusIndicatorView.k();
                focusIndicatorView.o();
                focusIndicatorView.m();
                focusIndicatorView.m.b(pointF);
                nlt nltVarA = focusIndicatorView.s.a();
                this.a = nltVarA;
                nltVarA.b(new fbu(this, 7));
            } else {
                if (((Boolean) this.i.dL()).booleanValue()) {
                    ((mhe) rwcVar.c()).j();
                }
                ((mhe) rwcVar.c()).m(rwc.j(pointF));
            }
            our ourVar2 = new our();
            this.k = ourVar2;
            fda fdaVarB = this.p.b(ourVar2, this.d, pointF, fcyVarE);
            nlt nltVar3 = this.a;
            int i = 1;
            ojl.cl(nltVar3 == null ? ske.M(true) : ((nly) nltVar3).b, fdaVarB.b(), this.n, ojl.ce());
            owq owqVar = fcyVarE.a;
            fbt fbtVar = new fbt(fdaVarB, 5);
            sxo sxoVar = sxo.a;
            this.l = owqVar.dK(fbtVar, sxoVar);
            ojl.ck(fdaVarB.c(), new fct(fcyVarE, fdaVarB, i), sxoVar);
            this.c.y(this.q);
            return true;
        }
        return false;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.m = true;
        our ourVar = this.k;
        if (ourVar != null) {
            ourVar.close();
        }
        paq paqVar = this.l;
        if (paqVar != null) {
            paqVar.close();
        }
    }
}
