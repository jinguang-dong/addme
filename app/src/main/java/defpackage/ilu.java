package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ilu implements ilo {
    public static final sgv a = sgv.g("ilu");
    public final Bundle b;
    public MediaCodec c;
    public final ilt d;
    public int e;
    public boolean f;
    public rue g;
    public ggg h;
    private final Semaphore i = new Semaphore(1);

    public ilu(MediaCodec mediaCodec, ilt iltVar) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        this.e = 0;
        this.f = false;
        this.c = mediaCodec;
        this.d = iltVar;
        bundle.putInt("request-sync", 0);
    }

    @Override // defpackage.ilo
    public final MediaCodec a() {
        return this.c;
    }

    @Override // defpackage.ilo
    public final void b() {
        if (this.f) {
            this.c.signalEndOfInputStream();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.ilo
    public final void c() {
        if (this.f) {
            this.f = false;
            try {
                this.c.stop();
            } catch (IllegalStateException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 2152)).s("Illegal state when stopping MediaCodec");
            }
            this.c.release();
            this.g.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v6, types: [sgt, shi] */
    @Override // defpackage.ilo
    public final boolean d() {
        ilt iltVar = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", iltVar.b, iltVar.c);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", iltVar.a);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", Math.max(1, 10));
        try {
            this.c.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            ilt iltVar2 = this.d;
            rue rueVar = new rue(iltVar2.e, this.c.createInputSurface());
            this.g = rueVar;
            rueVar.b();
            ggg gggVar = new ggg(iltVar2.f, iltVar2.d);
            this.h = gggVar;
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            gggVar.g(fArr);
            EGL14.eglMakeCurrent((EGLDisplay) this.g.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            try {
                this.c.start();
                this.f = true;
                return true;
            } catch (IllegalStateException e) {
                ((sgt) ((sgt) a.b().i(e)).M((char) 2151)).s("Cannot start encoder");
                return false;
            }
        } catch (Exception e2) {
            ((sgt) ((sgt) a.b().i(e2)).M((char) 2149)).s("Exception when configuring MediaCodec");
            this.c.release();
            try {
                this.c = MediaCodec.createEncoderByType("video/avc");
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return false;
        }
    }

    public final void e() throws InterruptedException {
        try {
            this.i.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to lock frame data", e);
        }
    }

    public final void f() {
        this.i.release();
    }
}
