package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huu {
    public static final huu a;
    public static final huu b;
    private static final /* synthetic */ huu[] d;
    public final byte c;

    static {
        huu huuVar = new huu("IDLE", 0, (byte) 0);
        a = huuVar;
        huu huuVar2 = new huu("CAPTURING", 1, (byte) 1);
        b = huuVar2;
        huu[] huuVarArr = {huuVar, huuVar2};
        d = huuVarArr;
        ske.aB(huuVarArr);
    }

    private huu(String str, int i, byte b2) {
        this.c = b2;
    }

    public static huu[] values() {
        return (huu[]) d.clone();
    }
}
