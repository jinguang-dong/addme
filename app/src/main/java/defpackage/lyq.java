package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lyq implements lxi, jhf, jhc, jhe, jgz, jhh {
    public static final sgv a = sgv.g("lyq");
    public int A;
    public ktx B;
    public final pit C;
    public boolean b;
    public final out c;
    public final Handler d;
    public final lsp e;
    public final fck f;
    public final owq g;
    public final owf h;
    public final owq i;
    public final pbn k;
    public final lza l;
    public pjo r;
    public View x;
    public View y;
    public int z;
    public final szh o = new szh();
    public final Map j = new HashMap();
    public nkw p = nkw.UNINITIALIZED;
    public pka q = pka.BACK;
    public boolean s = false;
    public int t = 0;
    private boolean D = false;
    public boolean u = false;
    public int v = 0;
    public long w = 0;
    public final Matrix m = new Matrix();
    public final our n = new our();

    public lyq(pit pitVar, lza lzaVar, out outVar, Handler handler, lsp lspVar, uem uemVar, owq owqVar, owq owqVar2, owf owfVar, pbn pbnVar) {
        this.C = pitVar;
        this.l = lzaVar;
        this.c = outVar;
        this.d = handler;
        this.e = lspVar;
        this.f = (fck) uemVar.a();
        this.g = owqVar;
        this.i = owqVar2;
        this.h = owfVar;
        this.k = pbnVar;
    }

    public static final boolean k(ltw ltwVar) {
        return !ltwVar.equals(ltw.OFF);
    }

    private static final RectF l(View view) {
        Point pointBh = ojl.bh(view);
        return new RectF(pointBh.x, pointBh.y, pointBh.x + view.getWidth(), pointBh.y + view.getHeight());
    }

    @Override // defpackage.lxi
    public final void e(final pjo pjoVar) {
        this.c.c(new Runnable() { // from class: lxu
            @Override // java.lang.Runnable
            public final void run() {
                final lyq lyqVar = this.a;
                pjo pjoVar2 = pjoVar;
                pka pkaVarL = pjoVar2.l();
                if (!lyqVar.q.equals(pkaVarL)) {
                    lyqVar.q = pkaVarL;
                    lyqVar.h(new lyo() { // from class: lyc
                        @Override // defpackage.lyo
                        public final void a(Object obj) {
                            ((lyy) obj).e(lyqVar.q);
                        }
                    });
                }
                lyqVar.h(new lyd(pjoVar2, 0));
                lyqVar.r = pjoVar2;
            }
        });
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.u = false;
        h(new lyg(0));
    }

    @Override // defpackage.jhe
    public final void eb() {
        pbn pbnVar = this.k;
        pbnVar.f("smartsProcessor#resume");
        h(new lyg(1));
        pbnVar.g();
        this.u = true;
    }

    @Override // defpackage.jhf
    public final void ej() {
        out.a();
        if (this.D) {
            return;
        }
        final Runnable runnable = new Runnable() { // from class: lxx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.c(new iyy(3));
            }
        };
        this.f.b(runnable);
        our ourVar = this.n;
        ourVar.d(new paq() { // from class: lxz
            @Override // defpackage.paq, java.lang.AutoCloseable
            public final void close() {
                this.a.f.c(runnable);
            }
        });
        owq owqVar = this.g;
        pau pauVar = new pau() { // from class: lya
            @Override // defpackage.pau
            public final void a(Object obj) {
                this.a.h(new lye((ltw) obj, 1));
            }
        };
        out outVar = this.c;
        ourVar.d(owqVar.dK(pauVar, outVar));
        ourVar.d(this.h.dK(new pau() { // from class: lyb
            @Override // defpackage.pau
            public final void a(Object obj) {
                this.a.h(new lye((Boolean) obj, 3));
            }
        }, outVar));
        this.D = true;
    }

    @Override // defpackage.jgz
    public final void et() {
        rnt.L(!this.u);
        h(new lyg(3));
        this.n.close();
    }

    @Override // defpackage.lxi
    public final void f(final poe poeVar) {
        this.c.c(new Runnable() { // from class: lyj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(new lye(poeVar, 0));
            }
        });
    }

    @Override // defpackage.lxi
    public final void g(phc phcVar, final peo peoVar) {
        if (this.b) {
            ojl.bC(phcVar, new pec() { // from class: lxs
                @Override // defpackage.pec
                public final void a(pdk pdkVar) {
                    final poj pojVarE = pdkVar.e(peoVar);
                    if (pojVarE != null) {
                        final lyq lyqVar = this.a;
                        lyqVar.c.c(new Runnable() { // from class: lyk
                            @Override // java.lang.Runnable
                            public final void run() {
                                out.a();
                                poj pojVar = pojVarE;
                                final lyq lyqVar2 = lyqVar;
                                if (!lyqVar2.u || lyqVar2.v >= 3) {
                                    pojVar.close();
                                    return;
                                }
                                if (pojVar.c() != lyqVar2.z || pojVar.b() != lyqVar2.A) {
                                    lyqVar2.z = pojVar.c();
                                    lyqVar2.A = pojVar.b();
                                    lyqVar2.j();
                                }
                                lyqVar2.v++;
                                pkf pkfVar = new pkf(new lyn(pojVar, new Runnable() { // from class: lyf
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final lyq lyqVar3 = lyqVar2;
                                        lyqVar3.c.c(new Runnable() { // from class: lyi
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                lyq lyqVar4 = lyqVar3;
                                                lyqVar4.v--;
                                            }
                                        });
                                    }
                                }));
                                lyqVar2.h(new lye(pkfVar, 2));
                                pkfVar.l();
                            }
                        });
                    }
                    pdkVar.close();
                }
            }, "SmartsFrameProcessors");
        }
    }

    public final void h(lyo lyoVar) {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            lyoVar.a((lyy) it.next());
        }
    }

    public final void i() {
        out.a();
        boolean z = this.t > 0;
        if (this.s != z) {
            this.s = z;
            h(new lyo() { // from class: lxy
                @Override // defpackage.lyo
                public final void a(Object obj) {
                    ((lyy) obj).f(this.a.s);
                }
            });
        }
    }

    public final void j() {
        out.a();
        int i = (this.B.b().e + 90) % 360;
        int i2 = this.z;
        int i3 = this.A;
        int i4 = i % 180;
        int i5 = i4 != 0 ? i2 : i3;
        if (i4 != 0) {
            i2 = i3;
        }
        RectF rectFL = l(this.y);
        RectF rectFL2 = l(this.x);
        Matrix matrix = new Matrix();
        float f = i2;
        float f2 = i5;
        matrix.postScale(rectFL.width() / f, rectFL.height() / f2);
        matrix.postTranslate(rectFL.left - rectFL2.left, rectFL.top - rectFL2.top);
        Matrix matrix2 = this.m;
        matrix2.reset();
        matrix2.postTranslate(-rectFL.left, -rectFL.top);
        matrix2.postScale(f / rectFL.width(), f2 / rectFL.height());
    }
}
