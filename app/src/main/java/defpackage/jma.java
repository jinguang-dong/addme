package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jma {
    public static final jma a;
    public static final jma b;
    public static final jma c;
    public static final jma d;
    public static final jma e;
    private static final /* synthetic */ jma[] g;
    public final String f;

    static {
        jma jmaVar = new jma("NONE", 0, "");
        a = jmaVar;
        jma jmaVar2 = new jma("COMPOSITE_TRAINED_ALGORITHMIC_MEDIA", 1, "https://cv.iptc.org/newscodes/digitalsourcetype/compositeWithTrainedAlgorithmicMedia");
        b = jmaVar2;
        jma jmaVar3 = new jma("COMPOSITE_CAPTURE", 2, "https://cv.iptc.org/newscodes/digitalsourcetype/compositeCapture");
        c = jmaVar3;
        jma jmaVar4 = new jma("COMPUTATIONAL_CAPTURE", 3, "https://cv.iptc.org/newscodes/digitalsourcetype/computationalCapture");
        d = jmaVar4;
        jma jmaVar5 = new jma("ALGORITHMIC_ENHANCED", 4, "http://cv.iptc.org/newscodes/digitalsourcetype/algorithmicallyEnhanced");
        e = jmaVar5;
        jma[] jmaVarArr = {jmaVar, jmaVar2, jmaVar3, jmaVar4, jmaVar5};
        g = jmaVarArr;
        ske.aB(jmaVarArr);
    }

    private jma(String str, int i, String str2) {
        this.f = str2;
    }

    public static jma[] values() {
        return (jma[]) g.clone();
    }
}
