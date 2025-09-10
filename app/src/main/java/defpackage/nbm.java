package defpackage;

import android.graphics.SurfaceTexture;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbm implements nbr {
    @Override // defpackage.nbr
    public final GestureDetector.OnGestureListener a() {
        return new GestureDetector.SimpleOnGestureListener();
    }

    @Override // defpackage.nbr
    public final View.OnTouchListener b() {
        return null;
    }

    @Override // defpackage.nbr
    public final boolean d() {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // defpackage.nbr
    public final void c() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
