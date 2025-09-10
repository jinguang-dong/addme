package defpackage;

import android.animation.Animator;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fco implements oun {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fco(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oun
    public final /* synthetic */ syu a(Object obj, Object obj2) {
        if (this.b == 0) {
            if (((Boolean) obj).booleanValue()) {
                fcp fcpVar = (fcp) this.a;
                FocusIndicatorView focusIndicatorView = fcpVar.c;
                Animator animator = focusIndicatorView.N;
                fcpVar.b = (animator == null || !animator.isRunning()) ? focusIndicatorView.t.a() : nlu.a;
                fcpVar.b.b(new fbu(this, 8));
            }
            return null;
        }
        fcl fclVar = (fcl) this.a;
        fclVar.c = null;
        if (((Boolean) obj).booleanValue()) {
            fclVar.b = fclVar.d.j();
            nlt nltVar = fclVar.b;
            nltVar.getClass();
            nltVar.b(new fbu(this, 6));
        }
        return null;
    }
}
