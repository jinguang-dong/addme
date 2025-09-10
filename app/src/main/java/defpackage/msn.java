package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msn extends Handler {
    final /* synthetic */ mso a;

    public msn(mso msoVar) {
        this.a = msoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.a(false, r1.f - 1);
        }
    }
}
