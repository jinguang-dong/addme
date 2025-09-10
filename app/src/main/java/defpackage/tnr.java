package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tnr implements tqr {
    public int aT = 0;

    public int e(trg trgVar) {
        throw null;
    }

    @Override // defpackage.tqr
    public final toj f() {
        try {
            int iL = l();
            toj tojVar = toj.b;
            byte[] bArr = new byte[iL];
            tos tosVarAg = tos.ag(bArr);
            eg(tosVarAg);
            return sla.w(tosVarAg, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // defpackage.tqr
    public final void g(OutputStream outputStream) {
        top topVar = new top(outputStream, tos.S(l()));
        eg(topVar);
        topVar.i();
    }

    @Override // defpackage.tqr
    public final byte[] h() {
        try {
            byte[] bArr = new byte[l()];
            tos tosVarAg = tos.ag(bArr);
            eg(tosVarAg);
            tosVarAg.ah();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
