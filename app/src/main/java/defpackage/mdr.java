package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdr {
    public long a;
    public int b;
    public long c;
    public final Object d;

    public mdr(byte[] bArr) {
        this.d = new StringBuilder();
        this.a = -1L;
        this.c = -1L;
        this.b = 0;
    }

    public final void a() {
        this.a = -1L;
        this.c = -1L;
        this.b = 0;
        ((StringBuilder) this.d).setLength(0);
    }

    public mdr() {
        this.d = new ArrayList();
    }
}
