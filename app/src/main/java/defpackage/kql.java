package defpackage;

import java.util.function.ToDoubleFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kql implements ToDoubleFunction {
    private final /* synthetic */ int a;

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? ((Float) obj).doubleValue() : kqn.a((pjo) obj) : kqn.b((pjo) obj) : ((Float) obj).doubleValue();
    }
}
