package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cne implements Runnable {
    private final Callable a;
    private final cnh b;
    private final Handler c;

    public cne(Handler handler, Callable callable, cnh cnhVar) {
        this.a = callable;
        this.b = cnhVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qev qevVarCall;
        try {
            qevVarCall = ((cmz) this.a).call();
        } catch (Exception unused) {
            qevVarCall = null;
        }
        this.c.post(new at(this.b, qevVarCall, 13, (char[]) null));
    }
}
