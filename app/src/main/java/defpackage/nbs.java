package defpackage;

import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.SurfaceHolder;
import android.view.View;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbs implements nbr {
    final /* synthetic */ jxa a;

    public nbs() {
        throw null;
    }

    @Override // defpackage.nbr
    public final GestureDetector.OnGestureListener a() {
        return null;
    }

    @Override // defpackage.nbr
    public final View.OnTouchListener b() {
        return this.a.K;
    }

    @Override // defpackage.nbr
    public final void c() {
        this.a.L();
    }

    @Override // defpackage.nbr
    public final boolean d() {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws PackageManager.NameNotFoundException, IOException {
        nbo nboVar;
        jxa jxaVar = this.a;
        if (jxaVar.G != null) {
            ((sgt) jxa.a.c().M(3099)).s("onCameraAvailable queued before onSurfaceTextureAvailable");
            return;
        }
        jxaVar.w = i;
        jxaVar.x = i2;
        jxaVar.d();
        iyu iyuVar = jxaVar.S;
        iyuVar.K.b();
        fqy fqyVar = iyuVar.K;
        SurfaceTexture surfaceTexture2 = fqyVar.s;
        if (surfaceTexture2 == null || (nboVar = fqyVar.q) == null) {
            ((sgt) fqy.a.c().M(352)).s("Could not set SurfaceTexture default buffer dimensions, not yet setup");
        } else {
            surfaceTexture2.setDefaultBufferSize(nboVar.b(), fqyVar.q.a());
        }
        jxaVar.e.a(juk.b);
        jxaVar.G = new hvn(surfaceTexture, jxaVar.F, jxaVar);
        if (jxaVar.g != null) {
            jxaVar.K();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.J();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        jxa jxaVar = this.a;
        jxaVar.w = i;
        jxaVar.x = i2;
        Handler handler = jxaVar.F;
        if (handler != null) {
            handler.obtainMessage(2, i, i2).sendToTarget();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        throw new IllegalStateException("Module does NOT support Surface-backed Preview.");
    }

    public nbs(jxa jxaVar) {
        this.a = jxaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
