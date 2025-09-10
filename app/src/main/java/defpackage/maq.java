package defpackage;

import android.os.Handler;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class maq implements mam {
    public final /* synthetic */ mau b;

    public maq(mau mauVar) {
        this.b = mauVar;
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void a() {
        mau mauVar = this.b;
        mauVar.n = false;
        fqb fqbVarL = mauVar.o.l();
        fqbVarL.getClass();
        ojl.ck(mauVar.o(fqbVarL), new fqz(this, 16), ojl.ce());
        mauVar.l.c();
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void b() {
        mau mauVar = this.b;
        mauVar.i.removeCallbacks(mauVar.k);
    }

    @Override // defpackage.mam
    public void d() {
        this.b.p(false, true);
    }

    @Override // defpackage.mam
    public final void e() {
        o();
        mal malVar = this.b.j;
        malVar.c();
        malVar.a();
    }

    @Override // defpackage.mam
    public void f(fqb fqbVar) {
        p(fqbVar);
    }

    @Override // defpackage.mam
    public void h(fqb fqbVar) {
        p(fqbVar);
    }

    public final void o() {
        mau mauVar = this.b;
        long integer = mauVar.g.getInteger(R.integer.social_handle_close_timeout);
        Handler handler = mauVar.i;
        Runnable runnable = mauVar.k;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, integer);
    }

    public final void p(fqb fqbVar) {
        mau mauVar = this.b;
        mauVar.m = fqbVar;
        mal malVar = mauVar.j;
        malVar.d(mak.LAUNCH_SHARE_PANEL);
        malVar.f(3);
        malVar.e(3);
    }

    @Override // defpackage.mam, defpackage.jfs
    public final /* synthetic */ boolean r() {
        return false;
    }

    @Override // defpackage.mam
    public final /* synthetic */ void eT() {
    }

    @Override // defpackage.mam, defpackage.jhe
    public final /* synthetic */ void eb() {
    }

    @Override // defpackage.mcz
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.mam
    public void j() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void n() {
    }
}
