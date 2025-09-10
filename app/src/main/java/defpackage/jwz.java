package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jwz extends Handler {
    final /* synthetic */ jxa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwz(jxa jxaVar, Looper looper) {
        super(looper);
        this.a = jxaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jej jejVar;
        int i = message.what;
        if (i == 1) {
            jej jejVar2 = this.a.r;
            if (jejVar2 != null) {
                jejVar2.onSurfaceCreated(null, null);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (jejVar = this.a.r) != null) {
                jejVar.b();
                return;
            }
            return;
        }
        int i2 = message.arg1;
        int i3 = message.arg2;
        jxa jxaVar = this.a;
        jej jejVar3 = jxaVar.r;
        if (jejVar3 == null || jxaVar.s == null) {
            return;
        }
        jejVar3.onSurfaceChanged(null, message.arg1, message.arg2);
        jxaVar.r.b();
        jxaVar.s.e();
    }
}
