package defpackage;

import android.animation.Animator;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcu implements oun {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fcu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oun
    public final /* synthetic */ syu a(Object obj, Object obj2) {
        if (this.b != 0) {
            fce fceVar = (fce) this.a;
            fceVar.g = null;
            if (((Boolean) obj).booleanValue()) {
                fceVar.e = fceVar.c ? fceVar.m.i() : fceVar.m.j();
                nlt nltVar = fceVar.e;
                nltVar.getClass();
                nltVar.b(new fbu(this, 4));
            }
            return null;
        }
        Boolean bool = (Boolean) obj;
        fcv fcvVar = (fcv) this.a;
        if (!fcvVar.f() && bool.booleanValue()) {
            FocusIndicatorView focusIndicatorView = fcvVar.i;
            Animator animator = focusIndicatorView.N;
            fcvVar.g = (animator == null || !animator.isRunning()) ? focusIndicatorView.E.a() : nlu.a;
            fcvVar.g.b(new fbu(this, 10));
        }
        return null;
    }
}
