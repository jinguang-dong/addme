package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jej implements GLSurfaceView.Renderer {
    public jfc E;
    public jeg F;
    public jdt H;
    public jdt I;
    private final jep J;
    private int Z;
    public jdr a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private jew aj;
    private jew ak;
    private final Context ar;
    private final ktx av;
    public jeo c;
    public final jer d;
    public final PhotoSphereMessageOverlay e;
    public jdq f;
    public jdq g;
    public jeq h;
    public jff i;
    public jdu j;
    public jfd k;
    public int o;
    public int p;
    public final jem b = new jem();
    private final float[] K = new float[16];
    private final float[] L = new float[16];
    private final float[] M = new float[16];
    private final float[] N = new float[16];
    private final float[] O = new float[16];
    private final float[] P = new float[16];
    private final float[] Q = new float[16];
    private final float[] R = new float[16];
    private float[] S = new float[16];
    private float T = 60.0f;
    private float U = 100.0f;
    private float V = 100.0f;
    private int W = 120;
    private int X = 80;
    public boolean l = false;
    public boolean m = false;
    private boolean Y = false;
    public boolean n = true;
    private boolean ae = false;
    private int af = 0;
    private boolean ag = false;
    public boolean q = false;
    private final ArrayList ah = new ArrayList();
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int G = 1;
    public boolean u = false;
    private boolean ai = false;
    public boolean v = false;
    public boolean w = false;
    public int x = R.string.hit_target_to_start;
    private final jdy aw = new jdy();
    private boolean al = false;
    private long am = 0;
    private boolean an = false;
    public jes y = null;
    public boolean z = false;
    public int A = 0;
    public int B = 0;
    public byte[] C = null;
    public boolean D = false;
    private double ao = 0.0d;
    private double ap = 0.0d;
    private final Vector aq = new Vector();
    private int as = 0;
    private float at = -1.0f;
    private final HashMap au = new HashMap();

    public jej(Context context, jep jepVar, PhotoSphereMessageOverlay photoSphereMessageOverlay, ktx ktxVar) {
        this.ar = context;
        this.J = jepVar;
        this.e = photoSphereMessageOverlay;
        this.av = ktxVar;
        this.d = new jer(context);
    }

    private final float g(float f) {
        int i = this.ab;
        if (i >= this.ac) {
            return f;
        }
        double dTan = Math.tan(Math.toRadians(f) / 2.0d);
        double d = i / (dTan + dTan);
        double dAtan = Math.atan(this.ac / (d + d));
        return (float) Math.toDegrees(dAtan + dAtan);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0203 A[Catch: all -> 0x021a, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:10:0x0019, B:27:0x004c, B:29:0x0053, B:32:0x006a, B:34:0x006e, B:35:0x0102, B:40:0x0110, B:42:0x011e, B:44:0x0122, B:45:0x014c, B:52:0x0176, B:53:0x0177, B:55:0x017b, B:57:0x0183, B:58:0x0195, B:59:0x01a7, B:61:0x01ad, B:63:0x01b9, B:67:0x01c3, B:69:0x01c9, B:71:0x01d6, B:81:0x01ff, B:83:0x0203, B:72:0x01e9, B:74:0x01ee, B:77:0x01f6, B:80:0x01fc, B:84:0x0208, B:16:0x0025, B:17:0x0027, B:22:0x0035, B:26:0x0044, B:92:0x0217, B:36:0x0103, B:38:0x010b, B:39:0x010f, B:47:0x016b, B:48:0x0172, B:18:0x0028, B:20:0x0030, B:21:0x0034, B:87:0x020c, B:88:0x0213), top: B:101:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void h(boolean r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jej.h(boolean):void");
    }

    private final void i() {
        this.c.b();
        this.c.b();
    }

    private static final int j(int i, int i2) {
        return (i * 31) + i2;
    }

    private static final jew k(int i) {
        if (i == 2) {
            return new jey(true);
        }
        if (i == 3) {
            return new jey(false);
        }
        if (i == 1) {
            return new jex();
        }
        if (i == 5) {
            return new jev();
        }
        if (i == 4) {
            return new jez();
        }
        return null;
    }

    private static final float l(float f, float f2) {
        return (float) (Math.atan(f2 * Math.tan(((f * 0.5d) / 180.0d) * 3.141592653589793d)) * 114.59155902616465d);
    }

    public final void a(float f) {
        e(f);
        this.T = this.U;
        this.l = false;
    }

    public final void b() {
        a(this.U / this.T);
    }

    public final void c() {
        this.q = false;
    }

    public final synchronized void d() {
        Vector vector;
        int iB = this.c.b();
        Vector vector2 = this.c.j;
        synchronized (vector2) {
            if (!vector2.isEmpty()) {
                vector2.removeElementAt(vector2.size() - 1);
            }
        }
        while (true) {
            vector = this.aq;
            if (vector.size() <= iB) {
                break;
            } else {
                vector.removeElementAt(vector.size() - 1);
            }
        }
        if (vector.size() == iB) {
            double dDoubleValue = this.ao - ((Double) vector.lastElement()).doubleValue();
            this.ao = dDoubleValue;
            this.ap = dDoubleValue / 45.0d;
            vector.removeElementAt(vector.size() - 1);
        }
        i();
        jei jeiVar = new jei(this);
        jeiVar.start();
        try {
            jeiVar.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public final void e(float f) {
        float f2 = this.T / f;
        this.U = f2;
        float fMin = Math.min(f2, this.W);
        this.U = fMin;
        float fMax = Math.max(fMin, this.X);
        this.U = fMax;
        this.V = g(fMax);
    }

    public final void f(int i) {
        int i2 = this.G;
        this.G = i;
        this.w = false;
        this.x = R.string.hit_target_to_start;
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 1) {
            this.x = R.string.tap_to_start;
            this.e.a();
            this.d.e(1);
            this.ai = true;
            this.aw.b();
        } else if (i3 == 2) {
            this.x = R.string.tap_to_start;
            this.e.a();
            this.d.e(2);
            this.ai = true;
            this.aw.b();
        } else if (i3 == 3) {
            this.x = R.string.tap_to_start;
            this.e.a();
            this.d.e(3);
            this.ai = true;
            this.aw.b();
        } else if (i3 == 4) {
            this.e.a();
            this.d.e(4);
            this.ai = true;
            this.aw.b();
        } else if (i3 != 5) {
            this.d.e(0);
        } else {
            this.e.d(false, this.F.n);
            this.w = true;
        }
        this.aj = k(i2);
        this.ak = k(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0717 A[Catch: jds -> 0x0848, TryCatch #0 {jds -> 0x0848, blocks: (B:99:0x032b, B:101:0x03b4, B:105:0x03bc, B:106:0x03c9, B:108:0x03d8, B:110:0x03e5, B:111:0x0411, B:116:0x0423, B:203:0x06e8, B:205:0x06f3, B:208:0x06f8, B:210:0x0717, B:212:0x0735, B:213:0x073b, B:214:0x074a, B:216:0x0763, B:218:0x0767, B:220:0x076d, B:221:0x0771, B:223:0x0775, B:225:0x077b, B:226:0x0785, B:228:0x0789, B:230:0x079d, B:233:0x07bf, B:242:0x07d0, B:245:0x07d6, B:255:0x0818, B:260:0x0822, B:261:0x0830, B:202:0x06e5, B:267:0x0847, B:109:0x03e3, B:103:0x03b8, B:112:0x0412, B:114:0x041a, B:115:0x0422, B:263:0x083d, B:264:0x0844, B:248:0x07eb, B:253:0x0806), top: B:276:0x032b, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x073b A[Catch: jds -> 0x0848, TryCatch #0 {jds -> 0x0848, blocks: (B:99:0x032b, B:101:0x03b4, B:105:0x03bc, B:106:0x03c9, B:108:0x03d8, B:110:0x03e5, B:111:0x0411, B:116:0x0423, B:203:0x06e8, B:205:0x06f3, B:208:0x06f8, B:210:0x0717, B:212:0x0735, B:213:0x073b, B:214:0x074a, B:216:0x0763, B:218:0x0767, B:220:0x076d, B:221:0x0771, B:223:0x0775, B:225:0x077b, B:226:0x0785, B:228:0x0789, B:230:0x079d, B:233:0x07bf, B:242:0x07d0, B:245:0x07d6, B:255:0x0818, B:260:0x0822, B:261:0x0830, B:202:0x06e5, B:267:0x0847, B:109:0x03e3, B:103:0x03b8, B:112:0x0412, B:114:0x041a, B:115:0x0422, B:263:0x083d, B:264:0x0844, B:248:0x07eb, B:253:0x0806), top: B:276:0x032b, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0763 A[Catch: jds -> 0x0848, TryCatch #0 {jds -> 0x0848, blocks: (B:99:0x032b, B:101:0x03b4, B:105:0x03bc, B:106:0x03c9, B:108:0x03d8, B:110:0x03e5, B:111:0x0411, B:116:0x0423, B:203:0x06e8, B:205:0x06f3, B:208:0x06f8, B:210:0x0717, B:212:0x0735, B:213:0x073b, B:214:0x074a, B:216:0x0763, B:218:0x0767, B:220:0x076d, B:221:0x0771, B:223:0x0775, B:225:0x077b, B:226:0x0785, B:228:0x0789, B:230:0x079d, B:233:0x07bf, B:242:0x07d0, B:245:0x07d6, B:255:0x0818, B:260:0x0822, B:261:0x0830, B:202:0x06e5, B:267:0x0847, B:109:0x03e3, B:103:0x03b8, B:112:0x0412, B:114:0x041a, B:115:0x0422, B:263:0x083d, B:264:0x0844, B:248:0x07eb, B:253:0x0806), top: B:276:0x032b, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0806 A[Catch: jds -> 0x07fd, TRY_LEAVE, TryCatch #5 {jds -> 0x07fd, blocks: (B:248:0x07eb, B:253:0x0806), top: B:283:0x07eb, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0830 A[Catch: jds -> 0x0848, TRY_LEAVE, TryCatch #0 {jds -> 0x0848, blocks: (B:99:0x032b, B:101:0x03b4, B:105:0x03bc, B:106:0x03c9, B:108:0x03d8, B:110:0x03e5, B:111:0x0411, B:116:0x0423, B:203:0x06e8, B:205:0x06f3, B:208:0x06f8, B:210:0x0717, B:212:0x0735, B:213:0x073b, B:214:0x074a, B:216:0x0763, B:218:0x0767, B:220:0x076d, B:221:0x0771, B:223:0x0775, B:225:0x077b, B:226:0x0785, B:228:0x0789, B:230:0x079d, B:233:0x07bf, B:242:0x07d0, B:245:0x07d6, B:255:0x0818, B:260:0x0822, B:261:0x0830, B:202:0x06e5, B:267:0x0847, B:109:0x03e3, B:103:0x03b8, B:112:0x0412, B:114:0x041a, B:115:0x0422, B:263:0x083d, B:264:0x0844, B:248:0x07eb, B:253:0x0806), top: B:276:0x032b, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jej.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i == this.ab && i2 == this.ac) {
            return;
        }
        this.ab = i;
        this.ac = i2;
        this.Z = i;
        this.aa = i2;
        this.Y = false;
        this.z = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            float fA = this.at;
            if (fA < 0.0f) {
                fA = this.F.a();
                this.at = fA;
            }
            this.U = l(fA, 1.7f);
            this.W = (int) l(this.at, 2.5f);
            this.X = (int) l(this.at, 1.1f);
            float f = this.U;
            this.T = f;
            this.V = g(f);
            this.H = new jdt((byte[]) null);
            this.j = new jdu();
            this.I = new jdt((char[]) null);
            this.i = new jff();
            this.j.j(jdm.a);
            jem jemVar = this.b;
            this.c = new jeo(jemVar);
            new BitmapFactory.Options().inScaled = false;
            this.a = new jek();
            jemVar.e = this.i;
            jemVar.j = this.j;
            if (this.D) {
                jemVar.m = true;
                jemVar.l = true;
            }
            float[] fArr = this.Q;
            Matrix.setIdentityM(fArr, 0);
            fArr[0] = 0.0f;
            fArr[1] = -1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            Matrix.setIdentityM(this.S, 0);
            float[] fArr2 = jdm.b;
            GLES20.glClearColor(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
            this.m = true;
            if (this.w) {
                this.e.d(true, 0);
            }
            Matrix.setIdentityM(this.R, 0);
        } catch (jds e) {
            e.printStackTrace();
        }
        this.z = false;
    }
}
