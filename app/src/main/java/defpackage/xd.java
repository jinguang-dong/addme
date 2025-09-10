package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class xd {
    public static final xd a;
    public static final xd b;
    public static final xd c;
    public static final xd d;
    private static final /* synthetic */ xd[] e;

    static {
        xd xdVar = new xd("STARTED", 0);
        a = xdVar;
        xd xdVar2 = new xd("FRAME_INFO_COMPLETE", 1);
        b = xdVar2;
        xd xdVar3 = new xd("STREAM_RESULTS_COMPLETE", 2);
        c = xdVar3;
        xd xdVar4 = new xd("COMPLETE", 3);
        d = xdVar4;
        xd[] xdVarArr = {xdVar, xdVar2, xdVar3, xdVar4};
        e = xdVarArr;
        ske.aB(xdVarArr);
    }

    private xd(String str, int i) {
    }

    public static xd[] values() {
        return (xd[]) e.clone();
    }
}
