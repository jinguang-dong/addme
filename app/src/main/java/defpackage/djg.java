package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djg extends ContentObserver {
    final /* synthetic */ azr a;
    final /* synthetic */ ContentResolver b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djg(azr azrVar, ContentResolver contentResolver, Handler handler) {
        super(handler);
        this.a = azrVar;
        this.b = contentResolver;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b(Boolean.valueOf(djh.a(this.b)));
    }
}
