package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Point;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktx implements jhh, jhf, jhg {
    public final boolean a;
    public final pbn b;
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    public final pnk f;
    private final Activity g;
    private final WindowManager h;
    private final pbc i;
    private final Executor j;
    private final ContentResolver k;
    private final ContentObserver l;
    private final our m;

    public ktx(Activity activity, pnk pnkVar, WindowManager windowManager, pbb pbbVar, fdq fdqVar, Executor executor, pbn pbnVar, ContentResolver contentResolver) {
        this.g = activity;
        this.m = fdqVar.j();
        pnkVar.getClass();
        this.f = pnkVar;
        this.h = windowManager;
        this.j = executor;
        this.b = pbnVar;
        this.k = contentResolver;
        this.e = false;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int rotation = defaultDisplay.getRotation();
        pas pasVar = new pas(point.x, point.y);
        pasVar = (rotation == 1 || rotation == 3) ? pasVar.h() : pasVar;
        this.a = pasVar.a <= pasVar.b;
        this.d = Settings.System.getInt(contentResolver, "accelerometer_rotation", 0) == 1;
        this.l = new ktw(this, contentResolver);
        this.i = pbbVar.a("OrientMgrImpl");
    }

    private final void m(boolean z) {
        if (z) {
            this.g.setRequestedOrientation(14);
            return;
        }
        this.i.b("Orientation unlocked, using sensor? " + this.e);
        this.g.setRequestedOrientation(true != this.e ? 2 : 4);
    }

    public final pao a() {
        return this.f.a();
    }

    public final pao b() {
        return pao.c(this.h.getDefaultDisplay());
    }

    public final void c(png pngVar) {
        this.f.b(pngVar);
    }

    @Override // defpackage.jhf
    public final void ej() {
        gsn.Y(this.m, ske.R(new qrr(this, 1), this.j));
        this.k.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, this.l);
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.b.e("orientation#disable", new krc(this.f, 4));
        this.k.unregisterContentObserver(this.l);
    }

    public final void f(pnh pnhVar) {
        pnk pnkVar = this.f;
        synchronized (pnkVar.c) {
            List list = pnkVar.b;
            if (list.contains(pnhVar)) {
                return;
            }
            list.add(pnhVar);
        }
    }

    public final void g(Class cls) {
        List list = this.c;
        if (!list.contains(cls)) {
            list.add(cls);
        }
        this.i.b("Lock orientation requests: " + list.size());
        m(true);
    }

    public final void h(png pngVar) {
        this.f.c(pngVar);
    }

    public final void i(pnh pnhVar) {
        pnk pnkVar = this.f;
        synchronized (pnkVar.c) {
            if (!pnkVar.b.remove(pnhVar)) {
                pnkVar.f.g("Removing non-existing raw listener.");
            }
        }
    }

    public final void j(boolean z) {
        this.e = z;
        if (this.c.isEmpty()) {
            m(false);
        }
    }

    public final void k(Class cls) {
        pbc pbcVar = this.i;
        pbcVar.b("Try to unlock Orientation");
        List list = this.c;
        list.remove(cls);
        if (list.isEmpty()) {
            m(false);
            return;
        }
        pbcVar.h("Can't unlock orientation now. Lock is held by " + list.size() + " requests.");
    }

    public final int l() {
        return jsv.j(a(), this.a);
    }
}
