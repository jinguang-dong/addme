package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcp {
    public static final /* synthetic */ int a = 0;
    private static final rwr b = rwr.c(".");

    public static void a(Uri uri) throws rcu {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (b.f(str).size() == 1 || (c(str) && !TextUtils.equals(str, ".lease"))) {
                if (TextUtils.isEmpty(uri.getQuery())) {
                    return;
                }
                if (uri.getQueryParameterNames().size() != 1 || uri.getQueryParameter("expiryDateSecs") == null) {
                    throw new rcu(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", uri.getQuery()));
                }
                return;
            }
        }
        throw new rcu(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", uri.getPath()));
    }

    public static boolean b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    public static boolean c(String str) {
        return str.endsWith(".lease");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    static byte[] d(String str) {
        slv slvVar;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        smb slwVar = smb.g;
        sma smaVar = (sma) slwVar;
        smb smbVar = smaVar.e;
        if (smbVar == null) {
            slv slvVar2 = smaVar.b;
            if (slvVar2.e()) {
                rnt.M(true ^ slvVar2.d(), "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr = slvVar2.b;
                char[] cArr2 = new char[cArr.length];
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (rup.g(c)) {
                        c ^= 32;
                    }
                    cArr2[i] = (char) c;
                }
                slvVar = new slv(slvVar2.a.concat(uCzt.fjismgp), cArr2);
                if (slvVar2.g) {
                    slvVar = slvVar.c();
                }
            } else {
                slvVar = slvVar2;
            }
            if (slvVar != slvVar2) {
                Character ch = smaVar.c;
                slwVar = new slw(slvVar);
            }
            smaVar.e = slwVar;
            smbVar = slwVar;
        }
        return smbVar.h((CharSequence) b.f(str).get(0));
    }
}
