package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enc implements enb {
    public final enb a;
    private final Handler b;

    public enc(Handler handler, enb enbVar) {
        this.b = handler;
        this.a = enbVar;
    }

    @Override // defpackage.enb
    public final void a() {
        this.b.post(new dzd(this, 7, null));
    }
}
