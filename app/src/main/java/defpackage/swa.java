package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class swa implements swb {
    public static final swa a;
    private static final /* synthetic */ swa[] b;

    static {
        swa swaVar = new swa();
        a = swaVar;
        b = new swa[]{swaVar};
    }

    private swa() {
    }

    public static swa[] values() {
        return (swa[]) b.clone();
    }

    @Override // defpackage.swb
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
