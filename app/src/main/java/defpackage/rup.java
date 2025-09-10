package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import j$.time.Duration;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public /* synthetic */ class rup {
    public static rup a;

    public rup() {
    }

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "SHUTTING_DOWN" : "PAUSED" : "RUNNING" : "INITIALIZED";
    }

    public static void b(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    public static void c(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (g(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (g(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int iY;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iY = y(cCharAt)) >= 26 || iY != y(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean g(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void h(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static byte[] i(File file) {
        file.getClass();
        return smm.a(file);
    }

    public static /* synthetic */ int j(byte b) {
        return b & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public static void k(qat qatVar, Set set) {
        for (Integer num : qatVar.b) {
            num.intValue();
            set.add(num);
        }
    }

    public static txk l(fnp fnpVar) {
        fnp fnpVarH = fnpVar.h();
        txk txkVar = new txk(txk.a);
        fnpVarH.o(txkVar.b);
        return txkVar;
    }

    public static txl m(float[] fArr) {
        a.I(fArr.length == 4);
        return new txl(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static txn n(fnp fnpVar) {
        return o(fnpVar.j());
    }

    public static txn o(float[] fArr) {
        a.I(fArr.length == 3);
        return new txn(fArr[0], fArr[1], fArr[2]);
    }

    public static List p(txk txkVar) {
        float[] fArr = new float[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                fArr[(i * 4) + i2] = txkVar.b[(i2 * 4) + i];
            }
        }
        return ske.al(fArr);
    }

    public static Runnable q(Object obj, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        tdg tdgVar = tdg.a;
        if (!tdgVar.b()) {
            return new dxr(null, 4);
        }
        tdgVar.a(j);
        return new dxr(tdgVar.c.register(obj, new tdj(j, tdgVar)), 4);
    }

    public static YuvReadView r(YuvImage yuvImage) {
        return new tde(new YuvReadView(GcamModuleJNI.YuvImage_cref(yuvImage.a, yuvImage)), yuvImage);
    }

    public static YuvReadView s(YuvWriteView yuvWriteView) {
        return new tde(new YuvReadView(GcamModuleJNI.YuvWriteView_cref(yuvWriteView.b, yuvWriteView)), yuvWriteView);
    }

    public static YuvWriteView t(YuvImage yuvImage) {
        return new tdf(new YuvWriteView(GcamModuleJNI.YuvImage_ref(yuvImage.a, yuvImage)), yuvImage);
    }

    public static String u(Object... objArr) {
        return String.format(Locale.ROOT, "ConsentVerifierLibraryThread-%d", objArr);
    }

    public static long v(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static byte[] w(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static /* synthetic */ boolean x(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    private static int y(char c) {
        return (char) ((c | ' ') - 97);
    }

    public rup(byte[] bArr) {
    }
}
