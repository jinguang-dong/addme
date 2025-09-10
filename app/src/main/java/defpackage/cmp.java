package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class cmp {
    public boolean a;
    public boolean b;
    public due c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            due dueVar = this.c;
            if (dueVar != null) {
                try {
                    dueVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
