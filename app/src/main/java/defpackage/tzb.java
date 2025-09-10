package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tzb implements tpo {
    private final /* synthetic */ int a;

    public tzb(int i) {
        this.a = i;
    }

    @Override // defpackage.tpo
    public final /* synthetic */ Object a(int i) {
        if (this.a != 0) {
            tag tagVarB = tag.b(i);
            return tagVarB == null ? tag.UNKNOWN : tagVarB;
        }
        tzc tzcVarB = tzc.b(i);
        return tzcVarB == null ? tzc.STATUS_CODE_UNSPECIFIED : tzcVarB;
    }
}
