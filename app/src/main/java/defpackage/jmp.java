package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmp {
    public final ngw a;
    public final Handler b;
    public final imi d;
    public final rah e;
    private final Resources f;
    private final SharedPreferences g;
    private final ScheduledExecutorService h;
    private final boolean i;
    private ncn j;
    private final fdq m;
    private final ocq n;
    private paq k = new fgp(12);
    private ScheduledFuture l = null;
    public volatile paq c = null;

    public jmp(fdq fdqVar, ngw ngwVar, Resources resources, SharedPreferences sharedPreferences, imi imiVar, ocq ocqVar, rah rahVar, hbj hbjVar, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.a = ngwVar;
        this.f = resources;
        this.g = sharedPreferences;
        this.d = imiVar;
        this.n = ocqVar;
        this.e = rahVar;
        this.h = scheduledExecutorService;
        this.b = handler;
        this.i = hbjVar.p(gzz.u);
        this.m = fdqVar;
    }

    private final synchronized void e() {
        this.l = this.h.schedule(new dyo(this, 14), 3000L, TimeUnit.MILLISECONDS);
    }

    private final synchronized void f() {
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.l = null;
        }
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }

    public final synchronized void a() {
        ocq ocqVar = this.n;
        ocqVar.al("long_press", ocqVar.ai("long_press") + 1);
    }

    public final synchronized void b(ncn ncnVar) {
        paq paqVar;
        ncn ncnVar2;
        boolean z = this.i;
        if (z && (((ncnVar2 = this.j) == ncn.PHOTO_IDLE || ncnVar2 == null) && ncnVar == ncn.PHOTO_LONGPRESS)) {
            e();
        }
        if (this.j == ncn.VIDEO_PRESSED && ncnVar == ncn.VIDEO_IDLE) {
            SharedPreferences sharedPreferences = this.g;
            if (!sharedPreferences.contains("finish_video_capture")) {
                sharedPreferences.edit().putBoolean("finish_video_capture", true).apply();
            }
        }
        ncn ncnVar3 = this.j;
        if ((ncnVar3 == ncn.PHOTO_LONGPRESS || ncnVar3 == ncn.PHOTO_LONGPRESS_LOCKED) && ncnVar == ncn.PHOTO_IDLE) {
            if (z) {
                f();
            }
            SharedPreferences sharedPreferences2 = this.g;
            if (!sharedPreferences2.contains("finish_long_shot_capture")) {
                sharedPreferences2.edit().putBoolean("finish_long_shot_capture", true).apply();
            }
        }
        if (ncnVar != ncn.PHOTO_IDLE && (paqVar = this.k) != null) {
            paqVar.close();
        }
        this.j = ncnVar;
    }

    final synchronized boolean c() {
        if (this.j == ncn.PHOTO_IDLE && this.n.ai(TOnSyMaYeslEl.MCRWYB) == 0) {
            SharedPreferences sharedPreferences = this.g;
            if (sharedPreferences.getBoolean("finish_video_capture", false)) {
                if (!sharedPreferences.getBoolean("finish_long_shot_capture", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void d() {
        Object obj = this.a.k;
        int height = ((ShutterButton) obj).getHeight();
        if (c() && height > 0) {
            int i = -((ShutterButton) obj).getHeight();
            Resources resources = this.f;
            int dimensionPixelSize = (i / 2) + resources.getDimensionPixelSize(R.dimen.long_pressed_photo_button_radius) + resources.getDimensionPixelSize(R.dimen.long_press_tooltip_above_shutter);
            nfh nfhVar = new nfh(resources.getString(R.string.long_press_tooltip));
            nfhVar.c((View) obj, dimensionPixelSize);
            nfhVar.h();
            nfhVar.j();
            nfhVar.m();
            nfhVar.n();
            nfhVar.c = 1500;
            nfhVar.k();
            nfhVar.l();
            nfhVar.f(new jcq(this, 19), this.h);
            nfhVar.l = this.d;
            nfhVar.k = 4;
            nfhVar.e = true;
            this.k = nfhVar.a();
            this.m.j().d(this.k);
        }
    }
}
