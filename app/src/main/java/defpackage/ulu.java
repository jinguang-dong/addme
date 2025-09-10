package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ulu {
    public static final ulu a;
    public static final ulu b;
    public static final ulu c;
    public static final ulu d;
    public static final ulu e;
    public static final ulu f;
    public static final ulu g;
    private static final /* synthetic */ ulu[] i;
    public final TimeUnit h;

    static {
        ulu uluVar = new ulu("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        a = uluVar;
        ulu uluVar2 = new ulu("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        b = uluVar2;
        ulu uluVar3 = new ulu("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = uluVar3;
        ulu uluVar4 = new ulu("SECONDS", 3, TimeUnit.SECONDS);
        d = uluVar4;
        ulu uluVar5 = new ulu("MINUTES", 4, TimeUnit.MINUTES);
        e = uluVar5;
        ulu uluVar6 = new ulu("HOURS", 5, TimeUnit.HOURS);
        f = uluVar6;
        ulu uluVar7 = new ulu("DAYS", 6, TimeUnit.DAYS);
        g = uluVar7;
        ulu[] uluVarArr = {uluVar, uluVar2, uluVar3, uluVar4, uluVar5, uluVar6, uluVar7};
        i = uluVarArr;
        ske.aB(uluVarArr);
    }

    private ulu(String str, int i2, TimeUnit timeUnit) {
        this.h = timeUnit;
    }

    public static ulu[] values() {
        return (ulu[]) i.clone();
    }
}
