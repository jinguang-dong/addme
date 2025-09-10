package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tpd extends tnt {
    private final tph a;

    public tpd(tph tphVar) {
        this.a = tphVar;
    }

    @Override // defpackage.tnt
    public final /* bridge */ /* synthetic */ tqr b(byte[] bArr, int i, int i2, tow towVar) {
        return tph.q(this.a, bArr, i, i2, towVar);
    }

    @Override // defpackage.tqy
    public final /* bridge */ /* synthetic */ Object f(ton tonVar, tow towVar) throws tpz {
        Map map = tph.aU;
        tph tphVarO = this.a.o();
        try {
            trg trgVarB = tra.a.b(tphVarO);
            trgVarB.l(tphVarO, too.p(tonVar), towVar);
            trgVarB.g(tphVarO);
            return tphVarO;
        } catch (tpz e) {
            if (e.a) {
                throw new tpz(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof tpz) {
                throw ((tpz) e2.getCause());
            }
            throw new tpz(e2);
        } catch (tro e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof tpz) {
                throw ((tpz) e4.getCause());
            }
            throw e4;
        }
    }
}
