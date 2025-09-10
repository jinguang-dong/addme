package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ppx {
    DCIM,
    PICTURES,
    MOVIES,
    APP_DATA,
    APP_CACHE;

    public final File a(Context context) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        }
        if (iOrdinal == 1) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        }
        if (iOrdinal == 2) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        }
        if (iOrdinal == 3) {
            return context.getFilesDir();
        }
        if (iOrdinal == 4) {
            return context.getCacheDir();
        }
        throw new RuntimeException(null, null);
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2;
    }

    public final boolean c(String str) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return prh.z(str) || prh.A(str);
        }
        if (iOrdinal == 1) {
            return prh.z(str);
        }
        if (iOrdinal == 2) {
            return prh.A(str);
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return true;
        }
        throw new RuntimeException(null, null);
    }
}
