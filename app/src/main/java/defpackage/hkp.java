package defpackage;

import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hkp implements ToIntFunction {
    private final /* synthetic */ int a;

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        int i = this.a;
        if (i == 0) {
            return 100 - ((pnu) obj).b;
        }
        if (i == 1) {
            return 100 - ((pnu) obj).b;
        }
        if (i == 2) {
            return ((Integer) obj).intValue();
        }
        ((lre) obj).h();
        return 3;
    }
}
