package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyt implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public kyt(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lat a() {
        return new lat(this.a, this.b, (rwc) this.c.a());
    }
}
