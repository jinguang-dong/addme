package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwa implements Executor {
    public static final dwa a;
    private static final /* synthetic */ dwa[] b;

    static {
        dwa dwaVar = new dwa();
        a = dwaVar;
        dwa[] dwaVarArr = {dwaVar};
        b = dwaVarArr;
        ske.aB(dwaVarArr);
    }

    private dwa() {
    }

    public static dwa[] values() {
        return (dwa[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
