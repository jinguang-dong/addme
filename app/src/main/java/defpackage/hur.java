package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLSurfaceView;
import android.view.animation.Interpolator;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hur implements GLSurfaceView.Renderer {
    private rfv A;
    private rfv B;
    private final float[] C;
    private Texture D;
    private Texture E;
    private Texture F;
    private rfv G;
    private rfv H;
    public int a;
    public int b;
    public int c;
    public int d;
    public poj e;
    public ByteBuffer f;
    public ByteBuffer g;
    public ByteBuffer h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public long m;
    public boolean n;
    private final owf o;
    private final Context p;
    private final mmp q;
    private final mmp r;
    private final float[] s;
    private final FloatBuffer t;
    private final float[] u;
    private final FloatBuffer v;
    private rft w;
    private rfv x;
    private rfv y;
    private final float z;

    public hur(owf owfVar, Context context) {
        owfVar.getClass();
        this.o = owfVar;
        this.p = context;
        Interpolator interpolator = mmq.a;
        Interpolator interpolator2 = mmq.a;
        this.q = new mmp(interpolator2, 0.0f, 1.0f, 150L);
        this.r = new mmp(interpolator2, 0.2f, 0.5f, 150L);
        this.c = 1;
        this.d = 1;
        float[] fArr = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f};
        this.s = fArr;
        this.t = rkf.g(fArr);
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.u = fArr2;
        this.v = rkf.g(fArr2);
        this.z = context.getResources().getDimension(R.dimen.serengeti_preview_corner_radius);
        this.C = new float[16];
        this.m = Long.MAX_VALUE;
    }

    private final void e() {
        this.D = new Texture(this.c, this.d);
        this.E = new Texture(this.c / 2, this.d / 2);
        this.F = new Texture(this.c / 2, this.d / 2);
    }

    private final boolean f() {
        boolean z;
        synchronized (this) {
            z = false;
            if (c() != null && a() != null) {
                if (b() != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final ByteBuffer a() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.g;
        }
        return byteBuffer;
    }

    public final ByteBuffer b() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.h;
        }
        return byteBuffer;
    }

    public final ByteBuffer c() {
        ByteBuffer byteBuffer;
        synchronized (this) {
            byteBuffer = this.f;
        }
        return byteBuffer;
    }

    public final void d(boolean z) {
        synchronized (this) {
            this.n = z;
            if (!z) {
                this.f = null;
                this.g = null;
                this.h = null;
                poj pojVar = this.e;
                if (pojVar != null) {
                    pojVar.close();
                }
                this.e = null;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        gl10.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226 A[Catch: all -> 0x025b, TryCatch #2 {, blocks: (B:4:0x0006, B:6:0x0017, B:7:0x001a, B:9:0x0029, B:11:0x0037, B:13:0x003b, B:14:0x0040, B:16:0x0044, B:17:0x0049, B:19:0x004d, B:20:0x0058, B:22:0x005c, B:23:0x005f, B:25:0x006e, B:26:0x0071, B:27:0x007b, B:33:0x008e, B:34:0x008f, B:36:0x00a6, B:39:0x00ad, B:64:0x01ed, B:68:0x01f4, B:69:0x01f7, B:71:0x0226, B:72:0x023e, B:54:0x01e0, B:57:0x01e5, B:60:0x01e8, B:61:0x01e9, B:76:0x0259, B:77:0x025a, B:10:0x002f, B:37:0x00a7, B:41:0x00b3, B:43:0x00b7, B:45:0x00bb, B:48:0x00c1, B:50:0x00c9, B:53:0x00d4, B:52:0x00d1, B:28:0x007c, B:30:0x0080, B:32:0x0086), top: B:85:0x0006, inners: #0, #1 }] */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r26) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hur.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) throws Resources.NotFoundException {
        gl10.getClass();
        eGLConfig.getClass();
        InputStream inputStreamOpenRawResource = this.p.getResources().openRawResource(R.raw.serengeti_preview_vert);
        inputStreamOpenRawResource.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, ulo.a), 8192);
        try {
            String strD = ujk.d(bufferedReader);
            ujk.e(bufferedReader, null);
            InputStream inputStreamOpenRawResource2 = this.p.getResources().openRawResource(R.raw.serengeti_preview_frag);
            inputStreamOpenRawResource2.getClass();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource2, ulo.a), 8192);
            try {
                String strD2 = ujk.d(bufferedReader);
                ujk.e(bufferedReader, null);
                rft rftVar = new rft(strD, strD2);
                this.G = rftVar.e("aVertex");
                this.H = rftVar.e("aTexCoord");
                this.x = rftVar.a("uVertexTransform");
                this.y = rftVar.a("uRadius");
                this.A = rftVar.a(SHXc.ZelYI);
                this.B = rftVar.a(mNLbzhCxd.LNUPoORfGGnSkNy);
                this.w = rftVar;
                e();
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
