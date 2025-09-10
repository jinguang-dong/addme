package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbo {
    private static final sgv a = sgv.g("hbo");
    private final Set b;
    private final PackageManager c;

    public hbo(Context context, Set set) {
        this.c = context.getPackageManager();
        this.b = set;
    }

    public final boolean a(String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        int length;
        if (TextUtils.isEmpty(str)) {
            ((sgt) a.c().M(1106)).s("null or empty package name; do not trust");
            return false;
        }
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null) {
                ((sgt) a.c().M(1102)).v("no signatures found for package (%s); do not trust", str);
                return false;
            }
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && (length = signatureArr.length) != 1) {
                ((sgt) a.c().M(1104)).y("%d signatures found for package (%s); do not trust", length, str);
                return false;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(signatureArr[0].toByteArray());
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = pqz.a;
                int length2 = bArrDigest.length;
                char[] cArr2 = new char[length2 + length2];
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    char[] cArr3 = pqz.a;
                    char c = cArr3[(b >> 4) & 15];
                    char c2 = cArr3[b & 15];
                    int i2 = i + i;
                    cArr2[i2] = c;
                    cArr2[i2 + 1] = c2;
                }
                return this.b.contains(new String(cArr2));
            } catch (NoSuchAlgorithmException unused) {
                ((sgt) a.b().M(1103)).v("unable to compute hash using %s; do not trust", "SHA1");
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            ((sgt) a.c().M(1105)).v("package not found (%s); do not trust", str);
            return false;
        }
    }
}
