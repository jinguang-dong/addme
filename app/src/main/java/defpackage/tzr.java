package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tzr implements tzt {
    private tzx a;

    public static void b(tzr tzrVar, tzx tzxVar) {
        if (tzrVar.a != null) {
            throw new IllegalStateException();
        }
        tzrVar.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final Object a() {
        tzx tzxVar = this.a;
        if (tzxVar != null) {
            return tzxVar.a();
        }
        throw new IllegalStateException();
    }
}
