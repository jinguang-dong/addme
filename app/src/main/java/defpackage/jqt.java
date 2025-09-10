package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqt implements tzt {
    private final tzx a;
    private final tzx b;

    public jqt(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a() {
        luj lujVar = (luj) this.a.a();
        hbj hbjVar = (hbj) this.b.a();
        gzi gziVar = gym.a;
        return (((Boolean) lujVar.b(luf.Q)).booleanValue() && hbjVar.p(gzz.d)) ? "video/hevc" : "video/avc";
    }
}
