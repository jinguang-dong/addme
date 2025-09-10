package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyy {
    public final lzh a;
    public final lzj b;
    public lzm c;
    public boolean d = false;
    public boolean e = false;
    public final our f;
    private final EnumSet g;

    public lyy(lzh lzhVar, lzj lzjVar) {
        this.a = lzhVar;
        this.b = lzjVar;
        EnumSet enumSetAllOf = EnumSet.allOf(lyx.class);
        this.g = enumSetAllOf;
        if (!lzjVar.d) {
            enumSetAllOf.remove(lyx.POST_CAPTURE_COOLDOWN);
        }
        if (!lzjVar.e) {
            enumSetAllOf.remove(lyx.TIMER_ACTIVE);
        }
        if (((Boolean) lzjVar.f.dL()).booleanValue()) {
            enumSetAllOf.remove(lyx.e);
        }
        this.f = new our();
    }

    public final void a(pjo pjoVar) {
        rnt.L(this.d);
        lzh lzhVar = this.a;
        if (lzhVar instanceof lzg) {
            ((lzg) lzhVar).d(pjoVar);
        }
    }

    public final void b(lyx lyxVar, boolean z) {
        EnumSet enumSet = this.g;
        if (z != enumSet.contains(lyxVar)) {
            if (z) {
                enumSet.add(lyxVar);
            } else {
                enumSet.remove(lyxVar);
            }
            rnt.L(this.d);
            boolean zIsEmpty = enumSet.isEmpty();
            if (this.e != zIsEmpty) {
                this.e = zIsEmpty;
                if (zIsEmpty) {
                    this.a.fa();
                } else {
                    this.a.f();
                    this.c.a();
                }
            }
        }
    }

    public final void c(boolean z) {
        rnt.L(this.d);
        b(lyx.APPLICATION_LIFECYCLE, !z);
    }

    public final void d(nkw nkwVar) {
        rnt.L(this.d);
        b(lyx.APPLICATION_MODE, !this.b.b.contains(nkwVar));
    }

    public final void e(pka pkaVar) {
        rnt.L(this.d);
        b(lyx.CAMERA_FACING, !this.b.c.contains(pkaVar));
    }

    public final void f(boolean z) {
        rnt.L(this.d);
        lyx lyxVar = lyx.POST_CAPTURE_COOLDOWN;
        boolean z2 = false;
        if (z && this.b.d) {
            z2 = true;
        }
        b(lyxVar, z2);
    }

    public final void g(boolean z) {
        lyx lyxVar = lyx.TIMER_ACTIVE;
        boolean z2 = false;
        if (z && this.b.e) {
            z2 = true;
        }
        b(lyxVar, z2);
    }

    public final void h(boolean z) {
        b(lyx.g, z);
    }
}
