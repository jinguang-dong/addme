package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyz {
    public final byte[] a;
    public int b;
    public int c;

    static {
        scn.K(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    }

    public cyz() {
        this.a = cza.a;
    }

    public final int a() {
        int i = this.b;
        this.b = i + 1;
        return this.a[i] & 255;
    }

    public cyz(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
