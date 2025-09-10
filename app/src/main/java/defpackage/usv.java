package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class usv implements unt {
    public final usx a;
    public final long b;
    public final Object c;
    public final uhb d;

    public usv(usx usxVar, long j, Object obj, uhb uhbVar) {
        this.a = usxVar;
        this.b = j;
        this.c = obj;
        this.d = uhbVar;
    }

    @Override // defpackage.unt
    public final void fL() {
        usx usxVar = this.a;
        synchronized (usxVar) {
            long j = this.b;
            if (j < usxVar.e()) {
                return;
            }
            Object[] objArr = usxVar.a;
            objArr.getClass();
            if (usy.a(objArr, j) == this) {
                usy.b(objArr, j, usy.a);
                usxVar.i();
            }
        }
    }
}
