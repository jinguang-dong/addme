package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okc {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static okd l;
    private static oke m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new oju();
    private static final ojz k = new ojv();
    public static final okb a = new ojw(1);
    public static final okb b = new ojw(0);

    private okc(Context context) {
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [android.database.Cursor, java.lang.Object] */
    public static int a(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int i2;
        ojr ojpVar;
        ?? r1;
        try {
            synchronized (okc.class) {
                Boolean bool = d;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                e(classLoader);
                            } catch (ojy unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!g(context)) {
                                return 0;
                            }
                            if (f || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iD = d(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader classLoaderA = ojt.a();
                                        if (classLoaderA == null) {
                                            String str3 = e;
                                            ojl.ay(str3);
                                            classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                        }
                                        e(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        d = Boolean.TRUE;
                                        return iD;
                                    }
                                    return iD;
                                } catch (ojy unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (ojy e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                okd okdVarH = h(context);
                try {
                    if (okdVarH == null) {
                        return 0;
                    }
                    try {
                        int iE = okdVarH.e();
                        if (iE >= 3) {
                            scf scfVar = (scf) i.get();
                            if (scfVar != null && (r1 = scfVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            ojq ojqVar = new ojq(context);
                            long jLongValue = ((Long) j.get()).longValue();
                            Parcel parcelA = okdVarH.a();
                            fbj.d(parcelA, ojqVar);
                            parcelA.writeString(str);
                            parcelA.writeInt(z ? 1 : 0);
                            parcelA.writeLong(jLongValue);
                            Parcel parcelZ = okdVarH.z(7, parcelA);
                            IBinder strongBinder = parcelZ.readStrongBinder();
                            if (strongBinder == null) {
                                ojpVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                ojpVar = iInterfaceQueryLocalInterface instanceof ojr ? (ojr) iInterfaceQueryLocalInterface : new ojp(strongBinder);
                            }
                            parcelZ.recycle();
                            Cursor cursor = (Cursor) ojq.b(ojpVar);
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        i2 = cursor.getInt(0);
                                        cursor = (i2 <= 0 || !f(cursor)) ? cursor : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (iE == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ojq ojqVar2 = new ojq(context);
                            Parcel parcelA2 = okdVarH.a();
                            fbj.d(parcelA2, ojqVar2);
                            parcelA2.writeString(str);
                            parcelA2.writeInt(z ? 1 : 0);
                            Parcel parcelZ2 = okdVarH.z(5, parcelA2);
                            i2 = parcelZ2.readInt();
                            parcelZ2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ojq ojqVar3 = new ojq(context);
                            Parcel parcelA3 = okdVarH.a();
                            fbj.d(parcelA3, ojqVar3);
                            parcelA3.writeString(str);
                            parcelA3.writeInt(z ? 1 : 0);
                            Parcel parcelZ3 = okdVarH.z(3, parcelA3);
                            i2 = parcelZ3.readInt();
                            parcelZ3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            lpa.z(context);
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #7 {all -> 0x004d, blocks: (B:9:0x0044, B:17:0x0055, B:20:0x005b, B:32:0x007a), top: B:213:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.okc b(android.content.Context r21, defpackage.okb r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.b(android.content.Context, okb, java.lang.String):okc");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124 A[PHI: r13
      0x0124: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:59:0x00ec, B:74:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int d(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.d(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void e(ClassLoader classLoader) throws ojy {
        try {
            oke okeVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                okeVar = iInterfaceQueryLocalInterface instanceof oke ? (oke) iInterfaceQueryLocalInterface : new oke(iBinder);
            }
            m = okeVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new ojy("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean f(Cursor cursor) {
        scf scfVar = (scf) i.get();
        if (scfVar == null || scfVar.a != null) {
            return false;
        }
        scfVar.a = cursor;
        return true;
    }

    private static boolean g(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (odo.d.f(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            h = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static okd h(Context context) {
        okd okdVar;
        synchronized (okc.class) {
            okd okdVar2 = l;
            if (okdVar2 != null) {
                return okdVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    okdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    okdVar = iInterfaceQueryLocalInterface instanceof okd ? (okd) iInterfaceQueryLocalInterface : new okd(iBinder);
                }
                if (okdVar != null) {
                    l = okdVar;
                    return okdVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c() throws ojy {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new ojy("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
