package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.hardware.HardwareBuffer;
import android.util.Log;
import android.util.Range;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.ar.core.R;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.io.BufferedReaderRetargetClass;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.ToDoubleFunction;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class obu {
    private static Boolean c;
    public final Object a;
    public final Object b;

    public obu(Activity activity, dav davVar) {
        this.b = activity;
        this.a = davVar;
    }

    private static double A(final double d, sbp sbpVar) {
        uen uenVar = (uen) Collection.EL.stream(sbpVar).sorted(Comparator$CC.comparingDouble(new ToDoubleFunction() { // from class: njg
            @Override // java.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                Range range = ((njh) obj).a;
                double d2 = d;
                if (range.contains((Range) Double.valueOf(d2))) {
                    return 0.0d;
                }
                return Math.min(Math.abs(((Double) range.getLower()).doubleValue() - d2), Math.abs(((Double) range.getUpper()).doubleValue() - d2));
            }
        })).map(new ndu(10)).findFirst().orElseThrow(new mae(4));
        return (uenVar.a * d) + uenVar.b;
    }

    public static boolean d(Context context) throws PackageManager.NameNotFoundException {
        ojl.ay(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public static obu i(Object obj) {
        return new obu(rwc.j(obj), rvk.a, (byte[]) null);
    }

    public static obu j(Object obj) {
        return new obu(rvk.a, rwc.j(obj), (byte[]) null);
    }

    public static final Enum k(Enum r0, Class cls) {
        r0.getClass();
        return Enum.valueOf(cls, r0.name());
    }

    public static obu o(sbp sbpVar) {
        Stream map = Collection.EL.stream(sbpVar).map(new ndu(11));
        int i = sbp.d;
        Collector collector = ryv.a;
        sbp sbpVar2 = (sbp) map.collect(collector);
        return new obu(B(sbpVar2), B((sbp) Collection.EL.stream(sbpVar2).map(new ndu(12)).collect(collector)));
    }

    public static final EGLImage s(poj pojVar) {
        HardwareBuffer hardwareBufferF = pojVar.f();
        hardwareBufferF.getClass();
        return new kfc(hardwareBufferF, hardwareBufferF);
    }

    public final void a() {
        oar oarVarC = oar.c((Context) this.b);
        obm obmVarD = oarVarC.d();
        obc obcVar = oarVarC.c;
        obmVarD.q("Local AnalyticsService is starting up");
    }

    public final void b() {
        oar oarVarC = oar.c((Context) this.b);
        obm obmVarD = oarVarC.d();
        obc obcVar = oarVarC.c;
        obmVarD.q("Local AnalyticsService is shutting down");
    }

    public final void c(Runnable runnable) {
        oar.c((Context) this.b).b().b(new obs(this, runnable));
    }

    public final void e(Intent intent, int i) {
        try {
            synchronized (obr.a) {
                ooe ooeVar = obr.b;
                if (ooeVar != null && ooeVar.b()) {
                    if (ooeVar.m.decrementAndGet() < 0) {
                        nwj nwjVar = ooe.p;
                        Log.w("WakeLock", String.format("%s release without a matched acquire!", ooeVar.j));
                    }
                    synchronized (ooeVar.b) {
                        ooeVar.c();
                        Map map = ooeVar.l;
                        if (map.containsKey(null)) {
                            ood oodVar = (ood) map.get(null);
                            if (oodVar != null) {
                                int i2 = oodVar.a - 1;
                                oodVar.a = i2;
                                if (i2 == 0) {
                                    map.remove(null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", ooeVar.j + " counter does not exist");
                        }
                        ooeVar.d();
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        oar oarVarC = oar.c((Context) this.b);
        obm obmVarD = oarVarC.d();
        if (intent == null) {
            obmVarD.t("AnalyticsService started with null intent");
            return;
        }
        obc obcVar = oarVarC.c;
        String action = intent.getAction();
        obmVarD.s("Local AnalyticsService called. startId, action", Integer.valueOf(i), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            c(new ng(this, i, obmVarD, 14));
        }
    }

    public final Object f() {
        synchronized (this.b) {
        }
        return this.a;
    }

    public final void g(String str, String str2) {
        ((UrlRequest.Builder) this.a).addHeader(str, str2);
    }

    public final PointF h() {
        Point pointBi = ojl.bi((View) this.a);
        MotionEvent motionEvent = (MotionEvent) this.b;
        return new PointF(motionEvent.getRawX() - pointBi.x, motionEvent.getRawY() - pointBi.y);
    }

    public final double l(double d) {
        return A(d, (sbp) this.a);
    }

    public final double m(double d) {
        return A(d, (sbp) this.b);
    }

    public final String n(lur lurVar) {
        return ((Context) this.a).getString(true != ((Boolean) ((luj) this.b).b(lurVar)).booleanValue() ? R.string.setting_off : R.string.setting_on);
    }

    public final boolean p() {
        Activity activity = (Activity) this.b;
        return activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final sbv q() {
        int i = 18;
        return (sbv) Collection.EL.stream(this.b).filter(new jjj(this, i)).collect(ryv.a(new kwj(i), new kwj(19)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qin] */
    public final qkr r(qkt... qktVarArr) {
        return qkr.e(this.b, qktVarArr);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, qin] */
    public final qkl t(int i, int i2) throws IOException {
        try {
            Object obj = this.a;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) obj).getResources().openRawResource(i)));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(((Context) obj).getResources().openRawResource(i2)));
                try {
                    String str = (String) BufferedReaderRetargetClass.lines(bufferedReader).collect(Collectors.joining("\n"));
                    String str2 = (String) BufferedReaderRetargetClass.lines(bufferedReader2).collect(Collectors.joining("\n"));
                    ?? r5 = this.b;
                    qjv qjvVar = new qjv(r5);
                    qjvVar.a(new qml(qkl.d(r5, str)));
                    qjvVar.a(new qml(qkl.b(r5, str2)));
                    qkl qklVarB = qjvVar.b();
                    bufferedReader2.close();
                    bufferedReader.close();
                    return qklVarB;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void u(long j) {
        Object obj = this.b;
        if (!((hbj) obj).a(hac.e).isPresent() || j >= ((Integer) r0.a(r1).get()).intValue()) {
            ((iyu) this.a).K.o();
        }
    }

    public final boolean v() {
        return ((fuf) this.b).a(nkw.TIME_LAPSE);
    }

    public final boolean w() {
        if (v()) {
            return ((hbj) this.a).p(haw.o);
        }
        return false;
    }

    public final jsi x(jsi jsiVar) {
        jsa jsaVar = new jsa(this, jsiVar);
        ((our) this.a).d(jsaVar.a);
        return jsaVar;
    }

    public final synchronized void y() {
        ((our) this.a).close();
    }

    public final float z(float f) {
        char c2;
        float[] fArr = (float[]) this.a;
        int iBinarySearch = Arrays.binarySearch(fArr, f);
        if (iBinarySearch == -1) {
            c2 = 0;
        } else {
            if (iBinarySearch >= -201) {
                if (iBinarySearch >= 0) {
                    return ((float[]) this.b)[iBinarySearch];
                }
                int i = -iBinarySearch;
                int i2 = i - 1;
                int i3 = i - 2;
                Object obj = this.b;
                float f2 = fArr[i3];
                float[] fArr2 = (float[]) obj;
                float f3 = fArr2[i3];
                float f4 = fArr[i2];
                float f5 = fArr2[i2];
                if (f <= f2) {
                    return f3;
                }
                if (f >= f4) {
                    return f5;
                }
                return f3 + (((f - f2) / (f4 - f2)) * (f5 - f3));
            }
            c2 = 200;
        }
        return ((float[]) this.b)[c2];
    }

    public obu(Context context, Object obj) {
        this.a = context;
        this.b = obj;
    }

    public obu(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private static sbp B(sbp sbpVar) {
        if (!sbpVar.isEmpty()) {
            final boolean z = false;
            if (sbpVar.size() == 1) {
                uen uenVar = (uen) sbpVar.get(0);
                return sbp.l(new njh(Range.create(Double.valueOf(uenVar.a), Double.valueOf(uenVar.a)), new uen(0.0d, uenVar.b)));
            }
            if (((uen) sbpVar.get(1)).a - ((uen) sbpVar.get(0)).a > 0.0d) {
                z = true;
            }
            new smy(Collection.EL.stream(sbpVar).skip(1L), Collection.EL.stream(sbpVar).skip(2L)).f(new BiConsumer() { // from class: njf
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    if ((((uen) obj2).a - ((uen) obj).a > 0.0d) != z) {
                        throw new IllegalArgumentException("Not monotonic.");
                    }
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            Stream streamD = new smy(Collection.EL.stream(sbpVar), Collection.EL.stream(sbpVar).skip(1L)).d(new jge(8));
            Collector collector = ryv.a;
            return (sbp) smz.m((sbp) new smy(Collection.EL.stream(sbpVar), Collection.EL.stream(sbpVar).skip(1L)).d(new jge(6)).collect(collector), (sbp) streamD.collect(collector)).d(new jge(7)).collect(collector);
        }
        throw new IllegalArgumentException(SHXc.CgAwpNwt);
    }

    public obu(iyu iyuVar, hbj hbjVar) {
        this.b = hbjVar;
        this.a = iyuVar;
    }

    public obu(Object obj) {
        this.b = new Object();
        this.a = obj;
    }

    public obu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public obu(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public obu(oar oarVar) {
        this.b = oarVar;
        this.a = new obi();
    }

    public obu(Context context) {
        this.b = context;
        this.a = new ols();
    }

    public obu(PackageManager packageManager) {
        this.a = new ConcurrentHashMap();
        this.b = packageManager;
    }

    public obu(MainActivityLayout mainActivityLayout, FrameLayout frameLayout) {
        this((ViewGroup) frameLayout);
        this.b = mainActivityLayout;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, syu] */
    public obu(obu obuVar) {
        this.a = ((UrlRequest.Builder) obuVar.a).build();
        ?? r3 = obuVar.b;
        this.b = r3;
        r3.c(new ntd(this, 13), sxo.a);
    }

    public obu(pbc pbcVar) {
        this.a = new our();
        this.b = pbcVar.a("EndOnShutdown");
    }

    public obu(uem uemVar, uem uemVar2, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.a = uemVar;
        this.b = uemVar2;
    }

    public obu() {
        if (mkx.class.isEnum()) {
            if (sty.class.isEnum()) {
                this.a = mkx.class;
                this.b = sty.class;
                return;
            }
            throw new IllegalArgumentException("Class to do conversion is not enum: ".concat(sty.class.toString()));
        }
        throw new IllegalArgumentException("Class to do conversion is not enum: ".concat(mkx.class.toString()));
    }

    public obu(uem uemVar, uem uemVar2, byte[] bArr) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
    }

    public obu(Context context, byte[] bArr) {
        ojl.ay(context);
        Context applicationContext = context.getApplicationContext();
        ojl.az(applicationContext, "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }

    public obu(uem uemVar, uem uemVar2) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
    }

    public obu(Set set, krj krjVar) {
        this.b = scn.F(set);
        this.a = krjVar;
    }
}
