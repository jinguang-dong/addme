package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldi {
    final sbk k;
    public final szh l;
    final szh m;
    public final poe n;
    public final BurstSpec o;
    List p;
    boolean q;
    public int r;
    public final hxu s;
    public final gga t;

    public ldi(gga ggaVar, hxu hxuVar, BurstSpec burstSpec, poe poeVar) {
        int i = sbp.d;
        this.k = new sbk();
        this.l = new szh();
        this.m = new szh();
        this.r = 0;
        this.t = ggaVar;
        this.s = hxuVar;
        this.o = burstSpec;
        this.n = poeVar;
    }

    public void b() {
        if (this.q) {
            return;
        }
        this.q = true;
        this.l.cancel(true);
        g();
    }

    public void c(lau lauVar) {
        this.k.h(lauVar);
        this.r++;
    }

    public final List f() {
        List list = this.p;
        if (list != null && this.r == ((sex) list).c) {
            return list;
        }
        sbp sbpVarG = this.k.g();
        this.p = sbpVarG;
        return sbpVarG;
    }

    public final void g() {
        sgk it = ((sbp) f()).iterator();
        while (it.hasNext()) {
            ((pdk) it.next()).close();
        }
    }

    public final void h(int i) {
        this.l.e(Integer.valueOf(i));
    }
}
