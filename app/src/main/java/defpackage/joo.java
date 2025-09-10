package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class joo {
    public static final sgv a = sgv.g("joo");
    public final rwc b;
    public final jpp h;
    public final joq i;
    public final joq j;
    public final joq k;
    private final jqb l;
    private final boolean m;
    private final boolean n;
    public boolean e = false;
    public boolean f = false;
    public final Object c = new Object();
    public long d = -1;
    public final Set g = new HashSet();

    public joo(jpp jppVar, jqb jqbVar, rwc rwcVar, our ourVar, hbj hbjVar, pbc pbcVar) {
        this.h = jppVar;
        this.l = jqbVar;
        this.b = rwcVar;
        this.m = hbjVar.p(gzz.l);
        this.n = hbjVar.p(gzz.t);
        this.i = new joq(pbcVar, "Vid");
        this.j = new joq(pbcVar, "Aud");
        this.k = new joq(pbcVar, "Mtn");
        ourVar.d(new jkf(this, 7));
    }

    public final void a() {
        synchronized (this.c) {
            this.i.c();
            this.j.c();
            this.k.c();
            for (jon jonVar : this.g) {
                seo seoVar = jonVar.b;
                if (seoVar != null) {
                    String.format(Locale.US, "%s to %s", seoVar.k() ? String.format(Locale.US, "<%d>", seoVar.h()) : "n/a", seoVar.l() ? String.format(Locale.US, "<%d>", seoVar.i()) : "n/a");
                }
                boolean z = jonVar.e;
                boolean z2 = jonVar.c;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, qfc] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, qfc] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, qfc] */
    public final void c() {
        synchronized (this.c) {
            Set<jon> set = this.g;
            long jMax = Long.MIN_VALUE;
            for (jon jonVar : set) {
                if (jonVar.b.l() && ((Long) jonVar.b.i()).longValue() < this.d) {
                    jMax = Math.max(jMax, ((Long) jonVar.b.i()).longValue());
                }
            }
            for (jon jonVar2 : set) {
                if (!jonVar2.c && !jonVar2.f && (jonVar2.b.l() || jonVar2.e)) {
                    boolean z = jonVar2.e ? this.n : this.m;
                    ltd ltdVar = jonVar2.a;
                    hbp hbpVar = jonVar2.k;
                    ?? r7 = hbpVar.a;
                    jpg jpgVar = r7;
                    if (!z) {
                        jpgVar = new jpg(r7);
                    }
                    jonVar2.h = this.i.e(jpgVar, ((Long) jonVar2.b.h()).longValue());
                    jonVar2.j = this.k.e(hbpVar.c, ((Long) jonVar2.b.h()).longValue());
                    ?? r5 = hbpVar.b;
                    if (r5 != 0) {
                        jonVar2.i = this.j.e(r5, ((Long) jonVar2.b.h()).longValue());
                    }
                    jonVar2.c = true;
                }
            }
            for (jon jonVar3 : set) {
                if (jonVar3.c && !jonVar3.b.l() && !jonVar3.f && jonVar3.e) {
                    ltd ltdVar2 = jonVar3.a;
                    jop jopVar = jonVar3.h;
                    jopVar.getClass();
                    jopVar.a(this.d, false);
                    jop jopVar2 = jonVar3.j;
                    jopVar2.getClass();
                    jopVar2.a(this.d, false);
                    if (this.b.h()) {
                        jop jopVar3 = jonVar3.i;
                        jopVar3.getClass();
                        jopVar3.a(this.d, false);
                    }
                }
            }
            for (jon jonVar4 : set) {
                if (jonVar4.c && jonVar4.b.l() && !jonVar4.f && !jonVar4.d) {
                    ltd ltdVar3 = jonVar4.a;
                    jonVar4.b.h();
                    jonVar4.b.i();
                    ((Long) jonVar4.b.i()).longValue();
                    ((Long) jonVar4.b.h()).longValue();
                    jop jopVar4 = jonVar4.h;
                    jopVar4.getClass();
                    jopVar4.a(((Long) jonVar4.b.i()).longValue(), true);
                    jop jopVar5 = jonVar4.j;
                    jopVar5.getClass();
                    jopVar5.a(((Long) jonVar4.b.i()).longValue(), true);
                    jop jopVar6 = jonVar4.i;
                    if (jopVar6 != null) {
                        if (jonVar4.e) {
                            jopVar6.a(((Long) jonVar4.b.i()).longValue(), true);
                        } else {
                            jopVar6.a(((Long) jonVar4.b.h()).longValue(), true);
                        }
                    }
                    jonVar4.d = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (jon jonVar5 : set) {
                if (jonVar5.f || (jonVar5.d && jonVar5.b.l() && ((Long) jonVar5.b.i()).longValue() < this.d - 10000000)) {
                    arrayList.add(jonVar5);
                    ltd ltdVar4 = jonVar5.a;
                }
            }
            set.removeAll(arrayList);
        }
    }

    public final boolean d() {
        synchronized (this.c) {
            if (this.f) {
                ((sgt) a.b().M(2970)).s("Attempting to init encoder that is shut down!");
                return false;
            }
            if (!this.e) {
                this.h.e(this.i, this);
                jqb jqbVar = this.l;
                joq joqVar = this.k;
                joqVar.a(ske.M(jqbVar.f));
                jqbVar.o = joqVar;
                jqbVar.q = jqbVar.p.t();
                rwc rwcVar = this.b;
                if (rwcVar.h()) {
                    ((jom) rwcVar.c()).c(this.j, this);
                } else {
                    this.j.a(ske.K());
                }
                this.e = true;
            }
            return true;
        }
    }

    public final rfv e(long j) {
        synchronized (this.c) {
            int i = 0;
            boolean z = false;
            for (jon jonVar : this.g) {
                if (!jonVar.f) {
                    boolean z2 = jonVar.e;
                    boolean z3 = z2 ? this.n : this.m;
                    seo seoVar = jonVar.b;
                    Long lValueOf = Long.valueOf(j);
                    if (seoVar.a(lValueOf)) {
                        ltd ltdVar = jonVar.a;
                        return rfv.k(z3);
                    }
                    if (jonVar.b.l()) {
                        if (seo.e((Long) jonVar.b.i(), Long.valueOf(((Long) jonVar.b.i()).longValue() + (true != z2 ? 66666L : 666666L))).a(lValueOf)) {
                            ltd ltdVar2 = jonVar.a;
                            return rfv.k(z3);
                        }
                    }
                    z |= !(((Long) jonVar.b.h()).longValue() < j);
                }
            }
            if (z) {
                return new rfv(0);
            }
            if (true == this.m) {
                i = 4;
            }
            return new rfv(i | 3);
        }
    }

    public final void b() {
        jpp jppVar = this.h;
        if (jppVar.h) {
            ((sgt) jpp.a.c().M(3011)).s(zflNUOOzDfM.IIsHYrhsVqhoE);
        } else {
            jppVar.d.post(new jmr(jppVar, 11));
        }
        rwc rwcVar = this.b;
        if (rwcVar.h()) {
        }
    }
}
