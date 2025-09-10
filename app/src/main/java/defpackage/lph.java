package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lph {
    private static final sgv a = sgv.g("lph");
    private static final String[] b = {"13:86:84:D0:65:DB:A8:0B:62:77:7E:2C:E3:5E:08:1A:97:22:BC:0E:43:F1:39:0E:CA:11:DC:20:AA:BE:B2:B5"};
    private final PackageManager c;

    public lph(PackageManager packageManager) {
        this.c = packageManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final boolean a(String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        slv slvVar;
        try {
            PackageInfo packageInfo = this.c.getPackageInfo(str, 134217728);
            MessageDigest messageDigest = MessageDigest.getInstance(YyLACfm.TjBpvAahy);
            String strG = "";
            if (packageInfo.signingInfo == null) {
                ((sgt) a.b().M(4303)).s("Unsigned package");
            } else {
                Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
                if (signingCertificateHistory.length == 0) {
                    ((sgt) a.b().M(4302)).s("Unsigned package");
                } else {
                    byte[] bArrDigest = messageDigest.digest(signingCertificateHistory[0].toByteArray());
                    smb smbVar = smb.g;
                    smb slwVar = ((sma) smbVar).d;
                    if (slwVar == null) {
                        slv slvVar2 = ((sma) smbVar).b;
                        if (slvVar2.d()) {
                            rnt.M(!slvVar2.e(), "Cannot call upperCase() on a mixed-case alphabet");
                            char[] cArr = slvVar2.b;
                            char[] cArr2 = new char[cArr.length];
                            for (int i = 0; i < cArr.length; i++) {
                                char c = cArr[i];
                                if (rup.f(c)) {
                                    c ^= 32;
                                }
                                cArr2[i] = (char) c;
                            }
                            slvVar = new slv(slvVar2.a.concat(".upperCase()"), cArr2);
                            if (slvVar2.g) {
                                slvVar = slvVar.c();
                            }
                        } else {
                            slvVar = slvVar2;
                        }
                        if (slvVar == slvVar2) {
                            slwVar = smbVar;
                        } else {
                            Character ch = ((sma) smbVar).c;
                            slwVar = new slw(slvVar);
                        }
                        ((sma) smbVar).d = slwVar;
                    }
                    for (int i2 = 0; i2 <= 0; i2++) {
                        rnt.F(!((sma) slwVar).b.g(":".charAt(i2)), "Separator (%s) cannot contain alphabet characters", ":");
                    }
                    Character ch2 = ((sma) slwVar).c;
                    if (ch2 != null) {
                        ch2.charValue();
                        rnt.F(true, "Separator (%s) cannot contain padding character", ":");
                    }
                    strG = new slz(slwVar).g(bArrDigest);
                }
            }
            String[] strArr = b;
            for (int i3 = 0; i3 <= 0; i3++) {
                if (strArr[i3].equals(strG)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 4305)).v("Error validating package %s", str);
        }
        ((sgt) a.b().M(4306)).v("Validation failed for %s", str);
        return false;
    }
}
