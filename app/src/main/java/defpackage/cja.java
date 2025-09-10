package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cja implements Executor {
    public static final cja a;
    private static final /* synthetic */ cja[] b;

    static {
        cja cjaVar = new cja();
        a = cjaVar;
        b = new cja[]{cjaVar};
    }

    private cja() {
    }

    public static cja[] values() {
        return (cja[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
