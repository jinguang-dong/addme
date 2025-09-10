package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum toz {
    DOUBLE(0, 1, tqa.DOUBLE),
    FLOAT(1, 1, tqa.FLOAT),
    INT64(2, 1, tqa.LONG),
    UINT64(3, 1, tqa.LONG),
    e(4, 1, tqa.INT),
    FIXED64(5, 1, tqa.LONG),
    FIXED32(6, 1, tqa.INT),
    BOOL(7, 1, tqa.BOOLEAN),
    STRING(8, 1, tqa.STRING),
    MESSAGE(9, 1, tqa.MESSAGE),
    BYTES(10, 1, tqa.BYTE_STRING),
    UINT32(11, 1, tqa.INT),
    ENUM(12, 1, tqa.ENUM),
    SFIXED32(13, 1, tqa.INT),
    SFIXED64(14, 1, tqa.LONG),
    SINT32(15, 1, tqa.INT),
    SINT64(16, 1, tqa.LONG),
    GROUP(17, 1, tqa.MESSAGE),
    DOUBLE_LIST(18, 2, tqa.DOUBLE),
    FLOAT_LIST(19, 2, tqa.FLOAT),
    INT64_LIST(20, 2, tqa.LONG),
    UINT64_LIST(21, 2, tqa.LONG),
    INT32_LIST(22, 2, tqa.INT),
    FIXED64_LIST(23, 2, tqa.LONG),
    FIXED32_LIST(24, 2, tqa.INT),
    BOOL_LIST(25, 2, tqa.BOOLEAN),
    STRING_LIST(26, 2, tqa.STRING),
    MESSAGE_LIST(27, 2, tqa.MESSAGE),
    BYTES_LIST(28, 2, tqa.BYTE_STRING),
    UINT32_LIST(29, 2, tqa.INT),
    E(30, 2, tqa.ENUM),
    SFIXED32_LIST(31, 2, tqa.INT),
    SFIXED64_LIST(32, 2, tqa.LONG),
    SINT32_LIST(33, 2, tqa.INT),
    SINT64_LIST(34, 2, tqa.LONG),
    DOUBLE_LIST_PACKED(35, 3, tqa.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, tqa.FLOAT),
    INT64_LIST_PACKED(37, 3, tqa.LONG),
    UINT64_LIST_PACKED(38, 3, tqa.LONG),
    INT32_LIST_PACKED(39, 3, tqa.INT),
    FIXED64_LIST_PACKED(40, 3, tqa.LONG),
    FIXED32_LIST_PACKED(41, 3, tqa.INT),
    BOOL_LIST_PACKED(42, 3, tqa.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, tqa.INT),
    ENUM_LIST_PACKED(44, 3, tqa.ENUM),
    SFIXED32_LIST_PACKED(45, 3, tqa.INT),
    SFIXED64_LIST_PACKED(46, 3, tqa.LONG),
    SINT32_LIST_PACKED(47, 3, tqa.INT),
    SINT64_LIST_PACKED(48, 3, tqa.LONG),
    GROUP_LIST(49, 2, tqa.MESSAGE),
    MAP(50, 4, tqa.VOID);

    private static final toz[] aa;
    public final int Z;

    toz(int i, int i2, tqa tqaVar) {
        this.Z = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            Class cls = tqaVar.k;
        }
        if (i2 == 1) {
            tqa tqaVar2 = tqa.VOID;
            tqaVar.ordinal();
        }
    }

    static {
        toz[] tozVarArrValues = values();
        aa = new toz[tozVarArrValues.length];
        for (toz tozVar : tozVarArrValues) {
            aa[tozVar.Z] = tozVar;
        }
    }
}
