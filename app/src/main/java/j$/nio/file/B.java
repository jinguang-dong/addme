package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class B implements o {
    public static final B APPEND;
    public static final B CREATE;
    public static final B CREATE_NEW;
    public static final B DELETE_ON_CLOSE;
    public static final B DSYNC;
    public static final B READ;
    public static final B SPARSE;
    public static final B SYNC;
    public static final B TRUNCATE_EXISTING;
    public static final B WRITE;
    public static final /* synthetic */ B[] a;

    static {
        B b = new B("READ", 0);
        READ = b;
        B b2 = new B("WRITE", 1);
        WRITE = b2;
        B b3 = new B("APPEND", 2);
        APPEND = b3;
        B b4 = new B("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = b4;
        B b5 = new B("CREATE", 4);
        CREATE = b5;
        B b6 = new B("CREATE_NEW", 5);
        CREATE_NEW = b6;
        B b7 = new B("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = b7;
        B b8 = new B("SPARSE", 7);
        SPARSE = b8;
        B b9 = new B("SYNC", 8);
        SYNC = b9;
        B b10 = new B("DSYNC", 9);
        DSYNC = b10;
        a = new B[]{b, b2, b3, b4, b5, b6, b7, b8, b9, b10};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) a.clone();
    }
}
