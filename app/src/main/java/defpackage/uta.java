package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class uta {
    public static final uta a;
    public static final uta b;
    public static final uta c;
    private static final /* synthetic */ uta[] d;

    static {
        uta utaVar = new uta("START", 0);
        a = utaVar;
        uta utaVar2 = new uta("STOP", 1);
        b = utaVar2;
        uta utaVar3 = new uta("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = utaVar3;
        uta[] utaVarArr = {utaVar, utaVar2, utaVar3};
        d = utaVarArr;
        ske.aB(utaVarArr);
    }

    private uta(String str, int i) {
    }

    public static uta[] values() {
        return (uta[]) d.clone();
    }
}
