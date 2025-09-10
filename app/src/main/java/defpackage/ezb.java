package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ezb implements far {
    final /* synthetic */ Context a;

    public ezb(Context context) {
        this.a = context;
    }

    @Override // defpackage.far
    public final /* bridge */ /* synthetic */ Object a() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
