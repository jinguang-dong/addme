package defpackage;

import android.graphics.Rect;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gud implements IntFunction {
    private final /* synthetic */ int a;

    public /* synthetic */ gud(int i) {
        this.a = i;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? new pnu[i] : new poa[i] : new Rect[i];
    }
}
