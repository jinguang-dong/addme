package defpackage;

import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldm implements ToLongFunction {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldm(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        if (this.b != 0) {
            return Math.abs(((fmg) obj).a - this.a);
        }
        sgv sgvVar = ldr.a;
        pdo pdoVarB = ((lau) obj).b();
        pdoVarB.getClass();
        return Math.abs(pdoVarB.b - this.a);
    }
}
