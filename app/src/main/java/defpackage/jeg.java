package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jeg implements View.OnClickListener {
    public static final sgv a = sgv.g("jeg");
    public final jdz A;
    public jfk B;
    public final hbj I;
    private float K;
    private final jid L;
    private final LocalSessionStorage M;
    public jej b;
    public final jdn c;
    public boolean d;
    public float e;
    public float f;
    public final jfc g;
    public double h;
    public double i;
    public boolean j;
    public int k;
    public FileWriter o;
    public final Context p;
    public final WindowManager q;
    public hvn t;
    public boolean v;
    public final Handler y;
    public final HandlerThread z;
    public final Semaphore l = new Semaphore(0);
    public final Vector m = new Vector(100);
    public int n = 0;
    public boolean r = false;
    public boolean s = false;
    public boolean u = false;
    public jfk w = null;
    public jfk x = null;
    public final List C = new ArrayList();
    public final List D = new ArrayList();
    public final List E = new ArrayList();
    public final jel F = new jel();
    public boolean G = false;
    public final AmbientMode.AmbientController J = new AmbientMode.AmbientController(this);
    private final emy N = new jed();
    private final AmbientMode.AmbientController P = new AmbientMode.AmbientController(this);
    private final emy O = new jee(this);
    public final Handler H = new Handler(Looper.getMainLooper());

    public jeg(Context context, hbj hbjVar, jdn jdnVar, jfc jfcVar, LocalSessionStorage localSessionStorage, jdz jdzVar, jej jejVar, jid jidVar) {
        this.o = null;
        this.v = false;
        this.p = context;
        this.I = hbjVar;
        this.g = jfcVar;
        this.M = localSessionStorage;
        this.A = jdzVar;
        this.L = jidVar;
        this.q = (WindowManager) context.getSystemService("window");
        try {
            this.o = new FileWriter(localSessionStorage.i);
        } catch (IOException unused) {
            ((sgt) a.b().M(2712)).v("Could not create file writer for : %s", this.M.i);
        }
        HandlerThread handlerThread = new HandlerThread("FileHandlerThread");
        this.z = handlerThread;
        handlerThread.start();
        this.y = new Handler(handlerThread.getLooper());
        this.c = jdnVar;
        if (jdnVar == null) {
            return;
        }
        this.b = jejVar;
        jejVar.F = this;
        this.q.getDefaultDisplay();
        jej jejVar2 = this.b;
        jejVar2.E = jfcVar;
        jejVar2.y = new jes();
        this.g.k = new jwq(this, 1);
        jel jelVar = this.F;
        jdw jdwVar = jdx.a;
        jelVar.c = Build.MODEL.startsWith("Nexus 5");
        this.v = hbjVar.p(hai.c);
    }

    public static final float i(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public final float a() {
        float fB = b();
        if (fB > 0.0f) {
            return fB;
        }
        float f = this.K;
        if (f > 75.0f) {
            return 55.0f;
        }
        return f;
    }

    public final float b() {
        if (this.c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        int iIntValue = ((Integer) this.I.a(hai.a).get()).intValue();
        if (iIntValue > 0) {
            return iIntValue / 1000.0f;
        }
        jdw jdwVar = jdx.a;
        return jdx.a(this.K);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
    public final synchronized int c() {
        int i = this.n;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        this.n = i - 1;
        this.C.remove(r0.size() - 1);
        try {
            this.o.close();
            LocalSessionStorage localSessionStorage = this.M;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(localSessionStorage.i));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < this.n; i3++) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(localSessionStorage.i);
            this.o = fileWriter;
            fileWriter.write(sb.toString());
            this.o.flush();
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2714)).s("undo image exception:");
        }
        int i4 = this.n;
        if (i4 == 0) {
            this.u = false;
        } else {
            i2 = i4;
        }
        this.G = true;
        return i2;
    }

    public final void d(ena enaVar) {
        enaVar.o(this.H, this.P, this.N, this.O);
        rwc rwcVarD = this.L.d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Location location = (Location) rwcVarD.f();
        float[] fArr = new float[16];
        jfc jfcVar = this.g;
        nnh nnhVar = jfcVar.b;
        SensorManager.getRotationMatrix(fArr, null, new float[]{nnhVar.a, nnhVar.b, nnhVar.c}, jfcVar.d);
        float[] fArr2 = new float[16];
        SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
        SensorManager.getOrientation(fArr2, new float[3]);
        this.C.add(new jfn(jCurrentTimeMillis, location, (int) ((r4[0] * 180.0f) / 3.141592653589793d)));
        this.G = false;
    }

    public final void e() {
        float[] fArrGetFrameGeometry;
        synchronized (jeb.a) {
            if (!jeb.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            fArrGetFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
        }
        jem jemVar = this.b.b;
        jemVar.f = 6;
        jemVar.a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        jemVar.b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i = jemVar.f;
        jemVar.c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        jemVar.i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3++) {
            jemVar.a.put(i3, fArrGetFrameGeometry[i3]);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            for (int i6 = 0; i6 < 2; i6++) {
                jemVar.b.put(i4, i6);
                jemVar.b.put(i4 + 1, i5);
                i4 += 2;
            }
        }
        int i7 = 0;
        for (char c = 0; c <= 0; c = 1) {
            char c2 = 0;
            int i8 = 0;
            int i9 = 2;
            while (c2 <= 0) {
                short s = (short) i8;
                jemVar.c.put(i7, s);
                int i10 = i9 + 1;
                short s2 = (short) i10;
                jemVar.c.put(i7 + 1, s2);
                jemVar.c.put(i7 + 2, (short) i9);
                jemVar.c.put(i7 + 3, s);
                int i11 = i7 + 5;
                i8++;
                jemVar.c.put(i7 + 4, (short) i8);
                i7 += 6;
                jemVar.c.put(i11, s2);
                c2 = 1;
                i9 = i10;
            }
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < 2) {
            jemVar.i.put(i13, (short) i12);
            i12++;
            i13++;
        }
        while (i2 < 2) {
            jemVar.i.put(i13, (short) (i2 + i2 + 1));
            i2++;
            i13++;
        }
        int i14 = 1;
        while (i14 >= 0) {
            jemVar.i.put(i13, (short) (i14 + 2));
            i14--;
            i13++;
        }
        int i15 = 1;
        while (i15 >= 0) {
            jemVar.i.put(i13, (short) (i15 + i15));
            i15--;
            i13++;
        }
        jemVar.g = i13 - 1;
        jemVar.h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        r3.write(defpackage.jfm.d("%s,%f\n", "location_altitude", java.lang.Double.valueOf(r1.getAltitude())));
        r3.write(defpackage.jfm.d("%s,%f\n", "location_latitude", java.lang.Double.valueOf(r1.getLatitude())));
        r3.write(defpackage.jfm.d("%s,%f\n", "location_longitude", java.lang.Double.valueOf(r1.getLongitude())));
        r3.write(defpackage.jfm.d("%s,%s\n", "location_provider", r1.getProvider()));
        r3.write(defpackage.jfm.d("%s,%d\n", "location_time", java.lang.Long.valueOf(r1.getTime())));
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jeg.f():void");
    }

    public final void g() {
        this.K = this.c.b.b().getHorizontalViewAngle();
    }

    public final void h(int i) {
        String str = this.M.e;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            jeb.b(str, a());
        } else if (i2 == 1) {
            float fA = a();
            synchronized (jeb.a) {
                LightCycleNative.ResetForHorizontalCapture(str, fA);
                jeb.b = true;
            }
        } else if (i2 == 2) {
            float fA2 = a();
            synchronized (jeb.a) {
                LightCycleNative.ResetForVerticalCapture(str, fA2);
                jeb.b = true;
            }
        } else if (i2 == 3) {
            float fA3 = a();
            synchronized (jeb.a) {
                LightCycleNative.ResetForWideCapture(str, fA3);
                jeb.b = true;
            }
        } else if (i2 != 4) {
            jeb.b(str, a());
        } else {
            float fA4 = a();
            synchronized (jeb.a) {
                LightCycleNative.ResetForFisheyeCapture(str, fA4);
                jeb.b = true;
            }
        }
        jej jejVar = this.b;
        jejVar.d.d();
        jejVar.e.a();
        if (i == 6) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            jej jejVar2 = this.b;
            jejVar2.d.b(fArr);
            if (jejVar2.n && jejVar2.G == 1) {
                jejVar2.e.c(jejVar2.x);
            }
            jejVar2.u = true;
        }
        this.u = false;
        this.n = 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
