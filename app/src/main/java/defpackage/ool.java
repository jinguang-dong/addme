package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ool implements oos {
    public final Object a = new Object();
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public ool(Executor executor, Object obj, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.oos
    public final void a(oor oorVar) {
        int i = this.d;
        if (i == 0) {
            synchronized (this.a) {
            }
            this.c.execute(new lor(this, oorVar, 16, (byte[]) null));
            return;
        }
        if (i == 1) {
            if (((oow) oorVar).c) {
                synchronized (this.a) {
                }
                this.c.execute(new ooc(this, 2, null));
                return;
            }
            return;
        }
        if (i != 2) {
            if (oorVar.f()) {
                synchronized (this.a) {
                }
                this.c.execute(new lor(this, oorVar, 18, (byte[]) null));
                return;
            }
            return;
        }
        if (oorVar.f() || ((oow) oorVar).c) {
            return;
        }
        synchronized (this.a) {
        }
        this.c.execute(new lor(this, oorVar, 17, (byte[]) null));
    }
}
