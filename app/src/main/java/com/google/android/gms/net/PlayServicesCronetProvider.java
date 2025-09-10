package com.google.android.gms.net;

import android.content.Context;
import android.os.Trace;
import defpackage.jps;
import defpackage.oed;
import defpackage.oee;
import defpackage.ojl;
import defpackage.okc;
import defpackage.omt;
import defpackage.omv;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private static Class subclassNativeCronetEngine(ClassLoader classLoader) {
        try {
            return classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class);
        } catch (ClassCastException e) {
            throw new IllegalStateException(String.format("Failed to subclass native cronet engine!, NativeCronetEngineBuilderImpl Classloader: %s, ICronetEngineBuilder Classloader: %s", classLoader, ICronetEngineBuilder.class.getClassLoader()), e);
        }
    }

    private void tryToInstallCronetProvider() {
        try {
            omt.b(this.mContext);
        } catch (oed | oee unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        new jps("GMS PlayServicesCronetProvider#createBuilder", 2);
        try {
            try {
                omt.b(this.mContext);
                try {
                    omv omvVar = new omv(this.mContext, 37402, 0.01f);
                    try {
                        okc okcVarA = omt.a();
                        ojl.ay(okcVarA);
                        ClassLoader classLoader = okcVarA.c.getClassLoader();
                        ojl.ay(classLoader);
                        ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) subclassNativeCronetEngine(classLoader).getConstructor(Context.class).newInstance(this.mContext));
                        omvVar.a();
                        omvVar.close();
                        Trace.endSection();
                        return builder;
                    } catch (Throwable th) {
                        try {
                            omvVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ReflectiveOperationException e) {
                    throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
                }
            } catch (oed e2) {
                throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
            } catch (oee e3) {
                throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
            }
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (omt.a) {
            str = omt.b;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return omt.c();
    }
}
