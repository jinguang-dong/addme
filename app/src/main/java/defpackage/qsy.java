package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qsy {
    private static rqi a;

    public qsy() {
    }

    private static IOException a(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException b(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? a(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? a(file, iOException, str) : a(file, iOException, str) : parentFile.canWrite() ? a(file, iOException, str) : a(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? a(file, iOException, str) : a(file, iOException, str) : parentFile.canWrite() ? a(file, iOException, str) : a(file, iOException, str) : a(file, iOException, str);
    }

    public static int e(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static syu f(syu syuVar) {
        return swz.i(syuVar, new rvv(), sxo.a);
    }

    public static void g(reo reoVar, HashMap map) {
        String strA = reoVar.a();
        rnt.F(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        map.put(strA, reoVar);
    }

    public static Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public static String k(String str) {
        return "update.precondition.failures:".concat(str);
    }

    public static synchronized rqi l(Context context) {
        if (a == null) {
            a = new rqi(new qaq((Object) h(context)));
        }
        return a;
    }

    public static Typeface m(Configuration configuration, Typeface typeface) {
        if (configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, clc.D(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static float n(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float o(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static boolean p(float[] fArr) {
        float f = fArr[0];
        for (int i = 1; i < 4; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    public static IOException q(lat latVar, Uri uri, IOException iOException, String str) {
        try {
            rdl rdlVar = new rdl();
            rdlVar.c();
            File file = (File) latVar.m(uri, rdlVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : file.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : file.canRead() ? file.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : file.canWrite() ? b(file, iOException, str) : b(file, iOException, str) : b(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public qsy(byte[] bArr) {
    }

    public qsy(char[] cArr) {
    }
}
