package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnc extends lmy implements mdc {
    public final ProgressOverlay a;
    public boolean b;
    public final AnimatedVectorDrawable c;
    public final mdb d;
    public final mdd e;
    public final mdd f;

    public lnc(ProgressOverlay progressOverlay) {
        out.a();
        this.a = progressOverlay;
        AnimatedVectorDrawable animatedVectorDrawable = progressOverlay.a;
        this.c = animatedVectorDrawable;
        animatedVectorDrawable.registerAnimationCallback(new lmz(this));
        this.b = false;
        mdd mddVar = new mdd(new lms(this), new mcz[0]);
        this.e = mddVar;
        this.f = new mdd(new lmt(this), new mcz[0]);
        mdb mdbVar = new mdb(mddVar, false);
        this.d = mdbVar;
        mdbVar.f();
    }

    @Override // defpackage.lmy, defpackage.mcz, defpackage.mda
    public final void a() {
        this.d.c();
    }

    @Override // defpackage.lmy, defpackage.mcz, defpackage.mda
    public final void b() {
        this.d.d();
    }

    @Override // defpackage.lmy
    public final void c() {
        if (this.d.a() == null) {
            return;
        }
        ((lmy) this.d.a().a).c();
    }

    @Override // defpackage.lmy
    public final void d() {
        if (this.d.a() == null) {
            return;
        }
        ((lmy) this.d.a().a).d();
    }

    @Override // defpackage.lmy, defpackage.mcz
    public final void g() {
        jea.z(this);
    }

    @Override // defpackage.mdc
    public final void i() {
        this.d.b();
        this.e.i();
        this.f.i();
    }
}
