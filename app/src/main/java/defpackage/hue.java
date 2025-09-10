package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hue {
    public static final hue a;
    public static final hue b;
    private static final /* synthetic */ hue[] c;

    static {
        hue hueVar = new hue("SHOT", 0);
        a = hueVar;
        hue hueVar2 = new hue("PREVIEW", 1);
        b = hueVar2;
        hue[] hueVarArr = {hueVar, hueVar2};
        c = hueVarArr;
        ske.aB(hueVarArr);
    }

    private hue(String str, int i) {
    }

    public static hue[] values() {
        return (hue[]) c.clone();
    }
}
