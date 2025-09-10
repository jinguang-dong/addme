package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class czk implements czl {
    @Override // defpackage.czl
    public final ByteBuffer a(ByteBuffer byteBuffer, scf scfVar) {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        sbp sbpVarT = coi.t(byteBuffer);
        int i2 = 0;
        int iRemaining = 0;
        while (true) {
            i = ((sex) sbpVarT).c;
            if (i2 >= i) {
                break;
            }
            iRemaining += ((ByteBuffer) sbpVarT.get(i2)).remaining() + 4;
            i2++;
        }
        a.I(iRemaining >= 0);
        if (((ByteBuffer) scfVar.a).remaining() < iRemaining) {
            int iCapacity = ((ByteBuffer) scfVar.a).capacity();
            scfVar.a = ByteBuffer.allocateDirect(Math.max(iRemaining, iCapacity + iCapacity));
        }
        ByteBuffer byteBufferSlice = ((ByteBuffer) scfVar.a).slice();
        ByteBuffer byteBuffer2 = (ByteBuffer) scfVar.a;
        byteBuffer2.position(byteBuffer2.position() + iRemaining);
        byteBufferSlice.limit(iRemaining);
        for (int i3 = 0; i3 < i; i3++) {
            ByteBuffer byteBuffer3 = (ByteBuffer) sbpVarT.get(i3);
            byteBufferSlice.putInt(byteBuffer3.remaining());
            byteBufferSlice.put(byteBuffer3);
        }
        byteBufferSlice.rewind();
        return byteBufferSlice;
    }
}
