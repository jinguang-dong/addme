package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipt implements SurfaceHolder.Callback {
    public npq a;
    public boolean b;
    private final owf c;
    private final owf d;
    private szh e;
    private paq f;
    private boolean g;

    public ipt(owf owfVar, qpt qptVar, owf owfVar2) {
        owfVar.getClass();
        qptVar.getClass();
        owfVar2.getClass();
        this.c = owfVar;
        this.d = owfVar2;
        this.e = new szh();
    }

    public final SurfaceView a(Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.getHolder().addCallback(this);
        if (this.e.isDone()) {
            Object objS = this.e.s();
            objS.getClass();
            if (((rwc) objS).h()) {
                c();
            }
            this.e.cancel(false);
            this.e = new szh();
        }
        return surfaceView;
    }

    public final syu b() {
        return (((Boolean) this.c.dL()).booleanValue() && !this.b && this.d.dL() == iqh.SATURN) ? this.e : ske.M(rvk.a);
    }

    public final void c() {
        paq paqVar = this.f;
        if (paqVar != null) {
            paqVar.close();
        }
        this.f = null;
        this.e.cancel(false);
        this.e = new szh();
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        surfaceHolder.getClass();
        if (this.g) {
            return;
        }
        this.g = true;
        if (i <= 0 || i2 <= 0 || i3 <= 0) {
            return;
        }
        surfaceHolder.setFixedSize(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        ngn ngnVarAS = qpt.aS(surface, i, new Size(i2, i3), true, new gqw(19));
        this.e.e(rwc.i(ngnVarAS));
        npq npqVar = this.a;
        this.f = npqVar != null ? npqVar.l(ngnVarAS) : null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getClass();
        this.g = false;
    }
}
