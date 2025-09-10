package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rbq extends rbv {
    final /* synthetic */ String a;

    public rbq(String str) {
        this.a = str;
    }

    @Override // defpackage.rbv
    protected final int a(Context context, qas qasVar, boolean z) {
        ProviderInfo providerInfo = (ProviderInfo) qasVar.b;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return !this.a.equals(providerInfo.packageName) ? 3 : 1;
    }
}
