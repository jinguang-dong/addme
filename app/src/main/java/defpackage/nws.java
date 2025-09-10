package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nws extends ContentObserver {
    final /* synthetic */ nwt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nws(nwt nwtVar, Handler handler) {
        super(handler);
        this.a = nwtVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        nwt nwtVar = this.a;
        nwtVar.e = nwt.g(nwtVar.c.getContext());
    }
}
