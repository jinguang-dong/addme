package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class daq extends Handler {
    final /* synthetic */ dav a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daq(dav davVar, Looper looper) {
        super(looper);
        this.a = davVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.e();
    }
}
