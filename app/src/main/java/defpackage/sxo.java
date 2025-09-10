package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class sxo implements Executor {
    public static final sxo a;
    private static final /* synthetic */ sxo[] b;

    static {
        sxo sxoVar = new sxo();
        a = sxoVar;
        b = new sxo[]{sxoVar};
    }

    private sxo() {
    }

    public static sxo[] values() {
        return (sxo[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
