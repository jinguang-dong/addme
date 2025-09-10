package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.zoomlock.ZoomLockView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nks {
    public final ZoomLockView a;
    public final ImageView b;
    public final ImageView c;
    public final float d;
    public final boolean e;
    public MotionEvent f;
    public float g;
    public float h;
    public boolean i;
    public boolean j = true;
    private final Resources k;

    public nks(ZoomLockView zoomLockView, hbj hbjVar) {
        this.a = zoomLockView;
        this.b = zoomLockView.c;
        this.c = zoomLockView.b;
        this.k = zoomLockView.getResources();
        this.e = hbjVar.p(gzo.bw);
        this.d = (r2.getDimensionPixelSize(R.dimen.zoom_lock_translation) - (r2.getDimensionPixelSize(R.dimen.zoom_lock_icon_size) / 2)) + r2.getDimensionPixelSize(R.dimen.zoom_dot_trans_adjust);
    }

    public static final float d(float f, float f2, float f3) {
        return Math.max(Math.min(f2, f3), Math.min(Math.max(f2, f3), f));
    }

    public final Drawable a() {
        boolean z = this.e;
        Resources resources = this.k;
        return z ? resources.getDrawable(R.drawable.gs_lock_fill1_vd_theme_24, null) : resources.getDrawable(R.drawable.ic_lock_24dp, null);
    }

    public final void b() {
        this.f = null;
        ZoomLockView zoomLockView = this.a;
        if (zoomLockView.e.isRunning()) {
            zoomLockView.e.cancel();
        }
        if (zoomLockView.getVisibility() != 8) {
            zoomLockView.f.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nks.c(boolean):void");
    }
}
