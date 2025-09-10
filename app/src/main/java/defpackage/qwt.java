package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwt extends ContentObserver {
    final /* synthetic */ qwu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwt(qwu qwuVar) {
        super(null);
        this.a = qwuVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b();
    }
}
