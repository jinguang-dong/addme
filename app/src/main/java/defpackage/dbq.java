package defpackage;

import android.content.pm.PackageInfo;
import androidx.wear.ambient.AmbientMode;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbq {
    public static final String a = "/data/misc/profiles/cur/" + cpn.e();

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void b(Executor executor, AmbientMode.AmbientController ambientController, int i, Object obj) {
        executor.execute(new ng(ambientController, i, obj, 4, (byte[]) null));
    }
}
