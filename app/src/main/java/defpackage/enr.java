package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enr {
    public final enq a;
    private final Handler b;

    public enr(Handler handler) {
        this.a = new eno();
        this.b = handler;
    }

    public void a(int i) {
        this.b.post(new cmu(this, i, 4));
    }

    public void b(RuntimeException runtimeException, String str, int i, int i2) {
        this.b.post(new enp(this, runtimeException, str, i, i2));
    }

    public void c(RuntimeException runtimeException) {
        this.b.post(new eao((Object) this, (Object) runtimeException, 15, (byte[]) null));
    }

    public enr(enq enqVar, Handler handler) {
        this.b = handler;
        this.a = enqVar;
    }
}
