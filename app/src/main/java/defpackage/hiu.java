package defpackage;

import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hiu extends hil implements mdc {
    public final mdb f;
    public final mdd g;
    public final mdd h;
    public final mdd i;

    public hiu(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, hiq hiqVar, gox goxVar, hiq hiqVar2) {
        super(evCompView, checkBox, objectAnimator, hiqVar, goxVar);
        mdd mddVar = new mdd(new hir(this), new mcz[0]);
        this.g = mddVar;
        this.h = new mdd(new his(this), new mcz[0]);
        this.i = new mdd(new hit(this), hiqVar2);
        mdb mdbVar = new mdb(mddVar, false);
        this.f = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void a() {
        this.f.c();
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void b() {
        this.f.d();
    }

    @Override // defpackage.hig
    public final void c() {
        mdb mdbVar = this.f;
        if (mdbVar.a() == null) {
            return;
        }
        ((hig) mdbVar.a().a).c();
    }

    @Override // defpackage.hig
    public final void d(int i, int i2, float f) {
        mdb mdbVar = this.f;
        if (mdbVar.a() == null) {
            return;
        }
        ((hig) mdbVar.a().a).d(i, i2, f);
    }

    @Override // defpackage.hig
    public final void e(boolean z) {
        mdb mdbVar = this.f;
        if (mdbVar.a() == null) {
            return;
        }
        ((hig) mdbVar.a().a).e(z);
    }

    @Override // defpackage.hig
    public final void f(boolean z, boolean z2) {
        mdb mdbVar = this.f;
        if (mdbVar.a() == null) {
            return;
        }
        ((hig) mdbVar.a().a).f(z, z2);
    }

    @Override // defpackage.hig, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.f.b();
        this.g.i();
        this.h.i();
        this.i.i();
    }
}
