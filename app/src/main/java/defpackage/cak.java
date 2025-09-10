package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cak extends ContentObserver {
    final /* synthetic */ uqm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cak(uqm uqmVar, Handler handler) {
        super(handler);
        this.a = uqmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j(ufg.a);
    }
}
