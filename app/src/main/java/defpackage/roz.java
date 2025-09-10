package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class roz implements Handler.Callback {
    final /* synthetic */ rpb a;

    public roz(rpb rpbVar) {
        this.a = rpbVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        rpb rpbVar = this.a;
        rpa rpaVar = (rpa) message.obj;
        synchronized (rpbVar.a) {
            if (rpbVar.c == rpaVar || rpbVar.d == rpaVar) {
                rpbVar.d(rpaVar, 2);
            }
        }
        return true;
    }
}
