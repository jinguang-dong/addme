package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class clv extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private final Object d;
    private final int e;
    private String f;
    private ejs g;

    public clv() {
        this(0);
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    private final ejs b() {
        ejs ejsVar;
        synchronized (this.d) {
            coe.f(this.f, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.g == null) {
                this.g = c(getContext(), this.f, this.e);
            }
            ejsVar = this.g;
        }
        return ejsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.ejs c(android.content.Context r10, java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clv.c(android.content.Context, java.lang.String, int):ejs");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().s(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) throws IOException {
        File fileS = b().s(uri);
        int iLastIndexOf = fileS.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileS.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IOException {
        int i;
        File fileS = b().s(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                i = i2 + 1;
                strArr3[i2] = "_display_name";
                objArr[i2] = queryParameter == null ? fileS.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                i = i2 + 1;
                strArr3[i2] = "_size";
                objArr[i2] = Long.valueOf(fileS.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected clv(int i) {
        this.d = new Object();
        this.e = i;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                if (providerInfo.authority != null && !providerInfo.authority.trim().isEmpty()) {
                    String str = providerInfo.authority.split(";")[0];
                    synchronized (this.d) {
                        this.f = str;
                    }
                    HashMap map = c;
                    synchronized (map) {
                        map.remove(str);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException(oUZhwRhE.vFwJKRlAfSSo);
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        int i;
        File fileS = b().s(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!uCzt.DGyhfri.equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(fileS, i);
    }
}
