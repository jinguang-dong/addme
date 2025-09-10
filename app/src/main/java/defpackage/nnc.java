package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class nnc {
    public final DownloadManager c;
    public final Context d;

    public nnc(DownloadManager downloadManager, Context context) {
        this.c = downloadManager;
        this.d = context;
    }

    public abstract Long a(Uri uri);
}
