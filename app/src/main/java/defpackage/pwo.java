package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwo implements puo {
    public final /* synthetic */ pxu a;
    final /* synthetic */ boolean b;
    public final /* synthetic */ pun c;
    public final /* synthetic */ clm d;
    final /* synthetic */ int e;
    public final /* synthetic */ clr f;
    public final /* synthetic */ int g;
    final /* synthetic */ String h;
    public final /* synthetic */ pwr i;

    public pwo(pwr pwrVar, pxu pxuVar, boolean z, pun punVar, clm clmVar, int i, clr clrVar, int i2, String str) {
        this.a = pxuVar;
        this.b = z;
        this.c = punVar;
        this.d = clmVar;
        this.e = i;
        this.f = clrVar;
        this.g = i2;
        this.h = str;
        this.i = pwrVar;
    }

    @Override // defpackage.puo
    public final void a(pts ptsVar) {
        throw null;
    }

    @Override // defpackage.puo
    public final void b(final long j) {
        final pun punVar = this.c;
        final clm clmVar = this.d;
        final int i = this.e;
        pwr pwrVar = this.i;
        tql tqlVar = pwrVar.j;
        final clr clrVar = this.f;
        syu syuVarE = tqlVar.e(this.a.a);
        final boolean z = this.b;
        final int i2 = this.g;
        qsz.n(syuVarE, new sxi() { // from class: pwl
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                rwc rwcVar = (rwc) obj;
                if (!rwcVar.h()) {
                    return syq.a;
                }
                if (((syu) rwcVar.c()).isDone()) {
                    return syq.a;
                }
                boolean z2 = z;
                int i3 = !z2 ? (int) j : 0;
                pun punVar2 = punVar;
                if (punVar2.k == 2) {
                    int i4 = i2;
                    clr clrVar2 = clrVar;
                    int i5 = i;
                    clm clmVar2 = clmVar;
                    clmVar2.n = "progress";
                    clmVar2.i(R.drawable.stat_sys_download);
                    String str = punVar2.a;
                    str.getClass();
                    clmVar2.e(str);
                    clmVar2.h(i5, i3, z2);
                    clrVar2.a(i4, clmVar2.a());
                }
                rwc rwcVar2 = punVar2.h;
                if (rwcVar2.h()) {
                    rwcVar2.c();
                }
                return syq.a;
            }
        }, pwrVar.f);
    }

    @Override // defpackage.puo
    public final void c() {
        pwr pwrVar = this.i;
        qsz.n(pwrVar.j.d(this.a.a), new pyr(this.c, this.d, this.h, this.f, this.g, 1), pwrVar.f);
    }

    @Override // defpackage.puo
    public final void d() {
        throw null;
    }
}
