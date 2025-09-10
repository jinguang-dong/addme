package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Process;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cpn {
    public cpn() {
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
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static void b(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static cux c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new cux(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    public static cux d(float f, float f2, float f3, float f4) {
        return c(f, f2, cvk.b(f, f3, 0.33333334f), cvk.b(f2, f4, 0.33333334f), cvk.b(f, f3, 0.6666667f), cvk.b(f2, f4, 0.6666667f), f3, f4);
    }

    public static int e() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int f(InputStream inputStream) {
        return (int) i(inputStream, 2);
    }

    public static int g(InputStream inputStream) {
        return (int) i(inputStream, 1);
    }

    public static int h(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static long i(InputStream inputStream, int i) throws IOException {
        byte[] bArrS = s(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrS[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static long j(InputStream inputStream) {
        return i(inputStream, 4);
    }

    public static String k(InputStream inputStream, int i) {
        return new String(s(inputStream, i), StandardCharsets.UTF_8);
    }

    public static void l(OutputStream outputStream, byte[] bArr) throws IOException {
        p(outputStream, bArr.length);
        byte[] bArrR = r(bArr);
        p(outputStream, bArrR.length);
        outputStream.write(bArrR);
    }

    public static void m(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void n(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void o(OutputStream outputStream, int i) throws IOException {
        n(outputStream, i, 2);
    }

    public static void p(OutputStream outputStream, long j) throws IOException {
        n(outputStream, j, 4);
    }

    public static void q(OutputStream outputStream, int i) throws IOException {
        n(outputStream, i, 1);
    }

    public static byte[] r(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] s(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(a.bv(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    public static dws u(Context context) {
        context.getClass();
        return dyj.a(context);
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static boolean w(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "TEMPORARILY_UNMETERED" : "METERED" : "NOT_ROAMING" : "UNMETERED" : "CONNECTED" : "NOT_REQUIRED";
    }

    public static void y(cij cijVar, final String str, final Executor executor, final uif uifVar) {
        executor.getClass();
        final cwq cwqVar = new cwq(dwo.b);
        cgh.k(new cix() { // from class: dwp
            @Override // defpackage.cix
            public final Object a(civ civVar) {
                executor.execute(new dwq(str, uifVar, cwqVar, civVar, 0));
                return ufg.a;
            }
        });
    }

    public cpn(byte[] bArr) {
    }

    public static byte[] t(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException(a.bE(i, "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ", wzgaYJqO.qIuCeNdOGKqB));
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 != i) {
                throw new IllegalStateException(a.bu(i3, i, "Didn't read enough bytes during decompression. expected=", " actual="));
            }
            if (inflater.finished()) {
                return bArr;
            }
            throw new IllegalStateException("Inflater did not finish");
        } finally {
            inflater.end();
        }
    }
}
