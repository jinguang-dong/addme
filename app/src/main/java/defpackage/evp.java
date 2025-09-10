package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evp implements evh, evq {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public evp(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.evq
    public final eqv a(Uri uri) {
        int i = this.b;
        return i != 0 ? i != 1 ? new erl(this.a, uri) : new eqr(this.a, uri) : new erd(this.a, uri);
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new evr(this) : new evr(this) : new evr(this);
    }
}
