package defpackage;

import android.animation.Animator;
import android.graphics.PointF;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcl implements fcc, pau {
    public nlt a;
    public nlt b;
    public szh c;
    public final FocusIndicatorView d;
    private final out e;
    private final our f;
    private volatile boolean g;
    private final oun h;

    public fcl(out outVar, FocusIndicatorView focusIndicatorView, owf owfVar) {
        our ourVar = new our();
        this.f = ourVar;
        this.g = true;
        this.a = null;
        this.b = null;
        this.h = new fco(this, 1);
        this.e = outVar;
        this.d = focusIndicatorView;
        ourVar.d(owfVar.dK(this, outVar));
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        nlt nltVarA;
        mwq mwqVar = (mwq) obj;
        if (this.g) {
            if (this.a == null && this.b == null) {
                lnn lnnVar = ((kfv) mwqVar.a).b;
                lnn lnnVar2 = lnn.PASSIVE_SCAN;
                if (lnnVar != lnnVar2 && ((kfv) mwqVar.b).b == lnnVar2) {
                    FocusIndicatorView focusIndicatorView = this.d;
                    Animator animator = focusIndicatorView.N;
                    if (animator == null || !animator.isRunning()) {
                        focusIndicatorView.o();
                        focusIndicatorView.m();
                        focusIndicatorView.m.b(new PointF(focusIndicatorView.getWidth() / 2.0f, focusIndicatorView.getHeight() / 2.0f));
                        nltVarA = focusIndicatorView.u.a();
                    } else {
                        nltVarA = nlu.a;
                    }
                    this.a = nltVarA;
                    nltVarA.b(new fbu(this, 5));
                    if (this.a != null) {
                        this.c = new szh();
                        ojl.cl(this.a.a(), this.c, this.h, this.e);
                    }
                }
            }
            if (this.c == null || ((kfv) mwqVar.a).b != lnn.PASSIVE_SCAN) {
                return;
            }
            lnn lnnVar3 = ((kfv) mwqVar.b).b;
            if (lnnVar3.b()) {
                boolean z = true;
                if (lnnVar3 != lnn.PASSIVE_FOCUSED && lnnVar3 != lnn.FOCUSED_LOCKED) {
                    z = false;
                }
                this.c.e(Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.mlu
    public final void c() {
        this.g = true;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.mlu
    public final void d(mlv mlvVar) {
        this.g = false;
    }
}
