package defpackage;

import j$.util.Comparator$CC;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class flv {
    public long a = Long.MAX_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = 0;
    public long d = 0;
    public final tab e;
    public long f;

    public flv() {
        rnt.B(true, "Cannot create a PackedSerializer with SerializationCoreOps which don't support packed serialization.");
        rnt.B(true, "Cannot create a DiffEncodingPackedSerializer with SerializationCoreOps which don't support diff encoding.");
        a.I(true);
        this.e = new tab(Comparator$CC.naturalOrder());
        this.f = 0L;
    }
}
