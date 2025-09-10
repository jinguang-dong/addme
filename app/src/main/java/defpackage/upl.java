package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class upl extends CancellationException implements umw {
    public final transient uol a;

    public upl(String str, uol uolVar) {
        super(str);
        this.a = uolVar;
    }

    @Override // defpackage.umw
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        upl uplVar = new upl(message, this.a);
        uplVar.initCause(this);
        return uplVar;
    }
}
