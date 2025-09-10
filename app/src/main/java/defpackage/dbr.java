package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dbr {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static int a(int i) {
        return (i + 7) & (-8);
    }

    public static String b(String str, String str2, byte[] bArr) {
        String strA = dbu.a(bArr);
        if (str.length() <= 0) {
            return i(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return i(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + dbu.a(bArr) + str2;
    }

    public static void c(OutputStream outputStream, dbo dboVar) throws IOException {
        int[] iArr = dboVar.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            Integer numValueOf = Integer.valueOf(i3);
            numValueOf.getClass();
            cpn.o(outputStream, i3 - i2);
            numValueOf.getClass();
            i++;
            i2 = i3;
        }
    }

    public static void d(OutputStream outputStream, dbo dboVar) throws IOException {
        int i = 0;
        for (Map.Entry entry : dboVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                cpn.o(outputStream, iIntValue - i);
                cpn.o(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static byte[] e(dbo[] dboVarArr, byte[] bArr) throws IOException {
        int length;
        int i = 0;
        int i2 = 0;
        int iH = 0;
        while (true) {
            length = dboVarArr.length;
            if (i2 >= length) {
                break;
            }
            dbo dboVar = dboVarArr[i2];
            int iH2 = cpn.h(b(dboVar.a, dboVar.b, bArr)) + 16;
            int i3 = dboVar.e;
            iH += iH2 + i3 + i3 + dboVar.f + h(dboVar.g);
            i2++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iH);
        if (Arrays.equals(bArr, dbu.c)) {
            while (i < length) {
                dbo dboVar2 = dboVarArr[i];
                l(byteArrayOutputStream, dboVar2, b(dboVar2.a, dboVar2.b, bArr));
                k(byteArrayOutputStream, dboVar2);
                i++;
            }
        } else {
            for (dbo dboVar3 : dboVarArr) {
                l(byteArrayOutputStream, dboVar3, b(dboVar3.a, dboVar3.b, bArr));
            }
            int length2 = dboVarArr.length;
            while (i < length2) {
                k(byteArrayOutputStream, dboVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iH) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iH);
    }

    public static byte[] f(InputStream inputStream, byte[] bArr) {
        if (!Arrays.equals(bArr, cpn.s(inputStream, 4))) {
            throw new IllegalStateException("Invalid magic");
        }
        int i = dbu.h;
        return cpn.s(inputStream, 4);
    }

    public static int[] g(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iF = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iF += cpn.f(inputStream);
            iArr[i2] = iF;
        }
        return iArr;
    }

    private static int h(int i) {
        return a(i + i) / 8;
    }

    private static void j(byte[] bArr, int i, int i2, dbo dboVar) {
        int i3 = dboVar.g;
        if (i != 2) {
            if (i != 4) {
                throw new IllegalStateException(a.bv(i, "Unexpected flag: "));
            }
            i2 += i3;
        }
        int i4 = i2 / 8;
        bArr[i4] = (byte) ((1 << (i2 % 8)) | bArr[i4]);
    }

    private static void k(OutputStream outputStream, dbo dboVar) throws IOException {
        d(outputStream, dboVar);
        c(outputStream, dboVar);
        byte[] bArr = new byte[h(dboVar.g)];
        for (Map.Entry entry : dboVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                j(bArr, 2, iIntValue, dboVar);
            }
            if ((iIntValue2 & 4) != 0) {
                j(bArr, 4, iIntValue, dboVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void l(OutputStream outputStream, dbo dboVar, String str) throws IOException {
        cpn.o(outputStream, cpn.h(str));
        cpn.o(outputStream, dboVar.e);
        cpn.p(outputStream, dboVar.f);
        cpn.p(outputStream, dboVar.c);
        cpn.p(outputStream, dboVar.g);
        cpn.m(outputStream, str);
    }

    private static String i(String str, String str2) {
        boolean zEquals = "!".equals(str2);
        String str3 = CZAHo.bHlRhmn;
        return zEquals ? str.replace(str3, "!") : str3.equals(str2) ? str.replace("!", str3) : str;
    }
}
