package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rae implements rch {
    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) throws IOException {
        long j;
        String strX;
        qyh qyhVar;
        InputStream inputStreamA = new rdn().a(rcgVar);
        try {
            ton tonVarK = ton.K(inputStreamA);
            qyk qykVar = qyk.a;
            int iK = tonVarK.k();
            if (iK > 1) {
                throw new tpz("Unsupported version: " + iK + ". Current version is: 1");
            }
            tonVarK.k();
            int iE = tonVarK.e(tonVarK.n());
            tow towVar = tow.a;
            tra traVar = tra.a;
            tow towVar2 = tow.a;
            tph tphVarO = qye.a.o();
            try {
                try {
                    trg trgVarB = tra.a.b(tphVarO);
                    trgVarB.l(tphVarO, too.p(tonVarK), towVar2);
                    trgVarB.g(tphVarO);
                    tph.D(tphVarO);
                    qye qyeVar = (qye) tphVarO;
                    tonVarK.A(iE);
                    byte[] bArrF = tonVarK.F();
                    qyg qygVar = new qyg();
                    try {
                        qygVar.a.setInput(bArrF);
                        try {
                            ton tonVarK2 = ton.K(new qyf(qygVar));
                            qyi qyiVar = qyi.a;
                            int iJ = tonVarK2.j();
                            if (iJ < 0) {
                                throw new tpz("Negative number of flags");
                            }
                            sct sctVar = new sct(sel.a);
                            long j2 = 0;
                            for (int i = 0; i < iJ; i++) {
                                long jR = tonVarK2.r();
                                int i2 = (int) jR;
                                long j3 = jR >>> 3;
                                if (j3 == 0) {
                                    j = 0;
                                    strX = tonVarK2.x();
                                } else {
                                    long j4 = j3 + j2;
                                    if (j4 > 2305843009213693951L) {
                                        throw new tpz("Flag name larger than max size");
                                    }
                                    j = j4;
                                    strX = null;
                                }
                                int i3 = i2 & 7;
                                if (i3 == 0 || i3 == 1) {
                                    qyhVar = new qyh(j, strX, i3, 0L, null);
                                } else if (i3 == 2) {
                                    qyhVar = new qyh(j, strX, i3, tonVarK2.r(), null);
                                } else if (i3 == 3) {
                                    qyhVar = new qyh(j, strX, i3, Double.doubleToRawLongBits(tonVarK2.b()), null);
                                } else if (i3 == 4) {
                                    qyhVar = new qyh(j, strX, i3, 0L, tonVarK2.x());
                                } else {
                                    if (i3 != 5) {
                                        throw new tpz("Unrecognized flag type " + i3);
                                    }
                                    qyhVar = new qyh(j, strX, i3, 0L, tonVarK2.F());
                                }
                                qyh qyhVar2 = qyhVar;
                                long j5 = qyhVar2.a;
                                if (j5 != 0) {
                                    j2 = j5;
                                }
                                sctVar.m(qyhVar2);
                            }
                            qyi qyiVar2 = new qyi(sctVar.g());
                            qygVar.close();
                            qyk qykVar2 = new qyk(qyiVar2, qyeVar);
                            if (inputStreamA != null) {
                                inputStreamA.close();
                            }
                            return qykVar2;
                        } finally {
                            qygVar.a.reset();
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    if (e.getCause() instanceof tpz) {
                        throw ((tpz) e.getCause());
                    }
                    throw new tpz(e);
                } catch (tro e2) {
                    throw e2.a();
                }
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof tpz) {
                    throw ((tpz) e3.getCause());
                }
                throw e3;
            } catch (tpz e4) {
                if (e4.a) {
                    throw new tpz(e4);
                }
                throw e4;
            }
        } finally {
        }
    }
}
