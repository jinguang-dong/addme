package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oaw extends oao {
    private final oae a;

    public oaw(oar oarVar) {
        super(oarVar);
        this.a = new oae();
    }

    @Override // defpackage.oao
    protected final void a() {
        oak oakVarE = e();
        if (oakVarE.d == null) {
            synchronized (oakVarE) {
                if (oakVarE.d == null) {
                    oae oaeVar = new oae();
                    Context context = oakVarE.b;
                    PackageManager packageManager = context.getPackageManager();
                    String packageName = context.getPackageName();
                    oaeVar.c = packageName;
                    oaeVar.d = packageManager.getInstallerPackageName(packageName);
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("GAv4", mn.g(packageName, "Error retrieving package info: appName set to "));
                    }
                    oaeVar.a = packageName;
                    oaeVar.b = str;
                    oakVarE.d = oaeVar;
                }
            }
        }
        oae oaeVar2 = this.a;
        oae oaeVar3 = oakVarE.d;
        if (!TextUtils.isEmpty(oaeVar3.a)) {
            oaeVar2.a = oaeVar3.a;
        }
        if (!TextUtils.isEmpty(oaeVar3.b)) {
            oaeVar2.b = oaeVar3.b;
        }
        if (!TextUtils.isEmpty(oaeVar3.c)) {
            oaeVar2.c = oaeVar3.c;
        }
        if (!TextUtils.isEmpty(oaeVar3.d)) {
            oaeVar2.d = oaeVar3.d;
        }
        obw obwVarK = k();
        obwVarK.z();
        String str2 = obwVarK.c;
        if (str2 != null) {
            oaeVar2.a = str2;
        }
        obwVarK.z();
        String str3 = obwVarK.a;
        if (str3 != null) {
            oaeVar2.b = str3;
        }
    }
}
