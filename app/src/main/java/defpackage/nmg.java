package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.google.ar.core.R;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nmg extends lzb implements nmh, lst {
    private static final sgv o = sgv.g("nmg");
    public final Context a;
    public final lsp b;
    public final long c;
    public final boolean e;
    final nan f;
    public final nan g;
    public long h;
    public boolean i;
    public final nmm j;
    public final imi k;
    public final luj l;
    public final luj m;
    public final mdy n;
    private final hbc q;
    private final out r;
    private final boolean s;
    private boolean t;
    private final Set p = new HashSet();
    private int u = 1;

    public nmg(nmm nmmVar, Context context, imi imiVar, luj lujVar, luj lujVar2, PackageInfo packageInfo, mdy mdyVar, lsp lspVar, hbc hbcVar, out outVar, boolean z, boolean z2) {
        this.j = nmmVar;
        this.a = context;
        this.k = imiVar;
        this.l = lujVar;
        this.m = lujVar2;
        this.n = mdyVar;
        this.b = lspVar;
        this.q = hbcVar;
        this.r = outVar;
        this.e = z;
        this.s = z2;
        nao naoVar = new nao();
        naoVar.h = context;
        naoVar.b = 10000;
        naoVar.j = 8;
        naoVar.e = context.getResources().getString(R.string.preparing_updates);
        this.f = naoVar.a();
        nao naoVar2 = new nao();
        naoVar2.h = context;
        naoVar2.a = true;
        naoVar2.j = 8;
        naoVar2.e = context.getResources().getString(R.string.update_ready_tap_restart);
        naoVar2.c = new mlk(this, 15);
        this.g = naoVar2.a();
        this.c = packageInfo.getLongVersionCode();
    }

    @Override // defpackage.nmh
    public final void a() {
        k();
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        if (this.p.remove(ltdVar)) {
            u();
        }
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        if (this.p.remove(ltdVar)) {
            u();
        }
    }

    @Override // defpackage.lzb, defpackage.lzh
    public final void dM() {
        super.dM();
        this.b.i(this);
    }

    @Override // defpackage.lzb, defpackage.lzh
    public final void f() {
        super.f();
        k();
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        ltf ltfVar = lsyVar.c;
        if (ltfVar == ltf.VIDEO || ltfVar == ltf.TIMELAPSE || ltfVar == ltf.CINEMATIC) {
            return;
        }
        this.p.add(ltdVar);
        u();
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        if (this.p.remove(ltdVar)) {
            u();
        }
    }

    @Override // defpackage.nmh
    public final void o() {
        this.n.B(3, this.h, this.c, 0, 0);
    }

    @Override // defpackage.nmh
    public final void p(int i, Integer num) {
        luj lujVar = this.l;
        long jCurrentTimeMillis = System.currentTimeMillis();
        lus lusVar = luf.aB;
        if (((Integer) lujVar.b(lusVar)).intValue() != i) {
            luj lujVar2 = this.m;
            lujVar2.d(lusVar, Integer.valueOf(i));
            lujVar2.d(luf.aC, Long.valueOf(jCurrentTimeMillis));
        }
        uaf uafVar = uaf.a;
        long jA = uafVar.fr().a();
        long hours = TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis - ((Long) lujVar.b(luf.aC)).longValue());
        if (jA <= 0 || hours >= jA) {
            long jC = uafVar.fr().c();
            if (num == null || num.intValue() >= jC) {
                Context context = this.a;
                Drawable drawable = context.getDrawable(R.drawable.quantum_gm_ic_system_update_vd_theme_24);
                drawable.getClass();
                drawable.setTint(-1);
                lzk lzkVarA = lzl.a();
                lzkVarA.a = context.getString(R.string.new_version_available);
                lzkVarA.b = drawable;
                lzkVarA.c = new nhp(this, 7);
                lzkVarA.g = new nhp(this, 8);
                if (!this.e || !this.s) {
                    long jE = uafVar.fr().e();
                    if (jE != -1) {
                        lzkVarA.f(jE * 1000);
                    }
                    if (uafVar.fr().f()) {
                        lzkVarA.f = new nhp(this, 9);
                    }
                }
                l(lzkVarA.a());
                long j = i;
                this.h = j;
                this.n.B(2, j, this.c, 0, 0);
            }
        }
    }

    @Override // defpackage.nmh
    public final void q() {
        this.u = 3;
        u();
        this.b.a(this);
        if (this.t) {
            this.n.B(4, this.h, this.c, 0, 0);
        }
    }

    @Override // defpackage.nmh
    public final void r(int i) {
        this.u = 2;
        u();
        this.f.l(i == 0 ? this.a.getResources().getString(R.string.preparing_updates) : this.a.getResources().getString(R.string.downloading_updates, Integer.valueOf(i)));
    }

    @Override // defpackage.nmh
    public final void s() {
        this.n.B(7, this.h, this.c, 0, 0);
    }

    @Override // defpackage.nmh
    public final void t() {
        this.t = true;
    }

    public final void u() {
        if (this.u != 2 || this.i) {
            this.k.f(this.f);
        } else {
            this.k.a(this.f);
        }
        if (this.u == 3 && !this.i && this.p.isEmpty()) {
            this.k.a(this.g);
        } else {
            this.k.f(this.g);
        }
    }

    @Override // defpackage.nmh
    public final void v(final int i, final int i2) {
        ((sgt) o.c().M(5427)).C("onUpdateFailed failureType=%s, errorCode=%d", sla.k(i), i2);
        this.u = 1;
        u();
        this.n.B(6, this.h, this.c, i, i2);
        if (this.q.b(hbc.DOGFOOD)) {
            this.r.c(new Runnable() { // from class: nmf
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(this.a.a, String.format(Locale.US, "Update failed! type=%s, code=%d. Please file a bug report.", sla.k(i), Integer.valueOf(i2)), 0).show();
                }
            });
        }
    }

    @Override // defpackage.nmh
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }
}
