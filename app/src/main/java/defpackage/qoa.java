package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qoa {
    public final Executor a;
    public final Set b;
    public final uem c;
    public tpc d;
    public final qvj e;
    private final Executor f;

    public qoa(Executor executor, Set set, qvj qvjVar, uem uemVar) {
        this.a = executor;
        this.e = qvjVar;
        this.f = new szg(executor);
        this.b = set;
        this.c = uemVar;
    }

    public final syu a(final qny qnyVar) {
        return ske.P(new Runnable() { // from class: qnz
            /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
            /* JADX WARN: Type inference failed for: r0v9, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.Set] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 369
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qnz.run():void");
            }
        }, this.f);
    }
}
