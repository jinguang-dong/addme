package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyh implements Handler.Callback {
    final /* synthetic */ eyi a;

    public eyh(eyi eyiVar) {
        this.a = eyiVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.a.f((ezx) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        this.a.c.e((ezx) message.obj);
        return false;
    }
}
