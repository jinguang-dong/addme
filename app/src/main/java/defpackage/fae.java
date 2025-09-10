package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fae implements eqi {
    private final int b;
    private final eqi c;

    public fae(int i, eqi eqiVar) {
        this.b = i;
        this.c = eqiVar;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof fae) {
            fae faeVar = (fae) obj;
            if (this.b == faeVar.b && this.c.equals(faeVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return fax.d(this.c, this.b);
    }
}
