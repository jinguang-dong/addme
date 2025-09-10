package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otz extends ContentObserver {
    final /* synthetic */ ouc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otz(ouc oucVar) {
        super(null);
        this.a = oucVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
