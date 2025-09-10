package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obw extends oao {
    protected String a;
    protected String c;
    protected boolean d;
    protected int e;
    public boolean f;
    public boolean g;

    public obw(oar oarVar) {
        super(oarVar);
    }

    @Override // defpackage.oao
    protected final void a() throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context contextD = d();
        try {
            applicationInfo = contextD.getPackageManager().getApplicationInfo(contextD.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            u("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0) {
            oar oarVar = this.b;
            obi obiVarI = nwj.i(i, new obu(oarVar), new oan(oarVar));
            if (obiVarI != null) {
                q("Loading global XML config values");
                String str = obiVarI.a;
                if (str != null) {
                    this.c = str;
                    m("XML config - app name", str);
                }
                String str2 = obiVarI.b;
                if (str2 != null) {
                    this.a = str2;
                    m("XML config - app version", str2);
                }
                String str3 = obiVarI.c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if ("verbose".equals(lowerCase)) {
                        i2 = 0;
                    } else if ("info".equals(lowerCase)) {
                        i2 = 1;
                    } else if ("warning".equals(lowerCase)) {
                        i2 = 2;
                    } else if ("error".equals(lowerCase)) {
                        i2 = 3;
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        r("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = obiVarI.d;
                if (i3 >= 0) {
                    this.e = i3;
                    this.d = true;
                    m("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = obiVarI.e;
                if (i4 != -1) {
                    if (1 == i4) {
                        z = true;
                    }
                    this.g = z;
                    this.f = true;
                    m(HHdu.dDiMDj, Boolean.valueOf(z));
                }
            }
        }
    }
}
