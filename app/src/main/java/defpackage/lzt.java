package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzt implements lst, fqa {
    private static final scn g = scn.K(ltf.NORMAL, ltf.HDR_PLUS, ltf.HDR_PLUS_AUTO, ltf.PORTRAIT, ltf.HI_RES);
    public final uem a;
    public final mah b;
    public final Handler c;
    public final Runnable d = new man(this, 1);
    public final Activity e;
    public ltd f;
    private final uem h;
    private final out i;
    private final Resources j;
    private final hyh k;
    private ltd l;

    public lzt(uem uemVar, uem uemVar2, mah mahVar, out outVar, Handler handler, Activity activity, Resources resources, hyh hyhVar) {
        this.a = uemVar;
        this.h = uemVar2;
        this.b = mahVar;
        this.i = outVar;
        this.c = handler;
        this.e = activity;
        this.j = resources;
        this.k = hyhVar;
    }

    private final void m(ltd ltdVar) {
        k();
        l();
        p(ltdVar);
        if (ltdVar.equals(this.f)) {
            this.c.postDelayed(this.d, this.j.getInteger(R.integer.social_handle_reveal_delay));
        }
    }

    private final void o(ltd ltdVar) {
        k();
        uem uemVar = this.a;
        fqb fqbVar = ((mau) uemVar.a()).m;
        ltd ltdVarD = fqbVar == null ? null : fqbVar.a().d();
        l();
        p(ltdVar);
        ltd ltdVar2 = this.f;
        if (ltdVar2 == null) {
            ((mau) uemVar.a()).j();
        } else if (ltdVar2.equals(ltdVar)) {
            this.f = null;
        }
        if (ltdVarD == null || !ltdVarD.equals(ltdVar)) {
            return;
        }
        ((mau) uemVar.a()).k();
    }

    private final void p(ltd ltdVar) {
        if (ltdVar.equals(this.l)) {
            l();
            this.l = null;
            ((mac) this.h.a()).i(max.SLOW_CAPTURE);
        }
    }

    @Override // defpackage.fqa
    public final void a() {
        uem uemVar = this.a;
        fqb fqbVar = ((mau) uemVar.a()).m;
        boolean z = (fqbVar == null || fqbVar.a().k()) ? false : true;
        boolean z2 = fqbVar != null && fqbVar.a().k();
        l();
        if (z) {
            out outVar = this.i;
            mau mauVar = (mau) uemVar.a();
            mauVar.getClass();
            outVar.c(new lmw(mauVar, 19));
            return;
        }
        if (z2) {
            out outVar2 = this.i;
            mau mauVar2 = (mau) uemVar.a();
            mauVar2.getClass();
            outVar2.c(new lmw(mauVar2, 20));
        }
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        o(ltdVar);
    }

    @Override // defpackage.lst
    public final void c(ltd ltdVar) {
        l();
        m(ltdVar);
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        l();
        m(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        k();
        l();
        this.f = ltdVar;
        scn scnVar = g;
        ltf ltfVar = lsyVar.c;
        boolean z = ltfVar.equals(ltf.m) || (scnVar.contains(ltfVar) && ((Boolean) this.k.b.dL()).booleanValue()) || ltfVar.equals(ltf.LANDSCAPE);
        uem uemVar = this.h;
        if (z) {
            l();
            ((mac) uemVar.a()).h(max.SLOW_CAPTURE);
            this.l = ltdVar;
        }
    }

    final void k() {
        this.c.removeCallbacks(this.d);
    }

    public final void l() {
        Integer.toHexString(((mau) this.a.a()).hashCode());
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        o(ltdVar);
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
