package defpackage;

import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nge implements SurfaceHolder.Callback2 {
    private final hdm a;

    public nge(hdm hdmVar) {
        this.a = hdmVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        surfaceHolder.getSurface();
        this.a.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        surfaceHolder.getSurface();
        this.a.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
