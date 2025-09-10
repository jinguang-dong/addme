package defpackage;

import com.google.ar.core.Session;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class foy extends fok {
    public final Object b;
    public boolean c;

    public foy(Session session) {
        super(session);
        this.b = new Object();
        this.c = false;
    }

    public final void b() {
        synchronized (this.b) {
            Session session = (Session) this.a;
            session.getClass();
            ezh.m(new foh(session, 3));
            this.c = true;
        }
    }

    public final foi c(fnp fnpVar) {
        return (foi) ezh.k(new foj((fok) this, (Object) fnpVar, 7));
    }

    public final fok d() {
        return (fok) ezh.k(new foq(this, 20));
    }
}
