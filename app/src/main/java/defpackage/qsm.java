package defpackage;

import com.google.ar.core.ImageMetadata;
import java.lang.Thread;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsm extends qsp implements qqs {
    public final qqp a;

    static {
        new LinkedHashSet();
    }

    public qsm(qqq qqqVar, tzj tzjVar, Executor executor) {
        super((byte[]) null);
        this.a = qqqVar.a(executor, tzjVar, null);
    }

    @Override // defpackage.qqs
    public final void cA() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qsl
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                qsm qsmVar = this.a;
                try {
                    try {
                        rtl rtlVarB = rrv.b(th);
                        if (rtlVarB != null) {
                            Object obj = rtlVarB.a;
                            qsk qskVarA = qsk.a(((rsr) obj).b);
                            if (qskVarA != null && ((qsj) qskVarA.a.get()) != null && !qskVarA.b.get()) {
                                UUID uuid = ((rsr) obj).c;
                                long mostSignificantBits = (uuid.getMostSignificantBits() ^ uuid.getLeastSignificantBits()) & Long.MAX_VALUE;
                                if (mostSignificantBits == 0) {
                                    mostSignificantBits = 1;
                                }
                                long j = ((rsr) obj).d;
                                tpc tpcVarM = uxy.a.m();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tph tphVar = tpcVarM.b;
                                uxy uxyVar = (uxy) tphVar;
                                uxyVar.b |= 4;
                                uxyVar.e = mostSignificantBits;
                                if (!tphVar.C()) {
                                    tpcVarM.o();
                                }
                                uxy uxyVar2 = (uxy) tpcVarM.b;
                                uxyVar2.b |= 1;
                                uxyVar2.c = 0;
                                tou touVarA = tsg.a(0L, (int) ((j % 1000) * 1000000));
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tph tphVar2 = tpcVarM.b;
                                uxy uxyVar3 = (uxy) tphVar2;
                                touVarA.getClass();
                                uxyVar3.d = touVarA;
                                uxyVar3.b |= 2;
                                if (!tphVar2.C()) {
                                    tpcVarM.o();
                                }
                                uxy uxyVar4 = (uxy) tpcVarM.b;
                                uxyVar4.f = 2;
                                uxyVar4.b |= 8;
                                uxy uxyVar5 = (uxy) tpcVarM.l();
                                qqp qqpVar = qsmVar.a;
                                qql qqlVarA = qqm.a();
                                qqlVarA.d(true);
                                tpc tpcVarM2 = uzu.a.m();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                uzu uzuVar = (uzu) tpcVarM2.b;
                                uxyVar5.getClass();
                                uzuVar.n = uxyVar5;
                                uzuVar.b |= ImageMetadata.SHADING_MODE;
                                qqlVarA.f((uzu) tpcVarM2.l());
                                qqlVarA.b = null;
                                qqpVar.b(qqlVarA.a());
                            }
                        }
                    } catch (Exception e) {
                        ((sgt) ((sgt) qnj.a.c().i(e)).M(5741)).s("Failed to end CUI.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                } catch (Throwable th2) {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                    throw th2;
                }
            }
        });
    }
}
