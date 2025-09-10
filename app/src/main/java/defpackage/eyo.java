package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyo implements eyn {
    public static final eyo a = new eyo(0);
    private final /* synthetic */ int b;

    public eyo(int i) {
        this.b = i;
    }

    @Override // defpackage.eyn
    public final esw a(esw eswVar, eqm eqmVar) {
        byte[] bArrArray;
        if (this.b != 0) {
            ByteBuffer byteBufferB = ((eyd) eswVar.c()).b();
            int i = fak.a;
            nw nwVar = null;
            if (!byteBufferB.isReadOnly() && byteBufferB.hasArray()) {
                nwVar = new nw(byteBufferB.array(), byteBufferB.arrayOffset(), byteBufferB.limit());
            }
            if (nwVar != null && nwVar.a == 0 && nwVar.b == ((byte[]) nwVar.c).length) {
                bArrArray = byteBufferB.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferB.asReadOnlyBuffer();
                byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
                fak.b(byteBufferAsReadOnlyBuffer);
                byteBufferAsReadOnlyBuffer.get(bArr);
                bArrArray = bArr;
            }
            eswVar = new exv(bArrArray, 0);
        }
        return eswVar;
    }
}
