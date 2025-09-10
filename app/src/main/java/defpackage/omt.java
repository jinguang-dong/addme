package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omt {
    public static String b = "0";
    private static final String c = "omt";
    private static okc e;
    private static final odo d = odo.d;
    public static final Object a = new Object();

    private omt() {
    }

    public static okc a() {
        okc okcVar;
        synchronized (a) {
            okcVar = e;
        }
        return okcVar;
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            omv omvVar = new omv(context, 37401, 1.0f);
            try {
                new jps("PlayServices CronetProviderInstaller#installIfNeeded", 2);
                try {
                    ojl.az(context, "Context must not be null");
                    ClassLoader classLoader = omt.class.getClassLoader();
                    ojl.ay(classLoader);
                    try {
                        classLoader.loadClass("org.chromium.net.CronetEngine");
                        new jps("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable", 2);
                        try {
                            int i = oef.c;
                            int iF = odo.d.f(context, 11925000);
                            if (iF != 0) {
                                Intent intentG = odo.d.g(context, iF, ibINv.LVLprt);
                                Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iF);
                                if (intentG != null) {
                                    throw new oee("Google Play Services not available");
                                }
                                throw new oed();
                            }
                            Trace.endSection();
                            try {
                                new jps("CronetProviderInstaller#installIfNeeded DynamiteModule#load", 2);
                                try {
                                    okc okcVarB = okc.b(context, okc.a, "com.google.android.gms.cronet_dynamite");
                                    Trace.endSection();
                                    try {
                                        new jps("PlayServices CronetProviderInstaller#installIfNeeded loading class", 2);
                                        try {
                                            Class<?> clsLoadClass = okcVarB.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                            if (clsLoadClass.getClassLoader() == omt.class.getClassLoader()) {
                                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                                throw new oed();
                                            }
                                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                                            Integer num = (Integer) d(method, new Object[0]);
                                            ojl.ay(num);
                                            int iIntValue = num.intValue();
                                            String str = (String) d(method2, new Object[0]);
                                            ojl.ay(str);
                                            b = str;
                                            Trace.endSection();
                                            if (iIntValue >= 3) {
                                                e = okcVarB;
                                                omvVar.a();
                                                Trace.endSection();
                                                omvVar.close();
                                                return;
                                            }
                                            if (d.g(context, 2, "cr") == null) {
                                                Log.e(c, "Unable to fetch error resolution intent");
                                                throw new oed();
                                            }
                                            throw new oee("Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (Exception e2) {
                                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                        throw ((oed) new oed().initCause(e2));
                                    }
                                } finally {
                                    try {
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                            } catch (ojy e3) {
                                Log.e(c, "Unable to load Cronet module", e3);
                                throw ((oed) new oed().initCause(e3));
                            }
                        } finally {
                        }
                    } catch (ClassNotFoundException e4) {
                        Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                        throw ((oed) new oed().initCause(e4));
                    }
                } finally {
                }
            } finally {
            }
        }
    }
}
