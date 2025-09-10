package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnb extends nnc {
    public final SharedPreferences a;
    public final Object b;

    public nnb(DownloadManager downloadManager, Context context, SharedPreferences sharedPreferences) {
        super(downloadManager, context);
        this.b = new Object();
        this.a = sharedPreferences;
    }

    @Override // defpackage.nnc
    public final Long a(Uri uri) {
        synchronized (this.b) {
            String string = uri.toString();
            SharedPreferences sharedPreferences = this.a;
            if (!sharedPreferences.contains(string)) {
                return null;
            }
            return Long.valueOf(sharedPreferences.getLong(string, 0L));
        }
    }
}
