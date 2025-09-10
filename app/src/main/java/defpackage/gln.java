package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gln {
    public final fvu c;
    public final itl d;
    public final out e;
    public final mzz f;
    public final ndj g;
    public final View.OnLayoutChangeListener h;
    public RecordSpeedSlider i;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public glq o;
    public mxj q;
    public mxj r;
    public szh s;
    public final fdq t;
    public final imi u;
    public final hbj v;
    public AmbientModeSupport.AmbientController w;
    public final ocq x;
    public final ArrayList a = new ArrayList();
    public final AtomicInteger b = new AtomicInteger(-1);
    private final Set y = new HashSet();
    public paq j = new fgp(2);
    public mxm p = mxm.PORTRAIT;

    public gln(fdq fdqVar, fvu fvuVar, imi imiVar, itl itlVar, out outVar, mzz mzzVar, ndj ndjVar, ocq ocqVar, hbj hbjVar) {
        mxj mxjVar = mxj.PHONE_LAYOUT;
        this.q = mxjVar;
        this.r = mxjVar;
        this.t = fdqVar;
        this.c = fvuVar;
        this.u = imiVar;
        this.d = itlVar;
        this.e = outVar;
        this.f = mzzVar;
        this.g = ndjVar;
        this.x = ocqVar;
        this.h = new fvf(this, 2);
        this.v = hbjVar;
    }

    private final void j() {
        this.i.measure(0, 0);
        int measuredHeight = this.i.getMeasuredHeight();
        int height = ((ViewGroup) this.i.getParent()).getHeight();
        RecordSpeedSlider recordSpeedSlider = this.i;
        recordSpeedSlider.layout(recordSpeedSlider.getLeft(), height - measuredHeight, this.i.getRight(), height);
    }

    private final void k(int i) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((glr) it.next()).a(i);
        }
    }

    public final void a(glr glrVar) {
        this.y.add(glrVar);
    }

    public final void b() {
        this.c.m(false);
        this.f.m(false);
        this.g.M(false);
        this.d.k(2);
    }

    public final void c(int i) {
        if (this.i.getChildAt(i) == null) {
            return;
        }
        this.i.getChildAt(i).setVisibility(8);
        j();
    }

    public final void d(glr glrVar) {
        this.y.remove(glrVar);
    }

    public final void e(boolean z) {
        RecordSpeedSlider recordSpeedSlider = this.i;
        if (recordSpeedSlider == null) {
            return;
        }
        if (z) {
            recordSpeedSlider.d();
        } else {
            recordSpeedSlider.c();
        }
    }

    public final void f() {
        glq glqVar;
        RecordSpeedSlider recordSpeedSlider = this.i;
        if (recordSpeedSlider == null || !recordSpeedSlider.k() || (glqVar = this.o) == null) {
            return;
        }
        glqVar.e.ifPresent(new fio(this, 13));
    }

    public final void g(int i) {
        if (this.i.getChildAt(i) == null) {
            return;
        }
        this.i.getChildAt(i).setVisibility(0);
        j();
    }

    public final void h(int i, int i2) {
        if (!this.i.j()) {
            if (i == 0) {
                throw null;
            }
            k(i2);
        } else {
            if (i == 0) {
                throw null;
            }
            if (i2 < this.m) {
                k(i2);
            }
        }
    }

    public final void i(int i) {
        if (this.o.f == 0) {
            throw null;
        }
    }
}
