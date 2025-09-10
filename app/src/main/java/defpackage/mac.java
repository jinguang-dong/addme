package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mac implements jhh, jgu, jhe, jhg, jhf, mxl {
    public static final sgv a = sgv.g("mac");
    public final uem b;
    public final mah c;
    public final boolean d;
    public final hcl e;
    public final lrp i;
    public final hbw j;
    public final lqc k;
    public final pmv l;
    private final mav m;
    private final mbf o;
    private final obu p;
    private final Set n = new HashSet();
    public final List f = new ArrayList();
    public final may g = new mab(this);
    public final String h = "";

    public mac(Activity activity, uem uemVar, mav mavVar, mah mahVar, lrp lrpVar, hbw hbwVar, mbf mbfVar, boolean z, lqc lqcVar, hcl hclVar, pmv pmvVar, obu obuVar) {
        activity.getResources();
        this.b = uemVar;
        this.m = mavVar;
        this.c = mahVar;
        this.i = lrpVar;
        this.j = hbwVar;
        this.o = mbfVar;
        this.d = z;
        this.k = lqcVar;
        this.e = hclVar;
        this.l = pmvVar;
        this.p = obuVar;
    }

    public final void a(may mayVar) {
        List list = this.f;
        synchronized (list) {
            list.size();
            list.add(mayVar);
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        mav mavVar = this.m;
        if (mavVar.c != mxjVar) {
            mavVar.c = mxjVar;
            throw null;
        }
        this.o.g = mxmVar;
        throw null;
    }

    @Override // defpackage.jhe
    public final void eb() {
        throw null;
    }

    @Override // defpackage.jhf
    public final void ej() {
        i(max.NOT_STARTED);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jhg
    public final void eu() {
        h(max.NOT_STARTED);
        this.p.a.clear();
        this.c.c.clear();
    }

    @Override // defpackage.jgu
    public final void f(int i, int i2) {
        if (i == 1000 && i2 == -1) {
            ((mau) this.b.a()).m();
        }
    }

    public final void g(may mayVar) {
        List list = this.f;
        synchronized (list) {
            list.remove(mayVar);
        }
    }

    final synchronized void h(max maxVar) {
        this.n.add(maxVar);
        ((mau) this.b.a()).d();
    }

    final synchronized void i(max maxVar) {
        Set set = this.n;
        set.remove(maxVar);
        if (set.isEmpty()) {
            ((mau) this.b.a()).eT();
        }
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
