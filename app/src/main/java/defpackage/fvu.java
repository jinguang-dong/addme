package defpackage;

import android.app.Activity;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.CameraSwitchButton;
import com.google.android.apps.camera.bottombar.PauseResumeButton;
import com.google.android.apps.camera.bottombar.SnapshotButton;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvu implements mxl {
    public final BottomBar a;
    public final CameraSwitchButton b;
    public final ThumbnailView c;
    public final owf d;
    public rwc e;
    public final Object f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final List l;
    public final gsn m;
    private final owf n;
    private final owf o;
    private mxj p = mxj.PHONE_LAYOUT;
    private nkw q;
    private final rwc r;
    private final owf s;
    private final Set t;
    private boolean u;
    private final hbj v;

    public fvu(BottomBar bottomBar, hbj hbjVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, our ourVar) {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.r = rvkVar;
        this.s = new ovx(false);
        this.t = new HashSet();
        this.m = new fvt(this);
        this.a = bottomBar;
        this.v = hbjVar;
        this.d = owfVar;
        this.n = owfVar2;
        this.o = owfVar4;
        this.b = bottomBar.p;
        this.c = bottomBar.o;
        this.f = new Object();
        this.l = new ArrayList();
        this.q = nkw.UNINITIALIZED;
        owfVar3.getClass();
        bottomBar.t = new fvq(owfVar3, 1);
        bottomBar.u = new fvq(this, 0);
        ourVar.d(owfVar3.dK(new fpe(bottomBar, 14), sxo.a));
    }

    private final rwc C() {
        return (!iqi.a.contains(this.q) && this.e.h() && this.u) ? this.e : rvk.a;
    }

    public final void A(gsn gsnVar) {
        synchronized (this.f) {
            this.l.add(gsnVar);
        }
    }

    public final void B(gsn gsnVar) {
        synchronized (this.f) {
            this.l.remove(gsnVar);
        }
    }

    public final paq a() {
        n(4);
        return new ffy(this, 6);
    }

    public final rwc d() {
        return ((Boolean) ((ovx) this.s).d).booleanValue() ? this.r : rvk.a;
    }

    public final void e(fvv fvvVar) {
        this.t.add(fvvVar);
        this.u = false;
        this.a.y(fvo.RIGHT, rvk.a);
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        this.p = mxjVar;
        if (mxjVar == mxj.JARVIS_LAYOUT || mxjVar == mxj.SIMPLIFIED_LAYOUT) {
            this.a.q(fvo.RIGHT, this.e);
            this.j = true;
            return;
        }
        if (mxjVar == mxj.PHONE_LAYOUT) {
            BottomBar bottomBar = this.a;
            if (((Activity) bottomBar.getContext()).isInMultiWindowMode()) {
                bottomBar.post(new fnf(this, 7));
                return;
            }
        }
        if (this.h) {
            if (this.k) {
                this.a.q(fvo.CENTER_RIGHT, rvk.a);
                this.k = false;
                return;
            }
            return;
        }
        if (this.j) {
            this.a.q(fvo.RIGHT, rvk.a);
            this.j = false;
        }
    }

    public final void f(fvv fvvVar) {
        if (this.u) {
            return;
        }
        Set set = this.t;
        set.remove(fvvVar);
        if (set.isEmpty()) {
            this.u = true;
            this.a.y(fvo.RIGHT, C());
        }
    }

    public final void g() {
        if (this.h) {
            this.a.q(fvo.RIGHT, this.e);
        }
        BottomBar bottomBar = this.a;
        if (((Activity) bottomBar.getContext()).isInMultiWindowMode() && nlj.l(bottomBar.getContext())) {
            bottomBar.q(fvo.RIGHT, this.e);
            this.j = true;
        }
        bottomBar.q(fvo.CENTER_RIGHT, rvk.a);
    }

    public final void h() {
        BottomBar bottomBar = this.a;
        bottomBar.w();
        bottomBar.x(false);
        e(fvv.CAPTURING_OR_RECORDING);
    }

    public final void i() {
        PauseResumeButton pauseResumeButtonM = this.a.m();
        if (pauseResumeButtonM.d == null || pauseResumeButtonM.b) {
            pauseResumeButtonM.d = pauseResumeButtonM.a.getResources().getDrawable(R.drawable.resume_center_circle, null);
        }
        pauseResumeButtonM.setImageDrawable(pauseResumeButtonM.d);
        pauseResumeButtonM.c = true;
        pauseResumeButtonM.setContentDescription(pauseResumeButtonM.getResources().getString(R.string.resume_video_recording));
        pauseResumeButtonM.refreshDrawableState();
    }

    public final void j(boolean z) {
        CameraSwitchButton cameraSwitchButton = this.a.p;
        cameraSwitchButton.setEnabled(false);
        cameraSwitchButton.setContentDescription(z ? cameraSwitchButton.getResources().getString(R.string.camera_id_front_desc) : cameraSwitchButton.getResources().getString(R.string.camera_id_back_desc));
        cameraSwitchButton.setEnabled(true);
    }

    public final void k() {
        this.a.m().a();
    }

    public final void l(boolean z) {
        this.a.p.setEnabled(z);
    }

    public final void m(boolean z) {
        BottomBar bottomBar = this.a;
        bottomBar.s(z);
        bottomBar.setPressed(false);
    }

    public final void n(int i) {
        this.a.setImportantForAccessibility(i);
    }

    public final void o(boolean z) {
        this.g = z;
        this.a.u();
    }

    public final void p(final boolean z) {
        this.a.post(new Runnable() { // from class: fvs
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.s(z);
            }
        });
    }

    public final void q(boolean z) {
        this.a.n().l(z);
    }

    public final void r() {
        y(this.q);
        if (!this.v.p(hak.h) && this.q == nkw.PORTRAIT) {
            t();
        }
        f(fvv.CAPTURING_OR_RECORDING);
    }

    public final void s() {
        f(fvv.WINDOW_AREA_STATUS_CHANGED);
        this.a.q(fvo.CENTER_RIGHT, rwc.j(this.b));
    }

    public final void t() {
        this.a.p(sbv.n(fvo.CENTER_LEFT, rwc.j(this.c)), true);
    }

    public final void u() {
        BottomBar bottomBar = this.a;
        bottomBar.p(sbv.o(fvo.CENTER_LEFT, rwc.j(bottomBar.k()), fvo.CENTER_RIGHT, rwc.j(bottomBar.h())), true);
    }

    public final void v(boolean z, boolean z2) {
        Object objJ;
        rwc rwcVarJ;
        if (!this.g) {
            this.a.x(false);
        }
        if (z) {
            PauseResumeButton pauseResumeButtonM = this.a.m();
            pauseResumeButtonM.getClass();
            objJ = rwc.j(pauseResumeButtonM);
        } else {
            objJ = rvk.a;
        }
        Object obj = objJ;
        if (z2) {
            SnapshotButton snapshotButtonN = this.a.n();
            snapshotButtonN.getClass();
            rwcVarJ = rwc.j(snapshotButtonN);
        } else {
            rwcVarJ = rvk.a;
        }
        rwc rwcVar = rwcVarJ;
        owf owfVar = this.d;
        rwc rwcVarC = ((Boolean) owfVar.dL()).booleanValue() ? C() : rvk.a;
        BottomBar bottomBar = this.a;
        fvo fvoVar = fvo.CENTER_LEFT;
        fvo fvoVar2 = fvo.CENTER_RIGHT;
        bottomBar.p(sbv.p(fvoVar, obj, fvoVar2, rwcVar, fvo.RIGHT, rwcVarC), true);
        if (((Activity) bottomBar.getContext()).isInMultiWindowMode() && nlj.l(bottomBar.getContext()) && ((Boolean) owfVar.dL()).booleanValue()) {
            bottomBar.q(fvoVar2, rwcVar);
            this.k = true;
        }
        this.h = true;
    }

    public final void w() {
        this.a.p(sbv.n(fvo.CENTER_LEFT, rwc.j(this.c)), true);
    }

    public final void x() {
        this.b.callOnClick();
    }

    public final void y(nkw nkwVar) {
        this.q = nkwVar;
        if (((Boolean) this.o.dL()).booleanValue()) {
            BottomBar bottomBar = this.a;
            bottomBar.p(sbv.o(fvo.CENTER_LEFT, rwc.j(bottomBar.i()), fvo.CENTER_RIGHT, rwc.j(bottomBar.j())), false);
            return;
        }
        BottomBar bottomBar2 = this.a;
        bottomBar2.x(true);
        nkw nkwVar2 = nkw.UNINITIALIZED;
        switch (nkwVar.ordinal()) {
            case 0:
            case 12:
                throw new UnsupportedOperationException("Unsupported application mode ".concat(String.valueOf(String.valueOf(nkwVar))));
            case 1:
            case 2:
            case 6:
            case 10:
            case 11:
            case 15:
            case 16:
                bottomBar2.p(sbv.q(fvo.LEFT, d(), fvo.CENTER_LEFT, rwc.j(this.c), fvo.CENTER_RIGHT, rwc.j(this.b), fvo.RIGHT, C()), true);
                break;
            case 3:
            case 4:
            case 5:
            case 13:
            case 17:
                bottomBar2.p(sbv.o(fvo.LEFT, d(), fvo.CENTER_LEFT, rwc.j(this.c)), true);
                break;
            case 7:
            case 8:
                bottomBar2.p(sbv.n(fvo.CENTER_RIGHT, rwc.j(this.b)), true);
                break;
            case 9:
                bottomBar2.w();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bottomBar2.p(sbv.q(fvo.LEFT, d(), fvo.CENTER_LEFT, rwc.j(this.c), fvo.CENTER_RIGHT, this.v.p(gym.U) ? rwc.j(this.b) : rvk.a, fvo.RIGHT, C()), true);
                break;
            case 18:
                if (!this.v.p(gyi.u)) {
                    bottomBar2.p(sbv.n(fvo.CENTER_LEFT, rwc.j(this.c)), true);
                    break;
                } else {
                    bottomBar2.p(sbv.p(fvo.LEFT, d(), fvo.CENTER_LEFT, rwc.j(this.c), fvo.RIGHT, C()), true);
                    break;
                }
            case 19:
                bottomBar2.p(sbv.p(fvo.LEFT, d(), fvo.CENTER_LEFT, rwc.j(this.c), fvo.RIGHT, C()), true);
                break;
        }
        if (iqi.a.contains(nkwVar)) {
            e(fvv.UNSUPPORTED_MODE);
        } else {
            f(fvv.UNSUPPORTED_MODE);
        }
    }

    public final void z(boolean z) {
        if (!this.g) {
            this.a.x(true);
        }
        rwc rwcVarJ = rwc.j(this.c);
        Object objJ = z ? rwc.j(this.b) : rvk.a;
        BottomBar bottomBar = this.a;
        fvo fvoVar = fvo.LEFT;
        rwc rwcVarD = d();
        fvo fvoVar2 = fvo.CENTER_LEFT;
        fvo fvoVar3 = fvo.CENTER_RIGHT;
        fvo fvoVar4 = fvo.RIGHT;
        bottomBar.p(sbv.q(fvoVar, rwcVarD, fvoVar2, rwcVarJ, fvoVar3, objJ, fvoVar4, C()), true);
        PauseResumeButton pauseResumeButtonM = bottomBar.m();
        pauseResumeButtonM.a();
        pauseResumeButtonM.refreshDrawableState();
        owf owfVar = this.d;
        if (((Boolean) owfVar.dL()).booleanValue() || !((nlj.l(bottomBar.getContext()) && ((Activity) bottomBar.getContext()).isInMultiWindowMode()) || this.p.equals(mxj.JARVIS_LAYOUT))) {
            bottomBar.q(fvoVar4, rvk.a);
        } else {
            bottomBar.q(fvoVar4, this.e);
            this.j = true;
        }
        if (((Boolean) owfVar.dL()).booleanValue() || ((Boolean) this.n.dL()).booleanValue()) {
            bottomBar.q(fvoVar3, rwc.j(this.b));
        } else {
            bottomBar.q(fvoVar3, rvk.a);
        }
        this.h = false;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
