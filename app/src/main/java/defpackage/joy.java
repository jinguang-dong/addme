package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joy implements joe {
    @Override // defpackage.joe
    public final qez a(final FileOutputStream fileOutputStream, int i, syu syuVar, rwc rwcVar, Executor executor) {
        syu syuVarI = swz.i(syuVar, new idb(9), sxo.a);
        try {
            qlx qlxVar = new qlx(executor);
            qlxVar.c(fileOutputStream.getFD());
            qlxVar.b(i);
            pzw pzwVar = new pzw(19);
            Executor executor2 = qlxVar.a;
            qlxVar.b = swz.i(syuVarI, pzwVar, executor2);
            qlxVar.c = swz.i(syuVarI, new pzw(20), executor2);
            qlxVar.d = false;
            qfa qfaVar = new qfa(qlxVar.a());
            final szh szhVar = new szh();
            final syu syuVarB = qfaVar.b();
            syuVarB.c(new Runnable() { // from class: jow
                @Override // java.lang.Runnable
                public final void run() {
                    szh szhVar2 = szhVar;
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    syu syuVar2 = syuVarB;
                    try {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        szhVar2.f(syuVar2);
                    }
                }
            }, sxo.a);
            return new jox(qfaVar, szhVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
