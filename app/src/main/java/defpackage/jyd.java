package defpackage;

import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jyd implements ToLongFunction {
    private final /* synthetic */ int a;

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        if (this.a != 0) {
            return ((fmg) obj).a;
        }
        pdo pdoVarB = ((phc) obj).b();
        pdoVarB.getClass();
        return pdoVarB.b;
    }
}
