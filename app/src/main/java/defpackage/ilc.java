package defpackage;

import android.media.MediaCodec;
import android.opengl.EGL14;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.libraries.vision.opengl.Texture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ilc implements ilb {
    public static final sgv a = sgv.g("ilc");
    private ila h = null;
    private Texture i = null;
    public ilx b = null;
    public ilu c = null;
    public iky d = null;
    public iiu g = null;
    public boolean e = false;
    public int f = -1;

    @Override // defpackage.ilb
    public final void a(float[] fArr, long j) throws InterruptedException {
        iky ikyVar;
        if (!this.e && (ikyVar = this.d) != null) {
            ikyVar.b.c = (j / 1000) - (System.nanoTime() / 1000);
            this.e = true;
        }
        ilx ilxVar = this.b;
        if (ilxVar != null && ilxVar.f) {
            ilxVar.g.incrementAndGet();
            ilxVar.b.e();
            ilw ilwVar = ilxVar.e;
            ilwVar.sendMessage(ilwVar.obtainMessage(1, (int) (j >> 32), (int) j, fArr));
        }
    }

    @Override // defpackage.ilb
    public final void b(int i, int i2) {
    }

    @Override // defpackage.ilb
    public final void c(Texture texture, ila ilaVar) {
        this.i = texture;
        this.h = ilaVar;
        f();
    }

    @Override // defpackage.ilb
    public final void d() throws InterruptedException {
        ilx ilxVar = this.b;
        if (ilxVar == null) {
            return;
        }
        ilu iluVar = ilxVar.b;
        iluVar.e();
        iluVar.f();
    }

    @Override // defpackage.ilb
    public final void e(iiu iiuVar) {
        this.g = iiuVar;
    }

    public final void f() {
        try {
            int i = this.f;
            if (i <= 0) {
                float f = this.h.b / 1080.0f;
                i = (int) ((f + (f * f)) * 0.5f * 1.2E7f);
            }
            ila ilaVar = this.h;
            this.c = new ilu(MediaCodec.createEncoderByType("video/avc"), new ilt(ilaVar.a, ilaVar.b, ilaVar.c, EGL14.eglGetCurrentContext(), this.i, i));
        } catch (IOException unused) {
            ((sgt) a.b().M(2117)).s(nWEkBGOQPWQp.FIslRhLCJfs);
            this.c = null;
        }
    }
}
