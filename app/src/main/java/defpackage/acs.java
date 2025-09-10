package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs {
    public static final acs a;
    public static final acs b;
    public static final acs c;
    private static final /* synthetic */ acs[] d;

    static {
        acs acsVar = new acs("Default", 0);
        a = acsVar;
        acs acsVar2 = new acs("UserInput", 1);
        b = acsVar2;
        acs acsVar3 = new acs("PreventUserInput", 2);
        c = acsVar3;
        acs[] acsVarArr = {acsVar, acsVar2, acsVar3};
        d = acsVarArr;
        ske.aB(acsVarArr);
    }

    private acs(String str, int i) {
    }

    public static acs[] values() {
        return (acs[]) d.clone();
    }
}
