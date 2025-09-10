package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izb {
    public static final /* synthetic */ int a = 0;
    private static final Executor b = frp.a;
    private final szh c = new szh();
    private boolean d = false;

    public final synchronized syu a() {
        return this.c;
    }

    public final synchronized void b(Context context) {
        if (this.d) {
            return;
        }
        this.d = true;
        iza izaVar = new iza(context);
        szh szhVar = this.c;
        iyy iyyVar = new iyy(0);
        Executor executor = b;
        szhVar.f(swz.i(ske.I(sbp.p(ske.P(iyyVar, executor), ske.P(new iyz(izaVar, 0), executor), ske.P(new iyz(izaVar, 2), executor), ske.P(new iyz(izaVar, 3), executor), ske.P(new iyy(2), executor))), new hia(12), sxo.a));
    }
}
