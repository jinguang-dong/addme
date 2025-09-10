package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmc extends pml {
    public pmc(int i) {
        super(i);
    }

    @Override // defpackage.pml
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ByteBuffer.allocateDirect(((Integer) obj).intValue());
    }

    @Override // defpackage.pml
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.rewind();
        byteBuffer.limit(byteBuffer.capacity());
        return byteBuffer;
    }
}
