package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igk implements tzt {
    private final tzx a;
    private final tzx b;

    public igk(tzx tzxVar, tzx tzxVar2) {
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lez a() {
        idt idtVar = (idt) this.a.a();
        final lat latVar = (lat) this.b.a();
        return (idtVar.b() || idtVar.e()) ? new lez() { // from class: igg
            @Override // defpackage.lez
            public final boolean a(pdk pdkVar) {
                return latVar.a(pdkVar).m() != null;
            }
        } : new lez() { // from class: igh
            @Override // defpackage.lez
            public final boolean a(pdk pdkVar) {
                return true;
            }
        };
    }
}
