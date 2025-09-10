package j$.nio.file.attribute;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {
    public static final y GROUP_EXECUTE;
    public static final y GROUP_READ;
    public static final y GROUP_WRITE;
    public static final y OTHERS_EXECUTE;
    public static final y OTHERS_READ;
    public static final y OTHERS_WRITE;
    public static final y OWNER_EXECUTE;
    public static final y OWNER_READ;
    public static final y OWNER_WRITE;
    public static final /* synthetic */ y[] a;

    static {
        y yVar = new y("OWNER_READ", 0);
        OWNER_READ = yVar;
        y yVar2 = new y("OWNER_WRITE", 1);
        OWNER_WRITE = yVar2;
        y yVar3 = new y("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = yVar3;
        y yVar4 = new y("GROUP_READ", 3);
        GROUP_READ = yVar4;
        y yVar5 = new y("GROUP_WRITE", 4);
        GROUP_WRITE = yVar5;
        y yVar6 = new y("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = yVar6;
        y yVar7 = new y("OTHERS_READ", 6);
        OTHERS_READ = yVar7;
        y yVar8 = new y("OTHERS_WRITE", 7);
        OTHERS_WRITE = yVar8;
        y yVar9 = new y("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = yVar9;
        a = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) a.clone();
    }
}
