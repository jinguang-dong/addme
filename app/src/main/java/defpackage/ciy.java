package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ciy extends ciu {
    final /* synthetic */ ciz d;

    public ciy(ciz cizVar) {
        this.d = cizVar;
    }

    @Override // defpackage.ciu
    protected final String b() {
        civ civVar = (civ) this.d.a.get();
        if (civVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + civVar.a + "]";
    }
}
