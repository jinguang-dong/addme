package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bhm implements bhl {
    private final bff a = new bff();

    @Override // defpackage.bhl
    public /* synthetic */ bhn g(bhn bhnVar, bhn bhnVar2, bhn bhnVar3) {
        return null;
    }

    public final void j(int i) {
        bff bffVar;
        int i2;
        do {
            bffVar = this.a;
            i2 = bffVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bffVar.compareAndSet(i2, i2 | i));
    }

    public final boolean k(int i) {
        return (this.a.get() & i) != 0;
    }
}
