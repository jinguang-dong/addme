package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqq implements tzt {
    private final tzx a;

    public jqq(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final joe a() {
        jof jofVarA = ((jqv) this.a).a();
        jpt jptVar = new jpt();
        joy joyVar = new joy();
        int iOrdinal = jofVarA.ordinal();
        if (iOrdinal == 0) {
            return joyVar;
        }
        if (iOrdinal == 1) {
            return jptVar;
        }
        throw new RuntimeException(null, null);
    }
}
