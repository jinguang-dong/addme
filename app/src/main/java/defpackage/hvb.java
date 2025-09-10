package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvb {
    public static final hvb a;
    public static final hvb b;
    public static final hvb c;
    private static final /* synthetic */ hvb[] e;
    public final kiq d;

    static {
        hvb hvbVar = new hvb("NONE", 0, null);
        a = hvbVar;
        hvb hvbVar2 = new hvb("HDR_PLUS_ZSL", 1, kiq.HDR_PLUS_ZSL);
        b = hvbVar2;
        hvb hvbVar3 = new hvb("NIGHT_SIGHT", 2, kiq.NIGHT_SIGHT);
        c = hvbVar3;
        hvb[] hvbVarArr = {hvbVar, hvbVar2, hvbVar3};
        e = hvbVarArr;
        ske.aB(hvbVarArr);
    }

    private hvb(String str, int i, kiq kiqVar) {
        this.d = kiqVar;
    }

    public static hvb[] values() {
        return (hvb[]) e.clone();
    }
}
