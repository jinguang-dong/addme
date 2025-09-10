package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtc implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;

    public qtc(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qtb a() {
        return new qtb(((imm) this.a).b(), this.b, tzs.b(this.c), tzs.b(this.d));
    }
}
