package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzz extends IOException {
    public final nzx a;

    public nzz(nzx nzxVar) {
        this.a = nzxVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        nzx nzxVar = this.a;
        return super.getMessage() + "; " + String.valueOf(nzxVar);
    }

    public nzz(nzx nzxVar, Throwable th) {
        super(th);
        this.a = nzxVar;
    }

    public nzz() {
        super("UrlRequest cancelled");
        nzw nzwVarA = nzx.a();
        nzwVarA.a = "UrlRequest cancelled";
        this.a = nzwVarA.a();
    }
}
