package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import com.google.ar.core.ImageMetadata;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eox implements ComponentCallbacks2 {
    private static volatile eox f;
    private static volatile boolean g;
    public final ete a;
    public final epa b;
    public final List c = new ArrayList();
    public final etl d;
    public final eoy e;
    private final etx h;
    private final eyy i;

    public eox(Context context, ree reeVar, etx etxVar, ete eteVar, etl etlVar, eyy eyyVar, eoy eoyVar, Map map, List list, List list2, ejs ejsVar) {
        this.a = eteVar;
        this.d = etlVar;
        this.h = etxVar;
        this.i = eyyVar;
        this.e = eoyVar;
        this.b = new epa(context, etlVar, new eph(this, list2), new ezh((byte[]) null), map, list, reeVar, ejsVar);
    }

    public static eox b(Context context) {
        boolean z;
        yd ydVar;
        ejt ejtVar;
        Context applicationContext;
        ArrayList<GlideConfiguration> arrayList;
        if (f == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (eox.class) {
                if (f == null) {
                    if (g) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    g = true;
                    try {
                        ydVar = new yd();
                        ejtVar = new ejt();
                        applicationContext = context.getApplicationContext();
                        List list = Collections.EMPTY_LIST;
                        arrayList = new ArrayList();
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                    }
                    try {
                        try {
                            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null && applicationInfo.metaData != null) {
                                for (String str : applicationInfo.metaData.keySet()) {
                                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                        arrayList.add(ezi.a(str));
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            if (Log.isLoggable("ManifestParser", 6)) {
                                Log.e("ManifestParser", "Failed to parse glide modules", e);
                            }
                        }
                        if (generatedAppGlideModuleD != null && !new HashSet().isEmpty()) {
                            HashSet hashSet = new HashSet();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (hashSet.contains(((GlideConfiguration) it.next()).getClass())) {
                                    it.remove();
                                }
                            }
                        }
                        for (GlideConfiguration glideConfiguration : arrayList) {
                        }
                        long j = eue.a;
                        eub eubVar = new eub(false);
                        eubVar.b(eue.a());
                        eubVar.a = "source";
                        eue eueVarA = eubVar.a();
                        eub eubVar2 = new eub(true);
                        eubVar2.b(1);
                        eubVar2.a = "disk-cache";
                        eue eueVarA2 = eubVar2.a();
                        int i = eue.a() >= 4 ? 2 : 1;
                        eub eubVar3 = new eub(true);
                        eubVar3.b(i);
                        eubVar3.a = "animation";
                        eue eueVarA3 = eubVar3.a();
                        ety etyVar = new ety(applicationContext);
                        int i2 = true != etyVar.a.isLowRamDevice() ? 4194304 : 2097152;
                        int iRound = Math.round(r8.getMemoryClass() * ImageMetadata.SHADING_MODE * (true != etyVar.a.isLowRamDevice() ? 0.4f : 0.33f));
                        float f2 = ((DisplayMetrics) etyVar.c.a).widthPixels * ((DisplayMetrics) etyVar.c.a).heightPixels * 4;
                        int iRound2 = Math.round(etyVar.b * f2);
                        int iRound3 = Math.round(f2 + f2);
                        int i3 = iRound - i2;
                        if (iRound3 + iRound2 > i3) {
                            float f3 = i3 / (etyVar.b + 2.0f);
                            iRound3 = Math.round(f3 + f3);
                            iRound2 = Math.round(f3 * etyVar.b);
                        }
                        eoy eoyVar = new eoy();
                        ete etmVar = iRound2 > 0 ? new etm(iRound2) : new etf();
                        etl etlVar = new etl(i2);
                        etw etwVar = new etw(iRound3);
                        ejt ejtVar2 = new ejt(applicationContext);
                        new ThreadPoolExecutor(0, Integer.MAX_VALUE, eue.a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new eud("source-unlimited", false));
                        eox eoxVar = new eox(applicationContext, new ree(etwVar, ejtVar2, eueVarA2, eueVarA, eueVarA3), etwVar, etmVar, etlVar, new eyy(), eoyVar, ydVar, Collections.EMPTY_LIST, arrayList, new ejs(ejtVar));
                        applicationContext.registerComponentCallbacks(eoxVar);
                        f = eoxVar;
                        g = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        g = z;
                        throw th;
                    }
                }
            }
        }
        return f;
    }

    public static epl c(Context context) {
        eoz.j(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).i.a(context);
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            e(e);
            return null;
        } catch (InstantiationException e2) {
            e(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            e(e3);
            return null;
        } catch (InvocationTargetException e4) {
            e(e4);
            return null;
        }
    }

    private static void e(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        fax.g();
        this.h.e();
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        fax.g();
        List<epl> list = this.c;
        synchronized (list) {
            for (epl eplVar : list) {
            }
        }
        Object obj = this.h;
        if (i >= 40) {
            ((fat) obj).e();
        } else if (i >= 20) {
            fat fatVar = (fat) obj;
            fatVar.j(fatVar.f() / 2);
        } else if (i == 15) {
            i = 15;
            fat fatVar2 = (fat) obj;
            fatVar2.j(fatVar2.f() / 2);
        }
        this.a.e(i);
        this.d.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
