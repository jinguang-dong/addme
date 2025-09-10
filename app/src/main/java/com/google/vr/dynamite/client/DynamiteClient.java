package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import dalvik.system.DexClassLoader;
import defpackage.a;
import defpackage.twv;
import defpackage.tww;
import defpackage.twx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DynamiteClient {
    private static final ArrayMap a = new ArrayMap();

    private DynamiteClient() {
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        Context remoteContext = getRemoteContext(context, str, str2);
        if (remoteContext == null) {
            return null;
        }
        return remoteContext.getClassLoader();
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        twx twxVar;
        twxVar = new twx(str, str2);
        try {
        } catch (twv e) {
            Log.e("DynamiteClient", a.bx(twxVar, "Failed to get remote Context", " from remote package:\n  "), e);
            return null;
        }
        return getRemoteLibraryLoaderFromInfo(twxVar).a(context);
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        Context remoteContext = getRemoteContext(context, str, null);
        if (remoteContext == null) {
            return null;
        }
        try {
            return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
        } catch (RuntimeException e) {
            Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
            return null;
        }
    }

    private static synchronized tww getRemoteLibraryLoaderFromInfo(twx twxVar) {
        ArrayMap arrayMap = a;
        tww twwVar = (tww) arrayMap.get(twxVar);
        if (twwVar != null) {
            return twwVar;
        }
        tww twwVar2 = new tww(twxVar);
        arrayMap.put(twxVar, twwVar2);
        return twwVar2;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        twx twxVar = new twx(str, str2);
        tww remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(twxVar);
        try {
            INativeLibraryLoader iNativeLibraryLoaderNewNativeLibraryLoader = remoteLibraryLoaderFromInfo.b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.a(context)), new ObjectWrapper(context));
            if (iNativeLibraryLoaderNewNativeLibraryLoader == null) {
                Log.e("DynamiteClient", a.bx(twxVar, "Failed to load native library ", " from remote package: no loader available."));
                return 0L;
            }
            return iNativeLibraryLoaderNewNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
        } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | twv e) {
            Log.e("DynamiteClient", a.bx(twxVar, "Failed to load native library ", " from remote package:\n  "), e);
            return 0L;
        }
    }

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        twx twxVar = new twx(str, str2);
        tww remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(twxVar);
        try {
            INativeLibraryLoader iNativeLibraryLoaderNewNativeLibraryLoader = remoteLibraryLoaderFromInfo.b(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.a(context)), new ObjectWrapper(context));
            if (iNativeLibraryLoaderNewNativeLibraryLoader == null) {
                Log.e("DynamiteClient", a.bx(twxVar, oUZhwRhE.gYdzWG, " from remote package: no loader available."));
                return -1;
            }
            return iNativeLibraryLoaderNewNativeLibraryLoader.checkVersion(str3);
        } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | twv e) {
            Log.e("DynamiteClient", a.bx(twxVar, "Failed to load native library ", " from remote package:\n  "), e);
            return -1;
        }
    }
}
