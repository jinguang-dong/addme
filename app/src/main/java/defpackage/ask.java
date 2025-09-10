package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ask {
    public static final ask a;
    public static final ask b;
    private static final /* synthetic */ ask[] c;

    static {
        ask askVar = new ask("Closed", 0);
        a = askVar;
        ask askVar2 = new ask("Open", 1);
        b = askVar2;
        ask[] askVarArr = {askVar, askVar2};
        c = askVarArr;
        ske.aB(askVarArr);
    }

    private ask(String str, int i) {
    }

    public static ask[] values() {
        return (ask[]) c.clone();
    }
}
