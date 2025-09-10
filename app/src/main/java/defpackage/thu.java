package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class thu {
    public static volatile thu a;
    public static int b;
    public static tyv c;
    public static volatile Boolean d;
    private static Context e;

    public static void $default$onFinalStatusNative(LasagnaCallbacks lasagnaCallbacks, int i, int i2, String str, byte[] bArr) {
        rwc rwcVarJ = rvk.a;
        if (bArr != null) {
            try {
                tph tphVarQ = tph.q(thz.a, bArr, 0, bArr.length, tow.a());
                tph.D(tphVarQ);
                rwcVarJ = rwc.j((thz) tphVarQ);
            } catch (tpz unused) {
            }
        }
        lasagnaCallbacks.a(i, i2, str, rwcVarJ);
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "POSTVIEW_THUMBNAIL" : "ACTION_PAN" : "LONG_EXPOSURE" : "HDR_PLUS" : "PROCESSOR_OUTPUT_IMAGE_TYPE_UNDEFINED";
    }

    public static /* synthetic */ Number b(int i, tml tmlVar) {
        return i + (-1) != 0 ? new tjj(tmlVar.j()) : Double.valueOf(tmlVar.a());
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 7) {
            return i != 8 ? 0 : 9;
        }
        return 8;
    }

    public static /* synthetic */ int d(long j, int i, int i2) {
        if (i <= i2) {
            return (int) Math.min(i2, Math.max(j, i));
        }
        throw new IllegalArgumentException(i + " > " + i2);
    }

    public static /* synthetic */ int e(double d2) {
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static Context f(Context context) throws txv {
        if (e == null) {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(context);
            if (vrCoreClientApiVersion < 9) {
                throw new txv(4);
            }
            try {
                e = context.createPackageContext("com.google.vr.vrcore", 3);
                b = vrCoreClientApiVersion;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new txv(1);
            }
        }
        return e;
    }

    public static synchronized boolean h(Context context) {
        if (d == null) {
            try {
                d = Boolean.valueOf(txu.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), txu.c, txu.d, txu.b));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalStateException("Unable to find self package info", e2);
            }
        }
        return d.booleanValue();
    }

    public static float i(float f) {
        return Math.abs((-1.0f) + f) < 2.821E-4f ? 2.0f / (f + 1.0f) : 1.0f / ((float) Math.sqrt(f));
    }

    public static Uri j(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    public static tws k(Context context) {
        ArrayList arrayList;
        qay qayVar = null;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
        } else {
            List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
            if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = it.next().providerInfo;
                    String str = providerInfo.packageName;
                    if (str != null && str.startsWith("com.google.")) {
                        arrayList2.add(providerInfo.authority);
                    }
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str2);
                if (contentProviderClientAcquireContentProviderClient != null) {
                    qayVar = new qay(contentProviderClientAcquireContentProviderClient, str2, null);
                    break;
                }
            }
        }
        if (qayVar == null) {
            return new twp(context);
        }
        return new twe((ContentProviderClient) qayVar.b, (String) qayVar.a);
    }

    public static float l(txq txqVar) {
        if (txqVar == null || (txqVar.b & 4) == 0) {
            return 0.003f;
        }
        return txqVar.e;
    }

    public static DisplayMetrics m(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static Display n(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Duration o(tou touVar) {
        return Duration.ofSeconds(tsg.a(touVar.b, touVar.c).b, r4.c);
    }

    public static Instant p(trn trnVar) {
        return Instant.ofEpochSecond(tsi.c(trnVar.b, trnVar.c).b, r4.c);
    }

    public static IBinder g(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.vrcore.library.VrCreator").newInstance();
        } catch (ClassNotFoundException unused) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.vrcore.library.VrCreator");
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException(nWEkBGOQPWQp.bgTvNUFauoaAVr);
        } catch (InstantiationException unused3) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.vrcore.library.VrCreator");
        }
    }
}
