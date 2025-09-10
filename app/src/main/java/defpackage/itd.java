package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class itd implements qjt {
    private final /* synthetic */ int a;

    public /* synthetic */ itd(int i) {
        this.a = i;
    }

    @Override // defpackage.qjt
    public final String a() {
        switch (this.a) {
            case 0:
                sgv sgvVar = ite.a;
                return "presentationTime";
            case 1:
                return "glFinish";
            case 2:
                return "mtsWaitForCodecStart";
            case 3:
                return "mtsPresentationTime";
            case 4:
                return "[unnamed]";
            case 5:
                return "close";
            case 6:
                return "glFlush";
            default:
                return "drawBuilderOnCanvas";
        }
    }
}
