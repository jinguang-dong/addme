package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nto implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nto(Object obj, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        int i = this.d;
        if (i == 0) {
            boolean z = this.a;
            boolean z2 = this.b;
            Object obj = this.c;
            if (!z) {
                ((ntr) obj).n.fg(z2);
                return;
            }
            ntr ntrVar = (ntr) obj;
            ntrVar.n.f(z2);
            ntrVar.d();
            return;
        }
        if (i == 1) {
            boolean z3 = this.b;
            boolean z4 = this.a;
            mje mjeVar = (mje) this.c;
            mjeVar.k(z4, z3);
            szh szhVar = mjeVar.X;
            if (szhVar != null) {
                szhVar.e(null);
                return;
            }
            return;
        }
        if (i == 2) {
            ntr ntrVar2 = (ntr) this.c;
            ManualWhiteBalanceUi manualWhiteBalanceUi = ntrVar2.m;
            jsv.J(manualWhiteBalanceUi != null, ntrVar2.s);
            boolean z5 = this.b;
            if (this.a) {
                ntrVar2.d();
                ntrVar2.n.c(z5);
                return;
            }
            Optional optional = ((jjq) ntrVar2.q.dL()).h;
            if (optional.isPresent()) {
                int iRound = Math.round(ske.aj((((Float) optional.get()).floatValue() + 1.0f) * 0.5f, 0.0f, 1.0f) * 200.0f);
                ntrVar2.m.b().setProgress(iRound);
                ntrVar2.m.e(iRound, 200);
            }
            ntrVar2.g(false, optional.isPresent());
            ntrVar2.n.d(z5);
            return;
        }
        if (i != 3) {
            boolean z6 = this.a;
            Object obj2 = this.c;
            if (z6) {
                ((nty) obj2).m();
            } else if (!((Boolean) ((ovx) ((nty) obj2).i).d).booleanValue()) {
                ((ntt) obj2).h();
            }
            boolean z7 = this.b;
            nty ntyVar = (nty) obj2;
            ntyVar.g.setVisibility(0);
            if (z7) {
                ntyVar.h.start();
                return;
            }
            ObjectAnimator objectAnimator = ntyVar.h;
            objectAnimator.cancel();
            objectAnimator.end();
            return;
        }
        boolean z8 = this.a;
        Object obj3 = this.c;
        if (z8) {
            ((nty) obj3).m();
        }
        boolean z9 = this.b;
        nty ntyVar2 = (nty) obj3;
        ntyVar2.k();
        if (z9) {
            if (ntyVar2.g.getAlpha() != 0.0f) {
                ntyVar2.h.reverse();
            }
        } else {
            ObjectAnimator objectAnimator2 = ntyVar2.h;
            objectAnimator2.cancel();
            objectAnimator2.reverse();
            objectAnimator2.end();
        }
    }
}
