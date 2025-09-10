package defpackage;

import android.content.res.Resources;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import com.google.ar.core.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class moq extends mop {
    final /* synthetic */ mos a;

    public moq(mos mosVar) {
        this.a = mosVar;
    }

    @Override // defpackage.mop, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        mos mosVar = this.a;
        mosVar.e.b(false);
        fvu fvuVar = mosVar.b;
        if (!fvuVar.g) {
            fvuVar.a.x(false);
        }
        fvuVar.a.p(sbv.n(fvo.CENTER_LEFT, rwc.j(fvuVar.c)), true);
        fvuVar.e(fvv.CAPTURING_OR_RECORDING);
        mzz mzzVar = mosVar.a;
        mosVar.f = mzzVar.s();
        mzzVar.m(false);
        mzzVar.w(false);
        mosVar.c.S();
        mosVar.d.d(false);
        mosVar.g.k();
        nql.b();
        mbj mbjVar = mosVar.h;
        ovx ovxVar = (ovx) mbjVar.b;
        rnt.O(ovxVar.d == fuu.b, "Cannot transition to CAPTURING from %s", ovxVar.d);
        mbjVar.k(fuu.CAPTURING);
        khb khbVar = (khb) mbjVar.d;
        Object obj = khbVar.e;
        if (obj != null) {
            AutoTimerIndicatorView autoTimerIndicatorView = (AutoTimerIndicatorView) obj;
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f;
            if (viewPropertyAnimator != null) {
                rnt.x(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(1.0f).setListener(new fvg(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f = listener;
            autoTimerIndicatorView.b(autoTimerIndicatorView.getLeft(), autoTimerIndicatorView.getTop(), autoTimerIndicatorView.getRight(), autoTimerIndicatorView.getBottom());
            autoTimerIndicatorView.addOnLayoutChangeListener(autoTimerIndicatorView.c);
            khbVar.b = true;
        }
        fut futVar = (fut) mbjVar.e;
        futVar.f++;
        rwu rwuVar = futVar.b;
        rwuVar.d();
        rwuVar.e();
        futVar.d.clear();
        futVar.c.clear();
        ((mbj) mbjVar.f).c(R.raw.video_start);
    }

    @Override // defpackage.mop, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        mos mosVar = this.a;
        mbj mbjVar = mosVar.h;
        ovx ovxVar = (ovx) mbjVar.b;
        rnt.O(ovxVar.d == fuu.CAPTURING, "Cannot transition to IDLE from %s", ovxVar.d);
        mbjVar.k(fuu.b);
        khb khbVar = (khb) mbjVar.d;
        Object obj = khbVar.e;
        if (obj != null) {
            AutoTimerIndicatorView autoTimerIndicatorView = (AutoTimerIndicatorView) obj;
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f;
            if (viewPropertyAnimator != null) {
                rnt.x(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(0.0f).setListener(new fvh(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f = listener;
            autoTimerIndicatorView.removeOnLayoutChangeListener(autoTimerIndicatorView.c);
            khbVar.b = false;
        }
        fut futVar = (fut) mbjVar.e;
        rwu rwuVar = futVar.b;
        if (rwuVar.a) {
            rwuVar.f();
        }
        if (futVar.f > 0) {
            Object obj2 = mbjVar.g;
            tpc tpcVarM = ssx.a.m();
            iso isoVar = (iso) obj2;
            fut futVar2 = (fut) isoVar.b;
            String string = futVar2.a.toString();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            ssx ssxVar = (ssx) tphVar;
            string.getClass();
            ssxVar.b |= 1;
            ssxVar.c = string;
            int i = futVar2.f;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            ssx ssxVar2 = (ssx) tphVar2;
            ssxVar2.b |= 2;
            ssxVar2.d = i;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            ssx ssxVar3 = (ssx) tpcVarM.b;
            ssxVar3.e = 0;
            ssxVar3.b |= 4;
            long jA = futVar2.b.a(TimeUnit.MILLISECONDS);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ssx ssxVar4 = (ssx) tpcVarM.b;
            ssxVar4.b |= 8;
            ssxVar4.f = jA;
            List list = futVar2.d;
            int size = list.size();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            ssx ssxVar5 = (ssx) tpcVarM.b;
            ssxVar5.b |= 16;
            ssxVar5.g = size;
            if (size > 1) {
                int i2 = size - 1;
                long jLongValue = ((Long) list.get(i2)).longValue() - ((Long) list.get(0)).longValue();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                ssx ssxVar6 = (ssx) tpcVarM.b;
                ssxVar6.b |= 32;
                ssxVar6.h = jLongValue / i2;
            }
            Object obj3 = isoVar.a;
            ssx ssxVar7 = (ssx) tpcVarM.l();
            tpc tpcVarM2 = sod.a.m();
            soc socVar = soc.PHOTOBOOTH_SESSION_EVENT;
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar3 = tpcVarM2.b;
            sod sodVar = (sod) tphVar3;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            if (!tphVar3.C()) {
                tpcVarM2.o();
            }
            sod sodVar2 = (sod) tpcVarM2.b;
            ssxVar7.getClass();
            sodVar2.H = ssxVar7;
            sodVar2.c |= 512;
            ((mdy) obj3).I(tpcVarM2);
        }
        ((mbj) mbjVar.f).c(R.raw.video_stop);
        fvu fvuVar = mosVar.b;
        if (!fvuVar.i) {
            fvuVar.a.p(sbv.o(fvo.CENTER_LEFT, rwc.j(fvuVar.c), fvo.CENTER_RIGHT, rwc.j(fvuVar.b)), true);
            fvuVar.f(fvv.CAPTURING_OR_RECORDING);
        }
        mzz mzzVar = mosVar.a;
        mzzVar.m(mosVar.f);
        mzzVar.w(mosVar.f);
        mosVar.c.ao();
        mosVar.d.d(true);
        mosVar.g.j();
        nql.c();
        if (((Boolean) ((ovx) mosVar.i.a).d).booleanValue()) {
            mosVar.e.f();
        }
    }

    @Override // defpackage.mop
    public void d() {
    }
}
