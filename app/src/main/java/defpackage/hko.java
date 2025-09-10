package defpackage;

import com.google.android.apps.camera.faceindicator.FaceIndicatorView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hko {
    public final boolean a;
    public boolean b;
    public final qqv c;
    private final owq d;
    private final owf e;
    private boolean g = false;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public hko(qqv qqvVar, owq owqVar, owf owfVar, owf owfVar2, out outVar, fdq fdqVar, hbj hbjVar) {
        boolean z;
        this.c = qqvVar;
        this.d = owqVar;
        this.e = owfVar2;
        if (hbjVar.p(gzj.f)) {
            int i = gyt.a;
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        fdqVar.j().d(owl.g(owqVar, owfVar).dK(new hib(this, 4), outVar));
        fdqVar.j().d(owfVar2.dK(new hib(this, 5), outVar));
    }

    public final void a(boolean z) {
        rwc rwcVar = (rwc) this.c.b;
        if (rwcVar.h()) {
            ((FaceIndicatorView) rwcVar.c()).i = z;
        }
    }

    public final void b(pas pasVar) {
        rwc rwcVar = (rwc) this.c.b;
        if (rwcVar.h()) {
            ((hkt) rwcVar.c()).j.b(pasVar);
        }
    }

    public final void c(boolean z) {
        if (this.a) {
            if (((Boolean) this.d.dL()).booleanValue()) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            this.g = z;
        }
    }

    public final void d() {
        if (this.g && this.b) {
            rwc rwcVar = (rwc) this.c.b;
            if (rwcVar.h()) {
                ((FaceIndicatorView) rwcVar.c()).d(false);
            }
        }
    }

    public final void e() {
        if (this.g) {
            rwc rwcVar = (rwc) this.c.b;
            if (rwcVar.h()) {
                ((FaceIndicatorView) rwcVar.c()).c();
                ((FaceIndicatorView) rwcVar.c()).b();
                ((FaceIndicatorView) rwcVar.c()).setVisibility(0);
            }
            this.b = true;
        }
    }

    public final void f(boolean z) {
        if (((Boolean) this.e.dL()).booleanValue()) {
            if (z) {
                return;
            } else {
                z = false;
            }
        }
        this.f.set(z);
        rwc rwcVar = (rwc) this.c.b;
        if (rwcVar.h()) {
            ((hkt) rwcVar.c()).j.c(z);
        }
    }

    public final void g() {
        if (this.g) {
            rwc rwcVar = (rwc) this.c.b;
            if (rwcVar.h()) {
                ((FaceIndicatorView) rwcVar.c()).c();
                ((FaceIndicatorView) rwcVar.c()).setVisibility(0);
            }
            this.b = true;
        }
    }

    public final void h() {
        if (this.g && this.b) {
            rwc rwcVar = (rwc) this.c.b;
            if (rwcVar.h()) {
                ((FaceIndicatorView) rwcVar.c()).b();
                ((FaceIndicatorView) rwcVar.c()).setVisibility(4);
                ((FaceIndicatorView) rwcVar.c()).h = false;
            }
            this.b = false;
        }
    }

    public final boolean i() {
        rwc rwcVar = (rwc) this.c.b;
        if (!rwcVar.h()) {
            return false;
        }
        FaceIndicatorView faceIndicatorView = (FaceIndicatorView) rwcVar.c();
        Map map = faceIndicatorView.b;
        if (map.isEmpty() && faceIndicatorView.c.isEmpty()) {
            return false;
        }
        return map.size() + faceIndicatorView.c.size() > 0;
    }

    public final boolean j() {
        rwc rwcVar = (rwc) this.c.b;
        return rwcVar.h() && ((FaceIndicatorView) rwcVar.c()).g();
    }
}
