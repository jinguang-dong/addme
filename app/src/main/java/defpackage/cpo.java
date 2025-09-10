package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.view.WindowInsets;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpo {
    public cpo() {
    }

    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static Exception b(String str, Exception exc) {
        Object objInvoke;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            int i = 0;
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
            }
            objInvoke = method.invoke(null, a.bE(i, "sys.user.", ".ce_available"), "false");
            objInvoke.getClass();
        } catch (Throwable th) {
            ujk.f(exc, th);
        }
        if (!a.ao((String) objInvoke, "true")) {
            if (str != null) {
                File file = new File(str, "siblingTestFile.txt");
                if (file.exists()) {
                    file.delete();
                }
                try {
                    try {
                        file.createNewFile();
                    } catch (IOException unused2) {
                        exc = new crv(exc);
                    }
                    return exc;
                } finally {
                    file.delete();
                }
            }
        }
        return exc;
    }

    public static long c(cux cuxVar, float f) {
        long jT = a.t(cuxVar.a(), cuxVar.b());
        int i = 1;
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jI = cuxVar.i(f4);
            float fJ = cij.j(cij.m(jI, jT));
            if (fJ >= f3) {
                return a.t(f4 - ((1.0f - (f3 / fJ)) / 3.0f), f);
            }
            f3 -= fJ;
            f2 += fJ;
            if (i == 3) {
                return a.t(1.0f, f2);
            }
            i++;
            jT = jI;
        }
    }

    public static float d(cux cuxVar) {
        cuxVar.getClass();
        return Float.intBitsToFloat((int) (c(cuxVar, Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static float e(yi yiVar, yi yiVar2, float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid progress: " + f);
        }
        ugd it = ukc.u(0, yiVar.b).iterator();
        while (((uku) it).a) {
            int iA = it.a();
            int i = iA + 1;
            if (h(f, yiVar.a(iA), yiVar.a(i % yiVar.b))) {
                int i2 = i % yiVar.b;
                float fA = yiVar.a(i2) - yiVar.a(iA);
                int i3 = cvk.a;
                float fA2 = yiVar2.a(i2) - yiVar2.a(iA);
                float fE = cvk.e(fA);
                return cvk.e(yiVar2.a(iA) + (cvk.e(fA2) * (fE < 0.001f ? 0.5f : cvk.e(f - yiVar.a(iA)) / fE)));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static float f(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 1.0f - fAbs);
    }

    public static void g(yi yiVar) {
        float fB = yiVar.b();
        int i = yiVar.b;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            float fA = yiVar.a(i2);
            if (fA < 0.0f || fA >= 1.0f) {
                throw new IllegalArgumentException("FloatMapping - Progress outside of range: ".concat(yi.d(yiVar, null, null, 31)));
            }
            if (f(fA, fB) <= 1.0E-4f) {
                throw new IllegalArgumentException("FloatMapping - Progress repeats a value: ".concat(yi.d(yiVar, null, null, 31)));
            }
            if (fA < fB && (i3 = i3 + 1) > 1) {
                throw new IllegalArgumentException("FloatMapping - Progress wraps more than once: ".concat(yi.d(yiVar, null, null, 31)));
            }
            i2++;
            fB = fA;
        }
    }

    public static boolean h(float f, float f2, float f3) {
        return f3 >= f2 ? f2 <= f && f <= f3 : f >= f2 || f <= f3;
    }

    public static Object i(dcj dcjVar, String str, uhb uhbVar) {
        Object objA = dcjVar.a(str, new axa(7), uhbVar);
        return objA == uhi.a ? objA : ufg.a;
    }

    public static String j(String str) {
        return a.bw(str, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", "')");
    }

    public static void l(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            dwj.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            dwj.b();
            Log.w(SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }

    public static File m(Context context) {
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static dxo n(boolean z) {
        dxp dxpVar = new dxp();
        return z ? new dxq(dxpVar) : dxpVar;
    }

    public static dxo o() {
        return n(true);
    }

    public static void p(ebn ebnVar, ejs ejsVar) {
        ejsVar.getClass();
        ebnVar.c(ejsVar, -512);
    }

    public static ejs q(dxo dxoVar, ebx ebxVar) {
        ebxVar.getClass();
        return dxoVar.d(AmbientLifecycleObserver.AmbientLifecycleCallback.CC.A(ebxVar));
    }

    public cpo(byte[] bArr) {
    }

    public cpo(char[] cArr, byte[] bArr) {
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
    }

    public void k(dfa dfaVar) {
    }
}
