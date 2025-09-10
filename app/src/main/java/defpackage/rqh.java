package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqh {
    public static final rtl d = new rtl("AppUpdateService");
    private static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public rrc a;
    public final String b;
    public final Context c;
    public final rtl e;

    public rqh(Context context, rtl rtlVar) throws NoSuchAlgorithmException {
        this.b = context.getPackageName();
        this.c = context;
        this.e = rtlVar;
        rtl rtlVar2 = rre.a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                rre.a.f("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    rre.a.f("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    String strV = qsz.v(signature.toByteArray());
                    arrayList.add(strV);
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strV) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strV))) {
                        this.a = new rrc(qsy.h(context), d, f);
                        return;
                    }
                }
                rre.a.f(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", jsv.o(arrayList)), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused) {
                rre.a.f("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            rre.a.f("Play Store package is not found.", new Object[0]);
        }
    }

    public static int a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    public static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 20200);
        return bundle;
    }

    public static oor c() {
        d.d("onError(%d)", -9);
        return ojl.P(new rqm(-9));
    }

    public static HashSet d(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
