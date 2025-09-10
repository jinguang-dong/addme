package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import android.os.Trace;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qsz {
    public qsz() {
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("PhenotypeStickyAccount", 0);
    }

    public static float[] b(float f, float f2) {
        float[] fArr = new float[8];
        int i = 0;
        int i2 = 0;
        float f3 = 1.0f;
        while (true) {
            float f4 = i;
            if (f4 > 0.0f) {
                return fArr;
            }
            if (i > 0) {
                fArr[i2] = fArr[i2 - 2];
                fArr[i2 + 1] = fArr[i2 - 1];
                int i3 = i2 + 3;
                fArr[i2 + 2] = f;
                i2 += 4;
                fArr[i3] = f3;
            }
            float f5 = (-1.0f) + f2 + f3;
            float f6 = f4 == 0.0f ? f2 : f5;
            float f7 = f;
            for (int i4 = 0; i4 <= 1; i4++) {
                fArr[i2] = f7;
                fArr[i2 + 1] = f3;
                int i5 = i2 + 3;
                fArr[i2 + 2] = f7;
                i2 += 4;
                fArr[i5] = f6;
                f7 += 1.0f - f;
            }
            i++;
            f3 = f5;
        }
    }

    public static String c(Resources resources, int i) {
        if (resources != null && i != 0 && (16711680 & i) != 0 && ((-16777216) & i) != 0) {
            try {
                return resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static String d(Context context, int i) {
        return String.format(Locale.US, "%s+%d+%d", context.getClass().getSimpleName(), Integer.valueOf(i), Integer.valueOf(Process.myPid()));
    }

    public static Uri e(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static boolean f(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return fAbs <= 1.0E-10f || fAbs <= Math.max(Math.abs(f), Math.abs(f2)) * 1.1920929E-7f;
    }

    public static Uri g() {
        return new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build();
    }

    public static syu h(syu syuVar, Class cls, rvu rvuVar, Executor executor) {
        return swf.i(syuVar, cls, rsx.a(rvuVar), executor);
    }

    public static syu k(syu syuVar, Class cls, sxi sxiVar, Executor executor) {
        return swf.j(syuVar, cls, rsx.c(sxiVar), executor);
    }

    public static syu l(sxh sxhVar, Executor executor) {
        return ske.R(rsx.b(sxhVar), executor);
    }

    public static syu m(syu syuVar, rvu rvuVar, Executor executor) {
        return swz.i(syuVar, rsx.a(rvuVar), executor);
    }

    public static syu n(syu syuVar, sxi sxiVar, Executor executor) {
        return swz.j(syuVar, rsx.c(sxiVar), executor);
    }

    public static void o(syu syuVar, syf syfVar, Executor executor) {
        ske.W(syuVar, rsx.d(syfVar), executor);
    }

    public static void p(Runnable runnable, Executor executor) {
        ske.P(rsx.e(runnable), executor);
    }

    public static void q(rso rsoVar) {
        String strC = rsoVar.c();
        WeakHashMap weakHashMap = rsa.a;
        if (strC.length() > 127) {
            strC = strC.substring(0, 127);
        }
        Trace.beginSection(strC);
    }

    public static void r(rso rsoVar) {
        if (t(rsoVar) || rsoVar.a() == null) {
            Trace.beginSection(rsoVar.d());
            q(rsoVar);
        } else {
            r(rsoVar.a());
            q(rsoVar);
        }
    }

    public static void s(rso rsoVar) {
        if (t(rsoVar) || rsoVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            s(rsoVar.a());
        }
    }

    public static boolean t(rso rsoVar) {
        return rsoVar.e() != Thread.currentThread();
    }

    public static rsf u(String str) {
        return rnt.j(str, rsh.a, false);
    }

    public static String v(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public qsz(byte[] bArr) {
    }
}
