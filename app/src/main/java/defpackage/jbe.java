package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.CheckBox;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbe implements itm {
    public final tzj a;
    private final tzj d;
    private final moc e;
    private final String f;
    private final ovx g;
    private final jmw h;
    public boolean c = true;
    public final owm b = new owm(new fvq(this, 5));

    public jbe(jmw jmwVar, tzj tzjVar, tzj tzjVar2, moc mocVar, Resources resources, ovx ovxVar) {
        this.h = jmwVar;
        this.a = tzjVar;
        this.d = tzjVar2;
        this.e = mocVar;
        this.g = ovxVar;
        this.f = resources.getString(R.string.longshot_accessibility_peek);
    }

    @Override // defpackage.itm
    public final synchronized syu a(int i) {
        this.c = false;
        this.b.a();
        this.g.a(true);
        jms jmsVar = (jms) this.d.a();
        jmsVar.l = true;
        jmsVar.n = false;
        if (jmsVar.o) {
            nks nksVar = jmsVar.s;
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(nksVar, null);
            ZoomLockView zoomLockView = nksVar.a;
            if (zoomLockView.k == null) {
                zoomLockView.k = ambientController;
            }
            if (zoomLockView.getVisibility() == 8) {
                zoomLockView.e.start();
            }
        }
        tzj tzjVar = this.a;
        jbc jbcVar = (jbc) tzjVar.a();
        if (jbcVar.C != null) {
            jbcVar.F.g();
            jbcVar.I = i == 3;
            jbcVar.J(true);
        }
        jbc jbcVar2 = (jbc) tzjVar.a();
        jbcVar2.S.a(true);
        hie hieVar = jbcVar2.al;
        if (hieVar != null) {
            CheckBox checkBox = hieVar.p;
            rnt.w(checkBox, "EvCompViewController must be first initialized", new Object[0]);
            checkBox.setEnabled(false);
        }
        rwc rwcVar = jbcVar2.q;
        if (rwcVar.h()) {
            rwc rwcVar2 = ((fty) rwcVar.c()).b;
            if (rwcVar2.h()) {
                ((ftv) rwcVar2.c()).j();
            }
        }
        rwc rwcVar3 = jbcVar2.p;
        if (rwcVar3.h()) {
            ((mhe) rwcVar3.c()).o(true);
            ((mhe) rwcVar3.c()).l();
            ((mhe) rwcVar3.c()).f();
        }
        if (jbcVar2.aA.p(gzo.bJ)) {
            jbcVar2.au.a(jbcVar2);
        }
        jbcVar2.an.K.e();
        krj krjVar = jbcVar2.as;
        if (krjVar.r()) {
            krjVar.h();
        }
        jbcVar2.l.m(false);
        jbcVar2.h.d(false);
        if (i == 2) {
            jbcVar2.v.b();
        } else {
            jbcVar2.v.c();
        }
        jbcVar2.at.g(imk.FIRST_RUN_TOAST);
        jbcVar2.ac.a(true);
        jbcVar2.y.n();
        rwc rwcVar4 = jbcVar2.ag;
        if (rwcVar4.h()) {
            ((hko) rwcVar4.c()).h();
        }
        ((jbc) tzjVar.a()).w.g();
        return ske.M(true);
    }

    @Override // defpackage.itm
    public final synchronized syu b(int i) {
        boolean z = false;
        this.g.a(false);
        jmw jmwVar = this.h;
        jmr jmrVar = new jmr(jmwVar, 4);
        synchronized (jmwVar.d) {
            if (jmwVar.b.isEmpty()) {
                jmwVar.c.add(jmrVar);
                z = true;
            }
        }
        if (!z) {
            jmrVar.run();
        }
        ((jms) this.d.a()).a();
        this.e.i(this.f);
        new Handler(Looper.getMainLooper()).post(new ivi(this, 20));
        ((jbc) this.a.a()).w.h();
        return ske.M(true);
    }

    public final synchronized void c() {
        this.g.a(false);
        if (this.c) {
            return;
        }
        b(4);
    }
}
