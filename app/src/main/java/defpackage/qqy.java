package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qqy {
    private final rwu c;
    private volatile Process d;
    public volatile boolean b = false;
    public final rvu a = new qcj(this, 4);

    public qqy(rxc rxcVar) {
        this.c = new rwu(rxcVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            rwu rwuVar = this.c;
            if (!rwuVar.a || rwuVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                rwuVar.d();
                rwuVar.e();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
