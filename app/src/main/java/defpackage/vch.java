package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vch {
    private static final String a = "vch";
    private static vcg b;

    private vch() {
    }

    public static vcg a(Context context, vcd vcdVar) {
        vcg vcgVar;
        Bundle bundle;
        synchronized (vch.class) {
            if (b == null) {
                boolean z = true;
                if (vcdVar != vcd.CRONET_SOURCE_PLATFORM && vcdVar != vcd.CRONET_SOURCE_PLAY_SERVICES) {
                    z = false;
                }
                Context applicationContext = context.getApplicationContext();
                synchronized (vci.a) {
                    if (applicationContext != vci.b) {
                        ServiceInfo serviceInfo = null;
                        new jps("CronetManifest#getMetaData fetching info", 3, null);
                        try {
                            try {
                                serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                            } finally {
                            }
                        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                        }
                        vci.c = (serviceInfo == null || serviceInfo.metaData == null) ? new Bundle() : serviceInfo.metaData;
                        vci.b = applicationContext;
                        Trace.endSection();
                    }
                    bundle = vci.c;
                }
                if (bundle.getBoolean("android.net.http.EnableTelemetry", z)) {
                    try {
                        b = new vdo();
                    } catch (Exception e) {
                        Log.e(a, "Exception creating an instance of CronetLoggerImpl", e);
                    }
                }
            }
            if (b == null) {
                b = new vde();
            }
            vcgVar = b;
        }
        return vcgVar;
    }
}
