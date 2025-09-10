package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbg implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public jbg(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public final jub b() {
        int i = this.b;
        return i != 0 ? i != 1 ? ((jtt) this.a).a().a("PortraitCaptureSess", ltf.PORTRAIT) : ((jtt) this.a).a().a("MotionBlur_ActionPan_CaptureSess", ltf.ACTION_PAN) : ((jtt) this.a).a().a("MotionBlur_Landscape_CaptureSess", ltf.LANDSCAPE);
    }
}
