package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Trace;
import android.os.ext.SdkExtensions;
import defpackage.jps;
import defpackage.vbf;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HttpEngineNativeProvider extends CronetProvider {
    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public final CronetEngine.Builder createBuilder() {
        new jps("HttpEngineNativeProvider#createBuilder", 3, null);
        try {
            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(new vbf(new HttpEngine.Builder(this.mContext)));
            Trace.endSection();
            return builder;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public final String getName() {
        return "HttpEngine-Native-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public final String getVersion() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.CronetProvider
    public final boolean isEnabled() {
        return SdkExtensions.getExtensionVersion(31) >= 7;
    }
}
