package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import com.google.android.apps.camera.cameravisionkit.NewQrGleamingView;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqx implements gre, grc {
    public final rwc a;
    public long e;
    private final gsh g;
    private final Executor h;
    private final gqq i;
    private final grd j;
    private NewQrGleamingView l;
    private boolean m;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    private final List k = new ArrayList();
    public Optional d = Optional.empty();
    public final ovx f = new ovx(Optional.of(new RectF()));

    public gqx(rwc rwcVar, gsh gshVar, Executor executor, gqq gqqVar, grd grdVar) {
        this.a = rwcVar;
        this.g = gshVar;
        this.h = executor;
        this.i = gqqVar;
        this.j = grdVar;
    }

    private final synchronized void k() {
        this.e = 0L;
        this.k.clear();
        this.c.ifPresent(new gqw(0));
        this.c = Optional.empty();
    }

    private final synchronized void l(sbp sbpVar) {
        List list = this.k;
        list.clear();
        Stream streamFilter = Collection.EL.stream(sbpVar).filter(new fla(14));
        int i = sbp.d;
        list.addAll((java.util.Collection) streamFilter.collect(ryv.a));
    }

    @Override // defpackage.gre
    public final void a(List list) {
        if (this.d.isEmpty() || list.isEmpty()) {
            return;
        }
        Stream streamFilter = Collection.EL.stream(list).filter(new fla(13));
        int i = sbp.d;
        sbp sbpVar = (sbp) streamFilter.collect(ryv.a);
        if (sbpVar.isEmpty() || this.m) {
            this.d.ifPresent(new fio((gpr) (sbpVar.isEmpty() ? list.get(0) : sbpVar.get(0)), 15));
            return;
        }
        Optional optionalFindFirst = Collection.EL.stream(sbpVar).filter(new fme(this, 11)).findFirst();
        if (optionalFindFirst.isEmpty()) {
            k();
        }
        gpr gprVar = (gpr) optionalFindFirst.orElseGet(new jko(sbpVar, 1));
        l(sbpVar);
        this.e = gprVar.a;
        this.d.ifPresent(new fio(gprVar, 16));
        rwc rwcVar = gprVar.h;
        if (rwcVar.h() && gprVar.i) {
            this.f.a(Optional.of(((gpo) rwcVar.c()).a));
            this.j.b();
            synchronized (this) {
                if (this.c.isPresent()) {
                    return;
                }
                rwc rwcVar2 = this.a;
                if (!rwcVar2.h() || ((mlw) rwcVar2.c()).n(mlv.QR_GLEAMING)) {
                    our ourVar = new our();
                    ourVar.d(new gge(this, 6));
                    our ourVar2 = new our();
                    ourVar2.d(new fid(this, this.f.dK(this.i, this.h), 13, null));
                    synchronized (this) {
                        this.b = Optional.of(ourVar);
                        this.c = Optional.of(ourVar2);
                    }
                    this.d.ifPresent(new fkj(20));
                }
            }
        }
    }

    @Override // defpackage.gre
    public final void b() {
        this.h.execute(new gpk(this, 6));
    }

    @Override // defpackage.mlu
    public final void d(mlv mlvVar) {
        this.d.ifPresent(new gqw(1));
    }

    @Override // defpackage.gre
    public final void e() {
        k();
        this.m = true;
        rwc rwcVar = this.a;
        if (rwcVar.h()) {
            ((mlw) rwcVar.c()).l(mlv.QR_GLEAMING);
        }
        this.g.a = null;
    }

    @Override // defpackage.gre
    public final void f() {
        this.m = false;
        rwc rwcVar = this.a;
        if (rwcVar.h()) {
            ((mlw) rwcVar.c()).j(mlv.QR_GLEAMING, this);
        }
        this.g.a = this;
    }

    @Override // defpackage.gre
    public final void g(View view) {
        NewQrGleamingView newQrGleamingView = (NewQrGleamingView) view;
        this.l = newQrGleamingView;
        gqq gqqVar = this.i;
        gqqVar.b = newQrGleamingView;
        gqqVar.b.addOnLayoutChangeListener(new fvf(gqqVar, 3));
    }

    @Override // defpackage.gsj
    public final boolean h(PointF pointF) {
        sbp sbpVarJ;
        Optional optionalEmpty;
        out.a();
        NewQrGleamingView newQrGleamingView = this.l;
        boolean z = false;
        if (newQrGleamingView == null) {
            return false;
        }
        int width = newQrGleamingView.getWidth();
        int height = this.l.getHeight();
        synchronized (this) {
            sbpVarJ = sbp.j(this.k);
        }
        int size = sbpVarJ.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                optionalEmpty = Optional.empty();
                break;
            }
            gpr gprVar = (gpr) sbpVarJ.get(i);
            rwc rwcVar = gprVar.h;
            if (rwcVar.h()) {
                float f = width;
                float f2 = height;
                RectF rectF = new RectF(((gpo) rwcVar.c()).a.left * f, ((gpo) rwcVar.c()).a.top * f2, ((gpo) rwcVar.c()).a.right * f, ((gpo) rwcVar.c()).a.bottom * f2);
                if (pointF.x > rectF.left && pointF.x < rectF.right && pointF.y > rectF.top && pointF.y < rectF.bottom) {
                    optionalEmpty = Optional.of(gprVar);
                    break;
                }
            }
            i++;
        }
        if (optionalEmpty.isPresent() && SystemClock.elapsedRealtime() - ((gpr) optionalEmpty.get()).j < 500) {
            z = true;
        }
        if (z && this.e != ((gpr) optionalEmpty.get()).a) {
            this.h.execute(new cmc(this, optionalEmpty, 10, null));
        }
        optionalEmpty.isPresent();
        return z;
    }

    @Override // defpackage.gre
    public final paq i(gso gsoVar) {
        this.d = Optional.of(gsoVar);
        return new ffy(this, 10);
    }

    @Override // defpackage.grc
    public final void j() {
        this.d.ifPresent(new gqw(1));
    }

    @Override // defpackage.mlu
    public final void c() {
    }
}
