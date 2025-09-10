package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jon implements jsh {
    public final ltd a;
    public seo b;
    public final boolean e;
    public boolean f;
    final /* synthetic */ joo g;
    public jop h;
    public jop i;
    public jop j;
    public final hbp k;
    public boolean d = false;
    public boolean c = false;

    public jon(joo jooVar, ltd ltdVar, hbp hbpVar, seo seoVar, boolean z) {
        this.g = jooVar;
        this.a = ltdVar;
        this.k = hbpVar;
        this.b = seoVar;
        this.e = z;
    }

    @Override // defpackage.jsh
    public final void a(jry jryVar) {
        joo jooVar = this.g;
        synchronized (jooVar.c) {
            if (this.f) {
                return;
            }
            if (this.b.l()) {
                ((sgt) joo.a.c().M(2959)).E("Cancelling session %s that already ended: %s", this.a, jryVar);
                return;
            }
            if (this.e) {
                ((sgt) joo.a.c().M(2958)).E("Cancelled a long shot for %s: %s", this.a, jryVar);
            }
            this.f = true;
            jooVar.c();
        }
    }

    @Override // defpackage.jsh
    public final void b(long j, jsl jslVar) {
        joo jooVar = this.g;
        synchronized (jooVar.c) {
            if (this.b.l()) {
                ((sgt) joo.a.c().M(2963)).E("Ending session %s twice: %s", this.a, jslVar);
                return;
            }
            if (this.f) {
                ((sgt) joo.a.c().M(2962)).E("Ending already cancelled session %s: %s", this.a, jslVar);
                return;
            }
            if (((Long) this.b.h()).longValue() > j) {
                ((sgt) joo.a.c().M(2961)).H(OPuAVreQM.azcyTVZIhmyEhBo, this.a, this.b.h(), Long.valueOf(j), jslVar);
            }
            this.b = seo.e((Long) this.b.h(), Long.valueOf(Math.max(j, ((Long) this.b.h()).longValue())));
            jooVar.c();
            jooVar.b();
        }
    }
}
