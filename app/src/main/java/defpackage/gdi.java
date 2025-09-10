package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdi implements paq {
    private HandlerThread a;
    private Handler b;
    private oup c;
    private boolean d = false;
    private final Object e = new Object();
    private final cxb f;

    public gdi(cxb cxbVar) {
        this.f = cxbVar;
    }

    private final void c() {
        synchronized (this.e) {
            if (this.d) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("CamcorderCameraHandler");
            this.a = handlerThread;
            handlerThread.start();
            this.b = new Handler(this.a.getLooper());
            this.c = new oup(this.b);
            this.f.w(gdo.CAPTURE_SESSION).d(this);
            this.d = true;
        }
    }

    public final Handler a() {
        c();
        Handler handler = this.b;
        handler.getClass();
        return handler;
    }

    public final oup b() {
        c();
        oup oupVar = this.c;
        oupVar.getClass();
        return oupVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.d) {
                HandlerThread handlerThread = this.a;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = false;
            }
        }
    }
}
