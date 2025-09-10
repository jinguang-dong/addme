package defpackage;

import android.content.Context;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwq {
    private final Supplier a;

    public lwq(Context context) {
        lbs lbsVar = new lbs(context, 2);
        this.a = lbsVar;
        ((Long) lbsVar.get()).longValue();
    }

    public final long a() {
        return ((Long) this.a.get()).longValue();
    }

    public final boolean b() {
        return a() >= 107703678;
    }

    public final String toString() {
        return "sideline-version=" + a();
    }
}
