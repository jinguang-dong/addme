package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.ar.core.R;
import j$.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jxa extends fqf {
    private static boolean Z;
    public static final sgv a = sgv.g("jxa");
    public final owq B;
    public final Set C;
    public final int D;
    public Handler F;
    public hvn G;
    public dv H;
    public dv I;
    public int N;
    public final llj P;
    public final mbj Q;
    public jfh R;
    public final iyu S;
    public final nca T;
    public final lrp U;
    public final hqw V;
    public final hqc W;
    public final mdy X;
    public final ocq Y;
    private final hbj aA;
    private final mwq aB;
    private scf aC;
    private final AmbientDelegate aD;
    private final gsn aE;
    private final jfc aa;
    private final ndj ab;
    private final out ac;
    private final jid ad;
    private View ae;
    private DisplayManager.DisplayListener af;
    private jep ag;
    private PhotoSphereMessageOverlay ah;
    private final owf ai;
    private final owf aj;
    private our ak;
    private HandlerThread al;
    private final pau an;
    private final jfk ao;
    private final jfk ap;
    private final jfk aq;
    private final lvl ar;
    private final itl as;
    private final itk at;
    private final Runnable au;
    private final Runnable av;
    private final fpy aw;
    private final mgp ax;
    private final mfs ay;
    private final ktx az;
    public final llm b;
    public final fvu c;
    public final ndo d;
    public final owq e;
    public jdz f;
    public jdn g;
    public boolean h;
    public boolean i;
    public boolean j;
    public LocalSessionStorage k;
    public final WindowManager l;
    public final Context m;
    public final Context n;
    public MainActivityLayout o;
    public jej r;
    public jeg s;
    public Thread v;
    public int w;
    public int x;
    public int y;
    public final msd z;
    public int O = 1;
    public boolean p = false;
    public int q = 0;
    public final Handler A = new jwy(this);
    public boolean E = false;
    public final DialogInterface.OnClickListener J = new fdf(this, 10, null);
    public final View.OnTouchListener K = new fuo(this, 4);
    private final nbr am = new nbs(this);
    public int L = 0;
    public long M = 0;

    public jxa(lrp lrpVar, fpy fpyVar, iyu iyuVar, nca ncaVar, mbj mbjVar, hbj hbjVar, llj lljVar, llm llmVar, mft mftVar, our ourVar, out outVar, owf owfVar, owf owfVar2, itl itlVar, msd msdVar, ocq ocqVar, fvu fvuVar, ndj ndjVar, mdy mdyVar, hqw hqwVar, hqc hqcVar, obu obuVar, lsr lsrVar, ktx ktxVar, owq owqVar, Set set, mgp mgpVar, qqq qqqVar, owq owqVar2, pbn pbnVar, Context context, Context context2, jid jidVar, luk lukVar, mwq mwqVar, mfs mfsVar) {
        jww jwwVar = new jww(this, 0);
        this.an = jwwVar;
        this.ao = new jwq(this, 4);
        this.ap = new jwq(this, 5);
        this.aq = new jwq(this, 6);
        this.N = 2;
        jwx jwxVar = new jwx();
        this.ar = jwxVar;
        this.at = new ijd(this, 2);
        this.au = new juc(this, 7, null);
        this.av = new juc(this, 8, null);
        this.ac = outVar;
        this.ax = mgpVar;
        this.ay = mfsVar;
        fpyVar.getClass();
        iyuVar.getClass();
        this.S = iyuVar;
        this.aw = fpyVar;
        this.T = ncaVar;
        mbjVar.getClass();
        this.Q = mbjVar;
        hbjVar.getClass();
        this.aA = hbjVar;
        lljVar.getClass();
        this.P = lljVar;
        this.b = llmVar;
        itlVar.getClass();
        this.as = itlVar;
        msdVar.getClass();
        this.z = msdVar;
        this.Y = ocqVar;
        this.aj = owfVar2;
        this.ai = owfVar;
        fvuVar.getClass();
        this.c = fvuVar;
        ndjVar.getClass();
        this.ab = ndjVar;
        this.X = mdyVar;
        this.V = hqwVar;
        this.W = hqcVar;
        this.az = ktxVar;
        this.B = owqVar;
        this.C = set;
        this.U = lrpVar;
        this.e = owqVar2;
        this.m = context;
        this.n = context2;
        this.ad = jidVar;
        this.aB = mwqVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.l = windowManager;
        this.D = R.style.Theme_Camera_MaterialAlertDialog;
        this.aD = new AmbientDelegate(pbnVar, set);
        this.aa = new jfc(fpyVar);
        jwxVar.d(lukVar);
        ourVar.d(owfVar.dK(jwwVar, outVar));
        this.aE = new jwp(this);
        this.d = new jwr(this, msdVar);
        try {
            jea.a = new jfh(lrpVar, mftVar, obuVar, lsrVar, jidVar, qqqVar);
            this.R = jea.a;
            I(false);
            fpyVar.j();
            this.y = qpt.cf(windowManager);
            this.aC = new scf();
            this.y = qpt.cf(windowManager);
            this.af = new nfj(this, 1);
            if (hbjVar.p(gzo.bn)) {
                ourVar.d(owfVar2.dK(new juf(this, 2), sxo.a));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot instantiate PanoramaModule.", e);
        }
    }

    private final void M() {
        O(true);
    }

    private final void N() {
        jeg jegVar = this.s;
        if (jegVar != null) {
            jegVar.f();
        }
        this.aa.d();
        szh szhVar = new szh();
        Handler handler = this.F;
        if (handler != null) {
            handler.post(new jwu(this, szhVar));
        }
        try {
            szhVar.t(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((sgt) a.b().M(3110)).s("Fail to wait freeGLMemory to finish");
        }
    }

    private final void O(boolean z) {
        this.q = 0;
        if (z) {
            this.av.run();
        } else {
            this.au.run();
        }
        this.A.postDelayed(new juc(this, 4, null), 1400L);
        this.j = false;
        owf owfVar = this.ai;
        if (owfVar != null) {
            G((String) ((ovx) owfVar).d);
        }
    }

    private final void P() {
        this.p = false;
        this.b.c();
        jeg jegVar = this.s;
        if (jegVar != null) {
            jegVar.f();
        }
        this.q = 0;
        this.i = false;
        O(false);
        this.T.h();
        if (this.S.K != null) {
            b();
        }
    }

    @Override // defpackage.fqf
    public final boolean B() {
        return false;
    }

    @Override // defpackage.fqf
    public final void E() {
        int iCf = qpt.cf(this.l);
        this.y = iCf;
        this.ah.b(iCf);
        b();
    }

    public final void G(String str) {
        if (!this.t || this.j) {
            return;
        }
        Context context = this.m;
        if (str.equals(context.getString(R.string.pano_orientation_horizontal))) {
            if (this.O != 2) {
                this.O = 2;
                jeg jegVar = this.s;
                if (jegVar != null) {
                    jegVar.h(2);
                }
                jej jejVar = this.r;
                if (jejVar != null) {
                    jejVar.f(this.O);
                }
            }
        } else if (str.equals(context.getString(R.string.pano_orientation_vertical))) {
            if (this.O != 3) {
                this.O = 3;
                jeg jegVar2 = this.s;
                if (jegVar2 != null) {
                    jegVar2.h(3);
                }
                jej jejVar2 = this.r;
                if (jejVar2 != null) {
                    jejVar2.f(this.O);
                }
            }
        } else if (str.equals(context.getString(R.string.pano_orientation_wide))) {
            if (this.O != 4) {
                this.O = 4;
                jeg jegVar3 = this.s;
                if (jegVar3 != null) {
                    jegVar3.h(4);
                }
                jej jejVar3 = this.r;
                if (jejVar3 != null) {
                    jejVar3.f(this.O);
                }
            }
        } else if (str.equals(context.getString(R.string.pano_orientation_fisheye))) {
            if (this.O != 5) {
                this.O = 5;
                jeg jegVar4 = this.s;
                if (jegVar4 != null) {
                    jegVar4.h(5);
                }
                jej jejVar4 = this.r;
                if (jejVar4 != null) {
                    jejVar4.f(this.O);
                }
            }
        } else if (str.equals(context.getString(R.string.pano_orientation_photosphere)) && this.O != 1) {
            this.O = 1;
            jeg jegVar5 = this.s;
            if (jegVar5 != null) {
                jegVar5.h(1);
            }
            jej jejVar5 = this.r;
            if (jejVar5 != null) {
                jejVar5.f(this.O);
            }
        }
        LocalSessionStorage localSessionStorage = this.k;
        if (localSessionStorage != null) {
            localSessionStorage.j = this.O;
        }
    }

    public final synchronized void H() {
        if (this.t) {
            P();
            K();
        }
    }

    public final void I(boolean z) {
        this.S.K.m(z);
        this.h = z;
    }

    public final void J() {
        P();
        fpy fpyVar = this.aw;
        int iF = fpyVar.f();
        if (iF != -1) {
            fpyVar.i(iF);
        }
        jeg jegVar = this.s;
        if (jegVar != null) {
            jegVar.z.quitSafely();
            this.s = null;
        }
        hvn hvnVar = this.G;
        if (hvnVar != null) {
            hvnVar.i.post(new hvm(hvnVar, 0));
            this.G = null;
        }
        LocalSessionStorage localSessionStorage = this.k;
        if (localSessionStorage == null || localSessionStorage.e == null) {
            return;
        }
        Set set = this.C;
        synchronized (set) {
            set.remove(this.k.e);
        }
    }

    public final void L() {
        Handler handler = this.F;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public final void b() {
        iyu iyuVar = this.S;
        int i = this.q;
        iyuVar.K.b();
        if (i != 0) {
            this.az.g(jxa.class);
        } else {
            this.az.k(jxa.class);
        }
    }

    public final void c() {
        I(false);
        N();
        if (this.f.isInterrupted() || !this.f.isAlive()) {
            this.A.sendEmptyMessage(105);
        } else {
            this.f.a(new jwq(this, 2));
        }
        M();
        b();
        Set set = this.C;
        synchronized (set) {
            set.remove(this.k.e);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    public final synchronized void d() {
        if (this.al == null) {
            HandlerThread handlerThread = new HandlerThread("PhotoSphereGLThread");
            this.al = handlerThread;
            handlerThread.start();
            this.F = new jwz(this, this.al.getLooper());
        }
    }

    public final void e() {
        jej jejVar = this.r;
        if (jejVar != null && jejVar.q) {
            ((sgt) a.c().M(3105)).s("Not finishing capture since photo taking is in progress.");
            return;
        }
        this.Q.c(R.raw.staged_shot_complete);
        b();
        I(false);
        Object obj = jeb.a;
        LightCycleNative.SetOutputResolutionLarge();
        scf scfVar = this.aC;
        View view = this.ae;
        Object obj2 = scfVar.a;
        if (obj2 != null && ((ObjectAnimator) obj2).isRunning()) {
            ((ObjectAnimator) scfVar.a).cancel();
        }
        scfVar.a = ObjectAnimator.ofFloat(view, "alpha", 0.3f, 0.0f);
        ((ObjectAnimator) scfVar.a).setDuration(300L);
        ((ObjectAnimator) scfVar.a).addListener(new jfi(scfVar, view, 0));
        ((ObjectAnimator) scfVar.a).start();
        jwt jwtVar = new jwt(this);
        this.v = jwtVar;
        jwtVar.start();
        N();
        this.f.a(new jwq(this, 3));
    }

    @Override // defpackage.fqf
    public final void eA() {
    }

    @Override // defpackage.fqf
    public final void eC() {
        ojl.ck(this.ax.a(), new fqz(this, 13), this.ac);
    }

    @Override // defpackage.fqf
    public final rwc eD() {
        return rwc.j(new ngq(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), 1, rvk.a, false));
    }

    public final void f() {
        this.A.post(new juc(this, 5, null));
    }

    public final void g() {
        if (this.h) {
            if (this.O != 5) {
                e();
                return;
            }
            Object obj = jeb.a;
            if (LightCycleNative.GetNumCapturedTargets() < LightCycleNative.GetNumTotalTargets()) {
                this.A.post(new juc(this, 6, null));
            } else {
                e();
            }
        }
    }

    public final void k() {
        this.j = true;
        this.z.d();
    }

    @Override // defpackage.fqf
    public final boolean o() {
        if (this.j) {
            f();
            return true;
        }
        this.z.h();
        return false;
    }

    @Override // defpackage.fqf
    public final String r() {
        int i = this.O;
        int i2 = i - 1;
        if (i != 0) {
            return this.m.getResources().getString(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? R.string.media_accessibility_peek : R.string.fisheye_accessibility_peek : R.string.wide_angle_accessibility_peek : R.string.vertical_panorama_accessibility_peek : R.string.horizontal_panorama_accessibility_peek : R.string.photosphere_accessibility_peek);
        }
        throw null;
    }

    @Override // defpackage.fqf
    public final void t(ena enaVar) throws PackageManager.NameNotFoundException, IOException {
        float fA;
        this.g = new jdn(enaVar, this.A);
        if (!Z) {
            enl enlVarE = enaVar.e();
            new enx(0, 0);
            enx enxVar = (enx) jdo.a(enlVarE).b;
            enx enxVar2 = new enx(enxVar.b(), enxVar.a());
            if (enaVar == null) {
                fA = 0.0f;
            } else {
                jod jodVarA = jdo.a(enaVar.e());
                ens ensVarF = enaVar.f();
                enx enxVar3 = (enx) jodVarA.a;
                ensVarF.k(new enx(enxVar3.b(), enxVar3.a()));
                enx enxVar4 = (enx) jodVarA.b;
                ensVarF.l(new enx(enxVar4.b(), enxVar4.a()));
                enaVar.m(ensVarF);
                fA = jdx.a(enaVar.e().u);
            }
            int iB = enxVar2.b();
            int iA = enxVar2.a();
            synchronized (jeb.a) {
                LightCycleNative.Init(iB, iA, fA, jeb.d);
                jeb.b = false;
            }
            Z = true;
        }
        if (this.G != null) {
            K();
            return;
        }
        fqy fqyVar = this.S.K;
        SurfaceTexture surfaceTexture = fqyVar.s;
        if (surfaceTexture != null) {
            enaVar.n();
            this.am.onSurfaceTextureAvailable(surfaceTexture, fqyVar.t, fqyVar.u);
        }
    }

    @Override // defpackage.fqf
    public final void u(int i) {
        this.N = i;
        jej jejVar = this.r;
        if (jejVar == null) {
            return;
        }
        boolean z = i == 2;
        jejVar.s = z;
        jejVar.t = z || i == 1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uem] */
    public final void K() throws PackageManager.NameNotFoundException, IOException {
        if (this.g == null) {
            ((sgt) a.c().M(3113)).s("startCapture: camera device not open yet.");
            return;
        }
        if (this.i) {
            P();
        }
        this.q = 0;
        this.T.h();
        this.L = 0;
        try {
            jfh jfhVar = this.R;
            String str = cdVQ.IqzQfBWpJqVXuFU;
            long jCurrentTimeMillis = System.currentTimeMillis();
            lsw lswVarP = jfhVar.h.p(jCurrentTimeMillis, hqp.PHOTOSPHERE, str);
            String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(jCurrentTimeMillis));
            File file = new File(jfhVar.e, "session_".concat(String.valueOf(str2)));
            file.mkdirs();
            try {
                if (file.isDirectory()) {
                    for (String str3 : file.list()) {
                        new File(file, str3).delete();
                    }
                }
            } catch (Exception unused) {
                ((sgt) jfh.a.b().M(2722)).s("Could not delete temporary images.");
            }
            LocalSessionStorage localSessionStorage = new LocalSessionStorage();
            localSessionStorage.a = str2;
            localSessionStorage.c = jfhVar.d.getAbsolutePath();
            localSessionStorage.d = jfhVar.e.getAbsolutePath();
            localSessionStorage.e = file.getAbsolutePath();
            localSessionStorage.f = Paths.get("panorama_sessions", "session_".concat(String.valueOf(str2))).toString();
            String strC = jfhVar.c.c(jCurrentTimeMillis);
            lta ltaVar = new lta(jfhVar.g, localSessionStorage.f, strC);
            if (!ltaVar.c()) {
                throw new IOException("Cannot create temporary session file.");
            }
            obu obuVar = jfhVar.i;
            fse fseVarA = jfhVar.f.a();
            Object objA = obuVar.a.a();
            llm llmVar = (llm) obuVar.b.a();
            llmVar.getClass();
            localSessionStorage.b = new lsi((lrm) objA, llmVar, ltaVar, strC, fseVarA, lswVarP);
            String str4 = strC + "." + ppo.c.k;
            if (jfhVar.a() == null) {
                ((sgt) jfh.a.b().M(2723)).s("Could not get the thumbnail directory.");
                localSessionStorage.g = "";
            } else {
                localSessionStorage.g = new File(jfhVar.a(), str4).getAbsolutePath();
            }
            localSessionStorage.i = new File(file, "orientations.txt").getAbsolutePath();
            localSessionStorage.h = new File(file, "session.meta").getAbsolutePath();
            this.k = localSessionStorage;
            Set set = this.C;
            synchronized (set) {
                set.add(this.k.e);
            }
            AmbientDelegate ambientDelegate = this.aD;
            ambientDelegate.y(this.k.d);
            LocalSessionStorage localSessionStorage2 = this.k;
            ambientDelegate.y(localSessionStorage2.c + localSessionStorage2.d);
            LocalSessionStorage localSessionStorage3 = this.k;
            String str5 = localSessionStorage3.h;
            String str6 = localSessionStorage3.i;
            String str7 = localSessionStorage3.e;
            String str8 = localSessionStorage3.a;
            String str9 = localSessionStorage3.g;
            localSessionStorage3.j = this.O;
            this.f = new jdz();
            Context context = this.m;
            jej jejVar = new jej(context, this.ag, this.ah, this.az);
            this.r = jejVar;
            jejVar.f(this.O);
            jfc jfcVar = this.aa;
            PackageInfo packageInfo = null;
            if (!jfcVar.m) {
                jfcVar.m = true;
                fpy fpyVar = jfcVar.p;
                int iF = fpyVar.f();
                jfcVar.j = (fpyVar.d == null ? null : r1.b(iF)).a();
                jfcVar.a = (SensorManager) context.getSystemService("sensor");
                jfcVar.n = new jfa(jfcVar);
                jfcVar.n.start();
                jfcVar.c = false;
                jfcVar.b();
                jfcVar.i.e();
            }
            hbj hbjVar = this.aA;
            jeg jegVar = new jeg(context, hbjVar, this.g, jfcVar, this.k, this.f, this.r, this.ad);
            this.s = jegVar;
            jegVar.B = this.ao;
            jegVar.t = this.G;
            jegVar.w = this.ap;
            jegVar.x = this.aq;
            enx enxVarA = this.g.a(this.l, hbjVar, jegVar.J, true);
            this.s.g();
            jeg jegVar2 = this.s;
            int iB = enxVarA.b();
            int iA = enxVarA.a();
            jej jejVar2 = jegVar2.b;
            jejVar2.A = iB;
            jejVar2.B = iA;
            jeg jegVar3 = this.s;
            int i = this.O;
            jdn jdnVar = jegVar3.c;
            if (jdnVar == null) {
                ((sgt) a.c().M(3111)).s("Can't setup LightCycleController for startPreview.");
                return;
            }
            if (jegVar3.b() <= 0.0f) {
                i = 6;
            }
            ((enx) jdo.a(jdnVar.b.e()).a).b();
            jegVar3.b.f(i);
            jegVar3.h(i);
            try {
                Context context2 = jegVar3.p;
                packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (packageInfo != null) {
                String str10 = packageInfo.versionName;
                Object obj = jeb.a;
                LightCycleNative.SetAppVersion(str10);
            }
            jegVar3.e();
            this.g.b.r(this.A, new jws(this, 0));
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 3112)).s("Cannot start capture, local session storage not ready.");
        }
    }

    @Override // defpackage.fqf
    public final void l() throws SecurityException, IllegalArgumentException {
        iyu iyuVar = this.S;
        MainActivityLayout mainActivityLayout = iyuVar.K.e;
        this.o = mainActivityLayout;
        ViewGroup viewGroup = (ViewGroup) mainActivityLayout.findViewById(R.id.module_layout);
        if (viewGroup.getChildCount() <= 0) {
            LayoutInflater.from(this.n).inflate(R.layout.pano_module, viewGroup, true);
            PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.o.findViewById(R.id.photosphere_calibration_overlay);
            this.ah = photoSphereMessageOverlay;
            photoSphereMessageOverlay.c = this.aB;
            photoSphereMessageOverlay.b(this.y);
            this.ae = this.o.findViewById(R.id.flash_overlay);
        }
        our ourVar = new our();
        this.ak = ourVar;
        ourVar.d(this.ab.e(this.d));
        this.ak.d(this.z.d.dK(new jww(this, 1), sxo.a));
        this.c.A(this.aE);
        iyuVar.t(this.am, false);
        fpy fpyVar = this.aw;
        fpyVar.j();
        d();
        if (fpyVar.f() == -1) {
            x();
            z();
            rkc rkcVar = new rkc(this.n, this.D);
            rkcVar.l(R.string.photosphere_no_back_camera);
            rkcVar.k(false);
            rkcVar.q(R.string.ok, new fdf(this, 11, null));
            rkcVar.b().show();
            return;
        }
        Process.setThreadPriority(-19);
        mfs mfsVar = this.ay;
        jfh jfhVar = this.R;
        jfhVar.b = new File(mfsVar.b());
        if (!jfhVar.b.exists() && !jfhVar.b.mkdirs()) {
            ((sgt) jfh.a.b().M(2725)).s(mPfBwqXsnpXI.OrtkHVEZdsLte);
        }
        ((DisplayManager) this.m.getSystemService("display")).registerDisplayListener(this.af, null);
        this.ag = new jep();
        this.as.b(this.at);
    }

    @Override // defpackage.fqf
    public final void m() {
        this.ak.close();
        this.c.B(this.aE);
        M();
        ((DisplayManager) this.m.getSystemService(IQwwK.rLTnHbSNg)).unregisterDisplayListener(this.af);
        J();
        HandlerThread handlerThread = this.al;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.al = null;
            this.F = null;
        }
        this.aa.d();
        jdz jdzVar = this.f;
        if (jdzVar != null && !jdzVar.isInterrupted()) {
            this.f.interrupt();
        }
        this.A.post(new juc(this, 10, null));
        this.g = null;
        this.S.t(new nbm(), true);
        this.as.g(this.at);
    }
}
