package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odv extends oif {
    public final byte[] a;

    public odv(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.oif
    public final byte[] x() {
        return this.a;
    }
}
