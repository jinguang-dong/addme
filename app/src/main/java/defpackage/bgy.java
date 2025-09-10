package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy extends bhn {
    public bdw a;
    public int b;
    public int c;

    public bgy(long j, bdw bdwVar) {
        super(j);
        this.a = bdwVar;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new bgy(j, this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        synchronized (bha.a) {
            bhnVar.getClass();
            bgy bgyVar = (bgy) bhnVar;
            this.a = bgyVar.a;
            this.b = bgyVar.b;
            this.c = bgyVar.c;
        }
    }
}
