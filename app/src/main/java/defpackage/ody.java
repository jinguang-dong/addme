package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ody {
    public static Context g;
    public static volatile oij h;
    static final odw a = new odp(oif.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final odw b = new odq(oif.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final odw c = new odr(oif.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final odw d = new ods(oif.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final odw e = new odt(oif.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final odw f = new odu(oif.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    public static oec a(oea oeaVar) {
        if (oeaVar.a) {
            oeaVar.b();
            long j = oeaVar.e;
            return new oec(true);
        }
        String str = oeaVar.b;
        if (oeaVar.a() == 4) {
            new PackageManager.NameNotFoundException();
        }
        oeaVar.b();
        oeaVar.a();
        return new oec(false);
    }

    static synchronized void b(Context context) {
        if (g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            g = context.getApplicationContext();
        }
    }

    public static void c() {
        oij oijVar;
        if (h != null) {
            return;
        }
        ojl.ay(g);
        synchronized (i) {
            if (h == null) {
                IBinder iBinderC = okc.b(g, okc.b, "com.google.android.gms.googlecertificates").c();
                if (iBinderC == null) {
                    oijVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    oijVar = iInterfaceQueryLocalInterface instanceof oij ? (oij) iInterfaceQueryLocalInterface : new oij(iBinderC);
                }
                h = oijVar;
            }
        }
    }

    @Deprecated
    public static oec d(String str, oif oifVar, boolean z, boolean z2) {
        oec oecVar;
        String str2 = INRGuObcrHjSQz.KhTsZeEujiEXfGQ;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                c();
                ojl.ay(g);
                oeb oebVar = new oeb(str, oifVar, z, z2);
                try {
                    oij oijVar = h;
                    ojq ojqVar = new ojq(g.getPackageManager());
                    Parcel parcelA = oijVar.a();
                    fbj.c(parcelA, oebVar);
                    fbj.d(parcelA, ojqVar);
                    Parcel parcelZ = oijVar.z(5, parcelA);
                    boolean zE = fbj.e(parcelZ);
                    parcelZ.recycle();
                    oecVar = zE ? oec.a : new oec(false);
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", str2, e2);
                    oecVar = new oec(false);
                }
            } catch (ojy e3) {
                Log.e("GoogleCertificates", str2, e3);
                e3.getMessage();
                oecVar = new oec(false);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return oecVar;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
