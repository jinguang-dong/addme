package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iui {
    public static final iui a;
    public static final iui b;
    public static final iui c;
    private static final /* synthetic */ iui[] e;
    public final int d;

    static {
        iui iuiVar = new iui("PREVIEW_IMAGE_TIMESTAMP", 0, 2);
        a = iuiVar;
        iui iuiVar2 = new iui("PREVIEW_SUBMIT", 1, 3);
        b = iuiVar2;
        iui iuiVar3 = new iui("FRAME_START", 2, 4);
        c = iuiVar3;
        iui[] iuiVarArr = {iuiVar, iuiVar2, iuiVar3};
        e = iuiVarArr;
        ske.aB(iuiVarArr);
    }

    private iui(String str, int i, int i2) {
        this.d = i2;
    }

    public static iui[] values() {
        return (iui[]) e.clone();
    }
}
