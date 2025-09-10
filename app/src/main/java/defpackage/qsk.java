package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsk {
    static final rnt c = new rnt();
    public final AtomicReference a = new AtomicReference();
    final AtomicBoolean b = new AtomicBoolean(false);

    qsk() {
    }

    public static qsk a(sbp sbpVar) {
        qsk qskVar;
        int i = 0;
        do {
            if (i >= ((sex) sbpVar).c) {
                break;
            }
            rsi rsiVar = (rsi) sbpVar.get(i);
            Object objD = rsiVar.d(c);
            rsg rsgVarA = objD == null ? rsiVar.c.containsKey(rsi.e) ? rsg.a(2) : rsg.a(3) : new rsg(1, objD);
            qskVar = rsgVarA.b == 1 ? (qsk) rsgVarA.a : null;
            i++;
        } while (qskVar == null);
        return qskVar;
    }
}
