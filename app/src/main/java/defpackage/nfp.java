package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfp implements nfm {
    private final int a;
    private final Object[] b;

    public nfp(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // defpackage.nfm
    public final String a(Resources resources) {
        return resources.getString(this.a, this.b);
    }
}
