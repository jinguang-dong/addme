package defpackage;

import android.content.pm.ProviderInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbq implements tzt {
    private final hbp a;

    public hbq(hbp hbpVar) {
        this.a = hbpVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        String str = ((ProviderInfo) this.a.b).authority;
        str.getClass();
        return str;
    }
}
