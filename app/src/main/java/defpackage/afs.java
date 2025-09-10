package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afs {
    public static final afs a;
    public static final afs b;
    public static final afs c;
    private static final /* synthetic */ afs[] d;

    static {
        afs afsVar = new afs("Default", 0);
        a = afsVar;
        afs afsVar2 = new afs("UserInput", 1);
        b = afsVar2;
        afs afsVar3 = new afs("PreventUserInput", 2);
        c = afsVar3;
        afs[] afsVarArr = {afsVar, afsVar2, afsVar3};
        d = afsVarArr;
        ske.aB(afsVarArr);
    }

    private afs(String str, int i) {
    }

    public static afs[] values() {
        return (afs[]) d.clone();
    }
}
