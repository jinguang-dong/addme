package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mas implements mam {
    public final /* synthetic */ mau b;

    public mas(mau mauVar) {
        this.b = mauVar;
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void a() {
        mau mauVar = this.b;
        mauVar.n = false;
        fqb fqbVar = mauVar.m;
        fqbVar.getClass();
        ojl.ck(mauVar.o(fqbVar), new fqz(this, 18), ojl.ce());
        fqb fqbVar2 = mauVar.m;
        fqbVar2.getClass();
        mauVar.q.r(fqbVar2);
        mav mavVar = mauVar.h;
        mavVar.b = true;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(mavVar.a);
        objectAnimatorOfFloat.addListener(new nkz(new lig(2)));
        mavVar.a(sbp.l(objectAnimatorOfFloat));
        mauVar.l.e();
    }

    @Override // defpackage.mcz, defpackage.mda
    public final void b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, 1.0f, 0.0f);
        mav mavVar = this.b.h;
        objectAnimatorOfFloat.setDuration(mavVar.a);
        objectAnimatorOfFloat.addListener(new nky(new lig(3)));
        mavVar.a(sbp.l(objectAnimatorOfFloat));
        mavVar.b = false;
    }

    @Override // defpackage.mam
    public void d() {
        this.b.p(false, true);
    }

    @Override // defpackage.mam
    public final void n() {
        mau mauVar = this.b;
        fqb fqbVar = mauVar.m;
        fqbVar.getClass();
        mauVar.q.r(fqbVar);
    }

    @Override // defpackage.mam, defpackage.jfs
    public boolean r() {
        return true;
    }

    @Override // defpackage.mam
    public final /* synthetic */ void e() {
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
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.mam
    public void k() {
    }

    @Override // defpackage.mam
    public void l() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void f(fqb fqbVar) {
    }

    @Override // defpackage.mam
    public final /* synthetic */ void h(fqb fqbVar) {
    }
}
