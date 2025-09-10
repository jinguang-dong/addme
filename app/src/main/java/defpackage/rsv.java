package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsv implements syf {
    final /* synthetic */ rso a;
    final /* synthetic */ syf b;

    public rsv(rso rsoVar, syf syfVar) {
        this.a = rsoVar;
        this.b = syfVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        th.getClass();
        rso rsoVarC = rsa.c(rsa.a(), this.a);
        try {
            this.b.a(th);
        } finally {
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        rso rsoVarC = rsa.c(rsa.a(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }
}
