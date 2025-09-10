package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbu {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    private static final String[] c;
    private static final String[] d;

    static {
        c = new String[]{"media", (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        d = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 114(0x72, float:1.6E-43)
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r1) goto L55
            r1 = 119(0x77, float:1.67E-43)
            if (r0 == r1) goto L4b
            r1 = 3653(0xe45, float:5.119E-42)
            if (r0 == r1) goto L41
            r1 = 3786(0xeca, float:5.305E-42)
            if (r0 == r1) goto L37
            r1 = 3805(0xedd, float:5.332E-42)
            if (r0 == r1) goto L2d
            r1 = 113359(0x1bacf, float:1.5885E-40)
            if (r0 == r1) goto L23
            goto L5f
        L23:
            java.lang.String r0 = "rwt"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L2d:
            java.lang.String r0 = "wt"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r5
            goto L60
        L37:
            java.lang.String r0 = "wa"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r4
            goto L60
        L41:
            java.lang.String r0 = "rw"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r3
            goto L60
        L4b:
            java.lang.String r0 = "w"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = r6
            goto L60
        L55:
            java.lang.String r0 = "r"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L5f
            r7 = 0
            goto L60
        L5f:
            r7 = -1
        L60:
            if (r7 == 0) goto L74
            if (r7 == r6) goto L73
            if (r7 == r5) goto L73
            if (r7 == r4) goto L73
            if (r7 == r3) goto L73
            if (r7 != r2) goto L6d
            goto L73
        L6d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L73:
            return r5
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbu.a(java.lang.String):int");
    }

    public static AssetFileDescriptor b(Context context, Uri uri, String str) {
        return c(context, uri, str, rbt.a);
    }

    public static AssetFileDescriptor c(Context context, Uri uri, String str, rbt rbtVar) throws FileNotFoundException {
        ContentResolver contentResolver = context.getContentResolver();
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uri, str);
        }
        if ("content".equals(scheme)) {
            if (!f(context, uri, a(str), rbtVar)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, str);
            g(assetFileDescriptorOpenAssetFileDescriptor);
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, str);
        g(assetFileDescriptorOpenAssetFileDescriptor2);
        try {
            e(context, assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor(), uri, rbtVar);
            return assetFileDescriptorOpenAssetFileDescriptor2;
        } catch (FileNotFoundException e) {
            d(assetFileDescriptorOpenAssetFileDescriptor2, e);
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
            fileNotFoundException.initCause(e2);
            d(assetFileDescriptorOpenAssetFileDescriptor2, fileNotFoundException);
            throw fileNotFoundException;
        }
    }

    public static void d(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r6, android.os.ParcelFileDescriptor r7, android.net.Uri r8, defpackage.rbt r9) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbu.e(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, rbt):void");
    }

    public static boolean f(Context context, Uri uri, int i, rbt rbtVar) {
        int i2;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                rbt rbtVar2 = rbt.a;
                return !rbtVar.c;
            }
        }
        qas qasVar = new qas(uri, providerInfoResolveContentProvider);
        rbt rbtVar3 = rbt.a;
        sbp sbpVar = rbtVar.e;
        int i3 = ((sex) sbpVar).c;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                i2 = 3;
                break;
            }
            int iA = ((rbv) sbpVar.get(i4)).a(context, qasVar, rbtVar.c) - 1;
            i4++;
            if (iA == 0) {
                i2 = 1;
                break;
            }
            if (iA == 1) {
                i2 = 2;
                break;
            }
        }
        int i5 = i2 - 1;
        if (i5 == 0) {
            return true;
        }
        if (i5 == 1) {
            return false;
        }
        if (context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
            return rbtVar.c;
        }
        if (rbtVar.c) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i) != 0 && providerInfoResolveContentProvider.exported) {
            String[] strArr = c;
            int length = strArr.length;
            for (int i6 = 0; i6 < 2; i6++) {
                if (strArr[i6].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = d;
            int length2 = strArr2.length;
            for (int i7 = 0; i7 < 3; i7++) {
                if (strArr2[i7].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = b;
            for (int i8 = 0; i8 < 7; i8++) {
                String str = strArr3[i8];
                if (str.charAt(str.length() - 1) == '.') {
                    if (providerInfoResolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (providerInfoResolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }

    private static String h(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    private static void i(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException, ErrnoException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static File[] j(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
