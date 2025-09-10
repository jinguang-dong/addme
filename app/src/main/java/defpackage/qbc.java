package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbc {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static MessageDigest b() throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest != null) {
                return messageDigest;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static void c(lat latVar, pva pvaVar, Uri uri, String str) throws pul {
        long jK;
        try {
            if (!latVar.r(uri)) {
                qbu.e("%s: Downloaded file %s is not present at %s", "FileValidator", qsp.ab(pvaVar), uri);
                tfm tfmVarA = pul.a();
                tfmVarA.b = puk.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw tfmVarA.c();
            }
            int iAq = a.aq(pvaVar.f);
            if (iAq != 0 && iAq == 2) {
                return;
            }
            if (d(latVar, uri, str)) {
                return;
            }
            try {
                jK = latVar.k(uri);
            } catch (IOException unused) {
                jK = -1;
            }
            qbu.e("%s: Downloaded file at uri = %s, checksum = %s, size = %s verification failed", "FileValidator", uri, str, Long.valueOf(jK));
            tfm tfmVarA2 = pul.a();
            tfmVarA2.b = puk.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw tfmVarA2.c();
        } catch (IOException e) {
            qbu.g(e, "%s: Failed to validate download file %s", "FileValidator", qsp.ab(pvaVar));
            tfm tfmVarA3 = pul.a();
            tfmVarA3.b = puk.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            tfmVarA3.d = e;
            throw tfmVarA3.c();
        }
    }

    public static boolean d(lat latVar, Uri uri, String str) throws IOException {
        String strA;
        String str2 = "";
        try {
            InputStream inputStream = (InputStream) latVar.m(uri, new rdn());
            try {
                MessageDigest messageDigestB = b();
                if (messageDigestB == null) {
                    strA = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        messageDigestB.update(bArr, 0, i);
                    }
                    strA = a(messageDigestB.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                str2 = strA;
            } finally {
            }
        } catch (IOException unused) {
            qbu.d("%s: Failed to open file, uri = %s", "FileValidator", uri);
        }
        return str2.equals(str);
    }
}
