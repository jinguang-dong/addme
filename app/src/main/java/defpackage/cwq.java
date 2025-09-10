package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwq extends cwp {
    public cwq() {
    }

    @Override // defpackage.cwp
    public final void h(Object obj) {
        cwp.b("setValue");
        this.h++;
        this.f = obj;
        c(null);
    }

    public final void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.g;
            obj3 = cwp.a;
            this.g = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        Runnable runnable = this.i;
        byi byiVar = op.g().b;
        or orVar = (or) byiVar;
        if (orVar.c == null) {
            synchronized (orVar.a) {
                if (((or) byiVar).c == null) {
                    ((or) byiVar).c = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        orVar.c.post(runnable);
    }

    public cwq(Object obj) {
        super(obj);
    }
}
