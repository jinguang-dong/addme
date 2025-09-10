package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.R;
import com.google.babelfish.device.avenh.l2l.apps.common.VideoProcessorUtils;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpa {
    public lpa() {
    }

    public static boolean A(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int C(int i) {
        int[] iArrAd = a.ad();
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArrAd[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int D(int i) {
        int[] iArrAn = a.an();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrAn[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    private static final boolean E(int i, onm onmVar, String str, AtomicBoolean atomicBoolean) {
        return q(i - 1, onmVar, str, atomicBoolean);
    }

    public static void a() {
        paw.a(lpa.class, "gcastartup");
    }

    public static rwc b(rwc rwcVar, long j) {
        hle hleVarC = ((hms) ((rwg) rwcVar).a).c(j);
        return hleVarC.d() ? rvk.a : rwc.j(jra.a(hleVarC));
    }

    public static rwc c(rwc rwcVar, long j) {
        hle hleVarC = ((hms) ((rwg) rwcVar).a).c(j);
        return hleVarC.d() ? rvk.a : rwc.j(new jrc(hleVarC.a));
    }

    public static float d(float f) {
        return 1.0f / (((float) Math.exp(-f)) + 1.0f);
    }

    public static int e(pas pasVar, pas pasVar2) {
        int i = pasVar.b;
        int i2 = pasVar2.b;
        int i3 = pasVar.a;
        int iMin = Math.min(i3 / pasVar2.a, i / i2);
        if (iMin > 0) {
            while (iMin > 0) {
                if (f(i3, iMin) && f(i, iMin)) {
                    return iMin;
                }
                iMin--;
            }
        }
        return 1;
    }

    public static boolean f(int i, int i2) {
        return i % (i2 + i2) == 0;
    }

    public static void g(View view, int i, int i2, String str) {
        TextView textView = (TextView) view.findViewById(R.id.disabled_text);
        TextView textView2 = (TextView) view.findViewById(R.id.reset_disabled_text);
        textView.setText(i);
        textView2.setText(i2);
        textView2.setContentDescription(str);
        textView2.setTextColor(ojl.aO(view));
    }

    public static final ByteBuffer h(ByteBuffer byteBuffer, int i, int i2, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
        VideoProcessorUtils.nativeRotateFrame(byteBuffer, i, i2, (360 - i3) % 360, byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    public static int i(int i) {
        return i - 1;
    }

    public static void j(lst lstVar, Bitmap bitmap) {
        lstVar.eh(bitmap);
    }

    public static void k(lss lssVar) {
        lssVar.ac(null);
    }

    public static void l() {
        throw new UnsupportedOperationException("Only used by Burst and Photosphere sessions");
    }

    @Deprecated
    public static syu m() {
        throw new UnsupportedOperationException("Not supported for CaptureSessions unless overridden");
    }

    public static syu n() {
        throw new UnsupportedOperationException("Not supported for CaptureSessions unless overridden");
    }

    public static void o() {
        throw new UnsupportedOperationException("Not supported for CaptureSessions unless overridden");
    }

    public static boolean p(pao paoVar) {
        return paoVar == pao.CLOCKWISE_90 || paoVar == pao.CLOCKWISE_270;
    }

    public static final boolean q(int i, onm onmVar, String str, AtomicBoolean atomicBoolean) {
        if (i <= 0) {
            Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for ".concat(str));
            return false;
        }
        boolean z = atomicBoolean.get() && i > 1;
        omx omxVarR = r(str, onmVar);
        if (omxVarR == null) {
            if (z) {
                return E(i, onmVar, str, atomicBoolean);
            }
            return false;
        }
        String str2 = omxVarR.a;
        if (str2 != null && !str2.isEmpty()) {
            try {
                ojl.R(onmVar.a(str2), TimeUnit.MILLISECONDS);
                Uri uriA = qxc.a(str);
                Map map = qwu.a;
                synchronized (qwu.class) {
                    qwu qwuVar = (qwu) qwu.a.get(uriA);
                    if (qwuVar != null) {
                        qwuVar.b();
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.w("PhenotypeFlagCommitter", a.bw(str, "Committing snapshot for ", " failed, retrying"), e);
                return E(i, onmVar, str, atomicBoolean);
            }
        }
        return true;
    }

    protected static final omx r(String str, onm onmVar) {
        try {
            return (omx) ojl.R(onmVar.m(str, ""), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFlagCommitter", a.bw(str, "Retrieving snapshot for ", " failed"), e);
            return null;
        }
    }

    public static String s(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void t(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        ojl.ar(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }

    public static String u(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    public static PendingIntent v(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    public static String w(File file, String str) {
        int i = oln.a;
        return new File(file, str).getPath();
    }

    public static boolean x(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) ojo.b(context).a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean y() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void z(Context context) {
        try {
            ojl.ay(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public lpa(short[] sArr) {
        new kjc(1);
        new qev(1);
    }

    public static String B(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.bv(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "INTERRUPTED";
            case 15:
                return SHXc.hJcFeFnUsS;
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case ImageFormat.RGBA_FP16 /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
