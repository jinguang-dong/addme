package defpackage;

import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ire implements Callable {
    private final /* synthetic */ int a;

    public /* synthetic */ ire(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Boolean bool = true;
        if (i == 0) {
            sgv sgvVar = irk.a;
            return bool;
        }
        if (i != 1) {
            bool = null;
            if (i != 5) {
                if (i == 6) {
                    int i2 = nzv.j;
                    return null;
                }
                switch (i) {
                    case 15:
                        boolean z = pzr.a;
                        break;
                    case 16:
                        boolean z2 = pzr.a;
                        break;
                    case 17:
                        boolean z3 = pzr.a;
                        break;
                    case 18:
                        boolean z4 = pzr.a;
                        break;
                }
                return null;
            }
            Pattern pattern = nzo.a;
        }
        return bool;
    }
}
