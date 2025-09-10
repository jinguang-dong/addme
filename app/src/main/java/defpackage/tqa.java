package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum tqa {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(toj.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        toj tojVar = toj.b;
    }

    tqa(Class cls) {
        this.k = cls;
    }
}
