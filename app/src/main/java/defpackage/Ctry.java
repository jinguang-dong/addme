package defpackage;

/* compiled from: PG */
/* renamed from: try, reason: invalid class name */
/* loaded from: classes.dex */
public enum Ctry {
    DOUBLE(trz.DOUBLE, 1),
    FLOAT(trz.FLOAT, 5),
    INT64(trz.LONG, 0),
    UINT64(trz.LONG, 0),
    INT32(trz.a, 0),
    FIXED64(trz.LONG, 1),
    FIXED32(trz.a, 5),
    BOOL(trz.BOOLEAN, 0),
    STRING(trz.STRING, 2),
    GROUP(trz.MESSAGE, 3),
    MESSAGE(trz.MESSAGE, 2),
    BYTES(trz.BYTE_STRING, 2),
    UINT32(trz.a, 0),
    ENUM(trz.ENUM, 0),
    SFIXED32(trz.a, 5),
    SFIXED64(trz.LONG, 1),
    SINT32(trz.a, 0),
    r(trz.LONG, 0);

    public final trz s;
    public final int t;

    Ctry(trz trzVar, int i) {
        this.s = trzVar;
        this.t = i;
    }
}
