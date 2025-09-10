package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iki implements GLSurfaceView.Renderer, paq {
    public static final sgv a = sgv.g(ibINv.QGmUI);
    public final int b;
    public Texture d;
    public SurfaceTexture e;
    public ikn f;
    public final AtomicBoolean h;
    public final ijr i;
    public final ijz j;
    public final ijv k;
    private final Context l;
    private float o;
    private float p;
    private long q;
    private final ArrayList r;
    private final our s;
    private final iip t;
    private final ikp u;
    private final ila v;
    private final ijj w;
    private final int x;
    private final iiu z;
    public final int c = ikq.a;
    private final float[] m = new float[16];
    private final float[] n = new float[16];
    private final SurfaceTexture.OnFrameAvailableListener y = new twj(this, 1);
    public final szh g = new szh();

    public iki(iip iipVar, iiu iiuVar, ikp ikpVar, ijj ijjVar, ijr ijrVar, ijz ijzVar, ijv ijvVar, ikh ikhVar, ikb ikbVar, ijx ijxVar, ijt ijtVar, Context context) {
        this.q = 0L;
        this.t = iipVar;
        this.z = iiuVar;
        this.v = ikpVar.d;
        this.u = ikpVar;
        this.w = ijjVar;
        this.i = ijrVar;
        this.j = ijzVar;
        this.k = ijvVar;
        this.l = context;
        this.x = ikpVar.b.g();
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        this.s = new our();
        this.h = new AtomicBoolean(false);
        this.q = SystemClock.elapsedRealtime();
        this.b = (int) ((ikq.a * ikpVar.a()) / 360.0d);
        ijrVar.h = ijjVar.k();
        arrayList.add(ijzVar);
        arrayList.add(ijvVar);
        arrayList.add(ikhVar);
        arrayList.add(ikbVar);
        arrayList.add(ijxVar);
        arrayList.add(ijtVar);
    }

    private final float a(float f) {
        return (this.i.d / this.o) * f;
    }

    private final float b(float f) {
        return (this.i.e / this.p) * f;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ijq) arrayList.get(i)).a();
        }
        EGL14.eglReleaseThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float f;
        float f2;
        if (this.s.b()) {
            return;
        }
        GLES20.glDisable(3042);
        if (this.h.getAndSet(false)) {
            SurfaceTexture surfaceTexture = this.e;
            rnt.x(surfaceTexture);
            iip iipVar = this.t;
            iipVar.d();
            surfaceTexture.updateTexImage();
            float[] fArr = this.m;
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = surfaceTexture.getTimestamp();
            this.f.a.f(this.n);
            this.f.a.e(fArr);
            iipVar.a(fArr, timestamp);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.q;
        this.q = jElapsedRealtime;
        ijj ijjVar = this.w;
        float fAbs = Math.abs(ijjVar.g());
        ijr ijrVar = this.i;
        float fMin = ijrVar.g + Math.min(j * (((Math.min(fAbs, 0.15f) / 0.15f) * 2.4300002E-4f) + 7.0E-6f), fAbs - ijrVar.g);
        ijrVar.g = fMin;
        if (fMin > 1.0f) {
            ijrVar.g = 1.0f;
        }
        ijrVar.m = !ijjVar.e.get() || ijjVar.a.d.getCaptureProgress() >= 0.0f;
        Matrix.setRotateEulerM(ijrVar.f, 0, 0.0f, 0.0f, (float) (-ijjVar.p));
        if (ijrVar.h) {
            float f3 = ijrVar.g;
            float f4 = ijrVar.q;
            int i = this.b;
            float fMax = this.c * Math.max(f3 + f4, f4 + f4);
            float f5 = i;
            f = (f5 + f5) / fMax;
        } else {
            float f6 = ijrVar.g;
            float f7 = ijrVar.p;
            float fMax2 = Math.max(f6 + f7, f7 + f7);
            float f8 = ijrVar.a;
            f = ((f8 + f8) * this.b) / (this.c * fMax2);
        }
        ijrVar.getClass();
        boolean z = ijrVar.h;
        float f9 = 0.9f * f;
        if (z) {
            ijrVar.d = f9;
            f2 = (f / this.o) * this.p;
            ijrVar.e = f2;
        } else {
            ijrVar.e = f9;
            float f10 = (f / this.p) * this.o;
            ijrVar.d = f10;
            f9 = f10;
            f2 = f9;
        }
        float f11 = (float) ijjVar.f;
        if (z) {
            ijrVar.b = (f11 / this.o) * f9;
            boolean z2 = ijrVar.m;
            float fMin2 = Math.min(1.0f - (f2 * 0.5f), b(ijrVar.g * (this.p + 360.0f)) * 0.5f) - b((float) ijjVar.g);
            if (!z2) {
                fMin2 = -fMin2;
            }
            ijrVar.c = fMin2;
        } else {
            boolean z3 = ijrVar.m;
            float fMin3 = Math.min(ijrVar.a - (f9 * 0.5f), a(ijrVar.g * (this.o + 360.0f)) * 0.5f) - a((float) ijjVar.g);
            if (!z3) {
                fMin3 = -fMin3;
            }
            ijrVar.b = fMin3;
            ijrVar.c = ((-f11) / this.p) * ijrVar.e;
        }
        ijrVar.n = ijrVar.o != null && ijjVar.j();
        this.f.b();
        GLES20.glViewport(0, 0, ijrVar.j, ijrVar.k);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ijq) arrayList.get(i2)).b();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        ijr ijrVar = this.i;
        ijrVar.j = i;
        ijrVar.k = i2;
        ijrVar.a = i / i2;
        int rotation = ((Activity) this.l).getWindowManager().getDefaultDisplay().getRotation() * 90;
        Matrix.setRotateEulerM(this.n, 0, 0.0f, 0.0f, -rotation);
        int i3 = (this.x - rotation) + 360;
        ijj ijjVar = this.w;
        ijjVar.n = i3 % 360;
        ijjVar.o = rotation;
        boolean zK = ijjVar.k();
        ijrVar.h = zK;
        if (zK) {
            ikp ikpVar = this.u;
            float fA = (float) ikpVar.a();
            ila ilaVar = this.v;
            this.p = (fA * ilaVar.b) / ilaVar.a;
            this.o = (float) ikpVar.a();
        } else {
            ikp ikpVar2 = this.u;
            float fA2 = (float) ikpVar2.a();
            ila ilaVar2 = this.v;
            this.o = (fA2 * ilaVar2.b) / ilaVar2.a;
            this.p = (float) ikpVar2.a();
        }
        ijrVar.l = ijrVar.h ? ijrVar.k / ijrVar.j : 1.0f;
        ijrVar.p = this.o / 360.0f;
        ijrVar.q = this.p / 360.0f;
        this.t.b(i, i2);
        this.f.c(i, i2);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((ijq) arrayList.get(i4)).c(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ila ilaVar = this.v;
        this.d = new Texture(ilaVar.a, ilaVar.b, 36197);
        this.f = new ikn(this.d, this.i);
        SurfaceTexture surfaceTexture = this.e;
        byte[] bArr = null;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.e = null;
        }
        Texture texture = this.d;
        rnt.x(texture);
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(texture.getName());
        surfaceTexture2.setDefaultBufferSize(ilaVar.a, ilaVar.b);
        surfaceTexture2.setOnFrameAvailableListener(this.y);
        this.e = surfaceTexture2;
        this.g.e(surfaceTexture2);
        this.s.d(new hty(this, surfaceTexture2, 5, bArr));
        iip iipVar = this.t;
        iipVar.e(this.z);
        Texture texture2 = this.d;
        rnt.x(texture2);
        iipVar.c(texture2, ilaVar);
    }
}
