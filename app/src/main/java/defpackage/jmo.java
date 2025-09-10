package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmo implements lst {
    public final rwc c;
    private final ngw f;
    private final Resources g;
    private final ScheduledExecutorService h;
    private final imi j;
    private final lrp k;
    private final ocq l;
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public paq d = new fhf(13);
    public final may e = new jmn(this);

    public jmo(ngw ngwVar, Resources resources, ocq ocqVar, imi imiVar, ScheduledExecutorService scheduledExecutorService, lrp lrpVar, rwc rwcVar) {
        this.f = ngwVar;
        this.g = resources;
        this.l = ocqVar;
        this.k = lrpVar;
        this.j = imiVar;
        this.h = scheduledExecutorService;
        this.c = rwcVar;
    }

    public final synchronized paq a() {
        if (!this.i.compareAndSet(true, false) || this.l.ai("long_press_photos_edu") != 0) {
            return new fhf(14);
        }
        ThumbnailView thumbnailView = ((BottomBar) this.f.f).o;
        Resources resources = this.g;
        float f = -(thumbnailView.g / 2.0f);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.long_press_tooltip_above_thumbnail);
        nfh nfhVar = new nfh(new nfg() { // from class: jmm
            @Override // defpackage.nfg
            public final View a(Context context) {
                return LayoutInflater.from(context).inflate(R.layout.longshot_notification_tooltip, (ViewGroup) null);
            }
        });
        nfhVar.c(thumbnailView, (int) (f + dimensionPixelSize));
        nfhVar.h();
        nfhVar.j();
        nfhVar.m();
        nfhVar.n();
        nfhVar.c = 200;
        nfhVar.d = 30000;
        nfhVar.d(new jko(this, 2));
        nfhVar.k();
        nfhVar.l();
        nfhVar.g = false;
        nfhVar.a.add(new nfd(new jcq(this, 18), this.h, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.SECONDS)));
        nfhVar.l = this.j;
        nfhVar.k = 4;
        nfhVar.e = false;
        return nfhVar.a();
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        this.i.set(((Boolean) rwc.i(this.k.a(ltdVar)).b(new idb(8)).e(false)).booleanValue());
        if (this.a.get()) {
            return;
        }
        this.d = a();
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    public final synchronized void k() {
        ocq ocqVar = this.l;
        ocqVar.al("long_press_photos_edu", ocqVar.ai("long_press_photos_edu") + 1);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void b(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void c(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void n(ltd ltdVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void h(ltd ltdVar, par parVar) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
    }
}
