package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tqj implements tqp {
    private final tqp[] a;

    public tqj(tqp... tqpVarArr) {
        this.a = tqpVarArr;
    }

    @Override // defpackage.tqp
    public final tqo a(Class cls) {
        for (int i = 0; i < 2; i++) {
            tqp tqpVar = this.a[i];
            if (tqpVar.b(cls)) {
                return tqpVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.tqp
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
